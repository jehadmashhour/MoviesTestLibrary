package com.madfooatcom.movietestlibrary.domain

import androidx.paging.PagedList
import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import io.reactivex.Observable
import io.reactivex.Single

interface MovieRepository {

    fun getMovieData(apiKey: String): Observable<List<MovieEntity>>

    fun getMovieDataDetail(apiKey: String, id: String): Observable<MovieDetailEntity>

    fun updateMovieDetail(isFavorite: Boolean, movie: MovieDetailEntity): Single<Int>

    fun getAllFavoriteMovie(isFavorite: Boolean): Observable<PagedList<MovieDetailEntity>>
}