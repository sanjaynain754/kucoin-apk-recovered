package com.kubi.home.rank.impl.cache;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RankCoinHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.rank.impl.cache.RankCoinHelper", m90122f = "RankCoinHelper.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, m90124l = {140, 68}, m90125m = "getCoinEntity", m90126n = {FirebaseAnalytics.Param.CURRENCY, "coinEntity", "$this$withLock_u24default$iv", "$i$f$withLock", FirebaseAnalytics.Param.CURRENCY, "coinEntity", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-RankCoinHelper$getCoinEntity$2"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1"})
public final class RankCoinHelper$getCoinEntity$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RankCoinHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankCoinHelper$getCoinEntity$1(RankCoinHelper rankCoinHelper, Continuation<? super RankCoinHelper$getCoinEntity$1> continuation) {
        super(continuation);
        this.this$0 = rankCoinHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m29942f(null, this);
    }
}
