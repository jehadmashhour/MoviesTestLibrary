package com.madfooatcom.movietestlibrary.domain

import androidx.paging.PagedList
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import io.reactivex.Observable
import io.reactivex.Single

interface TvShowRepository {

    fun getTvShowData(apiKey: String): Observable<List<TvShowEntity>>

    fun getTvShowDetail(apiKey: String, id: String): Observable<TvShowDetailEntity>

    fun updateTvShowDetail(isFavorite: Boolean, tvShow: TvShowDetailEntity): Single<Int>

    fun getAllFavoriteTvShow(isFavorite: Boolean): Observable<PagedList<TvShowDetailEntity>>
}