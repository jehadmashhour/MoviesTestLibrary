package com.madfooatcom.movietestlibrary.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "tvshowdetail_db")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bs\b\u0087\b\u0018\u00002\u00020\u0001B\u00a1\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0003\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u0010+J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0007H\u00c6\u0003J\u0013\u0010{\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007H\u00c6\u0003J\u0013\u0010|\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010\u007f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007H\u00c6\u0003J\u0014\u0010\u0080\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010dJ\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0014\u0010\u0085\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010&H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010&H\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0014\u0010\u008c\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0014\u0010\u008f\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010dJ\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u00ac\u0003\u0010\u0093\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0012\b\u0003\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00072\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00072\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00072\u0012\b\u0002\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010&H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0094\u0001J\u0015\u0010\u0095\u0001\u001a\u00020&2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005H\u00d6\u0001J\n\u0010\u0098\u0001\u001a\u00020\u0003H\u00d6\u0001R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00101\"\u0004\b5\u00103R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R(\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00101\"\u0004\b9\u00103R \u0010(\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010@\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010*\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010E\u001a\u0004\b*\u0010B\"\u0004\bF\u0010DR(\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u00101\"\u0004\bH\u00103R \u0010\'\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010-\"\u0004\bJ\u0010/R \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010-\"\u0004\bP\u0010/R(\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u00101\"\u0004\bR\u00103R \u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010@\u001a\u0004\bW\u0010=\"\u0004\bX\u0010?R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010@\u001a\u0004\bY\u0010=\"\u0004\bZ\u0010?R(\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u00101\"\u0004\b\\\u00103R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010-\"\u0004\b^\u0010/R \u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010-\"\u0004\b`\u0010/R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010-\"\u0004\bb\u0010/R\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010g\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010-\"\u0004\bi\u0010/R(\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u00101\"\u0004\bk\u00103R(\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u00101\"\u0004\bm\u00103R \u0010)\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010-\"\u0004\bo\u0010/R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010-\"\u0004\bq\u0010/R\"\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010g\u001a\u0004\br\u0010d\"\u0004\bs\u0010fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010@\u001a\u0004\bt\u0010=\"\u0004\bu\u0010?\u00a8\u0006\u0099\u0001"}, d2 = {"Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowDetailEntity;", "", "originalLanguage", "", "numberOfEpisodes", "", "networks", "", "Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/NetworksItem;", "type", "backdropPath", "genres", "Lcom/madfooatcom/movietestlibrary/data/remote/response/movie/detail/GenresItem;", "popularity", "", "id", "numberOfSeasons", "voteCount", "firstAirDate", "overview", "seasons", "Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/SeasonsItem;", "languages", "createdBy", "Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/CreatedByItem;", "lastEpisodeToAir", "Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/LastEpisodeToAir;", "posterPath", "originCountry", "productionCompanies", "Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/ProductionCompaniesItem;", "originalName", "voteAverage", "name", "episodeRunTime", "nextEpisodeToAir", "Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/NextEpisodeToAir;", "inProduction", "", "lastAirDate", "homepage", "status", "isFavorite", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/LastEpisodeToAir;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/NextEpisodeToAir;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBackdropPath", "()Ljava/lang/String;", "setBackdropPath", "(Ljava/lang/String;)V", "getCreatedBy", "()Ljava/util/List;", "setCreatedBy", "(Ljava/util/List;)V", "getEpisodeRunTime", "setEpisodeRunTime", "getFirstAirDate", "setFirstAirDate", "getGenres", "setGenres", "getHomepage", "setHomepage", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getInProduction", "()Ljava/lang/Boolean;", "setInProduction", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setFavorite", "getLanguages", "setLanguages", "getLastAirDate", "setLastAirDate", "getLastEpisodeToAir", "()Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/LastEpisodeToAir;", "setLastEpisodeToAir", "(Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/LastEpisodeToAir;)V", "getName", "setName", "getNetworks", "setNetworks", "getNextEpisodeToAir", "()Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/NextEpisodeToAir;", "setNextEpisodeToAir", "(Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/NextEpisodeToAir;)V", "getNumberOfEpisodes", "setNumberOfEpisodes", "getNumberOfSeasons", "setNumberOfSeasons", "getOriginCountry", "setOriginCountry", "getOriginalLanguage", "setOriginalLanguage", "getOriginalName", "setOriginalName", "getOverview", "setOverview", "getPopularity", "()Ljava/lang/Float;", "setPopularity", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getPosterPath", "setPosterPath", "getProductionCompanies", "setProductionCompanies", "getSeasons", "setSeasons", "getStatus", "setStatus", "getType", "setType", "getVoteAverage", "setVoteAverage", "getVoteCount", "setVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/LastEpisodeToAir;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Lcom/madfooatcom/movietestlibrary/data/remote/response/tvshow/detail/NextEpisodeToAir;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/madfooatcom/movietestlibrary/data/local/entity/TvShowDetailEntity;", "equals", "other", "hashCode", "toString", "movietestlibrary_release"})
public final class TvShowDetailEntity {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private java.lang.String originalLanguage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "number_of_episodes")
    private java.lang.Integer numberOfEpisodes;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "networks")
    private java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NetworksItem> networks;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "type")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private java.lang.String backdropPath;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> genres;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private java.lang.Float popularity;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = false)
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "number_of_seasons")
    private java.lang.Integer numberOfSeasons;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private java.lang.Integer voteCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "first_air_date")
    private java.lang.String firstAirDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "overview")
    private java.lang.String overview;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "seasons")
    private java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.SeasonsItem> seasons;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "languages")
    private java.util.List<java.lang.String> languages;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "created_by")
    private java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.CreatedByItem> createdBy;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "last_episode_to_air")
    private com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.LastEpisodeToAir lastEpisodeToAir;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private java.lang.String posterPath;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "origin_country")
    private java.util.List<java.lang.String> originCountry;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "production_companies")
    private java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.ProductionCompaniesItem> productionCompanies;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "original_name")
    private java.lang.String originalName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private java.lang.Float voteAverage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "episode_run_time")
    private java.util.List<java.lang.Integer> episodeRunTime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "next_episode_to_air")
    private com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NextEpisodeToAir nextEpisodeToAir;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "in_production")
    private java.lang.Boolean inProduction;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "last_air_date")
    private java.lang.String lastAirDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private java.lang.String homepage;
    @org.jetbrains.annotations.Nullable()
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
    public final java.lang.Integer getNumberOfEpisodes() {
        return null;
    }
    
    public final void setNumberOfEpisodes(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NetworksItem> getNetworks() {
        return null;
    }
    
    public final void setNetworks(@org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NetworksItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNumberOfSeasons() {
        return null;
    }
    
    public final void setNumberOfSeasons(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVoteCount() {
        return null;
    }
    
    public final void setVoteCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstAirDate() {
        return null;
    }
    
    public final void setFirstAirDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.SeasonsItem> getSeasons() {
        return null;
    }
    
    public final void setSeasons(@org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.SeasonsItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getLanguages() {
        return null;
    }
    
    public final void setLanguages(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.CreatedByItem> getCreatedBy() {
        return null;
    }
    
    public final void setCreatedBy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.CreatedByItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.LastEpisodeToAir getLastEpisodeToAir() {
        return null;
    }
    
    public final void setLastEpisodeToAir(@org.jetbrains.annotations.Nullable()
    com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.LastEpisodeToAir p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getOriginCountry() {
        return null;
    }
    
    public final void setOriginCountry(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.ProductionCompaniesItem> getProductionCompanies() {
        return null;
    }
    
    public final void setProductionCompanies(@org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.ProductionCompaniesItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalName() {
        return null;
    }
    
    public final void setOriginalName(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getEpisodeRunTime() {
        return null;
    }
    
    public final void setEpisodeRunTime(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NextEpisodeToAir getNextEpisodeToAir() {
        return null;
    }
    
    public final void setNextEpisodeToAir(@org.jetbrains.annotations.Nullable()
    com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NextEpisodeToAir p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getInProduction() {
        return null;
    }
    
    public final void setInProduction(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastAirDate() {
        return null;
    }
    
    public final void setLastAirDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    
    public TvShowDetailEntity(@org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer numberOfEpisodes, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NetworksItem> networks, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {com.madfooatcom.movietestlibrary.utils.GenresConverter.class})
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> genres, @org.jetbrains.annotations.Nullable()
    java.lang.Float popularity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer numberOfSeasons, @org.jetbrains.annotations.Nullable()
    java.lang.Integer voteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String firstAirDate, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.SeasonsItem> seasons, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> languages, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.CreatedByItem> createdBy, @org.jetbrains.annotations.Nullable()
    com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.LastEpisodeToAir lastEpisodeToAir, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> originCountry, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.ProductionCompaniesItem> productionCompanies, @org.jetbrains.annotations.Nullable()
    java.lang.String originalName, @org.jetbrains.annotations.Nullable()
    java.lang.Float voteAverage, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> episodeRunTime, @org.jetbrains.annotations.Nullable()
    com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NextEpisodeToAir nextEpisodeToAir, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean inProduction, @org.jetbrains.annotations.Nullable()
    java.lang.String lastAirDate, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFavorite) {
        super();
    }
    
    public TvShowDetailEntity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NetworksItem> component3() {
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
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.SeasonsItem> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.CreatedByItem> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.LastEpisodeToAir component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.ProductionCompaniesItem> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NextEpisodeToAir component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity copy(@org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer numberOfEpisodes, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NetworksItem> networks, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {com.madfooatcom.movietestlibrary.utils.GenresConverter.class})
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem> genres, @org.jetbrains.annotations.Nullable()
    java.lang.Float popularity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer numberOfSeasons, @org.jetbrains.annotations.Nullable()
    java.lang.Integer voteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String firstAirDate, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.SeasonsItem> seasons, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> languages, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.CreatedByItem> createdBy, @org.jetbrains.annotations.Nullable()
    com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.LastEpisodeToAir lastEpisodeToAir, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> originCountry, @org.jetbrains.annotations.Nullable()
    java.util.List<com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.ProductionCompaniesItem> productionCompanies, @org.jetbrains.annotations.Nullable()
    java.lang.String originalName, @org.jetbrains.annotations.Nullable()
    java.lang.Float voteAverage, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> episodeRunTime, @org.jetbrains.annotations.Nullable()
    com.madfooatcom.movietestlibrary.data.remote.response.tvshow.detail.NextEpisodeToAir nextEpisodeToAir, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean inProduction, @org.jetbrains.annotations.Nullable()
    java.lang.String lastAirDate, @org.jetbrains.annotations.Nullable()
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