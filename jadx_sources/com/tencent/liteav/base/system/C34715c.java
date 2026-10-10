package com.tencent.liteav.base.system;

import com.tencent.liteav.base.util.C34745j;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class C34715c implements C34745j.a {

    /* JADX INFO: renamed from: a */
    private static final C34715c f73498a = new C34715c();

    /* JADX INFO: renamed from: a */
    public static C34745j.a m76059a() {
        return f73498a;
    }

    @Override // com.tencent.liteav.base.util.C34745j.a
    /* JADX INFO: renamed from: a */
    public final void mo76060a(boolean z11) {
        LiteavSystemInfo.onAppBackgroundStateChanged(z11);
    }

    private C34715c() {
    }
}
