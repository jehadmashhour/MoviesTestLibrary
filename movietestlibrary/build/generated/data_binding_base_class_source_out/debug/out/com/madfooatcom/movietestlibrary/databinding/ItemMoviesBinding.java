// Generated by data binding compiler. Do not edit!
package com.madfooatcom.movietestlibrary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.madfooatcom.movietestlibrary.R;
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity;
import com.madfooatcom.movietestlibrary.ui.handler.EventHandler;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMoviesBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView imgPosterPath;

  @NonNull
  public final TextView tvItemDetails;

  @NonNull
  public final TextView tvOverview;

  @NonNull
  public final TextView tvRating;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected MovieEntity mMovie;

  @Bindable
  protected String mSdf;

  @Bindable
  protected String mImage;

  @Bindable
  protected EventHandler mHandler;

  protected ItemMoviesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView, ImageView imgPosterPath, TextView tvItemDetails, TextView tvOverview,
      TextView tvRating, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.imgPosterPath = imgPosterPath;
    this.tvItemDetails = tvItemDetails;
    this.tvOverview = tvOverview;
    this.tvRating = tvRating;
    this.tvTitle = tvTitle;
  }

  public abstract void setMovie(@Nullable MovieEntity movie);

  @Nullable
  public MovieEntity getMovie() {
    return mMovie;
  }

  public abstract void setSdf(@Nullable String sdf);

  @Nullable
  public String getSdf() {
    return mSdf;
  }

  public abstract void setImage(@Nullable String image);

  @Nullable
  public String getImage() {
    return mImage;
  }

  public abstract void setHandler(@Nullable EventHandler handler);

  @Nullable
  public EventHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ItemMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_movies, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMoviesBinding>inflateInternal(inflater, R.layout.item_movies, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMoviesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_movies, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMoviesBinding>inflateInternal(inflater, R.layout.item_movies, null, false, component);
  }

  public static ItemMoviesBinding bind(@NonNull View view) {
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
  public static ItemMoviesBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMoviesBinding)bind(component, view, R.layout.item_movies);
  }
}