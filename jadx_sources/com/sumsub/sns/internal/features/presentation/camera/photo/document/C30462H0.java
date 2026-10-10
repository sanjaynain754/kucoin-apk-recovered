package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.core.presentation.camera.AbstractC28738e;
import com.sumsub.sns.internal.core.presentation.camera.C28734c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.H0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30462H0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61417a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30444C2 f61418b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC28738e f61419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30462H0(C30444C2 c30444c2, AbstractC28738e abstractC28738e, Continuation continuation) {
        super(2, continuation);
        this.f61418b = c30444c2;
        this.f61419c = abstractC28738e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30462H0(this.f61418b, this.f61419c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30462H0(this.f61418b, this.f61419c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61417a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30444C2 c30444c2 = this.f61418b;
            C28734c c28734c = (C28734c) this.f61419c;
            this.f61417a = 1;
            if (C30444C2.m70320a(c30444c2, c28734c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
