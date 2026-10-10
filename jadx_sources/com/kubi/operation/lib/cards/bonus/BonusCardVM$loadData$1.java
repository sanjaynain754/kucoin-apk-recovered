package com.kubi.operation.lib.cards.bonus;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BonusCardVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.cards.bonus.BonusCardVM", m90122f = "BonusCardVM.kt", m90123i = {0, 0}, m90124l = {30}, m90125m = "loadData", m90126n = {"cacheTime", "ignoreCacheTime"}, m90127s = {"L$0", "Z$0"})
public final class BonusCardVM$loadData$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BonusCardVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusCardVM$loadData$1(BonusCardVM bonusCardVM, Continuation<? super BonusCardVM$loadData$1> continuation) {
        super(continuation);
        this.this$0 = bonusCardVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m43341o(false, this);
    }
}
