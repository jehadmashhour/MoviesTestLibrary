package com.madfooatcom.movietestlibrary.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/madfooatcom/movietestlibrary/data/repository/MovieRepositoryImpl;", "Lcom/madfooatcom/movietestlibrary/domain/MovieRepository;", "remoteImpl", "Lcom/madfooatcom/movietestlibrary/data/remote/source/RemoteDataSourceImpl;", "localImpl", "Lcom/madfooatcom/movietestlibrary/data/local/source/LocalDataSourceImpl;", "(Lcom/madfooatcom/movietestlibrary/data/remote/source/RemoteDataSourceImpl;Lcom/madfooatcom/movietestlibrary/data/local/source/LocalDataSourceImpl;)V", "getAllFavoriteMovie", "Lio/reactivex/Observable;", "Landroidx/paging/PagedList;", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "isFavorite", "", "getMovieData", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieEntity;", "apiKey", "", "getMovieDataDetail", "id", "updateMovieDetail", "Lio/reactivex/Single;", "", "movie", "movietestlibrary_release"})
public final class MovieRepositoryImpl implements com.madfooatcom.movietestlibrary.domain.MovieRepository {
    private final com.madfooatcom.movietestlibrary.data.remote.source.RemoteDataSourceImpl remoteImpl = null;
    private final com.madfooatcom.movietestlibrary.data.local.source.LocalDataSourceImpl localImpl = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity>> getMovieData(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getMovieDataDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
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
    public io.reactivex.Observable<androidx.paging.PagedList<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity>> getAllFavoriteMovie(boolean isFavorite) {
        return null;
    }
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.remote.source.RemoteDataSourceImpl remoteImpl, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.source.LocalDataSourceImpl localImpl) {
        super();
    }
}