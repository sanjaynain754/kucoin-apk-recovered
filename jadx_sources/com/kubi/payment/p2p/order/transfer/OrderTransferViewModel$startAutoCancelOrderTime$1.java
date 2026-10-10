package com.kubi.payment.p2p.order.transfer;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OrderTransferViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.transfer.OrderTransferViewModel$startAutoCancelOrderTime$1", m90122f = "OrderTransferViewModel.kt", m90123i = {}, m90124l = {213}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderTransferViewModel$startAutoCancelOrderTime$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderTransferViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTransferViewModel$startAutoCancelOrderTime$1(OrderTransferViewModel orderTransferViewModel, Continuation<? super OrderTransferViewModel$startAutoCancelOrderTime$1> continuation) {
        super(2, continuation);
        this.this$0 = orderTransferViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderTransferViewModel$startAutoCancelOrderTime$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderTransferViewModel$startAutoCancelOrderTime$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0043 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0041 -> B:14:0x0044). Please report as a decompilation issue!!! */
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
            goto L44
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            p852kotlin.ResultKt.throwOnFailure(r10)
        L1c:
            com.kubi.payment.p2p.order.transfer.OrderTransferViewModel r10 = r9.this$0
            long r5 = com.kubi.payment.p2p.order.transfer.OrderTransferViewModel.m49002r(r10)
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L4f
            com.kubi.payment.p2p.order.transfer.OrderTransferViewModel r10 = r9.this$0
            androidx.lifecycle.MutableLiveData r10 = com.kubi.payment.p2p.order.transfer.OrderTransferViewModel.m49004t(r10)
            com.kubi.payment.p2p.order.transfer.OrderTransferViewModel r1 = r9.this$0
            long r5 = com.kubi.payment.p2p.order.transfer.OrderTransferViewModel.m49002r(r1)
            java.lang.Long r1 = p852kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r10.setValue(r1)
            r9.label = r4
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m90350b(r2, r9)
            if (r10 != r0) goto L44
            return r0
        L44:
            com.kubi.payment.p2p.order.transfer.OrderTransferViewModel r10 = r9.this$0
            long r5 = com.kubi.payment.p2p.order.transfer.OrderTransferViewModel.m49002r(r10)
            long r5 = r5 - r2
            com.kubi.payment.p2p.order.transfer.OrderTransferViewModel.m48997C(r10, r5)
            goto L1c
        L4f:
            com.kubi.payment.p2p.order.transfer.OrderTransferViewModel r10 = r9.this$0
            androidx.lifecycle.MutableLiveData r10 = com.kubi.payment.p2p.order.transfer.OrderTransferViewModel.m49004t(r10)
            java.lang.Long r0 = p852kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            r10.setValue(r0)
            com.kubi.payment.p2p.order.transfer.OrderTransferViewModel r10 = r9.this$0
            r10.m49020O(r4)
            kotlin.Unit r10 = p852kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.payment.p2p.order.transfer.OrderTransferViewModel$startAutoCancelOrderTime$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
