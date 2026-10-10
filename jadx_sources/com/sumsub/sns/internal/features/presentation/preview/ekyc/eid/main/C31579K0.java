package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.internal.features.domain.ekyc.C30163f;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.SNSEidExceptionReason;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.K0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31579K0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31583M0 f64127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SNSEidExceptionReason f64128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31579K0(C31583M0 c31583m0, SNSEidExceptionReason sNSEidExceptionReason, Continuation continuation) {
        super(2, continuation);
        this.f64127b = c31583m0;
        this.f64128c = sNSEidExceptionReason;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31579K0(this.f64127b, this.f64128c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31579K0(this.f64127b, this.f64128c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64126a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30163f c30163f = this.f64127b.f64141d;
            String code = this.f64128c.getCode();
            this.f64126a = 1;
            if (c30163f.m70125a(code, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
