package com.madfooatcom.movietestlibrary.ui.feature.movie


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.madfooatcom.movietestlibrary.R
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.databinding.FragmentMovieBinding
import com.madfooatcom.movietestlibrary.ui.adapter.MovieAdapter
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.utils.hide
import com.madfooatcom.movietestlibrary.utils.loggingError
import com.madfooatcom.movietestlibrary.utils.visible
import kotlinx.android.synthetic.main.fragment_movie.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding
    private val viewModel by viewModel<MovieViewModel>()
    private val TAG = MovieFragment::class.java.simpleName

    private lateinit var adapter: MovieAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.wtf("1234inflater", inflater.toString())

        Log.wtf("1234R.layout.fragment_movie", R.layout.fragment_movie.toString())
        Log.wtf("1234container", container.toString())

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movie, container, false)
        Log.wtf("1234binding", binding.toString())
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        adapter = MovieAdapter()
        binding.adapter = adapter
        observeDataChange()
        viewModel.getMovies("ac313fc1138a0ed697567a0dedddc6cd")
    }


    private fun observeDataChange() {
        viewModel.movieListState.observe(viewLifecycleOwner, Observer {
            when (it.currentState) {
                ViewState.State.LOADING -> {
                    shimmerMovie.visible()
                    shimmerMovie.startShimmerAnimation()
                    rvMovie.hide()
                }
                ViewState.State.SUCCESS -> {
                    shimmerMovie.stopShimmerAnimation()
                    shimmerMovie.hide()
                    rvMovie.visible()
                    observeMovies(it.data)
                }
                ViewState.State.FAILED -> {
                    it.err?.let { err -> observeError(err) }
                }
            }
        })
    }

    private fun observeError(err: Throwable) {
        err.message?.let { loggingError(TAG, it) }
    }

    private fun observeMovies(movies: List<MovieEntity>?) {
        adapter.setMovies(movies)
    }
}
