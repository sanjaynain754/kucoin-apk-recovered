package com.sumsub.sns.internal.features.data.repository.dynamic;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29961D extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60171a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60172b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29967J f60173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29961D(C29967J c29967j, Continuation continuation) {
        super(2, continuation);
        this.f60173c = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C29961D c29961d = new C29961D(this.f60173c, continuation);
        c29961d.f60172b = obj;
        return c29961d;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C29961D c29961d = new C29961D(this.f60173c, (Continuation) obj2);
        c29961d.f60172b = (InterfaceC41709m0) obj;
        return c29961d.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60171a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f60172b;
            C29967J c29967j = this.f60173c;
            this.f60171a = 1;
            if (C29967J.m70038a(c29967j, interfaceC41709m0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
