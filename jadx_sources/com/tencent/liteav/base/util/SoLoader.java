package com.tencent.liteav.base.util;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes59.dex */
public class SoLoader {
    private static final String TAG = "SoLoader";
    private static ExternalSoLoader mExternalSoLoader = null;
    private static boolean mHasLoaded = false;
    private static String mLibraryPath = "";
    private static final Object mLoadLock = new Object();

    public interface ExternalSoLoader {
        boolean loadLibrary(String[] strArr);
    }

    public static boolean loadLibrary(String str) {
        try {
            synchronized (mLoadLock) {
                try {
                    ExternalSoLoader externalSoLoader = mExternalSoLoader;
                    if (externalSoLoader != null) {
                        return externalSoLoader.loadLibrary(new String[]{str});
                    }
                    if (TextUtils.isEmpty(mLibraryPath)) {
                        Log.w("SoLoader", "load library " + str + " from system path ");
                        System.loadLibrary(str);
                        return true;
                    }
                    boolean zLoadLibrary = loadLibrary(mLibraryPath, str);
                    Log.w("SoLoader", "load library " + str + " in customer path:" + zLoadLibrary);
                    return zLoadLibrary;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Log.w("SoLoader", "load library " + str + " failed: " + th3);
            return false;
        }
    }

    private static boolean loadLibraryInCustomerPath(String[] strArr) {
        int i11 = 0;
        if (strArr == null || strArr.length == 0 || TextUtils.isEmpty(mLibraryPath)) {
            return false;
        }
        int length = strArr.length;
        boolean z11 = false;
        while (i11 < length) {
            String str = strArr[i11];
            boolean zLoadLibrary = loadLibrary(mLibraryPath, str);
            Log.i("SoLoader", "load library " + str + " in customer path:" + zLoadLibrary);
            if (!zLoadLibrary) {
                return zLoadLibrary;
            }
            i11++;
            z11 = zLoadLibrary;
        }
        return z11;
    }

    public static String getLibraryPath() {
        return mLibraryPath;
    }

    public static boolean loadAllLibraries() {
        boolean z11;
        synchronized (mLoadLock) {
            try {
                if (!mHasLoaded) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("txsoundtouch");
                    arrayList.add("txffmpeg");
                    arrayList.add("liteavsdk");
                    if (mExternalSoLoader != null) {
                        mHasLoaded = loadLibraryByExternal((String[]) arrayList.toArray(new String[arrayList.size()]));
                    } else if (TextUtils.isEmpty(mLibraryPath)) {
                        mHasLoaded = loadLibraryDefault((String[]) arrayList.toArray(new String[arrayList.size()]));
                    } else {
                        mHasLoaded = loadLibraryInCustomerPath((String[]) arrayList.toArray(new String[arrayList.size()]));
                    }
                }
                z11 = mHasLoaded;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    private static boolean loadLibraryByExternal(String[] strArr) {
        ExternalSoLoader externalSoLoader = mExternalSoLoader;
        if (externalSoLoader != null && strArr != null && strArr.length != 0) {
            try {
                boolean zLoadLibrary = externalSoLoader.loadLibrary(strArr);
                Log.i("SoLoader", "load libraries " + Arrays.toString(strArr) + " by external: " + zLoadLibrary);
                return zLoadLibrary;
            } catch (Throwable th2) {
                Log.w("SoLoader", "load libraries " + Arrays.toString(strArr) + " by external: " + th2);
            }
        }
        return false;
    }

    private static boolean loadLibraryDefault(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            try {
                for (String str : strArr) {
                    System.loadLibrary(str);
                    Log.i("SoLoader", "load library " + str + " in default path success.");
                }
                return true;
            } catch (Throwable th2) {
                Log.w("SoLoader", "load libraries " + Arrays.toString(strArr) + " in default path error: " + th2);
            }
        }
        return false;
    }

    public static void setExternalSoLoader(ExternalSoLoader externalSoLoader) {
        synchronized (mLoadLock) {
            mExternalSoLoader = externalSoLoader;
        }
    }

    public static void setLibraryPath(String str) {
        Log.w("SoLoader", "setLibraryPath ".concat(String.valueOf(str)));
        mLibraryPath = str;
    }

    private static boolean loadLibrary(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Log.w("SoLoader", "load library " + str2 + " from path " + str);
            System.load(str + "/lib" + str2 + ".so");
            return true;
        } catch (Throwable th2) {
            Log.w("SoLoader", "load library " + str2 + "in path" + str + " failed: " + th2);
            return false;
        }
    }
}
