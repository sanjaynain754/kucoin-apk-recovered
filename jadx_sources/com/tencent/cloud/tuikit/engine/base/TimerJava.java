package com.tencent.cloud.tuikit.engine.base;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::engine::basic")
public class TimerJava {
    private static long MSG_START_TASK = 1000;
    private long mNativeTimer;
    private Map<Integer, TimerRunnable> mTimerTaskMap = new HashMap();
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public class TimerRunnable implements Runnable {
        private long mInterval;
        private int mTimerId;

        public TimerRunnable(int i11, long j11) {
            this.mTimerId = i11;
            this.mInterval = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TimerJava.this.isHasTask(this.mTimerId)) {
                TimerJava.this.onTask(this.mTimerId);
                TimerJava.this.mHandler.postDelayed(this, this.mInterval);
            }
        }
    }

    private static native void nativeOnDelayTask(long j11, int i11);

    private static native void nativeOnTask(long j11, int i11);

    private boolean isInit() {
        return this.mNativeTimer != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDelayTask(int i11) {
        nativeOnDelayTask(this.mNativeTimer, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTask(int i11) {
        nativeOnTask(this.mNativeTimer, i11);
    }

    @CalledByNative
    public void destroy() {
        this.mTimerTaskMap.clear();
        this.mNativeTimer = 0L;
    }

    @CalledByNative
    public void postDelayTask(final int i11, long j11) {
        this.mHandler.postDelayed(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.base.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f72685b.onDelayTask(i11);
            }
        }, j11);
    }

    @CalledByNative
    public TimerJava(long j11) {
        this.mNativeTimer = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHasTask(int i11) {
        Map<Integer, TimerRunnable> map;
        if (!isInit() || (map = this.mTimerTaskMap) == null) {
            return false;
        }
        return map.containsKey(Integer.valueOf(i11));
    }

    @CalledByNative
    public boolean startTimerTask(int i11, long j11) {
        if (isHasTask(i11)) {
            return false;
        }
        TimerRunnable timerRunnable = new TimerRunnable(i11, j11);
        this.mTimerTaskMap.put(Integer.valueOf(i11), timerRunnable);
        this.mHandler.post(timerRunnable);
        return true;
    }

    @CalledByNative
    public void stopTimerTask(int i11) {
        if (isHasTask(i11)) {
            this.mHandler.removeCallbacks(this.mTimerTaskMap.get(Integer.valueOf(i11)));
            this.mTimerTaskMap.remove(Integer.valueOf(i11));
        }
    }
}
