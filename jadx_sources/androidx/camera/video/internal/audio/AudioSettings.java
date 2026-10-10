package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import androidx.annotation.IntRange;
import androidx.media3.extractor.DtsUtil;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class AudioSettings {
    public static final List<Integer> COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(Integer.valueOf(DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND), 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    @IntRange(from = 1)
    public abstract int getCaptureSampleRate();

    @IntRange(from = 1)
    public abstract int getChannelCount();

    @IntRange(from = 1)
    public abstract int getEncodeSampleRate();

    public abstract Builder toBuilder();

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AudioSettings autoBuild();

        public abstract Builder setAudioFormat(int i11);

        public abstract Builder setAudioSource(int i11);

        public abstract Builder setCaptureSampleRate(@IntRange(from = 1) int i11);

        public abstract Builder setChannelCount(@IntRange(from = 1) int i11);

        public abstract Builder setEncodeSampleRate(@IntRange(from = 1) int i11);

        public final AudioSettings build() {
            AudioSettings audioSettingsAutoBuild = autoBuild();
            String str = "";
            if (audioSettingsAutoBuild.getAudioSource() == -1) {
                str = " audioSource";
            }
            if (audioSettingsAutoBuild.getCaptureSampleRate() <= 0) {
                str = str + " captureSampleRate";
            }
            if (audioSettingsAutoBuild.getEncodeSampleRate() <= 0) {
                str = str + " encodeSampleRate";
            }
            if (audioSettingsAutoBuild.getChannelCount() <= 0) {
                str = str + " channelCount";
            }
            if (audioSettingsAutoBuild.getAudioFormat() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return audioSettingsAutoBuild;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }
    }

    @SuppressLint({"Range"})
    public static Builder builder() {
        return new AutoValue_AudioSettings.Builder().setAudioSource(-1).setCaptureSampleRate(-1).setEncodeSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
    }

    public int getBytesPerFrame() {
        return AudioUtils.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }
}
