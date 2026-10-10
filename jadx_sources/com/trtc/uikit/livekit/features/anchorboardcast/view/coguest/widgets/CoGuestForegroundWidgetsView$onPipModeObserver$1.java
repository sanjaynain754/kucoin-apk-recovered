package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: CoGuestForegroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.widgets.CoGuestForegroundWidgetsView", m90122f = "CoGuestForegroundWidgetsView.kt", m90123i = {}, m90124l = {99}, m90125m = "onPipModeObserver", m90126n = {}, m90127s = {})
public final class CoGuestForegroundWidgetsView$onPipModeObserver$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoGuestForegroundWidgetsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoGuestForegroundWidgetsView$onPipModeObserver$1(CoGuestForegroundWidgetsView coGuestForegroundWidgetsView, Continuation<? super CoGuestForegroundWidgetsView$onPipModeObserver$1> continuation) {
        super(continuation);
        this.this$0 = coGuestForegroundWidgetsView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m80482p(this);
    }
}
