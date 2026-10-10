package com.kubi.tradingbotkit.business.strategyList.viewModel;

/* JADX INFO: compiled from: StrategyListViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$startPolling$1", m90122f = "StrategyListViewModel.kt", m90123i = {0}, m90124l = {137}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class StrategyListViewModel$startPolling$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel this$0;

    public StrategyListViewModel$startPolling$1(com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel r1, kotlin.coroutines.Continuation<? super com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$startPolling$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$startPolling$1 r0 = new com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$startPolling$1
            com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$startPolling$1 r1 = (com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$startPolling$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r7)
            goto L31
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.throwOnFailure(r7)
        L1e:
            boolean r7 = kotlinx.coroutines.C41713n0.m91132h(r0)
            if (r7 == 0) goto L37
            r6.L$0 = r0
            r6.label = r3
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m90350b(r4, r6)
            if (r7 != r1) goto L31
            return r1
        L31:
            com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel r7 = r6.this$0
            r7.m64154w()
            goto L1e
        L37:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
