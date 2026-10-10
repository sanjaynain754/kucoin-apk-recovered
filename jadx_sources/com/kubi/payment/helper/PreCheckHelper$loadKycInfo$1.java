package com.kubi.payment.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PreCheckHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.helper.PreCheckHelper", m90122f = "PreCheckHelper.kt", m90123i = {0, 0, 0}, m90124l = {34}, m90125m = "loadKycInfo", m90126n = {"paymentRepository", "request", "isHighKyc"}, m90127s = {"L$0", "L$1", "I$0"})
public final class PreCheckHelper$loadKycInfo$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PreCheckHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreCheckHelper$loadKycInfo$1(PreCheckHelper preCheckHelper, Continuation<? super PreCheckHelper$loadKycInfo$1> continuation) {
        super(continuation);
        this.this$0 = preCheckHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m48239j(this);
    }
}
