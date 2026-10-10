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
@DebugMetadata(m90121c = "com.kubi.home.rank.impl.RankVM", m90122f = "RankVM.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m90124l = {290}, m90125m = "handleRankList", m90126n = {"list", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "rankEntity", "fromWs", "$i$f$map", "$i$f$mapTo", "$i$a$-map-RankVM$handleRankList$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "Z$0", "I$0", "I$1", "I$2"})
public final class RankVM$handleRankList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RankVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankVM$handleRankList$1(RankVM rankVM, Continuation<? super RankVM$handleRankList$1> continuation) {
        super(continuation);
        this.this$0 = rankVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m29916U(null, false, this);
    }
}
