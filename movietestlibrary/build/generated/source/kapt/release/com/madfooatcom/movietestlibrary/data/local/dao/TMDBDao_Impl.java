package com.madfooatcom.movietestlibrary.data.local.dao;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity;
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity;
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity;
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity;
import com.madfooatcom.movietestlibrary.data.remote.response.movie.detail.GenresItem;
import com.madfooatcom.movietestlibrary.utils.Converter;
import com.madfooatcom.movietestlibrary.utils.GenresConverter;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TMDBDao_Impl implements TMDBDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  private final EntityInsertionAdapter<TvShowEntity> __insertionAdapterOfTvShowEntity;

  private final EntityInsertionAdapter<MovieDetailEntity> __insertionAdapterOfMovieDetailEntity;

  private final EntityInsertionAdapter<TvShowDetailEntity> __insertionAdapterOfTvShowDetailEntity;

  private final EntityDeletionOrUpdateAdapter<MovieDetailEntity> __updateAdapterOfMovieDetailEntity;

  private final EntityDeletionOrUpdateAdapter<TvShowDetailEntity> __updateAdapterOfTvShowDetailEntity;

  public TMDBDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `now_playingdb` (`overview`,`originalLanguage`,`originalTitle`,`video`,`title`,`genreIds`,`posterPath`,`backdropPath`,`releaseDate`,`popularity`,`voteAverage`,`id`,`adult`,`voteCount`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        if (value.getOverview() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getOverview());
        }
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOriginalLanguage());
        }
        if (value.getOriginalTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOriginalTitle());
        }
        final Integer _tmp;
        _tmp = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        final String _tmp_1;
        _tmp_1 = Converter.listToString(value.getGenreIds());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getBackdropPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getReleaseDate());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getPopularity());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindDouble(11, value.getVoteAverage());
        }
        if (value.getId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, value.getId());
        }
        final Integer _tmp_2;
        _tmp_2 = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, _tmp_2);
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getVoteCount());
        }
      }
    };
    this.__insertionAdapterOfTvShowEntity = new EntityInsertionAdapter<TvShowEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tvshowdb` (`firstAirDate`,`overview`,`originalLanguage`,`genreIds`,`posterPath`,`originCountry`,`backdropPath`,`originalName`,`popularity`,`voteAverage`,`name`,`id`,`voteCount`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvShowEntity value) {
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFirstAirDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOverview());
        }
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOriginalLanguage());
        }
        final String _tmp;
        _tmp = Converter.listToString(value.getGenreIds());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPosterPath());
        }
        final String _tmp_1;
        _tmp_1 = Converter.listToString(value.getOriginCountry());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBackdropPath());
        }
        if (value.getOriginalName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOriginalName());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindDouble(9, value.getPopularity());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getVoteAverage());
        }
        if (value.getName() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getName());
        }
        if (value.getId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, value.getId());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, value.getVoteCount());
        }
      }
    };
    this.__insertionAdapterOfMovieDetailEntity = new EntityInsertionAdapter<MovieDetailEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `moviedetail_db` (`original_language`,`imdb_id`,`video`,`title`,`backdrop_path`,`revenue`,`genres`,`popularity`,`id`,`vote_count`,`budget`,`overview`,`original_title`,`runtime`,`poster_path`,`release_date`,`vote_average`,`tagline`,`adult`,`homepage`,`status`,`isFavorite`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieDetailEntity value) {
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getOriginalLanguage());
        }
        if (value.getImdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImdbId());
        }
        final Integer _tmp;
        _tmp = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBackdropPath());
        }
        if (value.getRevenue() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getRevenue());
        }
        final String _tmp_1;
        _tmp_1 = GenresConverter.ListToJson(value.getGenres());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getPopularity());
        }
        if (value.getId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getId());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getVoteCount());
        }
        if (value.getBudget() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getBudget());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getOverview());
        }
        if (value.getOriginalTitle() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOriginalTitle());
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getRuntime());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getPosterPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getReleaseDate());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindDouble(17, value.getVoteAverage());
        }
        if (value.getTagline() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getTagline());
        }
        final Integer _tmp_2;
        _tmp_2 = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindLong(19, _tmp_2);
        }
        if (value.getHomepage() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getHomepage());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getStatus());
        }
        final Integer _tmp_3;
        _tmp_3 = value.isFavorite() == null ? null : (value.isFavorite() ? 1 : 0);
        if (_tmp_3 == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindLong(22, _tmp_3);
        }
      }
    };
    this.__insertionAdapterOfTvShowDetailEntity = new EntityInsertionAdapter<TvShowDetailEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `tvshowdetail_db` (`originalLanguage`,`numberOfEpisodes`,`type`,`backdropPath`,`genres`,`popularity`,`id`,`numberOfSeasons`,`voteCount`,`firstAirDate`,`overview`,`posterPath`,`originalName`,`voteAverage`,`name`,`inProduction`,`lastAirDate`,`homepage`,`status`,`isFavorite`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvShowDetailEntity value) {
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getOriginalLanguage());
        }
        if (value.getNumberOfEpisodes() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getNumberOfEpisodes());
        }
        if (value.getType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getType());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackdropPath());
        }
        final String _tmp;
        _tmp = GenresConverter.ListToJson(value.getGenres());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getPopularity());
        }
        if (value.getId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getId());
        }
        if (value.getNumberOfSeasons() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getNumberOfSeasons());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getVoteCount());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getFirstAirDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getOverview());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPosterPath());
        }
        if (value.getOriginalName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOriginalName());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindDouble(14, value.getVoteAverage());
        }
        if (value.getName() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getName());
        }
        final Integer _tmp_1;
        _tmp_1 = value.getInProduction() == null ? null : (value.getInProduction() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, _tmp_1);
        }
        if (value.getLastAirDate() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getLastAirDate());
        }
        if (value.getHomepage() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getHomepage());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getStatus());
        }
        final Integer _tmp_2;
        _tmp_2 = value.isFavorite() == null ? null : (value.isFavorite() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindLong(20, _tmp_2);
        }
      }
    };
    this.__updateAdapterOfMovieDetailEntity = new EntityDeletionOrUpdateAdapter<MovieDetailEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `moviedetail_db` SET `original_language` = ?,`imdb_id` = ?,`video` = ?,`title` = ?,`backdrop_path` = ?,`revenue` = ?,`genres` = ?,`popularity` = ?,`id` = ?,`vote_count` = ?,`budget` = ?,`overview` = ?,`original_title` = ?,`runtime` = ?,`poster_path` = ?,`release_date` = ?,`vote_average` = ?,`tagline` = ?,`adult` = ?,`homepage` = ?,`status` = ?,`isFavorite` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieDetailEntity value) {
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getOriginalLanguage());
        }
        if (value.getImdbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImdbId());
        }
        final Integer _tmp;
        _tmp = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBackdropPath());
        }
        if (value.getRevenue() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getRevenue());
        }
        final String _tmp_1;
        _tmp_1 = GenresConverter.ListToJson(value.getGenres());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getPopularity());
        }
        if (value.getId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getId());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getVoteCount());
        }
        if (value.getBudget() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getBudget());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getOverview());
        }
        if (value.getOriginalTitle() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOriginalTitle());
        }
        if (value.getRuntime() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getRuntime());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getPosterPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getReleaseDate());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindDouble(17, value.getVoteAverage());
        }
        if (value.getTagline() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getTagline());
        }
        final Integer _tmp_2;
        _tmp_2 = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindLong(19, _tmp_2);
        }
        if (value.getHomepage() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getHomepage());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getStatus());
        }
        final Integer _tmp_3;
        _tmp_3 = value.isFavorite() == null ? null : (value.isFavorite() ? 1 : 0);
        if (_tmp_3 == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindLong(22, _tmp_3);
        }
        if (value.getId() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindLong(23, value.getId());
        }
      }
    };
    this.__updateAdapterOfTvShowDetailEntity = new EntityDeletionOrUpdateAdapter<TvShowDetailEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tvshowdetail_db` SET `originalLanguage` = ?,`numberOfEpisodes` = ?,`type` = ?,`backdropPath` = ?,`genres` = ?,`popularity` = ?,`id` = ?,`numberOfSeasons` = ?,`voteCount` = ?,`firstAirDate` = ?,`overview` = ?,`posterPath` = ?,`originalName` = ?,`voteAverage` = ?,`name` = ?,`inProduction` = ?,`lastAirDate` = ?,`homepage` = ?,`status` = ?,`isFavorite` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvShowDetailEntity value) {
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getOriginalLanguage());
        }
        if (value.getNumberOfEpisodes() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getNumberOfEpisodes());
        }
        if (value.getType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getType());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackdropPath());
        }
        final String _tmp;
        _tmp = GenresConverter.ListToJson(value.getGenres());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getPopularity());
        }
        if (value.getId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getId());
        }
        if (value.getNumberOfSeasons() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getNumberOfSeasons());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getVoteCount());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getFirstAirDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getOverview());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPosterPath());
        }
        if (value.getOriginalName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOriginalName());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindDouble(14, value.getVoteAverage());
        }
        if (value.getName() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getName());
        }
        final Integer _tmp_1;
        _tmp_1 = value.getInProduction() == null ? null : (value.getInProduction() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, _tmp_1);
        }
        if (value.getLastAirDate() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getLastAirDate());
        }
        if (value.getHomepage() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getHomepage());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getStatus());
        }
        final Integer _tmp_2;
        _tmp_2 = value.isFavorite() == null ? null : (value.isFavorite() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindLong(20, _tmp_2);
        }
        if (value.getId() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindLong(21, value.getId());
        }
      }
    };
  }

  @Override
  public Completable insertMovie(final List<MovieEntity> movie) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(movie);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertTvShow(final List<TvShowEntity> tvShows) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTvShowEntity.insert(tvShows);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertMovieDetail(final MovieDetailEntity movieDetailEntity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieDetailEntity.insert(movieDetailEntity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertTvShowDetail(final TvShowDetailEntity tvShowDetailEntity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTvShowDetailEntity.insert(tvShowDetailEntity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Single<Integer> updateMovieDetail(final MovieDetailEntity movie) {
    return Single.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__updateAdapterOfMovieDetailEntity.handle(movie);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Single<Integer> updateTvShowDetail(final TvShowDetailEntity tvShow) {
    return Single.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__updateAdapterOfTvShowDetailEntity.handle(tvShow);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Observable<List<MovieEntity>> getNowPlayingMovie() {
    final String _sql = "SELECT * FROM now_playingdb";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createObservable(__db, false, new String[]{"now_playingdb"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "originalLanguage");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "originalTitle");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genreIds");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpOriginalLanguage;
            _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOriginalTitle;
            _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            final Boolean _tmpVideo;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp == null ? null : _tmp != 0;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final List<String> _tmpGenreIds;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = Converter.fromStringToList(_tmp_1);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final Float _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            }
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final Boolean _tmpAdult;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp_2 == null ? null : _tmp_2 != 0;
            final Long _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getLong(_cursorIndexOfVoteCount);
            }
            _item = new MovieEntity(_tmpOverview,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpVideo,_tmpTitle,_tmpGenreIds,_tmpPosterPath,_tmpBackdropPath,_tmpReleaseDate,_tmpPopularity,_tmpVoteAverage,_tmpId,_tmpAdult,_tmpVoteCount);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Observable<List<TvShowEntity>> getAllTvShowData() {
    final String _sql = "SELECT * FROM tvshowdb";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createObservable(__db, false, new String[]{"tvshowdb"}, new Callable<List<TvShowEntity>>() {
      @Override
      public List<TvShowEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "firstAirDate");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "originalLanguage");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genreIds");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfOriginCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "originCountry");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfOriginalName = CursorUtil.getColumnIndexOrThrow(_cursor, "originalName");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final List<TvShowEntity> _result = new ArrayList<TvShowEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TvShowEntity _item;
            final String _tmpFirstAirDate;
            _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpOriginalLanguage;
            _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final List<String> _tmpGenreIds;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = Converter.fromStringToList(_tmp);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final List<String> _tmpOriginCountry;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfOriginCountry);
            _tmpOriginCountry = Converter.fromStringToList(_tmp_1);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpOriginalName;
            _tmpOriginalName = _cursor.getString(_cursorIndexOfOriginalName);
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final Float _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final Long _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getLong(_cursorIndexOfVoteCount);
            }
            _item = new TvShowEntity(_tmpFirstAirDate,_tmpOverview,_tmpOriginalLanguage,_tmpGenreIds,_tmpPosterPath,_tmpOriginCountry,_tmpBackdropPath,_tmpOriginalName,_tmpPopularity,_tmpVoteAverage,_tmpName,_tmpId,_tmpVoteCount);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Observable<MovieDetailEntity> getMovieDetail(final String id) {
    final String _sql = "SELECT * FROM moviedetail_db where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return RxRoom.createObservable(__db, false, new String[]{"moviedetail_db"}, new Callable<MovieDetailEntity>() {
      @Override
      public MovieDetailEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(_cursor, "imdb_id");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(_cursor, "revenue");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "budget");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final MovieDetailEntity _result;
          if(_cursor.moveToFirst()) {
            _result = new MovieDetailEntity();
            final String _tmpOriginalLanguage;
            _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            _result.setOriginalLanguage(_tmpOriginalLanguage);
            final String _tmpImdbId;
            _tmpImdbId = _cursor.getString(_cursorIndexOfImdbId);
            _result.setImdbId(_tmpImdbId);
            final Boolean _tmpVideo;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp == null ? null : _tmp != 0;
            _result.setVideo(_tmpVideo);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _result.setTitle(_tmpTitle);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            _result.setBackdropPath(_tmpBackdropPath);
            final Long _tmpRevenue;
            if (_cursor.isNull(_cursorIndexOfRevenue)) {
              _tmpRevenue = null;
            } else {
              _tmpRevenue = _cursor.getLong(_cursorIndexOfRevenue);
            }
            _result.setRevenue(_tmpRevenue);
            final List<GenresItem> _tmpGenres;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfGenres);
            _tmpGenres = GenresConverter.JsonToList(_tmp_1);
            _result.setGenres(_tmpGenres);
            final Float _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getFloat(_cursorIndexOfPopularity);
            }
            _result.setPopularity(_tmpPopularity);
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            _result.setId(_tmpId);
            final Long _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getLong(_cursorIndexOfVoteCount);
            }
            _result.setVoteCount(_tmpVoteCount);
            final Long _tmpBudget;
            if (_cursor.isNull(_cursorIndexOfBudget)) {
              _tmpBudget = null;
            } else {
              _tmpBudget = _cursor.getLong(_cursorIndexOfBudget);
            }
            _result.setBudget(_tmpBudget);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            _result.setOverview(_tmpOverview);
            final String _tmpOriginalTitle;
            _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            _result.setOriginalTitle(_tmpOriginalTitle);
            final Long _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getLong(_cursorIndexOfRuntime);
            }
            _result.setRuntime(_tmpRuntime);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            _result.setPosterPath(_tmpPosterPath);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            _result.setReleaseDate(_tmpReleaseDate);
            final Float _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            }
            _result.setVoteAverage(_tmpVoteAverage);
            final String _tmpTagline;
            _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            _result.setTagline(_tmpTagline);
            final Boolean _tmpAdult;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp_2 == null ? null : _tmp_2 != 0;
            _result.setAdult(_tmpAdult);
            final String _tmpHomepage;
            _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
            _result.setHomepage(_tmpHomepage);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            _result.setStatus(_tmpStatus);
            final Boolean _tmpIsFavorite;
            final Integer _tmp_3;
            if (_cursor.isNull(_cursorIndexOfIsFavorite)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getInt(_cursorIndexOfIsFavorite);
            }
            _tmpIsFavorite = _tmp_3 == null ? null : _tmp_3 != 0;
            _result.setFavorite(_tmpIsFavorite);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Observable<TvShowDetailEntity> getTvShowDetail(final String id) {
    final String _sql = "SELECt * FROM tvshowdetail_db where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return RxRoom.createObservable(__db, false, new String[]{"tvshowdetail_db"}, new Callable<TvShowDetailEntity>() {
      @Override
      public TvShowDetailEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "originalLanguage");
          final int _cursorIndexOfNumberOfEpisodes = CursorUtil.getColumnIndexOrThrow(_cursor, "numberOfEpisodes");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNumberOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "numberOfSeasons");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "firstAirDate");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfOriginalName = CursorUtil.getColumnIndexOrThrow(_cursor, "originalName");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfInProduction = CursorUtil.getColumnIndexOrThrow(_cursor, "inProduction");
          final int _cursorIndexOfLastAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastAirDate");
          final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final TvShowDetailEntity _result;
          if(_cursor.moveToFirst()) {
            _result = new TvShowDetailEntity();
            final String _tmpOriginalLanguage;
            _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            _result.setOriginalLanguage(_tmpOriginalLanguage);
            final Integer _tmpNumberOfEpisodes;
            if (_cursor.isNull(_cursorIndexOfNumberOfEpisodes)) {
              _tmpNumberOfEpisodes = null;
            } else {
              _tmpNumberOfEpisodes = _cursor.getInt(_cursorIndexOfNumberOfEpisodes);
            }
            _result.setNumberOfEpisodes(_tmpNumberOfEpisodes);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            _result.setType(_tmpType);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            _result.setBackdropPath(_tmpBackdropPath);
            final List<GenresItem> _tmpGenres;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfGenres);
            _tmpGenres = GenresConverter.JsonToList(_tmp);
            _result.setGenres(_tmpGenres);
            final Float _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getFloat(_cursorIndexOfPopularity);
            }
            _result.setPopularity(_tmpPopularity);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _result.setId(_tmpId);
            final Integer _tmpNumberOfSeasons;
            if (_cursor.isNull(_cursorIndexOfNumberOfSeasons)) {
              _tmpNumberOfSeasons = null;
            } else {
              _tmpNumberOfSeasons = _cursor.getInt(_cursorIndexOfNumberOfSeasons);
            }
            _result.setNumberOfSeasons(_tmpNumberOfSeasons);
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            _result.setVoteCount(_tmpVoteCount);
            final String _tmpFirstAirDate;
            _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            _result.setFirstAirDate(_tmpFirstAirDate);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            _result.setOverview(_tmpOverview);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            _result.setPosterPath(_tmpPosterPath);
            final String _tmpOriginalName;
            _tmpOriginalName = _cursor.getString(_cursorIndexOfOriginalName);
            _result.setOriginalName(_tmpOriginalName);
            final Float _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            }
            _result.setVoteAverage(_tmpVoteAverage);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _result.setName(_tmpName);
            final Boolean _tmpInProduction;
            final Integer _tmp_1;
            if (_cursor.isNull(_cursorIndexOfInProduction)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(_cursorIndexOfInProduction);
            }
            _tmpInProduction = _tmp_1 == null ? null : _tmp_1 != 0;
            _result.setInProduction(_tmpInProduction);
            final String _tmpLastAirDate;
            _tmpLastAirDate = _cursor.getString(_cursorIndexOfLastAirDate);
            _result.setLastAirDate(_tmpLastAirDate);
            final String _tmpHomepage;
            _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
            _result.setHomepage(_tmpHomepage);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            _result.setStatus(_tmpStatus);
            final Boolean _tmpIsFavorite;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfIsFavorite)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfIsFavorite);
            }
            _tmpIsFavorite = _tmp_2 == null ? null : _tmp_2 != 0;
            _result.setFavorite(_tmpIsFavorite);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public DataSource.Factory<Integer, MovieDetailEntity> getAllMovieFavorite(
      final boolean isFavorite) {
    final String _sql = "SELECT * FROM moviedetail_db where isFavorite = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isFavorite ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    return new DataSource.Factory<Integer, MovieDetailEntity>() {
      @Override
      public LimitOffsetDataSource<MovieDetailEntity> create() {
        return new LimitOffsetDataSource<MovieDetailEntity>(__db, _statement, false , "moviedetail_db") {
          @Override
          protected List<MovieDetailEntity> convertRows(Cursor cursor) {
            final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(cursor, "original_language");
            final int _cursorIndexOfImdbId = CursorUtil.getColumnIndexOrThrow(cursor, "imdb_id");
            final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(cursor, "video");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
            final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(cursor, "backdrop_path");
            final int _cursorIndexOfRevenue = CursorUtil.getColumnIndexOrThrow(cursor, "revenue");
            final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(cursor, "genres");
            final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(cursor, "popularity");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(cursor, "vote_count");
            final int _cursorIndexOfBudget = CursorUtil.getColumnIndexOrThrow(cursor, "budget");
            final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(cursor, "overview");
            final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(cursor, "original_title");
            final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(cursor, "runtime");
            final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(cursor, "poster_path");
            final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(cursor, "release_date");
            final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(cursor, "vote_average");
            final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(cursor, "tagline");
            final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(cursor, "adult");
            final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(cursor, "homepage");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(cursor, "status");
            final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(cursor, "isFavorite");
            final List<MovieDetailEntity> _res = new ArrayList<MovieDetailEntity>(cursor.getCount());
            while(cursor.moveToNext()) {
              final MovieDetailEntity _item;
              _item = new MovieDetailEntity();
              final String _tmpOriginalLanguage;
              _tmpOriginalLanguage = cursor.getString(_cursorIndexOfOriginalLanguage);
              _item.setOriginalLanguage(_tmpOriginalLanguage);
              final String _tmpImdbId;
              _tmpImdbId = cursor.getString(_cursorIndexOfImdbId);
              _item.setImdbId(_tmpImdbId);
              final Boolean _tmpVideo;
              final Integer _tmp_1;
              if (cursor.isNull(_cursorIndexOfVideo)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = cursor.getInt(_cursorIndexOfVideo);
              }
              _tmpVideo = _tmp_1 == null ? null : _tmp_1 != 0;
              _item.setVideo(_tmpVideo);
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              _item.setTitle(_tmpTitle);
              final String _tmpBackdropPath;
              _tmpBackdropPath = cursor.getString(_cursorIndexOfBackdropPath);
              _item.setBackdropPath(_tmpBackdropPath);
              final Long _tmpRevenue;
              if (cursor.isNull(_cursorIndexOfRevenue)) {
                _tmpRevenue = null;
              } else {
                _tmpRevenue = cursor.getLong(_cursorIndexOfRevenue);
              }
              _item.setRevenue(_tmpRevenue);
              final List<GenresItem> _tmpGenres;
              final String _tmp_2;
              _tmp_2 = cursor.getString(_cursorIndexOfGenres);
              _tmpGenres = GenresConverter.JsonToList(_tmp_2);
              _item.setGenres(_tmpGenres);
              final Float _tmpPopularity;
              if (cursor.isNull(_cursorIndexOfPopularity)) {
                _tmpPopularity = null;
              } else {
                _tmpPopularity = cursor.getFloat(_cursorIndexOfPopularity);
              }
              _item.setPopularity(_tmpPopularity);
              final Long _tmpId;
              if (cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = cursor.getLong(_cursorIndexOfId);
              }
              _item.setId(_tmpId);
              final Long _tmpVoteCount;
              if (cursor.isNull(_cursorIndexOfVoteCount)) {
                _tmpVoteCount = null;
              } else {
                _tmpVoteCount = cursor.getLong(_cursorIndexOfVoteCount);
              }
              _item.setVoteCount(_tmpVoteCount);
              final Long _tmpBudget;
              if (cursor.isNull(_cursorIndexOfBudget)) {
                _tmpBudget = null;
              } else {
                _tmpBudget = cursor.getLong(_cursorIndexOfBudget);
              }
              _item.setBudget(_tmpBudget);
              final String _tmpOverview;
              _tmpOverview = cursor.getString(_cursorIndexOfOverview);
              _item.setOverview(_tmpOverview);
              final String _tmpOriginalTitle;
              _tmpOriginalTitle = cursor.getString(_cursorIndexOfOriginalTitle);
              _item.setOriginalTitle(_tmpOriginalTitle);
              final Long _tmpRuntime;
              if (cursor.isNull(_cursorIndexOfRuntime)) {
                _tmpRuntime = null;
              } else {
                _tmpRuntime = cursor.getLong(_cursorIndexOfRuntime);
              }
              _item.setRuntime(_tmpRuntime);
              final String _tmpPosterPath;
              _tmpPosterPath = cursor.getString(_cursorIndexOfPosterPath);
              _item.setPosterPath(_tmpPosterPath);
              final String _tmpReleaseDate;
              _tmpReleaseDate = cursor.getString(_cursorIndexOfReleaseDate);
              _item.setReleaseDate(_tmpReleaseDate);
              final Float _tmpVoteAverage;
              if (cursor.isNull(_cursorIndexOfVoteAverage)) {
                _tmpVoteAverage = null;
              } else {
                _tmpVoteAverage = cursor.getFloat(_cursorIndexOfVoteAverage);
              }
              _item.setVoteAverage(_tmpVoteAverage);
              final String _tmpTagline;
              _tmpTagline = cursor.getString(_cursorIndexOfTagline);
              _item.setTagline(_tmpTagline);
              final Boolean _tmpAdult;
              final Integer _tmp_3;
              if (cursor.isNull(_cursorIndexOfAdult)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = cursor.getInt(_cursorIndexOfAdult);
              }
              _tmpAdult = _tmp_3 == null ? null : _tmp_3 != 0;
              _item.setAdult(_tmpAdult);
              final String _tmpHomepage;
              _tmpHomepage = cursor.getString(_cursorIndexOfHomepage);
              _item.setHomepage(_tmpHomepage);
              final String _tmpStatus;
              _tmpStatus = cursor.getString(_cursorIndexOfStatus);
              _item.setStatus(_tmpStatus);
              final Boolean _tmpIsFavorite;
              final Integer _tmp_4;
              if (cursor.isNull(_cursorIndexOfIsFavorite)) {
                _tmp_4 = null;
              } else {
                _tmp_4 = cursor.getInt(_cursorIndexOfIsFavorite);
              }
              _tmpIsFavorite = _tmp_4 == null ? null : _tmp_4 != 0;
              _item.setFavorite(_tmpIsFavorite);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public DataSource.Factory<Integer, TvShowDetailEntity> getAllTvShowFavorite(
      final boolean isFavorite) {
    final String _sql = "SELECT * FROM tvshowdetail_db where isFavorite = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isFavorite ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    return new DataSource.Factory<Integer, TvShowDetailEntity>() {
      @Override
      public LimitOffsetDataSource<TvShowDetailEntity> create() {
        return new LimitOffsetDataSource<TvShowDetailEntity>(__db, _statement, false , "tvshowdetail_db") {
          @Override
          protected List<TvShowDetailEntity> convertRows(Cursor cursor) {
            final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(cursor, "originalLanguage");
            final int _cursorIndexOfNumberOfEpisodes = CursorUtil.getColumnIndexOrThrow(cursor, "numberOfEpisodes");
            final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(cursor, "type");
            final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(cursor, "backdropPath");
            final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(cursor, "genres");
            final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(cursor, "popularity");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfNumberOfSeasons = CursorUtil.getColumnIndexOrThrow(cursor, "numberOfSeasons");
            final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(cursor, "voteCount");
            final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(cursor, "firstAirDate");
            final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(cursor, "overview");
            final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(cursor, "posterPath");
            final int _cursorIndexOfOriginalName = CursorUtil.getColumnIndexOrThrow(cursor, "originalName");
            final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(cursor, "voteAverage");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final int _cursorIndexOfInProduction = CursorUtil.getColumnIndexOrThrow(cursor, "inProduction");
            final int _cursorIndexOfLastAirDate = CursorUtil.getColumnIndexOrThrow(cursor, "lastAirDate");
            final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(cursor, "homepage");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(cursor, "status");
            final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(cursor, "isFavorite");
            final List<TvShowDetailEntity> _res = new ArrayList<TvShowDetailEntity>(cursor.getCount());
            while(cursor.moveToNext()) {
              final TvShowDetailEntity _item;
              _item = new TvShowDetailEntity();
              final String _tmpOriginalLanguage;
              _tmpOriginalLanguage = cursor.getString(_cursorIndexOfOriginalLanguage);
              _item.setOriginalLanguage(_tmpOriginalLanguage);
              final Integer _tmpNumberOfEpisodes;
              if (cursor.isNull(_cursorIndexOfNumberOfEpisodes)) {
                _tmpNumberOfEpisodes = null;
              } else {
                _tmpNumberOfEpisodes = cursor.getInt(_cursorIndexOfNumberOfEpisodes);
              }
              _item.setNumberOfEpisodes(_tmpNumberOfEpisodes);
              final String _tmpType;
              _tmpType = cursor.getString(_cursorIndexOfType);
              _item.setType(_tmpType);
              final String _tmpBackdropPath;
              _tmpBackdropPath = cursor.getString(_cursorIndexOfBackdropPath);
              _item.setBackdropPath(_tmpBackdropPath);
              final List<GenresItem> _tmpGenres;
              final String _tmp_1;
              _tmp_1 = cursor.getString(_cursorIndexOfGenres);
              _tmpGenres = GenresConverter.JsonToList(_tmp_1);
              _item.setGenres(_tmpGenres);
              final Float _tmpPopularity;
              if (cursor.isNull(_cursorIndexOfPopularity)) {
                _tmpPopularity = null;
              } else {
                _tmpPopularity = cursor.getFloat(_cursorIndexOfPopularity);
              }
              _item.setPopularity(_tmpPopularity);
              final Integer _tmpId;
              if (cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = cursor.getInt(_cursorIndexOfId);
              }
              _item.setId(_tmpId);
              final Integer _tmpNumberOfSeasons;
              if (cursor.isNull(_cursorIndexOfNumberOfSeasons)) {
                _tmpNumberOfSeasons = null;
              } else {
                _tmpNumberOfSeasons = cursor.getInt(_cursorIndexOfNumberOfSeasons);
              }
              _item.setNumberOfSeasons(_tmpNumberOfSeasons);
              final Integer _tmpVoteCount;
              if (cursor.isNull(_cursorIndexOfVoteCount)) {
                _tmpVoteCount = null;
              } else {
                _tmpVoteCount = cursor.getInt(_cursorIndexOfVoteCount);
              }
              _item.setVoteCount(_tmpVoteCount);
              final String _tmpFirstAirDate;
              _tmpFirstAirDate = cursor.getString(_cursorIndexOfFirstAirDate);
              _item.setFirstAirDate(_tmpFirstAirDate);
              final String _tmpOverview;
              _tmpOverview = cursor.getString(_cursorIndexOfOverview);
              _item.setOverview(_tmpOverview);
              final String _tmpPosterPath;
              _tmpPosterPath = cursor.getString(_cursorIndexOfPosterPath);
              _item.setPosterPath(_tmpPosterPath);
              final String _tmpOriginalName;
              _tmpOriginalName = cursor.getString(_cursorIndexOfOriginalName);
              _item.setOriginalName(_tmpOriginalName);
              final Float _tmpVoteAverage;
              if (cursor.isNull(_cursorIndexOfVoteAverage)) {
                _tmpVoteAverage = null;
              } else {
                _tmpVoteAverage = cursor.getFloat(_cursorIndexOfVoteAverage);
              }
              _item.setVoteAverage(_tmpVoteAverage);
              final String _tmpName;
              _tmpName = cursor.getString(_cursorIndexOfName);
              _item.setName(_tmpName);
              final Boolean _tmpInProduction;
              final Integer _tmp_2;
              if (cursor.isNull(_cursorIndexOfInProduction)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = cursor.getInt(_cursorIndexOfInProduction);
              }
              _tmpInProduction = _tmp_2 == null ? null : _tmp_2 != 0;
              _item.setInProduction(_tmpInProduction);
              final String _tmpLastAirDate;
              _tmpLastAirDate = cursor.getString(_cursorIndexOfLastAirDate);
              _item.setLastAirDate(_tmpLastAirDate);
              final String _tmpHomepage;
              _tmpHomepage = cursor.getString(_cursorIndexOfHomepage);
              _item.setHomepage(_tmpHomepage);
              final String _tmpStatus;
              _tmpStatus = cursor.getString(_cursorIndexOfStatus);
              _item.setStatus(_tmpStatus);
              final Boolean _tmpIsFavorite;
              final Integer _tmp_3;
              if (cursor.isNull(_cursorIndexOfIsFavorite)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = cursor.getInt(_cursorIndexOfIsFavorite);
              }
              _tmpIsFavorite = _tmp_3 == null ? null : _tmp_3 != 0;
              _item.setFavorite(_tmpIsFavorite);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }
}
