package com.kubi.home.rank.impl.cache;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RankCoinHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.rank.impl.cache.RankCoinHelper", m90122f = "RankCoinHelper.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {107, 109}, m90125m = "fetchCoinList", m90126n = {"it", "$i$a$-repeat-RankCoinHelper$fetchCoinList$2", DbParams.KEY_CHANNEL_RESULT, "it", "$i$a$-repeat-RankCoinHelper$fetchCoinList$2"}, m90127s = {"I$2", "I$3", "L$0", "I$2", "I$3"})
public final class RankCoinHelper$fetchCoinList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RankCoinHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankCoinHelper$fetchCoinList$1(RankCoinHelper rankCoinHelper, Continuation<? super RankCoinHelper$fetchCoinList$1> continuation) {
        super(continuation);
        this.this$0 = rankCoinHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m29941e(this);
    }
}
