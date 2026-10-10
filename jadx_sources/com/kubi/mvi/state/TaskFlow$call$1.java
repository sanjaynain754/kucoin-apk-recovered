package com.kubi.mvi.state;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TaskFlow.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.TaskFlow", m90122f = "TaskFlow.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {70, 74}, m90125m = "call", m90126n = {"bizType$iv", "reportName$iv", "needCatch$iv", "bizType$iv", "reportName$iv", "needCatch$iv"}, m90127s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
public final class TaskFlow$call$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TaskFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFlow$call$1(TaskFlow taskFlow, Continuation<? super TaskFlow$call$1> continuation) {
        super(continuation);
        this.this$0 = taskFlow;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m42654c(null, this);
    }
}
