package com.kubi.assets.search.depositandwithdraw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: WithdrawSearchCoinVMHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.search.depositandwithdraw.WithdrawSearchCoinVMHelper", m90122f = "WithdrawSearchCoinVMHelper.kt", m90123i = {0, 1, 1, 2, 2, 3, 3, 3}, m90124l = {52, 54, 56, 67}, m90125m = "handleGetServerData", m90126n = {"completableDeferred", "completableDeferred", "coinList", "completableDeferred", "coinList", "completableDeferred", "coinList", "withdrawEnableCoinList"}, m90127s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
public final class WithdrawSearchCoinVMHelper$handleGetServerData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WithdrawSearchCoinVMHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawSearchCoinVMHelper$handleGetServerData$1(WithdrawSearchCoinVMHelper withdrawSearchCoinVMHelper, Continuation<? super WithdrawSearchCoinVMHelper$handleGetServerData$1> continuation) {
        super(continuation);
        this.this$0 = withdrawSearchCoinVMHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo18916q(this);
    }
}
