package com.kubi.payment.p2p.order;

import com.kubi.otc.entity.AdPayType;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailViewModel$resetPayTypes$1", m90122f = "OrderDetailViewModel.kt", m90123i = {}, m90124l = {461}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderDetailViewModel$resetPayTypes$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OrderDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailViewModel$resetPayTypes$1(OrderDetailViewModel orderDetailViewModel, Continuation<? super OrderDetailViewModel$resetPayTypes$1> continuation) {
        super(2, continuation);
        this.this$0 = orderDetailViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderDetailViewModel$resetPayTypes$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderDetailViewModel$resetPayTypes$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdPayType adPayType;
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
            OrderDetailViewModel orderDetailViewModel = this.this$0;
            this.label = 1;
            if (orderDetailViewModel.m48797z0(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        OrderDetailViewModel orderDetailViewModel2 = this.this$0;
        List<AdPayType> listM48785e0 = orderDetailViewModel2.m48785e0();
        if (listM48785e0 != null) {
            adPayType = (AdPayType) CollectionsKt.firstOrNull((List) listM48785e0);
        } else {
            adPayType = null;
        }
        orderDetailViewModel2.m48762H0(adPayType);
        this.this$0.f39734a0.setValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
