package com.kubi.assets.search.depositandwithdraw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: DepositSearchCoinVMHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.search.depositandwithdraw.DepositSearchCoinVMHelper", m90122f = "DepositSearchCoinVMHelper.kt", m90123i = {0, 1}, m90124l = {61, 66}, m90125m = "handleGetServerData", m90126n = {"completableDeferred", "completableDeferred"}, m90127s = {"L$0", "L$0"})
public final class DepositSearchCoinVMHelper$handleGetServerData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DepositSearchCoinVMHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositSearchCoinVMHelper$handleGetServerData$1(DepositSearchCoinVMHelper depositSearchCoinVMHelper, Continuation<? super DepositSearchCoinVMHelper$handleGetServerData$1> continuation) {
        super(continuation);
        this.this$0 = depositSearchCoinVMHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo18916q(this);
    }
}
