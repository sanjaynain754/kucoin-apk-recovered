package com.kubi.payment.p106rn;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.buy.popularpay.googlepay.h;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentFastTradeGooglePayPayload;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCRNBridgePaymentCallImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1", m90122f = "KCRNBridgePaymentCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCRNBridgePaymentCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,620:1\n44#2,2:621\n*S KotlinDebug\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1\n*L\n428#1:621,2\n*E\n"})
public final class KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<KCJSApiPaymentFastTradeGooglePayPayload, ProtocolException, Unit> $callback;
    final /* synthetic */ PaymentDataRequest $paymentDataRequest;
    final /* synthetic */ Activity $topActivity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KCRNBridgePaymentCallImpl this$0;

    /* JADX INFO: renamed from: f */
    public static final Unit m49502f(Function2 function2, KCRNBridgePaymentCallImpl kCRNBridgePaymentCallImpl, PaymentData paymentData, ProtocolException protocolException) {
        try {
            if (paymentData != null) {
                function2.invoke(kCRNBridgePaymentCallImpl.m49489n0(paymentData), null);
            } else {
                function2.invoke(null, protocolException);
            }
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "Parse error";
            }
            function2.invoke(null, new ProtocolException(message, null, null, false, 14, null));
            C43846g.m96568c(new OtcException(new Throwable("Google Pay load payment data error2: " + e11.getMessage()), "payment", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1(Activity activity, PaymentDataRequest paymentDataRequest, Function2<? super KCJSApiPaymentFastTradeGooglePayPayload, ? super ProtocolException, Unit> function2, KCRNBridgePaymentCallImpl kCRNBridgePaymentCallImpl, Continuation<? super KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1> continuation) {
        super(2, continuation);
        this.$topActivity = activity;
        this.$paymentDataRequest = paymentDataRequest;
        this.$callback = function2;
        this.this$0 = kCRNBridgePaymentCallImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1 kCRNBridgePaymentCallImpl$showFastTradeGooglePay$1 = new KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1(this.$topActivity, this.$paymentDataRequest, this.$callback, this.this$0, continuation);
        kCRNBridgePaymentCallImpl$showFastTradeGooglePay$1.L$0 = obj;
        return kCRNBridgePaymentCallImpl$showFastTradeGooglePay$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaymentsClient paymentsClientE = h.a.e(this.$topActivity);
        if (paymentsClientE == null) {
            this.$callback.invoke(null, new ProtocolException("GooglePay client unavailable", null, null, false, 14, null));
            return Unit.INSTANCE;
        }
        Task<PaymentData> taskLoadPaymentData = paymentsClientE.loadPaymentData(this.$paymentDataRequest);
        Intrinsics.checkNotNullExpressionValue(taskLoadPaymentData, "loadPaymentData(...)");
        GooglePayResultFragment orCreate = GooglePayResultFragment.f40169W.getOrCreate((FragmentActivity) this.$topActivity);
        final Function2<KCJSApiPaymentFastTradeGooglePayPayload, ProtocolException, Unit> function2 = this.$callback;
        final KCRNBridgePaymentCallImpl kCRNBridgePaymentCallImpl = this.this$0;
        orCreate.m49421f3(taskLoadPaymentData, new Function2() { // from class: com.kubi.payment.rn.v
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return KCRNBridgePaymentCallImpl$showFastTradeGooglePay$1.m49502f(function2, kCRNBridgePaymentCallImpl, (PaymentData) obj2, (ProtocolException) obj3);
            }
        });
        return Unit.INSTANCE;
    }
}
