package com.kubi.mvi.state;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: StateEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.StateExKt", m90122f = "StateEx.kt", m90123i = {1, 1}, m90124l = {72, 77}, m90125m = "measureTime", m90126n = {"stateName", "mviConfig"}, m90127s = {"L$0", "L$1"})
public final class StateExKt$measureTime$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StateExKt.m42640b(null, null, null, null, this);
    }

    public StateExKt$measureTime$1(Continuation<? super StateExKt$measureTime$1> continuation) {
        super(continuation);
    }
}
