package com.kubi.unify.unify.common.order.delegate;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: IOrderApiDelegate.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.unify.common.order.delegate.IOrderApiDelegate", m90122f = "IOrderApiDelegate.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {284}, m90125m = "fetchEsAccountRiskRateChange", m90126n = {"qty", FirebaseAnalytics.Param.PRICE, "orderType", "symbol", "side", "trial"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
public final class IOrderApiDelegate$fetchEsAccountRiskRateChange$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IOrderApiDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IOrderApiDelegate$fetchEsAccountRiskRateChange$1(IOrderApiDelegate iOrderApiDelegate, Continuation<? super IOrderApiDelegate$fetchEsAccountRiskRateChange$1> continuation) {
        super(continuation);
        this.this$0 = iOrderApiDelegate;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4501d1(false, null, null, null, null, null, this);
    }
}
