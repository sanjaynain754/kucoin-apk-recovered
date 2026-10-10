package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.session.C32239r0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.W1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32049W1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32239r0 f65201b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32072c2 f65202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32049W1(C32239r0 c32239r0, C32072c2 c32072c2, Continuation continuation) {
        super(2, continuation);
        this.f65201b = c32239r0;
        this.f65202c = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32049W1(this.f65201b, this.f65202c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32049W1(this.f65201b, this.f65202c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65200a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32046V1 c32046v1 = new C32046V1(this.f65201b.f65689g);
            this.f65200a = 1;
            if (C41636g.m90882F(c32046v1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f65202c.f65278u;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        return Unit.INSTANCE;
    }
}
