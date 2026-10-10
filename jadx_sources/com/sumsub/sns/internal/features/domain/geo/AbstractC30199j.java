package com.sumsub.sns.internal.features.domain.geo;

import android.location.Location;
import android.os.Build;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30199j {
    /* JADX INFO: renamed from: a */
    public static final boolean m70135a(Location location) {
        if (location == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider();
    }
}
