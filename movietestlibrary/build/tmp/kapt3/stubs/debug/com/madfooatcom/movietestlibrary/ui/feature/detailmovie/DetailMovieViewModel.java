package com.madfooatcom.movietestlibrary.ui.feature.detailmovie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000eH\u0002J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000eH\u0007R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/madfooatcom/movietestlibrary/ui/feature/detailmovie/DetailMovieViewModel;", "Lcom/madfooatcom/movietestlibrary/base/BaseViewModel;", "repository", "Lcom/madfooatcom/movietestlibrary/data/repository/MovieRepositoryImpl;", "scheduler", "Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;", "(Lcom/madfooatcom/movietestlibrary/data/repository/MovieRepositoryImpl;Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;)V", "favoriteState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/madfooatcom/movietestlibrary/common/ViewState;", "", "getFavoriteState", "()Landroidx/lifecycle/MutableLiveData;", "movieDetailState", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "getMovieDetailState", "getMoviesDetail", "", "apiKey", "", "id", "onError", "throwable", "", "onFavoriteError", "onFavoriteSuccess", "int", "onLoading", "onSuccess", "movie", "updateMovieDetail", "isFavorite", "", "movietestlibrary_debug"})
public final class DetailMovieViewModel extends com.madfooatcom.movietestlibrary.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.madfooatcom.movietestlibrary.common.ViewState<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity>> movieDetailState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.madfooatcom.movietestlibrary.common.ViewState<java.lang.Integer>> favoriteState = null;
    private final com.madfooatcom.movietestlibrary.data.repository.MovieRepositoryImpl repository = null;
    private com.madfooatcom.movietestlibrary.domain.SchedulerProviders scheduler;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.madfooatcom.movietestlibrary.common.ViewState<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity>> getMovieDetailState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.madfooatcom.movietestlibrary.common.ViewState<java.lang.Integer>> getFavoriteState() {
        return null;
    }
    
    public final void getMoviesDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void updateMovieDetail(boolean isFavorite, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movie) {
    }
    
    private final void onFavoriteSuccess(int p0_52215) {
    }
    
    private final void onFavoriteError(java.lang.Throwable throwable) {
    }
    
    private final void onSuccess(com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movie) {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
    
    private final void onLoading() {
    }
    
    public DetailMovieViewModel(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.repository.MovieRepositoryImpl repository, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.domain.SchedulerProviders scheduler) {
        super();
    }
}