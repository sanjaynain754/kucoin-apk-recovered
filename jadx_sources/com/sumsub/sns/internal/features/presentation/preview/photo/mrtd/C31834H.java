package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.nfc.InterfaceC28898c;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31834H extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31868f0 f64695a;

    /* JADX INFO: renamed from: b */
    public int f64696b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31868f0 f64697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31834H(C31868f0 c31868f0, Continuation continuation) {
        super(2, continuation);
        this.f64697c = c31868f0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31834H(this.f64697c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31834H(this.f64697c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31868f0 c31868f0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64696b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    C31868f0 c31868f1 = this.f64695a;
                    ResultKt.throwOnFailure(obj);
                    c31868f0 = c31868f1;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            AbstractC28052C.finish$default(c31868f0, new C28494t(), null, null, null, 14, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41678w interfaceC41678w = this.f64697c.f64768h.f58784k;
        C31833G c31833g = new C31833G(null);
        this.f64696b = 1;
        obj = C41636g.m90885I(interfaceC41678w, c31833g, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        if (((InterfaceC28898c) obj) != null) {
            C31868f0 c31868f2 = this.f64697c;
            this.f64695a = c31868f2;
            this.f64696b = 2;
            if (DelayKt.m90350b(3000L, this) != coroutine_suspended) {
                c31868f0 = c31868f2;
                AbstractC28052C.finish$default(c31868f0, new C28494t(), null, null, null, 14, null);
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
