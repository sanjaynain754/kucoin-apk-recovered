package androidx.camera.video;

import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class RecordingStats {
    public abstract AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();

    /* JADX INFO: renamed from: of */
    public static RecordingStats m2141of(long j11, long j12, AudioStats audioStats) {
        Preconditions.checkArgument(j11 >= 0, "duration must be positive value.");
        Preconditions.checkArgument(j12 >= 0, "bytes must be positive value.");
        return new AutoValue_RecordingStats(j11, j12, audioStats);
    }
}
