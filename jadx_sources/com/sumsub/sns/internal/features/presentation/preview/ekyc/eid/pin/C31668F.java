package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31668F extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31675M f64272a;

    /* JADX INFO: renamed from: b */
    public int f64273b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31675M f64274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31668F(C31675M c31675m, Continuation continuation) {
        super(2, continuation);
        this.f64274c = c31675m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31668F(this.f64274c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31668F(this.f64274c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31675M c31675m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64273b;
        if (i11 != 0) {
            if (i11 == 1) {
                c31675m = this.f64272a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31675M c31675m2 = this.f64274c;
            KProperty[] kPropertyArr = C31675M.f64290h;
            c31675m2.m70801b((String) null);
            this.f64274c.m70800b(SNSEidPinViewModel$Step.ENTER_NEW_PIN);
            C33272c.f67816e.f67810a.mo68955d("SNSEidPin", "Pins do not match", null);
            C31675M c31675m3 = this.f64274c;
            this.f64272a = c31675m3;
            this.f64273b = 1;
            Object string = c31675m3.getString("sns_eid_error_newPinMismatch_title", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            c31675m = c31675m3;
            obj = string;
        }
        C31698w c31698w = new C31698w((String) obj);
        KProperty[] kPropertyArr2 = C31675M.f64290h;
        c31675m.fireEvent(c31698w);
        return Unit.INSTANCE;
    }
}
