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
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {722}, m90125m = "realRequestCouponInfo", m90126n = {}, m90127s = {})
public final class FastTradeViewModel$realRequestCouponInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$realRequestCouponInfo$1(FastTradeViewModel fastTradeViewModel, Continuation<? super FastTradeViewModel$realRequestCouponInfo$1> continuation) {
        super(continuation);
        this.this$0 = fastTradeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m47291R0(this);
    }
}
