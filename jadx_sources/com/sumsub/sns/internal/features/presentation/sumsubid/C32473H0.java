package com.sumsub.sns.internal.features.presentation.sumsubid;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.H0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32473H0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66215a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66217c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32487O0 f66218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32473H0(C32487O0 c32487o0, Continuation continuation, C32487O0 c32487o1) {
        super(2, continuation);
        this.f66217c = c32487o0;
        this.f66218d = c32487o1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32473H0 c32473h0 = new C32473H0(this.f66217c, continuation, this.f66218d);
        c32473h0.f66216b = obj;
        return c32473h0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32473H0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66215a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C32487O0 c32487o0 = this.f66218d;
                this.f66215a = 1;
                if (C32487O0.m71152a(c32487o0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f66217c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f66217c.showProgress(false);
            throw th2;
        }
    }
}
