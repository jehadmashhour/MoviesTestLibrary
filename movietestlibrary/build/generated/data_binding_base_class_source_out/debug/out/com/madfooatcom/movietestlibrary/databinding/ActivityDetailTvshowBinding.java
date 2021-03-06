// Generated by data binding compiler. Do not edit!
package com.madfooatcom.movietestlibrary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.florent37.shapeofview.shapes.DiagonalView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.madfooatcom.movietestlibrary.R;
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity;
import com.madfooatcom.movietestlibrary.ui.feature.detailtvshow.DetailTVShowActivity;
import io.supercharge.shimmerlayout.ShimmerLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDetailTvshowBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton fbFavoriteTvShow;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final NestedScrollView layoutDataDetailTvShow;

  @NonNull
  public final LinearLayout lnTvShow;

  @NonNull
  public final RatingBar rates;

  @NonNull
  public final DiagonalView shapeView;

  @NonNull
  public final ShimmerLayout shimmerTvShowDetail;

  @NonNull
  public final TextView tvRate;

  @NonNull
  public final TextView tvSeason;

  @NonNull
  public final TextView tvTitleDetailTvShow;

  @Bindable
  protected String mImageCirclePosterTV;

  @Bindable
  protected String mImageBackdropTV;

  @Bindable
  protected String mTvGenres;

  @Bindable
  protected Float mRating;

  @Bindable
  protected DetailTVShowActivity mHandler;

  @Bindable
  protected TvShowDetailEntity mTvDetail;

  protected ActivityDetailTvshowBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton fbFavoriteTvShow, ImageView imgBack,
      NestedScrollView layoutDataDetailTvShow, LinearLayout lnTvShow, RatingBar rates,
      DiagonalView shapeView, ShimmerLayout shimmerTvShowDetail, TextView tvRate, TextView tvSeason,
      TextView tvTitleDetailTvShow) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fbFavoriteTvShow = fbFavoriteTvShow;
    this.imgBack = imgBack;
    this.layoutDataDetailTvShow = layoutDataDetailTvShow;
    this.lnTvShow = lnTvShow;
    this.rates = rates;
    this.shapeView = shapeView;
    this.shimmerTvShowDetail = shimmerTvShowDetail;
    this.tvRate = tvRate;
    this.tvSeason = tvSeason;
    this.tvTitleDetailTvShow = tvTitleDetailTvShow;
  }

  public abstract void setImageCirclePosterTV(@Nullable String imageCirclePosterTV);

  @Nullable
  public String getImageCirclePosterTV() {
    return mImageCirclePosterTV;
  }

  public abstract void setImageBackdropTV(@Nullable String imageBackdropTV);

  @Nullable
  public String getImageBackdropTV() {
    return mImageBackdropTV;
  }

  public abstract void setTvGenres(@Nullable String tvGenres);

  @Nullable
  public String getTvGenres() {
    return mTvGenres;
  }

  public abstract void setRating(@Nullable Float rating);

  @Nullable
  public Float getRating() {
    return mRating;
  }

  public abstract void setHandler(@Nullable DetailTVShowActivity handler);

  @Nullable
  public DetailTVShowActivity getHandler() {
    return mHandler;
  }

  public abstract void setTvDetail(@Nullable TvShowDetailEntity tvDetail);

  @Nullable
  public TvShowDetailEntity getTvDetail() {
    return mTvDetail;
  }

  @NonNull
  public static ActivityDetailTvshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail_tvshow, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailTvshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailTvshowBinding>inflateInternal(inflater, R.layout.activity_detail_tvshow, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailTvshowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail_tvshow, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailTvshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailTvshowBinding>inflateInternal(inflater, R.layout.activity_detail_tvshow, null, false, component);
  }

  public static ActivityDetailTvshowBinding bind(@NonNull View view) {
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
  public static ActivityDetailTvshowBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDetailTvshowBinding)bind(component, view, R.layout.activity_detail_tvshow);
  }
}
