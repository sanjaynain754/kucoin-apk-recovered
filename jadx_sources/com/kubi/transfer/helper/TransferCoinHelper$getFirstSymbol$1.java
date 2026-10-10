package com.kubi.transfer.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TransferCoinHelper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.helper.TransferCoinHelper", m90122f = "TransferCoinHelper.kt", m90123i = {}, m90124l = {260}, m90125m = "getFirstSymbol", m90126n = {}, m90127s = {})
public final class TransferCoinHelper$getFirstSymbol$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransferCoinHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferCoinHelper$getFirstSymbol$1(TransferCoinHelper transferCoinHelper, Continuation<? super TransferCoinHelper$getFirstSymbol$1> continuation) {
        super(continuation);
        this.this$0 = transferCoinHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m64596m(this);
    }
}
