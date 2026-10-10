package com.kubi.home.rank.impl.cache;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p023db.SupportSQLiteDatabase;
import androidx.sqlite.p023db.SupportSQLiteOpenHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public final class RankDatabaseProxy_Impl extends RankDatabaseProxy {

    /* JADX INFO: renamed from: c */
    public volatile IRankDao f26040c;

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.RankDatabaseProxy_Impl$a */
    public class C14773a extends RoomOpenHelper.Delegate {
        public C14773a(int i11) {
            super(i11);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `rank_coin_table` (`rank_coin_key` TEXT NOT NULL, `rank_coin_value` TEXT NOT NULL, PRIMARY KEY(`rank_coin_key`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8c17abdda42d5a1c744d67fcf5e64010')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `rank_coin_table`");
            if (((RoomDatabase) RankDatabaseProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) RankDatabaseProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) RankDatabaseProxy_Impl.this).mCallbacks.get(i11)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) RankDatabaseProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) RankDatabaseProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) RankDatabaseProxy_Impl.this).mCallbacks.get(i11)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) RankDatabaseProxy_Impl.this).mDatabase = supportSQLiteDatabase;
            RankDatabaseProxy_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) RankDatabaseProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) RankDatabaseProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) RankDatabaseProxy_Impl.this).mCallbacks.get(i11)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(2);
            map.put("rank_coin_key", new TableInfo.Column("rank_coin_key", "TEXT", true, 1, null, 1));
            map.put("rank_coin_value", new TableInfo.Column("rank_coin_value", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("rank_coin_table", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "rank_coin_table");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "rank_coin_table(com.kubi.home.rank.impl.cache.RankDBEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `rank_coin_table`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "rank_coin_table");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C14773a(1), "8c17abdda42d5a1c744d67fcf5e64010", "2eaa4d7226016c3106ac0dffd9a708eb")).build());
    }

    @Override // com.kubi.home.rank.impl.cache.RankDatabaseProxy
    /* JADX INFO: renamed from: e */
    public IRankDao mo29948e() {
        IRankDao iRankDao;
        if (this.f26040c != null) {
            return this.f26040c;
        }
        synchronized (this) {
            try {
                if (this.f26040c == null) {
                    this.f26040c = new C14776c(this);
                }
                iRankDao = this.f26040c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iRankDao;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(IRankDao.class, C14776c.m29969c());
        return map;
    }
}
