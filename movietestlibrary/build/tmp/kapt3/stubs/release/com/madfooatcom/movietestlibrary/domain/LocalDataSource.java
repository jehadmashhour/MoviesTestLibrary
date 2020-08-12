package com.madfooatcom.movietestlibrary.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u000bH&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0005H&J\u0016\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\fH&J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\tH&J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H&J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH&\u00a8\u0006\""}, d2 = {"Lcom/madfooatcom/movietestlibrary/domain/LocalDataSource;", "", "getAllFavoriteMovie", "Landroidx/paging/DataSource$Factory;", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "isFavorite", "", "getAllFavoriteTvShow", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowDetailEntity;", "getAllMovieData", "Lio/reactivex/Observable;", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieEntity;", "getMovieDetail", "id", "", "getTvShowData", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowEntity;", "getTvShowDetail", "saveMovieData", "Lio/reactivex/Completable;", "movies", "saveMovieDetail", "movieDetailEntity", "saveTvShowData", "tvShows", "saveTvShowDetail", "tvShowDetailEntity", "updateMovieDetail", "Lio/reactivex/Single;", "movie", "updateTvShowDetail", "tvShow", "movietestlibrary_release"})
public abstract interface LocalDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable saveMovieData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity> movies);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable saveTvShowData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity> tvShows);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable saveMovieDetail(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movieDetailEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable saveTvShowDetail(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity tvShowDetailEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity>> getAllMovieData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity>> getTvShowData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getMovieDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getTvShowDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.lang.Integer> updateMovieDetail(boolean isFavorite, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.lang.Integer> updateTvShowDetail(boolean isFavorite, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity tvShow);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getAllFavoriteMovie(boolean isFavorite);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getAllFavoriteTvShow(boolean isFavorite);
}