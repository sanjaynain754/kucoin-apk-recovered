package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Screen;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32424g extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32435m f66093b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32424g(C32435m c32435m, Continuation continuation) {
        super(2, continuation);
        this.f66093b = c32435m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32424g c32424g = new C32424g(this.f66093b, continuation);
        c32424g.f66092a = obj;
        return c32424g;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32424g c32424g = new C32424g(this.f66093b, (Continuation) obj2);
        c32424g.f66092a = (C32438n) obj;
        return c32424g.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C32438n c32438n = (C32438n) this.f66092a;
        C32435m c32435m = this.f66093b;
        SNSApplicantStatusAnalyticsState sNSApplicantStatusAnalyticsState = c32435m.f66121l;
        SNSApplicantStatusAnalyticsState sNSApplicantStatusAnalyticsState2 = c32438n.f66127a;
        if (sNSApplicantStatusAnalyticsState != sNSApplicantStatusAnalyticsState2) {
            c32435m.f66121l = sNSApplicantStatusAnalyticsState2;
            C28367f analyticsDelegate = c32435m.getAnalyticsDelegate();
            Screen f65153b = c32435m.getF65005b();
            String str = c32435m.f66111b;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("screenState", c32435m.f66121l.getState());
            C28367f.m69259a(analyticsDelegate, f65153b, str, MapsKt.build(mapCreateMapBuilder), 8);
        }
        return Unit.INSTANCE;
    }
}
