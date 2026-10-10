package com.tencent.thumbplayer.tcmedia.core.common;

/* JADX INFO: loaded from: classes63.dex */
public class TPAudioPassThroughPluginCallbackToNative implements TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener {
    private static final String TAG = "TPAudioPassThroughPluginCallback";
    private long mNativeContext;

    private native void _onAudioPassThroughStateChanged(boolean z11);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.common.TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener
    public void onAudioPassThroughPlugin(boolean z11) {
        TPNativeLog.printLog(2, TAG, "onAudioPassThroughPlugin bPlugin:".concat(String.valueOf(z11)));
        _onAudioPassThroughStateChanged(z11);
    }

    private TPAudioPassThroughPluginCallbackToNative(long j11) {
        this.mNativeContext = j11;
    }

    private void registerCallback() {
        TPAudioPassThroughPluginDetector.addListener(this);
    }

    private void unregisterCallback() {
        TPAudioPassThroughPluginDetector.removeListener(this);
    }
}
