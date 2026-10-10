package com.kubi.advert;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppsFlyerTracking.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class AppsFlyerTracking$initialize$3$1 extends FunctionReferenceImpl implements Function1<AppsFlyerTracking.TrackingEvent, Unit> {
    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AppsFlyerTracking.TrackingEvent trackingEvent) {
        invoke2(trackingEvent);
        return Unit.INSTANCE;
    }

    public AppsFlyerTracking$initialize$3$1(Object obj) {
        super(1, obj, AppsFlyerTracking.class, "enqueueTrackingEvent", "enqueueTrackingEvent(Lcom/kubi/advert/AppsFlyerTracking$TrackingEvent;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AppsFlyerTracking.TrackingEvent p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        ((AppsFlyerTracking) this.receiver).m14731j(p11);
    }
}
