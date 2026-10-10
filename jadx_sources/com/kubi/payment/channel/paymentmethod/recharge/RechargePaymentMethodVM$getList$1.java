package com.kubi.payment.channel.paymentmethod.recharge;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RechargePaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.paymentmethod.recharge.RechargePaymentMethodVM", m90122f = "RechargePaymentMethodVM.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {211, 211}, m90125m = "getList", m90126n = {"fiatCurrency", "paymentDataTask", "guidePaymentListTask", "fiatCurrency", "paymentDataTask", "guidePaymentListTask"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
public final class RechargePaymentMethodVM$getList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RechargePaymentMethodVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RechargePaymentMethodVM$getList$1(RechargePaymentMethodVM rechargePaymentMethodVM, Continuation<? super RechargePaymentMethodVM$getList$1> continuation) {
        super(continuation);
        this.this$0 = rechargePaymentMethodVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m45893J(null, this);
    }
}
