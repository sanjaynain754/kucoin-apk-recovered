package com.kubi.payment.fast.paymentmethod;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PaymentMethodFragmentExt.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.paymentmethod.PaymentMethodFragmentExtKt", m90122f = "PaymentMethodFragmentExt.kt", m90123i = {0, 0, 0}, m90124l = {60}, m90125m = "checkAppVersion", m90126n = {"$this$checkAppVersion", "paymentMethod", "type"}, m90127s = {"L$0", "L$1", "L$2"})
public final class PaymentMethodFragmentExtKt$checkAppVersion$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PaymentMethodFragmentExtKt.m46559d(null, null, this);
    }

    public PaymentMethodFragmentExtKt$checkAppVersion$1(Continuation<? super PaymentMethodFragmentExtKt$checkAppVersion$1> continuation) {
        super(continuation);
    }
}
