package com.kubi.search.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SearchFavHelper.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.utils.SearchFavHelper", m90122f = "SearchFavHelper.kt", m90123i = {0, 1, 2, 2}, m90124l = {212, 215, 220}, m90125m = "refreshLoginFav", m90126n = {"onFinish", "onFinish", "onFinish", "data"}, m90127s = {"L$0", "L$0", "L$0", "L$1"})
public final class SearchFavHelper$refreshLoginFav$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchFavHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFavHelper$refreshLoginFav$1(SearchFavHelper searchFavHelper, Continuation<? super SearchFavHelper$refreshLoginFav$1> continuation) {
        super(continuation);
        this.this$0 = searchFavHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m59565A(null, this);
    }
}
