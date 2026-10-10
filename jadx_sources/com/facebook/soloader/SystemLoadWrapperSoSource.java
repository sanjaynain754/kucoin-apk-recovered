package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class SystemLoadWrapperSoSource extends SoSource {
    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) throws IOException {
        return null;
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // com.facebook.soloader.SoSource
    public String toString() {
        return getName() + "[" + SysUtil.getClassLoaderLdLoadLibrary() + "]";
    }

    @Override // com.facebook.soloader.SoSource
    public String getLibraryPath(String str) throws IOException {
        String classLoaderLdLoadLibrary = SysUtil.getClassLoaderLdLoadLibrary();
        if (TextUtils.isEmpty(classLoaderLdLoadLibrary)) {
            return null;
        }
        for (String str2 : classLoaderLdLoadLibrary.split(C33844oi.f71346o)) {
            if (SysUtil.isDisabledExtractNativeLibs(SoLoader.sApplicationContext) && str2.contains(".apk!")) {
                return str2 + File.separator + str;
            }
            File file = new File(str2, str);
            if (file.exists()) {
                return file.getCanonicalPath();
            }
        }
        return null;
    }

    @Override // com.facebook.soloader.SoSource
    @SuppressLint({"CatchGeneralException"})
    public int loadLibrary(String str, int i11, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e11) {
            LogUtil.m10653e(SoLoader.TAG, "Error loading library: " + str, e11);
            return 0;
        }
    }
}
