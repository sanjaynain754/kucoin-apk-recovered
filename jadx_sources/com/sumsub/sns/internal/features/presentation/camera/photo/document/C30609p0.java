package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.p126ml.core.AbstractC33329h;
import com.sumsub.sns.internal.p126ml.docdetector.C33353d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.p0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30609p0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30444C2 f61839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30609p0(C30444C2 c30444c2, Continuation continuation) {
        super(2, continuation);
        this.f61839b = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30609p0(this.f61839b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30609p0(this.f61839b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61838a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C33353d c33353d = this.f61839b.f61359m;
            this.f61838a = 1;
            c33353d.getClass();
            if (AbstractC33329h.m71648a((AbstractC33329h) c33353d, (ContinuationImpl) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
