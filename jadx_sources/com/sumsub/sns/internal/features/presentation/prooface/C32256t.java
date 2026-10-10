package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32256t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65713b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32256t(C32109k0 c32109k0, Continuation continuation) {
        super(2, continuation);
        this.f65713b = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32256t(this.f65713b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32256t(this.f65713b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65712a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32109k0 c32109k0 = this.f65713b;
            InterfaceC41634e interfaceC41634eM90887K = C41636g.m90887K(new C32139s(c32109k0.f65370o, null, c32109k0));
            C32127p c32127p = new C32127p(this.f65713b);
            this.f65712a = 1;
            if (interfaceC41634eM90887K.collect(c32127p, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
