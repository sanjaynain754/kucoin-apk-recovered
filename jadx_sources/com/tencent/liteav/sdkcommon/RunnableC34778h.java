package com.tencent.liteav.sdkcommon;

import android.widget.ScrollView;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.h */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34778h implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34777g f73661a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76178a(C34777g c34777g) {
        return new RunnableC34778h(c34777g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.f73661a.f73650k;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }

    private RunnableC34778h(C34777g c34777g) {
        this.f73661a = c34777g;
    }
}
