package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31060P extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f62796a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f62797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31120v0 f62798c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29983l f62799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31060P(C29983l c29983l, C31120v0 c31120v0, Continuation continuation) {
        super(3, continuation);
        this.f62798c = c31120v0;
        this.f62799d = c29983l;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C31120v0 c31120v0 = this.f62798c;
        C31060P c31060p = new C31060P(this.f62799d, c31120v0, (Continuation) obj3);
        c31060p.f62796a = iIntValue;
        c31060p.f62797b = iIntValue2;
        return c31060p.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i11 = this.f62796a;
        int i12 = this.f62797b;
        boolean z11 = true;
        if (i11 < 2 && i12 <= 1) {
            z11 = false;
        }
        String str = "";
        if (!this.f62798c.f62933s) {
            String strM70061a = this.f62799d.m70061a("sns_geolocation_action_uploadDocument");
            if (strM70061a != null) {
                str = strM70061a;
            }
            return new C31124x0(str, C31048F0.f62757a);
        }
        if (z11) {
            String strM70061a2 = this.f62799d.m70061a("sns_geolocation_action_cannotShare");
            if (strM70061a2 != null) {
                str = strM70061a2;
            }
            return new C31124x0(str, C31042C0.f62743a);
        }
        return null;
    }
}
