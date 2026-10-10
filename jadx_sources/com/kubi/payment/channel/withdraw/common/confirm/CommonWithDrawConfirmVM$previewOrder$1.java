package com.kubi.payment.channel.withdraw.common.confirm;

import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.channel.data.entities.PreviewWithdrawOrder;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.utils.extensions.C27041f;
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

/* JADX INFO: compiled from: CommonWithDrawConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.withdraw.common.confirm.CommonWithDrawConfirmVM$previewOrder$1", m90122f = "CommonWithDrawConfirmVM.kt", m90123i = {0}, m90124l = {69}, m90125m = "invokeSuspend", m90126n = {"request"}, m90127s = {"L$0"})
public final class CommonWithDrawConfirmVM$previewOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ WithdrawConfirmExtraParams $extraParams;
    Object L$0;
    int label;
    final /* synthetic */ CommonWithDrawConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWithDrawConfirmVM$previewOrder$1(CommonWithDrawConfirmVM commonWithDrawConfirmVM, WithdrawConfirmExtraParams withdrawConfirmExtraParams, Continuation<? super CommonWithDrawConfirmVM$previewOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = commonWithDrawConfirmVM;
        this.$extraParams = withdrawConfirmExtraParams;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonWithDrawConfirmVM$previewOrder$1(this.this$0, this.$extraParams, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CommonWithDrawConfirmVM$previewOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String paymentMethodCode;
        String channelId;
        String fiatCurrency;
        String accountId;
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
            this.this$0.m45658q().postValue(new BasePaymentVM.LoadingUIState(true, false, false, false, 14, null));
            WithdrawConfirmExtraParams withdrawConfirmExtraParams = this.$extraParams;
            String amount = null;
            if (withdrawConfirmExtraParams != null) {
                paymentMethodCode = withdrawConfirmExtraParams.getPaymentMethodCode();
            } else {
                paymentMethodCode = null;
            }
            String strM66668h = C27041f.m66668h(paymentMethodCode);
            WithdrawConfirmExtraParams withdrawConfirmExtraParams2 = this.$extraParams;
            if (withdrawConfirmExtraParams2 != null) {
                channelId = withdrawConfirmExtraParams2.getChannelId();
            } else {
                channelId = null;
            }
            String strM66668h2 = C27041f.m66668h(channelId);
            WithdrawConfirmExtraParams withdrawConfirmExtraParams3 = this.$extraParams;
            if (withdrawConfirmExtraParams3 != null) {
                fiatCurrency = withdrawConfirmExtraParams3.getFiatCurrency();
            } else {
                fiatCurrency = null;
            }
            String strM66668h3 = C27041f.m66668h(fiatCurrency);
            WithdrawConfirmExtraParams withdrawConfirmExtraParams4 = this.$extraParams;
            if (withdrawConfirmExtraParams4 != null) {
                accountId = withdrawConfirmExtraParams4.getAccountId();
            } else {
                accountId = null;
            }
            String strM66668h4 = C27041f.m66668h(accountId);
            WithdrawConfirmExtraParams withdrawConfirmExtraParams5 = this.$extraParams;
            if (withdrawConfirmExtraParams5 != null) {
                amount = withdrawConfirmExtraParams5.getAmount();
            }
            PreviewWithdrawOrder.Request request = new PreviewWithdrawOrder.Request(strM66668h, strM66668h2, strM66668h3, strM66668h4, C27041f.m66668h(amount));
            IChannelRepository iChannelRepository = this.this$0.f38380Z;
            this.L$0 = SpillingKt.nullOutSpilledVariable(request);
            this.label = 1;
            obj = iChannelRepository.mo45746h(request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.m45658q().postValue(new BasePaymentVM.LoadingUIState(false, false, false, true, 6, null));
            this.this$0.f38381a0.postValue((PreviewWithdrawOrder.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45659r().postValue(((AbstractC42878k.Error) abstractC42878k).getException());
            this.this$0.m45658q().postValue(new BasePaymentVM.LoadingUIState(false, false, true, false, 10, null));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
