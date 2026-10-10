package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class DirectorySoSource extends SoSource {
    public static final int ON_LD_LIBRARY_PATH = 2;
    public static final int RESOLVE_DEPENDENCIES = 1;
    protected final List<String> denyList;
    protected int flags;
    protected final File soDirectory;

    public DirectorySoSource(File file, int i11) {
        this(file, i11, new String[0]);
    }

    public DirectorySoSource(File file, int i11, String[] strArr) {
        this.soDirectory = file;
        this.flags = i11;
        this.denyList = Arrays.asList(strArr);
    }

    @Override // com.facebook.soloader.SoSource
    public void addToLdLibraryPath(Collection<String> collection) {
        try {
            collection.add(this.soDirectory.getCanonicalPath());
        } catch (IOException e11) {
            LogUtil.m10652e(SoLoader.TAG, "Failed to get canonical path for " + this.soDirectory.getName() + " due to " + e11.toString() + ", falling to the absolute one");
            collection.add(this.soDirectory.getAbsolutePath());
        }
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.SoSource
    public File getSoFileByName(String str) throws IOException {
        File file = new File(this.soDirectory, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i11, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return loadLibraryFrom(str, i11, this.soDirectory, threadPolicy);
    }

    public int loadLibraryFrom(String str, int i11, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.sSoFileLoader == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.denyList.contains(str)) {
            LogUtil.m10650d(SoLoader.TAG, str + " is on the denyList, skip loading from " + file.getCanonicalPath());
            return 0;
        }
        File soFileByName = getSoFileByName(str);
        if (soFileByName == null) {
            LogUtil.m10656v(SoLoader.TAG, str + " file not found on " + file.getCanonicalPath());
            return 0;
        }
        String canonicalPath = soFileByName.getCanonicalPath();
        LogUtil.m10650d(SoLoader.TAG, str + " file found at " + canonicalPath);
        if ((i11 & 1) != 0 && (this.flags & 2) != 0) {
            LogUtil.m10650d(SoLoader.TAG, str + " loaded implicitly");
            return 2;
        }
        if ((this.flags & 1) != 0) {
            ElfFileChannel elfFileChannel = new ElfFileChannel(soFileByName);
            try {
                NativeDeps.loadDependencies(str, elfFileChannel, i11, threadPolicy);
                elfFileChannel.close();
            } catch (Throwable th2) {
                try {
                    elfFileChannel.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            LogUtil.m10650d(SoLoader.TAG, "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.sSoFileLoader.load(canonicalPath, i11);
            return 1;
        } catch (UnsatisfiedLinkError e11) {
            throw SoLoaderULErrorFactory.create(str, e11);
        }
    }

    public void setExplicitDependencyResolution() {
        this.flags |= 1;
    }

    @Override // com.facebook.soloader.SoSource
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.soDirectory.getCanonicalPath());
        } catch (IOException unused) {
            name = this.soDirectory.getName();
        }
        return getName() + "[root = " + name + " flags = " + this.flags + ']';
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getLibraryDependencies(String str) throws IOException {
        File soFileByName = getSoFileByName(str);
        if (soFileByName == null) {
            return null;
        }
        ElfFileChannel elfFileChannel = new ElfFileChannel(soFileByName);
        try {
            String[] dependencies = NativeDeps.getDependencies(str, elfFileChannel);
            elfFileChannel.close();
            return dependencies;
        } catch (Throwable th2) {
            try {
                elfFileChannel.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // com.facebook.soloader.SoSource
    public String getLibraryPath(String str) throws IOException {
        File soFileByName = getSoFileByName(str);
        if (soFileByName == null) {
            return null;
        }
        return soFileByName.getCanonicalPath();
    }

    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) throws IOException {
        return getSoFileByName(str);
    }
}
