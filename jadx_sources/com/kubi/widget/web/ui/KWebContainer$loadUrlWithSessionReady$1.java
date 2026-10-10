package com.kubi.widget.web.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KWebContainer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.ui.KWebContainer", m90122f = "KWebContainer.kt", m90123i = {0}, m90124l = {218}, m90125m = "loadUrlWithSessionReady", m90126n = {"url"}, m90127s = {"L$0"})
public final class KWebContainer$loadUrlWithSessionReady$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KWebContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebContainer$loadUrlWithSessionReady$1(KWebContainer kWebContainer, Continuation<? super KWebContainer$loadUrlWithSessionReady$1> continuation) {
        super(continuation);
        this.this$0 = kWebContainer;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m67478D(null, this);
    }
}
