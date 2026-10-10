package com.sumsub.sns.internal.features.presentation.prooface.session;

import kotlinx.coroutines.flow.InterfaceC41668m;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.O0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32172O0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32202c1 f65516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32172O0(C32202c1 c32202c1, Continuation continuation) {
        super(2, continuation);
        this.f65516b = c32202c1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32172O0(this.f65516b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32172O0(this.f65516b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65515a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41668m interfaceC41668m = this.f65516b.f65590m;
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            this.f65515a = 1;
            if (interfaceC41668m.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
