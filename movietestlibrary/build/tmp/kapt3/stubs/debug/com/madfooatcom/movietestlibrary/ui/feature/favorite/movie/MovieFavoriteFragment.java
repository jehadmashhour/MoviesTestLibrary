package com.madfooatcom.movietestlibrary.ui.feature.favorite.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/madfooatcom/movietestlibrary/ui/feature/favorite/movie/MovieFavoriteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/madfooatcom/movietestlibrary/ui/adapter/MovieFavoriteAdapter;", "binding", "Lcom/madfooatcom/movietestlibrary/databinding/FragmentMovieFavoriteBinding;", "viewModel", "Lcom/madfooatcom/movietestlibrary/ui/feature/favorite/movie/MovieFavoriteViewModel;", "getViewModel", "()Lcom/madfooatcom/movietestlibrary/ui/feature/favorite/movie/MovieFavoriteViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeDataChange", "", "observeError", "throwable", "", "observeSuccess", "movies", "Landroidx/paging/PagedList;", "Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "movietestlibrary_debug"})
public final class MovieFavoriteFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.madfooatcom.movietestlibrary.databinding.FragmentMovieFavoriteBinding binding;
    private com.madfooatcom.movietestlibrary.ui.adapter.MovieFavoriteAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.madfooatcom.movietestlibrary.ui.feature.favorite.movie.MovieFavoriteViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeDataChange() {
    }
    
    private final void observeSuccess(androidx.paging.PagedList<com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity> movies) {
    }
    
    private final void observeError(java.lang.Throwable throwable) {
    }
    
    public MovieFavoriteFragment() {
        super();
    }
}