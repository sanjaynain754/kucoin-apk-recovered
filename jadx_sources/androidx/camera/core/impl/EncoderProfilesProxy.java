package androidx.camera.core.impl;

import android.util.Size;
import androidx.media3.common.MimeTypes;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface EncoderProfilesProxy {
    public static final int CODEC_PROFILE_NONE = -1;

    @AutoValue
    public static abstract class AudioProfileProxy {
        public static final String MEDIA_TYPE_NONE = "audio/none";

        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioEncoder {
        }

        public abstract int getBitrate();

        public abstract int getChannels();

        public abstract int getCodec();

        public abstract String getMediaType();

        public abstract int getProfile();

        public abstract int getSampleRate();

        public static AudioProfileProxy create(int i11, String str, int i12, int i13, int i14, int i15) {
            return new AutoValue_EncoderProfilesProxy_AudioProfileProxy(i11, str, i12, i13, i14, i15);
        }
    }

    @AutoValue
    public static abstract class ImmutableEncoderProfilesProxy implements EncoderProfilesProxy {
        public static ImmutableEncoderProfilesProxy create(int i11, int i12, List<AudioProfileProxy> list, List<VideoProfileProxy> list2) {
            return new AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(i11, i12, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    @AutoValue
    public static abstract class VideoProfileProxy {
        public static final int BIT_DEPTH_10 = 10;
        public static final int BIT_DEPTH_8 = 8;
        public static final String MEDIA_TYPE_NONE = "video/none";

        @Retention(RetentionPolicy.SOURCE)
        public @interface VideoEncoder {
        }

        public abstract int getBitDepth();

        public abstract int getBitrate();

        public abstract int getChromaSubsampling();

        public abstract int getCodec();

        public abstract int getFrameRate();

        public abstract int getHdrFormat();

        public abstract int getHeight();

        public abstract String getMediaType();

        public abstract int getProfile();

        public abstract int getWidth();

        public static VideoProfileProxy create(int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            return new AutoValue_EncoderProfilesProxy_VideoProfileProxy(i11, str, i12, i13, i14, i15, i16, i17, i18, i19);
        }

        public Size getResolution() {
            return new Size(getWidth(), getHeight());
        }
    }

    static int getRequiredAudioProfile(int i11) {
        if (i11 == 3) {
            return 2;
        }
        if (i11 != 4) {
            return i11 != 5 ? -1 : 39;
        }
        return 5;
    }

    List<AudioProfileProxy> getAudioProfiles();

    int getDefaultDurationSeconds();

    int getRecommendedFileFormat();

    List<VideoProfileProxy> getVideoProfiles();

    static String getAudioCodecMimeType(int i11) {
        switch (i11) {
            case 1:
                return MimeTypes.AUDIO_AMR_NB;
            case 2:
                return MimeTypes.AUDIO_AMR_WB;
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return MimeTypes.AUDIO_VORBIS;
            case 7:
                return MimeTypes.AUDIO_OPUS;
            default:
                return AudioProfileProxy.MEDIA_TYPE_NONE;
        }
    }

    static String getVideoCodecMimeType(int i11) {
        switch (i11) {
            case 1:
                return MimeTypes.VIDEO_H263;
            case 2:
                return "video/avc";
            case 3:
                return MimeTypes.VIDEO_MP4V;
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return VideoProfileProxy.MEDIA_TYPE_NONE;
        }
    }
}
