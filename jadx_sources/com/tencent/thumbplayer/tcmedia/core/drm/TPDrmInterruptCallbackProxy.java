package com.tencent.thumbplayer.tcmedia.core.drm;

import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;

/* JADX INFO: loaded from: classes63.dex */
public final class TPDrmInterruptCallbackProxy implements ITPDrmInterruptCallback {
    private long mNativeContext;

    private native boolean native_isInterrupted();

    private TPDrmInterruptCallbackProxy() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.drm.ITPDrmInterruptCallback
    public final boolean isInterrupted() {
        try {
            return native_isInterrupted();
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            return false;
        }
    }
}
