package com.madfooatcom.movietestlibrary.data.local.source

import androidx.paging.DataSource
import com.madfooatcom.movietestlibrary.data.local.dao.TMDBDao
import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import com.madfooatcom.movietestlibrary.domain.LocalDataSource
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders

import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

class LocalDataSourceImpl(private val dao: TMDBDao,
                          private val scheduler: SchedulerProviders) : LocalDataSource {


    override fun saveMovieData(movies: List<MovieEntity>): Completable {
        return dao.insertMovie(movies)
                .subscribeOn(scheduler.computation())
    }

    override fun saveTvShowData(tvShows: List<TvShowEntity>): Completable {
        return dao.insertTvShow(tvShows)
                .subscribeOn(scheduler.computation())
    }

    override fun saveMovieDetail(movieDetailEntity: MovieDetailEntity): Completable {
        movieDetailEntity.isFavorite = false
        return dao.insertMovieDetail(movieDetailEntity)
                .subscribeOn(scheduler.computation())
    }

    override fun saveTvShowDetail(tvShowDetailEntity: TvShowDetailEntity): Completable {
        tvShowDetailEntity.isFavorite = false
        return dao.insertTvShowDetail(tvShowDetailEntity)
                .subscribeOn(scheduler.computation())

    }

    override fun getAllMovieData(): Observable<List<MovieEntity>> =
            dao.getNowPlayingMovie()
                    .subscribeOn(scheduler.computation())
                    .filter {
                        it.isNotEmpty()
                    }

    override fun getTvShowData(): Observable<List<TvShowEntity>> =
            dao.getAllTvShowData()
                    .subscribeOn(scheduler.computation())
                    .filter {
                        it.isNotEmpty()
                    }


    override fun getMovieDetail(id: String): Observable<MovieDetailEntity> =
            dao.getMovieDetail(id)
                    .subscribeOn(scheduler.computation())
                    .filter { true }


    override fun getTvShowDetail(id: String): Observable<TvShowDetailEntity> =
            dao.getTvShowDetail(id)
                    .subscribeOn(scheduler.computation())
                    .filter { true }


    override fun updateMovieDetail(isFavorite: Boolean, movie: MovieDetailEntity): Single<Int> {
        movie.isFavorite = isFavorite
        return dao.updateMovieDetail(movie)
    }

    override fun updateTvShowDetail(isFavorite: Boolean, tvShow: TvShowDetailEntity): Single<Int> {
        tvShow.isFavorite = isFavorite
        return dao.updateTvShowDetail(tvShow)
    }

    override fun getAllFavoriteMovie(isFavorite: Boolean): DataSource.Factory<Int, MovieDetailEntity> =
            dao.getAllMovieFavorite(isFavorite)

    override fun getAllFavoriteTvShow(isFavorite: Boolean): DataSource.Factory<Int, TvShowDetailEntity> =
            dao.getAllTvShowFavorite(isFavorite)
}