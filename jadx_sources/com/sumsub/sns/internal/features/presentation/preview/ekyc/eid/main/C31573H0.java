package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.H0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31573H0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f64109a;

    /* JADX INFO: renamed from: b */
    public CharSequence f64110b;

    /* JADX INFO: renamed from: c */
    public int f64111c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31583M0 f64112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31573H0(C31583M0 c31583m0, Continuation continuation) {
        super(2, continuation);
        this.f64112d = c31583m0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31573H0(this.f64112d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31573H0(this.f64112d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64111c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    charSequence2 = this.f64110b;
                    charSequence = this.f64109a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            C31597U c31597u = new C31597U(charSequence, charSequence2, (CharSequence) obj);
            C31583M0 c31583m0 = this.f64112d;
            KProperty[] kPropertyArr = C31583M0.f64136p;
            c31583m0.fireEvent(c31597u);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C31583M0 c31583m1 = this.f64112d;
        this.f64111c = 1;
        obj = c31583m1.getString("sns_eid_serviceInfo_title", this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        charSequence = (CharSequence) obj;
        C28936t c28936t = this.f64112d.f64142e;
        KProperty kProperty = C31583M0.f64136p[0];
        CharSequence charSequence3 = (CharSequence) c28936t.m69705a();
        C31583M0 c31583m2 = this.f64112d;
        this.f64109a = charSequence;
        this.f64110b = charSequence3;
        this.f64111c = 2;
        Object string = c31583m2.getString("sns_alert_action_dismiss", this);
        if (string != coroutine_suspended) {
            charSequence2 = charSequence3;
            obj = string;
            C31597U c31597u2 = new C31597U(charSequence, charSequence2, (CharSequence) obj);
            C31583M0 c31583m3 = this.f64112d;
            KProperty[] kPropertyArr2 = C31583M0.f64136p;
            c31583m3.fireEvent(c31597u2);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
