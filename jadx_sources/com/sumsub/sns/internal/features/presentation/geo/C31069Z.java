package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.features.domain.geo.C30215z;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31069Z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62822a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62823b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31120v0 f62824c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31120v0 f62825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31069Z(C31120v0 c31120v0, Continuation continuation, C31120v0 c31120v1) {
        super(2, continuation);
        this.f62824c = c31120v0;
        this.f62825d = c31120v1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31069Z c31069z = new C31069Z(this.f62824c, continuation, this.f62825d);
        c31069z.f62823b = obj;
        return c31069z;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31069Z) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM70142a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62822a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objM70142a = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C30215z c30215z = this.f62825d.f62917c;
                this.f62822a = 1;
                objM70142a = c30215z.m70142a(this);
                if (objM70142a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70142a);
            if (thM103847exceptionOrNullimpl == null) {
                AbstractC28052C.finish$default(this.f62825d, new C28494t(true), null, null, null, 14, null);
            } else {
                C31120v0 c31120v0 = this.f62825d;
                AbstractC28052C.throwError$default(c31120v0, thM103847exceptionOrNullimpl, c31120v0.f62921g.getType().f59014a, null, 4, null);
            }
            this.f62824c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f62824c.showProgress(false);
            throw th2;
        }
    }
}
