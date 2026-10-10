package com.sumsub.sns.internal.features.presentation.esign;

import java.util.Arrays;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30960O extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f62562a;

    /* JADX INFO: renamed from: b */
    public Object f62563b;

    /* JADX INFO: renamed from: c */
    public C30998o f62564c;

    /* JADX INFO: renamed from: d */
    public int f62565d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f62566e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C30997n0 f62567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30960O(C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62567f = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30960O c30960o = new C30960O(this.f62567f, continuation);
        c30960o.f62566e = obj;
        return c30960o;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30960O c30960o = new C30960O(this.f62567f, (Continuation) obj2);
        c30960o.f62566e = (C31014x) obj;
        return c30960o.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31014x c31014x;
        AbstractC31000p c30998o;
        C30998o c30998o2;
        C31014x c31014x2;
        String str;
        C30998o c30998o3;
        C31014x c31014x3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62565d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    c30998o3 = this.f62564c;
                    c31014x3 = (C31014x) this.f62563b;
                    str = (String) this.f62562a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                c30998o2 = (C30998o) this.f62563b;
                c31014x2 = (C31014x) this.f62562a;
                c31014x = (C31014x) this.f62566e;
                ResultKt.throwOnFailure(obj);
            }
            C30996n c30996n = new C30996n(null, str, false, (String) obj);
            c30998o3.getClass();
            c30998o = new C30998o(c30996n);
            c31014x = c31014x3;
            return C31014x.m70560a(c31014x, c30998o, false, null, false, 30);
        }
        ResultKt.throwOnFailure(obj);
        c31014x = (C31014x) this.f62566e;
        c30998o = c31014x.f62678a;
        if (c30998o instanceof C30998o) {
            c30998o2 = (C30998o) c30998o;
        } else {
            c30998o2 = null;
        }
        if (c30998o2 != null) {
            C30997n0 c30997n0 = this.f62567f;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("sns_confirmation_result_%s_failure_title", Arrays.copyOf(new Object[]{"esign"}, 1));
            this.f62566e = c31014x;
            this.f62562a = c31014x;
            this.f62563b = c30998o2;
            this.f62565d = 1;
            obj = c30997n0.getString(str2, this);
            if (obj != coroutine_suspended) {
                c31014x2 = c31014x;
            }
            return coroutine_suspended;
        }
        return C31014x.m70560a(c31014x, c30998o, false, null, false, 30);
        String str3 = (String) obj;
        C30997n0 c30997n1 = this.f62567f;
        this.f62566e = c31014x;
        this.f62562a = str3;
        this.f62563b = c31014x2;
        this.f62564c = c30998o2;
        this.f62565d = 2;
        Object string = c30997n1.getString("sns_alert_action_dismiss", this);
        if (string != coroutine_suspended) {
            str = str3;
            obj = string;
            c30998o3 = c30998o2;
            c31014x3 = c31014x2;
            C30996n c30996n2 = new C30996n(null, str, false, (String) obj);
            c30998o3.getClass();
            c30998o = new C30998o(c30996n2);
            c31014x = c31014x3;
            return C31014x.m70560a(c31014x, c30998o, false, null, false, 30);
        }
        return coroutine_suspended;
    }
}
