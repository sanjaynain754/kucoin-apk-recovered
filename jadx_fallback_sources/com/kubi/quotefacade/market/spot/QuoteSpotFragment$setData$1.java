package com.kubi.quotefacade.market.spot;

/* JADX INFO: compiled from: QuoteSpotFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1", m90122f = "QuoteSpotFragment.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m90124l = {118, 140}, m90125m = "invokeSuspend", m90126n = {"spotMenu", "list", "$this$forEachIndexed$iv", "item$iv", "spotLevel1", "$i$a$-let-QuoteSpotFragment$setData$1$1", "$i$f$forEachIndexed", "index$iv", "index", "$i$a$-forEachIndexed-QuoteSpotFragment$setData$1$1$2", "spotMenu", "list", "it", "it1", "$i$a$-let-QuoteSpotFragment$setData$1$1", "$i$a$-let-QuoteSpotFragment$setData$1$1$3", "$i$a$-let-QuoteSpotFragment$setData$1$1$3$1"}, m90127s = {"L$0", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nQuoteSpotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n774#2:306\n865#2,2:307\n1878#2,3:309\n1#3:312\n*S KotlinDebug\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment$setData$1\n*L\n115#1:306\n115#1:307,2\n116#1:309,3\n*E\n"})
public final class QuoteSpotFragment$setData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
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
    final /* synthetic */ com.kubi.quotefacade.market.spot.QuoteSpotFragment this$0;

    public QuoteSpotFragment$setData$1(com.kubi.quotefacade.entity.MarketMenuEntity r1, com.kubi.quotefacade.market.spot.QuoteSpotFragment r2, kotlin.coroutines.Continuation<? super com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1> r3) {
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
            com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1 r3 = new com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1
            com.kubi.quotefacade.entity.MarketMenuEntity r0 = r2.$marketMenuEntity
            com.kubi.quotefacade.market.spot.QuoteSpotFragment r1 = r2.this$0
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
            com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1 r1 = (com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1) r1
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
            if (r2 == 0) goto L50
            if (r2 == r4) goto L2d
            if (r2 != r3) goto L25
            java.lang.Object r1 = r0.L$3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r0.L$0
            com.kubi.quotefacade.entity.SpotMenu r1 = (com.kubi.quotefacade.entity.SpotMenu) r1
            kotlin.ResultKt.throwOnFailure(r32)
            goto L207
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
            com.kubi.quotefacade.entity.SpotLevel1 r8 = (com.kubi.quotefacade.entity.SpotLevel1) r8
            java.lang.Object r9 = r0.L$4
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.L$3
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r11 = r0.L$2
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.L$1
            com.kubi.quotefacade.market.spot.QuoteSpotFragment r12 = (com.kubi.quotefacade.market.spot.QuoteSpotFragment) r12
            java.lang.Object r13 = r0.L$0
            com.kubi.quotefacade.entity.SpotMenu r13 = (com.kubi.quotefacade.entity.SpotMenu) r13
            kotlin.ResultKt.throwOnFailure(r32)
            goto L111
        L50:
            kotlin.ResultKt.throwOnFailure(r32)
            com.kubi.quotefacade.entity.MarketMenuEntity r2 = r0.$marketMenuEntity
            com.kubi.quotefacade.entity.SpotMenu r2 = r2.getSpotMenu()
            if (r2 == 0) goto L69
            java.util.List r6 = r2.getLevel1()
            if (r6 == 0) goto L69
            boolean r6 = r6.isEmpty()
            if (r6 != r4) goto L69
            goto L207
        L69:
            com.kubi.quotefacade.market.spot.QuoteSpotFragment r6 = r0.this$0
            java.util.concurrent.CopyOnWriteArrayList r6 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52613q3(r6)
            r6.clear()
            com.kubi.quotefacade.market.spot.QuoteSpotFragment r6 = r0.this$0
            java.util.List r6 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52611o3(r6)
            r6.clear()
            if (r2 == 0) goto L207
            java.util.List r6 = r2.getLevel1()
            if (r6 == 0) goto L207
            com.kubi.quotefacade.market.spot.QuoteSpotFragment r7 = r0.this$0
            java.util.concurrent.CopyOnWriteArrayList r8 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52613q3(r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r6.iterator()
        L92:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La9
            java.lang.Object r11 = r10.next()
            r12 = r11
            com.kubi.quotefacade.entity.SpotLevel1 r12 = (com.kubi.quotefacade.entity.SpotLevel1) r12
            boolean r12 = r12.getEnabled()
            if (r12 == 0) goto L92
            r9.add(r11)
            goto L92
        La9:
            r8.addAll(r9)
            java.util.concurrent.CopyOnWriteArrayList r8 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52613q3(r7)
            java.util.Iterator r9 = r8.iterator()
            r13 = r2
            r11 = r6
            r12 = r7
            r10 = r8
            r2 = 0
            r6 = 0
            r7 = 0
        Lbb:
            boolean r8 = r9.hasNext()
            r14 = 0
            if (r8 == 0) goto L1ad
            java.lang.Object r8 = r9.next()
            int r15 = r2 + 1
            if (r2 >= 0) goto Lcd
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        Lcd:
            r3 = r8
            com.kubi.quotefacade.entity.SpotLevel1 r3 = (com.kubi.quotefacade.entity.SpotLevel1) r3
            if (r2 != 0) goto L143
            kotlinx.coroutines.j0 r4 = o00.C42911a.m94121c()
            com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1$1$2$1 r5 = new com.kubi.quotefacade.market.spot.QuoteSpotFragment$setData$1$1$2$1
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
            java.lang.Object r2 = kotlinx.coroutines.C41686h.m91049g(r4, r5, r0)
            if (r2 != r1) goto L10f
            goto L206
        L10f:
            r8 = r3
            r2 = r15
        L111:
            java.util.List r3 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52611o3(r12)
            com.kubi.sdk.widget.dialog.a r16 = new com.kubi.sdk.widget.dialog.a
            java.lang.String r4 = r8.getNameA()
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
            r5 = 1
            goto L1a9
        L143:
            java.util.List r2 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52611o3(r12)
            com.kubi.sdk.widget.dialog.a r16 = new com.kubi.sdk.widget.dialog.a
            java.lang.String r4 = r3.getNameA()
            java.lang.String r18 = java.lang.String.valueOf(r4)
            java.util.List r4 = r3.getQuoteCryptos()
            if (r4 == 0) goto L15d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L15f
        L15d:
            r5 = 1
            goto L185
        L15f:
            java.util.List r4 = r3.getQuoteCryptos()
            int r4 = r4.size()
            r5 = 1
            if (r4 <= r5) goto L185
            java.util.List r19 = r3.getQuoteCryptos()
            r26 = 62
            r27 = 0
            java.lang.String r20 = "、"
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L182:
            r28 = r3
            goto L188
        L185:
            java.lang.String r3 = ""
            goto L182
        L188:
            r29 = 2045(0x7fd, float:2.866E-42)
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
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3 = r16
            r2.add(r3)
            r2 = r15
        L1a9:
            r4 = r5
            r3 = 2
            goto Lbb
        L1ad:
            java.util.concurrent.CopyOnWriteArrayList r2 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52613q3(r12)
            int r2 = r2.size()
            if (r2 <= 0) goto L207
            java.util.concurrent.CopyOnWriteArrayList r2 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52613q3(r12)
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.kubi.quotefacade.entity.SpotLevel1 r2 = (com.kubi.quotefacade.entity.SpotLevel1) r2
            java.util.List r2 = r2.getLevel2()
            if (r2 == 0) goto L207
            java.util.concurrent.CopyOnWriteArrayList r4 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52613q3(r12)
            java.lang.Object r4 = r4.get(r3)
            com.kubi.quotefacade.entity.SpotLevel1 r4 = (com.kubi.quotefacade.entity.SpotLevel1) r4
            java.lang.String r3 = r4.getQuoteCryptoAliasName()
            if (r3 == 0) goto L207
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
            java.lang.Object r2 = com.kubi.quotefacade.market.spot.QuoteSpotFragment.m52616t3(r12, r3, r2, r4, r0)
            if (r2 != r1) goto L207
        L206:
            return r1
        L207:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
