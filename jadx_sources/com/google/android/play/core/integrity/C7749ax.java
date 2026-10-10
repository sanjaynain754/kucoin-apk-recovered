package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C7812ag;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ax */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7749ax {

    /* JADX INFO: renamed from: a */
    private static InterfaceC7748aw f12001a;

    /* JADX INFO: renamed from: a */
    public static synchronized InterfaceC7748aw m13237a(Context context) {
        try {
            if (f12001a == null) {
                C7795u c7795u = new C7795u(null);
                c7795u.m13269a(C7812ag.m13298a(context));
                f12001a = c7795u.mo13235b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f12001a;
    }
}
