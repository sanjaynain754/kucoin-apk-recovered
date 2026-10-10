package com.kubi.payment.p2p.order;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1", m90122f = "OrderDetailViewModel.kt", m90123i = {}, m90124l = {395}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderDetailViewModel$startPayCoinLeftTime$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $countTime;
    int label;
    final /* synthetic */ OrderDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailViewModel$startPayCoinLeftTime$1(Ref.LongRef longRef, OrderDetailViewModel orderDetailViewModel, Continuation<? super OrderDetailViewModel$startPayCoinLeftTime$1> continuation) {
        super(2, continuation);
        this.$countTime = longRef;
        this.this$0 = orderDetailViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderDetailViewModel$startPayCoinLeftTime$1(this.$countTime, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderDetailViewModel$startPayCoinLeftTime$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 != r4) goto L11
            p852kotlin.ResultKt.throwOnFailure(r10)
            goto L4b
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            p852kotlin.ResultKt.throwOnFailure(r10)
        L1c:
            kotlin.jvm.internal.Ref$LongRef r10 = r9.$countTime
            long r5 = r10.element
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L53
            com.kubi.payment.p2p.order.OrderDetailViewModel r10 = r9.this$0
            boolean r10 = r10.getF39751r0()
            if (r10 == 0) goto L31
            kotlin.Unit r10 = p852kotlin.Unit.INSTANCE
            return r10
        L31:
            com.kubi.payment.p2p.order.OrderDetailViewModel r10 = r9.this$0
            androidx.lifecycle.MutableLiveData r10 = com.kubi.payment.p2p.order.OrderDetailViewModel.m48736F(r10)
            kotlin.jvm.internal.Ref$LongRef r1 = r9.$countTime
            long r5 = r1.element
            java.lang.Long r1 = p852kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
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
            java.lang.Long r0 = p852kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            r10.setValue(r0)
            kotlin.Unit r10 = p852kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.payment.p2p.order.OrderDetailViewModel$startPayCoinLeftTime$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
