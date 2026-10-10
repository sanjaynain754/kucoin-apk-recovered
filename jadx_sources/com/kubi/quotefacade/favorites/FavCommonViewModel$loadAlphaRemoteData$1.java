package com.kubi.quotefacade.favorites;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FavCommonViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavCommonViewModel", m90122f = "FavCommonViewModel.kt", m90123i = {0}, m90124l = {269}, m90125m = "loadAlphaRemoteData", m90126n = {"favType"}, m90127s = {"L$0"})
public final class FavCommonViewModel$loadAlphaRemoteData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FavCommonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavCommonViewModel$loadAlphaRemoteData$1(FavCommonViewModel favCommonViewModel, Continuation<? super FavCommonViewModel$loadAlphaRemoteData$1> continuation) {
        super(continuation);
        this.this$0 = favCommonViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m51326V(null, this);
    }
}
