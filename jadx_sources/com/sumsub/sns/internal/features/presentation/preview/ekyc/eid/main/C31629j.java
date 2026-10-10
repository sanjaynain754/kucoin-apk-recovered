package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.internal.core.analytics.Screen;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31629j {

    /* JADX INFO: renamed from: a */
    public final Screen f64236a;

    /* JADX INFO: renamed from: b */
    public final Map f64237b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31629j)) {
            return false;
        }
        C31629j c31629j = (C31629j) obj;
        return this.f64236a == c31629j.f64236a && Intrinsics.areEqual(this.f64237b, c31629j.f64237b);
    }

    public final int hashCode() {
        return this.f64237b.hashCode() + (this.f64236a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsWrapper(screen=" + this.f64236a + ", payload=" + this.f64237b + ")";
    }

    public C31629j(Screen screen, Map map) {
        this.f64236a = screen;
        this.f64237b = map;
    }
}
