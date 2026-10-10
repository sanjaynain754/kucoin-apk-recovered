package com.tencent.bugly.common.reporter.upload;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.proguard.C33588ce;
import com.tencent.bugly.proguard.C33864ph;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ4\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\rH\u0002¨\u0006\u0016"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/JsonUploadRunnable;", "Lcom/tencent/bugly/common/reporter/upload/ReporterUpload;", "url", "Ljava/net/URL;", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", TUIConstants.TUIChat.CALL_BACK, "Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "(Ljava/net/URL;Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V", "buildHeader", "", "headers", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "encryptKey", "request", "upload", "", "connection", "Ljava/net/HttpURLConnection;", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class JsonUploadRunnable extends ReporterUpload {

    @NotNull
    public static final String TAG = "RMonitor_report_Json";

    private final void buildHeader(HashMap<String, String> headers, String encryptKey) {
        headers.put("Content-Encoding", "gzip, encrypt");
        if (getReportData().getReportType() == 1) {
            headers.put("Content-Type", "application/json");
        }
        if (!isEnableEncryptAttachment()) {
            headers.put("X-ENCRYPTION-KEY", encryptKey);
            headers.put("X-ENCRYPTION-VERSION", "v1");
        } else {
            headers.put("X-ENCRYPTION-KEY", UploadEncrypt.INSTANCE.getEncryptKey(encryptKey));
            headers.put("X-ENCRYPTION-KEY-ID", "c6c3fd0c");
            headers.put("X-ENCRYPTION-VERSION", "v2");
        }
    }

    private final int upload(HttpURLConnection connection, String encryptKey) {
        if (connection == null) {
            return 0;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                String string = getReportData().getParams().toString();
                Intrinsics.checkNotNullExpressionValue(string, "reportData.params.toString()");
                Charset charsetForName = Charset.forName("utf-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = string.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.finish();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(gZIPOutputStream, null);
                DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
                try {
                    UploadEncrypt.Companion companion = UploadEncrypt.INSTANCE;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "byteOutputStream.toByteArray()");
                    dataOutputStream.write(companion.doUploadEncrypt(byteArray, encryptKey));
                    int size = dataOutputStream.size();
                    CloseableKt.closeFinally(dataOutputStream, null);
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    dealResp(readResp(TAG, connection), connection.getResponseCode(), size);
                    return size;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(dataOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(gZIPOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                CloseableKt.closeFinally(byteArrayOutputStream, th6);
                throw th7;
            }
        }
    }

    @Override // com.tencent.bugly.common.reporter.upload.BaseUpload
    public void request() {
        if (whetherBlock()) {
            C33864ph.m74585a(getCallback(), C33864ph.f71457c, getReportData(), 0, "", 0);
            return;
        }
        if (!NetworkWatcher.INSTANCE.isNetworkConnectedRealtime()) {
            C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 602, "network not available", 0);
            return;
        }
        C33588ce.m72684b().m72689b(getReportData().getParams());
        HashMap<String, String> map = new HashMap<>();
        String strCreateEncryptKey = UploadEncrypt.INSTANCE.createEncryptKey();
        buildHeader(map, strCreateEncryptKey);
        C33864ph.m74587a(JPushConstants.Analysis.KEY_JSON, getUrl().toString(), getReportData());
        HttpURLConnection httpURLConnectionConnectionBuilder = connectionBuilder(map, getReportData().getReportStrategy().getConnectTimeout(), getReportData().getReportStrategy().getReadTimeout());
        try {
            try {
                try {
                    try {
                        upload(httpURLConnectionConnectionBuilder, strCreateEncryptKey);
                        if (httpURLConnectionConnectionBuilder != null) {
                            httpURLConnectionConnectionBuilder.disconnect();
                        }
                    } catch (Throwable th2) {
                        Logger.INSTANCE.mo77131e(TAG, getReportData().getEventName(), th2.toString());
                        C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 700, th2.getMessage(), 0);
                        if (httpURLConnectionConnectionBuilder != null) {
                        }
                    }
                } catch (Exception e11) {
                    Logger.INSTANCE.mo77131e(TAG, getReportData().getEventName(), e11.toString());
                    C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 603, e11.getMessage(), 0);
                    if (httpURLConnectionConnectionBuilder != null) {
                    }
                }
            } catch (OutOfMemoryError unused) {
                C33864ph.m74585a(getCallback(), C33864ph.f71456b, getReportData(), 600, "OutOfMemoryError", 0);
                if (httpURLConnectionConnectionBuilder != null) {
                }
            }
        } catch (Throwable th3) {
            if (httpURLConnectionConnectionBuilder != null) {
                httpURLConnectionConnectionBuilder.disconnect();
            }
            throw th3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonUploadRunnable(@NotNull URL url, @NotNull ReportData reportData, @Nullable IReporter.ReportCallback reportCallback) {
        super(url, reportData, reportCallback);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
    }
}
