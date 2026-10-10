package com.kubi.kumex.service;

import android.content.Context;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.record.DelegationOrderDetailFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.utils.C27051h;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KuMexService.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.service.KuMexService$jumpFuturesDelegationDetail$1", m90122f = "KuMexService.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KuMexService$jumpFuturesDelegationDetail$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ OrderEntity $orderEntity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuMexService$jumpFuturesDelegationDetail$1(Context context, OrderEntity orderEntity, Continuation<? super KuMexService$jumpFuturesDelegationDetail$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$orderEntity = orderEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuMexService$jumpFuturesDelegationDetail$1(this.$ctx, this.$orderEntity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuMexService$jumpFuturesDelegationDetail$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.$ctx;
            String string = context.getString(R$string.deal_detail);
            String name = DelegationOrderDetailFragment.class.getName();
            C27051h c27051h = new C27051h();
            c27051h.m66721e("data", this.$orderEntity);
            Unit unit = Unit.INSTANCE;
            BaseFragmentActivity.m56574n0(context, string, name, c27051h.m66717a());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
