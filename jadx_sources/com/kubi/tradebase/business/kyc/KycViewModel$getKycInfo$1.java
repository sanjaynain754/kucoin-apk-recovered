package com.kubi.tradebase.business.kyc;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KycViewModel.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradebase.business.kyc.KycViewModel", m90122f = "KycViewModel.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1}, m90124l = {41, 46}, m90125m = "getKycInfo", m90126n = {"status", "onStart", "onComplete", "completableDeferred", "status", "onStart", "onComplete", "completableDeferred"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
public final class KycViewModel$getKycInfo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KycViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycViewModel$getKycInfo$1(KycViewModel kycViewModel, Continuation<? super KycViewModel$getKycInfo$1> continuation) {
        super(continuation);
        this.this$0 = kycViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m63181o(null, null, null, this);
    }
}
