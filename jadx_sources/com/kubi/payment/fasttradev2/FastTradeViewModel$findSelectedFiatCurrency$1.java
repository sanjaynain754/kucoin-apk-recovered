package com.kubi.payment.fasttradev2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel", m90122f = "FastTradeViewModel.kt", m90123i = {0, 0, 0}, m90124l = {313}, m90125m = "findSelectedFiatCurrency", m90126n = {"fiatCurrencyList", "selectedFiatCurrency", "fiatCurrencyTitleList"}, m90127s = {"L$0", "L$1", "L$2"})
public final class FastTradeViewModel$findSelectedFiatCurrency$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$findSelectedFiatCurrency$1(FastTradeViewModel fastTradeViewModel, Continuation<? super FastTradeViewModel$findSelectedFiatCurrency$1> continuation) {
        super(continuation);
        this.this$0 = fastTradeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m47311l0(null, this);
    }
}
