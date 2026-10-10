package com.kubi.safe.api.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SafeVerifyResult.kt */
/* JADX INFO: loaded from: classes40.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.safe.api.entity.SafeVerifyResultKt", m90122f = "SafeVerifyResult.kt", m90123i = {0, 0}, m90124l = {37}, m90125m = "onVerify", m90126n = {"$this$onVerify", "block"}, m90127s = {"L$0", "L$1"})
public final class SafeVerifyResultKt$onVerify$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SafeVerifyResultKt.m56305c(null, null, this);
    }

    public SafeVerifyResultKt$onVerify$1(Continuation<? super SafeVerifyResultKt$onVerify$1> continuation) {
        super(continuation);
    }
}
