package com.kubi.kumex.utils;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: CoroutineEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.utils.CoroutineExKt", m90122f = "CoroutineEx.kt", m90123i = {0, 0}, m90124l = {19}, m90125m = "catchCoroutine", m90126n = {TUIConstants.TIMPush.NOTIFICATION.ACTION, "failure"}, m90127s = {"L$0", "L$1"})
public final class CoroutineExKt$catchCoroutine$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CoroutineExKt.m36471a(null, null, this);
    }

    public CoroutineExKt$catchCoroutine$1(Continuation<? super CoroutineExKt$catchCoroutine$1> continuation) {
        super(continuation);
    }
}
