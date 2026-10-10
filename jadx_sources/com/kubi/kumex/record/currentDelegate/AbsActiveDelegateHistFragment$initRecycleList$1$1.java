package com.kubi.kumex.record.currentDelegate;

import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.sdk.PageEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: AbsActiveDelegateHistFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "curLastPage", "", "assetType", "", "symbol"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.AbsActiveDelegateHistFragment$initRecycleList$1$1", m90122f = "AbsActiveDelegateHistFragment.kt", m90123i = {0, 0, 0}, m90124l = {113}, m90125m = "invokeSuspend", m90126n = {"assetType", "symbol", "curLastPage"}, m90127s = {"L$0", "L$1", "J$0"})
public final class AbsActiveDelegateHistFragment$initRecycleList$1$1 extends SuspendLambda implements Function4<Long, String, String, Continuation<? super PageEntity<OrderEntity>>, Object> {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AbsActiveDelegateHistFragment this$0;

    public final Object invoke(long j11, String str, String str2, Continuation<? super PageEntity<OrderEntity>> continuation) {
        AbsActiveDelegateHistFragment$initRecycleList$1$1 absActiveDelegateHistFragment$initRecycleList$1$1 = new AbsActiveDelegateHistFragment$initRecycleList$1$1(this.this$0, continuation);
        absActiveDelegateHistFragment$initRecycleList$1$1.J$0 = j11;
        absActiveDelegateHistFragment$initRecycleList$1$1.L$0 = str;
        absActiveDelegateHistFragment$initRecycleList$1$1.L$1 = str2;
        return absActiveDelegateHistFragment$initRecycleList$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsActiveDelegateHistFragment$initRecycleList$1$1(AbsActiveDelegateHistFragment absActiveDelegateHistFragment, Continuation<? super AbsActiveDelegateHistFragment$initRecycleList$1$1> continuation) {
        super(4, continuation);
        this.this$0 = absActiveDelegateHistFragment;
    }

    @Override // p852kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Long l11, String str, String str2, Continuation<? super PageEntity<OrderEntity>> continuation) {
        return invoke(l11.longValue(), str, str2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j11 = this.J$0;
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        AbsActiveDelegateHistFragment absActiveDelegateHistFragment = this.this$0;
        this.L$0 = SpillingKt.nullOutSpilledVariable(str);
        this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
        this.J$0 = j11;
        this.label = 1;
        Object objMo35364f4 = absActiveDelegateHistFragment.mo35364f4(j11, str, str2, this);
        return objMo35364f4 == coroutine_suspended ? coroutine_suspended : objMo35364f4;
    }
}
