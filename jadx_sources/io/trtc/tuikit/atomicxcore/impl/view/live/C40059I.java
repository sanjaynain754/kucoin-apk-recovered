package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.I */
/* JADX INFO: loaded from: classes61.dex */
public final class C40059I extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f89115a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveCoreView f89116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40059I(LiveCoreView liveCoreView, Continuation continuation) {
        super(2, continuation);
        this.f89116b = liveCoreView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40059I(this.f89116b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40059I(this.f89116b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f89115a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            LiveCoreView liveCoreView = this.f89116b;
            this.f89115a = 1;
            if (AbstractC40069N.m88439c(liveCoreView, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
