package com.tencent.liteav.videobase.common;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34748m;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class HDRCapability {
    private static final String TAG = "HDRCapability";
    private static Boolean sIsHDR10Supported;
    private static final C34748m sSequenceTaskRunner = new C34748m();

    private static boolean hasHDR10ProfileLevel(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == 4096) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIsHDR10Supported() {
        synchronized (HDRCapability.class) {
            try {
                if (sIsHDR10Supported != null) {
                    return;
                }
                try {
                    boolean zIsDisplaySupportHDR10 = isDisplaySupportHDR10();
                    boolean zIsDecoderSupportHDR10 = isDecoderSupportHDR10();
                    synchronized (HDRCapability.class) {
                        Boolean boolValueOf = Boolean.valueOf(zIsDisplaySupportHDR10 && zIsDecoderSupportHDR10);
                        sIsHDR10Supported = boolValueOf;
                        LiteavLog.m76088i(TAG, "the device supports hdr10 %b", boolValueOf);
                    }
                } catch (Throwable th2) {
                    LiteavLog.m76084e(TAG, "check hdr capability error ", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static boolean isDecoderSupportHDR10() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            for (String str : mediaCodecInfo.getSupportedTypes()) {
                if (str.contains("video/hevc") && hasHDR10ProfileLevel(mediaCodecInfo.getCapabilitiesForType("video/hevc").profileLevels)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static synchronized boolean isHDRSupported(int i11) {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 24) {
            return false;
        }
        if (i11 != EnumC34874b.HDR10.mValue) {
            return false;
        }
        Boolean bool = sIsHDR10Supported;
        if (bool != null) {
            return bool.booleanValue();
        }
        sSequenceTaskRunner.mo76133a(RunnableC34873a.m76492a());
        return false;
    }

    private static boolean isDisplaySupportHDR10() {
        WindowManager windowManager;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService(InterfaceC33953u5.f72199F)) == null || (hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities()) == null) {
            return false;
        }
        for (int i11 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i11 == 2) {
                return true;
            }
        }
        return false;
    }
}
