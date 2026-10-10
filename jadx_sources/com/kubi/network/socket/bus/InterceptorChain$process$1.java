package com.kubi.network.socket.bus;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: InterceptorChain.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.network.socket.bus.InterceptorChain", m90122f = "InterceptorChain.kt", m90123i = {0, 0, 0}, m90124l = {14}, m90125m = "process", m90126n = {"this", "msg", "index"}, m90127s = {"L$0", "L$1", "I$0"})
public final class InterceptorChain$process$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterceptorChain this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptorChain$process$1(InterceptorChain interceptorChain, Continuation<? super InterceptorChain$process$1> continuation) {
        super(continuation);
        this.this$0 = interceptorChain;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m42899a(null, this);
    }
}
