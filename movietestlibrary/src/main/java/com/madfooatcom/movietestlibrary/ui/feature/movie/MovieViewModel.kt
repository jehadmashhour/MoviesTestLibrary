package com.madfooatcom.movietestlibrary.ui.feature.movie

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.data.repository.MovieRepositoryImpl
import com.madfooatcom.movietestlibrary.base.BaseViewModel
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders
import com.madfooatcom.movietestlibrary.domain.idlingresource.EspressoIdlingResource
import java.util.concurrent.TimeUnit


class MovieViewModel(private val repositoryImpl: MovieRepositoryImpl,
                     private var scheduler: SchedulerProviders) :com.madfooatcom.movietestlibrary.base.BaseViewModel() {

    val movieListState = MutableLiveData<ViewState<List<MovieEntity>>>()


    @SuppressLint("CheckResult")
    fun getMovies(apiKey: String) {
        EspressoIdlingResource.increment()
        repositoryImpl.getMovieData(apiKey)
                .subscribeOn(scheduler.io())
                .observeOn(scheduler.ui())
                .delay(2, TimeUnit.SECONDS)
                .doOnNext {
                    onLoading()

                }
                .subscribe({
                    onSuccess(it)
                }, {
                    onError(it)
                }
                ).also { compositeDisposable.add(it) }
    }

    private fun onSuccess(movies: List<MovieEntity>) {
        movieListState.postValue(ViewState.success(movies))
        EspressoIdlingResource.decrement()
    }

    private fun onError(err: Throwable) {
        movieListState.postValue(ViewState.error(err))
        EspressoIdlingResource.decrement()
    }

    private fun onLoading() {
        movieListState.postValue(ViewState.loading())
    }

}
