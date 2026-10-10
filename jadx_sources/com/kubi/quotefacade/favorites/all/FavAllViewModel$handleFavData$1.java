package com.kubi.quotefacade.favorites.all;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FavAllViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.all.FavAllViewModel", m90122f = "FavAllViewModel.kt", m90123i = {0, 0, 1, 1}, m90124l = {102, 124}, m90125m = "handleFavData", m90126n = {"resultList", "needSubscribe", "resultList", "needSubscribe"}, m90127s = {"L$0", "Z$0", "L$0", "Z$0"})
public final class FavAllViewModel$handleFavData$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FavAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavAllViewModel$handleFavData$1(FavAllViewModel favAllViewModel, Continuation<? super FavAllViewModel$handleFavData$1> continuation) {
        super(continuation);
        this.this$0 = favAllViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m51526C(false, this);
    }
}
