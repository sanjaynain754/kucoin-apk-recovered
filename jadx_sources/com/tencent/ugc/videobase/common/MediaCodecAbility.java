package com.tencent.ugc.videobase.common;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
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
                    LiteavLog.m76084e(TAG, "get hevc decode error ", th);
                    return z11;
                }
            }
            return z12;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean isMediaCodecSWHevcDecodeSupport() {
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
            LiteavLog.m76084e(TAG, "get hevc decode error ", th2);
        }
        return false;
    }

    public static boolean isEncoderSupportHevc() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return false;
        }
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.contains("video/hevc")) {
                        LiteavLog.m76087i(TAG, "Got hevc encoder");
                        return true;
                    }
                }
            }
        }
        LiteavLog.m76093w(TAG, "not got hevc encoder");
        return false;
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
