package com.kubi.sdk.lib.kunlun.sdk.p115db;

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
import p386jz.C40825c;
import p386jz.InterfaceC40824b;

/* JADX INFO: loaded from: classes3.dex */
public final class KunlunEventDBProxy_Impl extends KunlunEventDBProxy {

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC40824b f46932c;

    /* JADX INFO: renamed from: com.kubi.sdk.lib.kunlun.sdk.db.KunlunEventDBProxy_Impl$a */
    public class C23868a extends RoomOpenHelper.Delegate {
        public C23868a(int i11) {
            super(i11);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `KunlunDBEventData` (`eventId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `event` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ede110257e7d8a81e12c30c43519c521')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `KunlunDBEventData`");
            if (((RoomDatabase) KunlunEventDBProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) KunlunEventDBProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) KunlunEventDBProxy_Impl.this).mCallbacks.get(i11)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) KunlunEventDBProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) KunlunEventDBProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) KunlunEventDBProxy_Impl.this).mCallbacks.get(i11)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) KunlunEventDBProxy_Impl.this).mDatabase = supportSQLiteDatabase;
            KunlunEventDBProxy_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) KunlunEventDBProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) KunlunEventDBProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) KunlunEventDBProxy_Impl.this).mCallbacks.get(i11)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(3);
            map.put("eventId", new TableInfo.Column("eventId", "INTEGER", true, 1, null, 1));
            map.put("event", new TableInfo.Column("event", "TEXT", true, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("KunlunDBEventData", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "KunlunDBEventData");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "KunlunDBEventData(com.kubi.sdk.lib.kunlun.sdk.db.KunlunDBEventData).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
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
            writableDatabase.execSQL("DELETE FROM `KunlunDBEventData`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "KunlunDBEventData");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C23868a(1), "ede110257e7d8a81e12c30c43519c521", "996be21642cf41fa585e0703e60877ef")).build());
    }

    @Override // com.kubi.sdk.lib.kunlun.sdk.p115db.KunlunEventDBProxy
    /* JADX INFO: renamed from: d */
    public InterfaceC40824b mo57144d() {
        InterfaceC40824b interfaceC40824b;
        if (this.f46932c != null) {
            return this.f46932c;
        }
        synchronized (this) {
            try {
                if (this.f46932c == null) {
                    this.f46932c = new C40825c(this);
                }
                interfaceC40824b = this.f46932c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC40824b;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC40824b.class, C40825c.m89312e());
        return map;
    }
}
