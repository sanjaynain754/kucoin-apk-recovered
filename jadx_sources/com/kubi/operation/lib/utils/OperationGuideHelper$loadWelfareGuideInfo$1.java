package com.kubi.operation.lib.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: OperationGuideHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.utils.OperationGuideHelper", m90122f = "OperationGuideHelper.kt", m90123i = {}, m90124l = {24}, m90125m = "loadWelfareGuideInfo", m90126n = {}, m90127s = {})
public final class OperationGuideHelper$loadWelfareGuideInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperationGuideHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationGuideHelper$loadWelfareGuideInfo$1(OperationGuideHelper operationGuideHelper, Continuation<? super OperationGuideHelper$loadWelfareGuideInfo$1> continuation) {
        super(continuation);
        this.this$0 = operationGuideHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m43650c(this);
    }
}
