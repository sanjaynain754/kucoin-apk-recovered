package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.core.common.AbstractC28476n;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31522J extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C31736z f63966a;

    /* JADX INFO: renamed from: b */
    public Serializable f63967b;

    /* JADX INFO: renamed from: c */
    public int f63968c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31707h0 f63969d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Exception f63970e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C29456A0 f63971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31522J(C31707h0 c31707h0, Exception exc, C29456A0 c29456a0, Continuation continuation) {
        super(2, continuation);
        this.f63969d = c31707h0;
        this.f63970e = exc;
        this.f63971f = c29456a0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31522J(this.f63969d, this.f63970e, this.f63971f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31522J) create((AbstractC31514B) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        C31736z c31736z;
        String strM69377a;
        Object string;
        String str;
        C31736z c31736z2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63968c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        String str2 = (String) this.f63967b;
                        C31736z c31736z3 = this.f63966a;
                        ResultKt.throwOnFailure(obj);
                        str = str2;
                        c31736z2 = c31736z3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    th2 = (Throwable) this.f63967b;
                    c31736z = this.f63966a;
                    ResultKt.throwOnFailure(obj);
                    strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                    C31707h0 c31707h0 = this.f63969d;
                    this.f63966a = c31736z;
                    this.f63967b = strM69377a;
                    this.f63968c = 3;
                    string = c31707h0.getString("sns_confirmation_code_action_resend", this);
                    if (string != coroutine_suspended) {
                        str = strM69377a;
                        obj = string;
                        c31736z2 = c31736z;
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return C31736z.m70852a(c31736z2, (String) obj, str, 0L, this.f63971f, 3);
        }
        ResultKt.throwOnFailure(obj);
        C31707h0 c31707h1 = this.f63969d;
        this.f63968c = 1;
        KProperty[] kPropertyArr = C31707h0.f64357D;
        obj = c31707h1.m70818c(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C31736z c31736z4 = (C31736z) obj;
        th2 = this.f63970e;
        C31707h0 c31707h2 = this.f63969d;
        this.f63966a = c31736z4;
        this.f63967b = th2;
        this.f63968c = 2;
        Object strings = c31707h2.getStrings(this);
        if (strings != coroutine_suspended) {
            c31736z = c31736z4;
            obj = strings;
            strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
            C31707h0 c31707h3 = this.f63969d;
            this.f63966a = c31736z;
            this.f63967b = strM69377a;
            this.f63968c = 3;
            string = c31707h3.getString("sns_confirmation_code_action_resend", this);
            if (string != coroutine_suspended) {
                str = strM69377a;
                obj = string;
                c31736z2 = c31736z;
                return C31736z.m70852a(c31736z2, (String) obj, str, 0L, this.f63971f, 3);
            }
        }
        return coroutine_suspended;
    }
}
