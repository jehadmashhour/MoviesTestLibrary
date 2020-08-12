package com.madfooatcom.movietestlibrary.data.remote.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/madfooatcom/movietestlibrary/data/remote/source/RemoteDataSourceImpl;", "Lcom/madfooatcom/movietestlibrary/domain/RemoteDataSource;", "api", "Lcom/madfooatcom/movietestlibrary/data/remote/ApiService;", "localImpl", "Lcom/madfooatcom/movietestlibrary/data/local/source/LocalDataSourceImpl;", "scheduler", "Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;", "(Lcom/madfooatcom/movietestlibrary/data/remote/ApiService;Lcom/madfooatcom/movietestlibrary/data/local/source/LocalDataSourceImpl;Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;)V", "getMovieDataDetailFromApi", "Lio/reactivex/Observable;", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "apiKey", "", "id", "getMovieDataFromApi", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieEntity;", "getTvShowDataDetailFromApi", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowDetailEntity;", "getTvShowDataFromAPI", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowEntity;", "movietestlibrary_debug"})
public final class RemoteDataSourceImpl implements com.madfooatcom.movietestlibrary.domain.RemoteDataSource {
    private final com.madfooatcom.movietestlibrary.data.remote.ApiService api = null;
    private final com.madfooatcom.movietestlibrary.data.local.source.LocalDataSourceImpl localImpl = null;
    private final com.madfooatcom.movietestlibrary.domain.SchedulerProviders scheduler = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity>> getMovieDataFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getMovieDataDetailFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity>> getTvShowDataFromAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getTvShowDataDetailFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public RemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.remote.ApiService api, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.source.LocalDataSourceImpl localImpl, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.domain.SchedulerProviders scheduler) {
        super();
    }
}