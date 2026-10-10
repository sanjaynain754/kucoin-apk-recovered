package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes63.dex */
public class TPNativeLibraryLoader {
    private static final String DEFAULT_LIB_PLAYER_CORE_VERSION = "2.32.0.573.min";
    private static final String MAIN_PLAYER_CORE_VERSION = "2.32.0";
    private static boolean mIsLibLoaded = false;
    private static Object mIsLibLoadedLock = new Object();
    private static final boolean mIsNeedLoadThirdPartiesAndFFmpeg = true;
    private static final String mLibIjkPrefix = "ijkhlscache-master";
    private static ITPNativeLibraryExternalLoader mLibLoader = null;
    private static final boolean mLibNameHasArchSuffix = false;
    private static final String mLibPlayerCorePrefix = "tpcore-master";
    private static final String mLibThirdPartiesPrefix = "tpthirdparties-master";
    private static final int mPlayerCoreSupportMinAndroidAPILevel = 14;

    private static native String _getPlayerCoreVersion();

    public static boolean isLibLoadedAndTryToLoad() {
        boolean z11;
        try {
            loadLibIfNeeded(null);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, "TPNativeLibraryLoader isLibLoaded error:" + th2.getMessage());
        }
        synchronized (mIsLibLoadedLock) {
            z11 = mIsLibLoaded;
        }
        return z11;
    }

    public static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    private static boolean isMatchJavaAndPlayerCore(String str, String str2) {
        TPNativeLog.printLog(2, "javaVersion:" + str + ", coreVersion:" + str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] strArrSplit = str.split("\\.");
            String[] strArrSplit2 = str2.split("\\.");
            if (strArrSplit.length >= 3 && strArrSplit2.length >= 3) {
                for (int i11 = 0; i11 < 3; i11++) {
                    if (!strArrSplit[i11].matches(strArrSplit2[i11])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean loadLib(Context context) {
        TPNativeLog.printLog(2, "loadLib cpu arch:" + TPSystemInfo.getCpuArchitecture());
        if (TPSystemInfo.getApiLevel() < 14) {
            TPNativeLog.printLog(3, "so load failed, current api level " + TPSystemInfo.getApiLevel() + " is less than 14");
            return false;
        }
        if (TPSystemInfo.getCpuArchitecture() == 3 || TPSystemInfo.getCpuArchitecture() == 4 || TPSystemInfo.getCpuArchitecture() == 0) {
            return false;
        }
        String strConcat = mLibThirdPartiesPrefix.concat("");
        ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader = mLibLoader;
        if (!(iTPNativeLibraryExternalLoader != null ? iTPNativeLibraryExternalLoader.loadLib(strConcat, DEFAULT_LIB_PLAYER_CORE_VERSION) : loadLibDefault(strConcat, context))) {
            TPNativeLog.printLog(4, "Failed to load ".concat(String.valueOf(strConcat)));
            return false;
        }
        String strConcat2 = mLibPlayerCorePrefix.concat("");
        ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader2 = mLibLoader;
        boolean zLoadLib = iTPNativeLibraryExternalLoader2 != null ? iTPNativeLibraryExternalLoader2.loadLib(strConcat2, DEFAULT_LIB_PLAYER_CORE_VERSION) : loadLibDefault(strConcat2, context);
        if (zLoadLib) {
            String playerCoreVersion = getPlayerCoreVersion();
            boolean zIsMatchJavaAndPlayerCore = isMatchJavaAndPlayerCore(MAIN_PLAYER_CORE_VERSION, playerCoreVersion);
            if (!zIsMatchJavaAndPlayerCore) {
                TPNativeLog.printLog(4, "nativePlayerCoreVer(" + playerCoreVersion + ") doesn't match javaPlayerCoreVer:(2.32.0)");
            }
            zLoadLib = zIsMatchJavaAndPlayerCore;
        }
        String strConcat3 = mLibIjkPrefix.concat("");
        ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader3 = mLibLoader;
        if (iTPNativeLibraryExternalLoader3 != null) {
            iTPNativeLibraryExternalLoader3.loadLib(strConcat3, DEFAULT_LIB_PLAYER_CORE_VERSION);
        } else {
            loadLibDefault(strConcat3, context);
        }
        if (zLoadLib) {
            TPNativeLog.printLog(2, "Native libs loaded successfully");
            return zLoadLib;
        }
        TPNativeLog.printLog(4, "Failed to load native libs");
        return zLoadLib;
    }

    private static boolean loadLibDefault(String str, Context context) {
        boolean zLoad = false;
        try {
            TPNativeLog.printLog(2, "loadLibDefault loading ".concat(String.valueOf(str)));
            System.loadLibrary(str);
            zLoad = true;
            TPNativeLog.printLog(2, "loadLibDefault " + str + " loaded successfully");
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, "loadLibDefault failed to load " + str + "," + th2.getMessage());
        }
        if (!zLoad && context != null && TPSystemInfo.getCpuArchitecture() >= 6) {
            try {
                TPNativeLog.printLog(2, "loadLibDefault try to load " + str + " from APK");
                zLoad = TPLoadLibFromApk.load(str, TPNativeLibraryLoader.class.getClassLoader(), context);
                if (zLoad) {
                    TPNativeLog.printLog(2, "loadLibDefault loaded " + str + " from APK successfully");
                } else {
                    TPNativeLog.printLog(4, "loadLibDefault loaded " + str + " from APK failed");
                }
            } catch (Throwable th3) {
                TPNativeLog.printLog(4, "loadLibDefault loaded " + str + " from APK failed," + th3.getMessage());
            }
        }
        return zLoad;
    }

    public static void loadLibIfNeeded(Context context) {
        synchronized (mIsLibLoadedLock) {
            try {
                if (!mIsLibLoaded) {
                    boolean zLoadLib = loadLib(context);
                    mIsLibLoaded = zLoadLib;
                    TPNativeLog.printLog(2, zLoadLib ? "TPNativeLibraryLoader load lib successfully" : "TPNativeLibraryLoader load lib failed");
                }
                if (!mIsLibLoaded) {
                    throw new UnsupportedOperationException("Failed to load native library");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setLibLoader(ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader) {
        mLibLoader = iTPNativeLibraryExternalLoader;
    }

    public static String getLibVersion() {
        return getPlayerCoreVersion();
    }

    public static String getPlayerCoreVersion() {
        try {
            return _getPlayerCoreVersion();
        } catch (Throwable unused) {
            TPNativeLog.printLog(2, "getPlayerCoreVersion: *.so is not loaded yet, return the hard-coded version number:2.32.0.573.min");
            return DEFAULT_LIB_PLAYER_CORE_VERSION;
        }
    }
}
