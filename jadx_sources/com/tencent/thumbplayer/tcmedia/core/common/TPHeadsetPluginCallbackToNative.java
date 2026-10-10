package com.tencent.thumbplayer.tcmedia.core.common;

import java.util.Set;

/* JADX INFO: loaded from: classes63.dex */
public class TPHeadsetPluginCallbackToNative implements TPHeadsetPluginDetector.HeadsetPluginListener {
    private static final String TAG = "TPHeadsetPluginCallback";
    private long mNativeContext;

    private native void _onAudioRouteChanged(Set<Integer> set, Set<Integer> set2);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.common.TPHeadsetPluginDetector.HeadsetPluginListener
    public void onHeadsetPlugin(Set<Integer> set, Set<Integer> set2) {
        TPNativeLog.printLog(2, TAG, "onHeadsetPlugin: oldOutputs: " + set + ", newOutputs: " + set2);
        _onAudioRouteChanged(set, set2);
    }

    private TPHeadsetPluginCallbackToNative(long j11) {
        this.mNativeContext = j11;
    }

    private void registerCallback() {
        TPHeadsetPluginDetector.addHeadsetPluginListener(this);
    }

    private void unregisterCallback() {
        TPHeadsetPluginDetector.removeHeadsetPluginListener(this);
    }
}
