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
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.config.RankMarketConfigKt", m90122f = "RankMarketConfig.kt", m90123i = {1, 1}, m90124l = {70, 75}, m90125m = "getRankMarketConfig", m90126n = {"preChoose", "list"}, m90127s = {"L$0", "L$1"})
public final class RankMarketConfigKt$getRankMarketConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RankMarketConfigKt.m52712d(this);
    }

    public RankMarketConfigKt$getRankMarketConfig$1(Continuation<? super RankMarketConfigKt$getRankMarketConfig$1> continuation) {
        super(continuation);
    }
}
