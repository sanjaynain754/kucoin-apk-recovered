package com.kubi.spot.business.mvi;

/* JADX INFO: compiled from: SpotTradeViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1", m90122f = "SpotTradeViewModel.kt", m90123i = {0, 0}, m90124l = {94}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$i$a$-runCatching-SpotTradeViewModel$subscribeBannerData$1$1"}, m90127s = {"L$0", "I$0"})
public final class SpotTradeViewModel$subscribeBannerData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.kubi.spot.business.mvi.SpotTradeViewModel this$0;

    public SpotTradeViewModel$subscribeBannerData$1(com.kubi.spot.business.mvi.SpotTradeViewModel r1, kotlin.coroutines.Continuation<? super com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1 r0 = new com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1
            com.kubi.spot.business.mvi.SpotTradeViewModel r1 = r2.this$0
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
            com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1 r1 = (com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1) r1
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
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L15
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L13
            goto L4f
        L13:
            r7 = move-exception
            goto L55
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.throwOnFailure(r7)
            com.kubi.spot.business.mvi.SpotTradeViewModel r7 = r6.this$0
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L13
            e20.a r2 = com.kubi.spot.business.mvi.SpotTradeViewModel.m61236s(r7)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = "/delivery/block"
            kotlinx.coroutines.flow.e r2 = r2.m82905a(r4)     // Catch: java.lang.Throwable -> L13
            com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1$1$1 r4 = new com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1$1$1     // Catch: java.lang.Throwable -> L13
            r5 = 0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L13
            kotlinx.coroutines.flow.e r2 = kotlinx.coroutines.flow.C41636g.m90917h(r2, r4)     // Catch: java.lang.Throwable -> L13
            com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1$1$2 r4 = new com.kubi.spot.business.mvi.SpotTradeViewModel$subscribeBannerData$1$1$2     // Catch: java.lang.Throwable -> L13
            r4.<init>(r0, r7)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Throwable -> L13
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L13
            r7 = 0
            r6.I$0 = r7     // Catch: java.lang.Throwable -> L13
            r6.label = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r7 = r2.collect(r4, r6)     // Catch: java.lang.Throwable -> L13
            if (r7 != r1) goto L4f
            return r1
        L4f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L13
            kotlin.Result.m103844constructorimpl(r7)     // Catch: java.lang.Throwable -> L13
            goto L5e
        L55:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            kotlin.Result.m103844constructorimpl(r7)
        L5e:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
