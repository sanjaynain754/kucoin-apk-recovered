package com.sumsub.sns.internal.features.presentation.otp;

import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31388p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63609a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31389q f63611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31388p(C31389q c31389q, Continuation continuation) {
        super(2, continuation);
        this.f63611c = c31389q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31388p c31388p = new C31388p(this.f63611c, continuation);
        c31388p.f63610b = obj;
        return c31388p;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31388p c31388p = new C31388p(this.f63611c, (Continuation) obj2);
        c31388p.f63610b = (C31383k) obj;
        return c31388p.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM70702a;
        C31383k c31383k;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63609a;
        if (i11 != 0) {
            if (i11 == 1) {
                c31383k = (C31383k) this.f63610b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31383k c31383k2 = (C31383k) this.f63610b;
            C31389q c31389q = this.f63611c;
            this.f63610b = c31383k2;
            this.f63609a = 1;
            KProperty[] kPropertyArr = C31389q.f63612d;
            C28936t c28936t = c31389q.f63615c;
            KProperty kProperty = C31389q.f63612d[0];
            if (((Number) c28936t.m69705a()).longValue() < System.currentTimeMillis()) {
                objM70702a = c31389q.getString("sns_confirmation_code_action_resend", this);
            } else {
                objM70702a = c31389q.m70702a(this);
            }
            if (objM70702a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c31383k = c31383k2;
            obj = objM70702a;
        }
        String str = (String) obj;
        C31389q c31389q2 = this.f63611c;
        KProperty[] kPropertyArr2 = C31389q.f63612d;
        C28936t c28936t2 = c31389q2.f63615c;
        KProperty kProperty2 = C31389q.f63612d[0];
        if (((Number) c28936t2.m69705a()).longValue() < System.currentTimeMillis()) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new C31383k(c31383k.f63591c, c31383k.f63589a, c31383k.f63590b, str, c31383k.f63594f, z11);
    }
}
