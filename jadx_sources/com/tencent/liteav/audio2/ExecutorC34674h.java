package com.tencent.liteav.audio2;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.tencent.liteav.audio2.h */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class ExecutorC34674h implements Executor {

    /* JADX INFO: renamed from: a */
    private final C34671e f73361a;

    /* JADX INFO: renamed from: a */
    public static Executor m76012a(C34671e c34671e) {
        return new ExecutorC34674h(c34671e);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f73361a.f73354f.mo76133a(runnable);
    }

    private ExecutorC34674h(C34671e c34671e) {
        this.f73361a = c34671e;
    }
}
