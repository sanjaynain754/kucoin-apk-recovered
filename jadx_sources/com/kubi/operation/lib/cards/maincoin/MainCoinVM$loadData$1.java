package com.kubi.operation.lib.cards.maincoin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MainCoinVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.cards.maincoin.MainCoinVM", m90122f = "MainCoinVM.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {38, 46}, m90125m = "loadData", m90126n = {"cacheTime", "ignoreCacheTime", "cacheTime", "list", "ignoreCacheTime"}, m90127s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"})
public final class MainCoinVM$loadData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MainCoinVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCoinVM$loadData$1(MainCoinVM mainCoinVM, Continuation<? super MainCoinVM$loadData$1> continuation) {
        super(continuation);
        this.this$0 = mainCoinVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m43369o(false, this);
    }
}
