package com.madfooatcom.movietestlibrary.ui.feature.tvshow

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import com.madfooatcom.movietestlibrary.data.repository.TvShowRepositoryImpl
import com.madfooatcom.movietestlibrary.base.BaseViewModel
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders
import com.madfooatcom.movietestlibrary.domain.idlingresource.EspressoIdlingResource
import java.util.concurrent.TimeUnit

class TvShowViewModel(private val repository: TvShowRepositoryImpl,
                      private var scheduler: SchedulerProviders) :com.madfooatcom.movietestlibrary.base.BaseViewModel() {

    val tvShowListState = MutableLiveData<ViewState<List<TvShowEntity>>>()

    @SuppressLint("CheckResult")
    fun getTvShow(apiKey: String) {
        EspressoIdlingResource.increment()
        repository.getTvShowData(apiKey)
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

    private fun onLoading() {
        tvShowListState.postValue(ViewState.loading())
    }

    private fun onSuccess(tvShows: List<TvShowEntity>) {
        tvShowListState.postValue(ViewState.success(tvShows))
        EspressoIdlingResource.decrement()
    }

    private fun onError(err: Throwable) {
        tvShowListState.postValue(ViewState.error(err))
        EspressoIdlingResource.decrement()
    }

}