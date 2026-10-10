package com.tencent.liteav.videobase.p136b;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.b.c */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class RunnableC34864c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34863b f74117a;

    /* JADX INFO: renamed from: b */
    private final List f74118b;

    /* JADX INFO: renamed from: c */
    private final List f74119c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76479a(C34863b c34863b, List list, List list2) {
        return new RunnableC34864c(c34863b, list, list2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34863b.m76478a(this.f74117a, this.f74118b, this.f74119c);
    }

    private RunnableC34864c(C34863b c34863b, List list, List list2) {
        this.f74117a = c34863b;
        this.f74118b = list;
        this.f74119c = list2;
    }
}
