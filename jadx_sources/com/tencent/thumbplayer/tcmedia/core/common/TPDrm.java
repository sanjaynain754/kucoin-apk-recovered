package com.tencent.thumbplayer.tcmedia.core.common;

/* JADX INFO: loaded from: classes63.dex */
public final class TPDrm {
    private static final String TAG = "TPDrm";
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

    public static native int[] native_getDRMCapabilities();

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static int[] getDRMCapabilities() throws TPNativeLibraryException {
        if (isLibLoaded()) {
            try {
                int[] iArrNative_getDRMCapabilities = native_getDRMCapabilities();
                if (iArrNative_getDRMCapabilities == null) {
                    return new int[0];
                }
                return iArrNative_getDRMCapabilities;
            } catch (Throwable unused) {
                throw new TPNativeLibraryException("Failed to call native func.");
            }
        }
        throw new TPNativeLibraryException("Failed to load native library.");
    }
}
