package com.kubi.assets.finance;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FinanceVipViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceVipViewModel", m90122f = "FinanceVipViewModel.kt", m90123i = {}, m90124l = {53}, m90125m = "requestDefaultProducts", m90126n = {}, m90127s = {})
public final class FinanceVipViewModel$requestDefaultProducts$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FinanceVipViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceVipViewModel$requestDefaultProducts$1(FinanceVipViewModel financeVipViewModel, Continuation<? super FinanceVipViewModel$requestDefaultProducts$1> continuation) {
        super(continuation);
        this.this$0 = financeVipViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m16742B(this);
    }
}
