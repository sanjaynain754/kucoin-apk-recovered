package com.appsflyer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.appsflyer.b */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5133b implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f6280b;

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.AFAdRevenueData(this.f6280b);
    }

    public /* synthetic */ RunnableC5133b(Function1 function1) {
        this.f6280b = function1;
    }
}
