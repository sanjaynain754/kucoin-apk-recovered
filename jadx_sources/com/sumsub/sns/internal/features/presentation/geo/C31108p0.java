package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.p0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31108p0 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31120v0 f62896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29983l f62897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31108p0(C29983l c29983l, C31120v0 c31120v0, Continuation continuation) {
        super(1, continuation);
        this.f62896a = c31120v0;
        this.f62897b = c29983l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C31108p0(this.f62897b, this.f62896a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C31120v0 c31120v0 = this.f62896a;
        return new C31108p0(this.f62897b, c31120v0, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = "";
        if (this.f62896a.f62933s) {
            String strM70061a = this.f62897b.m70061a("sns_geolocation_action_cannotShare");
            if (strM70061a != null) {
                str = strM70061a;
            }
            return new C31124x0(str, C31042C0.f62743a);
        }
        String strM70061a2 = this.f62897b.m70061a("sns_geolocation_action_uploadDocument");
        if (strM70061a2 != null) {
            str = strM70061a2;
        }
        return new C31124x0(str, C31048F0.f62757a);
    }
}
