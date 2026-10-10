package com.sumsub.sns.internal.features.presentation.prooface.session;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32161J extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32169N f65482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32168M0 f65483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32161J(C32169N c32169n, C32168M0 c32168m0, Continuation continuation) {
        super(2, continuation);
        this.f65482b = c32169n;
        this.f65483c = c32168m0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32161J(this.f65482b, this.f65483c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32161J(this.f65482b, this.f65483c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65481a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n interfaceC41669n = this.f65482b.f65507l;
            C32168M0 c32168m0 = this.f65483c;
            this.f65481a = 1;
            if (interfaceC41669n.emit(c32168m0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
