package com.sumsub.sns.internal.core.common;

import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28406M extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC41634e f57909b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f57910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28406M(Continuation continuation, Function2 function2, InterfaceC41634e interfaceC41634e) {
        super(2, continuation);
        this.f57909b = interfaceC41634e;
        this.f57910c = function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28406M(continuation, this.f57910c, this.f57909b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28406M((Continuation) obj2, this.f57910c, this.f57909b).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57908a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634e = this.f57909b;
            C28419T c28419t = new C28419T(this.f57910c);
            this.f57908a = 1;
            if (interfaceC41634e.collect(c28419t, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
