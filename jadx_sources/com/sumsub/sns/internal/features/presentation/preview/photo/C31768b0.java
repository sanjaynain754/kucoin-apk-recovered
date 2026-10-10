package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31768b0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f64554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31768b0(int i11, Continuation continuation) {
        super(2, continuation);
        this.f64554b = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31768b0 c31768b0 = new C31768b0(this.f64554b, continuation);
        c31768b0.f64553a = obj;
        return c31768b0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31768b0 c31768b0 = new C31768b0(this.f64554b, (Continuation) obj2);
        c31768b0.f64553a = (C31931t) obj;
        return c31768b0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31915o c31915o;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C31931t c31931t = (C31931t) this.f64553a;
        C31916p c31916p = c31931t.f64913e;
        C31916p c31916pM70946a = null;
        if (c31916p != null) {
            C31915o c31915o2 = c31916p.f64884f;
            if (c31915o2 != null) {
                c31915o = new C31915o(this.f64554b, c31915o2.f64877a);
            } else {
                c31915o = null;
            }
            c31916pM70946a = C31916p.m70946a(c31916p, null, c31915o, 31);
        }
        return C31931t.m70949a(c31931t, null, null, false, false, c31916pM70946a, 15);
    }
}
