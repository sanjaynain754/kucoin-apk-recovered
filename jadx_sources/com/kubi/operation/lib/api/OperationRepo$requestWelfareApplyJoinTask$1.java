package com.kubi.operation.lib.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: OperationRepo.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.api.OperationRepo", m90122f = "OperationRepo.kt", m90123i = {0}, m90124l = {145}, m90125m = "requestWelfareApplyJoinTask", m90126n = {"taskId"}, m90127s = {"L$0"})
public final class OperationRepo$requestWelfareApplyJoinTask$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$requestWelfareApplyJoinTask$1(OperationRepo operationRepo, Continuation<? super OperationRepo$requestWelfareApplyJoinTask$1> continuation) {
        super(continuation);
        this.this$0 = operationRepo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m43278s(null, this);
    }
}
