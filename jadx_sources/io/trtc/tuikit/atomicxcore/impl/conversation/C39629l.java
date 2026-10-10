package io.trtc.tuikit.atomicxcore.impl.conversation;

import kotlinx.coroutines.flow.InterfaceC41673r;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C39629l extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39606E f88038b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39629l(C39606E c39606e, Continuation continuation) {
        super(2, continuation);
        this.f88038b = c39606e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39629l(this.f88038b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39629l(this.f88038b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88037a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41673r interfaceC41673r = C39617P.f88014j;
            C39628k c39628k = new C39628k(this.f88038b);
            this.f88037a = 1;
            if (interfaceC41673r.collect(c39628k, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
