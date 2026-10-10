package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCLicenseChecker {
    private static native boolean nativeIsIMPluginFunctionSupport();

    public static boolean isEnterpriseFunctionSupport() {
        return isFunctionSupport(HouseBuilder.EnumC34765a.PITU_SIMPLE);
    }

    public static boolean isEnterpriseProFunctionSupport() {
        return isFunctionSupport(HouseBuilder.EnumC34765a.PITU);
    }

    public static boolean isSimpleFunctionSupport() {
        return isFunctionSupport(HouseBuilder.EnumC34765a.UGC_SIMPLE);
    }

    public static boolean isStandardFunctionSupport() {
        return isFunctionSupport(HouseBuilder.EnumC34765a.UGC_STANDARD);
    }

    public static String getLicenseAppId() {
        return HouseBuilder.getInstance().getAppId();
    }

    private static boolean isFunctionSupport(HouseBuilder.EnumC34765a enumC34765a) {
        if (HouseBuilder.getInstance().valid(enumC34765a) == HouseBuilder.EnumC34768d.OK) {
            LiteavLog.m76087i("UGCLicenseChecker", "isFunctionSupport true functionType = " + enumC34765a.value);
            return true;
        }
        LiteavLog.m76083e("UGCLicenseChecker", "isFunctionSupport false functionType = " + enumC34765a.value);
        return false;
    }

    public static boolean isIMPluginFunctionSupport() {
        return nativeIsIMPluginFunctionSupport();
    }
}
