package com.madfooatcom.movietestlibrary.ui.feature.detailtvshow

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.data.repository.TvShowRepositoryImpl
import com.madfooatcom.movietestlibrary.base.BaseViewModel
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders
import com.madfooatcom.movietestlibrary.domain.idlingresource.EspressoIdlingResource
import java.util.concurrent.TimeUnit

class DetailTvShowViewModel(private val repository: TvShowRepositoryImpl,
                            private var scheduler: SchedulerProviders) :com.madfooatcom.movietestlibrary.base.BaseViewModel() {

    val tvDetailState = MutableLiveData<ViewState<TvShowDetailEntity>>()
    val favoriteState = MutableLiveData<ViewState<Int>>()

    fun getTvShowDetail(apiKey: String, id: String) {
        EspressoIdlingResource.increment()
        repository.getTvShowDetail(apiKey, id)
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

    @SuppressLint("CheckResult")
    fun updateTvShowDetail(isFavorite: Boolean, tvShowDetail: TvShowDetailEntity) {
        EspressoIdlingResource.increment()
        repository.updateTvShowDetail(isFavorite, tvShowDetail)
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

    private fun onLoading() {
        tvDetailState.postValue(ViewState.loading())
    }

    private fun onError(err: Throwable) {
        tvDetailState.postValue(ViewState.error(err))
        EspressoIdlingResource.decrement()
    }

    private fun onSuccess(tvShowDetail: TvShowDetailEntity) {
        tvDetailState.postValue(ViewState.success(tvShowDetail))
        EspressoIdlingResource.decrement()
    }
}