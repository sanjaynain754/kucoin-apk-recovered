package com.kubi.assets.exchange.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MarginConvertViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.exchange.viewmodel.MarginConvertViewModel", m90122f = "MarginConvertViewModel.kt", m90123i = {0, 0, 0, 0}, m90124l = {83}, m90125m = "requestConvertSmallAssets", m90126n = {"intent", "exchangeRequest", "it", "$i$a$-let-MarginConvertViewModel$requestConvertSmallAssets$2"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
public final class MarginConvertViewModel$requestConvertSmallAssets$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MarginConvertViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginConvertViewModel$requestConvertSmallAssets$1(MarginConvertViewModel marginConvertViewModel, Continuation<? super MarginConvertViewModel$requestConvertSmallAssets$1> continuation) {
        super(continuation);
        this.this$0 = marginConvertViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m16538B(null, this);
    }
}
