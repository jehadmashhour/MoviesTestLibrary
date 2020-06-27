package com.madfooatcom.movietestlibrary.data.repository

import androidx.paging.PagedList
import androidx.paging.RxPagedListBuilder
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import com.madfooatcom.movietestlibrary.data.local.source.LocalDataSourceImpl
import com.madfooatcom.movietestlibrary.data.remote.source.RemoteDataSourceImpl
import com.madfooatcom.movietestlibrary.domain.TvShowRepository
import io.reactivex.Observable
import io.reactivex.Single


class TvShowRepositoryImpl(private val remoteImpl: RemoteDataSourceImpl,
                           private val localImpl: LocalDataSourceImpl) : TvShowRepository {

    override fun getTvShowData(apiKey: String): Observable<List<TvShowEntity>> =
            Observable.concatArrayEager(localImpl.getTvShowData(), remoteImpl.getTvShowDataFromAPI(apiKey))

    override fun getTvShowDetail(apiKey: String, id: String): Observable<TvShowDetailEntity> =
            Observable.concatArrayEager(localImpl.getTvShowDetail(id), remoteImpl.getTvShowDataDetailFromApi(apiKey, id))

    override fun updateTvShowDetail(isFavorite: Boolean, tvShow: TvShowDetailEntity): Single<Int> {
        return if (isFavorite) {
            localImpl.updateTvShowDetail(false, tvShow)
        } else {
            localImpl.updateTvShowDetail(true, tvShow)
        }

    }

    override fun getAllFavoriteTvShow(isFavorite: Boolean): Observable<PagedList<TvShowDetailEntity>> =
            RxPagedListBuilder(localImpl.getAllFavoriteTvShow(isFavorite), 20).buildObservable()
}