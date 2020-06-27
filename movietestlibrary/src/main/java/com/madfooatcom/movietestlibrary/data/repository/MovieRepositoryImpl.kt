package com.madfooatcom.movietestlibrary.data.repository

import androidx.paging.PagedList
import androidx.paging.RxPagedListBuilder
import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.data.local.source.LocalDataSourceImpl
import com.madfooatcom.movietestlibrary.data.remote.source.RemoteDataSourceImpl
import com.madfooatcom.movietestlibrary.domain.MovieRepository
import io.reactivex.Observable
import io.reactivex.Single


class MovieRepositoryImpl(
        private val remoteImpl: RemoteDataSourceImpl,
        private val localImpl: LocalDataSourceImpl
) : MovieRepository {

    override fun getMovieData(apiKey: String): Observable<List<MovieEntity>> =
            Observable.concatArrayEager(localImpl.getAllMovieData(), remoteImpl.getMovieDataFromApi(apiKey))


    override fun getMovieDataDetail(apiKey: String, id: String): Observable<MovieDetailEntity> =
            Observable.concatArrayEager(localImpl.getMovieDetail(id), remoteImpl.getMovieDataDetailFromApi(apiKey, id))

    override fun updateMovieDetail(isFavorite: Boolean, movie: MovieDetailEntity): Single<Int> {
        return if (isFavorite) {
            localImpl.updateMovieDetail(false, movie)
        } else {
            localImpl.updateMovieDetail(true, movie)
        }

    }

    override fun getAllFavoriteMovie(isFavorite: Boolean): Observable<PagedList<MovieDetailEntity>> =
            RxPagedListBuilder(localImpl.getAllFavoriteMovie(isFavorite), 20).buildObservable()

}