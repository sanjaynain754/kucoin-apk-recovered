package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.data.entity.TradeItemBean;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SettingSymbolListView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/data/entity/TradeItemBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.SettingSymbolListView$bindState$3", m90122f = "SettingSymbolListView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SettingSymbolListView$bindState$3 extends SuspendLambda implements Function2<List<? extends TradeItemBean>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingSymbolListView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSymbolListView$bindState$3(SettingSymbolListView settingSymbolListView, Continuation<? super SettingSymbolListView$bindState$3> continuation) {
        super(2, continuation);
        this.this$0 = settingSymbolListView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SettingSymbolListView$bindState$3 settingSymbolListView$bindState$3 = new SettingSymbolListView$bindState$3(this.this$0, continuation);
        settingSymbolListView$bindState$3.L$0 = obj;
        return settingSymbolListView$bindState$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends TradeItemBean> list, Continuation<? super Unit> continuation) {
        return ((SettingSymbolListView$bindState$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CurrencyAdapter currencyAdapter = this.this$0.f34304g;
        if (currencyAdapter != null) {
            currencyAdapter.replaceData(list);
        }
        return Unit.INSTANCE;
    }
}
