package com.tencent.bugly.common.reporter.upload;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.bugly.proguard.C33597d2;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C34025xh;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.net.URL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0002J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J \u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J \u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u001a\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006#"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/UploadProxy;", "Lcom/tencent/bugly/common/reporter/IReporter;", "context", "Landroid/content/Context;", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "(Landroid/content/Context;Ljava/lang/String;)V", "mAppId", "getMAppId", "()Ljava/lang/String;", "setMAppId", "(Ljava/lang/String;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "checkAttrBeforeReport", "", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", "getContext", "getFileUploadUrl", "reportType", "", "getJsonUploadUrl", "getMD5Params", "reportFile", "url", TUIConstants.TUIChat.CALL_BACK, "Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "reportForVersion1", "reportJson", "reportNow", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class UploadProxy implements IReporter {

    @Nullable
    private String mAppId;

    @Nullable
    private Context mContext;

    @NotNull
    public final String getFileUploadUrl(int reportType) {
        if (reportType != 1) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C33597d2.m72768b());
        sb2.append("/v1/");
        return C34025xh.m75464a(sb2, this.mAppId, "/upload-file");
    }

    @NotNull
    public final String getJsonUploadUrl(int reportType) {
        if (reportType != 1) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C33597d2.m72768b());
        sb2.append("/v1/");
        return C34025xh.m75464a(sb2, this.mAppId, "/upload-json");
    }

    private final Context getContext() {
        Context context = this.mContext;
        return context != null ? context : C33598d3.m72772c();
    }

    @Nullable
    public final String getMAppId() {
        return this.mAppId;
    }

    @Nullable
    public final Context getMContext() {
        return this.mContext;
    }

    public final void setMAppId(@Nullable String str) {
        this.mAppId = str;
    }

    public final void setMContext(@Nullable Context context) {
        this.mContext = context;
    }

    public UploadProxy(@Nullable Context context, @Nullable String str) {
        this.mContext = context;
        this.mAppId = str;
    }

    private final void checkAttrBeforeReport(ReportData reportData) throws JSONException {
        if (reportData.getParams().has(C33820nf.f71160p)) {
            Context context = getContext();
            JSONObject jSONObject = reportData.getParams().getJSONObject(C33820nf.f71160p);
            if (!jSONObject.has("process_name")) {
                jSONObject.put("process_name", ProcessUtil.INSTANCE.getCurrentProcessName(context));
            }
            if (!jSONObject.has("is64bit") && context != null) {
                jSONObject.put("is64bit", ProcessUtil.INSTANCE.is64BitProcess(context));
            }
        }
    }

    private final void reportForVersion1(ReportData reportData, IReporter.ReportCallback callback) {
        if (reportData.getUploadFilePath().length() == 0) {
            reportJson(reportData, getJsonUploadUrl(reportData.getReportType()) + getMD5Params(reportData), callback);
            return;
        }
        reportFile(reportData, getFileUploadUrl(reportData.getReportType()) + getMD5Params(reportData), callback);
    }

    @NotNull
    public final String getMD5Params(@NotNull ReportData reportData) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return "?timestamp=" + System.currentTimeMillis() + "&nonce=" + reportData.getParams().optString(C33820nf.f71156l, "clientidnull");
    }

    public final void reportFile(@NotNull ReportData reportData, @NotNull String url, @Nullable IReporter.ReportCallback callback) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(url, "url");
        new FileUploadRunnable(new URL(url), reportData, new UploadCallback(reportData, callback)).request();
    }

    public final void reportJson(@NotNull ReportData reportData, @NotNull String url, @Nullable IReporter.ReportCallback callback) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(url, "url");
        new JsonUploadRunnable(new URL(url), reportData, new UploadCallback(reportData, callback)).request();
    }

    @Override // com.tencent.bugly.common.reporter.IReporter
    public boolean reportNow(@NotNull ReportData reportData, @Nullable IReporter.ReportCallback callback) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        try {
            checkAttrBeforeReport(reportData);
            if (reportData.getReportType() != 1) {
                return false;
            }
            reportForVersion1(reportData, callback);
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
