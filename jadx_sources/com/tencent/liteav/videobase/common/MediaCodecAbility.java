package com.tencent.liteav.videobase.common;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class MediaCodecAbility {
    private static final String TAG = "MediaCodecAbility";

    public static boolean isDecoderSupportHevc() {
        boolean z11 = false;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            boolean z12 = false;
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                try {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    if (!mediaCodecInfo.isEncoder()) {
                        for (String str : supportedTypes) {
                            if (str.contains("video/hevc")) {
                                z12 = true;
                                LiteavLog.m76088i(TAG, "got hevc decoder:%s", mediaCodecInfo.getName());
                                break;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z11 = z12;
                    LiteavLog.m76083e(TAG, "get hevc decode error:".concat(String.valueOf(th)));
                    return z11;
                }
            }
            return z12;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean isEncoderSupportHevc() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                if (mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        if (str.contains("video/hevc")) {
                            LiteavLog.m76087i(TAG, "get hevc encoder");
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            LiteavLog.m76093w(TAG, "failed to get hevc encoder:".concat(String.valueOf(th2)));
        }
        LiteavLog.m76093w(TAG, "not got hevc encoder");
        return false;
    }

    public static boolean isMediaCodecDecodeSupportSWHevc() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                if (!mediaCodecInfo.isEncoder()) {
                    for (String str : supportedTypes) {
                        if (str.contains("video/hevc") && isSoftOnlyDecoder(mediaCodecInfo)) {
                            LiteavLog.m76088i(TAG, "got soft only hevc decoder:%s", mediaCodecInfo.getName());
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            LiteavLog.m76083e(TAG, "get hevc decode error:".concat(String.valueOf(th2)));
        }
        return false;
    }

    public static int getMediaCodecDecoderSupportLowResolution() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return 0;
        }
        MediaCodec mediaCodecCreateDecoderByType = null;
        try {
            mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType("video/avc");
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecCreateDecoderByType.getCodecInfo().getCapabilitiesForType("video/avc");
            if (capabilitiesForType == null) {
                mediaCodecCreateDecoderByType.release();
                return 0;
            }
            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
            if (videoCapabilities == null) {
                mediaCodecCreateDecoderByType.release();
                return 0;
            }
            Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
            Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
            if (supportedWidths != null && supportedHeights != null) {
                int iMax = Math.max(((Integer) supportedWidths.getLower()).intValue(), ((Integer) supportedHeights.getLower()).intValue());
                mediaCodecCreateDecoderByType.release();
                return iMax;
            }
            mediaCodecCreateDecoderByType.release();
            return 0;
        } catch (Throwable th2) {
            try {
                LiteavLog.m76083e(TAG, "get low resolution error:".concat(String.valueOf(th2)));
                return 0;
            } finally {
                if (mediaCodecCreateDecoderByType != null) {
                    mediaCodecCreateDecoderByType.release();
                }
            }
        }
    }

    public static boolean isSoftOnlyDecoder(MediaCodecInfo mediaCodecInfo) {
        if (LiteavSystemInfo.getSystemOSVersionInt() > 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (!mediaCodecInfo.getName().contains("android") && !mediaCodecInfo.getName().contains("google")) {
            return false;
        }
        return true;
    }
}
