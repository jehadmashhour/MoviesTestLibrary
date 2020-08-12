package com.madfooatcom.movietestlibrary.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/madfooatcom/movietestlibrary/utils/GenresConverter;", "", "()V", "Companion", "movietestlibrary_release"})
public final class GenresConverter {
    public static final com.madfooatcom.movietestlibrary.utils.GenresConverter.Companion Companion = null;
    
    public GenresConverter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final java.lang.String ListToJson(@org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> replyMessages) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> JsonToList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/madfooatcom/movietestlibrary/utils/GenresConverter$Companion;", "", "()V", "JsonToList", "", "Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/GenresItem;", "json", "", "ListToJson", "replyMessages", "movietestlibrary_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.TypeConverter()
        public final java.lang.String ListToJson(@org.jetbrains.annotations.Nullable()
        java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> replyMessages) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.TypeConverter()
        public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> JsonToList(@org.jetbrains.annotations.Nullable()
        java.lang.String json) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}