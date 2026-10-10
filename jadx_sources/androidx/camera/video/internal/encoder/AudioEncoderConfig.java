package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.core.impl.Timebase;
import com.google.android.gms.common.Scopes;
import com.google.auto.value.AutoValue;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class AudioEncoderConfig implements EncoderConfig {
    public abstract int getBitrate();

    public abstract int getCaptureSampleRate();

    public abstract int getChannelCount();

    public abstract int getEncodeSampleRate();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract Timebase getInputTimebase();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AudioEncoderConfig autoBuild();

        public abstract Builder setBitrate(int i11);

        public abstract Builder setCaptureSampleRate(int i11);

        public abstract Builder setChannelCount(int i11);

        public abstract Builder setEncodeSampleRate(int i11);

        public abstract Builder setInputTimebase(Timebase timebase);

        public abstract Builder setMimeType(String str);

        public abstract Builder setProfile(int i11);

        public AudioEncoderConfig build() {
            AudioEncoderConfig audioEncoderConfigAutoBuild = autoBuild();
            if (Objects.equals(audioEncoderConfigAutoBuild.getMimeType(), "audio/mp4a-latm") && audioEncoderConfigAutoBuild.getProfile() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return audioEncoderConfigAutoBuild;
        }
    }

    public static Builder builder() {
        return new AutoValue_AudioEncoderConfig.Builder().setProfile(-1);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public MediaFormat toMediaFormat() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(getMimeType(), getEncodeSampleRate(), getChannelCount());
        mediaFormatCreateAudioFormat.setInteger("bitrate", getBitrate());
        if (getProfile() != -1) {
            if (getMimeType().equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", getProfile());
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger(Scopes.PROFILE, getProfile());
        }
        return mediaFormatCreateAudioFormat;
    }
}
