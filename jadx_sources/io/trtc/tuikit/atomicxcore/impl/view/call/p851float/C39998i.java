package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C39998i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40002m f88951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39998i(C40002m c40002m, Continuation continuation) {
        super(2, continuation);
        this.f88951b = c40002m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39998i(this.f88951b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39998i(this.f88951b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88950a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C40002m c40002m = this.f88951b;
            this.f88950a = 1;
            if (C40002m.m88385a(c40002m, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
