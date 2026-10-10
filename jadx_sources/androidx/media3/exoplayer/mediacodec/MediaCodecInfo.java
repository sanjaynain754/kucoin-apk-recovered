package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;

    @Nullable
    public final android.media.MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean detachedSurfaceSupported;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    private static int adjustMaxInputChannelCount(String str, String str2, int i11) {
        int i12;
        if (i11 > 1 || ((Util.SDK_INT >= 26 && i11 > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || "audio/mp4a-latm".equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i11;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i12 = 6;
        } else {
            i12 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        Log.m2961w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i11 + " to " + i12 + "]");
        return i12;
    }

    private static android.media.MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(@Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i11;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i11 = 1024;
        } else if (iIntValue >= 120000000) {
            i11 = 512;
        } else if (iIntValue >= 60000000) {
            i11 = 256;
        } else if (iIntValue >= 30000000) {
            i11 = 128;
        } else if (iIntValue >= 18000000) {
            i11 = 64;
        } else if (iIntValue >= 12000000) {
            i11 = 32;
        } else if (iIntValue >= 7200000) {
            i11 = 16;
        } else if (iIntValue >= 3600000) {
            i11 = 8;
        } else if (iIntValue >= 1800000) {
            i11 = 4;
        } else {
            i11 = iIntValue >= 800000 ? 2 : 1;
        }
        android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i11;
        return new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean isAdaptive(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean isDetachedSurfaceSupported(@Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface");
    }

    private boolean isSampleMimeTypeSupported(Format format) {
        return this.mimeType.equals(format.sampleMimeType) || this.mimeType.equals(MediaCodecUtil.getAlternativeCodecMimeType(format));
    }

    private void logAssumedSupport(String str) {
        Log.m2955d(TAG, "AssumedSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + "]");
    }

    private void logNoSupport(String str) {
        Log.m2955d(TAG, "NoSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + "]");
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
        return Util.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDisableAdaptationWorkaround(String str) {
        if (Util.SDK_INT > 22) {
            return false;
        }
        String str2 = Util.MODEL;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Util.DEVICE)) ? false : true;
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, @Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z11, z12, z13, (z14 || codecCapabilities == null || !isAdaptive(codecCapabilities) || needsDisableAdaptationWorkaround(str)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z15 || (codecCapabilities != null && isSecure(codecCapabilities)), isDetachedSurfaceSupported(codecCapabilities));
    }

    @Nullable
    public Point alignVideoSizeV21(int i11, int i12) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSize(videoCapabilities, i11, i12);
    }

    public DecoderReuseEvaluation canReuseCodec(Format format, Format format2) {
        Format format3;
        Format format4;
        int i11 = !Util.areEqual(format.sampleMimeType, format2.sampleMimeType) ? 8 : 0;
        if (this.isVideo) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i11 |= 1024;
            }
            if (!this.adaptive && (format.width != format2.width || format.height != format2.height)) {
                i11 |= 512;
            }
            if ((!ColorInfo.isEquivalentToAssumedSdrDefault(format.colorInfo) || !ColorInfo.isEquivalentToAssumedSdrDefault(format2.colorInfo)) && !Util.areEqual(format.colorInfo, format2.colorInfo)) {
                i11 |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.name) && !format.initializationDataEquals(format2)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new DecoderReuseEvaluation(this.name, format, format2, format.initializationDataEquals(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.channelCount != format4.channelCount) {
                i11 |= 4096;
            }
            if (format3.sampleRate != format4.sampleRate) {
                i11 |= 8192;
            }
            if (format3.pcmEncoding != format4.pcmEncoding) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.mimeType)) {
                Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format3);
                Pair<Integer, Integer> codecProfileAndLevel2 = MediaCodecUtil.getCodecProfileAndLevel(format4);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
                    }
                }
            }
            if (!format3.initializationDataEquals(format4)) {
                i11 |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.mimeType)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new DecoderReuseEvaluation(this.name, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, format3, format4, 0, i11);
    }

    public int getMaxSupportedInstances() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Util.SDK_INT < 23 || (codecCapabilities = this.capabilities) == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i11) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i11) {
            return true;
        }
        logNoSupport("channelCount.support, " + i11);
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i11) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i11)) {
            return true;
        }
        logNoSupport("sampleRate.support, " + i11);
        return false;
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (Util.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.mimeType)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
        if (this.isVideo) {
            return this.adaptive;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i11, int i12, double d11) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (Util.SDK_INT >= 29) {
            int iAreResolutionAndFrameRateCovered = MediaCodecPerformancePointCoverageProvider.areResolutionAndFrameRateCovered(videoCapabilities, i11, i12, d11);
            if (iAreResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (iAreResolutionAndFrameRateCovered == 1) {
                logNoSupport("sizeAndRate.cover, " + i11 + "x" + i12 + "@" + d11);
                return false;
            }
        }
        if (!areSizeAndRateSupported(videoCapabilities, i11, i12, d11)) {
            if (i11 >= i12 || !needsRotatedVerticalResolutionWorkaround(this.name) || !areSizeAndRateSupported(videoCapabilities, i12, i11, d11)) {
                logNoSupport("sizeAndRate.support, " + i11 + "x" + i12 + "@" + d11);
                return false;
            }
            logAssumedSupport("sizeAndRate.rotated, " + i11 + "x" + i12 + "@" + d11);
        }
        return true;
    }

    public String toString() {
        return this.name;
    }

    @VisibleForTesting
    public MediaCodecInfo(String str, String str2, String str3, @Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.name = (String) Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z11;
        this.softwareOnly = z12;
        this.vendor = z13;
        this.adaptive = z14;
        this.tunneling = z15;
        this.secure = z16;
        this.detachedSurfaceSupported = z17;
        this.isVideo = MimeTypes.isVideo(str2);
    }

    private static Point alignVideoSize(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i11, widthAlignment) * widthAlignment, Util.ceilDivide(i12, heightAlignment) * heightAlignment);
    }

    private static boolean areSizeAndRateSupported(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        Point pointAlignVideoSize = alignVideoSize(videoCapabilities, i11, i12);
        int i13 = pointAlignVideoSize.x;
        int i14 = pointAlignVideoSize.y;
        if (d11 != -1.0d && d11 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d11));
        }
        return videoCapabilities.isSizeSupported(i13, i14);
    }

    @RequiresApi(23)
    private static int getMaxSupportedInstancesV23(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private boolean isCodecProfileAndLevelSupported(Format format, boolean z11) {
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        String str = format.sampleMimeType;
        if (str != null && str.equals(MimeTypes.VIDEO_MV_HEVC)) {
            String strNormalizeMimeType = MimeTypes.normalizeMimeType(this.codecMimeType);
            if (strNormalizeMimeType.equals(MimeTypes.VIDEO_MV_HEVC)) {
                return true;
            }
            if (strNormalizeMimeType.equals("video/hevc")) {
                codecProfileAndLevel = MediaCodecUtil.getHevcBaseLayerCodecProfileAndLevel(format);
            }
        }
        if (codecProfileAndLevel == null) {
            return true;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        int iIntValue2 = ((Integer) codecProfileAndLevel.second).intValue();
        if ("video/dolby-vision".equals(format.sampleMimeType)) {
            if ("video/avc".equals(this.mimeType)) {
                iIntValue = 8;
            } else if ("video/hevc".equals(this.mimeType)) {
                iIntValue = 2;
            }
            iIntValue2 = 0;
        }
        if (!this.isVideo && iIntValue != 42) {
            return true;
        }
        android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (Util.SDK_INT <= 23 && "video/x-vnd.on2.vp9".equals(this.mimeType) && profileLevels.length == 0) {
            profileLevels = estimateLegacyVp9ProfileLevels(this.capabilities);
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z11) && !needsProfileExcludedWorkaround(this.mimeType, iIntValue))) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + format.codecs + ", " + this.codecMimeType);
        return false;
    }

    private static boolean isSecure(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean needsProfileExcludedWorkaround(String str, int i11) {
        if ("video/hevc".equals(str) && 2 == i11) {
            String str2 = Util.DEVICE;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isFormatFunctionallySupported(Format format) {
        if (!isSampleMimeTypeSupported(format) || !isCodecProfileAndLevelSupported(format, false)) {
            return false;
        }
        return true;
    }

    public boolean isFormatSupported(Format format) throws MediaCodecUtil.DecoderQueryException {
        int i11;
        int i12;
        if (!isSampleMimeTypeSupported(format) || !isCodecProfileAndLevelSupported(format, true)) {
            return false;
        }
        if (this.isVideo) {
            int i13 = format.width;
            if (i13 <= 0 || (i12 = format.height) <= 0) {
                return true;
            }
            return isVideoSizeAndRateSupportedV21(i13, i12, format.frameRate);
        }
        int i14 = format.sampleRate;
        if ((i14 != -1 && !isAudioSampleRateSupportedV21(i14)) || ((i11 = format.channelCount) != -1 && !isAudioChannelCountSupportedV21(i11))) {
            return false;
        }
        return true;
    }
}
