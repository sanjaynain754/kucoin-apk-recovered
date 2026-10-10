package com.kubi.assets.finance;

import com.kubi.assets.entity.FinanceProductEntity;
import com.kubi.mvi.event.SingleEvent;
import java.util.ArrayList;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FinanceVipViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/FinanceProductEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceVipViewModel$handleLoadData$2", m90122f = "FinanceVipViewModel.kt", m90123i = {0}, m90124l = {38}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
public final class FinanceVipViewModel$handleLoadData$2 extends SuspendLambda implements Function2<ArrayList<FinanceProductEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FinanceVipViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceVipViewModel$handleLoadData$2(FinanceVipViewModel financeVipViewModel, Continuation<? super FinanceVipViewModel$handleLoadData$2> continuation) {
        super(2, continuation);
        this.this$0 = financeVipViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FinanceVipViewModel$handleLoadData$2 financeVipViewModel$handleLoadData$2 = new FinanceVipViewModel$handleLoadData$2(this.this$0, continuation);
        financeVipViewModel$handleLoadData$2.L$0 = obj;
        return financeVipViewModel$handleLoadData$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(ArrayList<FinanceProductEntity> arrayList, Continuation<? super Unit> continuation) {
        return ((FinanceVipViewModel$handleLoadData$2) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList = (ArrayList) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m16744v(arrayList);
            if (arrayList.isEmpty()) {
                FinanceVipViewModel financeVipViewModel = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(arrayList);
                this.label = 1;
                if (financeVipViewModel.m16742B(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.sendSingleEvent(SingleEvent.C19248d.f35627b);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
