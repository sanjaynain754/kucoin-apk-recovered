package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import kotlinx.coroutines.C41727q2;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C40001l extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40002m f88957b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40001l(C40002m c40002m, Continuation continuation) {
        super(2, continuation);
        this.f88957b = c40002m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40001l(this.f88957b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40001l(this.f88957b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88956a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C40000k c40000k = new C40000k(this.f88957b, null);
            this.f88956a = 1;
            if (C41727q2.m91193c(c40000k, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
