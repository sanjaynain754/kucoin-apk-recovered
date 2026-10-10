package com.tencent.rmonitor.base.p144db.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.p144db.BaseTable;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001*B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\tB\u0005¢\u0006\u0002\u0010\nJ\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J,\u0010\u0016\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00180\u00172\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aJ\u001c\u0010\u001c\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00180\u0017J\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001aH\u0016J\b\u0010!\u001a\u0004\u0018\u00010\"J\"\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aH\u0016J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000eJ\u0016\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/ReportDataTable;", "Lcom/tencent/rmonitor/base/db/BaseTable;", "pId", "", "processName", "version", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/reporter/data/ReportData;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "endTime", "", "insertStatus", "Lcom/tencent/rmonitor/base/db/DBDataStatus;", "productId", "startTime", "cursorToResultObject", InterfaceC33953u5.f72198E, "Landroid/database/Cursor;", "getEventTime", "data", "getSelectionAndArgs", "Lkotlin/Pair;", "", "block", "Lkotlin/Function0;", "", "getWhereAndArgs", "insert", "", "dataBase", "Landroid/database/sqlite/SQLiteDatabase;", "makeContentValues", "Landroid/content/ContentValues;", FirebaseAnalytics.Event.SEARCH, "setInsertStatus", "", "status", "setSearchRange", "start", "end", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ReportDataTable extends BaseTable {

    @NotNull
    public static final String COLUMN_ID = "_id";

    @NotNull
    public static final String COLUMN_IS_REAL_TIME = "is_real_time";

    @NotNull
    public static final String COLUMN_PARAMS = "params";

    @NotNull
    public static final String COLUMN_PROCESS_NAME = "process_name";

    @NotNull
    public static final String COLUMN_PRODUCT_ID = "p_id";

    @NotNull
    public static final String COLUMN_REPORT_TYPE = "report_type";

    @NotNull
    public static final String COLUMN_UIN = "uin";

    @NotNull
    public static final String COLUMN_VERSION = "version";

    @NotNull
    private static final String CREATE_REPORT_DATA_TABLE = "CREATE TABLE report_data (_id INTEGER PRIMARY KEY AUTOINCREMENT,process_name TEXT,p_id TEXT,version TEXT,report_type TINYINT,params TEXT,is_real_time TINYINT,uin TEXT,status TINYINT,occur_time BIGINT);";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int SEARCH_TYPE_ALL = 0;
    public static final int SEARCH_TYPE_NONE_SEND_VALID = 1;
    public static final int SEARCH_TYPE_RANGE = 2;

    @NotNull
    public static final String TABLE_REPORT_DATA = "report_data";

    @NotNull
    private static final String TAG = "RMonitor_base_ReportDataTable";
    private long endTime;

    @NotNull
    private DBDataStatus insertStatus;

    @NotNull
    private String processName;

    @NotNull
    private String productId;

    @Nullable
    private ReportData reportData;
    private long startTime;

    @NotNull
    private String version;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/ReportDataTable$Companion;", "", "()V", "COLUMN_ID", "", "COLUMN_IS_REAL_TIME", "COLUMN_PARAMS", "COLUMN_PROCESS_NAME", "COLUMN_PRODUCT_ID", "COLUMN_REPORT_TYPE", "COLUMN_UIN", "COLUMN_VERSION", "CREATE_REPORT_DATA_TABLE", "SEARCH_TYPE_ALL", "", "SEARCH_TYPE_NONE_SEND_VALID", "SEARCH_TYPE_RANGE", "TABLE_REPORT_DATA", "TAG", "getTableName", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String getTableName() {
            return ReportDataTable.TABLE_REPORT_DATA;
        }
    }

    public ReportDataTable() {
        super(TABLE_REPORT_DATA, CREATE_REPORT_DATA_TABLE);
        this.processName = "";
        this.productId = "";
        this.version = "";
        this.insertStatus = DBDataStatus.TO_SEND;
    }

    static {
        new ReportDataTable();
    }

    private final ReportData cursorToResultObject(Cursor cursor) throws JSONException {
        if (cursor == null) {
            return null;
        }
        ReportData reportData = new ReportData(BaseInfo.userMeta.uin, 0, null, null, 14, null);
        reportData.setDbId(cursor.getInt(cursor.getColumnIndex("_id")));
        reportData.setReportType(cursor.getInt(cursor.getColumnIndex("report_type")));
        String string = cursor.getString(cursor.getColumnIndex("uin"));
        Intrinsics.checkNotNullExpressionValue(string, "it.getString(it.getColumnIndex(COLUMN_UIN))");
        reportData.setUin(string);
        String string2 = cursor.getString(cursor.getColumnIndex(COLUMN_PARAMS));
        if (string2 != null && string2.length() > 0) {
            try {
                reportData.setParams(new JSONObject(string2));
            } catch (Throwable unused) {
            }
        }
        return reportData;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    @NotNull
    public final Pair<String, String[]> getSelectionAndArgs(@NotNull Function0<? extends Object> block) {
        char c11;
        String[] strArr;
        String str;
        String[] strArr2;
        String str2;
        Intrinsics.checkNotNullParameter(block, "block");
        Object objInvoke = block.invoke();
        if (Intrinsics.areEqual(objInvoke, Boolean.TRUE)) {
            c11 = 1;
        } else if (Intrinsics.areEqual(objInvoke, Boolean.FALSE)) {
            c11 = 0;
        } else if (Intrinsics.areEqual(objInvoke, (Object) 1)) {
            c11 = 1;
        } else if (!Intrinsics.areEqual(objInvoke, (Object) 0) && Intrinsics.areEqual(objInvoke, (Object) 2)) {
            c11 = 2;
        } else {
            c11 = 0;
        }
        if (c11 == 0) {
            strArr = new String[]{this.processName, this.productId};
            str = "process_name=? and p_id=?";
        } else {
            if (c11 != 1) {
                if (c11 != 2) {
                    str2 = null;
                    strArr2 = null;
                } else {
                    strArr = new String[]{this.processName, this.productId, String.valueOf(this.startTime), String.valueOf(this.endTime)};
                    str = "process_name=? and p_id=? and occur_time>=? and occur_time<=?";
                }
                return new Pair<>(str2, strArr2);
            }
            strArr = new String[]{this.processName, this.productId, String.valueOf(DBDataStatus.SENT.getValue()), String.valueOf(System.currentTimeMillis() - ((long) 259200000))};
            str = "process_name=? and p_id=? and status!=? and occur_time>=?";
        }
        String str3 = str;
        strArr2 = strArr;
        str2 = str3;
        return new Pair<>(str2, strArr2);
    }

    @NotNull
    public final Pair<String, String[]> getWhereAndArgs() {
        String[] strArr;
        String str;
        ReportData reportData = this.reportData;
        if (reportData != null) {
            strArr = new String[]{String.valueOf(reportData.getDbId())};
            str = "_id = ?";
        } else {
            strArr = null;
            str = null;
        }
        return new Pair<>(str, strArr);
    }

    @Override // com.tencent.rmonitor.base.p144db.BaseTable
    public int insert(@NotNull SQLiteDatabase dataBase, @NotNull Function0<Integer> block) {
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        Intrinsics.checkNotNullParameter(block, "block");
        ContentValues contentValuesMakeContentValues = makeContentValues();
        if (contentValuesMakeContentValues == null) {
            return -1;
        }
        return (int) dataBase.insert(TABLE_REPORT_DATA, "name", contentValuesMakeContentValues);
    }

    @Nullable
    public final ContentValues makeContentValues() {
        ReportData reportData = this.reportData;
        if (reportData == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("process_name", this.processName);
        contentValues.put(COLUMN_PRODUCT_ID, this.productId);
        contentValues.put("version", this.version);
        contentValues.put("report_type", Integer.valueOf(reportData.getReportType()));
        contentValues.put(COLUMN_PARAMS, reportData.getParams().toString());
        contentValues.put(COLUMN_IS_REAL_TIME, Boolean.FALSE);
        contentValues.put("uin", reportData.getUin());
        contentValues.put("status", Integer.valueOf(this.insertStatus.getValue()));
        contentValues.put(BaseTable.COLUMN_OCCUR_TIME, Long.valueOf(getEventTime(reportData)));
        return contentValues;
    }

    @Override // com.tencent.rmonitor.base.p144db.BaseTable
    @Nullable
    public Object search(@NotNull SQLiteDatabase dataBase, @NotNull Function0<? extends Object> block) {
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = new ArrayList();
        try {
            Pair<String, String[]> selectionAndArgs = getSelectionAndArgs(block);
            Cursor cursorQuery = dataBase.query(TABLE_REPORT_DATA, null, selectionAndArgs.getFirst(), selectionAndArgs.getSecond(), null, null, null);
            if (cursorQuery != null) {
                try {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        ReportData reportDataCursorToResultObject = cursorToResultObject(cursorQuery);
                        if (reportDataCursorToResultObject != null) {
                            arrayList.add(reportDataCursorToResultObject);
                        }
                        cursorQuery.moveToNext();
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery, null);
                    return arrayList;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
        } catch (Exception e11) {
            Logger.INSTANCE.exception(TAG, e11);
        }
        return arrayList;
    }

    public final void setInsertStatus(@NotNull DBDataStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.insertStatus = status;
    }

    public final void setSearchRange(long start, long end) {
        this.startTime = start;
        this.endTime = end;
    }

    private final long getEventTime(ReportData data) {
        long jOptLong;
        if (data.getParams().has(C33820nf.f71148d)) {
            jOptLong = data.getParams().optLong(C33820nf.f71148d);
        } else {
            jOptLong = 0;
        }
        if (jOptLong == 0) {
            return System.currentTimeMillis();
        }
        return jOptLong;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportDataTable(@NotNull String pId, @NotNull String processName, @NotNull String version, @NotNull ReportData reportData) {
        this();
        Intrinsics.checkNotNullParameter(pId, "pId");
        Intrinsics.checkNotNullParameter(processName, "processName");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.processName = processName;
        this.productId = pId;
        this.version = version;
        this.reportData = reportData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportDataTable(@NotNull String pId, @NotNull String processName, @NotNull String version) {
        this();
        Intrinsics.checkNotNullParameter(pId, "pId");
        Intrinsics.checkNotNullParameter(processName, "processName");
        Intrinsics.checkNotNullParameter(version, "version");
        this.processName = processName;
        this.productId = pId;
        this.version = version;
    }
}
