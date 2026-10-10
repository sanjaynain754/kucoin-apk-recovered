package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.LiveSummaryData;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.b1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39724b1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39733e1 f88258a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39724b1(C39733e1 c39733e1, Continuation continuation) {
        super(2, continuation);
        this.f88258a = c39733e1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39724b1(this.f88258a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39724b1(this.f88258a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long totalDuration;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        LiveSummaryData liveSummaryData = (LiveSummaryData) this.f88258a.f88286b.getValue();
        if (liveSummaryData.getTotalDuration() <= 9223372036854774807L) {
            totalDuration = liveSummaryData.getTotalDuration() + 1000;
        } else {
            totalDuration = Long.MAX_VALUE;
        }
        this.f88258a.f88286b.setValue(LiveSummaryData.copy$default(liveSummaryData, totalDuration, 0, 0, 0, 0, 0, 0, 126, null));
        return Unit.INSTANCE;
    }
}
