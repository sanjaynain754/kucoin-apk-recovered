package com.kubi.payment.channel.paymentmethod.withdraw;

import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.data.entities.UserInfo;
import com.kubi.payment.data.source.PaymentRepository;
import kotlinx.coroutines.InterfaceC41709m0;
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

/* JADX INFO: compiled from: WithdrawPaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.paymentmethod.withdraw.WithdrawPaymentMethodVM$loadUserInfo$1", m90122f = "WithdrawPaymentMethodVM.kt", m90123i = {0, 0}, m90124l = {80}, m90125m = "invokeSuspend", m90126n = {"paymentRepository", "request"}, m90127s = {"L$0", "L$1"})
public final class WithdrawPaymentMethodVM$loadUserInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WithdrawPaymentMethodVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawPaymentMethodVM$loadUserInfo$1(WithdrawPaymentMethodVM withdrawPaymentMethodVM, Continuation<? super WithdrawPaymentMethodVM$loadUserInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = withdrawPaymentMethodVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WithdrawPaymentMethodVM$loadUserInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((WithdrawPaymentMethodVM$loadUserInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PaymentRepository paymentRepositoryM45618f = PaymentServiceLocator.f38204a.m45618f();
            UserInfo.Request request = new UserInfo.Request(null, null, null, null, 15, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(paymentRepositoryM45618f);
            this.L$1 = SpillingKt.nullOutSpilledVariable(request);
            this.label = 1;
            obj = paymentRepositoryM45618f.mo46264E(request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            UserInfo.KycInfoResponse kycInfo = ((UserInfo.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getKycInfo();
            if (kycInfo != null) {
                this.this$0.f38364b0.setValue(kycInfo);
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
