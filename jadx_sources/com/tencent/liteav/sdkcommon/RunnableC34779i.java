package com.tencent.liteav.sdkcommon;

import android.widget.ScrollView;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.i */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34779i implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34777g f73662a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76179a(C34777g c34777g) {
        return new RunnableC34779i(c34777g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.f73662a.f73650k;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }

    private RunnableC34779i(C34777g c34777g) {
        this.f73662a = c34777g;
    }
}
