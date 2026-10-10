package com.kubi.quotefacade.favorites.all;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FavAllViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.all.FavAllViewModel", m90122f = "FavAllViewModel.kt", m90123i = {0, 0, 1, 1, 2, 2}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_SUM, 156, 158}, m90125m = "getTradeListFromCache", m90126n = {"$this$getTradeListFromCache_u24lambda_u2420", "$i$a$-buildList-FavAllViewModel$getTradeListFromCache$2", "$this$getTradeListFromCache_u24lambda_u2420", "$i$a$-buildList-FavAllViewModel$getTradeListFromCache$2", "$this$getTradeListFromCache_u24lambda_u2420", "$i$a$-buildList-FavAllViewModel$getTradeListFromCache$2"}, m90127s = {"L$1", "I$0", "L$1", "I$0", "L$1", "I$0"})
public final class FavAllViewModel$getTradeListFromCache$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FavAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavAllViewModel$getTradeListFromCache$1(FavAllViewModel favAllViewModel, Continuation<? super FavAllViewModel$getTradeListFromCache$1> continuation) {
        super(continuation);
        this.this$0 = favAllViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m51525B(this);
    }
}
