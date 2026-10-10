package com.tencent.thumbplayer.tcmedia.core.common;

/* JADX INFO: loaded from: classes63.dex */
public class TPFeatureCapability {
    private static String TAG = "TPFeatureCapability";
    private static boolean mIsLibLoaded;

    static {
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(null);
            mIsLibLoaded = true;
        } catch (UnsupportedOperationException e11) {
            TPNativeLog.printLog(4, e11.getMessage());
            mIsLibLoaded = false;
        }
    }

    private static native boolean _isFeatureSupport(int i11);

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static boolean isFeatureSupport(int i11) throws TPNativeLibraryException {
        if (isLibLoaded()) {
            try {
                return _isFeatureSupport(i11);
            } catch (Throwable th2) {
                TPNativeLog.printLog(4, th2.getMessage());
                throw new TPNativeLibraryException("Failed to call _isFeatureSupport.");
            }
        }
        throw new TPNativeLibraryException("isFeatureSupport: Failed to load native library.");
    }
}
