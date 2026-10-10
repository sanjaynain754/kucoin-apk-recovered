package com.tencent.feedback.upload;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public interface UploadHandleListener {
    void onUploadEnd(int i11, int i12, long j11, long j12, boolean z11, String str, String str2, long j13);

    void onUploadStart(int i11);
}
