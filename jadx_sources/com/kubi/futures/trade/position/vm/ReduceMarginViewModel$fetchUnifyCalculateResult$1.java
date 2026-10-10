package com.kubi.futures.trade.position.vm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ReduceMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.ReduceMarginViewModel", m90122f = "ReduceMarginViewModel.kt", m90123i = {0}, m90124l = {271}, m90125m = "fetchUnifyCalculateResult", m90126n = {"value"}, m90127s = {"L$0"})
public final class ReduceMarginViewModel$fetchUnifyCalculateResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReduceMarginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReduceMarginViewModel$fetchUnifyCalculateResult$1(ReduceMarginViewModel reduceMarginViewModel, Continuation<? super ReduceMarginViewModel$fetchUnifyCalculateResult$1> continuation) {
        super(continuation);
        this.this$0 = reduceMarginViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m27941Y(null, this);
    }
}
