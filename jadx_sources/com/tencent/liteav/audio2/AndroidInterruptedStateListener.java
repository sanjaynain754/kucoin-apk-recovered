package com.tencent.liteav.audio2;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::audio")
public class AndroidInterruptedStateListener implements C34670d.a, C34671e.b {
    private static final int RECORDING_CONFIGS_LIMIT = 10;
    public static final String TAG = "AndroidInterruptedStateListener";
    private static C34670d mRecordingCallback = new C34670d();
    private final long mNativeRecordingConfigListener;
    private volatile boolean mNeedNotify = false;
    private Object mObject = new Object();
    private C34671e mPhoneStateManager;

    public static class RecordingConfig {

        /* JADX INFO: renamed from: a */
        int f73340a = 0;

        /* JADX INFO: renamed from: b */
        boolean f73341b = false;

        public int getSessionId() {
            return this.f73340a;
        }

        public boolean isSilenced() {
            return this.f73341b;
        }
    }

    private static native void nativeNotifyAudioRecordingConfigChangedFromJava(long j11, RecordingConfig[] recordingConfigArr);

    private static native void nativeNotifyInterruptedByPhoneCallFromJava(long j11);

    private static native void nativeNotifyResumedByPhoneCallFromJava(long j11);

    public static /* synthetic */ void lambda$registerAudioRecordingCallback$0(AndroidInterruptedStateListener androidInterruptedStateListener) {
        if (androidInterruptedStateListener.mPhoneStateManager == null) {
            androidInterruptedStateListener.mPhoneStateManager = new C34671e(androidInterruptedStateListener);
        }
        C34671e c34671e = androidInterruptedStateListener.mPhoneStateManager;
        if (C34671e.m76005b()) {
            try {
                TelephonyManager telephonyManager = c34671e.f73350a;
                if (telephonyManager != null) {
                    telephonyManager.listen(c34671e, 32);
                } else {
                    Log.m76036w("PhoneStateManager", "TelephonyManager is null, start listen phone state failed.", new Object[0]);
                }
            } catch (Throwable th2) {
                Log.m76033e("PhoneStateManager", "start listen phone state failed, " + th2.getMessage(), new Object[0]);
            }
        } else {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                try {
                    if (c34671e.f73352d == null) {
                        c34671e.f73352d = Class.forName("android.media.AudioManager$OnModeChangedListener");
                    }
                    if (c34671e.f73353e == null) {
                        c34671e.f73353e = Proxy.newProxyInstance(c34671e.f73352d.getClassLoader(), new Class[]{c34671e.f73352d}, new C34671e.a(c34671e));
                    }
                    AudioManager.class.getMethod("addOnModeChangedListener", Executor.class, c34671e.f73352d).invoke(c34671e.f73351b, ExecutorC34674h.m76012a(c34671e), c34671e.f73353e);
                } catch (Throwable th3) {
                    Log.m76033e("PhoneStateManager", "add mode changed listener failed, " + th3.getMessage(), new Object[0]);
                }
            } else if (i11 >= 26 && C34671e.f73349c != null) {
                Log.m76034i("PhoneStateManager", "register audio playback callback.", new Object[0]);
                C34671e.f73349c.f73347a = c34671e;
            }
        }
        c34671e.f73354f.mo76133a(RunnableC34672f.m76010a(c34671e));
    }

    public static /* synthetic */ void lambda$unregisterAudioRecordingCallback$1(AndroidInterruptedStateListener androidInterruptedStateListener) {
        C34671e c34671e = androidInterruptedStateListener.mPhoneStateManager;
        if (c34671e != null) {
            if (C34671e.m76005b()) {
                try {
                    TelephonyManager telephonyManager = c34671e.f73350a;
                    if (telephonyManager != null) {
                        telephonyManager.listen(c34671e, 0);
                    }
                    c34671e.f73355g = 0;
                    return;
                } catch (Throwable th2) {
                    Log.m76033e("PhoneStateManager", "stop listen phone state failed, " + th2.getMessage(), new Object[0]);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 31) {
                C34671e.m76007c();
                return;
            }
            try {
                Class<?> cls = c34671e.f73352d;
                if (cls == null || c34671e.f73353e == null) {
                    return;
                }
                AudioManager.class.getMethod("removeOnModeChangedListener", cls).invoke(c34671e.f73351b, c34671e.f73353e);
            } catch (Throwable th3) {
                Log.m76033e("PhoneStateManager", "remove mode changed listener failed, " + th3.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.tencent.liteav.audio2.C34670d.a
    public void OnRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
        if (list == null) {
            return;
        }
        int iMin = Math.min(list.size(), 10);
        RecordingConfig[] recordingConfigArr = new RecordingConfig[iMin];
        for (int i11 = 0; i11 < iMin; i11++) {
            recordingConfigArr[i11] = new RecordingConfig();
            AudioRecordingConfiguration audioRecordingConfiguration = list.get(i11);
            recordingConfigArr[i11].f73340a = audioRecordingConfiguration.getClientAudioSessionId();
            if (LiteavSystemInfo.getSystemOSVersionInt() < 29) {
                recordingConfigArr[i11].f73341b = false;
            } else if (Build.VERSION.SDK_INT >= 29) {
                recordingConfigArr[i11].f73341b = audioRecordingConfiguration.isClientSilenced();
            }
        }
        synchronized (this.mObject) {
            try {
                if (this.mNeedNotify) {
                    nativeNotifyAudioRecordingConfigChangedFromJava(this.mNativeRecordingConfigListener, recordingConfigArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.audio2.C34671e.b
    public void onInterruptedByPhoneCall() {
        synchronized (this.mObject) {
            try {
                if (this.mNeedNotify) {
                    nativeNotifyInterruptedByPhoneCallFromJava(this.mNativeRecordingConfigListener);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.liteav.audio2.C34671e.b
    public void onResumedByPhoneCall() {
        synchronized (this.mObject) {
            try {
                if (this.mNeedNotify) {
                    nativeNotifyResumedByPhoneCallFromJava(this.mNativeRecordingConfigListener);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AndroidInterruptedStateListener(long j11) {
        this.mNativeRecordingConfigListener = j11;
        Log.m76032d(TAG, "new AndroidInterruptedStateListener" + hashCode(), new Object[0]);
    }

    public void registerAudioRecordingCallback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 24) {
            return;
        }
        C34670d c34670d = mRecordingCallback;
        if (c34670d != null) {
            c34670d.f73348a = this;
        }
        ThreadUtils.getUiThreadHandler().post(RunnableC34667a.m75998a(this));
        this.mNeedNotify = true;
    }

    public void unregisterAudioRecordingCallback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 24 || mRecordingCallback == null) {
            return;
        }
        synchronized (this.mObject) {
            this.mNeedNotify = false;
            mRecordingCallback.f73348a = null;
            ThreadUtils.getUiThreadHandler().post(RunnableC34668b.m75999a(this));
        }
    }
}
