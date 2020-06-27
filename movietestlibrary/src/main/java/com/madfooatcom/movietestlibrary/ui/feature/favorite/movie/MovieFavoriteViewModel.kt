package com.madfooatcom.movietestlibrary.ui.feature.favorite.movie

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.data.repository.MovieRepositoryImpl
import com.madfooatcom.movietestlibrary.base.BaseViewModel
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders
import com.madfooatcom.movietestlibrary.domain.idlingresource.EspressoIdlingResource
import java.util.concurrent.TimeUnit

class MovieFavoriteViewModel(private val repositoryImpl: MovieRepositoryImpl,
                             private val scheduler: SchedulerProviders) :com.madfooatcom.movietestlibrary.base.BaseViewModel() {

    val movieDetailState = MutableLiveData<ViewState<PagedList<MovieDetailEntity>>>()

    @SuppressLint("CheckResult")
    fun getAllFavoriteMovie(isFavorite: Boolean) {
        EspressoIdlingResource.increment()
        repositoryImpl.getAllFavoriteMovie(isFavorite)
                .observeOn(scheduler.ui())
                .subscribeOn(scheduler.io())
                .delay(2, TimeUnit.SECONDS)
                .doOnNext {
                    onLoading()
                }
                .subscribe({
                    onSuccess(it)
                }, {
                    onError(it)
                }).also { compositeDisposable.add(it) }
    }

    private fun onLoading() {
        movieDetailState.postValue(ViewState.loading())
    }

    private fun onSuccess(movie: PagedList<MovieDetailEntity>) {
        movieDetailState.postValue(ViewState.success(movie))
        EspressoIdlingResource.decrement()
    }

    private fun onError(throwable: Throwable) {
        movieDetailState.postValue(ViewState.error(throwable))
        EspressoIdlingResource.decrement()
    }


}