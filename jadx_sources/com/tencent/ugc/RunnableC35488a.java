package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35488a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final GlobalContextManager f76726a;

    /* JADX INFO: renamed from: a */
    public static Runnable m78989a(GlobalContextManager globalContextManager) {
        return new RunnableC35488a(globalContextManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76726a.initGlobalContext();
    }

    private RunnableC35488a(GlobalContextManager globalContextManager) {
        this.f76726a = globalContextManager;
    }
}
