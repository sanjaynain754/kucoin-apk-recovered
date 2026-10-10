package com.tencent.cloud.tuikit.engine.impl.utils;

import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes59.dex */
public class SoLoader {
    private static final String TAG = "SoLoader";
    private static boolean mHasLoaded = false;
    private static String mLibraryPath = "";
    private static final Object mLoadLock = new Object();

    public static boolean loadLibrary(String str) {
        try {
            LiteavLog.m76093w("SoLoader", "load library " + str + " from system path ");
            System.loadLibrary(str);
            return true;
        } catch (Error e11) {
            LiteavLog.m76083e("SoLoader", "load library : " + e11.toString());
            return loadLibrary(mLibraryPath, str);
        } catch (Exception e12) {
            LiteavLog.m76093w("SoLoader", "load library : " + e12.toString());
            return loadLibrary(mLibraryPath, str);
        }
    }

    public static String getLibraryPath() {
        return mLibraryPath;
    }

    public static boolean loadAllLibraries() {
        boolean z11;
        synchronized (mLoadLock) {
            try {
                if (!mHasLoaded) {
                    boolean zLoadLibrary = loadLibrary("ImSDK");
                    LiteavLog.m76093w("SoLoader", "load library ImSDK " + zLoadLibrary);
                    boolean zLoadLibrary2 = loadLibrary("liteavsdk");
                    LiteavLog.m76093w("SoLoader", "load library liteavsdk " + zLoadLibrary2);
                    boolean zLoadLibrary3 = loadLibrary("tuikitengineroom");
                    LiteavLog.m76093w("SoLoader", "load library tuikitengineroom " + zLoadLibrary3);
                    mHasLoaded = zLoadLibrary && zLoadLibrary2 && zLoadLibrary3;
                }
                z11 = mHasLoaded;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static void setLibraryPath(String str) {
        LiteavLog.m76093w("SoLoader", "setLibraryPath " + str);
        mLibraryPath = str;
    }

    public static boolean loadLibrary(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            LiteavLog.m76093w("SoLoader", "load library " + str2 + " from path " + str);
            System.load(str + "/lib" + str2 + ".so");
            return true;
        } catch (Error e11) {
            LiteavLog.m76083e("SoLoader", "load library : " + e11.toString());
            return false;
        } catch (Exception e12) {
            LiteavLog.m76093w("SoLoader", "load library : " + e12.toString());
            return false;
        }
    }
}
