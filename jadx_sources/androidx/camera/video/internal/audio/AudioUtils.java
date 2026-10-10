package androidx.camera.video.internal.audio;

import android.media.AudioTimestamp;
import androidx.core.util.Preconditions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioUtils {
    public static int channelCountToChannelConfig(int i11) {
        return i11 == 1 ? 16 : 12;
    }

    public static int channelCountToChannelMask(int i11) {
        return i11 == 1 ? 16 : 12;
    }

    public static long computeInterpolatedTimeNs(int i11, long j11, AudioTimestamp audioTimestamp) {
        Preconditions.checkArgument(((long) i11) > 0, "sampleRate must be greater than 0.");
        Preconditions.checkArgument(j11 >= 0, "framePosition must be no less than 0.");
        long jFrameCountToDurationNs = audioTimestamp.nanoTime + frameCountToDurationNs(j11 - audioTimestamp.framePosition, i11);
        if (jFrameCountToDurationNs < 0) {
            return 0L;
        }
        return jFrameCountToDurationNs;
    }

    public static long frameCountToDurationNs(long j11, int i11) {
        long j12 = i11;
        Preconditions.checkArgument(j12 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j11) / j12;
    }

    public static long frameCountToSize(long j11, int i11) {
        long j12 = i11;
        Preconditions.checkArgument(j12 > 0, "bytesPerFrame must be greater than 0.");
        return j11 * j12;
    }

    public static long sizeToFrameCount(long j11, int i11) {
        long j12 = i11;
        Preconditions.checkArgument(j12 > 0, "bytesPerFrame must be greater than 0.");
        return j11 / j12;
    }

    public static int getBytesPerFrame(int i11, int i12) {
        Preconditions.checkArgument(i12 > 0, "Invalid channel count: " + i12);
        if (i11 == 2) {
            return i12 * 2;
        }
        if (i11 == 3) {
            return i12;
        }
        if (i11 != 4) {
            if (i11 == 21) {
                return i12 * 3;
            }
            if (i11 != 22) {
                throw new IllegalArgumentException("Invalid audio encoding: " + i11);
            }
        }
        return i12 * 4;
    }

    private AudioUtils() {
    }
}
