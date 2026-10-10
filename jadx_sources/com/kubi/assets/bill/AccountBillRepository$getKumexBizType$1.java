package com.kubi.assets.bill;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AccountBillRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillRepository", m90122f = "AccountBillRepository.kt", m90123i = {0}, m90124l = {305}, m90125m = "getKumexBizType-gIAlu-s", m90126n = {"fundsType"}, m90127s = {"L$0"})
public final class AccountBillRepository$getKumexBizType$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountBillRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillRepository$getKumexBizType$1(AccountBillRepository accountBillRepository, Continuation<? super AccountBillRepository$getKumexBizType$1> continuation) {
        super(continuation);
        this.this$0 = accountBillRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM15649n = this.this$0.m15649n(null, this);
        return objM15649n == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM15649n : Result.m103843boximpl(objM15649n);
    }
}
