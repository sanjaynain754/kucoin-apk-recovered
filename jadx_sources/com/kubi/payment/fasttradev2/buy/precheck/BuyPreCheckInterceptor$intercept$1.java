package com.kubi.payment.fasttradev2.buy.precheck;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BuyPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.precheck.BuyPreCheckInterceptor", m90122f = "BuyPreCheckInterceptor.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0}, m90124l = {35}, m90125m = "intercept", m90126n = {"param", "checkResult", "isBindTradingPassword", "needShowTradingPassword", "isBindEmail", "needShowBindEmail", "isBindPhoneNumber", "needShowBindPhoneNumber"}, m90127s = {"L$0", "L$1", "I$0", "Z$0", "I$1", "Z$1", "I$2", "Z$2"})
public final class BuyPreCheckInterceptor$intercept$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BuyPreCheckInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPreCheckInterceptor$intercept$1(BuyPreCheckInterceptor buyPreCheckInterceptor, Continuation<? super BuyPreCheckInterceptor$intercept$1> continuation) {
        super(continuation);
        this.this$0 = buyPreCheckInterceptor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo47135a(null, this);
    }
}
