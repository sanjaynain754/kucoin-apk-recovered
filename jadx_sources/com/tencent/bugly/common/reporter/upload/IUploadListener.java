package com.tencent.bugly.common.reporter.upload;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public interface IUploadListener {
    void onReportFailure(String str, String str2);

    void onReportSuccess(String str, String str2);
}
