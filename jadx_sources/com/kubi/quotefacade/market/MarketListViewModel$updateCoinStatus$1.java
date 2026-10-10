package com.kubi.quotefacade.market;

import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MarketListViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.MarketListViewModel", m90122f = "MarketListViewModel.kt", m90123i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, m90124l = {110, 120, 130}, m90125m = "updateCoinStatus", m90126n = {"marketType", "tradeItemBean", ViewProps.POSITION, "marketType", "tradeItemBean", ViewProps.POSITION, "marketType", "tradeItemBean", ViewProps.POSITION}, m90127s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
public final class MarketListViewModel$updateCoinStatus$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MarketListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketListViewModel$updateCoinStatus$1(MarketListViewModel marketListViewModel, Continuation<? super MarketListViewModel$updateCoinStatus$1> continuation) {
        super(continuation);
        this.this$0 = marketListViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m52361C(null, null, 0, this);
    }
}
