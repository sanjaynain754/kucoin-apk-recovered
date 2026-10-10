package com.tencent.rmonitor.base.p144db;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/DBHelper;", "Lcom/tencent/rmonitor/base/db/SqliteHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dbHandler", "Lcom/tencent/rmonitor/base/db/DBHandler;", "getDbHandler", "()Lcom/tencent/rmonitor/base/db/DBHandler;", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class DBHelper extends SqliteHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DATABASE_NAME = "rmonitor_db";

    @Nullable
    private static volatile DBHelper helper;

    @NotNull
    private final DBHandler dbHandler;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/DBHelper$Companion;", "", "()V", "DATABASE_NAME", "", "helper", "Lcom/tencent/rmonitor/base/db/DBHelper;", "getInstance", "context", "Landroid/content/Context;", "registerTable", "", "tableName", "createSql", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final DBHelper getInstance(@NotNull Context context) {
            DBHelper dBHelper;
            Intrinsics.checkNotNullParameter(context, "context");
            DBHelper dBHelper2 = DBHelper.helper;
            if (dBHelper2 != null) {
                return dBHelper2;
            }
            synchronized (this) {
                dBHelper = DBHelper.helper;
                if (dBHelper == null) {
                    dBHelper = new DBHelper(context);
                    DBHelper.helper = dBHelper;
                }
            }
            return dBHelper;
        }

        @JvmStatic
        public final void registerTable(@NotNull String tableName, @NotNull String createSql) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(createSql, "createSql");
            SqliteHelper.INSTANCE.registerTable(tableName, createSql);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBHelper(@NotNull Context context) {
        super(context, DATABASE_NAME, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dbHandler = DBHandler.INSTANCE.getInstance(this);
    }

    @JvmStatic
    @NotNull
    public static final DBHelper getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    @JvmStatic
    public static final void registerTable(@NotNull String str, @NotNull String str2) {
        INSTANCE.registerTable(str, str2);
    }

    @NotNull
    public final DBHandler getDbHandler() {
        return this.dbHandler;
    }
}
