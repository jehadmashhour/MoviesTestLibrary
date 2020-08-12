package com.madfooatcom.movietestlibrary.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u000f"}, d2 = {"Lcom/madfooatcom/movietestlibrary/domain/RemoteDataSource;", "", "getMovieDataDetailFromApi", "Lio/reactivex/Observable;", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "apiKey", "", "id", "getMovieDataFromApi", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieEntity;", "getTvShowDataDetailFromApi", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowDetailEntity;", "getTvShowDataFromAPI", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowEntity;", "movietestlibrary_release"})
public abstract interface RemoteDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity>> getMovieDataFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getMovieDataDetailFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity>> getTvShowDataFromAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getTvShowDataDetailFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String id);
}