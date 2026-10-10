package com.kubi.home.rank.impl;

import com.kubi.home.rank.impl.cache.RankItem;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RankVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/home/rank/impl/cache/RankItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.rank.impl.RankVM$handleNewCoinRankList$3", m90122f = "RankVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RankVM$handleNewCoinRankList$3 extends SuspendLambda implements Function2<List<? extends RankItem>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RankVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends RankItem> list, Continuation<? super Unit> continuation) {
        return invoke2((List<RankItem>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankVM$handleNewCoinRankList$3(RankVM rankVM, Continuation<? super RankVM$handleNewCoinRankList$3> continuation) {
        super(2, continuation);
        this.this$0 = rankVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RankVM$handleNewCoinRankList$3 rankVM$handleNewCoinRankList$3 = new RankVM$handleNewCoinRankList$3(this.this$0, continuation);
        rankVM$handleNewCoinRankList$3.L$0 = obj;
        return rankVM$handleNewCoinRankList$3;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<RankItem> list, Continuation<? super Unit> continuation) {
        return ((RankVM$handleNewCoinRankList$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m29919X("refreshData type:" + this.this$0.getF26014X());
        this.this$0.m29888b0(list);
        RankVM rankVM = this.this$0;
        rankVM.m29921d0(rankVM.getF26014X());
        return Unit.INSTANCE;
    }
}
