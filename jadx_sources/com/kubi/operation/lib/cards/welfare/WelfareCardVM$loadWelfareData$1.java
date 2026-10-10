package com.kubi.operation.lib.cards.welfare;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: WelfareCardVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.cards.welfare.WelfareCardVM", m90122f = "WelfareCardVM.kt", m90123i = {}, m90124l = {34}, m90125m = "loadWelfareData", m90126n = {}, m90127s = {})
public final class WelfareCardVM$loadWelfareData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WelfareCardVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelfareCardVM$loadWelfareData$1(WelfareCardVM welfareCardVM, Continuation<? super WelfareCardVM$loadWelfareData$1> continuation) {
        super(continuation);
        this.this$0 = welfareCardVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m43459o(this);
    }
}
