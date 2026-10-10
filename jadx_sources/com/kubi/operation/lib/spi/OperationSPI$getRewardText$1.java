package com.kubi.operation.lib.spi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: OperationSPI.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.spi.OperationSPI", m90122f = "OperationSPI.kt", m90123i = {}, m90124l = {16}, m90125m = "getRewardText", m90126n = {}, m90127s = {})
public final class OperationSPI$getRewardText$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperationSPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationSPI$getRewardText$1(OperationSPI operationSPI, Continuation<? super OperationSPI$getRewardText$1> continuation) {
        super(continuation);
        this.this$0 = operationSPI;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo43565a(this);
    }
}
