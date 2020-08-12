package com.madfooatcom.movietestlibrary.data.local.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00110\u0010H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0016\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u000eH\u0016J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0#2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010$\u001a\u00020\nH\u0016J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0#2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/madfooatcom/movietestlibrary/data/local/source/LocalDataSourceImpl;", "Lcom/madfooatcom/movietestlibrary/domain/LocalDataSource;", "dao", "Lcom/madfooatcom/movietestlibrary/data/local/dao/TMDBDao;", "scheduler", "Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;", "(Lcom/madfooatcom/movietestlibrary/data/local/dao/TMDBDao;Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;)V", "getAllFavoriteMovie", "Landroidx/paging/DataSource$Factory;", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "isFavorite", "", "getAllFavoriteTvShow", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowDetailEntity;", "getAllMovieData", "Lio/reactivex/Observable;", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieEntity;", "getMovieDetail", "id", "", "getTvShowData", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowEntity;", "getTvShowDetail", "saveMovieData", "Lio/reactivex/Completable;", "movies", "saveMovieDetail", "movieDetailEntity", "saveTvShowData", "tvShows", "saveTvShowDetail", "tvShowDetailEntity", "updateMovieDetail", "Lio/reactivex/Single;", "movie", "updateTvShowDetail", "tvShow", "movietestlibrary_debug"})
public final class LocalDataSourceImpl implements com.madfooatcom.movietestlibrary.domain.LocalDataSource {
    private final com.madfooatcom.movietestlibrary.data.local.dao.TMDBDao dao = null;
    private final com.madfooatcom.movietestlibrary.domain.SchedulerProviders scheduler = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable saveMovieData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity> movies) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable saveTvShowData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity> tvShows) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable saveMovieDetail(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movieDetailEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable saveTvShowDetail(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity tvShowDetailEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity>> getAllMovieData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity>> getTvShowData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getMovieDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getTvShowDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.Integer> updateMovieDetail(boolean isFavorite, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.Integer> updateTvShowDetail(boolean isFavorite, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity tvShow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource.Factory<java.lang.Integer, com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getAllFavoriteMovie(boolean isFavorite) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource.Factory<java.lang.Integer, com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getAllFavoriteTvShow(boolean isFavorite) {
        return null;
    }
    
    public LocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.dao.TMDBDao dao, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.domain.SchedulerProviders scheduler) {
        super();
    }
}