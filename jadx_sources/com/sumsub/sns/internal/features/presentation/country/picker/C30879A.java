package com.sumsub.sns.internal.features.presentation.country.picker;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30879A extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f62375a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f62376b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f62377c;

    public C30879A(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C30879A c30879a = new C30879A((Continuation) obj3);
        c30879a.f62376b = (InterfaceC41635f) obj;
        c30879a.f62377c = obj2;
        return c30879a.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62375a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f62376b;
            InterfaceC41669n interfaceC41669n = ((C30891d) this.f62377c).f62410h;
            this.f62375a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41669n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
