package com.kubi.sdk.log.realtime.p116db;

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
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p519oz.C43339b;
import p519oz.InterfaceC43338a;

/* JADX INFO: loaded from: classes3.dex */
public final class RealLogDBProxy_Impl extends RealLogDBProxy {

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC43338a f46984c;

    /* JADX INFO: renamed from: com.kubi.sdk.log.realtime.db.RealLogDBProxy_Impl$a */
    public class C23884a extends RoomOpenHelper.Delegate {
        public C23884a(int i11) {
            super(i11);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `LogData` (`logId` INTEGER PRIMARY KEY AUTOINCREMENT, `message` TEXT NOT NULL, `type` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `thread` TEXT NOT NULL)");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3c459ecbd34e75a18646d603a067253f')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `LogData`");
            if (((RoomDatabase) RealLogDBProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) RealLogDBProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) RealLogDBProxy_Impl.this).mCallbacks.get(i11)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (((RoomDatabase) RealLogDBProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) RealLogDBProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) RealLogDBProxy_Impl.this).mCallbacks.get(i11)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) RealLogDBProxy_Impl.this).mDatabase = supportSQLiteDatabase;
            RealLogDBProxy_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (((RoomDatabase) RealLogDBProxy_Impl.this).mCallbacks != null) {
                int size = ((RoomDatabase) RealLogDBProxy_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((RoomDatabase.Callback) ((RoomDatabase) RealLogDBProxy_Impl.this).mCallbacks.get(i11)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(5);
            map.put("logId", new TableInfo.Column("logId", "INTEGER", false, 1, null, 1));
            map.put("message", new TableInfo.Column("message", "TEXT", true, 0, null, 1));
            map.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
            map.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
            map.put(InterfaceC33953u5.f72225u, new TableInfo.Column(InterfaceC33953u5.f72225u, "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("LogData", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "LogData");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "LogData(com.kubi.sdk.log.realtime.db.LogData).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
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
            writableDatabase.execSQL("DELETE FROM `LogData`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "LogData");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C23884a(1), "3c459ecbd34e75a18646d603a067253f", "dbfcf9dbd38120c46761b2c3a6ec6e44")).build());
    }

    @Override // com.kubi.sdk.log.realtime.p116db.RealLogDBProxy
    /* JADX INFO: renamed from: d */
    public InterfaceC43338a mo57238d() {
        InterfaceC43338a interfaceC43338a;
        if (this.f46984c != null) {
            return this.f46984c;
        }
        synchronized (this) {
            try {
                if (this.f46984c == null) {
                    this.f46984c = new C43339b(this);
                }
                interfaceC43338a = this.f46984c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC43338a;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC43338a.class, C43339b.m95411g());
        return map;
    }
}
