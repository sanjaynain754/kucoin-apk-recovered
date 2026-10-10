package com.kubi.core.biz.bottomtab;

import p309hd.TradeSettingsBean;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeBottomVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/setting/data/TradeSettingsBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.TradeBottomVM$executeSettingsJob$2", m90122f = "TradeBottomVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeBottomVM$executeSettingsJob$2 extends SuspendLambda implements Function2<TradeSettingsBean, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TradeBottomVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(TradeSettingsBean tradeSettingsBean, Continuation<? super Unit> continuation) {
        return ((TradeBottomVM$executeSettingsJob$2) create(tradeSettingsBean, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeBottomVM$executeSettingsJob$2(TradeBottomVM tradeBottomVM, Continuation<? super TradeBottomVM$executeSettingsJob$2> continuation) {
        super(2, continuation);
        this.this$0 = tradeBottomVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeBottomVM$executeSettingsJob$2 tradeBottomVM$executeSettingsJob$2 = new TradeBottomVM$executeSettingsJob$2(this.this$0, continuation);
        tradeBottomVM$executeSettingsJob$2.L$0 = obj;
        return tradeBottomVM$executeSettingsJob$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final TradeSettingsBean tradeSettingsBean = (TradeSettingsBean) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.bottomtab.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TradeBottomVM$executeSettingsJob$2.m21357f(tradeSettingsBean, (UiState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final UiState m21357f(TradeSettingsBean tradeSettingsBean, UiState uiState) {
        return UiState.copy$default(uiState, null, tradeSettingsBean.getDefaultBottomTabIndex(), tradeSettingsBean.m86132d(), "", 0, 0, 49, null);
    }
}
