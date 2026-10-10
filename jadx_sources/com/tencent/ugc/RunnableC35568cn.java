package com.tencent.ugc;

import java.util.Map;

/* JADX INFO: renamed from: com.tencent.ugc.cn */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35568cn implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76907a;

    /* JADX INFO: renamed from: b */
    private final Map f76908b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79065a(TXVideoJoiner tXVideoJoiner, Map map) {
        return new RunnableC35568cn(tXVideoJoiner, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76907a.mMetaData = this.f76908b;
    }

    private RunnableC35568cn(TXVideoJoiner tXVideoJoiner, Map map) {
        this.f76907a = tXVideoJoiner;
        this.f76908b = map;
    }
}
