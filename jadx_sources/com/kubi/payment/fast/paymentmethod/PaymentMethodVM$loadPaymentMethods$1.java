package com.kubi.payment.fast.paymentmethod;

import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.utils.extensions.C27025c;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.paymentmethod.PaymentMethodVM$loadPaymentMethods$1", m90122f = "PaymentMethodVM.kt", m90123i = {0, 1, 1}, m90124l = {62, 65}, m90125m = "invokeSuspend", m90126n = {"request", "request", DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0", "L$0", "L$1"})
public final class PaymentMethodVM$loadPaymentMethods$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExtraParams $extraParams;
    final /* synthetic */ boolean $isFirstLoading;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaymentMethodVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodVM$loadPaymentMethods$1(boolean z11, PaymentMethodVM paymentMethodVM, ExtraParams extraParams, Continuation<? super PaymentMethodVM$loadPaymentMethods$1> continuation) {
        super(2, continuation);
        this.$isFirstLoading = z11;
        this.this$0 = paymentMethodVM;
        this.$extraParams = extraParams;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentMethodVM$loadPaymentMethods$1(this.$isFirstLoading, this.this$0, this.$extraParams, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PaymentMethodVM$loadPaymentMethods$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
    
        if (r3.m46580F(r4, r5, r12) == r0) goto L49;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String tradeType;
        String quoteType;
        String fiatCurrency;
        String cryptoCurrency;
        String inputAmount;
        Boolean boolBoxBoolean;
        PaymentMethodList.Request request;
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
                request = (PaymentMethodList.Request) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (!this.$isFirstLoading) {
                this.this$0.m45657p().postValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isFirstLoading) {
            this.this$0.m45658q().postValue(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null));
        } else {
            this.this$0.m45657p().postValue(Boxing.boxBoolean(true));
        }
        ExtraParams extraParams = this.$extraParams;
        String paymentType = null;
        if (extraParams != null) {
            tradeType = extraParams.getTradeType();
        } else {
            tradeType = null;
        }
        ExtraParams extraParams2 = this.$extraParams;
        if (extraParams2 != null) {
            quoteType = extraParams2.getQuoteType();
        } else {
            quoteType = null;
        }
        ExtraParams extraParams3 = this.$extraParams;
        if (extraParams3 != null) {
            fiatCurrency = extraParams3.getFiatCurrency();
        } else {
            fiatCurrency = null;
        }
        ExtraParams extraParams4 = this.$extraParams;
        if (extraParams4 != null) {
            cryptoCurrency = extraParams4.getCryptoCurrency();
        } else {
            cryptoCurrency = null;
        }
        ExtraParams extraParams5 = this.$extraParams;
        if (extraParams5 != null) {
            inputAmount = extraParams5.getInputAmount();
        } else {
            inputAmount = null;
        }
        ExtraParams extraParams6 = this.$extraParams;
        if (extraParams6 != null) {
            boolBoxBoolean = Boxing.boxBoolean(extraParams6.isOneTimePurchaseMode());
        } else {
            boolBoxBoolean = null;
        }
        Boolean boolBoxBoolean2 = Boxing.boxBoolean(!C27025c.m66567e(boolBoxBoolean, true));
        ExtraParams extraParams7 = this.$extraParams;
        if (extraParams7 != null) {
            paymentType = extraParams7.getPaymentType();
        }
        PaymentMethodList.Request request2 = new PaymentMethodList.Request(tradeType, quoteType, fiatCurrency, cryptoCurrency, inputAmount, boolBoxBoolean2, paymentType);
        IFastRepository iFastRepository = this.this$0.f38607Z;
        this.L$0 = SpillingKt.nullOutSpilledVariable(request2);
        this.label = 1;
        obj = iFastRepository.mo46425b0(request2, this);
        if (obj != coroutine_suspended) {
            request = request2;
        }
        return coroutine_suspended;
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            PaymentMethodVM paymentMethodVM = this.this$0;
            AbstractC42878k.Success success = (AbstractC42878k.Success) abstractC42878k;
            boolean z11 = this.$isFirstLoading;
            this.L$0 = SpillingKt.nullOutSpilledVariable(request);
            this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
            this.label = 2;
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45658q().postValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, true, false, false, 12, null));
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!this.$isFirstLoading) {
            this.this$0.m45657p().postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
