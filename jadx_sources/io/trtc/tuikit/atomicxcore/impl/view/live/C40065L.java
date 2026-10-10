package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.L */
/* JADX INFO: loaded from: classes61.dex */
public final class C40065L extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f89128a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveCoreView f89129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40065L(LiveCoreView liveCoreView, Continuation continuation) {
        super(2, continuation);
        this.f89129b = liveCoreView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40065L(this.f89129b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40065L(this.f89129b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f89128a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            LiveCoreView liveCoreView = this.f89129b;
            this.f89128a = 1;
            if (AbstractC40069N.m88437b(liveCoreView, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
