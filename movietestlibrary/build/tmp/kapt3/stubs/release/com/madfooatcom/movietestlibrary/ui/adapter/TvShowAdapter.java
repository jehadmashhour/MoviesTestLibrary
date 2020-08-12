package com.madfooatcom.movietestlibrary.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0012R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/madfooatcom/movietestlibrary/ui/adapter/TvShowAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/madfooatcom/movietestlibrary/ui/adapter/TvShowAdapter$ViewHolder;", "()V", "list", "Ljava/util/ArrayList;", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowEntity;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTvShows", "", "ViewHolder", "movietestlibrary_release"})
public final class TvShowAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.madfooatcom.movietestlibrary.ui.adapter.TvShowAdapter.ViewHolder> {
    private final java.util.ArrayList<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity> list = null;
    
    public final void setTvShows(@org.jetbrains.annotations.NotNull()
    java.util.List<com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.madfooatcom.movietestlibrary.ui.adapter.TvShowAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.madfooatcom.movietestlibrary.ui.adapter.TvShowAdapter.ViewHolder holder, int position) {
    }
    
    public TvShowAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/madfooatcom/movietestlibrary/ui/adapter/TvShowAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/madfooatcom/movietestlibrary/databinding/ItemTvshowBinding;", "(Lcom/madfooatcom/movietestlibrary/ui/adapter/TvShowAdapter;Lcom/madfooatcom/movietestlibrary/databinding/ItemTvshowBinding;)V", "getBinding", "()Lcom/madfooatcom/movietestlibrary/databinding/ItemTvshowBinding;", "setBinding", "(Lcom/madfooatcom/movietestlibrary/databinding/ItemTvshowBinding;)V", "bind", "", "tvShow", "Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowEntity;", "movietestlibrary_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.madfooatcom.movietestlibrary.databinding.ItemTvshowBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity tvShow) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.madfooatcom.movietestlibrary.databinding.ItemTvshowBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.madfooatcom.movietestlibrary.databinding.ItemTvshowBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.madfooatcom.movietestlibrary.databinding.ItemTvshowBinding binding) {
            super(null);
        }
    }
}