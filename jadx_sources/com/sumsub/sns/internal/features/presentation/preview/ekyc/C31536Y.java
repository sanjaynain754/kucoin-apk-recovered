package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31536Y extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public String f64021a;

    /* JADX INFO: renamed from: b */
    public String f64022b;

    /* JADX INFO: renamed from: c */
    public boolean f64023c;

    /* JADX INFO: renamed from: d */
    public int f64024d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f64025e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f64026f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f64027g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C31707h0 f64028h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31536Y(String str, String str2, boolean z11, C31707h0 c31707h0, Continuation continuation) {
        super(2, continuation);
        this.f64025e = str;
        this.f64026f = str2;
        this.f64027g = z11;
        this.f64028h = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31536Y(this.f64025e, this.f64026f, this.f64027g, this.f64028h, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31536Y) create((AbstractC31514B) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64024d;
        if (i11 != 0) {
            if (i11 == 1) {
                z11 = this.f64023c;
                str = this.f64022b;
                str2 = this.f64021a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String str3 = this.f64025e;
            str = this.f64026f;
            boolean z12 = this.f64027g;
            C31707h0 c31707h0 = this.f64028h;
            this.f64021a = str3;
            this.f64022b = str;
            this.f64023c = z12;
            this.f64024d = 1;
            Object string = c31707h0.getString("sns_ekyc_external_browser", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str3;
            obj = string;
            z11 = z12;
        }
        return new C31735y(str2, str, z11, (String) obj);
    }
}
