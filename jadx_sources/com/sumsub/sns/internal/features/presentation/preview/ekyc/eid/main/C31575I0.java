package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.I0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31575I0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f64113a;

    /* JADX INFO: renamed from: b */
    public int f64114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31583M0 f64115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31575I0(C31583M0 c31583m0, Continuation continuation) {
        super(2, continuation);
        this.f64115c = c31583m0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31575I0(this.f64115c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31575I0(this.f64115c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64114b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    charSequence = this.f64113a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            C31599W c31599w = new C31599W(charSequence, (CharSequence) obj);
            C31583M0 c31583m0 = this.f64115c;
            KProperty[] kPropertyArr = C31583M0.f64136p;
            c31583m0.fireEvent(c31599w);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C31583M0 c31583m1 = this.f64115c;
        this.f64114b = 1;
        obj = c31583m1.getString("sns_eid_pinInfo_text", this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        CharSequence charSequence2 = (CharSequence) obj;
        C31583M0 c31583m2 = this.f64115c;
        this.f64113a = charSequence2;
        this.f64114b = 2;
        Object string = c31583m2.getString("sns_alert_action_dismiss", this);
        if (string != coroutine_suspended) {
            charSequence = charSequence2;
            obj = string;
            C31599W c31599w2 = new C31599W(charSequence, (CharSequence) obj);
            C31583M0 c31583m3 = this.f64115c;
            KProperty[] kPropertyArr2 = C31583M0.f64136p;
            c31583m3.fireEvent(c31599w2);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
