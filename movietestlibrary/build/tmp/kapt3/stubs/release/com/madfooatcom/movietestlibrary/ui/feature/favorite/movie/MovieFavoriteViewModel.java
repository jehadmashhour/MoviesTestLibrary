package com.madfooatcom.movietestlibrary.ui.feature.favorite.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u0016\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/madfooatcom/movietestlibrary/ui/feature/favorite/movie/MovieFavoriteViewModel;", "Lcom/madfooatcom/movietestlibrary/base/BaseViewModel;", "repositoryImpl", "Lcom/madfooatcom/movietestlibrary/data/repository/MovieRepositoryImpl;", "scheduler", "Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;", "(Lcom/madfooatcom/movietestlibrary/data/repository/MovieRepositoryImpl;Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;)V", "movieDetailState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/madfooatcom/movietestlibrary/common/ViewState;", "Landroidx/paging/PagedList;", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "getMovieDetailState", "()Landroidx/lifecycle/MutableLiveData;", "getAllFavoriteMovie", "", "isFavorite", "", "onError", "throwable", "", "onLoading", "onSuccess", "movie", "movietestlibrary_release"})
public final class MovieFavoriteViewModel extends com.madfooatcom.movietestlibrary.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.madfooatcom.movietestlibrary.common.ViewState<androidx.paging.PagedList<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity>>> movieDetailState = null;
    private final com.madfooatcom.movietestlibrary.data.repository.MovieRepositoryImpl repositoryImpl = null;
    private final com.madfooatcom.movietestlibrary.domain.SchedulerProviders scheduler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.madfooatcom.movietestlibrary.common.ViewState<androidx.paging.PagedList<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity>>> getMovieDetailState() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getAllFavoriteMovie(boolean isFavorite) {
    }
    
    private final void onLoading() {
    }
    
    private final void onSuccess(androidx.paging.PagedList<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> movie) {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
    
    public MovieFavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.repository.MovieRepositoryImpl repositoryImpl, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.domain.SchedulerProviders scheduler) {
        super();
    }
}