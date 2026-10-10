package com.kubi.spot.business.mvi;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SpotTradeViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.mvi.SpotTradeViewModel$getRiskWarning$2", m90122f = "SpotTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SpotTradeViewModel$getRiskWarning$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SpotTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotTradeViewModel$getRiskWarning$2(SpotTradeViewModel spotTradeViewModel, Continuation<? super SpotTradeViewModel$getRiskWarning$2> continuation) {
        super(2, continuation);
        this.this$0 = spotTradeViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m61256f(String str, UIState uIState) {
        return UIState.copy$default(uIState, false, null, null, null, str, null, 47, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotTradeViewModel$getRiskWarning$2 spotTradeViewModel$getRiskWarning$2 = new SpotTradeViewModel$getRiskWarning$2(this.this$0, continuation);
        spotTradeViewModel$getRiskWarning$2.L$0 = obj;
        return spotTradeViewModel$getRiskWarning$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((SpotTradeViewModel$getRiskWarning$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final String str = (String) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.spot.business.mvi.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SpotTradeViewModel$getRiskWarning$2.m61256f(str, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
