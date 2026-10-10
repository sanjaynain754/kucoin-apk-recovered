package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class DirectSplitSoSource extends SoSource {
    protected final String mSplitName;
    protected Manifest mManifest = null;
    protected Set<String> mLibs = null;

    public static String getSplitPath(String str) {
        if (TtmlNode.RUBY_BASE.equals(str)) {
            return SoLoader.sApplicationContext.getApplicationInfo().sourceDir;
        }
        String[] strArr = SoLoader.sApplicationContext.getApplicationInfo().splitSourceDirs;
        if (strArr == null) {
            throw new IllegalStateException("No splits avaiable");
        }
        String str2 = "split_" + str + ".apk";
        for (String str3 : strArr) {
            if (str3.endsWith(str2)) {
                return str3;
            }
        }
        throw new IllegalStateException("Could not find " + str + " split");
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getLibraryDependencies(String str) {
        Set<String> set = this.mLibs;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return new String[0];
        }
        return null;
    }

    @Override // com.facebook.soloader.SoSource
    public String getLibraryPath(String str) {
        Set<String> set = this.mLibs;
        if (set == null || this.mManifest == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!set.contains(str)) {
            return null;
        }
        return getSplitPath(this.mSplitName) + "!/lib/" + this.mManifest.arch + "/" + str;
    }

    public Manifest getManifest() {
        Manifest manifest = this.mManifest;
        if (manifest != null) {
            return manifest;
        }
        throw new IllegalStateException("prepare not called");
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getSoSourceAbis() {
        Manifest manifest = this.mManifest;
        if (manifest != null) {
            return new String[]{manifest.arch};
        }
        throw new IllegalStateException("prepare not called");
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        Set<String> set = this.mLibs;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return loadLibraryImpl(str, i11);
        }
        return 0;
    }

    @Override // com.facebook.soloader.SoSource
    public void prepare(int i11) throws IOException {
        InputStream inputStreamOpen = SoLoader.sApplicationContext.getAssets().open(this.mSplitName + ".soloader-manifest");
        try {
            this.mManifest = Manifest.read(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            this.mLibs = new HashSet(this.mManifest.libs);
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public DirectSplitSoSource(String str) {
        this.mSplitName = str;
    }

    @Override // com.facebook.soloader.SoSource
    public File getSoFileByName(String str) {
        String libraryPath = getLibraryPath(str);
        if (libraryPath == null) {
            return null;
        }
        return new File(libraryPath);
    }

    @SuppressLint({"MissingSoLoaderLibrary"})
    public int loadLibraryImpl(String str, int i11) {
        String libraryPath = getLibraryPath(str);
        libraryPath.getClass();
        System.load(libraryPath);
        return 1;
    }

    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) {
        return getSoFileByName(str);
    }
}
