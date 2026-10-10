package com.kubi.payment.fasttrade.sell.precheck;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SellSecurityPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttrade.sell.precheck.SellSecurityPreCheckInterceptor", m90122f = "SellSecurityPreCheckInterceptor.kt", m90123i = {0, 0, 0, 0}, m90124l = {22}, m90125m = "intercept", m90126n = {"param", "checkResult", "isBindTradingPassword", "needShowTradingPassword"}, m90127s = {"L$0", "L$1", "I$0", "Z$0"})
public final class SellSecurityPreCheckInterceptor$intercept$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SellSecurityPreCheckInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellSecurityPreCheckInterceptor$intercept$1(SellSecurityPreCheckInterceptor sellSecurityPreCheckInterceptor, Continuation<? super SellSecurityPreCheckInterceptor$intercept$1> continuation) {
        super(continuation);
        this.this$0 = sellSecurityPreCheckInterceptor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo47135a(null, this);
    }
}
