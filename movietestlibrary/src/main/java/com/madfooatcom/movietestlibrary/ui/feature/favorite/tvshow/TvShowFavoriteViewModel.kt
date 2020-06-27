package com.madfooatcom.movietestlibrary.ui.feature.favorite.tvshow

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.data.repository.TvShowRepositoryImpl
import com.madfooatcom.movietestlibrary.base.BaseViewModel
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders
import com.madfooatcom.movietestlibrary.domain.idlingresource.EspressoIdlingResource
import java.util.concurrent.TimeUnit

class TvShowFavoriteViewModel(private val repositoryImpl: TvShowRepositoryImpl,
                              private val scheduler: SchedulerProviders) :com.madfooatcom.movietestlibrary.base.BaseViewModel() {

    val tvShowDetailState = MutableLiveData<ViewState<PagedList<TvShowDetailEntity>>>()

    @SuppressLint("CheckResult")
    fun getAllFavoriteTvShow(isFavorite: Boolean) {
        EspressoIdlingResource.increment()
        repositoryImpl.getAllFavoriteTvShow(isFavorite)
                .observeOn(scheduler.ui())
                .subscribeOn(scheduler.io())
                .delay(2, TimeUnit.SECONDS)
                .doOnNext {
                    onLoading()
                }
                .subscribe({
                    onSucces(it)
                }, {
                    onError(it)
                }).also { compositeDisposable.add(it) }
    }

    private fun onSucces(tvShow: PagedList<TvShowDetailEntity>) {
        tvShowDetailState.postValue(ViewState.success(tvShow))
        EspressoIdlingResource.decrement()
    }

    private fun onError(throwable: Throwable) {
        tvShowDetailState.postValue(ViewState.error(throwable))
        EspressoIdlingResource.decrement()
    }

    private fun onLoading() {
        tvShowDetailState.postValue(ViewState.loading())
    }

}