package com.kubi.quotefacade.rank.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RankMarketConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.config.RankMarketConfigKt", m90122f = "RankMarketConfig.kt", m90123i = {0, 1, 1, 2, 2, 2}, m90124l = {47, 54, 57}, m90125m = "getCurMarketEntity", m90126n = {"defaultRes", "defaultRes", "preChoose", "defaultRes", "preChoose", "match"}, m90127s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
public final class RankMarketConfigKt$getCurMarketEntity$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RankMarketConfigKt.m52711c(this);
    }

    public RankMarketConfigKt$getCurMarketEntity$1(Continuation<? super RankMarketConfigKt$getCurMarketEntity$1> continuation) {
        super(continuation);
    }
}
