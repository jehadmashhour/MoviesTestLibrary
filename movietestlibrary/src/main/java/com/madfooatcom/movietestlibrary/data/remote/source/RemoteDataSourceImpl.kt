package com.madfooatcom.movietestlibrary.data.remote.source

import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import com.madfooatcom.movietestlibrary.data.local.source.LocalDataSourceImpl
import com.madfooatcom.movietestlibrary.data.remote.ApiService
import com.madfooatcom.movietestlibrary.domain.RemoteDataSource
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders
import io.reactivex.Observable

class RemoteDataSourceImpl(private val api: ApiService,
                           private val localImpl: LocalDataSourceImpl,
                           private val scheduler: SchedulerProviders) : RemoteDataSource {

    override fun getMovieDataFromApi(apiKey: String): Observable<List<MovieEntity>> =
            api.getMovies(apiKey)
                    .map { movieResponse ->
                        localImpl.saveMovieData(movieResponse.results).subscribe()
                        movieResponse.results
                    }
                    .subscribeOn(scheduler.io())

    override fun getMovieDataDetailFromApi(apiKey: String, id: String): Observable<MovieDetailEntity> =
            api.getMovieDetail(id, apiKey)
                    .map { movieDetailResponse ->
                        localImpl.saveMovieDetail(movieDetailResponse).subscribe()
                        movieDetailResponse
                    }
                    .subscribeOn(scheduler.io())

    override fun getTvShowDataFromAPI(apiKey: String): Observable<List<TvShowEntity>> =
            api.getTvShows(apiKey)
                    .map { tvShowResponse ->
                        localImpl.saveTvShowData(tvShowResponse.results).subscribe()
                        tvShowResponse.results
                    }
                    .subscribeOn(scheduler.io())

    override fun getTvShowDataDetailFromApi(apiKey: String, id: String): Observable<TvShowDetailEntity> =
            api.getTvShowDetail(id, apiKey)
                    .map { tvShowDetailEntity ->
                        localImpl.saveTvShowDetail(tvShowDetailEntity).subscribe()
                        tvShowDetailEntity
                    }.subscribeOn(scheduler.io())
}