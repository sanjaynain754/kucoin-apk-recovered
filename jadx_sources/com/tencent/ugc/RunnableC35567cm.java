package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.cm */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35567cm implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76905a;

    /* JADX INFO: renamed from: b */
    private final List f76906b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79064a(TXVideoJoiner tXVideoJoiner, List list) {
        return new RunnableC35567cm(tXVideoJoiner, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76905a.mVideoSourceList = this.f76906b;
    }

    private RunnableC35567cm(TXVideoJoiner tXVideoJoiner, List list) {
        this.f76905a = tXVideoJoiner;
        this.f76906b = list;
    }
}
