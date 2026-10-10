package com.kubi.spot.interceptor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FlashConvertInterceptor.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.interceptor.FlashConvertInterceptor", m90122f = "FlashConvertInterceptor.kt", m90123i = {}, m90124l = {199}, m90125m = "getUserHoldings", m90126n = {}, m90127s = {})
public final class FlashConvertInterceptor$getUserHoldings$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlashConvertInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashConvertInterceptor$getUserHoldings$1(FlashConvertInterceptor flashConvertInterceptor, Continuation<? super FlashConvertInterceptor$getUserHoldings$1> continuation) {
        super(continuation);
        this.this$0 = flashConvertInterceptor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m61872n(this);
    }
}
