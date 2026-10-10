package com.kubi.otc.fiat.recharge;

import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.payment.channel.data.entities.Refund;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.ToastCompat;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p513ot.C43328a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FiatRechargeOrderDetailFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.fiat.recharge.FiatRechargeOrderDetailFragment$refund$1", m90122f = "FiatRechargeOrderDetailFragment.kt", m90123i = {}, m90124l = {243}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FiatRechargeOrderDetailFragment$refund$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ FiatRechargeOrderDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiatRechargeOrderDetailFragment$refund$1(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment, String str, Continuation<? super FiatRechargeOrderDetailFragment$refund$1> continuation) {
        super(2, continuation);
        this.this$0 = fiatRechargeOrderDetailFragment;
        this.$orderId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FiatRechargeOrderDetailFragment$refund$1(this.this$0, this.$orderId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FiatRechargeOrderDetailFragment$refund$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0.showLoadingDialog();
            IChannelRepository iChannelRepositoryM95366d = C43328a.f95644a.m95366d();
            Refund.Request request = new Refund.Request(this.$orderId);
            this.label = 1;
            obj = iChannelRepositoryM95366d.mo45742V(request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            String successfulTip = ((Refund.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getSuccessfulTip();
            if (successfulTip != null && successfulTip.length() != 0) {
                ToastCompat.m66441G(successfulTip, new Object[0]);
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            C19331c.m42836c(((AbstractC42878k.Error) abstractC42878k).getException(), null, 2, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        BaseFragment.hideLoadingDialog$default(this.this$0, false, 1, null);
        this.this$0.m44100W3();
        return Unit.INSTANCE;
    }
}
