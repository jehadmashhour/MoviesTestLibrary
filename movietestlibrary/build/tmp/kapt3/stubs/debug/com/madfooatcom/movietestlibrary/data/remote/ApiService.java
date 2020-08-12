package com.madfooatcom.movietestlibrary.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/madfooatcom/movietestlibrary/data/remote/ApiService;", "", "getMovieDetail", "Lio/reactivex/Observable;", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "id", "", "apiKey", "getMovies", "Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/nowplaying/MovieResponse;", "getTvShowDetail", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowDetailEntity;", "getTvShows", "Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/poular/TvShowResponse;", "movietestlibrary_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/now_playing")
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.remote.response.movie.nowplaying.MovieResponse> getMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "tv/popular")
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.poular.TvShowResponse> getTvShows(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "tv/{id}")
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getTvShowDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{id}")
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> getMovieDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
}