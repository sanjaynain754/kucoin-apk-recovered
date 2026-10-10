package io.trtc.tuikit.atomicxcore.impl.view.call.grid;

import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.grid.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C40010g extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40011h f88992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40010g(C40011h c40011h, Continuation continuation) {
        super(2, continuation);
        this.f88992b = c40011h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40010g(this.f88992b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40010g(this.f88992b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88991a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<LinkedHashSet<CallParticipantInfo>> allParticipants = CallStore.INSTANCE.getShared().getObserverState().getAllParticipants();
            C40009f c40009f = new C40009f(this.f88992b);
            this.f88991a = 1;
            if (allParticipants.collect(c40009f, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
