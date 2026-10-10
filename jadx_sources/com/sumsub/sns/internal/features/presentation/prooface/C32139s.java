package com.sumsub.sns.internal.features.presentation.prooface;

import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32139s extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65423a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC41634e f65425c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32109k0 f65426d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32139s(InterfaceC41634e interfaceC41634e, Continuation continuation, C32109k0 c32109k0) {
        super(2, continuation);
        this.f65425c = interfaceC41634e;
        this.f65426d = c32109k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32139s c32139s = new C32139s(this.f65425c, continuation, this.f65426d);
        c32139s.f65424b = obj;
        return c32139s;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32139s) create((InterfaceC41635f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65423a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.f65424b;
            InterfaceC41634e interfaceC41634e = this.f65425c;
            C32135r c32135r = new C32135r(interfaceC41635f, this.f65426d);
            this.f65423a = 1;
            if (interfaceC41634e.collect(c32135r, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
