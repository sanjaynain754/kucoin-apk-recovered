package androidx.camera.extensions.internal.compat.workaround;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

/* JADX INFO: loaded from: classes23.dex */
public class OnEnableDisableSessionDurationCheck {

    @VisibleForTesting
    static final long MIN_DURATION_FOR_ENABLE_DISABLE_SESSION = 100;
    private static final String TAG = "OnEnableDisableSessionDurationCheck";
    private final boolean mEnabledMinimumDuration;
    private long mOnEnableSessionTimeStamp;

    public OnEnableDisableSessionDurationCheck() {
        this(DeviceQuirks.get(CrashWhenOnDisableTooSoon.class) != null);
    }

    @VisibleForTesting
    public OnEnableDisableSessionDurationCheck(boolean z11) {
        this.mOnEnableSessionTimeStamp = 0L;
        this.mEnabledMinimumDuration = z11;
    }

    private void ensureMinDurationAfterOnEnableSession() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.mOnEnableSessionTimeStamp;
        while (true) {
            long j12 = jElapsedRealtime - j11;
            if (j12 >= MIN_DURATION_FOR_ENABLE_DISABLE_SESSION) {
                return;
            }
            long j13 = MIN_DURATION_FOR_ENABLE_DISABLE_SESSION - j12;
            try {
                Logger.m1866d(TAG, "onDisableSession too soon, wait " + j13 + " ms");
                Thread.sleep(j13);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j11 = this.mOnEnableSessionTimeStamp;
            } catch (InterruptedException unused) {
                Logger.m1868e(TAG, "sleep interrupted");
                return;
            }
        }
    }

    public void onDisableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            ensureMinDurationAfterOnEnableSession();
        }
    }

    public void onEnableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            this.mOnEnableSessionTimeStamp = SystemClock.elapsedRealtime();
        }
    }
}
