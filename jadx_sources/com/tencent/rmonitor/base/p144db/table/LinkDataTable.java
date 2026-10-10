package com.tencent.rmonitor.base.p144db.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.C34008x0;
import com.tencent.rmonitor.base.p144db.BaseTable;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0013J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/LinkDataTable;", "Lcom/tencent/rmonitor/base/db/BaseTable;", "Landroid/database/sqlite/SQLiteDatabase;", "dataBase", "Lkotlin/Function0;", "", "block", "insert", "", FirebaseAnalytics.Event.SEARCH, "Lcom/tencent/bugly/proguard/x0;", "baseDBParam", "Lcom/tencent/bugly/proguard/x0;", "Lcom/tencent/bugly/proguard/va;", "linkData", "Lcom/tencent/bugly/proguard/va;", "<init>", "()V", "(Lcom/tencent/bugly/proguard/x0;Lcom/tencent/bugly/proguard/va;)V", "(Lcom/tencent/bugly/proguard/x0;)V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class LinkDataTable extends BaseTable {

    @NotNull
    private static final String COLUMN_APP_VERSION = "app_version";

    @NotNull
    private static final String COLUMN_BASE_TYPE = "base_type";

    @NotNull
    private static final String COLUMN_CLIENT_IDENTIFY = "client_identify";

    @NotNull
    private static final String COLUMN_EVENT_TIME = "event_time";

    @NotNull
    private static final String COLUMN_ID = "_id";

    @NotNull
    private static final String COLUMN_LAUNCH_ID = "launch_id";

    @NotNull
    private static final String COLUMN_PROCESS_LAUNCH_ID = "process_launch_id";

    @NotNull
    private static final String COLUMN_PROCESS_NAME = "process_name";

    @NotNull
    private static final String COLUMN_PRODUCT_ID = "product_id";

    @NotNull
    private static final String COLUMN_RESERVED = "reserved";

    @NotNull
    private static final String COLUMN_SDK_VERSION = "sdk_version";

    @NotNull
    private static final String COLUMN_SUB_TYPE = "sub_type";

    @NotNull
    private static final String COLUMN_UIN = "uin";

    @NotNull
    private static final String CREATE_LINK_DATA = "CREATE TABLE link_data (_id INTEGER PRIMARY KEY AUTOINCREMENT,product_id TEXT,process_name TEXT,app_version TEXT,sdk_version TEXT,launch_id TEXT,process_launch_id TEXT,uin TEXT,base_type TEXT,sub_type TEXT,client_identify TEXT,reserved TEXT,status TINYINT,event_time BIGINT,occur_time BIGINT);";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TABLE_LINK_DATA = "link_data";

    @NotNull
    private static final String TAG = "RMonitor_table_LinkDataTable";

    @NotNull
    private C34008x0 baseDBParam;

    @NotNull
    private C33978va linkData;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/LinkDataTable$Companion;", "", "()V", "COLUMN_APP_VERSION", "", "COLUMN_BASE_TYPE", "COLUMN_CLIENT_IDENTIFY", "COLUMN_EVENT_TIME", "COLUMN_ID", "COLUMN_LAUNCH_ID", "COLUMN_PROCESS_LAUNCH_ID", "COLUMN_PROCESS_NAME", "COLUMN_PRODUCT_ID", "COLUMN_RESERVED", "COLUMN_SDK_VERSION", "COLUMN_SUB_TYPE", "COLUMN_UIN", "CREATE_LINK_DATA", "TABLE_LINK_DATA", "TAG", "getTableName", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String getTableName() {
            return LinkDataTable.TABLE_LINK_DATA;
        }
    }

    public LinkDataTable() {
        super(TABLE_LINK_DATA, CREATE_LINK_DATA);
        this.baseDBParam = new C34008x0();
        this.linkData = new C33978va();
    }

    static {
        new LinkDataTable();
    }

    @Override // com.tencent.rmonitor.base.p144db.BaseTable
    public int insert(@NotNull SQLiteDatabase dataBase, @NotNull Function0<Integer> block) {
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        Intrinsics.checkNotNullParameter(block, "block");
        ContentValues contentValues = new ContentValues();
        contentValues.put("process_name", this.baseDBParam.f72483b);
        contentValues.put("product_id", this.baseDBParam.f72482a);
        contentValues.put("app_version", this.baseDBParam.f72484c);
        contentValues.put("sdk_version", this.baseDBParam.f72485d);
        contentValues.put("uin", this.baseDBParam.f72488g);
        contentValues.put("launch_id", this.linkData.f72344c);
        contentValues.put("process_launch_id", this.linkData.f72345d);
        contentValues.put("base_type", this.linkData.f72342a);
        contentValues.put("sub_type", this.linkData.f72343b);
        contentValues.put("client_identify", this.linkData.f72346e);
        contentValues.put(COLUMN_RESERVED, "");
        contentValues.put("status", Integer.valueOf(DBDataStatus.TO_SEND.getValue()));
        contentValues.put("event_time", Long.valueOf(this.linkData.f72347f));
        contentValues.put(BaseTable.COLUMN_OCCUR_TIME, Long.valueOf(this.linkData.f72348g));
        return (int) dataBase.insert(TABLE_LINK_DATA, null, contentValues);
    }

    @Override // com.tencent.rmonitor.base.p144db.BaseTable
    @Nullable
    public Object search(@NotNull SQLiteDatabase dataBase, @NotNull Function0<? extends Object> block) {
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = new ArrayList();
        try {
            Object objInvoke = block.invoke();
            if (objInvoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            int iIntValue = ((Integer) objInvoke).intValue();
            C34008x0 c34008x0 = this.baseDBParam;
            Cursor cursorQuery = dataBase.query(TABLE_LINK_DATA, null, "process_name=? and product_id=? and process_launch_id=?", new String[]{c34008x0.f72483b, c34008x0.f72482a, c34008x0.f72487f}, null, null, "occur_time DESC", iIntValue > 0 ? String.valueOf(iIntValue) : null);
            if (cursorQuery != null) {
                try {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        C33978va c33978va = new C33978va();
                        c33978va.f72344c = cursorQuery.getString(cursorQuery.getColumnIndex("launch_id"));
                        c33978va.f72345d = cursorQuery.getString(cursorQuery.getColumnIndex("process_launch_id"));
                        c33978va.f72342a = cursorQuery.getString(cursorQuery.getColumnIndex("base_type"));
                        c33978va.f72343b = cursorQuery.getString(cursorQuery.getColumnIndex("sub_type"));
                        c33978va.f72346e = cursorQuery.getString(cursorQuery.getColumnIndex("client_identify"));
                        c33978va.f72347f = cursorQuery.getLong(cursorQuery.getColumnIndex("event_time"));
                        c33978va.f72348g = cursorQuery.getLong(cursorQuery.getColumnIndex(BaseTable.COLUMN_OCCUR_TIME));
                        arrayList.add(c33978va);
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
        } catch (Throwable th4) {
            Logger.INSTANCE.exception(TAG, th4);
        }
        return arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkDataTable(@NotNull C34008x0 baseDBParam, @NotNull C33978va linkData) {
        this();
        Intrinsics.checkNotNullParameter(baseDBParam, "baseDBParam");
        Intrinsics.checkNotNullParameter(linkData, "linkData");
        this.baseDBParam = baseDBParam;
        this.linkData = linkData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkDataTable(@NotNull C34008x0 baseDBParam) {
        this();
        Intrinsics.checkNotNullParameter(baseDBParam, "baseDBParam");
        this.baseDBParam = baseDBParam;
    }
}
