package com.tencent.bugly.common.reporter.upload;

import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J(\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/UploadCallback;", "Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", TUIConstants.TUIChat.CALL_BACK, "(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)V", "getCallback", "()Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;", "getReportData", "()Lcom/tencent/bugly/common/reporter/data/ReportData;", "onBlocked", "", "dbId", "", "onCached", "onFailure", "errorCode", "errorMsg", "", "contentLength", "onSuccess", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class UploadCallback implements IReporter.ReportCallback {

    @Nullable
    private final IReporter.ReportCallback callback;

    @NotNull
    private final ReportData reportData;

    @Nullable
    public final IReporter.ReportCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final ReportData getReportData() {
        return this.reportData;
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onBlocked(int dbId) {
        IReporter.ReportCallback reportCallback = this.callback;
        if (reportCallback != null) {
            reportCallback.onBlocked(dbId);
        }
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onCached() {
        IReporter.ReportCallback reportCallback = this.callback;
        if (reportCallback != null) {
            reportCallback.onCached();
        }
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onFailure(int errorCode, @NotNull String errorMsg, int dbId, int contentLength) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        IReporter.ReportCallback reportCallback = this.callback;
        if (reportCallback != null) {
            reportCallback.onFailure(errorCode, errorMsg, dbId, contentLength);
        }
        this.reportData.checkAndDelFiles(false);
        UploadListenerMng.m72171a(this.reportData.getPluginName(), this.reportData.getClientIdentify());
    }

    @Override // com.tencent.bugly.common.reporter.IReporter.ReportCallback
    public void onSuccess(int dbId, int contentLength) {
        IReporter.ReportCallback reportCallback = this.callback;
        if (reportCallback != null) {
            reportCallback.onSuccess(dbId, contentLength);
        }
        this.reportData.checkAndDelFiles(true);
        UploadListenerMng.m72172b(this.reportData.getPluginName(), this.reportData.getClientIdentify());
    }

    public UploadCallback(@NotNull ReportData reportData, @Nullable IReporter.ReportCallback reportCallback) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.reportData = reportData;
        this.callback = reportCallback;
    }
}
