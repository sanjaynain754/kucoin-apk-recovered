package com.tencent.rmonitor.sla;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.C33577c3;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\bL\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004|}~\u007fB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010s\u001a\u00020\u00032\u0006\u0010t\u001a\u00020\u00152\u000e\u0010u\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030vH\u0002¢\u0006\u0002\u0010wJ\u001f\u0010x\u001a\u00020y2\u0012\u0010u\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030v\"\u00020\u0003¢\u0006\u0002\u0010zJ\u0092\u0001\u0010x\u001a\u00020y2\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020\u00032\b\b\u0002\u0010R\u001a\u00020\u00032\b\b\u0002\u0010U\u001a\u00020\u00032\b\b\u0002\u0010X\u001a\u00020\u00032\b\b\u0002\u0010[\u001a\u00020\u00032\b\b\u0002\u0010^\u001a\u00020\u00032\b\b\u0002\u0010a\u001a\u00020\u00032\b\b\u0002\u0010d\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010L\u001a\u00020\u0003J\b\u0010{\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\u0004R\u001a\u0010\"\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\u001a\u0010%\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\u0004R\u001a\u00101\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u001a\u00104\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\u0004R\u001a\u00107\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\u0004R\u001a\u0010:\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\u0004R\u001a\u0010=\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010\u0004R\u001a\u0010@\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\u0004R\u001a\u0010C\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\u0004R\u001a\u0010F\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\u0004R\u001a\u0010I\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010\u0004R\u001a\u0010L\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\u0004R\u001a\u0010O\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0007\"\u0004\bQ\u0010\u0004R\u001a\u0010R\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010\u0004R\u001a\u0010U\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0007\"\u0004\bW\u0010\u0004R\u001a\u0010X\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0007\"\u0004\bZ\u0010\u0004R\u001a\u0010[\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0007\"\u0004\b]\u0010\u0004R\u001a\u0010^\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0007\"\u0004\b`\u0010\u0004R\u001a\u0010a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0007\"\u0004\bc\u0010\u0004R\u001a\u0010d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0007\"\u0004\bf\u0010\u0004R\u001a\u0010g\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0007\"\u0004\bi\u0010\u0004R\u001a\u0010j\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0007\"\u0004\bl\u0010\u0004R\u001a\u0010m\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010+\"\u0004\bo\u0010-R\u001a\u0010p\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0007\"\u0004\br\u0010\u0004¨\u0006\u0080\u0001"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaEvent;", "", "eventCode", "", "(Ljava/lang/String;)V", "appBundleId", "getAppBundleId", "()Ljava/lang/String;", "setAppBundleId", "appKey", "getAppKey", "setAppKey", "appName", "getAppName", "setAppName", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "getAppVersion", "setAppVersion", "clientType", "getClientType", "debug", "", "getDebug", "()I", "setDebug", "(I)V", C33577c3.f69334H, "getDeviceId", "setDeviceId", "errorCode", "getErrorCode", "setErrorCode", "getEventCode", "setEventCode", "eventCost", "getEventCost", "setEventCost", "eventResult", "getEventResult", "setEventResult", "eventTime", "", "getEventTime", "()J", "setEventTime", "(J)V", "fullOSVersion", "getFullOSVersion", "setFullOSVersion", "id", "getId", "setId", "manufacturer", "getManufacturer", "setManufacturer", "model", "getModel", "setModel", "osVersion", "getOsVersion", "setOsVersion", "param0", "getParam0", "setParam0", "param1", "getParam1", "setParam1", "param10", "getParam10", "setParam10", "param11", "getParam11", "setParam11", "param12", "getParam12", "setParam12", "param13", "getParam13", "setParam13", "param2", "getParam2", "setParam2", "param3", "getParam3", "setParam3", "param4", "getParam4", "setParam4", "param5", "getParam5", "setParam5", "param6", "getParam6", "setParam6", "param7", "getParam7", "setParam7", "param8", "getParam8", "setParam8", "param9", "getParam9", "setParam9", "productId", "getProductId", "setProductId", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "getSdkVersion", "setSdkVersion", "uploadTime", "getUploadTime", "setUploadTime", "userId", "getUserId", "setUserId", "getParam", "index", ReportDataTable.COLUMN_PARAMS, "", "(I[Ljava/lang/String;)Ljava/lang/String;", "setParams", "", "([Ljava/lang/String;)V", "toString", "DebugMode", "ErrorCode", "EventCode", "EventResult", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AttaEvent {

    @NotNull
    private String appBundleId;

    @NotNull
    private String appKey;

    @NotNull
    private String appName;

    @NotNull
    private String appVersion;

    @NotNull
    private final String clientType;
    private int debug;

    @NotNull
    private String deviceId;
    private int errorCode;

    @NotNull
    private String eventCode;
    private int eventCost;
    private int eventResult;
    private long eventTime;

    @NotNull
    private String fullOSVersion;
    private int id;

    @NotNull
    private String manufacturer;

    @NotNull
    private String model;

    @NotNull
    private String osVersion;

    @NotNull
    private String param0;

    @NotNull
    private String param1;

    @NotNull
    private String param10;

    @NotNull
    private String param11;

    @NotNull
    private String param12;

    @NotNull
    private String param13;

    @NotNull
    private String param2;

    @NotNull
    private String param3;

    @NotNull
    private String param4;

    @NotNull
    private String param5;

    @NotNull
    private String param6;

    @NotNull
    private String param7;

    @NotNull
    private String param8;

    @NotNull
    private String param9;

    @NotNull
    private String productId;

    @NotNull
    private String sdkVersion;
    private long uploadTime;

    @NotNull
    private String userId;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaEvent$DebugMode;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class DebugMode {
        public static final int DEBUG = 1;
        public static final int DEFAULT = 0;
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaEvent$ErrorCode;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class ErrorCode {
        public static final int DEFAULT = 0;
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaEvent$EventCode;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class EventCode {

        @NotNull
        public static final String RM_CLIENT_ILLEGAL_REPORT = "RMIllegalReport_Client";

        @NotNull
        public static final String RM_CONFIG = "RMConfigEvent";

        @NotNull
        public static final String RM_LOOPER_STACK_COLLECT_STACK = "RMLooperStackCollectStack";

        @NotNull
        public static final String RM_PLUGIN_LAUNCH = "RMPluginLaunchEvent";

        @NotNull
        public static final String RM_RECORD_REPORT = "RMRecordReport";

        @NotNull
        public static final String RM_REPORT_ERROR_CODE = "RMReportErrorCode";

        @NotNull
        public static final String RM_SLA_LAUNCH = "RMSLALaunchEvent";
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaEvent$EventResult;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class EventResult {
        public static final int FAIL = 0;
        public static final int SUCCESS = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttaEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final String getParam(int index, String[] params) {
        return params.length > index ? params[index] : "";
    }

    public final void setParams(@NotNull String param0, @NotNull String param1, @NotNull String param2, @NotNull String param3, @NotNull String param4, @NotNull String param5, @NotNull String param6, @NotNull String param7, @NotNull String param8, @NotNull String param9, @NotNull String param10, @NotNull String param11, @NotNull String param12, @NotNull String param13) {
        Intrinsics.checkNotNullParameter(param0, "param0");
        Intrinsics.checkNotNullParameter(param1, "param1");
        Intrinsics.checkNotNullParameter(param2, "param2");
        Intrinsics.checkNotNullParameter(param3, "param3");
        Intrinsics.checkNotNullParameter(param4, "param4");
        Intrinsics.checkNotNullParameter(param5, "param5");
        Intrinsics.checkNotNullParameter(param6, "param6");
        Intrinsics.checkNotNullParameter(param7, "param7");
        Intrinsics.checkNotNullParameter(param8, "param8");
        Intrinsics.checkNotNullParameter(param9, "param9");
        Intrinsics.checkNotNullParameter(param10, "param10");
        Intrinsics.checkNotNullParameter(param11, "param11");
        Intrinsics.checkNotNullParameter(param12, "param12");
        Intrinsics.checkNotNullParameter(param13, "param13");
        this.param0 = param0;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.param6 = param6;
        this.param7 = param7;
        this.param8 = param8;
        this.param9 = param9;
        this.param10 = param10;
        this.param11 = param11;
        this.param12 = param12;
        this.param13 = param13;
    }

    public AttaEvent(@NotNull String eventCode) {
        Intrinsics.checkNotNullParameter(eventCode, "eventCode");
        this.eventCode = eventCode;
        this.id = -1;
        this.appVersion = "";
        this.appName = "";
        this.appBundleId = "";
        this.appKey = "";
        this.clientType = "android";
        this.userId = "";
        this.sdkVersion = "";
        this.deviceId = "";
        this.osVersion = "";
        this.manufacturer = "";
        this.model = "";
        this.productId = "";
        this.fullOSVersion = "";
        this.eventResult = 1;
        this.param0 = "";
        this.param1 = "";
        this.param2 = "";
        this.param3 = "";
        this.param4 = "";
        this.param5 = "";
        this.param6 = "";
        this.param7 = "";
        this.param8 = "";
        this.param9 = "";
        this.param10 = "";
        this.param11 = "";
        this.param12 = "";
        this.param13 = "";
    }

    @NotNull
    public final String getAppBundleId() {
        return this.appBundleId;
    }

    @NotNull
    public final String getAppKey() {
        return this.appKey;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getClientType() {
        return this.clientType;
    }

    public final int getDebug() {
        return this.debug;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getEventCode() {
        return this.eventCode;
    }

    public final int getEventCost() {
        return this.eventCost;
    }

    public final int getEventResult() {
        return this.eventResult;
    }

    public final long getEventTime() {
        return this.eventTime;
    }

    @NotNull
    public final String getFullOSVersion() {
        return this.fullOSVersion;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getParam0() {
        return this.param0;
    }

    @NotNull
    public final String getParam1() {
        return this.param1;
    }

    @NotNull
    public final String getParam10() {
        return this.param10;
    }

    @NotNull
    public final String getParam11() {
        return this.param11;
    }

    @NotNull
    public final String getParam12() {
        return this.param12;
    }

    @NotNull
    public final String getParam13() {
        return this.param13;
    }

    @NotNull
    public final String getParam2() {
        return this.param2;
    }

    @NotNull
    public final String getParam3() {
        return this.param3;
    }

    @NotNull
    public final String getParam4() {
        return this.param4;
    }

    @NotNull
    public final String getParam5() {
        return this.param5;
    }

    @NotNull
    public final String getParam6() {
        return this.param6;
    }

    @NotNull
    public final String getParam7() {
        return this.param7;
    }

    @NotNull
    public final String getParam8() {
        return this.param8;
    }

    @NotNull
    public final String getParam9() {
        return this.param9;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void setAppBundleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appBundleId = str;
    }

    public final void setAppKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appKey = str;
    }

    public final void setAppName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appName = str;
    }

    public final void setAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setDebug(int i11) {
        this.debug = i11;
    }

    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setErrorCode(int i11) {
        this.errorCode = i11;
    }

    public final void setEventCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventCode = str;
    }

    public final void setEventCost(int i11) {
        this.eventCost = i11;
    }

    public final void setEventResult(int i11) {
        this.eventResult = i11;
    }

    public final void setEventTime(long j11) {
        this.eventTime = j11;
    }

    public final void setFullOSVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fullOSVersion = str;
    }

    public final void setId(int i11) {
        this.id = i11;
    }

    public final void setManufacturer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.manufacturer = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setOsVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.osVersion = str;
    }

    public final void setParam0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param0 = str;
    }

    public final void setParam1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param1 = str;
    }

    public final void setParam10(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param10 = str;
    }

    public final void setParam11(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param11 = str;
    }

    public final void setParam12(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param12 = str;
    }

    public final void setParam13(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param13 = str;
    }

    public final void setParam2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param2 = str;
    }

    public final void setParam3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param3 = str;
    }

    public final void setParam4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param4 = str;
    }

    public final void setParam5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param5 = str;
    }

    public final void setParam6(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param6 = str;
    }

    public final void setParam7(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param7 = str;
    }

    public final void setParam8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param8 = str;
    }

    public final void setParam9(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param9 = str;
    }

    public final void setProductId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productId = str;
    }

    public final void setSdkVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sdkVersion = str;
    }

    public final void setUploadTime(long j11) {
        this.uploadTime = j11;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "AttaEvent(eventCode='" + this.eventCode + "', id=" + this.id + ", appVersion='" + this.appVersion + "', appName='" + this.appName + "', appBundleId='" + this.appBundleId + "', appKey='" + this.appKey + "', clientType='" + this.clientType + "', userId='" + this.userId + "', sdkVersion='" + this.sdkVersion + "', eventTime=" + this.eventTime + ", uploadTime=" + this.uploadTime + ", deviceId='" + this.deviceId + "', osVersion='" + this.osVersion + "', manufacturer='" + this.manufacturer + "', model='" + this.model + "', productId='" + this.productId + "', fullOSVersion='" + this.fullOSVersion + "', eventResult=" + this.eventResult + ", eventCost=" + this.eventCost + ", errorCode=" + this.errorCode + ", debug=" + this.debug + ", param0='" + this.param0 + "', param1='" + this.param1 + "', param2='" + this.param2 + "', param3='" + this.param3 + "', param4='" + this.param4 + "', param5='" + this.param5 + "', param6='" + this.param6 + "', param7='" + this.param7 + "', param8='" + this.param8 + "', param9='" + this.param9 + "', param10='" + this.param10 + "', param11='" + this.param11 + "', param12='" + this.param12 + "', param13='" + this.param13 + "')";
    }

    public final void setParams(@NotNull String... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.param0 = getParam(0, params);
        this.param1 = getParam(1, params);
        this.param2 = getParam(2, params);
        this.param3 = getParam(3, params);
        this.param4 = getParam(4, params);
        this.param5 = getParam(5, params);
        this.param6 = getParam(6, params);
        this.param7 = getParam(7, params);
        this.param8 = getParam(8, params);
        this.param9 = getParam(9, params);
        this.param10 = getParam(10, params);
        this.param11 = getParam(11, params);
        this.param12 = getParam(12, params);
        this.param13 = getParam(13, params);
    }

    public /* synthetic */ AttaEvent(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
