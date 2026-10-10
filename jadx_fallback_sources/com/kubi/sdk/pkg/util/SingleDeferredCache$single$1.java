package com.kubi.sdk.pkg.util;

/* JADX INFO: compiled from: SingleDeferredCache.kt */
/* JADX INFO: loaded from: classes41.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.sdk.pkg.util.SingleDeferredCache", m90122f = "SingleDeferredCache.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 2, 2, 2}, m90124l = {117, 60, 66}, m90125m = "single", m90126n = {"this", "key", "onReuse", "action", "newDeferred", "ownsExecution", "$this$withLock_u24default$iv", "this", "key", "newDeferred"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2"})
public final class SingleDeferredCache$single$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.kubi.sdk.pkg.util.SingleDeferredCache<T> this$0;

    public SingleDeferredCache$single$1(com.kubi.sdk.pkg.util.SingleDeferredCache<T> r1, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.util.SingleDeferredCache$single$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            com.kubi.sdk.pkg.util.SingleDeferredCache<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.m57847c(r0, r0, r0, r1)
            return r2
    }
}
