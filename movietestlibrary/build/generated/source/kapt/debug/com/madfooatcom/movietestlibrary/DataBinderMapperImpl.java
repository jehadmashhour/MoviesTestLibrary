package com.madfooatcom.movietestlibrary;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.madfooatcom.movietestlibrary.databinding.ActivityDetailMovieBindingImpl;
import com.madfooatcom.movietestlibrary.databinding.ActivityDetailTvshowBindingImpl;
import com.madfooatcom.movietestlibrary.databinding.FragmentMovieBindingImpl;
import com.madfooatcom.movietestlibrary.databinding.FragmentMovieFavoriteBindingImpl;
import com.madfooatcom.movietestlibrary.databinding.FragmentTvShowFavoriteBindingImpl;
import com.madfooatcom.movietestlibrary.databinding.FragmentTvshowBindingImpl;
import com.madfooatcom.movietestlibrary.databinding.ItemFavoriteMoviesBindingImpl;
import com.madfooatcom.movietestlibrary.databinding.ItemFavoriteTvShowBindingImpl;
import com.madfooatcom.movietestlibrary.databinding.ItemMoviesBindingImpl;
import com.madfooatcom.movietestlibrary.databinding.ItemTvshowBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDETAILMOVIE = 1;

  private static final int LAYOUT_ACTIVITYDETAILTVSHOW = 2;

  private static final int LAYOUT_FRAGMENTMOVIE = 3;

  private static final int LAYOUT_FRAGMENTMOVIEFAVORITE = 4;

  private static final int LAYOUT_FRAGMENTTVSHOWFAVORITE = 5;

  private static final int LAYOUT_FRAGMENTTVSHOW = 6;

  private static final int LAYOUT_ITEMFAVORITEMOVIES = 7;

  private static final int LAYOUT_ITEMFAVORITETVSHOW = 8;

  private static final int LAYOUT_ITEMMOVIES = 9;

  private static final int LAYOUT_ITEMTVSHOW = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.activity_detail_movie, LAYOUT_ACTIVITYDETAILMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.activity_detail_tvshow, LAYOUT_ACTIVITYDETAILTVSHOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.fragment_movie, LAYOUT_FRAGMENTMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.fragment_movie_favorite, LAYOUT_FRAGMENTMOVIEFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.fragment_tv_show_favorite, LAYOUT_FRAGMENTTVSHOWFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.fragment_tvshow, LAYOUT_FRAGMENTTVSHOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.item_favorite_movies, LAYOUT_ITEMFAVORITEMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.item_favorite_tv_show, LAYOUT_ITEMFAVORITETVSHOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.item_movies, LAYOUT_ITEMMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.madfooatcom.movietestlibrary.R.layout.item_tvshow, LAYOUT_ITEMTVSHOW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDETAILMOVIE: {
          if ("layout/activity_detail_movie_0".equals(tag)) {
            return new ActivityDetailMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDETAILTVSHOW: {
          if ("layout/activity_detail_tvshow_0".equals(tag)) {
            return new ActivityDetailTvshowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail_tvshow is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIE: {
          if ("layout/fragment_movie_0".equals(tag)) {
            return new FragmentMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIEFAVORITE: {
          if ("layout/fragment_movie_favorite_0".equals(tag)) {
            return new FragmentMovieFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movie_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTVSHOWFAVORITE: {
          if ("layout/fragment_tv_show_favorite_0".equals(tag)) {
            return new FragmentTvShowFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tv_show_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTVSHOW: {
          if ("layout/fragment_tvshow_0".equals(tag)) {
            return new FragmentTvshowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tvshow is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAVORITEMOVIES: {
          if ("layout/item_favorite_movies_0".equals(tag)) {
            return new ItemFavoriteMoviesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_favorite_movies is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAVORITETVSHOW: {
          if ("layout/item_favorite_tv_show_0".equals(tag)) {
            return new ItemFavoriteTvShowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_favorite_tv_show is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIES: {
          if ("layout/item_movies_0".equals(tag)) {
            return new ItemMoviesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movies is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTVSHOW: {
          if ("layout/item_tvshow_0".equals(tag)) {
            return new ItemTvshowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_tvshow is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(17);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
      sKeys.put(2, "handler");
      sKeys.put(3, "image");
      sKeys.put(4, "imageBackdropMovie");
      sKeys.put(5, "imageBackdropTV");
      sKeys.put(6, "imageCirclePosterTV");
      sKeys.put(7, "imagePosterMovie");
      sKeys.put(8, "movie");
      sKeys.put(9, "moviesDetail");
      sKeys.put(10, "rating");
      sKeys.put(11, "ratingMovie");
      sKeys.put(12, "sdf");
      sKeys.put(13, "tvDetail");
      sKeys.put(14, "tvGenres");
      sKeys.put(15, "tvRuntime");
      sKeys.put(16, "tvShows");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_detail_movie_0", com.madfooatcom.movietestlibrary.R.layout.activity_detail_movie);
      sKeys.put("layout/activity_detail_tvshow_0", com.madfooatcom.movietestlibrary.R.layout.activity_detail_tvshow);
      sKeys.put("layout/fragment_movie_0", com.madfooatcom.movietestlibrary.R.layout.fragment_movie);
      sKeys.put("layout/fragment_movie_favorite_0", com.madfooatcom.movietestlibrary.R.layout.fragment_movie_favorite);
      sKeys.put("layout/fragment_tv_show_favorite_0", com.madfooatcom.movietestlibrary.R.layout.fragment_tv_show_favorite);
      sKeys.put("layout/fragment_tvshow_0", com.madfooatcom.movietestlibrary.R.layout.fragment_tvshow);
      sKeys.put("layout/item_favorite_movies_0", com.madfooatcom.movietestlibrary.R.layout.item_favorite_movies);
      sKeys.put("layout/item_favorite_tv_show_0", com.madfooatcom.movietestlibrary.R.layout.item_favorite_tv_show);
      sKeys.put("layout/item_movies_0", com.madfooatcom.movietestlibrary.R.layout.item_movies);
      sKeys.put("layout/item_tvshow_0", com.madfooatcom.movietestlibrary.R.layout.item_tvshow);
    }
  }
}
