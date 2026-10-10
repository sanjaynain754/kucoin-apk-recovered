package com.kubi.payment.fast.common.result;

import com.kubi.payment.fast.data.entities.BalanceOrder;
import com.kubi.payment.fast.data.source.IFastRepository;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ResultVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.common.result.ResultVM$loadBalanceOrderDetail$1", m90122f = "ResultVM.kt", m90123i = {}, m90124l = {72}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ResultVM$loadBalanceOrderDetail$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ boolean $showLoading;
    int label;
    final /* synthetic */ ResultVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultVM$loadBalanceOrderDetail$1(ResultVM resultVM, String str, boolean z11, Continuation<? super ResultVM$loadBalanceOrderDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = resultVM;
        this.$orderId = str;
        this.$showLoading = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResultVM$loadBalanceOrderDetail$1(this.this$0, this.$orderId, this.$showLoading, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ResultVM$loadBalanceOrderDetail$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            IFastRepository iFastRepository = this.this$0.f38582X;
            String str = this.$orderId;
            this.label = 1;
            obj = iFastRepository.mo46415J(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            BalanceOrder.OrderDetail orderDetail = (BalanceOrder.OrderDetail) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            Integer orderStatus = orderDetail.getOrderStatus();
            ResultVM resultVM = this.this$0;
            if ((orderStatus != null && orderStatus.intValue() == 1) || (orderStatus != null && orderStatus.intValue() == 2)) {
                z11 = false;
            }
            resultVM.f38588d0 = z11;
            if (!this.this$0.f38588d0 || this.this$0.f38589e0) {
                this.this$0.f38584Z.setValue(orderDetail);
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
            if (this.this$0.f38589e0) {
                this.this$0.f38585a0.setValue(Boxing.boxBoolean(true));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.f38590f0 = false;
        if (this.$showLoading) {
            this.this$0.m94034o().setValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
