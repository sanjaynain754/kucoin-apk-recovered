package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoConfigUtil {
    private static final Map<String, Map<Integer, VideoEncoderDataSpace>> MIME_TO_DATA_SPACE_MAP;
    private static final String TAG = "VideoConfigUtil";
    public static final int VIDEO_FRAME_RATE_FIXED_DEFAULT = 30;

    static {
        HashMap map = new HashMap();
        MIME_TO_DATA_SPACE_MAP = map;
        HashMap map2 = new HashMap();
        VideoEncoderDataSpace videoEncoderDataSpace = VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
        map2.put(1, videoEncoderDataSpace);
        VideoEncoderDataSpace videoEncoderDataSpace2 = VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG;
        map2.put(2, videoEncoderDataSpace2);
        VideoEncoderDataSpace videoEncoderDataSpace3 = VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ;
        map2.put(4096, videoEncoderDataSpace3);
        map2.put(8192, videoEncoderDataSpace3);
        HashMap map3 = new HashMap();
        map3.put(1, videoEncoderDataSpace);
        map3.put(2, videoEncoderDataSpace2);
        map3.put(4096, videoEncoderDataSpace3);
        map3.put(8192, videoEncoderDataSpace3);
        HashMap map4 = new HashMap();
        map4.put(1, videoEncoderDataSpace);
        map4.put(4, videoEncoderDataSpace2);
        map4.put(4096, videoEncoderDataSpace3);
        map4.put(16384, videoEncoderDataSpace3);
        map4.put(2, videoEncoderDataSpace);
        map4.put(8, videoEncoderDataSpace2);
        map4.put(8192, videoEncoderDataSpace3);
        map4.put(32768, videoEncoderDataSpace3);
        HashMap map5 = new HashMap();
        map5.put(256, videoEncoderDataSpace2);
        map5.put(512, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT709);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static VideoEncoderDataSpace mimeAndProfileToEncoderDataSpace(String str, int i11) {
        VideoEncoderDataSpace videoEncoderDataSpace;
        Map<Integer, VideoEncoderDataSpace> map = MIME_TO_DATA_SPACE_MAP.get(str);
        if (map != null && (videoEncoderDataSpace = map.get(Integer.valueOf(i11))) != null) {
            return videoEncoderDataSpace;
        }
        Logger.m1872w(TAG, String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i11)));
        return VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
    }

    public static CaptureEncodeRates resolveFrameRates(VideoSpec videoSpec, Range<Integer> range) {
        Range<Integer> range2 = SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED;
        int iIntValue = range2.equals(range) ? 30 : ((Integer) range.getUpper()).intValue();
        int encodeFrameRate = videoSpec.getEncodeFrameRate() != 0 ? videoSpec.getEncodeFrameRate() : iIntValue;
        Locale locale = Locale.ENGLISH;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(encodeFrameRate);
        boolean zEquals = range2.equals(range);
        Object obj = range;
        if (zEquals) {
            obj = "<UNSPECIFIED>";
        }
        Logger.m1866d(TAG, String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", numValueOf, numValueOf2, obj));
        return new CaptureEncodeRates(iIntValue, encodeFrameRate);
    }

    public static int scaleAndClampBitrate(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Range<Integer> range) {
        int iDoubleValue = (int) (((double) i11) * new Rational(i12, i13).doubleValue() * new Rational(i14, i15).doubleValue() * new Rational(i16, i17).doubleValue() * new Rational(i18, i19).doubleValue());
        String str = Logger.isDebugEnabled(TAG) ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(iDoubleValue)) : "";
        if (!VideoSpec.BITRATE_RANGE_AUTO.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (Logger.isDebugEnabled(TAG)) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
            iDoubleValue = iIntValue;
        }
        Logger.m1866d(TAG, str);
        return iDoubleValue;
    }

    private VideoConfigUtil() {
    }

    private static String getDynamicRangeDefaultMime(DynamicRange dynamicRange) {
        int encoding = dynamicRange.getEncoding();
        if (encoding != 1) {
            if (encoding != 3 && encoding != 4 && encoding != 5) {
                if (encoding == 6) {
                    return "video/dolby-vision";
                }
                throw new UnsupportedOperationException("Unsupported dynamic range: " + dynamicRange + "\nNo supported default mime type available.");
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static VideoEncoderConfig resolveVideoEncoderConfig(VideoMimeInfo videoMimeInfo, Timebase timebase, VideoSpec videoSpec, Size size, DynamicRange dynamicRange, Range<Integer> range) {
        Supplier videoEncoderConfigDefaultResolver;
        EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile = videoMimeInfo.getCompatibleVideoProfile();
        if (compatibleVideoProfile != null) {
            videoEncoderConfigDefaultResolver = new VideoEncoderConfigVideoProfileResolver(videoMimeInfo.getMimeType(), timebase, videoSpec, size, compatibleVideoProfile, dynamicRange, range);
        } else {
            videoEncoderConfigDefaultResolver = new VideoEncoderConfigDefaultResolver(videoMimeInfo.getMimeType(), timebase, videoSpec, size, dynamicRange, range);
        }
        return (VideoEncoderConfig) videoEncoderConfigDefaultResolver.get();
    }

    public static VideoMimeInfo resolveVideoMimeInfo(MediaSpec mediaSpec, DynamicRange dynamicRange, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        EncoderProfilesProxy.VideoProfileProxy next;
        Preconditions.checkState(dynamicRange.isFullySpecified(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + dynamicRange + "]");
        String strOutputFormatToVideoMime = MediaSpec.outputFormatToVideoMime(mediaSpec.getOutputFormat());
        if (videoValidatedEncoderProfilesProxy != null) {
            Set<Integer> setDynamicRangeToVideoProfileHdrFormats = DynamicRangeUtil.dynamicRangeToVideoProfileHdrFormats(dynamicRange);
            Set<Integer> setDynamicRangeToVideoProfileBitDepth = DynamicRangeUtil.dynamicRangeToVideoProfileBitDepth(dynamicRange);
            Iterator<EncoderProfilesProxy.VideoProfileProxy> it = videoValidatedEncoderProfilesProxy.getVideoProfiles().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (setDynamicRangeToVideoProfileHdrFormats.contains(Integer.valueOf(next.getHdrFormat())) && setDynamicRangeToVideoProfileBitDepth.contains(Integer.valueOf(next.getBitDepth()))) {
                        String mediaType = next.getMediaType();
                        if (Objects.equals(strOutputFormatToVideoMime, mediaType)) {
                            Logger.m1866d(TAG, "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + strOutputFormatToVideoMime + "]");
                        } else if (mediaSpec.getOutputFormat() == -1) {
                            Logger.m1866d(TAG, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + strOutputFormatToVideoMime + ", dynamic range: " + dynamicRange + "]");
                        }
                        strOutputFormatToVideoMime = mediaType;
                    }
                } else {
                    next = null;
                }
            }
        } else {
            next = null;
        }
        if (next == null) {
            if (mediaSpec.getOutputFormat() == -1) {
                strOutputFormatToVideoMime = getDynamicRangeDefaultMime(dynamicRange);
            }
            if (videoValidatedEncoderProfilesProxy == null) {
                Logger.m1866d(TAG, "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strOutputFormatToVideoMime + ", dynamic range: " + dynamicRange + "]");
            } else {
                Logger.m1866d(TAG, "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strOutputFormatToVideoMime + ", dynamic range: " + dynamicRange + "]");
            }
        }
        VideoMimeInfo.Builder builder = VideoMimeInfo.builder(strOutputFormatToVideoMime);
        if (next != null) {
            builder.setCompatibleVideoProfile(next);
        }
        return builder.build();
    }

    public static VideoEncoderConfig workaroundDataSpaceIfRequired(VideoEncoderConfig videoEncoderConfig, boolean z11) {
        if (videoEncoderConfig.getDataSpace() == VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED) {
            MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) DeviceQuirks.get(MediaCodecDefaultDataSpaceQuirk.class);
            if (z11 && mediaCodecDefaultDataSpaceQuirk != null) {
                return videoEncoderConfig.toBuilder().setDataSpace(mediaCodecDefaultDataSpaceQuirk.getSuggestedDataSpace()).build();
            }
            return videoEncoderConfig;
        }
        return videoEncoderConfig;
    }
}
