package com.tencent.liteav.live;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class V2TXLivePremierJni {
    private static final String TAG = "V2TXLivePremierJni";
    private static long mNativeV2TXLivePremierJni;
    private static V2TXLivePremier.V2TXLivePremierObserver sObserver;

    private static native int nativeCallExperimentalAPI(long j11, String str);

    private static native long nativeCreate();

    private static native int nativeEnableAudioCaptureObserver(long j11, boolean z11, int i11, int i12, int i13, int i14);

    private static native int nativeEnableAudioPlayoutObserver(long j11, boolean z11, int i11, int i12, int i13, int i14);

    private static native int nativeEnableVoiceEarMonitorObserver(long j11, boolean z11);

    private static native long nativeGetObjectAddress(long j11, Object obj);

    private static native void nativeReleaseObjectAddress(long j11, long j12);

    private static void createNativeV2TXLivePremierIfNeed() {
        synchronized (V2TXLivePremierJni.class) {
            try {
                if (mNativeV2TXLivePremierJni == 0) {
                    mNativeV2TXLivePremierJni = nativeCreate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int enableAudioCaptureObserver(boolean z11, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            LiteavLog.m76093w(TAG, "Enable audio capture observer failed, format is null.");
            return -2;
        }
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableAudioCaptureObserver(mNativeV2TXLivePremierJni, z11, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    public static int enableAudioPlayoutObserver(boolean z11, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            LiteavLog.m76093w(TAG, "Enable audio playout observer failed, format is null.");
            return -2;
        }
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableAudioPlayoutObserver(mNativeV2TXLivePremierJni, z11, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    public static void onAudioCaptureData(byte[] bArr, long j11, int i11, int i12) {
        V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i11;
        v2TXLiveAudioFrame.channel = i12;
        v2TXLiveAudioFrame.timestamp = j11;
        v2TXLivePremierObserver.onCaptureAudioFrame(v2TXLiveAudioFrame);
    }

    public static void onAudioPlayoutData(byte[] bArr, long j11, int i11, int i12) {
        V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i11;
        v2TXLiveAudioFrame.channel = i12;
        v2TXLiveAudioFrame.timestamp = j11;
        v2TXLivePremierObserver.onPlayoutAudioFrame(v2TXLiveAudioFrame);
    }

    public static void onEarMonitoringData(byte[] bArr, int i11, int i12) {
        V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i11;
        v2TXLiveAudioFrame.channel = i12;
        v2TXLivePremierObserver.onVoiceEarMonitorAudioFrame(v2TXLiveAudioFrame);
    }

    public static void setObserver(V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        sObserver = v2TXLivePremierObserver;
    }

    static {
        SoLoader.loadAllLibraries();
        mNativeV2TXLivePremierJni = 0L;
    }

    public static int callExperimentalAPI(String str) {
        createNativeV2TXLivePremierIfNeed();
        return nativeCallExperimentalAPI(mNativeV2TXLivePremierJni, str);
    }

    public static int enableVoiceEarMonitorObserver(boolean z11) {
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableVoiceEarMonitorObserver(mNativeV2TXLivePremierJni, z11);
    }

    public static long getObjectAddress(Object obj) {
        createNativeV2TXLivePremierIfNeed();
        return nativeGetObjectAddress(mNativeV2TXLivePremierJni, obj);
    }

    public static void releaseObjectAddress(long j11) {
        createNativeV2TXLivePremierIfNeed();
        nativeReleaseObjectAddress(mNativeV2TXLivePremierJni, j11);
    }
}
