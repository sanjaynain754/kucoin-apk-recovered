package com.kubi.quotefacade.market.futures;

/* JADX INFO: compiled from: QuoteFuturesFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.quotefacade.market.futures.QuoteFuturesFragment$setData$1", m90122f = "QuoteFuturesFragment.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m90124l = {120, 135}, m90125m = "invokeSuspend", m90126n = {"futureMenu", "list", "$this$forEachIndexed$iv", "item$iv", "futureLevel1", "$i$a$-let-QuoteFuturesFragment$setData$1$1", "$i$f$forEachIndexed", "index$iv", "index", "$i$a$-forEachIndexed-QuoteFuturesFragment$setData$1$1$2", "futureMenu", "list", "it", "it1", "$i$a$-let-QuoteFuturesFragment$setData$1$1", "$i$a$-let-QuoteFuturesFragment$setData$1$1$3", "$i$a$-let-QuoteFuturesFragment$setData$1$1$3$1"}, m90127s = {"L$0", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nQuoteFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteFuturesFragment.kt\ncom/kubi/quotefacade/market/futures/QuoteFuturesFragment$setData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n774#2:322\n865#2,2:323\n1878#2,3:325\n1#3:328\n*S KotlinDebug\n*F\n+ 1 QuoteFuturesFragment.kt\ncom/kubi/quotefacade/market/futures/QuoteFuturesFragment$setData$1\n*L\n117#1:322\n117#1:323,2\n118#1:325,3\n*E\n"})
public final class QuoteFuturesFragment$setData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.kubi.quotefacade.entity.MarketMenuEntity $marketMenuEntity;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    int label;
    final /* synthetic */ com.kubi.quotefacade.market.futures.QuoteFuturesFragment this$0;

    public QuoteFuturesFragment$setData$1(com.kubi.quotefacade.entity.MarketMenuEntity r1, com.kubi.quotefacade.market.futures.QuoteFuturesFragment r2, kotlin.coroutines.Continuation<? super com.kubi.quotefacade.market.futures.QuoteFuturesFragment$setData$1> r3) {
            r0 = this;
            r0.$marketMenuEntity = r1
            r0.this$0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.quotefacade.market.futures.QuoteFuturesFragment$setData$1 r3 = new com.kubi.quotefacade.market.futures.QuoteFuturesFragment$setData$1
            com.kubi.quotefacade.entity.MarketMenuEntity r0 = r2.$marketMenuEntity
            com.kubi.quotefacade.market.futures.QuoteFuturesFragment r1 = r2.this$0
            r3.<init>(r0, r1, r4)
            return r3
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
            com.kubi.quotefacade.market.futures.QuoteFuturesFragment$setData$1 r1 = (com.kubi.quotefacade.market.futures.QuoteFuturesFragment$setData$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            r31 = this;
            r0 = r31
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L2d
            if (r2 != r3) goto L25
            java.lang.Object r1 = r0.L$3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r0.L$0
            com.kubi.quotefacade.entity.FutureMenu r1 = (com.kubi.quotefacade.entity.FutureMenu) r1
            kotlin.ResultKt.throwOnFailure(r32)
            goto L1d3
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            int r2 = r0.I$2
            int r6 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$6
            com.kubi.quotefacade.entity.FutureLevel1 r8 = (com.kubi.quotefacade.entity.FutureLevel1) r8
            java.lang.Object r9 = r0.L$4
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.L$3
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r11 = r0.L$2
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.L$1
            com.kubi.quotefacade.market.futures.QuoteFuturesFragment r12 = (com.kubi.quotefacade.market.futures.QuoteFuturesFragment) r12
            java.lang.Object r13 = r0.L$0
            com.kubi.quotefacade.entity.FutureMenu r13 = (com.kubi.quotefacade.entity.FutureMenu) r13
            kotlin.ResultKt.throwOnFailure(r32)
            r15 = r2
            r2 = r4
            goto L112
        L52:
            kotlin.ResultKt.throwOnFailure(r32)
            com.kubi.quotefacade.entity.MarketMenuEntity r2 = r0.$marketMenuEntity
            com.kubi.quotefacade.entity.FutureMenu r2 = r2.getFutureMenu()
            if (r2 == 0) goto L6b
            java.util.List r6 = r2.getLevel1()
            if (r6 == 0) goto L6b
            boolean r6 = r6.isEmpty()
            if (r6 != r4) goto L6b
            goto L1d3
        L6b:
            com.kubi.quotefacade.market.futures.QuoteFuturesFragment r6 = r0.this$0
            java.util.concurrent.CopyOnWriteArrayList r6 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52422t3(r6)
            r6.clear()
            com.kubi.quotefacade.market.futures.QuoteFuturesFragment r6 = r0.this$0
            java.util.List r6 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52420r3(r6)
            r6.clear()
            if (r2 == 0) goto L1d3
            java.util.List r6 = r2.getLevel1()
            if (r6 == 0) goto L1d3
            com.kubi.quotefacade.market.futures.QuoteFuturesFragment r7 = r0.this$0
            java.util.concurrent.CopyOnWriteArrayList r8 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52422t3(r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r6.iterator()
        L94:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lab
            java.lang.Object r11 = r10.next()
            r12 = r11
            com.kubi.quotefacade.entity.FutureLevel1 r12 = (com.kubi.quotefacade.entity.FutureLevel1) r12
            boolean r12 = r12.getEnabled()
            if (r12 == 0) goto L94
            r9.add(r11)
            goto L94
        Lab:
            r8.addAll(r9)
            java.util.concurrent.CopyOnWriteArrayList r8 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52422t3(r7)
            java.util.Iterator r9 = r8.iterator()
            r13 = r2
            r11 = r6
            r12 = r7
            r10 = r8
            r2 = 0
            r6 = 0
            r7 = 0
        Lbd:
            boolean r8 = r9.hasNext()
            r14 = 0
            if (r8 == 0) goto L179
            java.lang.Object r8 = r9.next()
            int r15 = r2 + 1
            if (r2 >= 0) goto Lcf
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        Lcf:
            r3 = r8
            com.kubi.quotefacade.entity.FutureLevel1 r3 = (com.kubi.quotefacade.entity.FutureLevel1) r3
            if (r2 != 0) goto L143
            kotlinx.coroutines.j0 r4 = o00.C42911a.m94121c()
            com.kubi.quotefacade.market.futures.QuoteFuturesFragment$setData$1$1$2$1 r5 = new com.kubi.quotefacade.market.futures.QuoteFuturesFragment$setData$1$1$2$1
            r5.<init>(r12, r3, r14)
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r0.L$0 = r14
            r0.L$1 = r12
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r0.L$2 = r14
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r0.L$3 = r14
            r0.L$4 = r9
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.L$5 = r8
            r0.L$6 = r3
            r0.I$0 = r7
            r0.I$1 = r6
            r0.I$2 = r15
            r0.I$3 = r2
            r2 = 0
            r0.I$4 = r2
            r2 = 1
            r0.label = r2
            java.lang.Object r4 = kotlinx.coroutines.C41686h.m91049g(r4, r5, r0)
            if (r4 != r1) goto L111
            goto L1d2
        L111:
            r8 = r3
        L112:
            java.util.List r3 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52420r3(r12)
            com.kubi.sdk.widget.dialog.a r16 = new com.kubi.sdk.widget.dialog.a
            java.lang.String r4 = r8.getNameAMultiLang()
            java.lang.String r18 = java.lang.String.valueOf(r4)
            r29 = 3069(0xbfd, float:4.3E-42)
            r30 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 1
            r28 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4 = r16
            r3.add(r4)
            goto L174
        L143:
            r2 = r4
            java.util.List r4 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52420r3(r12)
            com.kubi.sdk.widget.dialog.a r16 = new com.kubi.sdk.widget.dialog.a
            java.lang.String r3 = r3.getNameAMultiLang()
            java.lang.String r18 = java.lang.String.valueOf(r3)
            r29 = 4093(0xffd, float:5.736E-42)
            r30 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3 = r16
            r4.add(r3)
        L174:
            r4 = r2
            r2 = r15
            r3 = 2
            goto Lbd
        L179:
            java.util.concurrent.CopyOnWriteArrayList r2 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52422t3(r12)
            int r2 = r2.size()
            if (r2 <= 0) goto L1d3
            java.util.concurrent.CopyOnWriteArrayList r2 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52422t3(r12)
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.kubi.quotefacade.entity.FutureLevel1 r2 = (com.kubi.quotefacade.entity.FutureLevel1) r2
            java.util.List r2 = r2.getLevel2()
            if (r2 == 0) goto L1d3
            java.util.concurrent.CopyOnWriteArrayList r4 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52422t3(r12)
            java.lang.Object r4 = r4.get(r3)
            com.kubi.quotefacade.entity.FutureLevel1 r4 = (com.kubi.quotefacade.entity.FutureLevel1) r4
            java.lang.String r3 = r4.getQuoteCrypto()
            if (r3 == 0) goto L1d3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r0.L$0 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r0.L$1 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.L$2 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
            r0.L$3 = r4
            r0.L$4 = r14
            r0.L$5 = r14
            r0.L$6 = r14
            r0.I$0 = r7
            r4 = 0
            r0.I$1 = r4
            r0.I$2 = r4
            r5 = 2
            r0.label = r5
            java.lang.Object r2 = com.kubi.quotefacade.market.futures.QuoteFuturesFragment.m52425w3(r12, r3, r2, r4, r0)
            if (r2 != r1) goto L1d3
        L1d2:
            return r1
        L1d3:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
