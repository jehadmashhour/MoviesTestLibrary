package com.madfooatcom.movietestlibrary.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.madfooatcom.movietestlibrary.data.local.dao.TMDBDao
import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import com.madfooatcom.movietestlibrary.utils.Converter
import com.madfooatcom.movietestlibrary.utils.GenresConverter

@Database(entities = [MovieEntity::class, TvShowEntity::class, MovieDetailEntity::class, TvShowDetailEntity::class], version = 1)
@TypeConverters(Converter::class, GenresConverter::class)
abstract class TMDBdb : RoomDatabase() {
    abstract fun tmdbDao(): TMDBDao
}