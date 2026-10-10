package com.kubi.kucoin.manager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KCSocketProvider.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.manager.KCSocketProvider", m90122f = "KCSocketProvider.kt", m90123i = {0, 0}, m90124l = {197}, m90125m = "fetchHttpFallback", m90126n = {"descriptor", "fallback"}, m90127s = {"L$0", "L$1"})
public final class KCSocketProvider$fetchHttpFallback$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KCSocketProvider<Entity> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCSocketProvider$fetchHttpFallback$1(KCSocketProvider<Entity> kCSocketProvider, Continuation<? super KCSocketProvider$fetchHttpFallback$1> continuation) {
        super(continuation);
        this.this$0 = kCSocketProvider;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m32512i(null, this);
    }
}
