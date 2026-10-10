package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31529Q extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31736z f64001a;

    /* JADX INFO: renamed from: b */
    public String f64002b;

    /* JADX INFO: renamed from: c */
    public int f64003c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31707h0 f64004d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C29456A0 f64005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31529Q(C31707h0 c31707h0, C29456A0 c29456a0, Continuation continuation) {
        super(2, continuation);
        this.f64004d = c31707h0;
        this.f64005e = c29456a0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31529Q(this.f64004d, this.f64005e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31529Q(this.f64004d, this.f64005e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31736z c31736z;
        String str;
        Object string;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64003c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        String str3 = this.f64002b;
                        c31736z = this.f64001a;
                        ResultKt.throwOnFailure(obj);
                        str2 = str3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c31736z = this.f64001a;
                    ResultKt.throwOnFailure(obj);
                    str = (String) obj;
                    if (str == null) {
                        str = "Unknown error";
                    }
                    C31707h0 c31707h0 = this.f64004d;
                    this.f64001a = c31736z;
                    this.f64002b = str;
                    this.f64003c = 3;
                    string = c31707h0.getString("sns_confirmation_code_action_resend", this);
                    if (string != coroutine_suspended) {
                        str2 = str;
                        obj = string;
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return C31736z.m70852a(c31736z, (String) obj, str2, 0L, this.f64005e, 3);
        }
        ResultKt.throwOnFailure(obj);
        C31707h0 c31707h1 = this.f64004d;
        this.f64003c = 1;
        KProperty[] kPropertyArr = C31707h0.f64357D;
        obj = c31707h1.m70818c(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C31736z c31736z2 = (C31736z) obj;
        C31707h0 c31707h2 = this.f64004d;
        this.f64001a = c31736z2;
        this.f64003c = 2;
        Object string2 = c31707h2.getString("sns_confirmation_code_isNotValid", this);
        if (string2 != coroutine_suspended) {
            c31736z = c31736z2;
            obj = string2;
            str = (String) obj;
            if (str == null) {
                str = "Unknown error";
            }
            C31707h0 c31707h3 = this.f64004d;
            this.f64001a = c31736z;
            this.f64002b = str;
            this.f64003c = 3;
            string = c31707h3.getString("sns_confirmation_code_action_resend", this);
            if (string != coroutine_suspended) {
                str2 = str;
                obj = string;
                return C31736z.m70852a(c31736z, (String) obj, str2, 0L, this.f64005e, 3);
            }
        }
        return coroutine_suspended;
    }
}
