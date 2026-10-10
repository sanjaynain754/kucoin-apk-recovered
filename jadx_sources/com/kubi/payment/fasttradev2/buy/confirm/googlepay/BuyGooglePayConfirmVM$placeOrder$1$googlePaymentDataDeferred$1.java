package com.kubi.payment.fasttradev2.buy.confirm.googlepay;

import com.google.android.gms.wallet.PaymentData;
import com.kubi.payment.fast.data.entities.GooglePaymentData;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BuyGooglePayConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/payment/fast/data/entities/GooglePaymentData;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.googlepay.BuyGooglePayConfirmVM$placeOrder$1$googlePaymentDataDeferred$1", m90122f = "BuyGooglePayConfirmVM.kt", m90123i = {}, m90124l = {153}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BuyGooglePayConfirmVM$placeOrder$1$googlePaymentDataDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super GooglePaymentData>, Object> {
    final /* synthetic */ PaymentData $paymentData;
    int label;
    final /* synthetic */ BuyGooglePayConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyGooglePayConfirmVM$placeOrder$1$googlePaymentDataDeferred$1(BuyGooglePayConfirmVM buyGooglePayConfirmVM, PaymentData paymentData, Continuation<? super BuyGooglePayConfirmVM$placeOrder$1$googlePaymentDataDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = buyGooglePayConfirmVM;
        this.$paymentData = paymentData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyGooglePayConfirmVM$placeOrder$1$googlePaymentDataDeferred$1(this.this$0, this.$paymentData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super GooglePaymentData> continuation) {
        return ((BuyGooglePayConfirmVM$placeOrder$1$googlePaymentDataDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuyGooglePayConfirmVM buyGooglePayConfirmVM = this.this$0;
        PaymentData paymentData = this.$paymentData;
        this.label = 1;
        Object objM47640n0 = buyGooglePayConfirmVM.m47640n0(paymentData, this);
        if (objM47640n0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM47640n0;
    }
}
