// Generated by data binding compiler. Do not edit!
package com.madfooatcom.movietestlibrary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.madfooatcom.movietestlibrary.R;
import com.madfooatcom.movietestlibrary.ui.adapter.MovieFavoriteAdapter;
import io.supercharge.shimmerlayout.ShimmerLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMovieFavoriteBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout lnMovieZero;

  @NonNull
  public final RecyclerView rvMovieFavorite;

  @NonNull
  public final ShimmerLayout shimmerMovieFavorite;

  @Bindable
  protected MovieFavoriteAdapter mAdapter;

  protected FragmentMovieFavoriteBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout lnMovieZero, RecyclerView rvMovieFavorite, ShimmerLayout shimmerMovieFavorite) {
    super(_bindingComponent, _root, _localFieldCount);
    this.lnMovieZero = lnMovieZero;
    this.rvMovieFavorite = rvMovieFavorite;
    this.shimmerMovieFavorite = shimmerMovieFavorite;
  }

  public abstract void setAdapter(@Nullable MovieFavoriteAdapter adapter);

  @Nullable
  public MovieFavoriteAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_movie_favorite, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMovieFavoriteBinding>inflateInternal(inflater, R.layout.fragment_movie_favorite, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_movie_favorite, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMovieFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMovieFavoriteBinding>inflateInternal(inflater, R.layout.fragment_movie_favorite, null, false, component);
  }

  public static FragmentMovieFavoriteBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentMovieFavoriteBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMovieFavoriteBinding)bind(component, view, R.layout.fragment_movie_favorite);
  }
}