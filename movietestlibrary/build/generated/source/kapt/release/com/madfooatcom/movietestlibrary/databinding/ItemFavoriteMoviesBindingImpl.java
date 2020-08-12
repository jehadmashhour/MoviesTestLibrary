package com.madfooatcom.movietestlibrary.databinding;
import com.madfooatcom.movietestlibrary.R;
import com.madfooatcom.movietestlibrary.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFavoriteMoviesBindingImpl extends ItemFavoriteMoviesBinding implements com.madfooatcom.movietestlibrary.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFavoriteMoviesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemFavoriteMoviesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            );
        this.imgPosterPath.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvItemDetailsFavorite.setTag(null);
        this.tvOverview.setTag(null);
        this.tvRating.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.madfooatcom.movietestlibrary.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.image == variableId) {
            setImage((java.lang.String) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((com.madfooatcom.movietestlibrary.ui.handler.EventHandler) variable);
        }
        else if (BR.movie == variableId) {
            setMovie((com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity) variable);
        }
        else if (BR.sdf == variableId) {
            setSdf((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImage(@Nullable java.lang.String Image) {
        this.mImage = Image;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.image);
        super.requestRebind();
    }
    public void setHandler(@Nullable com.madfooatcom.movietestlibrary.ui.handler.EventHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setMovie(@Nullable com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }
    public void setSdf(@Nullable java.lang.String Sdf) {
        this.mSdf = Sdf;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.sdf);
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
        java.lang.String image = mImage;
        com.madfooatcom.movietestlibrary.ui.handler.EventHandler handler = mHandler;
        java.lang.String movieTitle = null;
        com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movie = mMovie;
        java.lang.String movieOverview = null;
        java.lang.String sdf = mSdf;
        java.lang.String floatToStringMovieVoteAverage = null;
        float androidxDatabindingViewDataBindingSafeUnboxMovieVoteAverage = 0f;
        java.lang.Float movieVoteAverage = null;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {



                if (movie != null) {
                    // read movie.title
                    movieTitle = movie.getTitle();
                    // read movie.overview
                    movieOverview = movie.getOverview();
                    // read movie.voteAverage
                    movieVoteAverage = movie.getVoteAverage();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(movie.voteAverage)
                androidxDatabindingViewDataBindingSafeUnboxMovieVoteAverage = androidx.databinding.ViewDataBinding.safeUnbox(movieVoteAverage);


                // read Float.toString(androidx.databinding.ViewDataBinding.safeUnbox(movie.voteAverage))
                floatToStringMovieVoteAverage = java.lang.Float.toString(androidxDatabindingViewDataBindingSafeUnboxMovieVoteAverage);
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            com.madfooatcom.movietestlibrary.utils.BindingAdapterKt.loadImage(this.imgPosterPath, image);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, sdf);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.tvItemDetailsFavorite.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOverview, movieOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRating, floatToStringMovieVoteAverage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, movieTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // movie
        com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity movie = mMovie;
        // handler
        com.madfooatcom.movietestlibrary.ui.handler.EventHandler handler = mHandler;
        // Long.toString(movie.id)
        java.lang.String longToStringMovieId = null;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // movie.id
        java.lang.Long movieId = null;
        // movie != null
        boolean movieJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {



            movieJavaLangObjectNull = (movie) != (null);
            if (movieJavaLangObjectNull) {


                movieId = movie.getId();

                longToStringMovieId = java.lang.Long.toString(movieId);

                handler.onMovieDetailsClick(longToStringMovieId);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): image
        flag 1 (0x2L): handler
        flag 2 (0x3L): movie
        flag 3 (0x4L): sdf
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}