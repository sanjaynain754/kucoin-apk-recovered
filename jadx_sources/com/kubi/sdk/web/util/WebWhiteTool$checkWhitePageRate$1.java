package com.kubi.sdk.web.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: WebWhiteTool.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.web.util.WebWhiteTool", m90122f = "WebWhiteTool.kt", m90123i = {0}, m90124l = {69}, m90125m = "checkWhitePageRate", m90126n = {"bitmap"}, m90127s = {"L$0"})
public final class WebWhiteTool$checkWhitePageRate$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebWhiteTool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebWhiteTool$checkWhitePageRate$1(WebWhiteTool webWhiteTool, Continuation<? super WebWhiteTool$checkWhitePageRate$1> continuation) {
        super(continuation);
        this.this$0 = webWhiteTool;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58853d(null, this);
    }
}
