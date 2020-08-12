package com.madfooatcom.movietestlibrary.databinding;
import com.madfooatcom.movietestlibrary.R;
import com.madfooatcom.movietestlibrary.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailTvshowBindingImpl extends ActivityDetailTvshowBinding implements com.madfooatcom.movietestlibrary.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layoutDataDetailTvShow, 11);
        sViewsWithIds.put(R.id.shapeView, 12);
        sViewsWithIds.put(R.id.imgBack, 13);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailTvshowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityDetailTvshowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (android.widget.ImageView) bindings[13]
            , (androidx.core.widget.NestedScrollView) bindings[11]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.RatingBar) bindings[8]
            , (com.github.florent37.shapeofview.shapes.DiagonalView) bindings[12]
            , (io.supercharge.shimmerlayout.ShimmerLayout) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            );
        this.fbFavoriteTvShow.setTag(null);
        this.lnTvShow.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.rates.setTag(null);
        this.shimmerTvShowDetail.setTag(null);
        this.tvRate.setTag(null);
        this.tvSeason.setTag(null);
        this.tvTitleDetailTvShow.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.madfooatcom.movietestlibrary.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.imageBackdropTV == variableId) {
            setImageBackdropTV((java.lang.String) variable);
        }
        else if (BR.imageCirclePosterTV == variableId) {
            setImageCirclePosterTV((java.lang.String) variable);
        }
        else if (BR.rating == variableId) {
            setRating((java.lang.Float) variable);
        }
        else if (BR.tvGenres == variableId) {
            setTvGenres((java.lang.String) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((com.madfooatcom.movietestlibrary.ui.feature.detailtvshow.DetailTVShowActivity) variable);
        }
        else if (BR.tvDetail == variableId) {
            setTvDetail((com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImageBackdropTV(@Nullable java.lang.String ImageBackdropTV) {
        this.mImageBackdropTV = ImageBackdropTV;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.imageBackdropTV);
        super.requestRebind();
    }
    public void setImageCirclePosterTV(@Nullable java.lang.String ImageCirclePosterTV) {
        this.mImageCirclePosterTV = ImageCirclePosterTV;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.imageCirclePosterTV);
        super.requestRebind();
    }
    public void setRating(@Nullable java.lang.Float Rating) {
        this.mRating = Rating;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.rating);
        super.requestRebind();
    }
    public void setTvGenres(@Nullable java.lang.String TvGenres) {
        this.mTvGenres = TvGenres;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.tvGenres);
        super.requestRebind();
    }
    public void setHandler(@Nullable com.madfooatcom.movietestlibrary.ui.feature.detailtvshow.DetailTVShowActivity Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setTvDetail(@Nullable com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity TvDetail) {
        this.mTvDetail = TvDetail;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.tvDetail);
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
        java.lang.Integer tvDetailNumberOfSeasons = null;
        int androidxDatabindingViewDataBindingSafeUnboxTvDetailNumberOfSeasons = 0;
        float androidxDatabindingViewDataBindingSafeUnboxRating = 0f;
        java.lang.String integerToStringTvDetailNumberOfSeasons = null;
        java.lang.String imageBackdropTV = mImageBackdropTV;
        java.lang.String imageCirclePosterTV = mImageCirclePosterTV;
        java.lang.String floatToStringTvDetailVoteAverage = null;
        java.lang.Float rating = mRating;
        java.lang.String tvGenres = mTvGenres;
        java.lang.String integerToStringTvDetailNumberOfSeasonsJavaLangStringSeason = null;
        float androidxDatabindingViewDataBindingSafeUnboxTvDetailVoteAverage = 0f;
        java.lang.Float tvDetailVoteAverage = null;
        com.madfooatcom.movietestlibrary.ui.feature.detailtvshow.DetailTVShowActivity handler = mHandler;
        java.lang.String tvDetailName = null;
        com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity tvDetail = mTvDetail;
        java.lang.String tvDetailOverview = null;

        if ((dirtyFlags & 0x41L) != 0) {
        }
        if ((dirtyFlags & 0x42L) != 0) {
        }
        if ((dirtyFlags & 0x44L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(rating)
                androidxDatabindingViewDataBindingSafeUnboxRating = androidx.databinding.ViewDataBinding.safeUnbox(rating);
        }
        if ((dirtyFlags & 0x48L) != 0) {
        }
        if ((dirtyFlags & 0x60L) != 0) {



                if (tvDetail != null) {
                    // read tvDetail.numberOfSeasons
                    tvDetailNumberOfSeasons = tvDetail.getNumberOfSeasons();
                    // read tvDetail.voteAverage
                    tvDetailVoteAverage = tvDetail.getVoteAverage();
                    // read tvDetail.name
                    tvDetailName = tvDetail.getName();
                    // read tvDetail.overview
                    tvDetailOverview = tvDetail.getOverview();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(tvDetail.numberOfSeasons)
                androidxDatabindingViewDataBindingSafeUnboxTvDetailNumberOfSeasons = androidx.databinding.ViewDataBinding.safeUnbox(tvDetailNumberOfSeasons);
                // read androidx.databinding.ViewDataBinding.safeUnbox(tvDetail.voteAverage)
                androidxDatabindingViewDataBindingSafeUnboxTvDetailVoteAverage = androidx.databinding.ViewDataBinding.safeUnbox(tvDetailVoteAverage);


                // read Integer.toString(androidx.databinding.ViewDataBinding.safeUnbox(tvDetail.numberOfSeasons))
                integerToStringTvDetailNumberOfSeasons = java.lang.Integer.toString(androidxDatabindingViewDataBindingSafeUnboxTvDetailNumberOfSeasons);
                // read Float.toString(androidx.databinding.ViewDataBinding.safeUnbox(tvDetail.voteAverage))
                floatToStringTvDetailVoteAverage = java.lang.Float.toString(androidxDatabindingViewDataBindingSafeUnboxTvDetailVoteAverage);


                // read (Integer.toString(androidx.databinding.ViewDataBinding.safeUnbox(tvDetail.numberOfSeasons))) + (" Season")
                integerToStringTvDetailNumberOfSeasonsJavaLangStringSeason = (integerToStringTvDetailNumberOfSeasons) + (" Season");
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.fbFavoriteTvShow.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, tvDetailOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRate, floatToStringTvDetailVoteAverage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSeason, integerToStringTvDetailNumberOfSeasonsJavaLangStringSeason);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitleDetailTvShow, tvDetailName);
        }
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 1

            com.madfooatcom.movietestlibrary.utils.BindingAdapterKt.loadImage(this.mboundView2, imageBackdropTV);
        }
        if ((dirtyFlags & 0x42L) != 0) {
            // api target 1

            com.madfooatcom.movietestlibrary.utils.BindingAdapterKt.loadImage(this.mboundView3, imageCirclePosterTV);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, tvGenres);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.rates, androidxDatabindingViewDataBindingSafeUnboxRating);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        com.madfooatcom.movietestlibrary.ui.feature.detailtvshow.DetailTVShowActivity handler = mHandler;
        // tvDetail != null
        boolean tvDetailJavaLangObjectNull = false;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // tvDetail
        com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity tvDetail = mTvDetail;
        // tvDetail.isFavorite()
        java.lang.Boolean tvDetailIsFavorite = null;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {



            tvDetailJavaLangObjectNull = (tvDetail) != (null);
            if (tvDetailJavaLangObjectNull) {


                tvDetailIsFavorite = tvDetail.isFavorite();


                handler.onFavoriteClick(tvDetailIsFavorite, tvDetail);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): imageBackdropTV
        flag 1 (0x2L): imageCirclePosterTV
        flag 2 (0x3L): rating
        flag 3 (0x4L): tvGenres
        flag 4 (0x5L): handler
        flag 5 (0x6L): tvDetail
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}