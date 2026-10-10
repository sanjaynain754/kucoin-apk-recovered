package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.tencent.bugly.proguard.C33707i7;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AFa1tSDK {
    private final AFa1vSDK getCurrencyIso4217Code = new AFa1vSDK() { // from class: com.appsflyer.internal.AFa1tSDK.4
        @Override // com.appsflyer.internal.AFa1tSDK.AFa1vSDK
        public final Class<?> getRevenue(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    /* JADX INFO: loaded from: classes34.dex */
    public interface AFa1vSDK {
        Class<?> getRevenue(String str) throws ClassNotFoundException;
    }

    public final String getMediationNetwork() {
        for (AFa1zSDK aFa1zSDK : AFa1zSDK.values()) {
            if (getMediationNetwork(aFa1zSDK.getRevenue)) {
                return aFa1zSDK.getMonetizationNetwork;
            }
        }
        return AFa1zSDK.DEFAULT.getMonetizationNetwork;
    }

    /* JADX INFO: loaded from: classes34.dex */
    public enum AFa1zSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", C33707i7.f70211o),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        final String getMonetizationNetwork;
        final String getRevenue;

        AFa1zSDK(String str, String str2) {
            this.getMonetizationNetwork = str;
            this.getRevenue = str2;
        }
    }

    private boolean getMediationNetwork(String str) {
        try {
            this.getCurrencyIso4217Code.getRevenue(str);
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is found.");
            AFLogger.afRDLog(sb2.toString());
            return true;
        } catch (ClassNotFoundException e11) {
            StringBuilder sb3 = new StringBuilder("Class: ");
            sb3.append(str);
            sb3.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb3.toString(), e11, true);
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return false;
        }
    }
}
