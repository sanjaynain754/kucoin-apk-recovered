package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.Timebase;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_AudioEncoderConfig extends AudioEncoderConfig {
    private final int bitrate;
    private final int captureSampleRate;
    private final int channelCount;
    private final int encodeSampleRate;
    private final Timebase inputTimebase;
    private final String mimeType;
    private final int profile;

    public static final class Builder extends AudioEncoderConfig.Builder {
        private Integer bitrate;
        private Integer captureSampleRate;
        private Integer channelCount;
        private Integer encodeSampleRate;
        private Timebase inputTimebase;
        private String mimeType;
        private Integer profile;

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig autoBuild() {
            String str = "";
            if (this.mimeType == null) {
                str = " mimeType";
            }
            if (this.profile == null) {
                str = str + " profile";
            }
            if (this.inputTimebase == null) {
                str = str + " inputTimebase";
            }
            if (this.bitrate == null) {
                str = str + " bitrate";
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
            if (str.isEmpty()) {
                return new AutoValue_AudioEncoderConfig(this.mimeType, this.profile.intValue(), this.inputTimebase, this.bitrate.intValue(), this.captureSampleRate.intValue(), this.encodeSampleRate.intValue(), this.channelCount.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setInputTimebase(Timebase timebase) {
            if (timebase == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.inputTimebase = timebase;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setMimeType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.mimeType = str;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setBitrate(int i11) {
            this.bitrate = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setCaptureSampleRate(int i11) {
            this.captureSampleRate = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setChannelCount(int i11) {
            this.channelCount = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setEncodeSampleRate(int i11) {
            this.encodeSampleRate = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setProfile(int i11) {
            this.profile = Integer.valueOf(i11);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioEncoderConfig) {
            AudioEncoderConfig audioEncoderConfig = (AudioEncoderConfig) obj;
            if (this.mimeType.equals(audioEncoderConfig.getMimeType()) && this.profile == audioEncoderConfig.getProfile() && this.inputTimebase.equals(audioEncoderConfig.getInputTimebase()) && this.bitrate == audioEncoderConfig.getBitrate() && this.captureSampleRate == audioEncoderConfig.getCaptureSampleRate() && this.encodeSampleRate == audioEncoderConfig.getEncodeSampleRate() && this.channelCount == audioEncoderConfig.getChannelCount()) {
                return true;
            }
        }
        return false;
    }

    private AutoValue_AudioEncoderConfig(String str, int i11, Timebase timebase, int i12, int i13, int i14, int i15) {
        this.mimeType = str;
        this.profile = i11;
        this.inputTimebase = timebase;
        this.bitrate = i12;
        this.captureSampleRate = i13;
        this.encodeSampleRate = i14;
        this.channelCount = i15;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getCaptureSampleRate() {
        return this.captureSampleRate;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getEncodeSampleRate() {
        return this.encodeSampleRate;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public Timebase getInputTimebase() {
        return this.inputTimebase;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
        return this.profile;
    }

    public int hashCode() {
        return ((((((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003) ^ this.inputTimebase.hashCode()) * 1000003) ^ this.bitrate) * 1000003) ^ this.captureSampleRate) * 1000003) ^ this.encodeSampleRate) * 1000003) ^ this.channelCount;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.mimeType + ", profile=" + this.profile + ", inputTimebase=" + this.inputTimebase + ", bitrate=" + this.bitrate + ", captureSampleRate=" + this.captureSampleRate + ", encodeSampleRate=" + this.encodeSampleRate + ", channelCount=" + this.channelCount + "}";
    }
}
