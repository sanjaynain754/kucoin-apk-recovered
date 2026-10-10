package com.tencent.rmonitor.base.p144db.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33770l7;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.TrafficInfo;
import com.tencent.rmonitor.base.p144db.BaseTable;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J'\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007J3\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0016J{\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007J\"\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u0016H\u0016¨\u0006)"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;", "Lcom/tencent/rmonitor/base/db/BaseTable;", "()V", "batchDelete", "", "trafficInfoList", "", "Lcom/tencent/rmonitor/base/meta/TrafficInfo;", "cursorToTrafficInfo", "columns", "", "", InterfaceC33953u5.f72198E, "Landroid/database/Cursor;", "([Ljava/lang/String;Landroid/database/Cursor;)Lcom/tencent/rmonitor/base/meta/TrafficInfo;", "delete", "trafficInfo", "ifContain", "", "target", "list", "block", "Lkotlin/Function0;", "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "insert", "dataBase", "Landroid/database/sqlite/SQLiteDatabase;", SearchIntents.EXTRA_QUERY, "selection", "selectionArgs", "distinct", "", "groupBy", "having", "orderBy", TUIConstants.TUIContact.LIMIT, "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "replace", FirebaseAnalytics.Event.SEARCH, "", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class TrafficInfoTable extends BaseTable {

    @NotNull
    public static final String COLUMN_APP_VERSION = "app_version";

    @NotNull
    public static final String COLUMN_FRONT_STATE = "front_state";

    @NotNull
    public static final String COLUMN_HOST = "host";

    @NotNull
    public static final String COLUMN_HOT_PATCH_NUM = "hot_patch_num";

    @NotNull
    public static final String COLUMN_ID = "_id";

    @NotNull
    public static final String COLUMN_LAUNCH_ID = "launch_id";

    @NotNull
    public static final String COLUMN_NET_STATE = "net_state";

    @NotNull
    public static final String COLUMN_PROCESS_LAUNCH_ID = "process_launch_id";

    @NotNull
    public static final String COLUMN_PROCESS_NAME = "process_name";

    @NotNull
    public static final String COLUMN_RX = "rx";

    @NotNull
    public static final String COLUMN_TX = "tx";

    @NotNull
    public static final String COLUMN_TYPE = "type";

    @NotNull
    public static final String COLUMN_USERDATA = "user_data";

    @NotNull
    private static final String CREATE_TRAFFIC_INFO = "CREATE TABLE IF NOT EXISTS traffic_info (_id INTEGER PRIMARY KEY AUTOINCREMENT,process_name TEXT,process_launch_id TEXT,launch_id TEXT,type TEXT,host TEXT,front_state TEXT,net_state TEXT,rx BIGINT,tx BIGINT,app_version TEXT,hot_patch_num TEXT,occur_time BIGINT,status TEXT,user_data TEXT);";

    @NotNull
    public static final String TABLE_TRAFFIC_INFO = "traffic_info";

    @NotNull
    private static final String TAG = "TrafficInfoTable";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<TrafficInfoTable> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<TrafficInfoTable>() { // from class: com.tencent.rmonitor.base.db.table.TrafficInfoTable$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final TrafficInfoTable invoke() {
            return new TrafficInfoTable();
        }
    });

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R!\u0010\u0014\u001a\u00020\u00158FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable$Companion;", "", "()V", "COLUMN_APP_VERSION", "", "COLUMN_FRONT_STATE", "COLUMN_HOST", "COLUMN_HOT_PATCH_NUM", "COLUMN_ID", "COLUMN_LAUNCH_ID", "COLUMN_NET_STATE", "COLUMN_PROCESS_LAUNCH_ID", "COLUMN_PROCESS_NAME", "COLUMN_RX", "COLUMN_TX", "COLUMN_TYPE", "COLUMN_USERDATA", "CREATE_TRAFFIC_INFO", "TABLE_TRAFFIC_INFO", "TAG", "instance", "Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;", "getInstance$annotations", "getInstance", "()Lcom/tencent/rmonitor/base/db/table/TrafficInfoTable;", "instance$delegate", "Lkotlin/Lazy;", "getTableName", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final String getTableName() {
            return TrafficInfoTable.TABLE_TRAFFIC_INFO;
        }

        @NotNull
        public final TrafficInfoTable getInstance() {
            return (TrafficInfoTable) TrafficInfoTable.instance$delegate.getValue();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }
    }

    static {
        new TrafficInfoTable();
    }

    public TrafficInfoTable() {
        super(TABLE_TRAFFIC_INFO, CREATE_TRAFFIC_INFO);
    }

    private final TrafficInfo cursorToTrafficInfo(String[] columns, final Cursor cursor) {
        try {
            final TrafficInfo trafficInfo = new TrafficInfo();
            ifContain("_id", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.TrafficInfoTable.cursorToTrafficInfo.1
                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TrafficInfo trafficInfo2 = trafficInfo;
                    Cursor cursor2 = cursor;
                    trafficInfo2.setId(cursor2.getInt(cursor2.getColumnIndex("_id")));
                    TrafficInfo trafficInfo3 = trafficInfo;
                    Cursor cursor3 = cursor;
                    String string = cursor3.getString(cursor3.getColumnIndex("process_name"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…dex(COLUMN_PROCESS_NAME))");
                    trafficInfo3.setProcessName(string);
                    TrafficInfo trafficInfo4 = trafficInfo;
                    Cursor cursor4 = cursor;
                    String string2 = cursor4.getString(cursor4.getColumnIndex("process_launch_id"));
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(cursor.…OLUMN_PROCESS_LAUNCH_ID))");
                    trafficInfo4.setProcessLaunchID(string2);
                    TrafficInfo trafficInfo5 = trafficInfo;
                    Cursor cursor5 = cursor;
                    String string3 = cursor5.getString(cursor5.getColumnIndex("launch_id"));
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(cursor.…       COLUMN_LAUNCH_ID))");
                    trafficInfo5.setLaunchID(string3);
                    TrafficInfo trafficInfo6 = trafficInfo;
                    Cursor cursor6 = cursor;
                    String string4 = cursor6.getString(cursor6.getColumnIndex("type"));
                    Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(cursor.…            COLUMN_TYPE))");
                    trafficInfo6.setType(string4);
                    TrafficInfo trafficInfo7 = trafficInfo;
                    Cursor cursor7 = cursor;
                    String string5 = cursor7.getString(cursor7.getColumnIndex("host"));
                    Intrinsics.checkNotNullExpressionValue(string5, "cursor.getString(cursor.…ColumnIndex(COLUMN_HOST))");
                    trafficInfo7.setHost(string5);
                    TrafficInfo trafficInfo8 = trafficInfo;
                    Cursor cursor8 = cursor;
                    String string6 = cursor8.getString(cursor8.getColumnIndex("front_state"));
                    Intrinsics.checkNotNullExpressionValue(string6, "cursor.getString(cursor.…ndex(COLUMN_FRONT_STATE))");
                    trafficInfo8.setFrontState(string6);
                    TrafficInfo trafficInfo9 = trafficInfo;
                    Cursor cursor9 = cursor;
                    String string7 = cursor9.getString(cursor9.getColumnIndex(TrafficInfoTable.COLUMN_NET_STATE));
                    Intrinsics.checkNotNullExpressionValue(string7, "cursor.getString(cursor.…nIndex(COLUMN_NET_STATE))");
                    trafficInfo9.setNetState(string7);
                    TrafficInfo trafficInfo10 = trafficInfo;
                    Cursor cursor10 = cursor;
                    trafficInfo10.setRx(cursor10.getInt(cursor10.getColumnIndex(TrafficInfoTable.COLUMN_RX)));
                    TrafficInfo trafficInfo11 = trafficInfo;
                    Cursor cursor11 = cursor;
                    trafficInfo11.setTx(cursor11.getInt(cursor11.getColumnIndex(TrafficInfoTable.COLUMN_TX)));
                    TrafficInfo trafficInfo12 = trafficInfo;
                    Cursor cursor12 = cursor;
                    String string8 = cursor12.getString(cursor12.getColumnIndex("app_version"));
                    Intrinsics.checkNotNullExpressionValue(string8, "cursor.getString(cursor.…ndex(COLUMN_APP_VERSION))");
                    trafficInfo12.setAppVersion(string8);
                    TrafficInfo trafficInfo13 = trafficInfo;
                    Cursor cursor13 = cursor;
                    String string9 = cursor13.getString(cursor13.getColumnIndex(TrafficInfoTable.COLUMN_HOT_PATCH_NUM));
                    Intrinsics.checkNotNullExpressionValue(string9, "cursor.getString(cursor.…ex(COLUMN_HOT_PATCH_NUM))");
                    trafficInfo13.setHotPatchNum(string9);
                    TrafficInfo trafficInfo14 = trafficInfo;
                    Cursor cursor14 = cursor;
                    trafficInfo14.setUserData(new JSONObject(cursor14.getString(cursor14.getColumnIndex(TrafficInfoTable.COLUMN_USERDATA))));
                }
            });
            return trafficInfo;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final TrafficInfoTable getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    @NotNull
    public static final String getTableName() {
        return INSTANCE.getTableName();
    }

    private final void ifContain(String target, String[] list, Function0<Unit> block) {
        if (list == null || list.length == 0 || ArraysKt.contains(list, target)) {
            block.invoke();
        }
    }

    public static /* synthetic */ List query$default(TrafficInfoTable trafficInfoTable, String[] strArr, String str, String[] strArr2, boolean z11, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            strArr = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            strArr2 = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        if ((i11 & 16) != 0) {
            str2 = null;
        }
        if ((i11 & 32) != 0) {
            str3 = null;
        }
        if ((i11 & 64) != 0) {
            str4 = null;
        }
        if ((i11 & 128) != 0) {
            str5 = null;
        }
        return trafficInfoTable.query(strArr, str, strArr2, z11, str2, str3, str4, str5);
    }

    public final int batchDelete(@NotNull List<TrafficInfo> trafficInfoList) {
        DBHandler dbHandler;
        Intrinsics.checkNotNullParameter(trafficInfoList, "trafficInfoList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : trafficInfoList) {
            if (((TrafficInfo) obj).getId() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((TrafficInfo) it.next()).getId()));
        }
        if (arrayList2.isEmpty()) {
            return 0;
        }
        String str = "_id in ( " + TextUtils.join(",", arrayList2) + " )";
        DBHelper dBHelper = BaseInfo.dbHelper;
        if (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) {
            return 0;
        }
        return dbHandler.delete(TABLE_TRAFFIC_INFO, str, null);
    }

    public final int delete(@NotNull TrafficInfo trafficInfo) {
        DBHandler dbHandler;
        Intrinsics.checkNotNullParameter(trafficInfo, "trafficInfo");
        if (trafficInfo.getId() < 0) {
            return 0;
        }
        String str = "_id= " + trafficInfo.getId();
        Logger.INSTANCE.mo77130d(TAG, C33770l7.m73937a("delete sql where:", str));
        DBHelper dBHelper = BaseInfo.dbHelper;
        if (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) {
            return 0;
        }
        return dbHandler.delete(TABLE_TRAFFIC_INFO, str, null);
    }

    @Override // com.tencent.rmonitor.base.p144db.BaseTable
    public int insert(@NotNull SQLiteDatabase dataBase, @NotNull Function0<Integer> block) {
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        Intrinsics.checkNotNullParameter(block, "block");
        return 1;
    }

    @NotNull
    public final List<TrafficInfo> query(@Nullable String[] columns, @Nullable String selection, @Nullable String[] selectionArgs, boolean distinct, @Nullable String groupBy, @Nullable String having, @Nullable String orderBy, @Nullable String limit) {
        DBHandler dbHandler;
        DBHelper dBHelper = BaseInfo.dbHelper;
        Cursor cursorQuery = (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) ? null : dbHandler.query(TABLE_TRAFFIC_INFO, columns, selection, selectionArgs, distinct, groupBy, having, orderBy, limit);
        ArrayList arrayList = new ArrayList();
        if (cursorQuery == null) {
            return arrayList;
        }
        try {
            if (cursorQuery.getCount() > 0) {
                while (cursorQuery.moveToNext()) {
                    TrafficInfo trafficInfoCursorToTrafficInfo = cursorToTrafficInfo(columns, cursorQuery);
                    if (trafficInfoCursorToTrafficInfo != null) {
                        arrayList.add(trafficInfoCursorToTrafficInfo);
                    }
                }
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

    public final int replace(@NotNull TrafficInfo trafficInfo) {
        DBHandler dbHandler;
        Intrinsics.checkNotNullParameter(trafficInfo, "trafficInfo");
        ContentValues contentValues = new ContentValues();
        if (trafficInfo.getId() > 0) {
            contentValues.put("_id", Integer.valueOf(trafficInfo.getId()));
        }
        contentValues.put("process_name", trafficInfo.getProcessName());
        contentValues.put("process_launch_id", trafficInfo.getProcessLaunchID());
        contentValues.put("launch_id", trafficInfo.getLaunchID());
        contentValues.put("type", trafficInfo.getType());
        contentValues.put("host", trafficInfo.getHost());
        contentValues.put("front_state", trafficInfo.getFrontState());
        contentValues.put(COLUMN_NET_STATE, trafficInfo.getNetState());
        contentValues.put(COLUMN_RX, Integer.valueOf(trafficInfo.getRx()));
        contentValues.put(COLUMN_TX, Integer.valueOf(trafficInfo.getTx()));
        contentValues.put("app_version", trafficInfo.getAppVersion());
        contentValues.put(COLUMN_HOT_PATCH_NUM, trafficInfo.getHotPatchNum());
        contentValues.put(COLUMN_USERDATA, trafficInfo.getUserData().toString());
        contentValues.put(BaseTable.COLUMN_OCCUR_TIME, Long.valueOf(System.currentTimeMillis()));
        contentValues.put("status", Integer.valueOf(DBDataStatus.TO_SEND.getValue()));
        DBHelper dBHelper = BaseInfo.dbHelper;
        int iReplace = (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) ? -1 : dbHandler.replace(TABLE_TRAFFIC_INFO, "_id", contentValues);
        trafficInfo.setId(iReplace);
        return iReplace;
    }

    @Override // com.tencent.rmonitor.base.p144db.BaseTable
    @Nullable
    public Object search(@NotNull SQLiteDatabase dataBase, @NotNull Function0<? extends Object> block) {
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        Intrinsics.checkNotNullParameter(block, "block");
        return null;
    }
}
