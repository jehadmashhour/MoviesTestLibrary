package com.madfooatcom.movietestlibrary.ui.feature.detailmovie

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.data.repository.MovieRepositoryImpl
import com.madfooatcom.movietestlibrary.base.BaseViewModel
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders
import com.madfooatcom.movietestlibrary.domain.idlingresource.EspressoIdlingResource
import java.util.concurrent.TimeUnit

class DetailMovieViewModel(private val repository: MovieRepositoryImpl,
                           private var scheduler: SchedulerProviders) :com.madfooatcom.movietestlibrary.base.BaseViewModel() {

    val movieDetailState = MutableLiveData<ViewState<MovieDetailEntity>>()
    val favoriteState = MutableLiveData<ViewState<Int>>()

    fun getMoviesDetail(apiKey: String, id: String) {
        EspressoIdlingResource.increment()
        repository.getMovieDataDetail(apiKey, id)
                .subscribeOn(scheduler.io())
                .observeOn(scheduler.ui())
                .delay(2, TimeUnit.SECONDS)
                .doOnNext {
                    onLoading()
                }
                .subscribe(
                        {
                            onSuccess(it)
                        }, {
                    onError(it)
                }
                ).also { compositeDisposable.add(it) }
    }

    @SuppressLint("CheckResult")
    fun updateMovieDetail(isFavorite: Boolean, movie: MovieDetailEntity) {
        EspressoIdlingResource.increment()
        repository.updateMovieDetail(isFavorite, movie)
                .observeOn(scheduler.ui())
                .subscribeOn(scheduler.io())
                .subscribe({
                    onFavoriteSuccess(it)
                }, {
                    onFavoriteError(it)
                }).also { compositeDisposable.add(it) }
    }

    private fun onFavoriteSuccess(int: Int) {
        favoriteState.postValue(ViewState.success(int))
        EspressoIdlingResource.decrement()
    }

    private fun onFavoriteError(throwable: Throwable) {
        favoriteState.postValue(ViewState.error(throwable))
        EspressoIdlingResource.decrement()
    }

    private fun onSuccess(movie: MovieDetailEntity) {
        movieDetailState.postValue(ViewState.success(movie))
        EspressoIdlingResource.decrement()
    }

    private fun onError(throwable: Throwable) {
        movieDetailState.postValue(ViewState.error(throwable))
        EspressoIdlingResource.decrement()
    }

    private fun onLoading() {
        movieDetailState.postValue(ViewState.loading())
    }

}