package com.kubi.kumex.data;

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
import com.kubi.futures.data.platform.IPlatformDao;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import th.C44976b;

/* JADX INFO: loaded from: classes12.dex */
public final class BKuMexDatabaseProxy_Impl extends BKuMexDatabaseProxy {

    /* JADX INFO: renamed from: c */
    public volatile IPlatformDao f28812c;

    /* JADX INFO: renamed from: com.kubi.kumex.data.BKuMexDatabaseProxy_Impl$a */
    public class C15772a extends RoomOpenHelper.Delegate {
        public C15772a(int i11) {
            super(i11);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `dict` (`dict_key` TEXT NOT NULL, `dict_value` TEXT NOT NULL, PRIMARY KEY(`dict_key`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '814e730968a7c08ce28f95aa73c36b14')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `dict`");
            if (((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mCallbacks.get(i11)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mCallbacks.get(i11)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mDatabase = supportSQLiteDatabase;
            BKuMexDatabaseProxy_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) BKuMexDatabaseProxy_Impl.this).mCallbacks.get(i11)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(2);
            map.put("dict_key", new TableInfo.Column("dict_key", "TEXT", true, 1, null, 1));
            map.put("dict_value", new TableInfo.Column("dict_value", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("dict", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "dict");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "dict(com.kubi.kumex.data.platform.model.DictEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
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
            writableDatabase.execSQL("DELETE FROM `dict`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "dict");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C15772a(1), "814e730968a7c08ce28f95aa73c36b14", "d4d5f7fa5187113df0abfd457257a785")).build());
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(IPlatformDao.class, C44976b.m99453c());
        return map;
    }

    @Override // com.kubi.kumex.data.BKuMexDatabaseProxy
    /* JADX INFO: renamed from: h */
    public IPlatformDao mo33314h() {
        IPlatformDao iPlatformDao;
        if (this.f28812c != null) {
            return this.f28812c;
        }
        synchronized (this) {
            try {
                if (this.f28812c == null) {
                    this.f28812c = new C44976b(this);
                }
                iPlatformDao = this.f28812c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iPlatformDao;
    }
}
