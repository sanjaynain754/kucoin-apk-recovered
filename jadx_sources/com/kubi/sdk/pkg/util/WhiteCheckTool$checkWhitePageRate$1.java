package com.kubi.sdk.pkg.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: WhiteCheckTool.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.util.WhiteCheckTool", m90122f = "WhiteCheckTool.kt", m90123i = {0}, m90124l = {65}, m90125m = "checkWhitePageRate", m90126n = {"bitmap"}, m90127s = {"L$0"})
public final class WhiteCheckTool$checkWhitePageRate$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WhiteCheckTool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteCheckTool$checkWhitePageRate$1(WhiteCheckTool whiteCheckTool, Continuation<? super WhiteCheckTool$checkWhitePageRate$1> continuation) {
        super(continuation);
        this.this$0 = whiteCheckTool;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57857d(null, this);
    }
}
