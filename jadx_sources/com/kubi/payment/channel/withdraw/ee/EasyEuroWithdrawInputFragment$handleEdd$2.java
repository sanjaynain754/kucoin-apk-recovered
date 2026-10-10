package com.kubi.payment.channel.withdraw.ee;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.data.entities.KycInfo;
import com.kubi.payment.data.source.PaymentRepository;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import kotlinx.coroutines.InterfaceC41709m0;
import p270ft.C37595a3;
import p270ft.C37705x;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EasyEuroWithdrawInputFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.withdraw.ee.EasyEuroWithdrawInputFragment$handleEdd$2", m90122f = "EasyEuroWithdrawInputFragment.kt", m90123i = {0}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {"request"}, m90127s = {"L$0"})
public final class EasyEuroWithdrawInputFragment$handleEdd$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ EasyEuroWithdrawInputFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasyEuroWithdrawInputFragment$handleEdd$2(EasyEuroWithdrawInputFragment easyEuroWithdrawInputFragment, Continuation<? super EasyEuroWithdrawInputFragment$handleEdd$2> continuation) {
        super(2, continuation);
        this.this$0 = easyEuroWithdrawInputFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EasyEuroWithdrawInputFragment$handleEdd$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EasyEuroWithdrawInputFragment$handleEdd$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String paymentMethodCode;
        String channelId;
        C37595a3 c37595a3;
        ConstraintLayout root;
        C37595a3 c37595a4;
        ConstraintLayout root2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Boolean needEdd = null;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0.showLoadingDialog();
            String fiatCurrency = EasyEuroWithdrawInputFragment.f38395i0.getFiatCurrency();
            PaymentMethod f37438b0 = this.this$0.getF37438b0();
            if (f37438b0 != null) {
                paymentMethodCode = f37438b0.getPaymentMethodCode();
            } else {
                paymentMethodCode = null;
            }
            PaymentMethod f37438b1 = this.this$0.getF37438b0();
            if (f37438b1 != null) {
                channelId = f37438b1.getChannelId();
            } else {
                channelId = null;
            }
            KycInfo.Request request = new KycInfo.Request("WITHDRAW", fiatCurrency, paymentMethodCode, channelId, null, 16, null);
            PaymentRepository paymentRepositoryM45618f = PaymentServiceLocator.f38204a.m45618f();
            this.L$0 = SpillingKt.nullOutSpilledVariable(request);
            this.label = 1;
            obj = paymentRepositoryM45618f.mo46267f(request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            KycInfo.Edd edd = ((KycInfo.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getEdd();
            if (edd != null) {
                needEdd = edd.getNeedEdd();
            }
            if (C27025c.m66566d(needEdd)) {
                C37705x c37705xM44408d4 = this.this$0.m44408d4();
                if (c37705xM44408d4 != null && (c37595a4 = c37705xM44408d4.f84835e) != null && (root2 = c37595a4.getRoot()) != null) {
                    C27046k.m66685H(root2);
                }
            } else {
                C37705x c37705xM44408d5 = this.this$0.m44408d4();
                if (c37705xM44408d5 != null && (c37595a3 = c37705xM44408d5.f84835e) != null && (root = c37595a3.getRoot()) != null) {
                    C27046k.m66700o(root);
                }
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            C19331c.m42836c(((AbstractC42878k.Error) abstractC42878k).getException(), null, 2, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.hideLoadingDialog(true);
        return Unit.INSTANCE;
    }
}
