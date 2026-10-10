package com.tencent.liteav.videobase.videobase;

import android.view.View;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.videobase.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34905b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final View f74334a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76566a(View view) {
        return new RunnableC34905b(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74334a.requestLayout();
    }

    private RunnableC34905b(View view) {
        this.f74334a = view;
    }
}
