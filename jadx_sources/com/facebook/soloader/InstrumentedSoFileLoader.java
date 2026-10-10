package com.facebook.soloader;

import android.annotation.SuppressLint;
import com.facebook.soloader.observer.ObserverHolder;

/* JADX INFO: loaded from: classes45.dex */
public class InstrumentedSoFileLoader implements SoFileLoader {
    private final SoFileLoader mDelegate;

    @Override // com.facebook.soloader.SoFileLoader
    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public void load(String str, int i11) {
        ObserverHolder.onSoFileLoaderLoadStart(this.mDelegate, "load", i11);
        try {
            this.mDelegate.load(str, i11);
            ObserverHolder.onSoFileLoaderLoadEnd(null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ObserverHolder.onSoFileLoaderLoadEnd(th2);
                throw th3;
            }
        }
    }

    @Override // com.facebook.soloader.SoFileLoader
    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public void loadBytes(String str, ElfByteChannel elfByteChannel, int i11) {
        ObserverHolder.onSoFileLoaderLoadStart(this.mDelegate, "loadBytes", i11);
        try {
            this.mDelegate.loadBytes(str, elfByteChannel, i11);
            ObserverHolder.onSoFileLoaderLoadEnd(null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ObserverHolder.onSoFileLoaderLoadEnd(th2);
                throw th3;
            }
        }
    }

    public InstrumentedSoFileLoader(SoFileLoader soFileLoader) {
        this.mDelegate = soFileLoader;
    }
}
