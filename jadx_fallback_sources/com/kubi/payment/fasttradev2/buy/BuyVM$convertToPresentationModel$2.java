package com.kubi.payment.fasttradev2.buy;

/* JADX INFO: compiled from: BuyVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyItemPaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.BuyVM$convertToPresentationModel$2", m90122f = "BuyVM.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0}, m90124l = {228}, m90125m = "invokeSuspend", m90126n = {"paymentMethods", "$this$forEach$iv", "element$iv", "categoryPaymentMethod", "googlePay", "isInitial", "$i$f$forEach", "$i$a$-forEach-BuyVM$convertToPresentationModel$2$1"}, m90127s = {"L$0", "L$1", "L$8", "L$9", "L$10", "Z$0", "I$0", "I$1"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuyVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyVM.kt\ncom/kubi/payment/fasttradev2/buy/BuyVM$convertToPresentationModel$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,743:1\n1869#2:744\n1869#2,2:745\n1870#2:747\n*S KotlinDebug\n*F\n+ 1 BuyVM.kt\ncom/kubi/payment/fasttradev2/buy/BuyVM$convertToPresentationModel$2\n*L\n222#1:744\n248#1:745,2\n222#1:747\n*E\n"})
public final class BuyVM$convertToPresentationModel$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super java.util.List<com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod>>, java.lang.Object> {
    final /* synthetic */ java.lang.String $amount;
    final /* synthetic */ java.util.List<com.kubi.payment.fast.data.entities.BuyPaymentMethod.Response> $categoryPaymentMethods;
    final /* synthetic */ java.lang.String $cryptoCurrency;
    final /* synthetic */ java.lang.String $fiatCurrency;
    final /* synthetic */ java.lang.String $quoteType;
    int I$0;
    int I$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$10;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    java.lang.Object L$8;
    java.lang.Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ com.kubi.payment.fasttradev2.buy.BuyVM this$0;

    public BuyVM$convertToPresentationModel$2(com.kubi.payment.fasttradev2.buy.BuyVM r1, java.lang.String r2, java.util.List<com.kubi.payment.fast.data.entities.BuyPaymentMethod.Response> r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, kotlin.coroutines.Continuation<? super com.kubi.payment.fasttradev2.buy.BuyVM$convertToPresentationModel$2> r7) {
            r0 = this;
            r0.this$0 = r1
            r0.$amount = r2
            r0.$categoryPaymentMethods = r3
            r0.$quoteType = r4
            r0.$fiatCurrency = r5
            r0.$cryptoCurrency = r6
            r1 = 2
            r0.<init>(r1, r7)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r9, kotlin.coroutines.Continuation<?> r10) {
            r8 = this;
            com.kubi.payment.fasttradev2.buy.BuyVM$convertToPresentationModel$2 r0 = new com.kubi.payment.fasttradev2.buy.BuyVM$convertToPresentationModel$2
            com.kubi.payment.fasttradev2.buy.BuyVM r1 = r8.this$0
            java.lang.String r2 = r8.$amount
            java.util.List<com.kubi.payment.fast.data.entities.BuyPaymentMethod$Response> r3 = r8.$categoryPaymentMethods
            java.lang.String r4 = r8.$quoteType
            java.lang.String r5 = r8.$fiatCurrency
            java.lang.String r6 = r8.$cryptoCurrency
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super java.util.List<com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod>> r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super java.util.List<com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod>> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.payment.fasttradev2.buy.BuyVM$convertToPresentationModel$2 r1 = (com.kubi.payment.fasttradev2.buy.BuyVM$convertToPresentationModel$2) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            r30 = this;
            r0 = r30
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 != r4) goto L40
            int r2 = r0.I$0
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$10
            com.kubi.payment.fast.data.entities.BuyPaymentMethod$Response$PaymentMethod r7 = (com.kubi.payment.fast.data.entities.BuyPaymentMethod.Response.PaymentMethod) r7
            java.lang.Object r7 = r0.L$9
            com.kubi.payment.fast.data.entities.BuyPaymentMethod$Response r7 = (com.kubi.payment.fast.data.entities.BuyPaymentMethod.Response) r7
            java.lang.Object r8 = r0.L$7
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$6
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.L$4
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.L$3
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.L$2
            com.kubi.payment.fasttradev2.buy.BuyVM r13 = (com.kubi.payment.fasttradev2.buy.BuyVM) r13
            java.lang.Object r14 = r0.L$1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r0.L$0
            java.util.List r15 = (java.util.List) r15
            kotlin.ResultKt.throwOnFailure(r31)
            r3 = r31
            goto Lf2
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L48:
            kotlin.ResultKt.throwOnFailure(r31)
            com.kubi.payment.fasttradev2.buy.BuyVM r2 = r0.this$0
            java.lang.String r6 = r0.$amount
            boolean r2 = r2.m47448Y(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List<com.kubi.payment.fast.data.entities.BuyPaymentMethod$Response> r7 = r0.$categoryPaymentMethods
            com.kubi.payment.fasttradev2.buy.BuyVM r8 = r0.this$0
            java.lang.String r9 = r0.$quoteType
            java.lang.String r10 = r0.$fiatCurrency
            java.lang.String r11 = r0.$amount
            java.lang.String r12 = r0.$cryptoCurrency
            java.util.Iterator r13 = r7.iterator()
            r14 = r13
            r13 = r8
            r8 = r14
            r14 = r12
            r12 = r9
            r9 = r14
            r14 = r11
            r11 = r10
            r10 = r14
            r15 = r6
            r14 = r7
            r6 = r2
            r2 = 0
        L75:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L25e
            java.lang.Object r7 = r8.next()
            r5 = r7
            com.kubi.payment.fast.data.entities.BuyPaymentMethod$Response r5 = (com.kubi.payment.fast.data.entities.BuyPaymentMethod.Response) r5
            java.util.List r16 = r5.getPaymentMethods()
            if (r16 == 0) goto Laa
            java.util.Iterator r16 = r16.iterator()
        L8c:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto La3
            java.lang.Object r17 = r16.next()
            r4 = r17
            com.kubi.payment.fast.data.entities.BuyPaymentMethod$Response$PaymentMethod r4 = (com.kubi.payment.fast.data.entities.BuyPaymentMethod.Response.PaymentMethod) r4
            boolean r4 = com.kubi.payment.fasttradev2.buy.BuyVM.m47421F(r13, r4)
            if (r4 == 0) goto La1
            goto La5
        La1:
            r4 = 1
            goto L8c
        La3:
            r17 = 0
        La5:
            r4 = r17
            com.kubi.payment.fast.data.entities.BuyPaymentMethod$Response$PaymentMethod r4 = (com.kubi.payment.fast.data.entities.BuyPaymentMethod.Response.PaymentMethod) r4
            goto Lab
        Laa:
            r4 = 0
        Lab:
            if (r4 == 0) goto L104
            com.kubi.payment.fast.data.entities.BuyPaymentMethod$Response$PaymentMethod$WalletInfo r16 = r4.getWalletInfo()
            if (r16 == 0) goto Lba
            java.util.List r16 = r16.getSupportedNetworks()
            r18 = r16
            goto Lbc
        Lba:
            r18 = 0
        Lbc:
            r0.L$0 = r15
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r0.L$1 = r3
            r0.L$2 = r13
            r0.L$3 = r12
            r0.L$4 = r11
            r0.L$5 = r10
            r0.L$6 = r9
            r0.L$7 = r8
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$8 = r3
            r0.L$9 = r5
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r0.L$10 = r3
            r0.Z$0 = r6
            r0.I$0 = r2
            r3 = 0
            r0.I$1 = r3
            r3 = 1
            r0.label = r3
            r3 = r18
            java.lang.Object r3 = com.kubi.payment.fasttradev2.buy.BuyVM.m47424I(r13, r3, r0)
            if (r3 != r1) goto Lf1
            return r1
        Lf1:
            r7 = r5
        Lf2:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r5 = r7
        Lf9:
            r4 = r8
            r8 = r12
            r17 = r14
            r7 = r15
            r14 = r10
            r15 = r11
            r11 = r6
            r6 = r13
            r13 = r9
            goto L106
        L104:
            r3 = 1
            goto Lf9
        L106:
            java.lang.Boolean r9 = r5.getHasP2PGuide()
            boolean r18 = com.kubi.utils.extensions.C27025c.m66566d(r9)
            if (r18 == 0) goto L121
            java.util.List r9 = r5.getPaymentMethods()
            java.util.List r9 = com.kubi.utils.extensions.C27024b.m66560c(r9)
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L121
            r12 = 1
        L11f:
            r9 = r6
            goto L123
        L121:
            r12 = 0
            goto L11f
        L123:
            com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod$ItemCategory r6 = new com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod$ItemCategory
            java.lang.String r10 = r5.getCategoryTitle()
            java.lang.String r10 = com.kubi.utils.extensions.C27041f.m66668h(r10)
            java.lang.Integer r19 = r5.getMaxCardCount()
            int r19 = com.kubi.utils.extensions.C27039d.m66650j(r19)
            java.lang.Integer r19 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r19)
            java.lang.Boolean r20 = r5.getCanEdit()
            boolean r20 = com.kubi.utils.extensions.C27025c.m66566d(r20)
            r0 = r19
            r19 = r1
            r1 = r9
            r9 = r0
            r0 = r7
            r7 = r10
            r10 = r20
            r6.<init>(r7, r8, r9, r10, r11, r12)
            if (r18 != 0) goto L161
            if (r3 != 0) goto L161
            java.util.List r7 = r5.getPaymentMethods()
            java.util.List r7 = com.kubi.utils.extensions.C27024b.m66560c(r7)
            int r7 = r7.size()
            r9 = 1
            if (r7 <= r9) goto L164
        L161:
            r0.add(r6)
        L164:
            java.util.List r5 = r5.getPaymentMethods()
            if (r5 == 0) goto L240
            java.util.Iterator r5 = r5.iterator()
        L16e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L240
            java.lang.Object r6 = r5.next()
            com.kubi.payment.fast.data.entities.BuyPaymentMethod$Response$PaymentMethod r6 = (com.kubi.payment.fast.data.entities.BuyPaymentMethod.Response.PaymentMethod) r6
            java.lang.String r7 = r6.getCryptoUnitPrice()
            r9 = 1
            r10 = 0
            java.math.BigDecimal r20 = com.kubi.utils.extensions.DowngradeExKt.m66535e(r7, r10, r9, r10)
            if (r11 == 0) goto L1ac
            com.kubi.payment.helper.d r7 = com.kubi.payment.helper.C21015d.f39545a
            int r22 = r7.m48248b(r15)
            r28 = 125(0x7d, float:1.75E-43)
            r29 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            java.lang.String r7 = p429lf.C42180b.m92640e(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r7 = p429lf.C42180b.m92647l(r7)
            r31 = r2
            r2 = r7
            r9 = r15
        L1a8:
            r7 = 1
            r10 = 0
            goto L228
        L1ac:
            java.lang.String r7 = "FIAT"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r7)
            java.lang.String r9 = "multiply(...)"
            if (r7 == 0) goto L1f0
            r7 = 1
            r10 = 0
            java.math.BigDecimal r12 = com.kubi.utils.extensions.DowngradeExKt.m66535e(r14, r10, r7, r10)
            r31 = r2
            java.lang.String r2 = r6.getFiatUnitPrice()
            java.math.BigDecimal r2 = com.kubi.utils.extensions.DowngradeExKt.m66535e(r2, r10, r7, r10)
            java.math.BigDecimal r2 = r12.multiply(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            com.kubi.payment.helper.d r7 = com.kubi.payment.helper.C21015d.f39545a
            int r22 = r7.m48247a(r13)
            r28 = 125(0x7d, float:1.75E-43)
            r29 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r20 = r2
            java.lang.String r2 = p429lf.C42180b.m92640e(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r7 = p429lf.C42180b.m92647l(r2)
            r2 = r7
            r9 = r13
            goto L1a8
        L1f0:
            r31 = r2
            r7 = 1
            r10 = 0
            java.math.BigDecimal r2 = com.kubi.utils.extensions.DowngradeExKt.m66535e(r14, r10, r7, r10)
            java.lang.String r12 = r6.getCryptoUnitPrice()
            java.math.BigDecimal r12 = com.kubi.utils.extensions.DowngradeExKt.m66535e(r12, r10, r7, r10)
            java.math.BigDecimal r2 = r2.multiply(r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            com.kubi.payment.helper.d r9 = com.kubi.payment.helper.C21015d.f39545a
            int r22 = r9.m48248b(r15)
            r28 = 125(0x7d, float:1.75E-43)
            r29 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r20 = r2
            java.lang.String r2 = p429lf.C42180b.m92640e(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r2 = p429lf.C42180b.m92647l(r2)
            r9 = r15
        L228:
            boolean r12 = com.kubi.payment.fasttradev2.buy.BuyVM.m47421F(r1, r6)
            if (r12 == 0) goto L233
            if (r3 == 0) goto L231
            goto L233
        L231:
            r7 = 0
            goto L23c
        L233:
            com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod$ItemNormalPaymentMethod r12 = new com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod$ItemNormalPaymentMethod
            r7 = 0
            r12.<init>(r6, r2, r9, r7)
            r0.add(r12)
        L23c:
            r2 = r31
            goto L16e
        L240:
            r31 = r2
            r7 = 0
            r10 = 0
            if (r18 == 0) goto L24b
            com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod$ItemGuideP2P r2 = com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod.ItemGuideP2P.INSTANCE
            r0.add(r2)
        L24b:
            r2 = r31
            r12 = r8
            r6 = r11
            r9 = r13
            r10 = r14
            r11 = r15
            r14 = r17
            r15 = r0
            r13 = r1
            r8 = r4
            r1 = r19
            r4 = 1
            r0 = r30
            goto L75
        L25e:
            return r15
    }
}
