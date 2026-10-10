package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.features.data.model.common.remote.C29412m;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31532U extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31707h0 f64011b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f64012c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f64013d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C29412m f64014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31532U(C31707h0 c31707h0, String str, String str2, C29412m c29412m, Continuation continuation) {
        super(2, continuation);
        this.f64011b = c31707h0;
        this.f64012c = str;
        this.f64013d = str2;
        this.f64014e = c29412m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31532U(this.f64011b, this.f64012c, this.f64013d, this.f64014e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31532U) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64010a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f64011b.showProgress(true);
            this.f64011b.mo70746c(false);
            C31707h0 c31707h0 = this.f64011b;
            String str = this.f64012c;
            String str2 = this.f64013d;
            C29412m c29412m = this.f64014e;
            this.f64010a = 1;
            if (C31707h0.m70804a(c31707h0, str, str2, c29412m, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
