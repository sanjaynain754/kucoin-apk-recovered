package androidx.camera.video;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class MediaSpec {
    private static final int AAC_DEFAULT_PROFILE = 2;
    private static final String AUDIO_ENCODER_MIME_MPEG4_DEFAULT = "audio/mp4a-latm";
    private static final String AUDIO_ENCODER_MIME_WEBM_DEFAULT = "audio/vorbis";
    public static final int OUTPUT_FORMAT_AUTO = -1;
    public static final int OUTPUT_FORMAT_MPEG_4 = 0;
    public static final int OUTPUT_FORMAT_WEBM = 1;
    private static final String VIDEO_ENCODER_MIME_MPEG4_DEFAULT = "video/avc";
    private static final String VIDEO_ENCODER_MIME_WEBM_DEFAULT = "video/x-vnd.on2.vp8";

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface OutputFormat {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String outputFormatToAudioMime(int i11) {
        return i11 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    public static int outputFormatToMuxerFormat(int i11) {
        return i11 != 1 ? 0 : 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String outputFormatToVideoMime(int i11) {
        return i11 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    public abstract AudioSpec getAudioSpec();

    public abstract int getOutputFormat();

    public abstract VideoSpec getVideoSpec();

    public abstract Builder toBuilder();

    @AutoValue.Builder
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class Builder {
        public abstract MediaSpec build();

        @SuppressLint({"KotlinPropertyAccess"})
        public abstract AudioSpec getAudioSpec();

        @SuppressLint({"KotlinPropertyAccess"})
        public abstract VideoSpec getVideoSpec();

        public abstract Builder setAudioSpec(AudioSpec audioSpec);

        public abstract Builder setOutputFormat(int i11);

        public abstract Builder setVideoSpec(VideoSpec videoSpec);

        public Builder configureAudio(Consumer<AudioSpec.Builder> consumer) {
            AudioSpec.Builder builder = getAudioSpec().toBuilder();
            consumer.accept(builder);
            setAudioSpec(builder.build());
            return this;
        }

        public Builder configureVideo(Consumer<VideoSpec.Builder> consumer) {
            VideoSpec.Builder builder = getVideoSpec().toBuilder();
            consumer.accept(builder);
            setVideoSpec(builder.build());
            return this;
        }
    }

    public static Builder builder() {
        return new AutoValue_MediaSpec.Builder().setOutputFormat(-1).setAudioSpec(AudioSpec.builder().build()).setVideoSpec(VideoSpec.builder().build());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static int outputFormatToAudioProfile(int i11) {
        if (Objects.equals(outputFormatToAudioMime(i11), "audio/mp4a-latm")) {
            return 2;
        }
        return -1;
    }
}
