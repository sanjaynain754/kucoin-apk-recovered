package com.kubi.payment.fasttradev2.buy.confirm.bankcard;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BuyBankCardConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmVM", m90122f = "BuyBankCardConfirmVM.kt", m90123i = {0}, m90124l = {191}, m90125m = "loadRiskSessionId", m90126n = {"bizType"}, m90127s = {"L$0"})
public final class BuyBankCardConfirmVM$loadRiskSessionId$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BuyBankCardConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyBankCardConfirmVM$loadRiskSessionId$1(BuyBankCardConfirmVM buyBankCardConfirmVM, Continuation<? super BuyBankCardConfirmVM$loadRiskSessionId$1> continuation) {
        super(continuation);
        this.this$0 = buyBankCardConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m47593m0(this);
    }
}
