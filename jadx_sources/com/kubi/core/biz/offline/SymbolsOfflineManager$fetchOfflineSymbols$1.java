package com.kubi.core.biz.offline;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SymbolsOfflineManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.offline.SymbolsOfflineManager", m90122f = "SymbolsOfflineManager.kt", m90123i = {0, 0}, m90124l = {38, 41}, m90125m = "fetchOfflineSymbols", m90126n = {"$this$fetchOfflineSymbols_u24lambda_u241", "$i$a$-runCatching-SymbolsOfflineManager$fetchOfflineSymbols$2"}, m90127s = {"L$0", "I$0"})
public final class SymbolsOfflineManager$fetchOfflineSymbols$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SymbolsOfflineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymbolsOfflineManager$fetchOfflineSymbols$1(SymbolsOfflineManager symbolsOfflineManager, Continuation<? super SymbolsOfflineManager$fetchOfflineSymbols$1> continuation) {
        super(continuation);
        this.this$0 = symbolsOfflineManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m22080b(this);
    }
}
