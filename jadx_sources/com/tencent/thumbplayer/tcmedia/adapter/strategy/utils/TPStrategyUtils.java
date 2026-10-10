package com.tencent.thumbplayer.tcmedia.adapter.strategy.utils;

import com.tencent.thumbplayer.tcmedia.adapter.C35244b;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryException;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.tcmedia.core.common.TPThumbplayerCapabilityHelper;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes62.dex */
public class TPStrategyUtils {
    private static final String TAG = "TPStrategyUtils";

    public static boolean enablePlayByThumbPlayer(C35244b c35244b) {
        return c35244b == null || c35244b.m77677n() == 0 || isSupportFFmpegCodec(c35244b) || isSupportMediaCodec(c35244b);
    }

    public static boolean isSystemPlayerEnable() {
        return true;
    }

    public static boolean isTVPlatform() {
        return false;
    }

    public static boolean isSupportFFmpegCodec(C35244b c35244b) {
        try {
            return TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(101, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, c35244b.m77677n()), (int) c35244b.m77644a(), (int) c35244b.m77648b(), c35244b.m77660e(), c35244b.m77670h());
        } catch (TPNativeLibraryException e11) {
            TPLogUtil.m78798e(TAG, e11);
            return false;
        }
    }

    public static boolean isSupportMediaCodec(C35244b c35244b) {
        try {
            return TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(102, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapCodecType.class, c35244b.m77677n()), (int) c35244b.m77644a(), (int) c35244b.m77648b(), c35244b.m77660e(), c35244b.m77670h());
        } catch (TPNativeLibraryException e11) {
            TPLogUtil.m78798e(TAG, e11);
            return false;
        }
    }

    public static boolean enablePlayBySystemPlayer(C35244b c35244b) {
        if (c35244b.m77677n() == 0) {
            return true;
        }
        return isSupportMediaCodec(c35244b);
    }

    public static boolean isThumbPlayerEnable() {
        return TPNativeLibraryLoader.isLibLoadedAndTryToLoad();
    }
}
