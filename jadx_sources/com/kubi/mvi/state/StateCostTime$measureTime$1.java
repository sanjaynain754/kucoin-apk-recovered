package com.kubi.mvi.state;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: StateCostTime.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.StateCostTime", m90122f = "StateCostTime.kt", m90123i = {0, 0}, m90124l = {30}, m90125m = "measureTime", m90126n = {"this", "start$iv"}, m90127s = {"L$0", "J$0"})
public final class StateCostTime$measureTime$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StateCostTime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateCostTime$measureTime$1(StateCostTime stateCostTime, Continuation<? super StateCostTime$measureTime$1> continuation) {
        super(continuation);
        this.this$0 = stateCostTime;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m42591e(null, this);
    }
}
