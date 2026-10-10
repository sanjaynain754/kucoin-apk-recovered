package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31815s extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31816t f64648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31815s(C31816t c31816t, Continuation continuation) {
        super(2, continuation);
        this.f64648b = c31816t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31815s(this.f64648b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31815s(this.f64648b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM71222a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64647a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31801e c31801e = this.f64648b.f64651n;
            this.f64647a = 1;
            C30316a c30316a = c31801e.f66617i;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "restartStep", null);
            if (c31801e.f66620l.m71283a() == IdentitySide.Front) {
                objM71222a = c31801e.m70880a(false, (ContinuationImpl) this);
                if (objM71222a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM71222a = Unit.INSTANCE;
                }
            } else {
                objM71222a = C32635M.m71222a(c31801e, (C29054T) null, this);
                if (objM71222a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM71222a = Unit.INSTANCE;
                }
            }
            if (objM71222a == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
