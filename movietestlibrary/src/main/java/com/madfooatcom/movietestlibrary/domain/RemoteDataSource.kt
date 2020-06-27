package com.madfooatcom.movietestlibrary.domain

import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import io.reactivex.Observable

interface RemoteDataSource {

    fun getMovieDataFromApi(apiKey: String): Observable<List<MovieEntity>>

    fun getMovieDataDetailFromApi(apiKey: String, id: String): Observable<MovieDetailEntity>

    fun getTvShowDataFromAPI(apiKey: String): Observable<List<TvShowEntity>>

    fun getTvShowDataDetailFromApi(apiKey: String, id: String): Observable<TvShowDetailEntity>
}