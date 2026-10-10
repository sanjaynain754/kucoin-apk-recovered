package com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: CoHostForegroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostForegroundWidgetsView", m90122f = "CoHostForegroundWidgetsView.kt", m90123i = {}, m90124l = {88}, m90125m = "onPipModeObserver", m90126n = {}, m90127s = {})
public final class CoHostForegroundWidgetsView$onPipModeObserver$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoHostForegroundWidgetsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoHostForegroundWidgetsView$onPipModeObserver$1(CoHostForegroundWidgetsView coHostForegroundWidgetsView, Continuation<? super CoHostForegroundWidgetsView$onPipModeObserver$1> continuation) {
        super(continuation);
        this.this$0 = coHostForegroundWidgetsView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m80570q(this);
    }
}
