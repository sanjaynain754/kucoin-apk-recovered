package com.kubi.sdk.push;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PushManger.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.push.PushManger", m90122f = "PushManger.kt", m90123i = {0}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_SUM}, m90125m = "unbind", m90126n = {"param"}, m90127s = {"L$0"})
public final class PushManger$unbind$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushManger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushManger$unbind$1(PushManger pushManger, Continuation<? super PushManger$unbind$1> continuation) {
        super(continuation);
        this.this$0 = pushManger;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57928m(this);
    }
}
