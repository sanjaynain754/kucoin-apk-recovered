package com.tencent.rmonitor.sla;

import android.text.TextUtils;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.common.reporter.upload.QAPMUpload;
import com.tencent.bugly.common.utils.StringUtil;
import com.tencent.bugly.proguard.C33791m7;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.rmonitor.base.p144db.table.AttaEventTable;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.FileUtil;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J$\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaEventReportTask;", "Lcom/tencent/bugly/common/reporter/upload/QAPMUpload;", "Ljava/lang/Runnable;", "url", "Ljava/net/URL;", TIMPushConstants.PUSH_REPORT_EVENT_LIST_KEY, "", "Lcom/tencent/rmonitor/sla/AttaEvent;", "(Ljava/net/URL;Ljava/util/List;)V", "buildAttaBody", "", "buildAttaBodyInternal", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "key", "value", "dealValue", "getFormatTime", "timeInMillis", "", "report", "", "request", "run", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AttaEventReportTask extends QAPMUpload implements Runnable {

    @NotNull
    private static final String ATTA_ID = "08e00055686";

    @NotNull
    private static final String ATTA_TOKEN = "8666841551";

    @NotNull
    public static final String TAG = "RMonitor_sla_AttaEventReportTask";

    @NotNull
    private final List<AttaEvent> eventList;

    @NotNull
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttaEventReportTask(@NotNull URL url, @NotNull List<AttaEvent> eventList) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        this.eventList = eventList;
    }

    private final String dealValue(String value) {
        return value != null ? StringUtil.encode(StringsKt.replace$default(value, "$", "\\$", false, 4, (Object) null)) : "";
    }

    private final String getFormatTime(long timeInMillis) {
        try {
            String str = TIME_FORMAT.format(new Date(timeInMillis));
            Intrinsics.checkNotNullExpressionValue(str, "TIME_FORMAT.format(date)");
            return str;
        } catch (Throwable th2) {
            String strValueOf = String.valueOf(timeInMillis);
            Logger logger = Logger.INSTANCE;
            String message = th2.getMessage();
            Intrinsics.checkNotNull(message);
            logger.mo77131e(TAG, "getFormatTime", message);
            return strValueOf;
        }
    }

    public final boolean report() {
        boolean z11 = false;
        if (C33791m7.m74059g()) {
            Logger.INSTANCE.mo77134w(TAG, "report atta event fail for app in standalone mode.");
            return false;
        }
        if (this.eventList.isEmpty()) {
            Logger.INSTANCE.mo77132i(TAG, "event list is empty");
            return false;
        }
        if (!NetworkWatcher.INSTANCE.isNetworkConnectedRealtime()) {
            Logger.INSTANCE.mo77132i(TAG, "network not available");
            return false;
        }
        Logger logger = Logger.INSTANCE;
        logger.mo77130d(TAG, "atta report url: " + getUrl());
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("Atta-Type", "batch-report");
        HttpURLConnection httpURLConnectionConnectionBuilder$default = QAPMUpload.connectionBuilder$default(this, map, 0, 0, 6, null);
        if (httpURLConnectionConnectionBuilder$default != null) {
            try {
                String strBuildAttaBody = buildAttaBody(this.eventList);
                logger.mo77130d(TAG, "atta report data:" + strBuildAttaBody);
                if (strBuildAttaBody != null) {
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnectionConnectionBuilder$default.getOutputStream());
                    try {
                        Charset charsetForName = Charset.forName("utf-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                        byte[] bytes = strBuildAttaBody.getBytes(charsetForName);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        dataOutputStream.write(bytes);
                        dataOutputStream.flush();
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(dataOutputStream, null);
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnectionConnectionBuilder$default.getInputStream());
                        try {
                            String stream = FileUtil.INSTANCE.readStream(bufferedInputStream, 8192);
                            CloseableKt.closeFinally(bufferedInputStream, null);
                            int responseCode = httpURLConnectionConnectionBuilder$default.getResponseCode();
                            String headerField = httpURLConnectionConnectionBuilder$default.getHeaderField("Content-Type");
                            boolean z12 = responseCode == 200;
                            logger.mo77130d(TAG, "atta report respCode: " + responseCode + ", contentLen: " + strBuildAttaBody.length() + ", contentType: " + headerField + ", body: " + stream);
                            z11 = z12;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(bufferedInputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            CloseableKt.closeFinally(dataOutputStream, th4);
                            throw th5;
                        }
                    }
                }
            } catch (Throwable th6) {
                try {
                    Logger.INSTANCE.exception(TAG, th6);
                    return false;
                } finally {
                    httpURLConnectionConnectionBuilder$default.disconnect();
                }
            }
        }
        if (httpURLConnectionConnectionBuilder$default != null) {
            httpURLConnectionConnectionBuilder$default.disconnect();
        }
        return z11;
    }

    private final String buildAttaBody(List<AttaEvent> eventList) {
        if (eventList.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(300);
        JSONArray jSONArray = new JSONArray();
        for (AttaEvent attaEvent : eventList) {
            sb2.setLength(0);
            buildAttaBodyInternal(sb2, "app_version", dealValue(attaEvent.getAppVersion()));
            buildAttaBodyInternal(sb2, "app_name", dealValue(attaEvent.getAppName()));
            buildAttaBodyInternal(sb2, "app_bundle_id", dealValue(attaEvent.getAppBundleId()));
            buildAttaBodyInternal(sb2, "app_key", dealValue(attaEvent.getAppKey()));
            buildAttaBodyInternal(sb2, "client_type", attaEvent.getClientType());
            buildAttaBodyInternal(sb2, "user_id", dealValue(attaEvent.getUserId()));
            buildAttaBodyInternal(sb2, "sdk_version", attaEvent.getSdkVersion());
            buildAttaBodyInternal(sb2, "event_code", attaEvent.getEventCode());
            buildAttaBodyInternal(sb2, "event_result", String.valueOf(attaEvent.getEventResult()));
            buildAttaBodyInternal(sb2, "event_time", getFormatTime(attaEvent.getEventTime()));
            buildAttaBodyInternal(sb2, "event_cost", String.valueOf(attaEvent.getEventCost()));
            buildAttaBodyInternal(sb2, "error_code", String.valueOf(attaEvent.getErrorCode()));
            buildAttaBodyInternal(sb2, "upload_time", getFormatTime(attaEvent.getUploadTime()));
            buildAttaBodyInternal(sb2, "device_id", dealValue(attaEvent.getDeviceId()));
            buildAttaBodyInternal(sb2, "os_version", dealValue(attaEvent.getOsVersion()));
            buildAttaBodyInternal(sb2, "manufacturer", dealValue(attaEvent.getManufacturer()));
            buildAttaBodyInternal(sb2, "model", dealValue(attaEvent.getModel()));
            buildAttaBodyInternal(sb2, "debug", String.valueOf(attaEvent.getDebug()));
            buildAttaBodyInternal(sb2, "product_id", dealValue(attaEvent.getProductId()));
            buildAttaBodyInternal(sb2, "full_os_version", dealValue(attaEvent.getFullOSVersion()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_0, dealValue(attaEvent.getParam0()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_1, dealValue(attaEvent.getParam1()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_2, dealValue(attaEvent.getParam2()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_3, dealValue(attaEvent.getParam3()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_4, dealValue(attaEvent.getParam4()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_5, dealValue(attaEvent.getParam5()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_6, dealValue(attaEvent.getParam6()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_7, dealValue(attaEvent.getParam7()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_8, dealValue(attaEvent.getParam8()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_9, dealValue(attaEvent.getParam9()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_10, dealValue(attaEvent.getParam10()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_11, dealValue(attaEvent.getParam11()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_12, dealValue(attaEvent.getParam12()));
            buildAttaBodyInternal(sb2, AttaEventTable.COLUMN_PARAM_13, dealValue(attaEvent.getParam13()));
            jSONArray.put(sb2.toString());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InterfaceC33826o0.f71243o, "08e00055686");
            jSONObject.put(InterfaceC33826o0.f71244p, "8666841551");
            jSONObject.put("type", "batch");
            jSONObject.put("version", "v1.0.0");
            jSONObject.put("datas", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e11) {
            Logger.INSTANCE.exception(TAG, e11);
            return null;
        }
    }

    private final void buildAttaBodyInternal(StringBuilder builder, String key, String value) {
        if (TextUtils.isEmpty(value)) {
            return;
        }
        if (builder.length() == 0) {
            builder.append(key);
            builder.append("=");
            builder.append(value);
        } else {
            builder.append("&");
            builder.append(key);
            builder.append("=");
            builder.append(value);
        }
    }

    @Override // com.tencent.bugly.common.reporter.upload.BaseUpload
    public void request() {
        report();
    }

    @Override // java.lang.Runnable
    public void run() {
        report();
    }
}
