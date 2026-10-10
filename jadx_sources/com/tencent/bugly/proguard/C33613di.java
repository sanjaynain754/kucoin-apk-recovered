package com.tencent.bugly.proguard;

import android.os.Build;
import android.text.TextUtils;
import cn.jiguang.privates.push.constants.JPushConstants;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.di */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33613di {

    /* JADX INFO: renamed from: a */
    public static int f69625a = 3;

    /* JADX INFO: renamed from: b */
    public static int f69626b = 3;

    /* JADX INFO: renamed from: c */
    public static int f69627c = 3;

    /* JADX INFO: renamed from: a */
    public static boolean m72862a() {
        int i11 = f69626b;
        if (i11 != 3) {
            return i11 == 1;
        }
        String strMo73422j = C33714ie.m73408k().mo73422j();
        int i12 = (TextUtils.isEmpty(strMo73422j) || !(strMo73422j.toLowerCase().contains("hi") || strMo73422j.toLowerCase().contains("kirin"))) ? 2 : 1;
        f69626b = i12;
        return i12 == 1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m72863b() {
        int i11 = f69625a;
        if (i11 != 3) {
            return i11 == 1;
        }
        String str = Build.BRAND;
        int i12 = (TextUtils.isEmpty(str) || !str.toLowerCase().contains(JPushConstants.Manufacturer.OPPO)) ? 2 : 1;
        f69625a = i12;
        return i12 == 1;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m72864c() {
        int i11 = f69627c;
        if (i11 != 3) {
            return i11 == 1;
        }
        String str = Build.BRAND;
        int i12 = (TextUtils.isEmpty(str) || !str.toLowerCase().contains("samsung")) ? 2 : 1;
        f69627c = i12;
        return i12 == 1;
    }
}
