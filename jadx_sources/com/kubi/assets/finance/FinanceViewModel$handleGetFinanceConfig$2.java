package com.kubi.assets.finance;

import com.kubi.assets.entity.FinanceConfig;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FinanceViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/FinanceConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceViewModel$handleGetFinanceConfig$2", m90122f = "FinanceViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FinanceViewModel$handleGetFinanceConfig$2 extends SuspendLambda implements Function2<FinanceConfig, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FinanceViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(FinanceConfig financeConfig, Continuation<? super Unit> continuation) {
        return ((FinanceViewModel$handleGetFinanceConfig$2) create(financeConfig, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceViewModel$handleGetFinanceConfig$2(FinanceViewModel financeViewModel, Continuation<? super FinanceViewModel$handleGetFinanceConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = financeViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m16718f(FinanceConfig financeConfig, UIState uIState) {
        return UIState.copy$default(uIState, null, null, financeConfig, false, null, 27, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FinanceViewModel$handleGetFinanceConfig$2 financeViewModel$handleGetFinanceConfig$2 = new FinanceViewModel$handleGetFinanceConfig$2(this.this$0, continuation);
        financeViewModel$handleGetFinanceConfig$2.L$0 = obj;
        return financeViewModel$handleGetFinanceConfig$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final FinanceConfig financeConfig = (FinanceConfig) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.finance.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return FinanceViewModel$handleGetFinanceConfig$2.m16718f(financeConfig, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
