package com.kubi.quotefacade.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: QuoteBusinessConfigHelp.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.helper.QuoteBusinessConfigHelp", m90122f = "QuoteBusinessConfigHelp.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {139, 95}, m90125m = "refreshBusinessConfigMarkList", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-QuoteBusinessConfigHelp$refreshBusinessConfigMarkList$2"}, m90127s = {"L$0", "I$0", "L$0", "I$0", "I$1"})
public final class QuoteBusinessConfigHelp$refreshBusinessConfigMarkList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuoteBusinessConfigHelp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteBusinessConfigHelp$refreshBusinessConfigMarkList$1(QuoteBusinessConfigHelp quoteBusinessConfigHelp, Continuation<? super QuoteBusinessConfigHelp$refreshBusinessConfigMarkList$1> continuation) {
        super(continuation);
        this.this$0 = quoteBusinessConfigHelp;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m51849u(this);
    }
}
