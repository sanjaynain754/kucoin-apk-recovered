package com.kubi.market.monitor.lib.p100ui.floating.setting;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.mvi.common.C19244f;
import com.kubi.mvi.state.MVIStatus;
import com.kubi.mvi.state.StatusKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import sl.C44512a;

/* JADX INFO: compiled from: SettingSymbolListView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/mvi/state/MVIStatus;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.SettingSymbolListView$bindState$1", m90122f = "SettingSymbolListView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SettingSymbolListView$bindState$1 extends SuspendLambda implements Function2<MVIStatus, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingSymbolListView this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(MVIStatus mVIStatus, Continuation<? super Unit> continuation) {
        return ((SettingSymbolListView$bindState$1) create(mVIStatus, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSymbolListView$bindState$1(SettingSymbolListView settingSymbolListView, Continuation<? super SettingSymbolListView$bindState$1> continuation) {
        super(2, continuation);
        this.this$0 = settingSymbolListView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SettingSymbolListView$bindState$1 settingSymbolListView$bindState$1 = new SettingSymbolListView$bindState$1(this.this$0, continuation);
        settingSymbolListView$bindState$1.L$0 = obj;
        return settingSymbolListView$bindState$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        LinearLayoutCompat linearLayoutCompat;
        MVIStatus mVIStatus = (MVIStatus) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44512a binding = this.this$0.getBinding();
        if (binding != null && (linearLayoutCompat = binding.f98582c) != null) {
            C19244f.m42542a(linearLayoutCompat, StatusKt.m42643c(mVIStatus));
        }
        C44512a binding2 = this.this$0.getBinding();
        if (binding2 != null && (recyclerView = binding2.f98583d) != null) {
            C19244f.m42542a(recyclerView, !StatusKt.m42643c(mVIStatus));
        }
        return Unit.INSTANCE;
    }
}
