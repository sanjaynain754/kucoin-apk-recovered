package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import java.util.ArrayList;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31703f0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public String f64330a;

    /* JADX INFO: renamed from: b */
    public int f64331b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f64332c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31707h0 f64333d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f64334e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ArrayList f64335f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C31540b f64336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31703f0(C31707h0 c31707h0, String str, ArrayList arrayList, C31540b c31540b, Continuation continuation) {
        super(2, continuation);
        this.f64333d = c31707h0;
        this.f64334e = str;
        this.f64335f = arrayList;
        this.f64336g = c31540b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31703f0 c31703f0 = new C31703f0(this.f64333d, this.f64334e, this.f64335f, this.f64336g, continuation);
        c31703f0.f64332c = obj;
        return c31703f0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31703f0) create((AbstractC31514B) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31732v c31732v;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64331b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    String str2 = this.f64330a;
                    c31732v = (C31732v) this.f64332c;
                    ResultKt.throwOnFailure(obj);
                    str = str2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            String str3 = (String) obj;
            C31732v c31732v2 = c31732v;
            return new C31732v(c31732v2.f64448a, c31732v2.f64449b, str3, c31732v2.f64451d, c31732v2.f64452e, str, this.f64334e, this.f64335f, this.f64336g);
        }
        ResultKt.throwOnFailure(obj);
        AbstractC31514B abstractC31514B = (AbstractC31514B) this.f64332c;
        C31707h0 c31707h0 = this.f64333d;
        this.f64331b = 1;
        KProperty[] kPropertyArr = C31707h0.f64357D;
        if (abstractC31514B instanceof C31732v) {
            obj = (C31732v) abstractC31514B;
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = c31707h0.m70816b(this);
        }
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        c31732v = (C31732v) obj;
        C31707h0 c31707h1 = this.f64333d;
        KProperty[] kPropertyArr2 = C31707h0.f64357D;
        String strM70823f = c31707h1.m70823f();
        C31707h0 c31707h2 = this.f64333d;
        this.f64332c = c31732v;
        this.f64330a = strM70823f;
        this.f64331b = 2;
        Object string = c31707h2.getString("sns_ekyc_action_continue", this);
        if (string != coroutine_suspended) {
            str = strM70823f;
            obj = string;
            String str4 = (String) obj;
            C31732v c31732v3 = c31732v;
            return new C31732v(c31732v3.f64448a, c31732v3.f64449b, str4, c31732v3.f64451d, c31732v3.f64452e, str, this.f64334e, this.f64335f, this.f64336g);
        }
        return coroutine_suspended;
    }
}
