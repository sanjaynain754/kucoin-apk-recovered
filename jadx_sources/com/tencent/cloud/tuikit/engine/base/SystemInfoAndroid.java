package com.tencent.cloud.tuikit.engine.base;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::engine::basic")
public class SystemInfoAndroid {
    private CallStateMonitor mCallStateMonitor;
    private long mNativeSystemInfo;
    private int mLastCallState = 0;
    private boolean mIsBackground = false;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    private static native void nativeOnAppBackgroundStateChanged(long j11, int i11);

    private static native void nativeOnSystemCallStateChanged(long j11, int i11);

    @CalledByNative
    public void destroy() {
        this.mNativeSystemInfo = 0L;
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.base.e
            @Override // java.lang.Runnable
            public final void run() {
                SystemInfoAndroid.m75624a(this.f72683b);
            }
        });
    }

    public void onAppBackgroundStateChanged(boolean z11) {
        if (this.mIsBackground == z11) {
            return;
        }
        this.mIsBackground = z11;
        nativeOnAppBackgroundStateChanged(this.mNativeSystemInfo, z11 ? 1 : 0);
    }

    public void onCallStateChanged(int i11) {
        if (this.mLastCallState == i11) {
            return;
        }
        this.mLastCallState = i11;
        nativeOnSystemCallStateChanged(this.mNativeSystemInfo, i11);
    }

    @CalledByNative
    public SystemInfoAndroid(long j11) {
        this.mNativeSystemInfo = j11;
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.base.f
            @Override // java.lang.Runnable
            public final void run() {
                SystemInfoAndroid.m75627d(this.f72684b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75624a(SystemInfoAndroid systemInfoAndroid) {
        systemInfoAndroid.getClass();
        AppStateMonitor.getInstance().setBackgroundStateListener(null);
        systemInfoAndroid.mCallStateMonitor.destroy();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m75627d(final SystemInfoAndroid systemInfoAndroid) {
        systemInfoAndroid.getClass();
        AppStateMonitor.getInstance().setBackgroundStateListener(new AppStateMonitor.BackgroundStateListener() { // from class: com.tencent.cloud.tuikit.engine.base.c
            @Override // com.tencent.cloud.tuikit.engine.base.AppStateMonitor.BackgroundStateListener
            public final void onStateChanged(boolean z11) {
                this.f72681a.onAppBackgroundStateChanged(z11);
            }
        });
        systemInfoAndroid.mCallStateMonitor = new CallStateMonitor(new CallStateMonitor.CallStateListener() { // from class: com.tencent.cloud.tuikit.engine.base.d
            @Override // com.tencent.cloud.tuikit.engine.base.CallStateMonitor.CallStateListener
            public final void onCallStateChanged(int i11) {
                this.f72682a.onCallStateChanged(i11);
            }
        });
    }

    @CalledByNative
    public static String getModel() {
        return LiteavSystemInfo.getModel();
    }

    @CalledByNative
    public static String getSystemOSVersion() {
        return LiteavSystemInfo.getSystemOSVersion();
    }

    private void runOnMainThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }
}
