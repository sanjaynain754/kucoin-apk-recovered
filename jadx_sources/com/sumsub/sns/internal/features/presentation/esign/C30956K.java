package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.model.esign.C29757c;
import com.sumsub.sns.internal.features.data.model.esign.C29783s;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30956K extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public String f62545a;

    /* JADX INFO: renamed from: b */
    public C29783s f62546b;

    /* JADX INFO: renamed from: c */
    public int f62547c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f62548d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30997n0 f62549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30956K(C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62549e = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30956K c30956k = new C30956K(this.f62549e, continuation);
        c30956k.f62548d = obj;
        return c30956k;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30956K c30956k = new C30956K(this.f62549e, (Continuation) obj2);
        c30956k.f62548d = (C31014x) obj;
        return c30956k.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        C29783s c29783s;
        C31014x c31014x;
        C29783s c29783s2;
        String str2;
        C29757c c29757c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62547c;
        if (i11 != 0) {
            if (i11 == 1) {
                c29783s2 = this.f62546b;
                str2 = this.f62545a;
                c31014x = (C31014x) this.f62548d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31014x c31014x2 = (C31014x) this.f62548d;
            C30997n0 c30997n0 = this.f62549e;
            C29752Y c29752y = c30997n0.f62653m;
            if (c29752y != null) {
                str = c29752y.f59827c;
            } else {
                str = null;
            }
            if (c29752y != null && (c29757c = c29752y.f59829e) != null) {
                c29783s = c29757c.f59832b;
            } else {
                c29783s = null;
            }
            this.f62548d = c31014x2;
            this.f62545a = str;
            this.f62546b = c29783s;
            this.f62547c = 1;
            Object string = c30997n0.getString("sns_confirmation_code_isNotValid", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            c31014x = c31014x2;
            obj = string;
            c29783s2 = c29783s;
            str2 = str;
        }
        return C31014x.m70560a(c31014x, new C31010u(str2, c29783s2, (String) obj), false, null, false, 14);
    }
}
