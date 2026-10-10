package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31543c0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64046a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f64047b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31707h0 f64048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31543c0(C31707h0 c31707h0, Continuation continuation) {
        super(2, continuation);
        this.f64048c = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31543c0 c31543c0 = new C31543c0(this.f64048c, continuation);
        c31543c0.f64047b = obj;
        return c31543c0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31543c0 c31543c0 = new C31543c0(this.f64048c, (Continuation) obj2);
        c31543c0.f64047b = (AbstractC31514B) obj;
        return c31543c0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31736z c31736z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64046a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    c31736z = (C31736z) this.f64047b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return C31736z.m70852a(c31736z, (CharSequence) obj, null, 0L, null, 59);
        }
        ResultKt.throwOnFailure(obj);
        AbstractC31514B abstractC31514B = (AbstractC31514B) this.f64047b;
        C31707h0 c31707h0 = this.f64048c;
        this.f64046a = 1;
        KProperty[] kPropertyArr = C31707h0.f64357D;
        if (abstractC31514B instanceof C31736z) {
            obj = (C31736z) abstractC31514B;
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = c31707h0.m70818c(this);
        }
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C31736z c31736z2 = (C31736z) obj;
        C31707h0 c31707h1 = this.f64048c;
        this.f64047b = c31736z2;
        this.f64046a = 2;
        Object string = c31707h1.getString("sns_confirmation_code_action_resend", this);
        if (string != coroutine_suspended) {
            c31736z = c31736z2;
            obj = string;
            return C31736z.m70852a(c31736z, (CharSequence) obj, null, 0L, null, 59);
        }
        return coroutine_suspended;
    }
}
