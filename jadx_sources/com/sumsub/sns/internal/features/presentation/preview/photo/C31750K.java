package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.text.Spanned;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31750K extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Spanned f64513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31932u f64514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31750K(Spanned spanned, C31932u c31932u, Continuation continuation) {
        super(2, continuation);
        this.f64513b = spanned;
        this.f64514c = c31932u;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31750K c31750k = new C31750K(this.f64513b, this.f64514c, continuation);
        c31750k.f64512a = obj;
        return c31750k;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31750K) create((C31931t) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C31931t c31931t = (C31931t) this.f64512a;
        C31916p c31916p = c31931t.f64913e;
        C31916p c31916pM70946a = null;
        if (c31916p != null) {
            c31916pM70946a = C31916p.m70946a(c31916p, this.f64513b, null, 62);
        }
        return C31931t.m70949a(c31931t, null, this.f64514c, false, false, c31916pM70946a, 9);
    }
}
