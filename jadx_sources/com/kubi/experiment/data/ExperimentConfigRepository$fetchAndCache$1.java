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
@DebugMetadata(m90121c = "com.kubi.experiment.data.ExperimentConfigRepository", m90122f = "ExperimentConfigRepository.kt", m90123i = {0, 0, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5}, m90124l = {145, 83, 88, 156, 156, 156}, m90125m = "fetchAndCache", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock", "request", "shouldFetch", "request", "shouldFetch", "request", "$this$withLock_u24default$iv", "shouldFetch", "$i$f$withLock", "request", "$this$withLock_u24default$iv", "shouldFetch", "$i$f$withLock", "request", "$this$withLock_u24default$iv", "shouldFetch", "$i$f$withLock"}, m90127s = {"L$0", "I$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "L$2", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "L$0", "L$2", "Z$0", "I$0"})
public final class ExperimentConfigRepository$fetchAndCache$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExperimentConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentConfigRepository$fetchAndCache$1(ExperimentConfigRepository experimentConfigRepository, Continuation<? super ExperimentConfigRepository$fetchAndCache$1> continuation) {
        super(continuation);
        this.this$0 = experimentConfigRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m23728g(this);
    }
}
