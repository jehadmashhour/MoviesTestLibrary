package com.madfooatcom.movietestlibrary.databinding;
import com.madfooatcom.movietestlibrary.R;
import com.madfooatcom.movietestlibrary.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTvshowBindingImpl extends ItemTvshowBinding implements com.madfooatcom.movietestlibrary.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTvshowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemTvshowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            );
        this.imgPosterPath.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvItemDetailsTv.setTag(null);
        this.tvOverview.setTag(null);
        this.tvRating.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.madfooatcom.movietestlibrary.generated.callback.OnClickListener(this, 1);
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
        else if (BR.sdf == variableId) {
            setSdf((java.lang.String) variable);
        }
        else if (BR.tvShows == variableId) {
            setTvShows((com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity) variable);
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
    public void setSdf(@Nullable java.lang.String Sdf) {
        this.mSdf = Sdf;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.sdf);
        super.requestRebind();
    }
    public void setTvShows(@Nullable com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity TvShows) {
        this.mTvShows = TvShows;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.tvShows);
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
        java.lang.Float tvShowsVoteAverage = null;
        java.lang.String tvShowsName = null;
        java.lang.String sdf = mSdf;
        java.lang.String floatToStringTvShowsVoteAverage = null;
        java.lang.String tvShowsOverview = null;
        com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity tvShows = mTvShows;
        float androidxDatabindingViewDataBindingSafeUnboxTvShowsVoteAverage = 0f;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {



                if (tvShows != null) {
                    // read tvShows.voteAverage
                    tvShowsVoteAverage = tvShows.getVoteAverage();
                    // read tvShows.name
                    tvShowsName = tvShows.getName();
                    // read tvShows.overview
                    tvShowsOverview = tvShows.getOverview();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(tvShows.voteAverage)
                androidxDatabindingViewDataBindingSafeUnboxTvShowsVoteAverage = androidx.databinding.ViewDataBinding.safeUnbox(tvShowsVoteAverage);


                // read Float.toString(androidx.databinding.ViewDataBinding.safeUnbox(tvShows.voteAverage))
                floatToStringTvShowsVoteAverage = java.lang.Float.toString(androidxDatabindingViewDataBindingSafeUnboxTvShowsVoteAverage);
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            com.madfooatcom.movietestlibrary.utils.BindingAdapterKt.loadImage(this.imgPosterPath, image);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, tvShowsName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOverview, tvShowsOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRating, floatToStringTvShowsVoteAverage);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, sdf);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.tvItemDetailsTv.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // tvShows.id
        java.lang.Long tvShowsId = null;
        // handler
        com.madfooatcom.movietestlibrary.ui.handler.EventHandler handler = mHandler;
        // tvShows != null
        boolean tvShowsJavaLangObjectNull = false;
        // Long.toString(tvShows.id)
        java.lang.String longToStringTvShowsId = null;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // tvShows
        com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity tvShows = mTvShows;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {



            tvShowsJavaLangObjectNull = (tvShows) != (null);
            if (tvShowsJavaLangObjectNull) {


                tvShowsId = tvShows.getId();

                longToStringTvShowsId = java.lang.Long.toString(tvShowsId);

                handler.onTvShowDetailsClick(longToStringTvShowsId);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): image
        flag 1 (0x2L): handler
        flag 2 (0x3L): sdf
        flag 3 (0x4L): tvShows
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}