package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.ImmutableList;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.ugc.beauty.decoder.MediaUtils;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class MediaFormatUtil {
    public static final String KEY_MAX_BIT_RATE = "max-bitrate";
    public static final String KEY_PCM_ENCODING_EXTENDED = "exo-pcm-encoding-int";
    public static final String KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";
    private static final int MAX_POWER_OF_TWO_INT = 1073741824;

    private static boolean isValidColorRange(int i11) {
        return i11 == 2 || i11 == 1 || i11 == -1;
    }

    private static boolean isValidColorSpace(int i11) {
        return i11 == 2 || i11 == 1 || i11 == 6 || i11 == -1;
    }

    private static boolean isValidColorTransfer(int i11) {
        return i11 == 1 || i11 == 3 || i11 == 6 || i11 == 7 || i11 == -1;
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i11) {
        if (i11 != -1) {
            mediaFormat.setInteger(str, i11);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPcmEncoding(MediaFormat mediaFormat, int i11) {
        int i12;
        if (i11 == -1) {
            return;
        }
        maybeSetInteger(mediaFormat, KEY_PCM_ENCODING_EXTENDED, i11);
        if (i11 != 0) {
            i12 = 2;
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        i12 = 21;
                        if (i11 != 21) {
                            i12 = 22;
                            if (i11 != 22) {
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            i12 = 0;
        }
        mediaFormat.setInteger("pcm-encoding", i12);
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mediaFormat.setByteBuffer("csd-" + i11, ByteBuffer.wrap(list.get(i11)));
        }
    }

    @SuppressLint({"InlinedApi"})
    public static Format createFormatFromMediaFormat(MediaFormat mediaFormat) {
        int i11 = 0;
        Format.Builder pcmEncoding = new Format.Builder().setSampleMimeType(mediaFormat.getString("mime")).setLanguage(mediaFormat.getString("language")).setPeakBitrate(getInteger(mediaFormat, KEY_MAX_BIT_RATE, -1)).setAverageBitrate(getInteger(mediaFormat, "bitrate", -1)).setCodecs(getCodecString(mediaFormat)).setFrameRate(getFrameRate(mediaFormat, -1.0f)).setWidth(getInteger(mediaFormat, "width", -1)).setHeight(getInteger(mediaFormat, "height", -1)).setPixelWidthHeightRatio(getPixelWidthHeightRatio(mediaFormat, 1.0f)).setMaxInputSize(getInteger(mediaFormat, "max-input-size", -1)).setRotationDegrees(getInteger(mediaFormat, MediaUtils.KEY_ROTATION, 0)).setColorInfo(getColorInfo(mediaFormat)).setSampleRate(getInteger(mediaFormat, "sample-rate", -1)).setChannelCount(getInteger(mediaFormat, "channel-count", -1)).setPcmEncoding(getInteger(mediaFormat, "pcm-encoding", -1));
        ImmutableList.Builder builder = new ImmutableList.Builder();
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i11);
            if (byteBuffer == null) {
                pcmEncoding.setInitializationData(builder.build());
                return pcmEncoding.build();
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            builder.add(bArr);
            i11++;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static MediaFormat createMediaFormatFromFormat(Format format) {
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", format.bitrate);
        maybeSetInteger(mediaFormat, KEY_MAX_BIT_RATE, format.peakBitrate);
        maybeSetInteger(mediaFormat, "channel-count", format.channelCount);
        maybeSetColorInfo(mediaFormat, format.colorInfo);
        maybeSetString(mediaFormat, "mime", format.sampleMimeType);
        maybeSetString(mediaFormat, "codecs-string", format.codecs);
        maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        maybeSetInteger(mediaFormat, "width", format.width);
        maybeSetInteger(mediaFormat, "height", format.height);
        setCsdBuffers(mediaFormat, format.initializationData);
        maybeSetPcmEncoding(mediaFormat, format.pcmEncoding);
        maybeSetString(mediaFormat, "language", format.language);
        maybeSetInteger(mediaFormat, "max-input-size", format.maxInputSize);
        maybeSetInteger(mediaFormat, "sample-rate", format.sampleRate);
        maybeSetInteger(mediaFormat, "caption-service-number", format.accessibilityChannel);
        mediaFormat.setInteger(MediaUtils.KEY_ROTATION, format.rotationDegrees);
        int i11 = format.selectionFlags;
        setBooleanAsInt(mediaFormat, "is-autoselect", i11 & 4);
        setBooleanAsInt(mediaFormat, "is-default", i11 & 1);
        setBooleanAsInt(mediaFormat, "is-forced-subtitle", i11 & 2);
        mediaFormat.setInteger("encoder-delay", format.encoderDelay);
        mediaFormat.setInteger("encoder-padding", format.encoderPadding);
        maybeSetPixelAspectRatio(mediaFormat, format.pixelWidthHeightRatio);
        return mediaFormat;
    }

    @Nullable
    @SuppressLint({"InlinedApi"})
    private static String getCodecString(MediaFormat mediaFormat) {
        return (Objects.equals(mediaFormat.getString("mime"), MimeTypes.VIDEO_H263) && mediaFormat.containsKey(Scopes.PROFILE) && mediaFormat.containsKey(FirebaseAnalytics.Param.LEVEL)) ? CodecSpecificDataUtil.buildH263CodecString(mediaFormat.getInteger(Scopes.PROFILE), mediaFormat.getInteger(FirebaseAnalytics.Param.LEVEL)) : getString(mediaFormat, "codecs-string", null);
    }

    @Nullable
    public static ColorInfo getColorInfo(MediaFormat mediaFormat) {
        if (Util.SDK_INT < 24) {
            return null;
        }
        int integer = getInteger(mediaFormat, "color-standard", -1);
        int integer2 = getInteger(mediaFormat, "color-range", -1);
        int integer3 = getInteger(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        if (!isValidColorSpace(integer)) {
            integer = -1;
        }
        if (!isValidColorRange(integer2)) {
            integer2 = -1;
        }
        if (!isValidColorTransfer(integer3)) {
            integer3 = -1;
        }
        if (integer == -1 && integer2 == -1 && integer3 == -1 && array == null) {
            return null;
        }
        return new ColorInfo.Builder().setColorSpace(integer).setColorRange(integer2).setColorTransfer(integer3).setHdrStaticInfo(array).build();
    }

    private static float getFrameRate(MediaFormat mediaFormat, float f11) {
        if (!mediaFormat.containsKey("frame-rate")) {
            return f11;
        }
        try {
            return mediaFormat.getFloat("frame-rate");
        } catch (ClassCastException unused) {
            return mediaFormat.getInteger("frame-rate");
        }
    }

    public static boolean isAudioFormat(MediaFormat mediaFormat) {
        return MimeTypes.isAudio(mediaFormat.getString("mime"));
    }

    public static boolean isVideoFormat(MediaFormat mediaFormat) {
        return MimeTypes.isVideo(mediaFormat.getString("mime"));
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, @Nullable ColorInfo colorInfo) {
        if (colorInfo != null) {
            maybeSetInteger(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            maybeSetInteger(mediaFormat, "color-standard", colorInfo.colorSpace);
            maybeSetInteger(mediaFormat, "color-range", colorInfo.colorRange);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f11) {
        if (f11 != -1.0f) {
            mediaFormat.setFloat(str, f11);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPixelAspectRatio(MediaFormat mediaFormat, float f11) {
        int i11;
        mediaFormat.setFloat(KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT, f11);
        int i12 = 1073741824;
        if (f11 < 1.0f) {
            i12 = (int) (f11 * 1073741824);
            i11 = 1073741824;
        } else if (f11 > 1.0f) {
            i11 = (int) (1073741824 / f11);
        } else {
            i12 = 1;
            i11 = 1;
        }
        mediaFormat.setInteger("sar-width", i12);
        mediaFormat.setInteger("sar-height", i11);
    }

    public static void maybeSetString(MediaFormat mediaFormat, String str, @Nullable String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    private static void setBooleanAsInt(MediaFormat mediaFormat, String str, int i11) {
        mediaFormat.setInteger(str, i11 != 0 ? 1 : 0);
    }

    private MediaFormatUtil() {
    }

    public static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static float getFloat(MediaFormat mediaFormat, String str, float f11) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getFloat(str);
        }
        return f11;
    }

    public static int getInteger(MediaFormat mediaFormat, String str, int i11) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return i11;
    }

    @SuppressLint({"InlinedApi"})
    private static float getPixelWidthHeightRatio(MediaFormat mediaFormat, float f11) {
        if (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            return mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        return f11;
    }

    @Nullable
    public static String getString(MediaFormat mediaFormat, String str, @Nullable String str2) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getString(str);
        }
        return str2;
    }

    @Nullable
    public static Integer getTimeLapseFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }
}
