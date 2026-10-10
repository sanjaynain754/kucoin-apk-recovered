package com.blankj.utilcode.util;

import android.os.Vibrator;
import androidx.annotation.RequiresPermission;

/* JADX INFO: renamed from: com.blankj.utilcode.util.v0 */
/* JADX INFO: compiled from: VibrateUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5301v0 {

    /* JADX INFO: renamed from: a */
    public static Vibrator f6633a;

    /* JADX INFO: renamed from: a */
    public static Vibrator m6504a() {
        if (f6633a == null) {
            f6633a = (Vibrator) C5287o0.m6331a().getSystemService("vibrator");
        }
        return f6633a;
    }

    @RequiresPermission("android.permission.VIBRATE")
    /* JADX INFO: renamed from: b */
    public static void m6505b(long j11) {
        Vibrator vibratorM6504a = m6504a();
        if (vibratorM6504a == null) {
            return;
        }
        vibratorM6504a.vibrate(j11);
    }
}
