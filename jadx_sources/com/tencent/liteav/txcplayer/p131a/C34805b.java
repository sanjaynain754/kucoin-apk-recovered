package com.tencent.liteav.txcplayer.p131a;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: renamed from: com.tencent.liteav.txcplayer.a.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34805b {
    /* JADX INFO: renamed from: a */
    public static boolean m76223a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i11 = 0; i11 < codecCount; i11++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
                if (!codecInfoAt.isEncoder()) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            LiteavLog.m76083e("MediaCodecUtils", "isMimeTypeSupported exception: " + th2.getMessage());
        }
        return false;
    }
}
