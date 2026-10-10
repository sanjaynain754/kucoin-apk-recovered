package com.tencent.liteav.sdkcommon;

import android.widget.ScrollView;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.l */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34782l implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34777g f73666a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76182a(C34777g c34777g) {
        return new RunnableC34782l(c34777g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.f73666a.f73650k;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }

    private RunnableC34782l(C34777g c34777g) {
        this.f73666a = c34777g;
    }
}
