package com.kubi.core.biz.submit;

import p309hd.InterfaceC38169a;
import p309hd.TradeSettingsBean;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/setting/data/TradeSettingsBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$collectBuyDirectionData$2", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeCoreSubmitFragment$collectBuyDirectionData$2 extends SuspendLambda implements Function2<TradeSettingsBean, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TradeCoreSubmitFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(TradeSettingsBean tradeSettingsBean, Continuation<? super Unit> continuation) {
        return ((TradeCoreSubmitFragment$collectBuyDirectionData$2) create(tradeSettingsBean, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeCoreSubmitFragment$collectBuyDirectionData$2(TradeCoreSubmitFragment tradeCoreSubmitFragment, Continuation<? super TradeCoreSubmitFragment$collectBuyDirectionData$2> continuation) {
        super(2, continuation);
        this.this$0 = tradeCoreSubmitFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeCoreSubmitFragment$collectBuyDirectionData$2 tradeCoreSubmitFragment$collectBuyDirectionData$2 = new TradeCoreSubmitFragment$collectBuyDirectionData$2(this.this$0, continuation);
        tradeCoreSubmitFragment$collectBuyDirectionData$2.L$0 = obj;
        return tradeCoreSubmitFragment$collectBuyDirectionData$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TradeSettingsBean tradeSettingsBean = (TradeSettingsBean) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.mo22382i0(Intrinsics.areEqual(tradeSettingsBean.getTradeDirection(), InterfaceC38169a.a.f85864a));
        return Unit.INSTANCE;
    }
}
