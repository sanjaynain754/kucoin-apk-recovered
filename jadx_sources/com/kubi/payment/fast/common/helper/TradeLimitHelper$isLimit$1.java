package com.kubi.payment.fast.common.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TradeLimitHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.common.helper.TradeLimitHelper", m90122f = "TradeLimitHelper.kt", m90123i = {0}, m90124l = {25}, m90125m = "isLimit", m90126n = {"legal"}, m90127s = {"L$0"})
public final class TradeLimitHelper$isLimit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TradeLimitHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeLimitHelper$isLimit$1(TradeLimitHelper tradeLimitHelper, Continuation<? super TradeLimitHelper$isLimit$1> continuation) {
        super(continuation);
        this.this$0 = tradeLimitHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m46374d(null, this);
    }
}
