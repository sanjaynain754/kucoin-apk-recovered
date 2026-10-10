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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30902n extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f62429a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f62430b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f62431c;

    public C30902n(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C30902n c30902n = new C30902n((Continuation) obj3);
        c30902n.f62430b = (InterfaceC41635f) obj;
        c30902n.f62431c = obj2;
        return c30902n.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62429a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f62430b;
            InterfaceC41669n interfaceC41669n = ((C30891d) this.f62431c).f62410h;
            this.f62429a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41669n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
