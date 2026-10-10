package com.tencent.rtmp.video;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes56.dex */
public class BaseBridge {
    public static final String SCREEN_CAPTURE_SDK_VERSION = "0.0.0.0";
    public static BaseBridgeCallback mBaseBridgeCallback;

    public interface BaseBridgeCallback {
        Context getAppContext();

        int getSystemOSVersion();

        void printLog(String str, String str2);
    }

    public static Context getAppContext() {
        BaseBridgeCallback baseBridgeCallback = mBaseBridgeCallback;
        if (baseBridgeCallback != null) {
            return baseBridgeCallback.getAppContext();
        }
        return null;
    }

    public static int getSystemOSVersion() {
        BaseBridgeCallback baseBridgeCallback = mBaseBridgeCallback;
        return baseBridgeCallback != null ? baseBridgeCallback.getSystemOSVersion() : Build.VERSION.SDK_INT;
    }

    public static void printLog(String str, String str2) {
        BaseBridgeCallback baseBridgeCallback = mBaseBridgeCallback;
        if (baseBridgeCallback != null) {
            baseBridgeCallback.printLog(str, str2);
        }
    }

    public static void setBaseBridgeCallback(BaseBridgeCallback baseBridgeCallback) {
        mBaseBridgeCallback = baseBridgeCallback;
    }
}
