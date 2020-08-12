package com.madfooatcom.movietestlibrary.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.madfooatcom.movietestlibrary.data.local.dao.TMDBDao;
import com.madfooatcom.movietestlibrary.data.local.dao.TMDBDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TMDBdb_Impl extends TMDBdb {
  private volatile TMDBDao _tMDBDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `now_playingdb` (`overview` TEXT, `originalLanguage` TEXT, `originalTitle` TEXT, `video` INTEGER, `title` TEXT, `genreIds` TEXT NOT NULL, `posterPath` TEXT, `backdropPath` TEXT, `releaseDate` TEXT, `popularity` REAL, `voteAverage` REAL, `id` INTEGER, `adult` INTEGER, `voteCount` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tvshowdb` (`firstAirDate` TEXT, `overview` TEXT, `originalLanguage` TEXT, `genreIds` TEXT NOT NULL, `posterPath` TEXT, `originCountry` TEXT NOT NULL, `backdropPath` TEXT, `originalName` TEXT, `popularity` REAL, `voteAverage` REAL, `name` TEXT, `id` INTEGER, `voteCount` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `moviedetail_db` (`original_language` TEXT, `imdb_id` TEXT, `video` INTEGER, `title` TEXT, `backdrop_path` TEXT, `revenue` INTEGER, `genres` TEXT, `popularity` REAL, `id` INTEGER, `vote_count` INTEGER, `budget` INTEGER, `overview` TEXT, `original_title` TEXT, `runtime` INTEGER, `poster_path` TEXT, `release_date` TEXT, `vote_average` REAL, `tagline` TEXT, `adult` INTEGER, `homepage` TEXT, `status` TEXT, `isFavorite` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tvshowdetail_db` (`originalLanguage` TEXT, `numberOfEpisodes` INTEGER, `type` TEXT, `backdropPath` TEXT, `genres` TEXT, `popularity` REAL, `id` INTEGER, `numberOfSeasons` INTEGER, `voteCount` INTEGER, `firstAirDate` TEXT, `overview` TEXT, `posterPath` TEXT, `originalName` TEXT, `voteAverage` REAL, `name` TEXT, `inProduction` INTEGER, `lastAirDate` TEXT, `homepage` TEXT, `status` TEXT, `isFavorite` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0933f0e7c2fea35c995a82043d9a3fa2')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `now_playingdb`");
        _db.execSQL("DROP TABLE IF EXISTS `tvshowdb`");
        _db.execSQL("DROP TABLE IF EXISTS `moviedetail_db`");
        _db.execSQL("DROP TABLE IF EXISTS `tvshowdetail_db`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNowPlayingdb = new HashMap<String, TableInfo.Column>(14);
        _columnsNowPlayingdb.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("originalLanguage", new TableInfo.Column("originalLanguage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("originalTitle", new TableInfo.Column("originalTitle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("video", new TableInfo.Column("video", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("genreIds", new TableInfo.Column("genreIds", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("adult", new TableInfo.Column("adult", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNowPlayingdb.put("voteCount", new TableInfo.Column("voteCount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNowPlayingdb = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNowPlayingdb = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNowPlayingdb = new TableInfo("now_playingdb", _columnsNowPlayingdb, _foreignKeysNowPlayingdb, _indicesNowPlayingdb);
        final TableInfo _existingNowPlayingdb = TableInfo.read(_db, "now_playingdb");
        if (! _infoNowPlayingdb.equals(_existingNowPlayingdb)) {
          return new RoomOpenHelper.ValidationResult(false, "now_playingdb(com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity).\n"
                  + " Expected:\n" + _infoNowPlayingdb + "\n"
                  + " Found:\n" + _existingNowPlayingdb);
        }
        final HashMap<String, TableInfo.Column> _columnsTvshowdb = new HashMap<String, TableInfo.Column>(13);
        _columnsTvshowdb.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("originalLanguage", new TableInfo.Column("originalLanguage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("genreIds", new TableInfo.Column("genreIds", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("originCountry", new TableInfo.Column("originCountry", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("originalName", new TableInfo.Column("originalName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdb.put("voteCount", new TableInfo.Column("voteCount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTvshowdb = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTvshowdb = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTvshowdb = new TableInfo("tvshowdb", _columnsTvshowdb, _foreignKeysTvshowdb, _indicesTvshowdb);
        final TableInfo _existingTvshowdb = TableInfo.read(_db, "tvshowdb");
        if (! _infoTvshowdb.equals(_existingTvshowdb)) {
          return new RoomOpenHelper.ValidationResult(false, "tvshowdb(com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity).\n"
                  + " Expected:\n" + _infoTvshowdb + "\n"
                  + " Found:\n" + _existingTvshowdb);
        }
        final HashMap<String, TableInfo.Column> _columnsMoviedetailDb = new HashMap<String, TableInfo.Column>(22);
        _columnsMoviedetailDb.put("original_language", new TableInfo.Column("original_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("imdb_id", new TableInfo.Column("imdb_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("video", new TableInfo.Column("video", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("revenue", new TableInfo.Column("revenue", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("vote_count", new TableInfo.Column("vote_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("budget", new TableInfo.Column("budget", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("original_title", new TableInfo.Column("original_title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("runtime", new TableInfo.Column("runtime", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("release_date", new TableInfo.Column("release_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("vote_average", new TableInfo.Column("vote_average", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("tagline", new TableInfo.Column("tagline", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("adult", new TableInfo.Column("adult", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("homepage", new TableInfo.Column("homepage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviedetailDb.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMoviedetailDb = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMoviedetailDb = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMoviedetailDb = new TableInfo("moviedetail_db", _columnsMoviedetailDb, _foreignKeysMoviedetailDb, _indicesMoviedetailDb);
        final TableInfo _existingMoviedetailDb = TableInfo.read(_db, "moviedetail_db");
        if (! _infoMoviedetailDb.equals(_existingMoviedetailDb)) {
          return new RoomOpenHelper.ValidationResult(false, "moviedetail_db(com.madfooatcom.movietestlibrary.data.local.entity.MovieDetailEntity).\n"
                  + " Expected:\n" + _infoMoviedetailDb + "\n"
                  + " Found:\n" + _existingMoviedetailDb);
        }
        final HashMap<String, TableInfo.Column> _columnsTvshowdetailDb = new HashMap<String, TableInfo.Column>(20);
        _columnsTvshowdetailDb.put("originalLanguage", new TableInfo.Column("originalLanguage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("numberOfEpisodes", new TableInfo.Column("numberOfEpisodes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("numberOfSeasons", new TableInfo.Column("numberOfSeasons", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("voteCount", new TableInfo.Column("voteCount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("originalName", new TableInfo.Column("originalName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("inProduction", new TableInfo.Column("inProduction", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("lastAirDate", new TableInfo.Column("lastAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("homepage", new TableInfo.Column("homepage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTvshowdetailDb.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTvshowdetailDb = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTvshowdetailDb = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTvshowdetailDb = new TableInfo("tvshowdetail_db", _columnsTvshowdetailDb, _foreignKeysTvshowdetailDb, _indicesTvshowdetailDb);
        final TableInfo _existingTvshowdetailDb = TableInfo.read(_db, "tvshowdetail_db");
        if (! _infoTvshowdetailDb.equals(_existingTvshowdetailDb)) {
          return new RoomOpenHelper.ValidationResult(false, "tvshowdetail_db(com.madfooatcom.movietestlibrary.data.local.entity.TvShowDetailEntity).\n"
                  + " Expected:\n" + _infoTvshowdetailDb + "\n"
                  + " Found:\n" + _existingTvshowdetailDb);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "0933f0e7c2fea35c995a82043d9a3fa2", "8967ff90c1906ec36a8a9bb3a5cff065");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "now_playingdb","tvshowdb","moviedetail_db","tvshowdetail_db");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `now_playingdb`");
      _db.execSQL("DELETE FROM `tvshowdb`");
      _db.execSQL("DELETE FROM `moviedetail_db`");
      _db.execSQL("DELETE FROM `tvshowdetail_db`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TMDBDao tmdbDao() {
    if (_tMDBDao != null) {
      return _tMDBDao;
    } else {
      synchronized(this) {
        if(_tMDBDao == null) {
          _tMDBDao = new TMDBDao_Impl(this);
        }
        return _tMDBDao;
      }
    }
  }
}
