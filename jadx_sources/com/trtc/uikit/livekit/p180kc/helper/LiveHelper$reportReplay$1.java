package com.trtc.uikit.livekit.p180kc.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: LiveHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.helper.LiveHelper", m90122f = "LiveHelper.kt", m90123i = {0, 0, 0}, m90124l = {141}, m90125m = "reportReplay", m90126n = {"roomId", "eventId", "request"}, m90127s = {"L$0", "L$1", "L$2"})
public final class LiveHelper$reportReplay$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LiveHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveHelper$reportReplay$1(LiveHelper liveHelper, Continuation<? super LiveHelper$reportReplay$1> continuation) {
        super(continuation);
        this.this$0 = liveHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m81513e(null, null, this);
    }
}
