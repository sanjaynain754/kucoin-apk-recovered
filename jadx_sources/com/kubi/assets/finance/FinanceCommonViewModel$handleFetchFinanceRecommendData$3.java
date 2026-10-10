package com.kubi.assets.finance;

import com.kubi.assets.entity.FinanceRecommendEntity;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FinanceCommonViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/FinanceRecommendEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceCommonViewModel$handleFetchFinanceRecommendData$3", m90122f = "FinanceCommonViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FinanceCommonViewModel$handleFetchFinanceRecommendData$3 extends SuspendLambda implements Function2<List<? extends FinanceRecommendEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FinanceCommonViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends FinanceRecommendEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<FinanceRecommendEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceCommonViewModel$handleFetchFinanceRecommendData$3(FinanceCommonViewModel financeCommonViewModel, Continuation<? super FinanceCommonViewModel$handleFetchFinanceRecommendData$3> continuation) {
        super(2, continuation);
        this.this$0 = financeCommonViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m16656f(List list, UIState uIState) {
        return UIState.copy$default(uIState, new ArrayList(), list, false, 4, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FinanceCommonViewModel$handleFetchFinanceRecommendData$3 financeCommonViewModel$handleFetchFinanceRecommendData$3 = new FinanceCommonViewModel$handleFetchFinanceRecommendData$3(this.this$0, continuation);
        financeCommonViewModel$handleFetchFinanceRecommendData$3.L$0 = obj;
        return financeCommonViewModel$handleFetchFinanceRecommendData$3;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<FinanceRecommendEntity> list, Continuation<? super Unit> continuation) {
        return ((FinanceCommonViewModel$handleFetchFinanceRecommendData$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.finance.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return FinanceCommonViewModel$handleFetchFinanceRecommendData$3.m16656f(list, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
