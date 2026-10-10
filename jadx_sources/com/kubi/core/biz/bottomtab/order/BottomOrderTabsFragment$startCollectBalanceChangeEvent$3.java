package com.kubi.core.biz.bottomtab.order;

import p722wd.C45796e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/sharevm/SymbolBalanceEvent;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$startCollectBalanceChangeEvent$3", m90122f = "BottomOrderTabsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BottomOrderTabsFragment$startCollectBalanceChangeEvent$3 extends SuspendLambda implements Function2<C45796e, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BottomOrderTabsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomOrderTabsFragment$startCollectBalanceChangeEvent$3(BottomOrderTabsFragment bottomOrderTabsFragment, Continuation<? super BottomOrderTabsFragment$startCollectBalanceChangeEvent$3> continuation) {
        super(2, continuation);
        this.this$0 = bottomOrderTabsFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BottomOrderTabsFragment$startCollectBalanceChangeEvent$3 bottomOrderTabsFragment$startCollectBalanceChangeEvent$3 = new BottomOrderTabsFragment$startCollectBalanceChangeEvent$3(this.this$0, continuation);
        bottomOrderTabsFragment$startCollectBalanceChangeEvent$3.L$0 = obj;
        return bottomOrderTabsFragment$startCollectBalanceChangeEvent$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(C45796e c45796e, Continuation<? super Unit> continuation) {
        return ((BottomOrderTabsFragment$startCollectBalanceChangeEvent$3) create(c45796e, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C45796e c45796e = (C45796e) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m21011A3().m21415F(new BottomOrderTabsContract$UiIntent.BalanceChange(c45796e.getF103217a()));
        return Unit.INSTANCE;
    }
}
