package com.tencent.rmonitor.base.p144db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.AttaEventTable;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.base.p144db.table.LinkDataTable;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.rmonitor.base.p144db.table.TrafficInfoTable;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 52\u00020\u0001:\u00015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ-\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bJ\u0006\u0010\u001c\u001a\u00020\fJy\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00132\b\u0010 \u001a\u0004\u0018\u00010\u00102\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00132\b\b\u0002\u0010\"\u001a\u00020\u00172\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+J \u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\u0017\u0010-\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bH\u0082\bJ\u001b\u0010.\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bH\u0082\bJ\u001e\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00100\u001a\u00020+2\u0006\u00101\u001a\u000202J\u001e\u00103\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00101\u001a\u0002022\u0006\u00104\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u00066"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/DBHandler;", "", "()V", "database", "Landroid/database/sqlite/SQLiteDatabase;", "dbHelper", "Lcom/tencent/rmonitor/base/db/DBHelper;", "getDbHelper", "()Lcom/tencent/rmonitor/base/db/DBHelper;", "setDbHelper", "(Lcom/tencent/rmonitor/base/db/DBHelper;)V", "close", "", "delete", "", "table", "", "whereClause", "whereArgs", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I", "deleteAllSentOrOverTime", "overTime", "", "insert", "Lcom/tencent/rmonitor/base/db/BaseTable;", "block", "Lkotlin/Function0;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "columns", "selection", "selectionArgs", "distinct", "groupBy", "having", "orderBy", TUIConstants.TUIContact.LIMIT, "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "replace", "nullColumnHack", "contentValues", "Landroid/content/ContentValues;", FirebaseAnalytics.Event.SEARCH, "sql", "sqlSearch", "update", "cv", "id", "", "updateStatus", "status", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class DBHandler {
    public static final int DB_ERROR = -1;
    public static final int DB_NO_OPEN = -2;

    @NotNull
    private static final String TAG = "RMonitor_db_persist_DBHandler";

    @Nullable
    private static volatile DBHandler handler;

    @Nullable
    private SQLiteDatabase database;

    @Nullable
    private DBHelper dbHelper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<String> TABLES = CollectionsKt.arrayListOf(DropFrameTable.INSTANCE.getTableName(), ReportDataTable.INSTANCE.getTableName(), AttaEventTable.INSTANCE.getTableName(), TrafficInfoTable.INSTANCE.getTableName(), LinkDataTable.INSTANCE.getTableName());

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/DBHandler$Companion;", "", "()V", "DB_ERROR", "", "DB_NO_OPEN", "TABLES", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getTABLES", "()Ljava/util/ArrayList;", "TAG", "handler", "Lcom/tencent/rmonitor/base/db/DBHandler;", "getInstance", "dbHelper", "Lcom/tencent/rmonitor/base/db/DBHelper;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final DBHandler getInstance(@NotNull DBHelper dbHelper) {
            DBHandler dBHandler;
            Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
            DBHandler dBHandler2 = DBHandler.handler;
            if (dBHandler2 != null) {
                return dBHandler2;
            }
            synchronized (this) {
                dBHandler = DBHandler.handler;
                if (dBHandler == null) {
                    dBHandler = new DBHandler(null);
                    DBHandler.handler = dBHandler;
                    dBHandler.setDbHelper(dbHelper);
                    dBHandler.open();
                }
            }
            return dBHandler;
        }

        @NotNull
        public final ArrayList<String> getTABLES() {
            return DBHandler.TABLES;
        }
    }

    public /* synthetic */ DBHandler(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DBHandler() {
    }

    private final int sql(Function0<Integer> block) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            return -2;
        }
        if (sQLiteDatabase != null && !sQLiteDatabase.isOpen()) {
            return -2;
        }
        try {
            return block.invoke().intValue();
        } catch (Exception e11) {
            Logger.INSTANCE.exception(TAG, e11);
            return -1;
        }
    }

    private final Object sqlSearch(Function0<? extends Object> block) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null && (sQLiteDatabase == null || sQLiteDatabase.isOpen())) {
            try {
                return block.invoke();
            } catch (Exception e11) {
                Logger.INSTANCE.exception(TAG, e11);
            }
        }
        return null;
    }

    public final void close() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        sQLiteDatabase.close();
        handler = null;
    }

    public final int delete(@NotNull String table, @Nullable String whereClause, @Nullable String[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return -2;
        }
        try {
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                return sQLiteDatabase2.delete(table, whereClause, whereArgs);
            }
            return 0;
        } catch (Exception e11) {
            Logger.INSTANCE.exception(TAG, e11);
            return -1;
        }
    }

    public final int deleteAllSentOrOverTime(@NotNull String table, boolean overTime) {
        Intrinsics.checkNotNullParameter(table, "table");
        if (!overTime) {
            return delete(table, "status=?", new String[]{String.valueOf(DBDataStatus.SENT.getValue())});
        }
        return delete(table, "status=? OR occur_time<?", new String[]{String.valueOf(DBDataStatus.SENT.getValue()), String.valueOf(System.currentTimeMillis() - ((long) 259200000))});
    }

    @Nullable
    public final DBHelper getDbHelper() {
        return this.dbHelper;
    }

    public final int insert(@NotNull BaseTable table, @NotNull Function0<Integer> block) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(block, "block");
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return -2;
        }
        try {
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                return table.insert(sQLiteDatabase2, block);
            }
            return -2;
        } catch (Exception e11) {
            Logger.INSTANCE.exception(TAG, e11);
            return -1;
        }
    }

    public final void open() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            try {
                DBHelper dBHelper = this.dbHelper;
                this.database = dBHelper != null ? dBHelper.getWritableDatabase() : null;
            } catch (SQLiteException e11) {
                Logger.INSTANCE.exception(TAG, e11);
            }
        }
    }

    @Nullable
    public final Cursor query(@NotNull String table, @Nullable String[] columns, @Nullable String selection, @Nullable String[] selectionArgs, boolean distinct, @Nullable String groupBy, @Nullable String having, @Nullable String orderBy, @Nullable String limit) {
        Intrinsics.checkNotNullParameter(table, "table");
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                SQLiteDatabase sQLiteDatabase2 = this.database;
                if (sQLiteDatabase2 != null) {
                    return sQLiteDatabase2.query(distinct, table, columns, selection, selectionArgs, groupBy, having, orderBy, limit);
                }
            } catch (Exception e11) {
                Logger.INSTANCE.exception(TAG, e11);
            }
        }
        return null;
    }

    public final int replace(@NotNull String table, @NotNull String nullColumnHack, @NotNull ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(nullColumnHack, "nullColumnHack");
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return -2;
        }
        try {
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                return (int) sQLiteDatabase2.replace(table, nullColumnHack, contentValues);
            }
            return -2;
        } catch (Exception e11) {
            Logger.INSTANCE.exception(TAG, e11);
            return -1;
        }
    }

    @Nullable
    public final Object search(@NotNull BaseTable table, @NotNull Function0<? extends Object> block) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(block, "block");
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                SQLiteDatabase sQLiteDatabase2 = this.database;
                if (sQLiteDatabase2 != null) {
                    return table.search(sQLiteDatabase2, block);
                }
            } catch (Exception e11) {
                Logger.INSTANCE.exception(TAG, e11);
            }
        }
        return null;
    }

    public final void setDbHelper(@Nullable DBHelper dBHelper) {
        this.dbHelper = dBHelper;
    }

    public final int update(@NotNull String table, @NotNull ContentValues cv2, long id2) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(cv2, "cv");
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return -2;
        }
        try {
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                return sQLiteDatabase2.update(table, cv2, "_id=?", new String[]{String.valueOf(id2)});
            }
            return 0;
        } catch (Exception e11) {
            Logger.INSTANCE.exception(TAG, e11);
            return -1;
        }
    }

    public final int updateStatus(@NotNull String table, long id2, int status) {
        Intrinsics.checkNotNullParameter(table, "table");
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return -2;
        }
        try {
            if (status != DBDataStatus.TO_SEND.getValue() && status != DBDataStatus.SENT.getValue() && status != DBDataStatus.SENT_FAIL.getValue()) {
                return -1;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(status));
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                return sQLiteDatabase2.update(table, contentValues, "_id=?", new String[]{String.valueOf(id2)});
            }
            return 0;
        } catch (Exception e11) {
            Logger.INSTANCE.exception(TAG, e11);
            return -1;
        }
    }
}
