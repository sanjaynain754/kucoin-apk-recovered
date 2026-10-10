package com.kubi.sdk.web;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KWebView.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.web.KWebView", m90122f = "KWebView.kt", m90123i = {0}, m90124l = {443}, m90125m = "enableWritePageChecker", m90126n = {"startTime"}, m90127s = {"J$0"})
public final class KWebView$enableWritePageChecker$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebView$enableWritePageChecker$1(KWebView kWebView, Continuation<? super KWebView$enableWritePageChecker$1> continuation) {
        super(continuation);
        this.this$0 = kWebView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58568h(this);
    }
}
