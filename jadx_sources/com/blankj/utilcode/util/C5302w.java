package com.blankj.utilcode.util;

import android.os.Environment;
import java.io.File;

/* JADX INFO: renamed from: com.blankj.utilcode.util.w */
/* JADX INFO: compiled from: PathUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5302w {

    /* JADX INFO: renamed from: a */
    public static final char f6634a = File.separatorChar;

    /* JADX INFO: renamed from: a */
    public static String m6506a(File file) {
        return file == null ? "" : file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static String m6507b() {
        if (!C5299u0.m6468F()) {
            return "";
        }
        return m6506a(C5287o0.m6331a().getExternalCacheDir());
    }

    /* JADX INFO: renamed from: c */
    public static String m6508c() {
        if (!C5299u0.m6468F()) {
            return "";
        }
        return m6506a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
    }

    /* JADX INFO: renamed from: d */
    public static String m6509d() {
        return m6506a(C5287o0.m6331a().getCacheDir());
    }

    /* JADX INFO: renamed from: e */
    public static String m6510e() {
        return m6506a(C5287o0.m6331a().getFilesDir());
    }
}
