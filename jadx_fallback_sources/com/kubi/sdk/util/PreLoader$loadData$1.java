package com.kubi.sdk.util;

/* JADX INFO: compiled from: PreLoader.kt */
/* JADX INFO: loaded from: classes43.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.sdk.util.PreLoader", m90122f = "PreLoader.kt", m90123i = {}, m90124l = {58, 60}, m90125m = "loadData", m90126n = {}, m90127s = {})
public final class PreLoader$loadData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.kubi.sdk.util.PreLoader<T> this$0;

    public PreLoader$loadData$1(com.kubi.sdk.util.PreLoader<T> r1, kotlin.coroutines.Continuation<? super com.kubi.sdk.util.PreLoader$loadData$1> r2) {
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
            com.kubi.sdk.util.PreLoader<T> r2 = r1.this$0
            java.lang.Object r2 = r2.m58344d(r1)
            return r2
    }
}
