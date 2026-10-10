package com.tencent.rmonitor.base.meta;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006*"}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/DBMeta;", "Lcom/tencent/rmonitor/base/meta/MonitorMeta;", "processName", "", "threadName", "dbPath", "table", "sql", "explain", "extInfo", "sqlTimeCost", "", TUIConstantDefine.CREATE_TIME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getCreateTime", "()J", "getDbPath", "()Ljava/lang/String;", "getExplain", "getExtInfo", "getProcessName", "getSql", "getSqlTimeCost", "getTable", "getThreadName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class DBMeta extends MonitorMeta {
    private final long createTime;

    @NotNull
    private final String dbPath;

    @NotNull
    private final String explain;

    @NotNull
    private final String extInfo;

    @NotNull
    private final String processName;

    @NotNull
    private final String sql;
    private final long sqlTimeCost;

    @NotNull
    private final String table;

    @NotNull
    private final String threadName;

    public static /* synthetic */ DBMeta copy$default(DBMeta dBMeta, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dBMeta.processName;
        }
        if ((i11 & 2) != 0) {
            str2 = dBMeta.threadName;
        }
        if ((i11 & 4) != 0) {
            str3 = dBMeta.dbPath;
        }
        if ((i11 & 8) != 0) {
            str4 = dBMeta.table;
        }
        if ((i11 & 16) != 0) {
            str5 = dBMeta.sql;
        }
        if ((i11 & 32) != 0) {
            str6 = dBMeta.explain;
        }
        if ((i11 & 64) != 0) {
            str7 = dBMeta.extInfo;
        }
        if ((i11 & 128) != 0) {
            j11 = dBMeta.sqlTimeCost;
        }
        if ((i11 & 256) != 0) {
            j12 = dBMeta.createTime;
        }
        long j13 = j12;
        long j14 = j11;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return dBMeta.copy(str, str2, str11, str4, str10, str8, str9, j14, j13);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBMeta)) {
            return false;
        }
        DBMeta dBMeta = (DBMeta) other;
        return Intrinsics.areEqual(this.processName, dBMeta.processName) && Intrinsics.areEqual(this.threadName, dBMeta.threadName) && Intrinsics.areEqual(this.dbPath, dBMeta.dbPath) && Intrinsics.areEqual(this.table, dBMeta.table) && Intrinsics.areEqual(this.sql, dBMeta.sql) && Intrinsics.areEqual(this.explain, dBMeta.explain) && Intrinsics.areEqual(this.extInfo, dBMeta.extInfo) && this.sqlTimeCost == dBMeta.sqlTimeCost && this.createTime == dBMeta.createTime;
    }

    public DBMeta(@NotNull String processName, @NotNull String threadName, @NotNull String dbPath, @NotNull String table, @NotNull String sql, @NotNull String explain, @NotNull String extInfo, long j11, long j12) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        Intrinsics.checkNotNullParameter(dbPath, "dbPath");
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(explain, "explain");
        Intrinsics.checkNotNullParameter(extInfo, "extInfo");
        this.processName = processName;
        this.threadName = threadName;
        this.dbPath = dbPath;
        this.table = table;
        this.sql = sql;
        this.explain = explain;
        this.extInfo = extInfo;
        this.sqlTimeCost = j11;
        this.createTime = j12;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getThreadName() {
        return this.threadName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDbPath() {
        return this.dbPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTable() {
        return this.table;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSql() {
        return this.sql;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExtInfo() {
        return this.extInfo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getSqlTimeCost() {
        return this.sqlTimeCost;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final DBMeta copy(@NotNull String processName, @NotNull String threadName, @NotNull String dbPath, @NotNull String table, @NotNull String sql, @NotNull String explain, @NotNull String extInfo, long sqlTimeCost, long createTime) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        Intrinsics.checkNotNullParameter(dbPath, "dbPath");
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(explain, "explain");
        Intrinsics.checkNotNullParameter(extInfo, "extInfo");
        return new DBMeta(processName, threadName, dbPath, table, sql, explain, extInfo, sqlTimeCost, createTime);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getDbPath() {
        return this.dbPath;
    }

    @NotNull
    public final String getExplain() {
        return this.explain;
    }

    @NotNull
    public final String getExtInfo() {
        return this.extInfo;
    }

    @NotNull
    public final String getProcessName() {
        return this.processName;
    }

    @NotNull
    public final String getSql() {
        return this.sql;
    }

    public final long getSqlTimeCost() {
        return this.sqlTimeCost;
    }

    @NotNull
    public final String getTable() {
        return this.table;
    }

    @NotNull
    public final String getThreadName() {
        return this.threadName;
    }

    public int hashCode() {
        return Long.hashCode(this.createTime) + ((Long.hashCode(this.sqlTimeCost) + ((this.extInfo.hashCode() + ((this.explain.hashCode() + ((this.sql.hashCode() + ((this.table.hashCode() + ((this.dbPath.hashCode() + ((this.threadName.hashCode() + (this.processName.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DBMeta(processName=" + this.processName + ", threadName=" + this.threadName + ", dbPath=" + this.dbPath + ", table=" + this.table + ", sql=" + this.sql + ", explain=" + this.explain + ", extInfo=" + this.extInfo + ", sqlTimeCost=" + this.sqlTimeCost + ", createTime=" + this.createTime + ')';
    }
}
