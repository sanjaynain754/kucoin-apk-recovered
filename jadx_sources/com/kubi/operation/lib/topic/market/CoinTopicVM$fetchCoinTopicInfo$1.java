package com.kubi.operation.lib.topic.market;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: CoinTopicVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.topic.market.CoinTopicVM", m90122f = "CoinTopicVM.kt", m90123i = {0}, m90124l = {43}, m90125m = "fetchCoinTopicInfo", m90126n = {"coin"}, m90127s = {"L$0"})
public final class CoinTopicVM$fetchCoinTopicInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoinTopicVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinTopicVM$fetchCoinTopicInfo$1(CoinTopicVM coinTopicVM, Continuation<? super CoinTopicVM$fetchCoinTopicInfo$1> continuation) {
        super(continuation);
        this.this$0 = coinTopicVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m43582g(null, this);
    }
}
