package com.kubi.quotefacade.favorites.edit;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FavEditChildVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.edit.FavEditChildVM", m90122f = "FavEditChildVM.kt", m90123i = {0}, m90124l = {91}, m90125m = "handleGetFuturesFavoriteList", m90126n = {"includeMarket"}, m90127s = {"L$0"})
public final class FavEditChildVM$handleGetFuturesFavoriteList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FavEditChildVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavEditChildVM$handleGetFuturesFavoriteList$1(FavEditChildVM favEditChildVM, Continuation<? super FavEditChildVM$handleGetFuturesFavoriteList$1> continuation) {
        super(continuation);
        this.this$0 = favEditChildVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m51603H(this);
    }
}
