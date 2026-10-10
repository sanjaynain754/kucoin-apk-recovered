package com.kubi.quotefacade.rank.list;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RankListVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.list.RankListVM", m90122f = "RankListVM.kt", m90123i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, m90124l = {147, 154, 159}, m90125m = "fetchDataList", m90126n = {"rankType", "subConfig", "from", "market", "catalog", "resultList", "rankType", "subConfig", "from", "market", "catalog", "resultList", "rankType", "subConfig", "from", "market", "catalog", "resultList", "futuresList"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
public final class RankListVM$fetchDataList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RankListVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankListVM$fetchDataList$1(RankListVM rankListVM, Continuation<? super RankListVM$fetchDataList$1> continuation) {
        super(continuation);
        this.this$0 = rankListVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m52899i(null, null, null, null, this);
    }
}
