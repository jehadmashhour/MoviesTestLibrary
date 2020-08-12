package com.madfooatcom.movietestlibrary.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H&\u00a8\u0006\u0013"}, d2 = {"Lcom/madfooatcom/movietestlibrary/domain/TvShowRepository;", "", "getAllFavoriteTvShow", "Lio/reactivex/Observable;", "Landroidx/paging/PagedList;", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowDetailEntity;", "isFavorite", "", "getTvShowData", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowEntity;", "apiKey", "", "getTvShowDetail", "id", "updateTvShowDetail", "Lio/reactivex/Single;", "", "tvShow", "movietestlibrary_release"})
public abstract interface TvShowRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity>> getTvShowData(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity> getTvShowDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.lang.Integer> updateTvShowDetail(boolean isFavorite, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity tvShow);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<androidx.paging.PagedList<com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity>> getAllFavoriteTvShow(boolean isFavorite);
}