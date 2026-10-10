package com.tencent.ugc.common;

import android.content.Context;
import com.tencent.ugc.beauty.gpufilters.TXCGPUMotionBase;

/* JADX INFO: loaded from: classes2.dex */
public class TXCBuildsUtil {
    public static final int BUILDTYPE = 0;
    public static final int BUILD_NORMAL = 0;
    public static final int BUILD_PITU = 1;
    public static volatile boolean _PituInit;

    public static boolean initMotionSdk(Context context) {
        return false;
    }

    public static TXCGPUMotionBase createMotionFilter(Context context) {
        return new TXCGPUMotionBase() { // from class: com.tencent.ugc.common.TXCBuildsUtil.1
            @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
            public final boolean canBeSkipped() {
                return true;
            }

            @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUMotionBase
            public final void setHomeOrientation(int i11) {
            }

            @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUMotionBase
            public final void setMotionMute(boolean z11) {
            }

            @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUMotionBase
            public final void setMotionPath(String str) {
            }

            @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUMotionBase
            public final void setTextureMirrored(boolean z11) {
            }

            @Override // com.tencent.ugc.beauty.gpufilters.TXCGPUMotionBase
            public final void setScalableCosmeticTypeLevel(TXCGPUMotionBase.ScalableCosmeticType scalableCosmeticType, int i11) {
            }
        };
    }

    public static String getPituSDKVersion() {
        return "";
    }
}
