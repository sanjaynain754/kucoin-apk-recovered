package com.kubi.sdk.web.match;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: WhiteListManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.web.match.WhiteListManager", m90122f = "WhiteListManager.kt", m90123i = {0}, m90124l = {94}, m90125m = "load", m90126n = {"this"}, m90127s = {"L$0"})
public final class WhiteListManager$load$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WhiteListManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteListManager$load$1(WhiteListManager whiteListManager, Continuation<? super WhiteListManager$load$1> continuation) {
        super(continuation);
        this.this$0 = whiteListManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58803d(this);
    }
}
