package com.kubi.quotefacade.favorites.recommend;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RecommendCommonViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.recommend.RecommendCommonViewModel", m90122f = "RecommendCommonViewModel.kt", m90123i = {0, 1}, m90124l = {156, BuiltinOperator.UNSORTED_SEGMENT_MIN}, m90125m = "handleRecommendDataAlpha", m90126n = {"favType", "favType"}, m90127s = {"I$0", "I$0"})
public final class RecommendCommonViewModel$handleRecommendDataAlpha$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecommendCommonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendCommonViewModel$handleRecommendDataAlpha$1(RecommendCommonViewModel recommendCommonViewModel, Continuation<? super RecommendCommonViewModel$handleRecommendDataAlpha$1> continuation) {
        super(continuation);
        this.this$0 = recommendCommonViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m51717S(0, this);
    }
}
