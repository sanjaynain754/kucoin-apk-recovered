package com.sumsub.sns.internal.features.presentation.verification2.email;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32798t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f67122a;

    /* JADX INFO: renamed from: b */
    public int f67123b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32774D f67124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32798t(C32774D c32774d, Continuation continuation) {
        super(2, continuation);
        this.f67124c = c32774d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32798t(this.f67124c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32798t(this.f67124c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41669n interfaceC41669n;
        C32790l c32790l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67123b;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41669n = this.f67122a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32774D c32774d = this.f67124c;
            InterfaceC41669n interfaceC41669n2 = c32774d.f67079d;
            this.f67122a = interfaceC41669n2;
            this.f67123b = 1;
            obj = c32774d.getString("sns_confirmation_contact_email_isNotValid", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41669n = interfaceC41669n2;
        }
        String str = (String) obj;
        if (str != null) {
            c32790l = new C32790l(str);
        } else {
            c32790l = null;
        }
        interfaceC41669n.setValue(c32790l);
        return Unit.INSTANCE;
    }
}
