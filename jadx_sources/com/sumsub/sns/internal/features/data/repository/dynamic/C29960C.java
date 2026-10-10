package com.sumsub.sns.internal.features.data.repository.dynamic;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29960C extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60168a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29967J f60170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29960C(C29967J c29967j, Continuation continuation) {
        super(2, continuation);
        this.f60170c = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C29960C c29960c = new C29960C(this.f60170c, continuation);
        c29960c.f60169b = obj;
        return c29960c;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C29960C c29960c = new C29960C(this.f60170c, (Continuation) obj2);
        c29960c.f60169b = (InterfaceC41709m0) obj;
        return c29960c.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60168a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f60169b;
            C29967J c29967j = this.f60170c;
            this.f60168a = 1;
            if (C29967J.m70038a(c29967j, interfaceC41709m0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
