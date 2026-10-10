package com.tencent.rtmp.video;

/* JADX INFO: loaded from: classes56.dex */
public interface VirtualDisplayListener {
    void onCaptureError();

    void onStartFinish(boolean z11, boolean z12);

    void onVirtualDisplayCreate(VirtualDisplayWrapper virtualDisplayWrapper);
}
