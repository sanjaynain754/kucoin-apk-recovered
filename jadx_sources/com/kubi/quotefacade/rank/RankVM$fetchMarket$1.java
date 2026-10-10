package com.kubi.quotefacade.rank;

import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: RankVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.RankVM$fetchMarket$1", m90122f = "RankVM.kt", m90123i = {1}, m90124l = {87, 91}, m90125m = "invokeSuspend", m90126n = {"data"}, m90127s = {"L$0"})
public final class RankVM$fetchMarket$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RankVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankVM$fetchMarket$1(RankVM rankVM, Continuation<? super RankVM$fetchMarket$1> continuation) {
        super(2, continuation);
        this.this$0 = rankVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankVM$fetchMarket$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RankVM$fetchMarket$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (com.kubi.quotefacade.rank.config.RankMarketConfigKt.m52714f(r7, r6) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
        RankVM$fetchMarket$1$data$1 rankVM$fetchMarket$1$data$1 = new RankVM$fetchMarket$1$data$1(this.this$0, null);
        this.label = 1;
        obj = C41686h.m91049g(abstractC41697j0M91392b, rankVM$fetchMarket$1$data$1, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        List list = (List) obj;
        C44128b.m97259c("RankVM", "[fetchMarket] data:" + list);
        this.L$0 = SpillingKt.nullOutSpilledVariable(list);
        this.label = 2;
    }
}
