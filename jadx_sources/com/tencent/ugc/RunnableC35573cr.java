package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.cr */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35573cr implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76915a;

    /* JADX INFO: renamed from: b */
    private final List f76916b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79069a(TXVideoJoiner tXVideoJoiner, List list) {
        return new RunnableC35573cr(tXVideoJoiner, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$setVideoVolumes$12(this.f76915a, this.f76916b);
    }

    private RunnableC35573cr(TXVideoJoiner tXVideoJoiner, List list) {
        this.f76915a = tXVideoJoiner;
        this.f76916b = list;
    }
}
