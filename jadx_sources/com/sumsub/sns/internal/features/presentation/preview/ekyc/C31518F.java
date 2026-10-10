package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.io.Serializable;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31518F extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31736z f63947a;

    /* JADX INFO: renamed from: b */
    public C29456A0 f63948b;

    /* JADX INFO: renamed from: c */
    public Serializable f63949c;

    /* JADX INFO: renamed from: d */
    public int f63950d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31707h0 f63951e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Exception f63952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31518F(C31707h0 c31707h0, Exception exc, Continuation continuation) {
        super(2, continuation);
        this.f63951e = c31707h0;
        this.f63952f = exc;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31518F(this.f63951e, this.f63952f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31518F(this.f63951e, this.f63952f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31736z c31736z;
        C29456A0 c29456a0;
        Throwable th2;
        String strM69377a;
        Object string;
        String str;
        C29456A0 c29456a1;
        C31736z c31736z2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63950d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        String str2 = (String) this.f63949c;
                        C29456A0 c29456a2 = this.f63948b;
                        C31736z c31736z3 = this.f63947a;
                        ResultKt.throwOnFailure(obj);
                        str = str2;
                        c31736z2 = c31736z3;
                        c29456a1 = c29456a2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    th2 = (Throwable) this.f63949c;
                    c29456a0 = this.f63948b;
                    c31736z = this.f63947a;
                    ResultKt.throwOnFailure(obj);
                    strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                    C31707h0 c31707h0 = this.f63951e;
                    this.f63947a = c31736z;
                    this.f63948b = c29456a0;
                    this.f63949c = strM69377a;
                    this.f63950d = 3;
                    string = c31707h0.getString("sns_confirmation_code_action_resend", this);
                    if (string != coroutine_suspended) {
                        str = strM69377a;
                        obj = string;
                        c29456a1 = c29456a0;
                        c31736z2 = c31736z;
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return C31736z.m70852a(c31736z2, (String) obj, str, 0L, c29456a1, 3);
        }
        ResultKt.throwOnFailure(obj);
        C31707h0 c31707h1 = this.f63951e;
        this.f63950d = 1;
        KProperty[] kPropertyArr = C31707h0.f64357D;
        obj = c31707h1.m70818c(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C31736z c31736z4 = (C31736z) obj;
        C28936t c28936t = this.f63951e.f64377w;
        KProperty kProperty = C31707h0.f64357D[2];
        C29456A0 c29456a3 = (C29456A0) c28936t.m69705a();
        Exception exc = this.f63952f;
        C31707h0 c31707h2 = this.f63951e;
        this.f63947a = c31736z4;
        this.f63948b = c29456a3;
        this.f63949c = exc;
        this.f63950d = 2;
        Object strings = c31707h2.getStrings(this);
        if (strings != coroutine_suspended) {
            c31736z = c31736z4;
            obj = strings;
            c29456a0 = c29456a3;
            th2 = exc;
            strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
            C31707h0 c31707h3 = this.f63951e;
            this.f63947a = c31736z;
            this.f63948b = c29456a0;
            this.f63949c = strM69377a;
            this.f63950d = 3;
            string = c31707h3.getString("sns_confirmation_code_action_resend", this);
            if (string != coroutine_suspended) {
                str = strM69377a;
                obj = string;
                c29456a1 = c29456a0;
                c31736z2 = c31736z;
                return C31736z.m70852a(c31736z2, (String) obj, str, 0L, c29456a1, 3);
            }
        }
        return coroutine_suspended;
    }
}
