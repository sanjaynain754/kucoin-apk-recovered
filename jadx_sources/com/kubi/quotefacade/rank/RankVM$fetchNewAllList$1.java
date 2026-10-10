package com.kubi.quotefacade.rank;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RankVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.RankVM", m90122f = "RankVM.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m90124l = {60, 66}, m90125m = "fetchNewAllList", m90126n = {"$this$forEach$iv", "element$iv", "subConfig", "it", "$i$f$forEach", "$i$a$-forEach-RankVM$fetchNewAllList$2", "$i$a$-let-RankVM$fetchNewAllList$2$1", "$this$forEach$iv", "element$iv", "subConfig", "it", "$i$f$forEach", "$i$a$-forEach-RankVM$fetchNewAllList$2", "$i$a$-let-RankVM$fetchNewAllList$2$1"}, m90127s = {"L$0", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2"})
public final class RankVM$fetchNewAllList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RankVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankVM$fetchNewAllList$1(RankVM rankVM, Continuation<? super RankVM$fetchNewAllList$1> continuation) {
        super(continuation);
        this.this$0 = rankVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m52705t(this);
    }
}
