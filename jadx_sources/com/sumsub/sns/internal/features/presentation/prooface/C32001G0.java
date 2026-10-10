package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.flow.C41636g;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.G0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32001G0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65052a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32072c2 f65053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32001G0(C32072c2 c32072c2, Continuation continuation) {
        super(2, continuation);
        this.f65053b = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32001G0(this.f65053b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32001G0(this.f65053b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65052a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32102i2 c32102i2 = this.f65053b.f65262e;
            this.f65052a = 1;
            Object objM90882F = C41636g.m90882F(new C32092g2(C41636g.m90892P(((C29967J) c32102i2.f65333a).f60201i, new C32097h2(null))), this);
            if (objM90882F != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM90882F = Unit.INSTANCE;
            }
            if (objM90882F == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC32267d.m71078a("ViewModel: Selfie already submitted, aborting liveness check");
        AbstractC28052C.finish$default(this.f65053b, new C28494t(), null, null, null, 14, null);
        return Unit.INSTANCE;
    }
}
