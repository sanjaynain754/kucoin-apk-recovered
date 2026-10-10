package com.kubi.assets.alpha;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AlphaViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.alpha.AlphaViewModel", m90122f = "AlphaViewModel.kt", m90123i = {}, m90124l = {98}, m90125m = "handleAlphaCoinList", m90126n = {}, m90127s = {})
public final class AlphaViewModel$handleAlphaCoinList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AlphaViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaViewModel$handleAlphaCoinList$1(AlphaViewModel alphaViewModel, Continuation<? super AlphaViewModel$handleAlphaCoinList$1> continuation) {
        super(continuation);
        this.this$0 = alphaViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m15320E(this);
    }
}
