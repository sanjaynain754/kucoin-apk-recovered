package com.tencent.liteav.videobase.videobase;

import android.view.View;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.videobase.a */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34904a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final View f74332a;

    /* JADX INFO: renamed from: b */
    private final int f74333b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76565a(View view, int i11) {
        return new RunnableC34904a(view, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74332a.setVisibility(this.f74333b);
    }

    private RunnableC34904a(View view, int i11) {
        this.f74332a = view;
        this.f74333b = i11;
    }
}
