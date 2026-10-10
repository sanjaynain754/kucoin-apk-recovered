package com.tencent.rmonitor.base.p144db.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C34008x0;
import com.tencent.rmonitor.base.meta.DropFrameResultMeta;
import com.tencent.rmonitor.base.p144db.BaseTable;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u001bJ\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0016J\u0006\u0010\u000b\u001a\u00020\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/DropFrameTable;", "Lcom/tencent/rmonitor/base/db/BaseTable;", "Landroid/database/sqlite/SQLiteDatabase;", "dataBase", "Lkotlin/Function0;", "", "block", "insert", "", FirebaseAnalytics.Event.SEARCH, "", "getWhereClause", "", "getWhereArgs", "()[Ljava/lang/String;", "Lcom/tencent/bugly/proguard/x0;", "baseDBParam", "Lcom/tencent/bugly/proguard/x0;", "pluginName", "Ljava/lang/String;", "Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;", "meta", "Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;", "<init>", "()V", "dropFrameResult", "(Lcom/tencent/bugly/proguard/x0;Ljava/lang/String;Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)V", "(Lcom/tencent/bugly/proguard/x0;Ljava/lang/String;)V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class DropFrameTable extends BaseTable {

    @NotNull
    public static final String COLUMN_APP_VERSION = "app_version";

    @NotNull
    public static final String COLUMN_CONTENT = "content";

    @NotNull
    private static final String COLUMN_ID = "_id";

    @NotNull
    private static final String COLUMN_LAUNCH_ID = "launch_id";

    @NotNull
    public static final String COLUMN_PLUGIN_NAME = "plugin_name";

    @NotNull
    public static final String COLUMN_PROCESS_NAME = "process_name";

    @NotNull
    public static final String COLUMN_PRODUCT_ID = "product_id";

    @NotNull
    public static final String COLUMN_SCENE = "scene";

    @NotNull
    public static final String COLUMN_UIN = "uin";

    @NotNull
    private static final String CONNECTOR = "_";

    @NotNull
    private static final String CREATE_DROP_FRAME = "CREATE TABLE drop_frame (_id INTEGER PRIMARY KEY AUTOINCREMENT,process_name TEXT,product_id TEXT,app_version TEXT,launch_id TEXT,uin TEXT,plugin_name TEXT,scene TEXT,content TEXT,status TINYINT,occur_time BIGINT);";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TABLE_DROP_FRAME = "drop_frame";

    @NotNull
    private static final String TAG = "RMonitor_table_DropFrameTable";

    @NotNull
    private C34008x0 baseDBParam;

    @NotNull
    private DropFrameResultMeta meta;

    @NotNull
    private String pluginName;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b¨\u0006\u001a"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/DropFrameTable$Companion;", "", "", "getTableName", "Lcom/tencent/bugly/proguard/x0;", "baseDBParam", "mergeLaunchID", "key", "Lkotlin/Pair;", "parseLaunchID", "COLUMN_APP_VERSION", "Ljava/lang/String;", "COLUMN_CONTENT", "COLUMN_ID", "COLUMN_LAUNCH_ID", "COLUMN_PLUGIN_NAME", "COLUMN_PROCESS_NAME", "COLUMN_PRODUCT_ID", "COLUMN_SCENE", "COLUMN_UIN", "CONNECTOR", "CREATE_DROP_FRAME", "TABLE_DROP_FRAME", "TAG", "<init>", "()V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String getTableName() {
            return DropFrameTable.TABLE_DROP_FRAME;
        }

        @NotNull
        public final String mergeLaunchID(@NotNull C34008x0 baseDBParam) {
            Intrinsics.checkNotNullParameter(baseDBParam, "baseDBParam");
            return baseDBParam.f72486e + '_' + baseDBParam.f72487f;
        }

        @NotNull
        public final Pair<String, String> parseLaunchID(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            List listSplit$default = StringsKt.split$default((CharSequence) key, new String[]{DropFrameTable.CONNECTOR}, false, 0, 6, (Object) null);
            return new Pair<>(!listSplit$default.isEmpty() ? (String) listSplit$default.get(0) : "", listSplit$default.size() >= 2 ? (String) listSplit$default.get(1) : "");
        }
    }

    public DropFrameTable() {
        super(TABLE_DROP_FRAME, CREATE_DROP_FRAME);
        this.baseDBParam = new C34008x0();
        this.pluginName = "";
        this.meta = new DropFrameResultMeta(null, 0L, null, null, 0L, 0L, 0L, null, 255, null);
    }

    static {
        new DropFrameTable();
    }

    @NotNull
    public final String[] getWhereArgs() {
        String str = this.baseDBParam.f72483b;
        Intrinsics.checkNotNullExpressionValue(str, "baseDBParam.processName");
        String str2 = this.baseDBParam.f72482a;
        Intrinsics.checkNotNullExpressionValue(str2, "baseDBParam.productID");
        String str3 = this.baseDBParam.f72484c;
        Intrinsics.checkNotNullExpressionValue(str3, "baseDBParam.appVersion");
        return new String[]{str, str2, str3, this.pluginName};
    }

    @NotNull
    public final String getWhereClause() {
        return "process_name=? and product_id=? and app_version=? and plugin_name=?";
    }

    @Override // com.tencent.rmonitor.base.p144db.BaseTable
    public int insert(@NotNull SQLiteDatabase dataBase, @NotNull Function0<Integer> block) {
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        Intrinsics.checkNotNullParameter(block, "block");
        ContentValues contentValues = new ContentValues();
        contentValues.put("process_name", this.baseDBParam.f72483b);
        contentValues.put("product_id", this.baseDBParam.f72482a);
        contentValues.put("app_version", this.baseDBParam.f72484c);
        contentValues.put("launch_id", INSTANCE.mergeLaunchID(this.baseDBParam));
        contentValues.put("uin", this.baseDBParam.f72488g);
        contentValues.put(COLUMN_SCENE, this.meta.scene);
        contentValues.put(COLUMN_PLUGIN_NAME, this.pluginName);
        contentValues.put("content", this.meta.toJSONObject().toString());
        contentValues.put("status", Integer.valueOf(DBDataStatus.TO_SEND.getValue()));
        contentValues.put(BaseTable.COLUMN_OCCUR_TIME, Long.valueOf(this.meta.timeStamp));
        return (int) dataBase.insert(TABLE_DROP_FRAME, "name", contentValues);
    }

    @Override // com.tencent.rmonitor.base.p144db.BaseTable
    @Nullable
    public Object search(@NotNull SQLiteDatabase dataBase, @NotNull Function0<? extends Object> block) {
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        Intrinsics.checkNotNullParameter(block, "block");
        HashMap map = new HashMap();
        try {
            Cursor cursorQuery = dataBase.query(TABLE_DROP_FRAME, null, getWhereClause(), getWhereArgs(), null, null, "occur_time DESC");
            if (cursorQuery != null) {
                try {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("launch_id"));
                        if (string != null && string.length() != 0) {
                            ArrayList arrayList = (ArrayList) map.get(string);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                map.put(string, arrayList);
                            }
                            arrayList.add(new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndex("content"))));
                            cursorQuery.moveToNext();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery, null);
                    return map;
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
        return map;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DropFrameTable(@NotNull C34008x0 baseDBParam, @NotNull String pluginName, @NotNull DropFrameResultMeta dropFrameResult) {
        this();
        Intrinsics.checkNotNullParameter(baseDBParam, "baseDBParam");
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(dropFrameResult, "dropFrameResult");
        this.baseDBParam = baseDBParam;
        this.pluginName = pluginName;
        this.meta = dropFrameResult;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DropFrameTable(@NotNull C34008x0 baseDBParam, @NotNull String pluginName) {
        this();
        Intrinsics.checkNotNullParameter(baseDBParam, "baseDBParam");
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        this.baseDBParam = baseDBParam;
        this.pluginName = pluginName;
    }
}
