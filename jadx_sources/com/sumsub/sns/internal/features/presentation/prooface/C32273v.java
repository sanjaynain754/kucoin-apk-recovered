package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32273v extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32273v(C32109k0 c32109k0, Continuation continuation) {
        super(2, continuation);
        this.f65743b = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32273v(this.f65743b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32273v(this.f65743b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65742a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32109k0 c32109k0 = this.f65743b;
            InterfaceC41669n interfaceC41669n = ((C29967J) c32109k0.f65363h).f60201i;
            C32260u c32260u = new C32260u(c32109k0, null);
            this.f65742a = 1;
            if (C41636g.m90925l(interfaceC41669n, c32260u, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
