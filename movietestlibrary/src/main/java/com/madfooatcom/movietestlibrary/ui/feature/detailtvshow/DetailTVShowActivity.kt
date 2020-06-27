package com.madfooatcom.movietestlibrary.ui.feature.detailtvshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.madfooatcom.movietestlibrary.R
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.databinding.ActivityDetailTvshowBinding
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.utils.hide
import com.madfooatcom.movietestlibrary.utils.loggingError
import com.madfooatcom.movietestlibrary.utils.visible
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_detail_movie.imgBack
import kotlinx.android.synthetic.main.activity_detail_tvshow.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class DetailTVShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTvshowBinding

    private val viewModel by viewModel<DetailTvShowViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_tvshow)
        viewModel.getTvShowDetail("ac313fc1138a0ed697567a0dedddc6cd", intent.getStringExtra("data"))
        imgBack.setOnClickListener { onBackPressed() }
        observeDataChange()
    }

    private fun observeDataChange() {
        viewModel.tvDetailState.observe(this, Observer {
            when (it.currentState) {
                ViewState.State.LOADING -> {
                    layoutDataDetailTvShow.hide()
                    shimmerTvShowDetail.visible()
                    shimmerTvShowDetail.startShimmerAnimation()
                }
                ViewState.State.SUCCESS -> {
                    shimmerTvShowDetail.stopShimmerAnimation()
                    shimmerTvShowDetail.hide()
                    layoutDataDetailTvShow.visible()
                    it.data?.let { tvShowDetail -> observeTvShowDetail(tvShowDetail) }
                }
                ViewState.State.FAILED -> {
                    it.err?.let { err -> observeError(err) }
                }
            }
        })
    }

    private fun observeError(err: Throwable) {
        err.message?.let { loggingError(DetailTVShowActivity::class.java.simpleName, it) }
    }

    private fun observeTvShowDetail(tvShow: TvShowDetailEntity?) {
        var genres = ""
        for (genre in tvShow?.genres!!) {
            genres += genre?.name.toString() + ", "
        }
        if (tvShow.isFavorite!!) {
            fbFavoriteTvShow.setImageResource(R.drawable.heart)
        } else {
            fbFavoriteTvShow.setImageResource(R.drawable.heart_gray)
        }
        binding.tvDetail = tvShow
        binding.imageBackdropTV = tvShow.backdropPath
        binding.tvGenres = genres
        binding.imageCirclePosterTV = tvShow.posterPath
        binding.rating = tvShow.voteAverage?.div(2)
        binding.handler = this
    }

    fun onFavoriteClick(isFavorite: Boolean, tvShow: TvShowDetailEntity) {
        viewModel.updateTvShowDetail(isFavorite, tvShow)
        observeDataFavoriteChange(isFavorite)
    }

    private fun observeDataFavoriteChange(isFavorite: Boolean) {
        viewModel.favoriteState.observe(this, Observer {
            when (it.currentState) {
                ViewState.State.SUCCESS -> {
                    when (isFavorite) {
                        true -> {
                            Snackbar.make(lnTvShow, "Tv Show has been deleted from favorite", Snackbar.LENGTH_SHORT).show()
                        }
                        false -> {
                            Snackbar.make(lnTvShow, "Tv Show has been added from favorite", Snackbar.LENGTH_SHORT).show()
                        }

                    }
                }
                ViewState.State.FAILED -> {
                    it.err?.message?.let { err -> loggingError(DetailTVShowActivity::class.java.simpleName, err) }
                }
            }
        })
    }
}
