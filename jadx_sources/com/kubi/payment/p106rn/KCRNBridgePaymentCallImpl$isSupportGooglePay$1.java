package com.kubi.payment.p106rn;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.buy.popularpay.googlepay.g;
import com.kubi.payment.fast.buy.popularpay.googlepay.h;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.extensions.C27025c;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCRNBridgePaymentCallImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.KCRNBridgePaymentCallImpl$isSupportGooglePay$1", m90122f = "KCRNBridgePaymentCallImpl.kt", m90123i = {0, 0, 0}, m90124l = {175}, m90125m = "invokeSuspend", m90126n = {"googlePayClient", "requestJson", "isReadyToPayRequest"}, m90127s = {"L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nKCRNBridgePaymentCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$isSupportGooglePay$1\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,620:1\n44#2,2:621\n*S KotlinDebug\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$isSupportGooglePay$1\n*L\n178#1:621,2\n*E\n"})
public final class KCRNBridgePaymentCallImpl$isSupportGooglePay$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $allowedCardNetworks;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ Activity $topActivity;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCRNBridgePaymentCallImpl$isSupportGooglePay$1(Activity activity, List<String> list, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCRNBridgePaymentCallImpl$isSupportGooglePay$1> continuation) {
        super(2, continuation);
        this.$topActivity = activity;
        this.$allowedCardNetworks = list;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRNBridgePaymentCallImpl$isSupportGooglePay$1(this.$topActivity, this.$allowedCardNetworks, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRNBridgePaymentCallImpl$isSupportGooglePay$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Task<Boolean> taskIsReadyToPay;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                h hVar = h.a;
                PaymentsClient paymentsClientE = hVar.e(this.$topActivity);
                String strValueOf = String.valueOf(hVar.c(this.$allowedCardNetworks));
                IsReadyToPayRequest isReadyToPayRequestFromJson = IsReadyToPayRequest.fromJson(strValueOf);
                Intrinsics.checkNotNullExpressionValue(isReadyToPayRequestFromJson, "fromJson(...)");
                if (paymentsClientE != null && (taskIsReadyToPay = paymentsClientE.isReadyToPay(isReadyToPayRequestFromJson)) != null) {
                    this.L$0 = SpillingKt.nullOutSpilledVariable(paymentsClientE);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(strValueOf);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(isReadyToPayRequestFromJson);
                    this.label = 1;
                    obj = g.a(taskIsReadyToPay, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    bool = null;
                }
                this.$callback.invoke(Boxing.boxBoolean(C27025c.m66566d(bool)), null);
                return Unit.INSTANCE;
            }
            bool = (Boolean) obj;
            this.$callback.invoke(Boxing.boxBoolean(C27025c.m66566d(bool)), null);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(new Throwable("flutter google pay load can use error: " + e11.getMessage()), "payment", false, null, 8, null), null, 2, null);
            this.$callback.invoke(Boxing.boxBoolean(false), null);
        }
        return Unit.INSTANCE;
    }
}
