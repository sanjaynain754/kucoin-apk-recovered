package com.tencent.rmonitor.base.p144db;

import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&J\"\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH&¨\u0006\u000e"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/BaseTable;", "", "tableName", "", "createTableSql", "(Ljava/lang/String;Ljava/lang/String;)V", "insert", "", "dataBase", "Landroid/database/sqlite/SQLiteDatabase;", "block", "Lkotlin/Function0;", FirebaseAnalytics.Event.SEARCH, "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public abstract class BaseTable {

    @NotNull
    public static final String COLUMN_OCCUR_TIME = "occur_time";

    @NotNull
    public static final String COLUMN_STATUS = "status";
    public static final int DATA_OVER_TIME = 259200000;
    public static final int INSERT_FAIL_RET = -1;

    public abstract int insert(@NotNull SQLiteDatabase dataBase, @NotNull Function0<Integer> block);

    @Nullable
    public abstract Object search(@NotNull SQLiteDatabase dataBase, @NotNull Function0<? extends Object> block);

    public BaseTable(@NotNull String tableName, @NotNull String createTableSql) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(createTableSql, "createTableSql");
        DBHelper.INSTANCE.registerTable(tableName, createTableSql);
    }
}
