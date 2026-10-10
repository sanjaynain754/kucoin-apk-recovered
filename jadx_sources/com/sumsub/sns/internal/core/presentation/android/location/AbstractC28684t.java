package com.sumsub.sns.internal.core.presentation.android.location;

import android.content.Context;
import android.location.LocationManager;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationManagerCompat;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28684t {
    /* JADX INFO: renamed from: a */
    public static Function0 m69499a(Context context) {
        final LocationManager locationManager = (LocationManager) ContextCompat.getSystemService(context.getApplicationContext(), LocationManager.class);
        return new Function0() { // from class: com.sumsub.sns.internal.core.presentation.android.location.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AbstractC28684t.m69500a(locationManager));
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m69500a(LocationManager locationManager) {
        if (locationManager != null) {
            return LocationManagerCompat.isLocationEnabled(locationManager);
        }
        return false;
    }
}
