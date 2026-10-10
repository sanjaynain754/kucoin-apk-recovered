package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ApplyCoGuestFloatView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.ApplyCoGuestFloatView", m90122f = "ApplyCoGuestFloatView.kt", m90123i = {0}, m90124l = {132}, m90125m = "onApplyLinkAudienceListChange", m90126n = {"currentLiveId"}, m90127s = {"L$0"})
public final class ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ApplyCoGuestFloatView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1(ApplyCoGuestFloatView applyCoGuestFloatView, Continuation<? super ApplyCoGuestFloatView$onApplyLinkAudienceListChange$1> continuation) {
        super(continuation);
        this.this$0 = applyCoGuestFloatView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m80449o(this);
    }
}
