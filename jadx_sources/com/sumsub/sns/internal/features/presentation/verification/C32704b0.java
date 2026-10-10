package com.sumsub.sns.internal.features.presentation.verification;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32704b0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32720j0 f66886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29570k0 f66887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32704b0(C32720j0 c32720j0, C29570k0 c29570k0, Continuation continuation) {
        super(2, continuation);
        this.f66886b = c32720j0;
        this.f66887c = c29570k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32704b0(this.f66886b, this.f66887c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32704b0(this.f66886b, this.f66887c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66885a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32720j0 c32720j0 = this.f66886b;
            C29570k0 c29570k0 = this.f66887c;
            this.f66885a = 1;
            KProperty[] kPropertyArr = C32720j0.f66932t;
            if (c32720j0.m71310b(c29570k0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
