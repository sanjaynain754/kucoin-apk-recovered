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
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel", m90122f = "FastTradeViewModel.kt", m90123i = {0, 0, 0}, m90124l = {444}, m90125m = "loadCryptoCurrencyList", m90126n = {"fiatCurrency", "cryptoCurrencyList", "needBalance"}, m90127s = {"L$0", "L$1", "Z$0"})
public final class FastTradeViewModel$loadCryptoCurrencyList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$loadCryptoCurrencyList$1(FastTradeViewModel fastTradeViewModel, Continuation<? super FastTradeViewModel$loadCryptoCurrencyList$1> continuation) {
        super(continuation);
        this.this$0 = fastTradeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m47283G0(null, false, this);
    }
}
