package com.kubi.payment.fasttradev2.buy.confirm.googlepay;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BuyGooglePayConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.googlepay.BuyGooglePayConfirmVM", m90122f = "BuyGooglePayConfirmVM.kt", m90123i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3}, m90124l = {246, 254, 259, 272}, m90125m = "queryStatus", m90126n = {"orderId", "startTime", "overTime", "orderId", "startTime", "overTime", "orderId", DbParams.KEY_CHANNEL_RESULT, "data", "startTime", "overTime", "orderId", DbParams.KEY_CHANNEL_RESULT, "startTime", "overTime"}, m90127s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "J$0", "I$0"})
public final class BuyGooglePayConfirmVM$queryStatus$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BuyGooglePayConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyGooglePayConfirmVM$queryStatus$1(BuyGooglePayConfirmVM buyGooglePayConfirmVM, Continuation<? super BuyGooglePayConfirmVM$queryStatus$1> continuation) {
        super(continuation);
        this.this$0 = buyGooglePayConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m47643y0(null, 0L, 0, this);
    }
}
