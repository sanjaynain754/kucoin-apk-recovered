package com.facebook.soloader.nativeloader;

import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class NativeLoader {
    private static NativeLoaderDelegate sDelegate;

    public static boolean loadLibrary(String str) {
        return loadLibrary(str, 0);
    }

    public static String getLibraryPath(String str) throws IOException {
        NativeLoaderDelegate nativeLoaderDelegate;
        synchronized (NativeLoader.class) {
            nativeLoaderDelegate = sDelegate;
            if (nativeLoaderDelegate == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return nativeLoaderDelegate.getLibraryPath(str);
    }

    public static int getSoSourcesVersion() {
        NativeLoaderDelegate nativeLoaderDelegate;
        synchronized (NativeLoader.class) {
            nativeLoaderDelegate = sDelegate;
            if (nativeLoaderDelegate == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return nativeLoaderDelegate.getSoSourcesVersion();
    }

    public static void init(NativeLoaderDelegate nativeLoaderDelegate) {
        synchronized (NativeLoader.class) {
            try {
                if (sDelegate != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                sDelegate = nativeLoaderDelegate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isInitialized() {
        boolean z11;
        synchronized (NativeLoader.class) {
            z11 = sDelegate != null;
        }
        return z11;
    }

    public static boolean loadLibrary(String str, int i11) {
        NativeLoaderDelegate nativeLoaderDelegate;
        synchronized (NativeLoader.class) {
            nativeLoaderDelegate = sDelegate;
            if (nativeLoaderDelegate == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return nativeLoaderDelegate.loadLibrary(str, i11);
    }

    private NativeLoader() {
    }

    public static void initIfUninitialized(NativeLoaderDelegate nativeLoaderDelegate) {
        if (!isInitialized()) {
            init(nativeLoaderDelegate);
        }
    }
}
