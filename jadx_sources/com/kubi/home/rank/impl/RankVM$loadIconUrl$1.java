package com.kubi.home.rank.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RankVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.rank.impl.RankVM", m90122f = "RankVM.kt", m90123i = {0}, m90124l = {173}, m90125m = "loadIconUrl", m90126n = {"$this$loadIconUrl"}, m90127s = {"L$0"})
public final class RankVM$loadIconUrl$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RankVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankVM$loadIconUrl$1(RankVM rankVM, Continuation<? super RankVM$loadIconUrl$1> continuation) {
        super(continuation);
        this.this$0 = rankVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m29918W(null, this);
    }
}
