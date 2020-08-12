package com.madfooatcom.movietestlibrary.databinding;
import com.madfooatcom.movietestlibrary.R;
import com.madfooatcom.movietestlibrary.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailMovieBindingImpl extends ActivityDetailMovieBinding implements com.madfooatcom.movietestlibrary.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layoutDataDetailMovie, 11);
        sViewsWithIds.put(R.id.layoutData, 12);
        sViewsWithIds.put(R.id.imgBack, 13);
        sViewsWithIds.put(R.id.shapeView, 14);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailMovieBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityDetailMovieBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[11]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RatingBar) bindings[8]
            , (com.github.florent37.shapeofview.shapes.DiagonalView) bindings[14]
            , (io.supercharge.shimmerlayout.ShimmerLayout) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            );
        this.fbFavoriteMovie.setTag(null);
        this.imgBackdropMovie.setTag(null);
        this.imgPosterPath.setTag(null);
        this.lnMovie.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.movieRuntime.setTag(null);
        this.rate.setTag(null);
        this.shimmerMovieDetail.setTag(null);
        this.tvRate.setTag(null);
        this.tvTitleDetailMovie.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.madfooatcom.movietestlibrary.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.imagePosterMovie == variableId) {
            setImagePosterMovie((java.lang.String) variable);
        }
        else if (BR.ratingMovie == variableId) {
            setRatingMovie((java.lang.Float) variable);
        }
        else if (BR.imageBackdropMovie == variableId) {
            setImageBackdropMovie((java.lang.String) variable);
        }
        else if (BR.tvRuntime == variableId) {
            setTvRuntime((java.lang.String) variable);
        }
        else if (BR.tvGenres == variableId) {
            setTvGenres((java.lang.String) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((com.madfooatcom.movietestlibrary.ui.feature.detailmovie.DetailMovieActivity) variable);
        }
        else if (BR.moviesDetail == variableId) {
            setMoviesDetail((com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImagePosterMovie(@Nullable java.lang.String ImagePosterMovie) {
        this.mImagePosterMovie = ImagePosterMovie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.imagePosterMovie);
        super.requestRebind();
    }
    public void setRatingMovie(@Nullable java.lang.Float RatingMovie) {
        this.mRatingMovie = RatingMovie;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ratingMovie);
        super.requestRebind();
    }
    public void setImageBackdropMovie(@Nullable java.lang.String ImageBackdropMovie) {
        this.mImageBackdropMovie = ImageBackdropMovie;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.imageBackdropMovie);
        super.requestRebind();
    }
    public void setTvRuntime(@Nullable java.lang.String TvRuntime) {
        this.mTvRuntime = TvRuntime;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.tvRuntime);
        super.requestRebind();
    }
    public void setTvGenres(@Nullable java.lang.String TvGenres) {
        this.mTvGenres = TvGenres;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.tvGenres);
        super.requestRebind();
    }
    public void setHandler(@Nullable com.madfooatcom.movietestlibrary.ui.feature.detailmovie.DetailMovieActivity Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setMoviesDetail(@Nullable com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity MoviesDetail) {
        this.mMoviesDetail = MoviesDetail;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.moviesDetail);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Float moviesDetailVoteAverage = null;
        java.lang.String imagePosterMovie = mImagePosterMovie;
        java.lang.Float ratingMovie = mRatingMovie;
        java.lang.String imageBackdropMovie = mImageBackdropMovie;
        java.lang.String moviesDetailTitle = null;
        java.lang.String tvRuntime = mTvRuntime;
        java.lang.String tvGenres = mTvGenres;
        com.madfooatcom.movietestlibrary.ui.feature.detailmovie.DetailMovieActivity handler = mHandler;
        java.lang.String floatToStringMoviesDetailVoteAverage = null;
        com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity moviesDetail = mMoviesDetail;
        float androidxDatabindingViewDataBindingSafeUnboxMoviesDetailVoteAverage = 0f;
        java.lang.String moviesDetailOverview = null;
        float androidxDatabindingViewDataBindingSafeUnboxRatingMovie = 0f;

        if ((dirtyFlags & 0x81L) != 0) {
        }
        if ((dirtyFlags & 0x82L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(ratingMovie)
                androidxDatabindingViewDataBindingSafeUnboxRatingMovie = androidx.databinding.ViewDataBinding.safeUnbox(ratingMovie);
        }
        if ((dirtyFlags & 0x84L) != 0) {
        }
        if ((dirtyFlags & 0x88L) != 0) {
        }
        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xc0L) != 0) {



                if (moviesDetail != null) {
                    // read moviesDetail.voteAverage
                    moviesDetailVoteAverage = moviesDetail.getVoteAverage();
                    // read moviesDetail.title
                    moviesDetailTitle = moviesDetail.getTitle();
                    // read moviesDetail.overview
                    moviesDetailOverview = moviesDetail.getOverview();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(moviesDetail.voteAverage)
                androidxDatabindingViewDataBindingSafeUnboxMoviesDetailVoteAverage = androidx.databinding.ViewDataBinding.safeUnbox(moviesDetailVoteAverage);


                // read Float.toString(androidx.databinding.ViewDataBinding.safeUnbox(moviesDetail.voteAverage))
                floatToStringMoviesDetailVoteAverage = java.lang.Float.toString(androidxDatabindingViewDataBindingSafeUnboxMoviesDetailVoteAverage);
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.fbFavoriteMovie.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x84L) != 0) {
            // api target 1

            com.madfooatcom.movietestlibrary.utils.BindingAdapterKt.loadImage(this.imgBackdropMovie, imageBackdropMovie);
        }
        if ((dirtyFlags & 0x81L) != 0) {
            // api target 1

            com.madfooatcom.movietestlibrary.utils.BindingAdapterKt.loadImage(this.imgPosterPath, imagePosterMovie);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, moviesDetailOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRate, floatToStringMoviesDetailVoteAverage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitleDetailMovie, moviesDetailTitle);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, tvGenres);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieRuntime, tvRuntime);
        }
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 1

            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.rate, androidxDatabindingViewDataBindingSafeUnboxRatingMovie);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        com.madfooatcom.movietestlibrary.ui.feature.detailmovie.DetailMovieActivity handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // moviesDetail != null
        boolean moviesDetailJavaLangObjectNull = false;
        // moviesDetail
        com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity moviesDetail = mMoviesDetail;
        // moviesDetail.isFavorite()
        java.lang.Boolean moviesDetailIsFavorite = null;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {



            moviesDetailJavaLangObjectNull = (moviesDetail) != (null);
            if (moviesDetailJavaLangObjectNull) {


                moviesDetailIsFavorite = moviesDetail.isFavorite();


                handler.onFavoriteClick(moviesDetailIsFavorite, moviesDetail);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): imagePosterMovie
        flag 1 (0x2L): ratingMovie
        flag 2 (0x3L): imageBackdropMovie
        flag 3 (0x4L): tvRuntime
        flag 4 (0x5L): tvGenres
        flag 5 (0x6L): handler
        flag 6 (0x7L): moviesDetail
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}