package com.kubi.sdk.pkg.util;

/* JADX INFO: compiled from: SingleDeferredCache.kt */
/* JADX INFO: loaded from: classes41.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.sdk.pkg.util.SingleDeferredCache", m90122f = "SingleDeferredCache.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 1}, m90124l = {117, 98}, m90125m = "cache", m90126n = {"this", "key", "action", "$this$withLock_u24default$iv", "timeout", "this", "key", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2"})
public final class SingleDeferredCache$cache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.kubi.sdk.pkg.util.SingleDeferredCache<T> this$0;

    public SingleDeferredCache$cache$1(com.kubi.sdk.pkg.util.SingleDeferredCache<T> r1, kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.util.SingleDeferredCache$cache$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            r6 = this;
            r6.result = r7
            int r7 = r6.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.label = r7
            com.kubi.sdk.pkg.util.SingleDeferredCache<T> r0 = r6.this$0
            r2 = 0
            r4 = 0
            r1 = 0
            r5 = r6
            java.lang.Object r7 = r0.m57845a(r1, r2, r4, r5)
            return r7
    }
}
