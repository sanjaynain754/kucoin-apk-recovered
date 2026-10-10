package com.kubi.unify.stream;

/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 1}, m90124l = {468, 469}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$flow"}, m90127s = {"L$0", "L$0"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUnifyNetworkDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,520:1\n375#2:521\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1\n*L\n467#1:521\n*E\n"})
public final class UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.InterfaceC41635f<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    public UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1(kotlin.coroutines.Continuation<? super com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1> r2) {
            r1 = this;
            r0 = 2
            r1.<init>(r0, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
            r1 = this;
            com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1 r0 = new com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1
            r0.<init>(r3)
            r0.L$0 = r2
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.InterfaceC41635f<? super kotlin.Unit> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.flow.InterfaceC41635f<? super kotlin.Unit> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1 r1 = (com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.flow.f r0 = (kotlinx.coroutines.flow.InterfaceC41635f) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L13
            goto L1f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L39
        L1f:
            kotlin.ResultKt.throwOnFailure(r8)
        L22:
            kotlin.coroutines.CoroutineContext r8 = r7.getContext()
            boolean r8 = kotlinx.coroutines.C41783z1.m91411q(r8)
            if (r8 == 0) goto L46
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r7.L$0 = r0
            r7.label = r4
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L39
            goto L45
        L39:
            r7.L$0 = r0
            r7.label = r3
            r5 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r5, r7)
            if (r8 != r1) goto L22
        L45:
            return r1
        L46:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
