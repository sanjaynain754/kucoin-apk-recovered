package androidx.camera.video.internal.audio;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_AudioSettings extends AudioSettings {
    private final int audioFormat;
    private final int audioSource;
    private final int captureSampleRate;
    private final int channelCount;
    private final int encodeSampleRate;

    public static final class Builder extends AudioSettings.Builder {
        private Integer audioFormat;
        private Integer audioSource;
        private Integer captureSampleRate;
        private Integer channelCount;
        private Integer encodeSampleRate;

        public Builder() {
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings autoBuild() {
            String str = "";
            if (this.audioSource == null) {
                str = " audioSource";
            }
            if (this.captureSampleRate == null) {
                str = str + " captureSampleRate";
            }
            if (this.encodeSampleRate == null) {
                str = str + " encodeSampleRate";
            }
            if (this.channelCount == null) {
                str = str + " channelCount";
            }
            if (this.audioFormat == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new AutoValue_AudioSettings(this.audioSource.intValue(), this.captureSampleRate.intValue(), this.encodeSampleRate.intValue(), this.channelCount.intValue(), this.audioFormat.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        private Builder(AudioSettings audioSettings) {
            this.audioSource = Integer.valueOf(audioSettings.getAudioSource());
            this.captureSampleRate = Integer.valueOf(audioSettings.getCaptureSampleRate());
            this.encodeSampleRate = Integer.valueOf(audioSettings.getEncodeSampleRate());
            this.channelCount = Integer.valueOf(audioSettings.getChannelCount());
            this.audioFormat = Integer.valueOf(audioSettings.getAudioFormat());
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioFormat(int i11) {
            this.audioFormat = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioSource(int i11) {
            this.audioSource = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setCaptureSampleRate(int i11) {
            this.captureSampleRate = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setChannelCount(int i11) {
            this.channelCount = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setEncodeSampleRate(int i11) {
            this.encodeSampleRate = Integer.valueOf(i11);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioSettings) {
            AudioSettings audioSettings = (AudioSettings) obj;
            if (this.audioSource == audioSettings.getAudioSource() && this.captureSampleRate == audioSettings.getCaptureSampleRate() && this.encodeSampleRate == audioSettings.getEncodeSampleRate() && this.channelCount == audioSettings.getChannelCount() && this.audioFormat == audioSettings.getAudioFormat()) {
                return true;
            }
        }
        return false;
    }

    private AutoValue_AudioSettings(int i11, int i12, int i13, int i14, int i15) {
        this.audioSource = i11;
        this.captureSampleRate = i12;
        this.encodeSampleRate = i13;
        this.channelCount = i14;
        this.audioFormat = i15;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioFormat() {
        return this.audioFormat;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioSource() {
        return this.audioSource;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    @IntRange(from = 1)
    public int getCaptureSampleRate() {
        return this.captureSampleRate;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    @IntRange(from = 1)
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    @IntRange(from = 1)
    public int getEncodeSampleRate() {
        return this.encodeSampleRate;
    }

    public int hashCode() {
        return ((((((((this.audioSource ^ 1000003) * 1000003) ^ this.captureSampleRate) * 1000003) ^ this.encodeSampleRate) * 1000003) ^ this.channelCount) * 1000003) ^ this.audioFormat;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public AudioSettings.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.audioSource + ", captureSampleRate=" + this.captureSampleRate + ", encodeSampleRate=" + this.encodeSampleRate + ", channelCount=" + this.channelCount + ", audioFormat=" + this.audioFormat + "}";
    }
}
