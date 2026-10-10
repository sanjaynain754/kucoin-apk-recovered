package com.kubi.lite.p098ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: LiteFlutterActivity.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.lite.ui.LiteFlutterActivity", m90122f = "LiteFlutterActivity.kt", m90123i = {0, 1}, m90124l = {174, 176}, m90125m = "onFlutterDisplayed", m90126n = {"binding", "binding"}, m90127s = {"L$0", "L$0"})
public final class LiteFlutterActivity$onFlutterDisplayed$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LiteFlutterActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiteFlutterActivity$onFlutterDisplayed$1(LiteFlutterActivity liteFlutterActivity, Continuation<? super LiteFlutterActivity$onFlutterDisplayed$1> continuation) {
        super(continuation);
        this.this$0 = liteFlutterActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m37679b0(this);
    }
}
