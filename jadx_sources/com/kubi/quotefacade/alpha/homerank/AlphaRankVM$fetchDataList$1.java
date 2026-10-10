package com.kubi.quotefacade.alpha.homerank;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AlphaRankVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.alpha.homerank.AlphaRankVM", m90122f = "AlphaRankVM.kt", m90123i = {}, m90124l = {39}, m90125m = "fetchDataList", m90126n = {}, m90127s = {})
public final class AlphaRankVM$fetchDataList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AlphaRankVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaRankVM$fetchDataList$1(AlphaRankVM alphaRankVM, Continuation<? super AlphaRankVM$fetchDataList$1> continuation) {
        super(continuation);
        this.this$0 = alphaRankVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m50526e(this);
    }
}
