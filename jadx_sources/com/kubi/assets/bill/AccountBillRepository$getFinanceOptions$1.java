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
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillRepository", m90122f = "AccountBillRepository.kt", m90123i = {}, m90124l = {219}, m90125m = "getFinanceOptions-IoAF18A", m90126n = {}, m90127s = {})
public final class AccountBillRepository$getFinanceOptions$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountBillRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillRepository$getFinanceOptions$1(AccountBillRepository accountBillRepository, Continuation<? super AccountBillRepository$getFinanceOptions$1> continuation) {
        super(continuation);
        this.this$0 = accountBillRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM15647l = this.this$0.m15647l(this);
        return objM15647l == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM15647l : Result.m103843boximpl(objM15647l);
    }
}
