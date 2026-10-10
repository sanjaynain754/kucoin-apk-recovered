package com.tencent.rmonitor.base.p144db.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33770l7;
import com.tencent.bugly.proguard.C34025xh;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.p144db.BaseTable;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.sla.AttaEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J'\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007J3\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0016J{\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007J\"\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u0016H\u0016¨\u0006)"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/AttaEventTable;", "Lcom/tencent/rmonitor/base/db/BaseTable;", "()V", "batchDelete", "", "attaEventList", "", "Lcom/tencent/rmonitor/sla/AttaEvent;", "cursorToAttaEvent", "columns", "", "", InterfaceC33953u5.f72198E, "Landroid/database/Cursor;", "([Ljava/lang/String;Landroid/database/Cursor;)Lcom/tencent/rmonitor/sla/AttaEvent;", "delete", "attaEvent", "ifContain", "", "target", "list", "block", "Lkotlin/Function0;", "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "insert", "dataBase", "Landroid/database/sqlite/SQLiteDatabase;", SearchIntents.EXTRA_QUERY, "selection", "selectionArgs", "distinct", "", "groupBy", "having", "orderBy", TUIConstants.TUIContact.LIMIT, "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "replace", FirebaseAnalytics.Event.SEARCH, "", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AttaEventTable extends BaseTable {

    @NotNull
    public static final String COLUMN_APP_BUNDLE_ID = "app_bundle_id";

    @NotNull
    public static final String COLUMN_APP_KEY = "app_key";

    @NotNull
    public static final String COLUMN_APP_NAME = "app_name";

    @NotNull
    public static final String COLUMN_APP_VERSION = "app_version";

    @NotNull
    public static final String COLUMN_CLIENT_TYPE = "client_type";

    @NotNull
    public static final String COLUMN_DEBUG = "debug";

    @NotNull
    public static final String COLUMN_DEVICE_ID = "device_id";

    @NotNull
    public static final String COLUMN_ERROR_CODE = "error_code";

    @NotNull
    public static final String COLUMN_EVENT_CODE = "event_code";

    @NotNull
    public static final String COLUMN_EVENT_COST = "event_cost";

    @NotNull
    public static final String COLUMN_EVENT_RESULT = "event_result";

    @NotNull
    public static final String COLUMN_EVENT_TIME = "event_time";

    @NotNull
    public static final String COLUMN_FULL_OS_VERSION = "full_os_version";

    @NotNull
    public static final String COLUMN_ID = "_id";

    @NotNull
    public static final String COLUMN_MANUFACTURER = "manufacturer";

    @NotNull
    public static final String COLUMN_MODEL = "model";

    @NotNull
    public static final String COLUMN_OS_VERSION = "os_version";

    @NotNull
    public static final String COLUMN_PARAM_0 = "param_0";

    @NotNull
    public static final String COLUMN_PARAM_1 = "param_1";

    @NotNull
    public static final String COLUMN_PARAM_10 = "param_10";

    @NotNull
    public static final String COLUMN_PARAM_11 = "param_11";

    @NotNull
    public static final String COLUMN_PARAM_12 = "param_12";

    @NotNull
    public static final String COLUMN_PARAM_13 = "param_13";

    @NotNull
    public static final String COLUMN_PARAM_2 = "param_2";

    @NotNull
    public static final String COLUMN_PARAM_3 = "param_3";

    @NotNull
    public static final String COLUMN_PARAM_4 = "param_4";

    @NotNull
    public static final String COLUMN_PARAM_5 = "param_5";

    @NotNull
    public static final String COLUMN_PARAM_6 = "param_6";

    @NotNull
    public static final String COLUMN_PARAM_7 = "param_7";

    @NotNull
    public static final String COLUMN_PARAM_8 = "param_8";

    @NotNull
    public static final String COLUMN_PARAM_9 = "param_9";

    @NotNull
    public static final String COLUMN_PRODUCT_ID = "product_id";

    @NotNull
    public static final String COLUMN_SDK_VERSION = "sdk_version";

    @NotNull
    public static final String COLUMN_UPLOAD_TIME = "upload_time";

    @NotNull
    public static final String COLUMN_USER_ID = "user_id";

    @NotNull
    private static final String CREATE_ATTA_DATA = "CREATE TABLE IF NOT EXISTS atta_event (_id INTEGER PRIMARY KEY AUTOINCREMENT,app_version TEXT,app_name TEXT,app_bundle_id TEXT,app_key TEXT,client_type TEXT,user_id TEXT,sdk_version TEXT,event_code TEXT,event_result INT,event_time BIGINT,event_cost INT,error_code INT,upload_time BIGINT,device_id TEXT,os_version TEXT,manufacturer TEXT,model TEXT,debug INT,product_id TEXT,full_os_version TEXT,param_0 TEXT,param_1 TEXT,param_2 TEXT,param_3 TEXT,param_4 TEXT,param_5 TEXT,param_6 TEXT,param_7 TEXT,param_8 TEXT,param_9 TEXT,param_10 TEXT,param_11 TEXT,param_12 TEXT,param_13 TEXT);";

    @NotNull
    public static final String TABLE_ATTA_DATA = "atta_event";

    @NotNull
    private static final String TAG = "RMonitor_base_AttaEventTable";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AttaEventTable> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<AttaEventTable>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final AttaEventTable invoke() {
            return new AttaEventTable();
        }
    });

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u00100\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u00061"}, m90084d2 = {"Lcom/tencent/rmonitor/base/db/table/AttaEventTable$Companion;", "", "()V", "COLUMN_APP_BUNDLE_ID", "", "COLUMN_APP_KEY", "COLUMN_APP_NAME", "COLUMN_APP_VERSION", "COLUMN_CLIENT_TYPE", "COLUMN_DEBUG", "COLUMN_DEVICE_ID", "COLUMN_ERROR_CODE", "COLUMN_EVENT_CODE", "COLUMN_EVENT_COST", "COLUMN_EVENT_RESULT", "COLUMN_EVENT_TIME", "COLUMN_FULL_OS_VERSION", "COLUMN_ID", "COLUMN_MANUFACTURER", "COLUMN_MODEL", "COLUMN_OS_VERSION", "COLUMN_PARAM_0", "COLUMN_PARAM_1", "COLUMN_PARAM_10", "COLUMN_PARAM_11", "COLUMN_PARAM_12", "COLUMN_PARAM_13", "COLUMN_PARAM_2", "COLUMN_PARAM_3", "COLUMN_PARAM_4", "COLUMN_PARAM_5", "COLUMN_PARAM_6", "COLUMN_PARAM_7", "COLUMN_PARAM_8", "COLUMN_PARAM_9", "COLUMN_PRODUCT_ID", "COLUMN_SDK_VERSION", "COLUMN_UPLOAD_TIME", "COLUMN_USER_ID", "CREATE_ATTA_DATA", "TABLE_ATTA_DATA", "TAG", "instance", "Lcom/tencent/rmonitor/base/db/table/AttaEventTable;", "getInstance", "()Lcom/tencent/rmonitor/base/db/table/AttaEventTable;", "instance$delegate", "Lkotlin/Lazy;", "getTableName", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String getTableName() {
            return AttaEventTable.TABLE_ATTA_DATA;
        }

        @NotNull
        public final AttaEventTable getInstance() {
            return (AttaEventTable) AttaEventTable.instance$delegate.getValue();
        }
    }

    private final AttaEvent cursorToAttaEvent(String[] columns, final Cursor cursor) {
        try {
            final AttaEvent attaEvent = new AttaEvent(null, 1, null);
            ifContain("_id", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.1
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    attaEvent2.setId(cursor2.getInt(cursor2.getColumnIndex("_id")));
                }
            });
            ifContain("app_version", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.2
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("app_version"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…ndex(COLUMN_APP_VERSION))");
                    attaEvent2.setAppVersion(string);
                }
            });
            ifContain("app_name", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.3
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("app_name"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…mnIndex(COLUMN_APP_NAME))");
                    attaEvent2.setAppName(string);
                }
            });
            ifContain("app_bundle_id", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.4
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("app_bundle_id"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…ex(COLUMN_APP_BUNDLE_ID))");
                    attaEvent2.setAppBundleId(string);
                }
            });
            ifContain("app_key", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.5
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("app_key"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_APP_KEY))");
                    attaEvent2.setAppKey(string);
                }
            });
            ifContain("user_id", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.6
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("user_id"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_USER_ID))");
                    attaEvent2.setUserId(string);
                }
            });
            ifContain("sdk_version", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.7
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("sdk_version"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…ndex(COLUMN_SDK_VERSION))");
                    attaEvent2.setSdkVersion(string);
                }
            });
            ifContain("event_code", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.8
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("event_code"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…Index(COLUMN_EVENT_CODE))");
                    attaEvent2.setEventCode(string);
                }
            });
            ifContain("event_result", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.9
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    attaEvent2.setEventResult(cursor2.getInt(cursor2.getColumnIndex("event_result")));
                }
            });
            ifContain("event_time", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.10
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    attaEvent2.setEventTime(cursor2.getLong(cursor2.getColumnIndex("event_time")));
                }
            });
            ifContain("event_cost", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.11
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    attaEvent2.setEventCost(cursor2.getInt(cursor2.getColumnIndex("event_cost")));
                }
            });
            ifContain("error_code", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.12
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    attaEvent2.setErrorCode(cursor2.getInt(cursor2.getColumnIndex("error_code")));
                }
            });
            ifContain("upload_time", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.13
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    attaEvent2.setUploadTime(cursor2.getLong(cursor2.getColumnIndex("upload_time")));
                }
            });
            ifContain("device_id", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.14
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("device_id"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…nIndex(COLUMN_DEVICE_ID))");
                    attaEvent2.setDeviceId(string);
                }
            });
            ifContain("os_version", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.15
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("os_version"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…Index(COLUMN_OS_VERSION))");
                    attaEvent2.setOsVersion(string);
                }
            });
            ifContain("manufacturer", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.16
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("manufacturer"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…dex(COLUMN_MANUFACTURER))");
                    attaEvent2.setManufacturer(string);
                }
            });
            ifContain("model", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.17
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("model"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…olumnIndex(COLUMN_MODEL))");
                    attaEvent2.setModel(string);
                }
            });
            ifContain("debug", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.18
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    attaEvent2.setDebug(cursor2.getInt(cursor2.getColumnIndex("debug")));
                }
            });
            ifContain("product_id", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.19
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("product_id"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…Index(COLUMN_PRODUCT_ID))");
                    attaEvent2.setProductId(string);
                }
            });
            ifContain("full_os_version", columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.20
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex("full_os_version"));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…(COLUMN_FULL_OS_VERSION))");
                    attaEvent2.setFullOSVersion(string);
                }
            });
            ifContain(COLUMN_PARAM_0, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.21
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_0));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_0))");
                    attaEvent2.setParam0(string);
                }
            });
            ifContain(COLUMN_PARAM_1, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.22
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_1));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_1))");
                    attaEvent2.setParam1(string);
                }
            });
            ifContain(COLUMN_PARAM_2, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.23
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_2));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_2))");
                    attaEvent2.setParam2(string);
                }
            });
            ifContain(COLUMN_PARAM_3, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.24
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_3));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_3))");
                    attaEvent2.setParam3(string);
                }
            });
            ifContain(COLUMN_PARAM_4, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.25
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_4));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_4))");
                    attaEvent2.setParam4(string);
                }
            });
            ifContain(COLUMN_PARAM_5, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.26
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_5));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_5))");
                    attaEvent2.setParam5(string);
                }
            });
            ifContain(COLUMN_PARAM_6, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.27
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_6));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_6))");
                    attaEvent2.setParam6(string);
                }
            });
            ifContain(COLUMN_PARAM_7, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.28
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_7));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_7))");
                    attaEvent2.setParam7(string);
                }
            });
            ifContain(COLUMN_PARAM_8, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.29
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_8));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_8))");
                    attaEvent2.setParam8(string);
                }
            });
            ifContain(COLUMN_PARAM_9, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.30
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_9));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…umnIndex(COLUMN_PARAM_9))");
                    attaEvent2.setParam9(string);
                }
            });
            ifContain(COLUMN_PARAM_10, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.31
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_10));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…mnIndex(COLUMN_PARAM_10))");
                    attaEvent2.setParam10(string);
                }
            });
            ifContain(COLUMN_PARAM_11, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.32
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_11));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…mnIndex(COLUMN_PARAM_11))");
                    attaEvent2.setParam11(string);
                }
            });
            ifContain(COLUMN_PARAM_12, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.33
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_12));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…mnIndex(COLUMN_PARAM_12))");
                    attaEvent2.setParam12(string);
                }
            });
            ifContain(COLUMN_PARAM_13, columns, new Function0<Unit>() { // from class: com.tencent.rmonitor.base.db.table.AttaEventTable.cursorToAttaEvent.34
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
                    AttaEvent attaEvent2 = attaEvent;
                    Cursor cursor2 = cursor;
                    String string = cursor2.getString(cursor2.getColumnIndex(AttaEventTable.COLUMN_PARAM_13));
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…mnIndex(COLUMN_PARAM_13))");
                    attaEvent2.setParam13(string);
                }
            });
            return attaEvent;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Logger.INSTANCE.mo77130d(TAG, "companion object init");
        new AttaEventTable();
    }

    public AttaEventTable() {
        super(TABLE_ATTA_DATA, CREATE_ATTA_DATA);
    }

    private final void ifContain(String target, String[] list, Function0<Unit> block) {
        if (list == null || list.length == 0 || ArraysKt.contains(list, target)) {
            block.invoke();
        }
    }

    public static /* synthetic */ List query$default(AttaEventTable attaEventTable, String[] strArr, String str, String[] strArr2, boolean z11, String str2, String str3, String str4, String str5, int i11, Object obj) {
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
        return attaEventTable.query(strArr, str, strArr2, z11, str2, str3, str4, str5);
    }

    public final int batchDelete(@NotNull List<AttaEvent> attaEventList) {
        DBHandler dbHandler;
        Intrinsics.checkNotNullParameter(attaEventList, "attaEventList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : attaEventList) {
            if (((AttaEvent) obj).getId() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((AttaEvent) it.next()).getId()));
        }
        if (arrayList2.isEmpty()) {
            return 0;
        }
        String str = "_id in ( " + TextUtils.join(",", arrayList2) + " )";
        Logger.INSTANCE.mo77130d(TAG, C33770l7.m73937a("delete sql where:", str));
        DBHelper dBHelper = BaseInfo.dbHelper;
        if (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) {
            return 0;
        }
        return dbHandler.delete(TABLE_ATTA_DATA, str, null);
    }

    public final int delete(@NotNull AttaEvent attaEvent) {
        DBHandler dbHandler;
        Intrinsics.checkNotNullParameter(attaEvent, "attaEvent");
        if (attaEvent.getId() < 0) {
            return 0;
        }
        String str = "_id= " + attaEvent.getId();
        Logger.INSTANCE.mo77130d(TAG, C33770l7.m73937a("delete sql where:", str));
        DBHelper dBHelper = BaseInfo.dbHelper;
        if (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) {
            return 0;
        }
        return dbHandler.delete(TABLE_ATTA_DATA, str, null);
    }

    @Override // com.tencent.rmonitor.base.p144db.BaseTable
    public int insert(@NotNull SQLiteDatabase dataBase, @NotNull Function0<Integer> block) {
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        Intrinsics.checkNotNullParameter(block, "block");
        return 0;
    }

    @NotNull
    public final List<AttaEvent> query(@Nullable String[] columns, @Nullable String selection, @Nullable String[] selectionArgs, boolean distinct, @Nullable String groupBy, @Nullable String having, @Nullable String orderBy, @Nullable String limit) {
        DBHandler dbHandler;
        Logger logger = Logger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("columns:");
        sb2.append(columns);
        sb2.append(" selection:");
        sb2.append(selection);
        sb2.append(" selectionArgs:");
        sb2.append(selectionArgs);
        logger.mo77130d(TAG, C34025xh.m75464a(sb2, " limit:", limit));
        DBHelper dBHelper = BaseInfo.dbHelper;
        Cursor cursorQuery = (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) ? null : dbHandler.query(TABLE_ATTA_DATA, columns, selection, selectionArgs, distinct, groupBy, having, orderBy, limit);
        ArrayList arrayList = new ArrayList();
        if (cursorQuery == null) {
            return arrayList;
        }
        try {
            if (cursorQuery.getCount() > 0) {
                while (cursorQuery.moveToNext()) {
                    AttaEvent attaEventCursorToAttaEvent = cursorToAttaEvent(columns, cursorQuery);
                    if (attaEventCursorToAttaEvent != null) {
                        arrayList.add(attaEventCursorToAttaEvent);
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

    public final int replace(@NotNull AttaEvent attaEvent) {
        DBHandler dbHandler;
        Intrinsics.checkNotNullParameter(attaEvent, "attaEvent");
        ContentValues contentValues = new ContentValues();
        if (attaEvent.getId() > 0) {
            contentValues.put("_id", Integer.valueOf(attaEvent.getId()));
        }
        contentValues.put("app_version", attaEvent.getAppVersion());
        contentValues.put("app_name", attaEvent.getAppName());
        contentValues.put("app_bundle_id", attaEvent.getAppBundleId());
        contentValues.put("app_key", attaEvent.getAppKey());
        contentValues.put("client_type", attaEvent.getClientType());
        contentValues.put("user_id", attaEvent.getUserId());
        contentValues.put("sdk_version", attaEvent.getSdkVersion());
        contentValues.put("event_code", attaEvent.getEventCode());
        contentValues.put("event_result", Integer.valueOf(attaEvent.getEventResult()));
        contentValues.put("event_time", Long.valueOf(attaEvent.getEventTime()));
        contentValues.put("event_cost", Integer.valueOf(attaEvent.getEventCost()));
        contentValues.put("error_code", Integer.valueOf(attaEvent.getErrorCode()));
        contentValues.put("upload_time", Long.valueOf(attaEvent.getUploadTime()));
        contentValues.put("device_id", attaEvent.getDeviceId());
        contentValues.put("os_version", attaEvent.getOsVersion());
        contentValues.put("manufacturer", attaEvent.getManufacturer());
        contentValues.put("model", attaEvent.getModel());
        contentValues.put("debug", Integer.valueOf(attaEvent.getDebug()));
        contentValues.put("product_id", attaEvent.getProductId());
        contentValues.put("full_os_version", attaEvent.getFullOSVersion());
        contentValues.put(COLUMN_PARAM_0, attaEvent.getParam0());
        contentValues.put(COLUMN_PARAM_1, attaEvent.getParam1());
        contentValues.put(COLUMN_PARAM_2, attaEvent.getParam2());
        contentValues.put(COLUMN_PARAM_3, attaEvent.getParam3());
        contentValues.put(COLUMN_PARAM_4, attaEvent.getParam4());
        contentValues.put(COLUMN_PARAM_5, attaEvent.getParam5());
        contentValues.put(COLUMN_PARAM_6, attaEvent.getParam6());
        contentValues.put(COLUMN_PARAM_7, attaEvent.getParam7());
        contentValues.put(COLUMN_PARAM_8, attaEvent.getParam8());
        contentValues.put(COLUMN_PARAM_9, attaEvent.getParam9());
        contentValues.put(COLUMN_PARAM_10, attaEvent.getParam10());
        contentValues.put(COLUMN_PARAM_11, attaEvent.getParam11());
        contentValues.put(COLUMN_PARAM_12, attaEvent.getParam12());
        contentValues.put(COLUMN_PARAM_13, attaEvent.getParam13());
        DBHelper dBHelper = BaseInfo.dbHelper;
        int iReplace = (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) ? -1 : dbHandler.replace(TABLE_ATTA_DATA, "_id", contentValues);
        attaEvent.setId(iReplace);
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
