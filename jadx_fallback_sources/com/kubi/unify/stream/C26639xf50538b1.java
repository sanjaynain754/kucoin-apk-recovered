package com.kubi.unify.stream;

/* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1 */
/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/unify/entity/UnifyBalanceEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 1, 2}, m90124l = {308, 308, 314}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$flow", "$this$flow"}, m90127s = {"L$0", "L$0", "L$0"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUnifyNetworkDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,520:1\n375#2:521\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1\n*L\n306#1:521\n*E\n"})
public final class C26639xf50538b1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.InterfaceC41635f<? super com.kubi.unify.entity.UnifyBalanceEntity>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $currency;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.kubi.unify.stream.UnifyNetworkDataSourceImpl this$0;

    public C26639xf50538b1(com.kubi.unify.stream.UnifyNetworkDataSourceImpl r1, java.lang.String r2, kotlin.coroutines.Continuation<? super com.kubi.unify.stream.C26639xf50538b1> r3) {
            r0 = this;
            r0.this$0 = r1
            r0.$currency = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1 r0 = new com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1
            com.kubi.unify.stream.UnifyNetworkDataSourceImpl r1 = r3.this$0
            java.lang.String r2 = r3.$currency
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.InterfaceC41635f<? super com.kubi.unify.entity.UnifyBalanceEntity> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.flow.InterfaceC41635f<? super com.kubi.unify.entity.UnifyBalanceEntity> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$periodicApiFlow$1 r1 = (com.kubi.unify.stream.C26639xf50538b1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.flow.f r0 = (kotlinx.coroutines.flow.InterfaceC41635f) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L2f
            if (r2 == r6) goto L27
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            goto L2f
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            goto L66
        L23:
            r10 = move-exception
            goto L5f
        L25:
            r10 = move-exception
            goto L75
        L27:
            java.lang.Object r2 = r9.L$1
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.InterfaceC41635f) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            goto L52
        L2f:
            kotlin.ResultKt.throwOnFailure(r10)
        L32:
            kotlin.coroutines.CoroutineContext r10 = r9.getContext()
            boolean r10 = kotlinx.coroutines.C41783z1.m91411q(r10)
            if (r10 == 0) goto L76
            com.kubi.unify.stream.UnifyNetworkDataSourceImpl r10 = r9.this$0     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            i60.c r10 = com.kubi.unify.stream.UnifyNetworkDataSourceImpl.m65370l(r10)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            java.lang.String r2 = r9.$currency     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.L$0 = r0     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.L$1 = r0     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.label = r6     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            java.lang.Object r10 = r10.m86737d(r2, r9)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            if (r10 != r1) goto L51
            goto L74
        L51:
            r2 = r0
        L52:
            r9.L$0 = r0     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.L$1 = r3     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            r9.label = r5     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            java.lang.Object r10 = r2.emit(r10, r9)     // Catch: java.lang.Exception -> L23 java.util.concurrent.CancellationException -> L25
            if (r10 != r1) goto L66
            goto L74
        L5f:
            java.lang.String r2 = "[unifyAccount]"
            java.lang.String r7 = "observeAvailableBalance poll"
            ro.C44128b.m97262f(r2, r7, r10)
        L66:
            r9.L$0 = r0
            r9.L$1 = r3
            r9.label = r4
            r7 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m90350b(r7, r9)
            if (r10 != r1) goto L32
        L74:
            return r1
        L75:
            throw r10
        L76:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
    }
}
