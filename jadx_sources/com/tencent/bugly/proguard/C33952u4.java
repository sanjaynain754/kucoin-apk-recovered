package com.tencent.bugly.proguard;

import android.os.StatFs;
import com.tencent.bugly.common.utils.AndroidVersion;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.u4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33952u4 {
    /* JADX INFO: renamed from: a */
    public static long m75155a() {
        try {
            StatFs statFs = new StatFs(C33598d3.m72772c().getExternalCacheDir().getAbsolutePath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1024;
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75156b() {
        if (m75155a() * 1024 > Runtime.getRuntime().totalMemory()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m75157c() {
        return AndroidVersion.isOverL();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m75158d() {
        return AndroidVersion.isOverM();
    }
}
