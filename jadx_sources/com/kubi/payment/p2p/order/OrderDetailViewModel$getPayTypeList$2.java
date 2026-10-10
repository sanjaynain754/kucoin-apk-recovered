package com.kubi.payment.p2p.order;

import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.otc.paytype.C20143e;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import io.reactivex.functions.BiConsumer;
import java.util.List;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/otc/entity/PayTypeEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailViewModel$getPayTypeList$2", m90122f = "OrderDetailViewModel.kt", m90123i = {0}, m90124l = {562}, m90125m = "invokeSuspend", m90126n = {"$i$f$suspendCancellableCoroutine"}, m90127s = {"I$0"})
@SourceDebugExtension({"SMAP\nOrderDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel$getPayTypeList$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,561:1\n426#2,11:562\n*S KotlinDebug\n*F\n+ 1 OrderDetailViewModel.kt\ncom/kubi/payment/p2p/order/OrderDetailViewModel$getPayTypeList$2\n*L\n498#1:562,11\n*E\n"})
public final class OrderDetailViewModel$getPayTypeList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends PayTypeEntity>>, Object> {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ OrderDetailViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.OrderDetailViewModel$getPayTypeList$2$a */
    /* JADX INFO: compiled from: OrderDetailViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21096a<T1, T2> implements BiConsumer {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<List<PayTypeEntity>> f39755b;

        /* JADX WARN: Multi-variable type inference failed */
        public C21096a(InterfaceC41708m<? super List<PayTypeEntity>> interfaceC41708m) {
            this.f39755b = interfaceC41708m;
        }

        @Override // io.reactivex.functions.BiConsumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean bool, List<PayTypeEntity> list) {
            this.f39755b.resumeWith(Result.m103844constructorimpl(list));
        }
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends PayTypeEntity>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<PayTypeEntity>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailViewModel$getPayTypeList$2(OrderDetailViewModel orderDetailViewModel, Continuation<? super OrderDetailViewModel$getPayTypeList$2> continuation) {
        super(2, continuation);
        this.this$0 = orderDetailViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderDetailViewModel$getPayTypeList$2(this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<PayTypeEntity>> continuation) {
        return ((OrderDetailViewModel$getPayTypeList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OrderDetailViewModel orderDetailViewModel = this.this$0;
        this.L$0 = orderDetailViewModel;
        this.I$0 = 0;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        InterfaceC23686g interfaceC23686g = orderDetailViewModel.f39742i0;
        if (interfaceC23686g != null) {
            C20143e.m45238d(interfaceC23686g, new C21096a(c41716o));
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objM91171w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91171w;
    }
}
