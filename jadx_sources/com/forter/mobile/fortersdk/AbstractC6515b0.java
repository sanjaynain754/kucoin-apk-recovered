package com.forter.mobile.fortersdk;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6515b0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static C6540g m12164a(String str) {
        C6510ae c6510aeM12198r = C6520c.m12182b().m12198r();
        if (c6510aeM12198r != null) {
            return c6510aeM12198r.m12133a(str);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static C6545h[] m12165b(String str) {
        C6540g c6540gM12164a = m12164a(str);
        if (c6540gM12164a != null && AbstractC6518b3.m12172f(c6540gM12164a.f10953c)) {
            C6545h[] c6545hArr = c6540gM12164a.f10954d;
            if (!AbstractC6539f3.m12287u(c6545hArr)) {
                return c6545hArr;
            }
            return null;
        }
        return null;
    }
}
