package com.kubi.quotefacade.favorites.recommend;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RecommendCommonViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.recommend.RecommendCommonViewModel", m90122f = "RecommendCommonViewModel.kt", m90123i = {0, 1, 2, 3}, m90124l = {86, 91, 95, 99}, m90125m = "handleRecommendData", m90126n = {"favType", "favType", "favType", "favType"}, m90127s = {"L$0", "L$0", "L$0", "L$0"})
public final class RecommendCommonViewModel$handleRecommendData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecommendCommonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendCommonViewModel$handleRecommendData$1(RecommendCommonViewModel recommendCommonViewModel, Continuation<? super RecommendCommonViewModel$handleRecommendData$1> continuation) {
        super(continuation);
        this.this$0 = recommendCommonViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m51716N(null, this);
    }
}
