package com.trtc.uikit.livekit.p180kc.helper;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: LiveHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.helper.LiveHelper", m90122f = "LiveHelper.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {32, 33}, m90125m = FirebaseAnalytics.Event.LOGIN, m90126n = {"context", "roomId", "context", "roomId", "txUserInfo"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
public final class LiveHelper$login$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LiveHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveHelper$login$1(LiveHelper liveHelper, Continuation<? super LiveHelper$login$1> continuation) {
        super(continuation);
        this.this$0 = liveHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m81512d(null, null, this);
    }
}
