package com.kubi.assets.exchange.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TradingConvertViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.exchange.viewmodel.TradingConvertViewModel", m90122f = "TradingConvertViewModel.kt", m90123i = {}, m90124l = {42}, m90125m = "requestTradingConvertList", m90126n = {}, m90127s = {})
public final class TradingConvertViewModel$requestTradingConvertList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TradingConvertViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingConvertViewModel$requestTradingConvertList$1(TradingConvertViewModel tradingConvertViewModel, Continuation<? super TradingConvertViewModel$requestTradingConvertList$1> continuation) {
        super(continuation);
        this.this$0 = tradingConvertViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m16556x(this);
    }
}
