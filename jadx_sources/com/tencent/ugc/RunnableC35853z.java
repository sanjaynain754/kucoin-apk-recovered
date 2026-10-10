package com.tencent.ugc;

import java.util.Collections;

/* JADX INFO: renamed from: com.tencent.ugc.z */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35853z implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77441a;

    /* JADX INFO: renamed from: b */
    private final String f77442b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79335a(TXVideoEditer tXVideoEditer, String str) {
        return new RunnableC35853z(tXVideoEditer, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77441a.setMediaSourcePathsInternal(Collections.singletonList(this.f77442b));
    }

    private RunnableC35853z(TXVideoEditer tXVideoEditer, String str) {
        this.f77441a = tXVideoEditer;
        this.f77442b = str;
    }
}
