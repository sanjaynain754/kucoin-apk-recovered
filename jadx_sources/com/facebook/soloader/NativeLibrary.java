package com.facebook.soloader;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public abstract class NativeLibrary {
    private static final String TAG = "com.facebook.soloader.NativeLibrary";
    private List<String> mLibraryNames;
    private final Object mLock = new Object();
    private Boolean mLoadLibraries = Boolean.TRUE;
    private boolean mLibrariesLoaded = false;
    private volatile UnsatisfiedLinkError mLinkError = null;

    public UnsatisfiedLinkError getError() {
        return this.mLinkError;
    }

    public boolean loadLibraries() {
        synchronized (this.mLock) {
            if (!this.mLoadLibraries.booleanValue()) {
                return this.mLibrariesLoaded;
            }
            try {
                List<String> list = this.mLibraryNames;
                if (list != null) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        SoLoader.loadLibrary(it.next());
                    }
                }
                initialNativeCheck();
                this.mLibrariesLoaded = true;
                this.mLibraryNames = null;
            } catch (UnsatisfiedLinkError e11) {
                LogUtil.m10653e(TAG, "Failed to load native lib (initial check): ", e11);
                this.mLinkError = e11;
                this.mLibrariesLoaded = false;
            } catch (Throwable th2) {
                LogUtil.m10653e(TAG, "Failed to load native lib (other error): ", th2);
                this.mLinkError = new UnsatisfiedLinkError("Failed loading libraries");
                this.mLinkError.initCause(th2);
                this.mLibrariesLoaded = false;
            }
            this.mLoadLibraries = Boolean.FALSE;
            return this.mLibrariesLoaded;
        }
    }

    public NativeLibrary(List<String> list) {
        this.mLibraryNames = list;
    }

    public void ensureLoaded() throws UnsatisfiedLinkError {
        if (loadLibraries()) {
        } else {
            throw this.mLinkError;
        }
    }

    public void initialNativeCheck() throws UnsatisfiedLinkError {
    }
}
