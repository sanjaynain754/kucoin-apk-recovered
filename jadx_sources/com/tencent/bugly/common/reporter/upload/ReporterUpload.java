package com.tencent.bugly.common.reporter.upload;

import android.text.TextUtils;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.proguard.AbstractC34022xe;
import com.tencent.bugly.proguard.C33579c5;
import com.tencent.bugly.proguard.C33786m2;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33864ph;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J%\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/ReporterUpload;", "Lcom/tencent/bugly/common/reporter/upload/QAPMUpload;", "url", "Ljava/net/URL;", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", TUIConstants.TUIChat.CALL_BACK, "Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "(Ljava/net/URL;Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V", "getCallback", "()Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "getReportData", "()Lcom/tencent/bugly/common/reporter/data/ReportData;", "dealEntranceResponse", "", "resp", "", "dealResp", "responseCode", "", "contentLength", "(Ljava/lang/String;II)Lkotlin/Unit;", "getRetCode", "isEnableEncryptAttachment", "", "isSucceeded", "readResp", "tag", "connection", "Ljava/net/HttpURLConnection;", "whetherBlock", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public abstract class ReporterUpload extends QAPMUpload {
    public static final int BUFFER_SIZE = 8192;
    public static final int STATUS_0 = 0;
    public static final int STATUS_JSON_ERROR = -1;

    @NotNull
    public static final String TAG = "Bugly_RUpload";

    @Nullable
    private final IReporter.ReportCallback callback;

    @NotNull
    private final ReportData reportData;

    private final void dealEntranceResponse(String resp) {
        try {
            C33579c5.m72639a(this.reportData.getParams().optString(C33820nf.f71149e, ""), this.reportData.getParams().optString(C33820nf.f71150f, ""), new JSONObject(resp));
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(TAG, th2 + ": response parameter json error in deal resp.");
        }
    }

    private final int getRetCode(String resp) {
        try {
            return new JSONObject(resp).getInt("code");
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(TAG, th2 + ": response parameter json error in get ret code.");
            return -1;
        }
    }

    @Nullable
    public final IReporter.ReportCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final ReportData getReportData() {
        return this.reportData;
    }

    public final boolean whetherBlock() {
        boolean zM72641c;
        try {
            zM72641c = C33579c5.m72641c(this.reportData.getParams().optString(C33820nf.f71149e, ""), this.reportData.getParams().optString(C33820nf.f71150f, ""));
        } catch (Throwable unused) {
            zM72641c = false;
        }
        if (zM72641c) {
            Logger.INSTANCE.mo77130d(TAG, "block report with " + this.reportData);
        }
        return zM72641c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReporterUpload(@NotNull URL url, @NotNull ReportData reportData, @Nullable IReporter.ReportCallback reportCallback) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.reportData = reportData;
        this.callback = reportCallback;
    }

    @Nullable
    public final Unit dealResp(@NotNull String resp, int responseCode, int contentLength) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        if (isSucceeded(resp)) {
            dealEntranceResponse(resp);
            C33864ph.m74585a(this.callback, "success", this.reportData, 0, resp, contentLength);
        } else {
            C33864ph.m74585a(this.callback, C33864ph.f71456b, this.reportData, responseCode, resp, contentLength);
        }
        return Unit.INSTANCE;
    }

    public final boolean isEnableEncryptAttachment() {
        AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33786m2.f70892t);
        if (abstractC34022xeM77083a != null && (abstractC34022xeM77083a instanceof C33786m2) && ((C33786m2) abstractC34022xeM77083a).m74021d()) {
            return true;
        }
        return false;
    }

    public final boolean isSucceeded(@NotNull String resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        if (TextUtils.isEmpty(resp) || getRetCode(resp) == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String readResp(@NotNull String tag, @NotNull HttpURLConnection connection) throws IOException {
        InputStream inputStream;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection.getResponseCode() >= 400) {
            inputStream = connection.getErrorStream();
        } else {
            inputStream = connection.getInputStream();
        }
        String stream = FileUtil.INSTANCE.readStream(new BufferedInputStream(inputStream), 8192);
        if (connection.getResponseCode() != 200) {
            Logger.INSTANCE.mo77134w(tag, "responseCode:" + connection.getResponseCode() + " resp: " + stream);
        }
        return stream;
    }
}
