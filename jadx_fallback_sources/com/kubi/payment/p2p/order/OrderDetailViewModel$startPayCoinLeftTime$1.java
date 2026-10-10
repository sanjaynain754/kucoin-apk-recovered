package com.kubi.payment.p2p.order;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1", m90122f = "OrderDetailViewModel.kt", m90123i = {}, m90124l = {395}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderDetailViewModel$startPayCoinLeftTime$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $countTime;
    int label;
    final /* synthetic */ com.kubi.payment.p2p.order.OrderDetailViewModel this$0;

    public OrderDetailViewModel$startPayCoinLeftTime$1(kotlin.jvm.internal.Ref.LongRef r1, com.kubi.payment.p2p.order.OrderDetailViewModel r2, kotlin.coroutines.Continuation<? super com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1> r3) {
            r0 = this;
            r0.$countTime = r1
            r0.this$0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1 r3 = new com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1
            kotlin.jvm.internal.Ref$LongRef r0 = r2.$countTime
            com.kubi.payment.p2p.order.OrderDetailViewModel r1 = r2.this$0
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
            com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1 r1 = (com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 != r4) goto L11
            kotlin.ResultKt.throwOnFailure(r10)
            goto L4b
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            kotlin.ResultKt.throwOnFailure(r10)
        L1c:
            kotlin.jvm.internal.Ref$LongRef r10 = r9.$countTime
            long r5 = r10.element
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L53
            com.kubi.payment.p2p.order.OrderDetailViewModel r10 = r9.this$0
            boolean r10 = r10.m48793o0()
            if (r10 == 0) goto L31
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L31:
            com.kubi.payment.p2p.order.OrderDetailViewModel r10 = r9.this$0
            androidx.lifecycle.MutableLiveData r10 = com.kubi.payment.p2p.order.OrderDetailViewModel.m48736F(r10)
            kotlin.jvm.internal.Ref$LongRef r1 = r9.$countTime
            long r5 = r1.element
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r10.setValue(r1)
            r9.label = r4
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m90350b(r2, r9)
            if (r10 != r0) goto L4b
            return r0
        L4b:
            kotlin.jvm.internal.Ref$LongRef r10 = r9.$countTime
            long r5 = r10.element
            long r5 = r5 - r2
            r10.element = r5
            goto L1c
        L53:
            com.kubi.payment.p2p.order.OrderDetailViewModel r10 = r9.this$0
            androidx.lifecycle.MutableLiveData r10 = com.kubi.payment.p2p.order.OrderDetailViewModel.m48736F(r10)
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            r10.setValue(r0)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
    }
}
