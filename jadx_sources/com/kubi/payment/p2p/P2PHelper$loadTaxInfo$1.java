package com.kubi.payment.p2p;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: P2PHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.P2PHelper", m90122f = "P2PHelper.kt", m90123i = {}, m90124l = {47}, m90125m = "loadTaxInfo", m90126n = {}, m90127s = {})
public final class P2PHelper$loadTaxInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ P2PHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PHelper$loadTaxInfo$1(P2PHelper p2PHelper, Continuation<? super P2PHelper$loadTaxInfo$1> continuation) {
        super(continuation);
        this.this$0 = p2PHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m48409a(this);
    }
}
