package com.kubi.payment.fast.paymentmethod;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.paymentmethod.PaymentMethodVM", m90122f = "PaymentMethodVM.kt", m90123i = {0, 0, 0}, m90124l = {153}, m90125m = "loadCanUseGooglePay", m90126n = {"paymentMethod", "requestJson", "isReadyToPayRequest"}, m90127s = {"L$0", "L$1", "L$2"})
public final class PaymentMethodVM$loadCanUseGooglePay$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentMethodVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodVM$loadCanUseGooglePay$1(PaymentMethodVM paymentMethodVM, Continuation<? super PaymentMethodVM$loadCanUseGooglePay$1> continuation) {
        super(continuation);
        this.this$0 = paymentMethodVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m46578D(null, this);
    }
}
