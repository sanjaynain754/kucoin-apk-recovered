package com.tencent.thumbplayer.tcmedia.core.common;

/* JADX INFO: loaded from: classes63.dex */
public class TPScreenRefreshRateCallBackToNative implements TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener {
    private static final String TAG = "TPScreenRefreshRateCallBack";
    private long mNativeContext;

    private native void _onScreenRefreshRateChanged(float f11);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.common.TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener
    public void onScreenRefreshRateChanged(float f11) {
        TPNativeLog.printLog(2, TAG, "onScreenRefreshRateChanged refreshRate:".concat(String.valueOf(f11)));
        _onScreenRefreshRateChanged(f11);
    }

    private TPScreenRefreshRateCallBackToNative(long j11) {
        this.mNativeContext = j11;
    }

    private void registerCallback() {
        TPScreenRefreshRateDetector.addListener(this);
    }

    private void unregisterCallback() {
        TPScreenRefreshRateDetector.removeListener(this);
    }
}
