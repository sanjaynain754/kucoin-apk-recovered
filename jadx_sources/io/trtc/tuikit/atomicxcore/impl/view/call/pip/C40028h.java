package io.trtc.tuikit.atomicxcore.impl.view.call.pip;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.pip.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C40028h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f89035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40032l f89036b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40028h(C40032l c40032l, Continuation continuation) {
        super(2, continuation);
        this.f89036b = c40032l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40028h(this.f89036b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40028h(this.f89036b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f89035a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C40032l c40032l = this.f89036b;
            this.f89035a = 1;
            if (C40032l.m88407a(c40032l, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
