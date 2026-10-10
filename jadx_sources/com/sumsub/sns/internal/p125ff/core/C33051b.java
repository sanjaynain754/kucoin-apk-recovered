package com.sumsub.sns.internal.p125ff.core;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ff.core.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33051b {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f67501a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f67502b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C33050a m71436a(String str, String str2, boolean z11, String str3) {
        if (this.f67502b.contains(str) || this.f67501a.contains(str)) {
            throw new IllegalArgumentException(("Feature name " + str + " is already used").toString());
        }
        C33050a c33050a = new C33050a(str, str3, z11, str2);
        if (z11) {
            this.f67502b.put(str, c33050a);
            return c33050a;
        }
        this.f67501a.put(str, c33050a);
        return c33050a;
    }
}
