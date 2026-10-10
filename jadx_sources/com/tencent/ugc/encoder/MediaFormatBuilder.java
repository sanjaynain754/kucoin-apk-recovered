package com.tencent.ugc.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Pair;
import android.util.Range;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EnumC34876d;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;

/* JADX INFO: loaded from: classes2.dex */
public class MediaFormatBuilder {
    private static final String MIME_TYPE_H264 = "video/avc";
    private static final String MIME_TYPE_H265 = "video/hevc";
    private static final String TAG = "MediaFormatBuilder";
    private final MediaCodec mMediaCodec;
    private final String mMimeType;
    private final VideoEncodeParams mVideoEncodeParams;
    private boolean mEnableSetBitrateModeIfSupport = true;
    private boolean mUseProfileAndLevel = true;

    private MediaCodecInfo.CodecCapabilities createCodecCapabilities(MediaFormat mediaFormat) {
        if (mediaFormat == null || LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return null;
        }
        Pair<Integer, Integer> profileAndLevel = getProfileAndLevel(mediaFormat);
        return MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.mMimeType, ((Integer) profileAndLevel.first).intValue(), ((Integer) profileAndLevel.second).intValue());
    }

    private static int getMediaCodecBitrateMode(VideoEncoderDef.BitrateMode bitrateMode) {
        int i11;
        if (bitrateMode == null || (i11 = C356461.f77027a[bitrateMode.ordinal()]) == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? 2 : 0;
        }
        return 1;
    }

    private static int getMediaCodecProfile(EnumC34876d enumC34876d, boolean z11) {
        if ((z11 && LiteavSystemInfo.getSystemOSVersionInt() >= 21) || enumC34876d == null) {
            return 1;
        }
        int i11 = C356461.f77028b[enumC34876d.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? 1 : 8;
        }
        return 2;
    }

    /* JADX INFO: renamed from: com.tencent.ugc.encoder.MediaFormatBuilder$1 */
    public static /* synthetic */ class C356461 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77027a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f77028b;

        static {
            int[] iArr = new int[EnumC34876d.values().length];
            f77028b = iArr;
            try {
                iArr[EnumC34876d.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77028b[EnumC34876d.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77028b[EnumC34876d.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VideoEncoderDef.BitrateMode.values().length];
            f77027a = iArr2;
            try {
                iArr2[VideoEncoderDef.BitrateMode.CBR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77027a[VideoEncoderDef.BitrateMode.VBR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77027a[VideoEncoderDef.BitrateMode.CQ.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private MediaFormat createBaseFormat() {
        int i11;
        MediaFormat mediaFormatCreateVideoFormat;
        VideoEncodeParams videoEncodeParams = this.mVideoEncodeParams;
        int i12 = videoEncodeParams.width;
        if (i12 == 0 || (i11 = videoEncodeParams.height) == 0 || videoEncodeParams.bitrate == 0 || videoEncodeParams.fps == 0 || (mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.mMimeType, i12, i11)) == null) {
            return null;
        }
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.mVideoEncodeParams.bitrate * 1024);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.mVideoEncodeParams.fps);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        VideoEncodeParams videoEncodeParams2 = this.mVideoEncodeParams;
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", videoEncodeParams2.fullIFrame ? 0 : videoEncodeParams2.gop);
        return mediaFormatCreateVideoFormat;
    }

    private Pair<Integer, Integer> getProfileAndLevel(MediaFormat mediaFormat) {
        int integer;
        int integer2 = 0;
        try {
            integer = mediaFormat.getInteger(Scopes.PROFILE);
        } catch (Throwable th2) {
            LiteavLog.m76088i(TAG, "get profile fail.", th2);
            integer = 0;
        }
        try {
            integer2 = mediaFormat.getInteger(FirebaseAnalytics.Param.LEVEL);
        } catch (Throwable th3) {
            LiteavLog.m76088i(TAG, "get level fail.", th3);
        }
        return new Pair<>(Integer.valueOf(integer), Integer.valueOf(integer2));
    }

    private MediaCodecInfo.VideoCapabilities getVideoCapabilitiesByMimeType() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (this.mMediaCodec == null || LiteavSystemInfo.getSystemOSVersionInt() < 21 || (capabilitiesForType = this.mMediaCodec.getCodecInfo().getCapabilitiesForType(this.mMimeType)) == null) {
            return null;
        }
        return capabilitiesForType.getVideoCapabilities();
    }

    private void setProfileAndLevel(MediaFormat mediaFormat, MediaCodecInfo.CodecCapabilities codecCapabilities, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.mMimeType.equals("video/avc")) {
            i12 = 256;
            i13 = 32768;
        } else {
            i12 = Integer.MIN_VALUE;
            i13 = Integer.MAX_VALUE;
        }
        int i15 = 0;
        int iMin = 0;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
            int i16 = codecProfileLevel.level;
            if (i16 >= i12 && (i14 = codecProfileLevel.profile) <= i11 && (i14 > i15 || (i14 == i15 && i16 > iMin))) {
                iMin = Math.min(i16, i13);
                i15 = i14;
            }
        }
        mediaFormat.setInteger(Scopes.PROFILE, i15);
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            mediaFormat.setInteger(FirebaseAnalytics.Param.LEVEL, iMin);
        }
    }

    private void updateBitRateFromSupportRange(MediaFormat mediaFormat, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (codecCapabilities == null || mediaFormat == null || LiteavSystemInfo.getSystemOSVersionInt() < 21 || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return;
        }
        Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
        int integer = mediaFormat.getInteger("bitrate");
        Integer num = (Integer) bitrateRange.clamp(Integer.valueOf(integer));
        int iIntValue = num.intValue();
        LiteavLog.m76088i(TAG, "bitrateRange=(%d, %d),bitrate=%d,clampBitrate=%d", bitrateRange.getLower(), bitrateRange.getUpper(), Integer.valueOf(integer), num);
        if (integer != iIntValue) {
            mediaFormat.setInteger("bitrate", iIntValue);
        }
    }

    private void updateMediaFormatToLowerSize(MediaFormat mediaFormat, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilitiesByProfileLevel;
        if (mediaFormat == null || (videoCapabilitiesByProfileLevel = getVideoCapabilitiesByProfileLevel(i11, i12)) == null) {
            return;
        }
        Range<Integer> supportedWidths = videoCapabilitiesByProfileLevel.getSupportedWidths();
        Range<Integer> supportedHeights = videoCapabilitiesByProfileLevel.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return;
        }
        Integer numValueOf = (Integer) supportedWidths.getLower();
        Integer numValueOf2 = (Integer) supportedHeights.getLower();
        MediaCodecInfo.VideoCapabilities videoCapabilitiesByMimeType = getVideoCapabilitiesByMimeType();
        if (videoCapabilitiesByMimeType != null) {
            Range<Integer> supportedWidths2 = videoCapabilitiesByMimeType.getSupportedWidths();
            Range<Integer> supportedHeights2 = videoCapabilitiesByMimeType.getSupportedHeights();
            if (supportedWidths2 != null && supportedHeights2 != null) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Integer) supportedWidths2.getLower()).intValue()));
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((Integer) supportedHeights2.getLower()).intValue()));
            }
        }
        if (numValueOf.intValue() < 0 || numValueOf2.intValue() < 0) {
            return;
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        if (numValueOf.intValue() > integer || numValueOf2.intValue() > integer2) {
            float f11 = integer;
            float f12 = integer2;
            float fMax = Math.max(numValueOf.intValue() / (f11 * 1.0f), numValueOf2.intValue() / (1.0f * f12));
            mediaFormat.setInteger("width", (int) (f11 * fMax));
            mediaFormat.setInteger("height", (int) (fMax * f12));
            LiteavLog.m76088i(TAG, "updateMediaFormatToLowerSize:lowerW=%d,lowerH=%d", numValueOf, numValueOf2);
        }
    }

    private void updateMediaFormatToUpperSize(MediaFormat mediaFormat, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilitiesByProfileLevel;
        if (mediaFormat == null || (videoCapabilitiesByProfileLevel = getVideoCapabilitiesByProfileLevel(i11, i12)) == null) {
            return;
        }
        Range<Integer> supportedWidths = videoCapabilitiesByProfileLevel.getSupportedWidths();
        Range<Integer> supportedHeights = videoCapabilitiesByProfileLevel.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return;
        }
        Integer num = (Integer) supportedWidths.getUpper();
        Integer num2 = (Integer) supportedHeights.getUpper();
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        if ((integer > integer2 && num.intValue() < num2.intValue()) || (integer < integer2 && num.intValue() > num2.intValue())) {
            num.intValue();
            num = num2;
            num2 = num;
        }
        if (num.intValue() < integer || num2.intValue() < integer2) {
            float f11 = integer;
            float f12 = integer2;
            float fMin = Math.min(num.intValue() / (f11 * 1.0f), num2.intValue() / (1.0f * f12));
            mediaFormat.setInteger("width", (int) (f11 * fMin));
            mediaFormat.setInteger("height", (int) (fMin * f12));
            LiteavLog.m76088i(TAG, "updateMediaFormatToUpperSize:srcWidth=%d,srcHeight=%d,upperW=%d,upperH=%d", Integer.valueOf(integer), Integer.valueOf(integer2), num, num2);
        }
    }

    private void updateMediaFormatWithAlignment(MediaFormat mediaFormat, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilitiesByProfileLevel;
        if (mediaFormat == null || (videoCapabilitiesByProfileLevel = getVideoCapabilitiesByProfileLevel(i11, i12)) == null) {
            return;
        }
        int widthAlignment = videoCapabilitiesByProfileLevel.getWidthAlignment();
        int heightAlignment = videoCapabilitiesByProfileLevel.getHeightAlignment();
        LiteavLog.m76088i(TAG, "widthAlignment=%d,heightAlignment=%d", Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment));
        if (widthAlignment < 2 || heightAlignment < 2 || widthAlignment % 2 != 0 || heightAlignment % 2 != 0) {
            return;
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        int i13 = (integer / widthAlignment) * widthAlignment;
        int i14 = (integer2 / heightAlignment) * heightAlignment;
        if (integer == i13 && integer2 == i14) {
            return;
        }
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i14);
        LiteavLog.m76088i(TAG, "updateMediaFormatWithAlignment,srcSize=(%d x %d),fixSize=(%d x %d),widthAlignment=%d,heightAlignment=%d", Integer.valueOf(integer), Integer.valueOf(integer2), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment));
    }

    private void updateToCodecSupportSize(MediaFormat mediaFormat) {
        if (mediaFormat != null && LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            Pair<Integer, Integer> profileAndLevel = getProfileAndLevel(mediaFormat);
            int iIntValue = ((Integer) profileAndLevel.first).intValue();
            int iIntValue2 = ((Integer) profileAndLevel.second).intValue();
            updateMediaFormatToUpperSize(mediaFormat, iIntValue, iIntValue2);
            updateMediaFormatToLowerSize(mediaFormat, iIntValue, iIntValue2);
            updateMediaFormatWithAlignment(mediaFormat, iIntValue, iIntValue2);
        }
    }

    public MediaFormatBuilder enableSetBitrateModeIfSupport(boolean z11) {
        this.mEnableSetBitrateModeIfSupport = z11;
        return this;
    }

    public MediaFormatBuilder useProfileAndLevel(boolean z11) {
        this.mUseProfileAndLevel = z11;
        return this;
    }

    public MediaFormatBuilder(MediaCodec mediaCodec, String str, VideoEncodeParams videoEncodeParams) {
        this.mMediaCodec = mediaCodec;
        this.mMimeType = str;
        this.mVideoEncodeParams = videoEncodeParams;
    }

    private MediaCodecInfo.CodecCapabilities getCodecCapabilities() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i11 = 0; i11 < codecCount; i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equalsIgnoreCase(this.mMimeType)) {
                        return codecInfoAt.getCapabilitiesForType(this.mMimeType);
                    }
                }
            }
        }
        return null;
    }

    private MediaCodecInfo.VideoCapabilities getVideoCapabilitiesByProfileLevel(int i11, int i12) {
        MediaCodecInfo.CodecCapabilities codecCapabilitiesCreateFromProfileLevel;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21 || (codecCapabilitiesCreateFromProfileLevel = MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.mMimeType, i11, i12)) == null) {
            return null;
        }
        return codecCapabilitiesCreateFromProfileLevel.getVideoCapabilities();
    }

    private boolean isBitrateModeSupported(int i11, MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        return encoderCapabilities.isBitrateModeSupported(i11);
    }

    private void setBitrateModeIfDeviceSupport(MediaFormat mediaFormat, MediaCodecInfo.CodecCapabilities codecCapabilities, int i11) {
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            if (isBitrateModeSupported(i11, encoderCapabilities)) {
                mediaFormat.setInteger("bitrate-mode", i11);
                return;
            }
            if (this.mVideoEncodeParams.fullIFrame) {
                if (isBitrateModeSupported(1, encoderCapabilities)) {
                    mediaFormat.setInteger("bitrate-mode", 1);
                    return;
                } else {
                    if (isBitrateModeSupported(2, encoderCapabilities)) {
                        mediaFormat.setInteger("bitrate-mode", 2);
                        return;
                    }
                    return;
                }
            }
            if (isBitrateModeSupported(2, encoderCapabilities)) {
                mediaFormat.setInteger("bitrate-mode", 2);
            }
        }
    }

    private void setComplexity(MediaFormat mediaFormat, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        Range<Integer> complexityRange;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities == null || (complexityRange = encoderCapabilities.getComplexityRange()) == null) {
            return;
        }
        mediaFormat.setInteger("complexity", ((Integer) complexityRange.getUpper()).intValue());
    }

    public MediaFormat build() {
        boolean z11;
        MediaFormat mediaFormatCreateBaseFormat = createBaseFormat();
        if (mediaFormatCreateBaseFormat == null) {
            return null;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = getCodecCapabilities();
        if (codecCapabilities != null && LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            setComplexity(mediaFormatCreateBaseFormat, codecCapabilities);
            if (this.mUseProfileAndLevel) {
                VideoEncodeParams videoEncodeParams = this.mVideoEncodeParams;
                EnumC34876d enumC34876d = videoEncodeParams.encoderProfile;
                if (videoEncodeParams.codecType == CodecType.H265) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                setProfileAndLevel(mediaFormatCreateBaseFormat, codecCapabilities, getMediaCodecProfile(enumC34876d, z11));
            }
            if (this.mEnableSetBitrateModeIfSupport) {
                setBitrateModeIfDeviceSupport(mediaFormatCreateBaseFormat, codecCapabilities, getMediaCodecBitrateMode(this.mVideoEncodeParams.bitrateMode));
            }
        }
        MediaCodecInfo.CodecCapabilities codecCapabilitiesCreateCodecCapabilities = createCodecCapabilities(mediaFormatCreateBaseFormat);
        if (codecCapabilitiesCreateCodecCapabilities != null) {
            codecCapabilities = codecCapabilitiesCreateCodecCapabilities;
        }
        updateBitRateFromSupportRange(mediaFormatCreateBaseFormat, codecCapabilities);
        updateToCodecSupportSize(mediaFormatCreateBaseFormat);
        return mediaFormatCreateBaseFormat;
    }
}
