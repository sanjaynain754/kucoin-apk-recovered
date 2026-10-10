package com.tencent.liteav;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.SoLoader;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class LiveSettingJni {
    private static final String TAG = "LiveSettingJni";
    private static String mUserId;

    private static native void nativeSetAppId(String str);

    private static native void nativeSetAppVersion(String str);

    private static native void nativeSetUserId(String str);

    public static String getUserId() {
        return mUserId;
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public static void setAppId(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "setAppId error, appId cannot be null.");
        } else {
            nativeSetAppId(str);
        }
    }

    public static void setAppVersion(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "set app version error, app version cannot be null.");
        } else {
            nativeSetAppVersion(str);
        }
    }

    public static void setUserId(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "setUserId error, invalid userId.");
        } else {
            mUserId = str;
            nativeSetUserId(str);
        }
    }
}
