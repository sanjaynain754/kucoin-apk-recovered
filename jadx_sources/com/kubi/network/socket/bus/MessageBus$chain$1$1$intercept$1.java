package com.kubi.network.socket.bus;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MessageBus.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.network.socket.bus.MessageBus$chain$1$1", m90122f = "MessageBus.kt", m90123i = {}, m90124l = {34}, m90125m = "intercept", m90126n = {}, m90127s = {})
public final class MessageBus$chain$1$1$intercept$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageBus$chain$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBus$chain$1$1$intercept$1(MessageBus$chain$1$1 messageBus$chain$1$1, Continuation<? super MessageBus$chain$1$1$intercept$1> continuation) {
        super(continuation);
        this.this$0 = messageBus$chain$1$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo42904a(null, this);
    }
}
