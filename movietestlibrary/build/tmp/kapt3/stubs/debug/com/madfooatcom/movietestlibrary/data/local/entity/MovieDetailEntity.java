package com.madfooatcom.movietestlibrary.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "moviedetail_db")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bg\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00d5\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010&J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010k\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0010\u0010l\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00105J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00105J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\fH\u00c6\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\fH\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u000b\u0010v\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0010\u0010|\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0012\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0012\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fH\u00c6\u0003J\u00e0\u0002\u0010\u0083\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\f2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0084\u0001J\u0015\u0010\u0085\u0001\u001a\u00020\u00062\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u00d6\u0001J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010-\"\u0004\b>\u0010/R\"\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b?\u00105\"\u0004\b@\u00107R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010-\"\u0004\bB\u0010/R\"\u0010%\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b%\u0010(\"\u0004\bC\u0010*R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010-\"\u0004\bE\u0010/R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010-\"\u0004\bI\u0010/R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010N\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010-\"\u0004\bP\u0010/R&\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010:\"\u0004\bR\u0010<R&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010-\"\u0004\bV\u0010/R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bW\u00105\"\u0004\bX\u00107R\"\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bY\u00105\"\u0004\bZ\u00107R&\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010:\"\u0004\b\\\u0010<R \u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010-\"\u0004\b^\u0010/R \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010-\"\u0004\b`\u0010/R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010-\"\u0004\bb\u0010/R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\bc\u0010(\"\u0004\bd\u0010*R\"\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010N\u001a\u0004\be\u0010K\"\u0004\bf\u0010MR\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\bg\u00105\"\u0004\bh\u00107\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "", "originalLanguage", "", "imdbId", "video", "", "title", "backdropPath", "revenue", "", "genres", "", "Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/GenresItem;", "popularity", "", "productionCountries", "Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/ProductionCountriesItem;", "id", "voteCount", "budget", "overview", "originalTitle", "runtime", "posterPath", "spokenLanguages", "Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/SpokenLanguagesItem;", "productionCompanies", "Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/ProductionCompaniesItem;", "releaseDate", "voteAverage", "belongsToCollection", "Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/BelongsToCollection;", "tagline", "adult", "homepage", "status", "isFavorite", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/BelongsToCollection;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAdult", "()Ljava/lang/Boolean;", "setAdult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBackdropPath", "()Ljava/lang/String;", "setBackdropPath", "(Ljava/lang/String;)V", "getBelongsToCollection", "()Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/BelongsToCollection;", "setBelongsToCollection", "(Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/BelongsToCollection;)V", "getBudget", "()Ljava/lang/Long;", "setBudget", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getGenres", "()Ljava/util/List;", "setGenres", "(Ljava/util/List;)V", "getHomepage", "setHomepage", "getId", "setId", "getImdbId", "setImdbId", "setFavorite", "getOriginalLanguage", "setOriginalLanguage", "getOriginalTitle", "setOriginalTitle", "getOverview", "setOverview", "getPopularity", "()Ljava/lang/Float;", "setPopularity", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getPosterPath", "setPosterPath", "getProductionCompanies", "setProductionCompanies", "getProductionCountries", "setProductionCountries", "getReleaseDate", "setReleaseDate", "getRevenue", "setRevenue", "getRuntime", "setRuntime", "getSpokenLanguages", "setSpokenLanguages", "getStatus", "setStatus", "getTagline", "setTagline", "getTitle", "setTitle", "getVideo", "setVideo", "getVoteAverage", "setVoteAverage", "getVoteCount", "setVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/BelongsToCollection;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/madfooatcom/movietestlibrary/data/local/entity/MovieDetailEntity;", "equals", "other", "hashCode", "", "toString", "movietestlibrary_debug"})
public final class MovieDetailEntity {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "original_language")
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private java.lang.String originalLanguage;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "imdb_id")
    @com.google.gson.annotations.SerializedName(value = "imdb_id")
    private java.lang.String imdbId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "video")
    @com.google.gson.annotations.SerializedName(value = "video")
    private java.lang.Boolean video;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "title")
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "backdrop_path")
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private java.lang.String backdropPath;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "revenue")
    @com.google.gson.annotations.SerializedName(value = "revenue")
    private java.lang.Long revenue;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> genres;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "popularity")
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private java.lang.Float popularity;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "production_countries")
    private java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCountriesItem> productionCountries;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = false)
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "vote_count")
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private java.lang.Long voteCount;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "budget")
    @com.google.gson.annotations.SerializedName(value = "budget")
    private java.lang.Long budget;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "overview")
    @com.google.gson.annotations.SerializedName(value = "overview")
    private java.lang.String overview;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "original_title")
    @com.google.gson.annotations.SerializedName(value = "original_title")
    private java.lang.String originalTitle;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "runtime")
    @com.google.gson.annotations.SerializedName(value = "runtime")
    private java.lang.Long runtime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "poster_path")
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private java.lang.String posterPath;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "spoken_languages")
    private java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.SpokenLanguagesItem> spokenLanguages;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "production_companies")
    private java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCompaniesItem> productionCompanies;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "release_date")
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private java.lang.String releaseDate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "vote_average")
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private java.lang.Float voteAverage;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "belongs_to_collection")
    private com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.BelongsToCollection belongsToCollection;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "tagline")
    @com.google.gson.annotations.SerializedName(value = "tagline")
    private java.lang.String tagline;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "adult")
    @com.google.gson.annotations.SerializedName(value = "adult")
    private java.lang.Boolean adult;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "homepage")
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private java.lang.String homepage;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "status")
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "isFavorite")
    private java.lang.Boolean isFavorite;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    public final void setOriginalLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final void setImdbId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVideo() {
        return null;
    }
    
    public final void setVideo(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    public final void setBackdropPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getRevenue() {
        return null;
    }
    
    public final void setRevenue(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getPopularity() {
        return null;
    }
    
    public final void setPopularity(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCountriesItem> getProductionCountries() {
        return null;
    }
    
    public final void setProductionCountries(@org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCountriesItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getVoteCount() {
        return null;
    }
    
    public final void setVoteCount(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getBudget() {
        return null;
    }
    
    public final void setBudget(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    public final void setOriginalTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getRuntime() {
        return null;
    }
    
    public final void setRuntime(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.SpokenLanguagesItem> getSpokenLanguages() {
        return null;
    }
    
    public final void setSpokenLanguages(@org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.SpokenLanguagesItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCompaniesItem> getProductionCompanies() {
        return null;
    }
    
    public final void setProductionCompanies(@org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCompaniesItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getVoteAverage() {
        return null;
    }
    
    public final void setVoteAverage(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.BelongsToCollection getBelongsToCollection() {
        return null;
    }
    
    public final void setBelongsToCollection(@org.jetbrains.annotations.Nullable()
    com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.BelongsToCollection p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTagline() {
        return null;
    }
    
    public final void setTagline(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAdult() {
        return null;
    }
    
    public final void setAdult(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final void setHomepage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFavorite() {
        return null;
    }
    
    public final void setFavorite(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public MovieDetailEntity(@org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.lang.Long revenue, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {com.madfooatcom.movietestlibrary.utils.GenresConverter.class})
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> genres, @org.jetbrains.annotations.Nullable()
    java.lang.Float popularity, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCountriesItem> productionCountries, @org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.Long voteCount, @org.jetbrains.annotations.Nullable()
    java.lang.Long budget, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.Long runtime, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.SpokenLanguagesItem> spokenLanguages, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCompaniesItem> productionCompanies, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.Float voteAverage, @org.jetbrains.annotations.Nullable()
    com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.BelongsToCollection belongsToCollection, @org.jetbrains.annotations.Nullable()
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFavorite) {
        super();
    }
    
    public MovieDetailEntity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCountriesItem> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.SpokenLanguagesItem> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCompaniesItem> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.BelongsToCollection component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity copy(@org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.lang.Long revenue, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {com.madfooatcom.movietestlibrary.utils.GenresConverter.class})
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> genres, @org.jetbrains.annotations.Nullable()
    java.lang.Float popularity, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCountriesItem> productionCountries, @org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.Long voteCount, @org.jetbrains.annotations.Nullable()
    java.lang.Long budget, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.Long runtime, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.SpokenLanguagesItem> spokenLanguages, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.ProductionCompaniesItem> productionCompanies, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.Float voteAverage, @org.jetbrains.annotations.Nullable()
    com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.BelongsToCollection belongsToCollection, @org.jetbrains.annotations.Nullable()
    java.lang.String tagline, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFavorite) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}