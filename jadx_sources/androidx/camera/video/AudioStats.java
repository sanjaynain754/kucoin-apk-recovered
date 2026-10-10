package androidx.camera.video;

import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class AudioStats {
    public static final double AUDIO_AMPLITUDE_NONE = 0.0d;
    public static final int AUDIO_STATE_ACTIVE = 0;
    public static final int AUDIO_STATE_DISABLED = 1;
    public static final int AUDIO_STATE_ENCODER_ERROR = 3;
    public static final int AUDIO_STATE_MUTED = 5;
    public static final int AUDIO_STATE_SOURCE_ERROR = 4;
    public static final int AUDIO_STATE_SOURCE_SILENCED = 2;
    private static final Set<Integer> ERROR_STATES = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface AudioState {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract double getAudioAmplitudeInternal();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract long getAudioBytesRecorded();

    public abstract int getAudioState();

    public abstract Throwable getErrorCause();

    /* JADX INFO: renamed from: of */
    public static AudioStats m2107of(int i11, Throwable th2, double d11, long j11) {
        return new AutoValue_AudioStats(i11, d11, j11, th2);
    }

    public boolean hasError() {
        return ERROR_STATES.contains(Integer.valueOf(getAudioState()));
    }

    @OptIn(markerClass = {ExperimentalAudioApi.class})
    public double getAudioAmplitude() {
        if (getAudioState() == 1) {
            return 0.0d;
        }
        return getAudioAmplitudeInternal();
    }

    public boolean hasAudio() {
        if (getAudioState() == 0) {
            return true;
        }
        return false;
    }
}
