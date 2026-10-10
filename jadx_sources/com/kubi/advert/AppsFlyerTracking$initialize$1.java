package com.kubi.advert;

import android.os.SystemClock;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AppsFlyerTracking.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class AppsFlyerTracking$initialize$1 extends FunctionReferenceImpl implements Function0<Long> {
    public static final AppsFlyerTracking$initialize$1 INSTANCE = new AppsFlyerTracking$initialize$1();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p852kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }

    public AppsFlyerTracking$initialize$1() {
        super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
    }
}
