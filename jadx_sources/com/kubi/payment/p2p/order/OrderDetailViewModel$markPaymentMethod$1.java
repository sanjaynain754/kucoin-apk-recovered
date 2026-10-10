package com.kubi.payment.p2p.order;

import com.kubi.otc.entity.AdPayType;
import com.kubi.payment.p2p.data.entities.MarkPaymentMethod;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailViewModel$markPaymentMethod$1", m90122f = "OrderDetailViewModel.kt", m90123i = {}, m90124l = {526}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderDetailViewModel$markPaymentMethod$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailViewModel$markPaymentMethod$1(OrderDetailViewModel orderDetailViewModel, Continuation<? super OrderDetailViewModel$markPaymentMethod$1> continuation) {
        super(2, continuation);
        this.this$0 = orderDetailViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderDetailViewModel$markPaymentMethod$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderDetailViewModel$markPaymentMethod$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String id2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            IP2PRepository iP2PRepository = this.this$0.f39731X;
            OrderDetailInfo f39744k0 = this.this$0.getF39744k0();
            String id3 = null;
            if (f39744k0 != null) {
                id2 = f39744k0.getId();
            } else {
                id2 = null;
            }
            AdPayType f39746m0 = this.this$0.getF39746m0();
            if (f39746m0 != null) {
                id3 = f39746m0.getId();
            }
            MarkPaymentMethod markPaymentMethod = new MarkPaymentMethod(id2, id3);
            this.label = 1;
            if (iP2PRepository.mo48479S(markPaymentMethod, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
