package com.kubi.futures.trade.position;

import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.d1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class RunnableC13930d1 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FuturesPositionFragment f24142b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function0 f24143c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f24144d;

    @Override // java.lang.Runnable
    public final void run() {
        FuturesPositionFragment.n3(this.f24142b, this.f24143c, this.f24144d);
    }

    public /* synthetic */ RunnableC13930d1(FuturesPositionFragment futuresPositionFragment, Function0 function0, int i11) {
        this.f24142b = futuresPositionFragment;
        this.f24143c = function0;
        this.f24144d = i11;
    }
}
