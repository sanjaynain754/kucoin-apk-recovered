package com.ishumei.smantifraud.l111l1111llIl;

import android.text.TextUtils;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class l111l11111I1l {
    public static String l1111l111111Il() {
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random(System.currentTimeMillis());
        for (int i11 = 0; i11 < 5; i11++) {
            sb2.append(random.nextInt(10));
        }
        return System.currentTimeMillis() + C33820nf.f71144W + ((Object) sb2);
    }

    public static boolean l1111l111111Il(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean l1111l111111Il(String str, String str2) {
        return TextUtils.equals(str, str2);
    }
}
