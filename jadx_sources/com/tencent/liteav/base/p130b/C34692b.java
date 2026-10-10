package com.tencent.liteav.base.p130b;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.liteav.base.b.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34692b {

    /* JADX INFO: renamed from: a */
    private static final long f73386a = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: b */
    private final Map<String, C34691a> f73387b = new HashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized C34691a m76042a(String str) {
        C34691a c34691a;
        c34691a = this.f73387b.get(str);
        if (c34691a == null) {
            c34691a = new C34691a(f73386a);
            this.f73387b.put(str, c34691a);
        }
        return c34691a;
    }
}
