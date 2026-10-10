package com.kubi.assets.finance;

import com.kubi.assets.entity.PwmProductEntity;
import com.kubi.mvi.event.SingleEvent;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FinanceVipViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/PwmProductEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceVipViewModel$requestDefaultProducts$2", m90122f = "FinanceVipViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FinanceVipViewModel$requestDefaultProducts$2 extends SuspendLambda implements Function2<PwmProductEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FinanceVipViewModel this$0;

    /* JADX INFO: renamed from: f */
    public static final UIState m16749f(PwmProductEntity pwmProductEntity, UIState uIState) {
        return uIState.copy(null, pwmProductEntity);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(PwmProductEntity pwmProductEntity, Continuation<? super Unit> continuation) {
        return ((FinanceVipViewModel$requestDefaultProducts$2) create(pwmProductEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceVipViewModel$requestDefaultProducts$2(FinanceVipViewModel financeVipViewModel, Continuation<? super FinanceVipViewModel$requestDefaultProducts$2> continuation) {
        super(2, continuation);
        this.this$0 = financeVipViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FinanceVipViewModel$requestDefaultProducts$2 financeVipViewModel$requestDefaultProducts$2 = new FinanceVipViewModel$requestDefaultProducts$2(this.this$0, continuation);
        financeVipViewModel$requestDefaultProducts$2.L$0 = obj;
        return financeVipViewModel$requestDefaultProducts$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final PwmProductEntity pwmProductEntity = (PwmProductEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.finance.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return FinanceVipViewModel$requestDefaultProducts$2.m16749f(pwmProductEntity, (UIState) obj2);
            }
        });
        this.this$0.sendSingleEvent(SingleEvent.C19248d.f35627b);
        return Unit.INSTANCE;
    }
}
