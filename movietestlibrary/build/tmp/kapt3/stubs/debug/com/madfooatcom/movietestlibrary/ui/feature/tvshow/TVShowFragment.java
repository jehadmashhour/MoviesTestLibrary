package com.madfooatcom.movietestlibrary.ui.feature.tvshow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/madfooatcom/movietestlibrary/ui/feature/tvshow/TVShowFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "adapter", "Lcom/madfooatcom/movietestlibrary/ui/adapter/TvShowAdapter;", "binding", "Lcom/madfooatcom/movietestlibrary/databinding/FragmentTvshowBinding;", "viewModel", "Lcom/madfooatcom/movietestlibrary/ui/feature/tvshow/TvShowViewModel;", "getViewModel", "()Lcom/madfooatcom/movietestlibrary/ui/feature/tvshow/TvShowViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeDataChange", "", "observeError", "err", "", "observeTvShows", "tvShows", "", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowEntity;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "movietestlibrary_debug"})
public final class TVShowFragment extends androidx.fragment.app.Fragment {
    private com.madfooatcom.movietestlibrary.databinding.FragmentTvshowBinding binding;
    private com.madfooatcom.movietestlibrary.ui.adapter.TvShowAdapter adapter;
    private final kotlin.Lazy viewModel$delegate = null;
    private final java.lang.String TAG = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.madfooatcom.movietestlibrary.ui.feature.tvshow.TvShowViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeDataChange() {
    }
    
    private final void observeError(java.lang.Throwable err) {
    }
    
    private final void observeTvShows(java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity> tvShows) {
    }
    
    public TVShowFragment() {
        super();
    }
}