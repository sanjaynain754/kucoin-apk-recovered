package com.kubi.experiment.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ExperimentConfigRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.experiment.data.ExperimentConfigRepository", m90122f = "ExperimentConfigRepository.kt", m90123i = {0, 0, 1, 1}, m90124l = {46, 46}, m90125m = "getExperimentResult", m90126n = {"code", "defaultValue", "code", "defaultValue"}, m90127s = {"L$0", "Z$0", "L$0", "Z$0"})
public final class ExperimentConfigRepository$getExperimentResult$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExperimentConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentConfigRepository$getExperimentResult$1(ExperimentConfigRepository experimentConfigRepository, Continuation<? super ExperimentConfigRepository$getExperimentResult$1> continuation) {
        super(continuation);
        this.this$0 = experimentConfigRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m23730i(null, false, this);
    }
}
