package com.madfooatcom.movietestlibrary.data.local;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.madfooatcom.movietestlibrary.utils.Converter.class, com.madfooatcom.movietestlibrary.utils.GenresConverter.class})
@androidx.room.Database(entities = {com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity.class, com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity.class, com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity.class, com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/madfooatcom/movietestlibrary/data/local/TMDBdb;", "Landroidx/room/RoomDatabase;", "()V", "tmdbDao", "Lcom/madfooatcom/movietestlibrary/data/local/dao/TMDBDao;", "movietestlibrary_debug"})
public abstract class TMDBdb extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.madfooatcom.movietestlibrary.data.local.dao.TMDBDao tmdbDao();
    
    public TMDBdb() {
        super();
    }
}