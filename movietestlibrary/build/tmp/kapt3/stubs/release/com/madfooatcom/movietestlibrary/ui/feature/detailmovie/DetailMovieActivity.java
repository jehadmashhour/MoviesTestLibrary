package com.madfooatcom.movietestlibrary.ui.feature.detailmovie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/madfooatcom/movietestlibrary/ui/feature/detailmovie/DetailMovieActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/madfooatcom/movietestlibrary/databinding/ActivityDetailMovieBinding;", "viewModel", "Lcom/madfooatcom/movietestlibrary/ui/feature/detailmovie/DetailMovieViewModel;", "getViewModel", "()Lcom/madfooatcom/movietestlibrary/ui/feature/detailmovie/DetailMovieViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeDataChange", "", "observeDataFavoriteChange", "isFavorite", "", "observeError", "error", "", "observeMoviesDetail", "movies", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFavoriteClick", "movie", "movietestlibrary_release"})
public final class DetailMovieActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.madfooatcom.movietestlibrary.databinding.ActivityDetailMovieBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.madfooatcom.movietestlibrary.ui.feature.detailmovie.DetailMovieViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeDataChange() {
    }
    
    private final void observeError(java.lang.Throwable error) {
    }
    
    private final void observeMoviesDetail(com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movies) {
    }
    
    public final void onFavoriteClick(boolean isFavorite, @org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movie) {
    }
    
    private final void observeDataFavoriteChange(boolean isFavorite) {
    }
    
    public DetailMovieActivity() {
        super();
    }
}