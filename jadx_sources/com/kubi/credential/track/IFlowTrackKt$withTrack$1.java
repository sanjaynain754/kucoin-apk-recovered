package com.kubi.credential.track;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: IFlowTrack.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.credential.track.IFlowTrackKt", m90122f = "IFlowTrack.kt", m90123i = {0}, m90124l = {37}, m90125m = "withTrack", m90126n = {"$this$withTrack"}, m90127s = {"L$0"})
public final class IFlowTrackKt$withTrack$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return IFlowTrackKt.m23447a(null, null, this);
    }

    public IFlowTrackKt$withTrack$1(Continuation<? super IFlowTrackKt$withTrack$1> continuation) {
        super(continuation);
    }
}
