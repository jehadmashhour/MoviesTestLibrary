package com.madfooatcom.movietestlibrary.ui.feature.favorite.tvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.madfooatcom.movietestlibrary.R
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.databinding.FragmentTvShowFavoriteBinding
import com.madfooatcom.movietestlibrary.ui.adapter.TvShowFavoriteAdapter
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.utils.hide
import com.madfooatcom.movietestlibrary.utils.loggingError
import com.madfooatcom.movietestlibrary.utils.visible
import kotlinx.android.synthetic.main.fragment_tv_show_favorite.*
import org.koin.android.ext.android.inject

class TvShowFavoriteFragment : Fragment() {

    private val viewModel by inject<TvShowFavoriteViewModel>()
    private lateinit var binding: FragmentTvShowFavoriteBinding
    private lateinit var adapter: TvShowFavoriteAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tv_show_favorite, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = TvShowFavoriteAdapter()
        binding.adapter = adapter
        viewModel.getAllFavoriteTvShow(true)

        observeDataChange()
    }

    private fun observeDataChange() {
        viewModel.tvShowDetailState.observe(viewLifecycleOwner, Observer {
            when (it.currentState) {
                ViewState.State.LOADING -> {
                    shimmerTvShowFavorite.visible()
                    shimmerTvShowFavorite.startShimmerAnimation()
                    rvTvShowFavorite.hide()
                }
                ViewState.State.FAILED -> {
                    it.err?.let { err -> observeError(err) }
                }
                ViewState.State.SUCCESS -> {
                    shimmerTvShowFavorite.stopShimmerAnimation()
                    shimmerTvShowFavorite.hide()
                    it.data?.let { tvShow -> observeSuccess(tvShow) }
                }
            }
        })
    }

    private fun observeSuccess(tvShow: PagedList<TvShowDetailEntity>) {
        if (tvShow.size > 0) {
            rvTvShowFavorite.visible()
            lnTvShowZero.hide()
            adapter.submitList(tvShow)
        } else {
            lnTvShowZero.visible()
            rvTvShowFavorite.hide()
        }
    }

    private fun observeError(throwable: Throwable) {
        throwable.message?.let { loggingError(TvShowFavoriteFragment::class.java.simpleName, it) }
    }
}
