package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C7812ag;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.z */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7800z {

    /* JADX INFO: renamed from: a */
    private static C7793s f12085a;

    /* JADX INFO: renamed from: a */
    public static synchronized C7793s m13271a(Context context) {
        try {
            if (f12085a == null) {
                C7791q c7791q = new C7791q(null);
                c7791q.m13266a(C7812ag.m13298a(context));
                f12085a = c7791q.mo13267b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f12085a;
    }
}
