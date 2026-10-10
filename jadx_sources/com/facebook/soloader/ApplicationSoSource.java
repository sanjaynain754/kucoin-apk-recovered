package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes45.dex */
public class ApplicationSoSource extends SoSource implements RecoverableSoSource {
    private final int flags;
    private DirectorySoSource soSource;

    private static File getNativeLibDirFromContext(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.SoSource
    public void addToLdLibraryPath(Collection<String> collection) {
        this.soSource.addToLdLibraryPath(collection);
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getLibraryDependencies(String str) throws IOException {
        return this.soSource.getLibraryDependencies(str);
    }

    @Override // com.facebook.soloader.SoSource
    public String getLibraryPath(String str) throws IOException {
        return this.soSource.getLibraryPath(str);
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.SoSource
    public File getSoFileByName(String str) throws IOException {
        return this.soSource.getSoFileByName(str);
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i11, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.soSource.loadLibrary(str, i11, threadPolicy);
    }

    @Override // com.facebook.soloader.SoSource
    public void prepare(int i11) throws IOException {
        this.soSource.prepare(i11);
    }

    @Override // com.facebook.soloader.RecoverableSoSource
    public SoSource recover(Context context) {
        this.soSource = new DirectorySoSource(getNativeLibDirFromContext(context), this.flags | 1);
        return this;
    }

    @Override // com.facebook.soloader.SoSource
    public String toString() {
        return getName() + "[" + this.soSource.toString() + "]";
    }

    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) throws IOException {
        return this.soSource.unpackLibrary(str);
    }

    public ApplicationSoSource(Context context, int i11) {
        this.flags = i11;
        this.soSource = new DirectorySoSource(getNativeLibDirFromContext(context), i11);
    }
}
