package com.tencent.rmonitor.base.p144db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u0010\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/SqliteHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "dbName", "", "factory", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)V", "deleteDBFile", "", "dropAllTables", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onCreate", "onDowngrade", "oldVersion", "", "newVersion", "onUpgrade", "onVersionChange", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public class SqliteHelper extends SQLiteOpenHelper {
    private static final int DB_VERSION = 17;

    @NotNull
    public static final String TAG = "RMonitor_DB";

    @NotNull
    private final Context context;

    @NotNull
    private final String dbName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashMap<String, String> tables = new HashMap<>();

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R-\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/SqliteHelper$Companion;", "", "()V", "DB_VERSION", "", "TAG", "", "tables", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getTables", "()Ljava/util/HashMap;", "getVersion", "registerTable", "", "tableName", "createSql", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getVersion() {
            return 17;
        }

        public final void registerTable(@NotNull String tableName, @NotNull String createSql) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(createSql, "createSql");
            if (tableName.length() <= 0 || createSql.length() <= 0) {
                return;
            }
            getTables().put(tableName, createSql);
        }

        @NotNull
        public final HashMap<String, String> getTables() {
            return SqliteHelper.tables;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SqliteHelper(@NotNull Context context, @NotNull String dbName, @Nullable SQLiteDatabase.CursorFactory cursorFactory) {
        super(context, dbName, cursorFactory, INSTANCE.getVersion());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbName, "dbName");
        this.context = context;
        this.dbName = dbName;
    }

    private final void deleteDBFile() {
        try {
            Logger.INSTANCE.mo77132i(TAG, "deleteDBFile");
            File databasePath = this.context.getDatabasePath(this.dbName);
            Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(dbName)");
            if (databasePath.canWrite()) {
                databasePath.delete();
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, th2);
        }
    }

    private final boolean dropAllTables(SQLiteDatabase db2) {
        try {
            Logger.INSTANCE.mo77132i(TAG, "dropAllTables");
            Iterator<Map.Entry<String, String>> it = tables.entrySet().iterator();
            while (it.hasNext()) {
                db2.execSQL("Drop table if exists " + it.next().getKey());
            }
            return true;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, th2);
            return false;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Iterator<Map.Entry<String, String>> it = tables.entrySet().iterator();
        while (it.hasNext()) {
            db2.execSQL(it.next().getValue());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(@Nullable SQLiteDatabase db2, int oldVersion, int newVersion) {
        if (db2 == null) {
            Logger.INSTANCE.mo77131e(TAG, "onDowngrade, from " + oldVersion + " to " + newVersion + ", db is null.");
            return;
        }
        Logger.INSTANCE.mo77132i(TAG, "onDowngrade, from " + oldVersion + " to " + newVersion);
        onVersionChange(db2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Logger.INSTANCE.mo77132i(TAG, "onUpgrade, from " + oldVersion + " to " + newVersion);
        onVersionChange(db2);
    }

    private final void onVersionChange(SQLiteDatabase db2) {
        if (dropAllTables(db2)) {
            onCreate(db2);
        } else {
            deleteDBFile();
        }
    }
}
