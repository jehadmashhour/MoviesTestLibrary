package com.madfooatcom.movietestlibrary.domain

import androidx.paging.DataSource
import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

interface LocalDataSource {
    fun saveMovieData(movies: List<MovieEntity>): Completable

    fun saveTvShowData(tvShows: List<TvShowEntity>): Completable

    fun saveMovieDetail(movieDetailEntity: MovieDetailEntity): Completable

    fun saveTvShowDetail(tvShowDetailEntity: TvShowDetailEntity): Completable

    fun getAllMovieData(): Observable<List<MovieEntity>>

    fun getTvShowData(): Observable<List<TvShowEntity>>

    fun getMovieDetail(id: String): Observable<MovieDetailEntity>

    fun getTvShowDetail(id: String): Observable<TvShowDetailEntity>

    fun updateMovieDetail(isFavorite: Boolean, movie: MovieDetailEntity): Single<Int>

    fun updateTvShowDetail(isFavorite: Boolean, tvShow: TvShowDetailEntity): Single<Int>

    fun getAllFavoriteMovie(isFavorite: Boolean): DataSource.Factory<Int, MovieDetailEntity>

    fun getAllFavoriteTvShow(isFavorite: Boolean): DataSource.Factory<Int, TvShowDetailEntity>
}