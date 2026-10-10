package com.kubi.core.biz.banner;

/* JADX INFO: compiled from: BannerViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1", m90122f = "BannerViewModel.kt", m90123i = {0, 0}, m90124l = {101}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$i$a$-runCatching-BannerViewModel$subscribeBannerData$1$1"}, m90127s = {"L$0", "I$0"})
public final class BannerViewModel$subscribeBannerData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $symbol;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.kubi.core.biz.banner.BannerViewModel this$0;

    public BannerViewModel$subscribeBannerData$1(com.kubi.core.biz.banner.BannerViewModel r1, java.lang.String r2, kotlin.coroutines.Continuation<? super com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1> r3) {
            r0 = this;
            r0.this$0 = r1
            r0.$symbol = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1 r0 = new com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1
            com.kubi.core.biz.banner.BannerViewModel r1 = r3.this$0
            java.lang.String r2 = r3.$symbol
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
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
            com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1 r1 = (com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L15
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L13
            goto L51
        L13:
            r8 = move-exception
            goto L57
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.ResultKt.throwOnFailure(r8)
            com.kubi.core.biz.banner.BannerViewModel r8 = r7.this$0
            java.lang.String r2 = r7.$symbol
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L13
            com.kubi.core.biz.banner.k r4 = com.kubi.core.biz.banner.BannerViewModel.m21257w(r8)     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = "/delivery/block"
            kotlinx.coroutines.flow.e r4 = r4.m21297a(r5)     // Catch: java.lang.Throwable -> L13
            com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$1 r5 = new com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$1     // Catch: java.lang.Throwable -> L13
            r6 = 0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L13
            kotlinx.coroutines.flow.e r4 = kotlinx.coroutines.flow.C41636g.m90917h(r4, r5)     // Catch: java.lang.Throwable -> L13
            com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$2 r5 = new com.kubi.core.biz.banner.BannerViewModel$subscribeBannerData$1$1$2     // Catch: java.lang.Throwable -> L13
            r5.<init>(r0, r8, r2)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Throwable -> L13
            r7.L$0 = r8     // Catch: java.lang.Throwable -> L13
            r8 = 0
            r7.I$0 = r8     // Catch: java.lang.Throwable -> L13
            r7.label = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r8 = r4.collect(r5, r7)     // Catch: java.lang.Throwable -> L13
            if (r8 != r1) goto L51
            return r1
        L51:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L13
            kotlin.Result.m103844constructorimpl(r8)     // Catch: java.lang.Throwable -> L13
            goto L60
        L57:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            kotlin.Result.m103844constructorimpl(r8)
        L60:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
