package com.kubi.sdk.site.rebirth;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ProcessRebirthActivity.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.rebirth.ProcessRebirthActivity", m90122f = "ProcessRebirthActivity.kt", m90123i = {0}, m90124l = {205}, m90125m = "goSplash", m90126n = {"killPid"}, m90127s = {"I$0"})
public final class ProcessRebirthActivity$goSplash$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProcessRebirthActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessRebirthActivity$goSplash$1(ProcessRebirthActivity processRebirthActivity, Continuation<? super ProcessRebirthActivity$goSplash$1> continuation) {
        super(continuation);
        this.this$0 = processRebirthActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58183M(0, this);
    }
}
