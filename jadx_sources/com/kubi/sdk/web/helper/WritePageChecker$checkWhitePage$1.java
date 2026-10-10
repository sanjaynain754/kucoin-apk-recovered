package com.kubi.sdk.web.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: WritePageChecker.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.web.helper.WritePageChecker", m90122f = "WritePageChecker.kt", m90123i = {0, 0}, m90124l = {38}, m90125m = "checkWhitePage$KWebView_release", m90126n = {"this", "uri"}, m90127s = {"L$0", "L$1"})
public final class WritePageChecker$checkWhitePage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WritePageChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritePageChecker$checkWhitePage$1(WritePageChecker writePageChecker, Continuation<? super WritePageChecker$checkWhitePage$1> continuation) {
        super(continuation);
        this.this$0 = writePageChecker;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58690a(null, this);
    }
}
