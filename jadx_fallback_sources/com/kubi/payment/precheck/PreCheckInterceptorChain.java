package com.kubi.payment.precheck;

/* JADX INFO: compiled from: PreCheckInterceptorChain.kt */
/* JADX INFO: loaded from: classes33.dex */
@kotlin.Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/precheck/PreCheckInterceptorChain;", "", "interceptors", "", "Lcom/kubi/payment/precheck/IPreCheckInterceptor;", "<init>", "(Ljava/util/List;)V", "proceed", "Lcom/kubi/payment/precheck/PreCheckResult;", "preCheckRequest", "Lcom/kubi/payment/precheck/PreCheckRequest;", "(Lcom/kubi/payment/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PreCheckInterceptorChain {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.kubi.payment.precheck.InterfaceC21349a> f40168a;

    public PreCheckInterceptorChain(@org.jetbrains.annotations.NotNull java.util.List<? extends com.kubi.payment.precheck.InterfaceC21349a> r2) {
            r1 = this;
            java.lang.String r0 = "interceptors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.f40168a = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m49416a(@org.jetbrains.annotations.NotNull com.kubi.payment.precheck.PreCheckRequest r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.kubi.payment.precheck.PreCheckResult> r8) {
            r6 = this;
            boolean r0 = r8 instanceof com.kubi.payment.precheck.PreCheckInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r8
            com.kubi.payment.precheck.PreCheckInterceptorChain$proceed$1 r0 = (com.kubi.payment.precheck.PreCheckInterceptorChain$proceed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.payment.precheck.PreCheckInterceptorChain$proceed$1 r0 = new com.kubi.payment.precheck.PreCheckInterceptorChain$proceed$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$2
            com.kubi.payment.precheck.a r7 = (com.kubi.payment.precheck.InterfaceC21349a) r7
            java.lang.Object r7 = r0.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$0
            com.kubi.payment.precheck.PreCheckRequest r2 = (com.kubi.payment.precheck.PreCheckRequest) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6b
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.List<com.kubi.payment.precheck.a> r8 = r6.f40168a
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
        L49:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r7.next()
            com.kubi.payment.precheck.a r2 = (com.kubi.payment.precheck.InterfaceC21349a) r2
            r0.L$0 = r8
            r0.L$1 = r7
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r2 = r2.mo47135a(r8, r0)
            if (r2 != r1) goto L68
            return r1
        L68:
            r5 = r2
            r2 = r8
            r8 = r5
        L6b:
            com.kubi.payment.precheck.PreCheckResult r8 = (com.kubi.payment.precheck.PreCheckResult) r8
            boolean r4 = r8 instanceof com.kubi.payment.precheck.PreCheckResult.Success
            if (r4 != 0) goto L72
            return r8
        L72:
            r8 = r2
            goto L49
        L74:
            com.kubi.payment.precheck.PreCheckResult$Success r7 = com.kubi.payment.precheck.PreCheckResult.Success.INSTANCE
            return r7
    }
}
