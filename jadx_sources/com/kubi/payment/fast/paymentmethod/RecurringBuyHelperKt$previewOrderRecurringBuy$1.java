package com.kubi.payment.fast.paymentmethod;

import android.content.Context;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RecurringBuyHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.paymentmethod.RecurringBuyHelperKt$previewOrderRecurringBuy$1", m90122f = "RecurringBuyHelper.kt", m90123i = {}, m90124l = {31}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RecurringBuyHelperKt$previewOrderRecurringBuy$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PaymentMethodList.PaymentMethod $paymentMethod;
    final /* synthetic */ RecurringFrequency $recurringFrequency;
    final /* synthetic */ PaymentMethodFragment $this_previewOrderRecurringBuy;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyHelperKt$previewOrderRecurringBuy$1(PaymentMethodFragment paymentMethodFragment, PaymentMethodList.PaymentMethod paymentMethod, RecurringFrequency recurringFrequency, Context context, Continuation<? super RecurringBuyHelperKt$previewOrderRecurringBuy$1> continuation) {
        super(2, continuation);
        this.$this_previewOrderRecurringBuy = paymentMethodFragment;
        this.$paymentMethod = paymentMethod;
        this.$recurringFrequency = recurringFrequency;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyHelperKt$previewOrderRecurringBuy$1(this.$this_previewOrderRecurringBuy, this.$paymentMethod, this.$recurringFrequency, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RecurringBuyHelperKt$previewOrderRecurringBuy$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM46559d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentMethodFragment paymentMethodFragment = this.$this_previewOrderRecurringBuy;
            PaymentMethodList.PaymentMethod paymentMethod = this.$paymentMethod;
            this.label = 1;
            objM46559d = PaymentMethodFragmentExtKt.m46559d(paymentMethodFragment, paymentMethod, this);
            if (objM46559d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM46559d = obj;
        }
        if (!((Boolean) objM46559d).booleanValue()) {
            return Unit.INSTANCE;
        }
        if (!PaymentMethodFragmentExtKt.m46560e(this.$this_previewOrderRecurringBuy, this.$paymentMethod)) {
            return Unit.INSTANCE;
        }
        String strM66668h = C27041f.m66668h(this.$paymentMethod.getPaymentType());
        String strM66668h2 = C27041f.m66668h(this.$paymentMethod.getPaymentMethodCode());
        String strM66668h3 = C27041f.m66668h(this.$paymentMethod.getFiatCurrency());
        String strM66668h4 = C27041f.m66668h(this.$paymentMethod.getFiatAmount());
        String strM66668h5 = C27041f.m66668h(this.$paymentMethod.getCryptoCurrency());
        PaymentMethodList.BankCardInfo bankCardInfo = this.$paymentMethod.getBankCardInfo();
        ConfirmExtraParams confirmExtraParams = new ConfirmExtraParams("BUY", strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, null, C27041f.m66668h(bankCardInfo != null ? bankCardInfo.getCardId() : null), null, null, null, true, this.$recurringFrequency, 1856, null);
        String paymentType = this.$paymentMethod.getPaymentType();
        if (paymentType != null) {
            int iHashCode = paymentType.hashCode();
            if (iHashCode != -448995838) {
                if (iHashCode != 378796732) {
                    if (iHashCode == 1028436787 && paymentType.equals(FastQuoteModel.PAY_BANK_CARD)) {
                        RecurringBuyHelperKt.m46586e(this.$this_previewOrderRecurringBuy, this.$context, confirmExtraParams, this.$paymentMethod);
                    }
                } else if (paymentType.equals(FastQuoteModel.PAY_BALANCE)) {
                    RecurringBuyHelperKt.m46585d(this.$this_previewOrderRecurringBuy, this.$context, confirmExtraParams);
                }
            } else if (paymentType.equals("POPULAR_PAY")) {
                RecurringBuyHelperKt.m46587f(this.$this_previewOrderRecurringBuy, this.$context, confirmExtraParams, this.$paymentMethod);
            }
        }
        return Unit.INSTANCE;
    }
}
