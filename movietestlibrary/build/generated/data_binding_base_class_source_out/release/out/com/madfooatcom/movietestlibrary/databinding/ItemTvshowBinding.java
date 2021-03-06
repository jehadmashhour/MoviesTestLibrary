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
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity;
import com.madfooatcom.movietestlibrary.ui.handler.EventHandler;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemTvshowBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView imgPosterPath;

  @NonNull
  public final TextView tvItemDetailsTv;

  @NonNull
  public final TextView tvOverview;

  @NonNull
  public final TextView tvRating;

  @Bindable
  protected TvShowEntity mTvShows;

  @Bindable
  protected String mSdf;

  @Bindable
  protected String mImage;

  @Bindable
  protected EventHandler mHandler;

  protected ItemTvshowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView, ImageView imgPosterPath, TextView tvItemDetailsTv, TextView tvOverview,
      TextView tvRating) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.imgPosterPath = imgPosterPath;
    this.tvItemDetailsTv = tvItemDetailsTv;
    this.tvOverview = tvOverview;
    this.tvRating = tvRating;
  }

  public abstract void setTvShows(@Nullable TvShowEntity tvShows);

  @Nullable
  public TvShowEntity getTvShows() {
    return mTvShows;
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
  public static ItemTvshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_tvshow, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemTvshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemTvshowBinding>inflateInternal(inflater, R.layout.item_tvshow, root, attachToRoot, component);
  }

  @NonNull
  public static ItemTvshowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_tvshow, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemTvshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemTvshowBinding>inflateInternal(inflater, R.layout.item_tvshow, null, false, component);
  }

  public static ItemTvshowBinding bind(@NonNull View view) {
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
  public static ItemTvshowBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemTvshowBinding)bind(component, view, R.layout.item_tvshow);
  }
}
