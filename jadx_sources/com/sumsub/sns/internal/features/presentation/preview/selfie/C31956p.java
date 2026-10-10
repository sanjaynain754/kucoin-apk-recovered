package com.sumsub.sns.internal.features.presentation.preview.selfie;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29083a0;
import com.sumsub.sns.internal.features.data.model.common.C29074Y;
import com.sumsub.sns.internal.features.data.model.common.C29078Z;
import com.sumsub.sns.internal.features.domain.AbstractC30223k0;
import com.sumsub.sns.internal.features.domain.C30313t0;
import com.sumsub.sns.internal.features.domain.C30319v0;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31956p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31957q f64985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f64986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31956p(C31957q c31957q, File file, Continuation continuation) {
        super(2, continuation);
        this.f64985b = c31957q;
        this.f64986c = file;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31956p(this.f64985b, this.f64986c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31956p(this.f64985b, this.f64986c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64984a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31957q c31957q = this.f64985b;
            C30319v0 c30319v0 = c31957q.f64988g;
            C30313t0 c30313t0 = new C30313t0(c31957q.f64476a, this.f64986c, (String) c31957q.f64477b.get("KEY_PHRASE"));
            this.f64984a = 1;
            c30319v0.getClass();
            obj = AbstractC30223k0.m70145a(c30319v0, c30313t0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC29083a0 abstractC29083a0 = (AbstractC29083a0) obj;
        C31957q c31957q2 = this.f64985b;
        abstractC29083a0.getClass();
        if (abstractC29083a0 instanceof C29078Z) {
            KProperty[] kPropertyArr = C31957q.f64987j;
            c31957q2.m70963e();
        } else if (abstractC29083a0 instanceof C29074Y) {
            Exception exc = (Exception) ((C29074Y) abstractC29083a0).f59016a;
            KProperty[] kPropertyArr2 = C31957q.f64987j;
            C33272c.f67816e.f67810a.mo68955d("SumSubVideoSelfie", "An error while uploading video selfie", exc);
            c31957q2.showProgress(false);
            AbstractC28052C.throwError$default(c31957q2, exc, c31957q2.f64476a.getType().f59014a, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
