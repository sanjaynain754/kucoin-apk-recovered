package com.kubi.payment.fasttradev2.buy.confirm.bankcard;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BuyBankCardConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmVM", m90122f = "BuyBankCardConfirmVM.kt", m90123i = {1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {112, 142, BuiltinOperator.UNSORTED_SEGMENT_SUM}, m90125m = "realPlaceOrder", m90126n = {"sessionId", "previewOrder", "request", "sessionId", "previewOrder", "request", DbParams.KEY_CHANNEL_RESULT, "data"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class BuyBankCardConfirmVM$realPlaceOrder$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BuyBankCardConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyBankCardConfirmVM$realPlaceOrder$1(BuyBankCardConfirmVM buyBankCardConfirmVM, Continuation<? super BuyBankCardConfirmVM$realPlaceOrder$1> continuation) {
        super(continuation);
        this.this$0 = buyBankCardConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m47596q0(this);
    }
}
