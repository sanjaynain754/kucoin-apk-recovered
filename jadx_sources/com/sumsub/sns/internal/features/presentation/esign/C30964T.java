package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.model.esign.C29757c;
import com.sumsub.sns.internal.features.data.model.esign.C29783s;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30964T extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30997n0 f62572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f62573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30964T(int i11, C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62572b = c30997n0;
        this.f62573c = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30964T c30964t = new C30964T(this.f62573c, this.f62572b, continuation);
        c30964t.f62571a = obj;
        return c30964t;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30964T) create((C31014x) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        C29783s c29783s;
        C29757c c29757c;
        C29783s c29783s2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C31014x c31014x = (C31014x) this.f62571a;
        C29752Y c29752y = this.f62572b.f62653m;
        if (c29752y != null) {
            str = c29752y.f59827c;
        } else {
            str = null;
        }
        if (c29752y != null && (c29757c = c29752y.f59829e) != null && (c29783s2 = c29757c.f59832b) != null) {
            c29783s = new C29783s(c29783s2.f59852a, c29783s2.f59853b, Boxing.boxInt(this.f62573c), c29783s2.f59855d);
        } else {
            c29783s = null;
        }
        C31010u c31010u = new C31010u(str, c29783s, null);
        C30997n0 c30997n0 = this.f62572b;
        Screen screenM70556e = Screen.OtpConfirmationScreen;
        if (screenM70556e == null) {
            screenM70556e = c30997n0.m70556e();
        }
        return C31014x.m70560a(c31014x, c31010u, false, new C30988j(screenM70556e, MapsKt.emptyMap()), false, 6);
    }
}
