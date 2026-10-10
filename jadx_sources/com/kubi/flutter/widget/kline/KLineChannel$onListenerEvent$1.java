package com.kubi.flutter.widget.kline;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KLineChannel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineChannel", m90122f = "KLineChannel.kt", m90123i = {0, 0, 0, 0, 0, 0, 0}, m90124l = {158}, m90125m = "onListenerEvent", m90126n = {"eventMessage", "this_$iv", "listener$iv", "$completion", "$this$onListenerEvent_u24lambda_u247", "$i$f$callOne", "$i$a$-callOne-KLineChannel$onListenerEvent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"})
public final class KLineChannel$onListenerEvent$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KLineChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineChannel$onListenerEvent$1(KLineChannel kLineChannel, Continuation<? super KLineChannel$onListenerEvent$1> continuation) {
        super(continuation);
        this.this$0 = kLineChannel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m24116o(null, this);
    }
}
