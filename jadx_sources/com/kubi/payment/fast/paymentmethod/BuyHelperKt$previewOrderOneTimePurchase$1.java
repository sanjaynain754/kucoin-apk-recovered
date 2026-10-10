package com.kubi.payment.fast.paymentmethod;

import android.content.Context;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BuyHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.paymentmethod.BuyHelperKt$previewOrderOneTimePurchase$1", m90122f = "BuyHelper.kt", m90123i = {}, m90124l = {49}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BuyHelperKt$previewOrderOneTimePurchase$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ExtraParams $extraParams;
    final /* synthetic */ PaymentMethodList.PaymentMethod $paymentMethod;
    final /* synthetic */ PaymentMethodFragment $this_previewOrderOneTimePurchase;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyHelperKt$previewOrderOneTimePurchase$1(PaymentMethodFragment paymentMethodFragment, PaymentMethodList.PaymentMethod paymentMethod, Context context, ExtraParams extraParams, Continuation<? super BuyHelperKt$previewOrderOneTimePurchase$1> continuation) {
        super(2, continuation);
        this.$this_previewOrderOneTimePurchase = paymentMethodFragment;
        this.$paymentMethod = paymentMethod;
        this.$context = context;
        this.$extraParams = extraParams;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyHelperKt$previewOrderOneTimePurchase$1(this.$this_previewOrderOneTimePurchase, this.$paymentMethod, this.$context, this.$extraParams, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyHelperKt$previewOrderOneTimePurchase$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM46559d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentMethodFragment paymentMethodFragment = this.$this_previewOrderOneTimePurchase;
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
        if (!PaymentMethodFragmentExtKt.m46560e(this.$this_previewOrderOneTimePurchase, this.$paymentMethod)) {
            return Unit.INSTANCE;
        }
        String strM66668h = C27041f.m66668h(this.$paymentMethod.getPaymentType());
        String strM66668h2 = C27041f.m66668h(this.$paymentMethod.getPaymentMethodCode());
        String strM66668h3 = C27041f.m66668h(this.$paymentMethod.getFiatCurrency());
        String strM66668h4 = C27041f.m66668h(this.$paymentMethod.getFiatAmount());
        String strM66668h5 = C27041f.m66668h(this.$paymentMethod.getCryptoCurrency());
        PaymentMethodList.BankCardInfo bankCardInfo = this.$paymentMethod.getBankCardInfo();
        BuyHelperKt.m46530p(this.$this_previewOrderOneTimePurchase, this.$paymentMethod, this.$context, new ConfirmExtraParams("BUY", strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, null, C27041f.m66668h(bankCardInfo != null ? bankCardInfo.getCardId() : null), null, null, null, false, null, 5952, null), this.$extraParams);
        return Unit.INSTANCE;
    }
}
