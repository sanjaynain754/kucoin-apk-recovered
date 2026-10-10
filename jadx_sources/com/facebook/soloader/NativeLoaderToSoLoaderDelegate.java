package com.facebook.soloader;

import com.facebook.soloader.nativeloader.NativeLoaderDelegate;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class NativeLoaderToSoLoaderDelegate implements NativeLoaderDelegate {
    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public boolean loadLibrary(String str, int i11) {
        return SoLoader.loadLibrary(str, (i11 & 1) != 0 ? 16 : 0);
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public String getLibraryPath(String str) throws IOException {
        return SoLoader.getLibraryPath(str);
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public int getSoSourcesVersion() {
        return SoLoader.getSoSourcesVersion();
    }
}
