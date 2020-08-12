package com.madfooatcom.movietestlibrary.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0019H\u0014J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/madfooatcom/movietestlibrary/ui/MovieMainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "()V", "SELECTED_MENU", "", "favoriteFragment", "Lcom/madfooatcom/movietestlibrary/ui/feature/favorite/FavoriteFragment;", "getFavoriteFragment", "()Lcom/madfooatcom/movietestlibrary/ui/feature/favorite/FavoriteFragment;", "favoriteFragment$delegate", "Lkotlin/Lazy;", "movieFragment", "Lcom/madfooatcom/movietestlibrary/ui/feature/movie/MovieFragment;", "getMovieFragment", "()Lcom/madfooatcom/movietestlibrary/ui/feature/movie/MovieFragment;", "movieFragment$delegate", "tvShowFragment", "Lcom/madfooatcom/movietestlibrary/ui/feature/tvshow/TVShowFragment;", "getTvShowFragment", "()Lcom/madfooatcom/movietestlibrary/ui/feature/tvshow/TVShowFragment;", "tvShowFragment$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "outState", "setFragment", "fragment", "Landroidx/fragment/app/Fragment;", "movietestlibrary_debug"})
public final class MovieMainActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener {
    private final java.lang.String SELECTED_MENU = "selected_menu";
    private final kotlin.Lazy movieFragment$delegate = null;
    private final kotlin.Lazy tvShowFragment$delegate = null;
    private final kotlin.Lazy favoriteFragment$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.madfooatcom.movietestlibrary.ui.feature.movie.MovieFragment getMovieFragment() {
        return null;
    }
    
    private final com.madfooatcom.movietestlibrary.ui.feature.tvshow.TVShowFragment getTvShowFragment() {
        return null;
    }
    
    private final com.madfooatcom.movietestlibrary.ui.feature.favorite.FavoriteFragment getFavoriteFragment() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setFragment(androidx.fragment.app.Fragment fragment) {
    }
    
    public MovieMainActivity() {
        super();
    }
}