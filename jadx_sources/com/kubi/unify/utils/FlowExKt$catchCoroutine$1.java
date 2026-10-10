package com.kubi.unify.utils;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FlowEx.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.utils.FlowExKt", m90122f = "FlowEx.kt", m90123i = {0, 0}, m90124l = {82}, m90125m = "catchCoroutine", m90126n = {TUIConstants.TIMPush.NOTIFICATION.ACTION, "failure"}, m90127s = {"L$0", "L$1"})
public final class FlowExKt$catchCoroutine$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowExKt.m65458b(null, null, this);
    }

    public FlowExKt$catchCoroutine$1(Continuation<? super FlowExKt$catchCoroutine$1> continuation) {
        super(continuation);
    }
}
