package com.trtc.uikit.livekit.features.anchorboardcast;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AnchorView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.AnchorView", m90122f = "AnchorView.kt", m90123i = {}, m90124l = {1562}, m90125m = "onInWaitingChange", m90126n = {}, m90127s = {})
public final class AnchorView$onInWaitingChange$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnchorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorView$onInWaitingChange$1(AnchorView anchorView, Continuation<? super AnchorView$onInWaitingChange$1> continuation) {
        super(continuation);
        this.this$0 = anchorView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m80102U1(this);
    }
}
