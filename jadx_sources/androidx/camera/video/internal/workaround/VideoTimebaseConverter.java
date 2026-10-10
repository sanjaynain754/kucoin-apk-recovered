package androidx.camera.video.internal.workaround;

import android.os.Build;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.encoder.TimeProvider;

/* JADX INFO: loaded from: classes23.dex */
public class VideoTimebaseConverter {
    private static final String TAG = "VideoTimebaseConverter";
    private static final long UPTIME_REALTIME_DIFF_THRESHOLD_US = 3000000;
    private final CameraUseInconsistentTimebaseQuirk mCameraUseInconsistentTimebaseQuirk;
    private final Timebase mInputTimebase;
    private Timebase mResolvedInputTimebase;
    private final TimeProvider mTimeProvider;
    private long mUptimeToRealtimeOffsetUs = -1;

    /* JADX INFO: renamed from: androidx.camera.video.internal.workaround.VideoTimebaseConverter$1 */
    public static /* synthetic */ class C13801 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$Timebase;

        static {
            int[] iArr = new int[Timebase.values().length];
            $SwitchMap$androidx$camera$core$impl$Timebase = iArr;
            try {
                iArr[Timebase.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$Timebase[Timebase.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private long calculateUptimeToRealtimeOffsetUs() {
        long j11 = Long.MAX_VALUE;
        long j12 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            long jUptimeUs = this.mTimeProvider.uptimeUs();
            long jRealtimeUs = this.mTimeProvider.realtimeUs();
            long jUptimeUs2 = this.mTimeProvider.uptimeUs();
            long j13 = jUptimeUs2 - jUptimeUs;
            if (i11 == 0 || j13 < j11) {
                j12 = jRealtimeUs - ((jUptimeUs + jUptimeUs2) >> 1);
                j11 = j13;
            }
        }
        return Math.max(0L, j12);
    }

    private boolean exceedUptimeRealtimeDiffThreshold() {
        return this.mTimeProvider.realtimeUs() - this.mTimeProvider.uptimeUs() > UPTIME_REALTIME_DIFF_THRESHOLD_US;
    }

    private boolean isCloseToRealtime(long j11) {
        return Math.abs(j11 - this.mTimeProvider.realtimeUs()) < Math.abs(j11 - this.mTimeProvider.uptimeUs());
    }

    private Timebase resolveInputTimebase(long j11) {
        boolean z11;
        String str;
        if (this.mCameraUseInconsistentTimebaseQuirk != null) {
            Logger.m1872w(TAG, "CameraUseInconsistentTimebaseQuirk is enabled");
            z11 = false;
        } else {
            if (!exceedUptimeRealtimeDiffThreshold()) {
                return this.mInputTimebase;
            }
            z11 = true;
        }
        Timebase timebase = isCloseToRealtime(j11) ? Timebase.REALTIME : Timebase.UPTIME;
        if (!z11 || timebase == this.mInputTimebase) {
            Logger.m1866d(TAG, "Detect input timebase = " + timebase);
            return timebase;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            str = ", SOC: " + Build.SOC_MODEL;
        } else {
            str = "";
        }
        Logger.m1868e(TAG, String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i11), str, this.mInputTimebase, timebase));
        return timebase;
    }

    public long convertToUptimeUs(long j11) {
        if (this.mResolvedInputTimebase == null) {
            this.mResolvedInputTimebase = resolveInputTimebase(j11);
        }
        int i11 = C13801.$SwitchMap$androidx$camera$core$impl$Timebase[this.mResolvedInputTimebase.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return j11;
            }
            throw new AssertionError("Unknown timebase: " + this.mResolvedInputTimebase);
        }
        if (this.mUptimeToRealtimeOffsetUs == -1) {
            this.mUptimeToRealtimeOffsetUs = calculateUptimeToRealtimeOffsetUs();
            Logger.m1866d(TAG, "mUptimeToRealtimeOffsetUs = " + this.mUptimeToRealtimeOffsetUs);
        }
        return j11 - this.mUptimeToRealtimeOffsetUs;
    }

    public VideoTimebaseConverter(TimeProvider timeProvider, Timebase timebase, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.mTimeProvider = timeProvider;
        this.mInputTimebase = timebase;
        this.mCameraUseInconsistentTimebaseQuirk = cameraUseInconsistentTimebaseQuirk;
    }
}
