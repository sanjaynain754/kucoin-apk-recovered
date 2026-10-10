package com.kubi.sdk.push;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PushManger.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.push.PushManger", m90122f = "PushManger.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {136, 140}, m90125m = "bindAnonymous", m90126n = {"force", "now", "param", "force", "now"}, m90127s = {"Z$0", "J$0", "L$0", "Z$0", "J$0"})
public final class PushManger$bindAnonymous$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushManger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushManger$bindAnonymous$1(PushManger pushManger, Continuation<? super PushManger$bindAnonymous$1> continuation) {
        super(continuation);
        this.this$0 = pushManger;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57920d(false, this);
    }
}
