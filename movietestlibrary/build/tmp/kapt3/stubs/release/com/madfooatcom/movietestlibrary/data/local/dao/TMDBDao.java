package com.madfooatcom.movietestlibrary.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\'J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\tH\'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\nH\'J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0005H\'J\u0016\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\'J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\rH\'J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010\u0016\u001a\u00020\u0005H\'J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010 \u001a\u00020\rH\'\u00a8\u0006!"}, d2 = {"Lcom/madfooatcom/movietestlibrary/data/local/dao/TMDBDao;", "", "getAllMovieFavorite", "Landroidx/paging/DataSource$Factory;", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "isFavorite", "", "getAllTvShowData", "Lio/reactivex/Observable;", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowEntity;", "getAllTvShowFavorite", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowDetailEntity;", "getMovieDetail", "id", "", "getNowPlayingMovie", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieEntity;", "getTvShowDetail", "insertMovie", "Lio/reactivex/Completable;", "movie", "insertMovieDetail", "movieDetailEntity", "insertTvShow", "tvShows", "insertTvShowDetail", "tvShowDetailEntity", "updateMovieDetail", "Lio/reactivex/Single;", "updateTvShowDetail", "tvShow", "movietestlibrary_release"})
public abstract interface TMDBDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM now_playingdb")
    public abstract io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity>> getNowPlayingMovie();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity> movie);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tvshowdb")
    public abstract io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity>> getAllTvShowData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertTvShow(@org.jetbrains.annotations.NotNull()
    java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity> tvShows);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract io.reactivex.Completable insertMovieDetail(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movieDetailEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM moviedetail_db where id = :id")
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getMovieDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECt * FROM tvshowdetail_db where id = :id")
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getTvShowDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract io.reactivex.Completable insertTvShowDetail(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity tvShowDetailEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update()
    public abstract io.reactivex.Single<java.lang.Integer> updateMovieDetail(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movie);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update()
    public abstract io.reactivex.Single<java.lang.Integer> updateTvShowDetail(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity tvShow);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM moviedetail_db where isFavorite = :isFavorite")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getAllMovieFavorite(boolean isFavorite);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tvshowdetail_db where isFavorite = :isFavorite")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getAllTvShowFavorite(boolean isFavorite);
}