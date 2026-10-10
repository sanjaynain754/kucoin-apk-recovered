package com.sumsub.sns.internal.p126ml.badphotos;

import com.sumsub.sentry.android.AbstractC27920h;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.badphotos.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33318e {

    /* JADX INFO: renamed from: a */
    public final String f67936a;

    /* JADX INFO: renamed from: b */
    public final float f67937b;

    /* JADX INFO: renamed from: c */
    public final float f67938c;

    /* JADX INFO: renamed from: d */
    public final long f67939d;

    /* JADX INFO: renamed from: e */
    public final boolean f67940e;

    /* JADX INFO: renamed from: f */
    public final List f67941f;

    /* JADX INFO: renamed from: g */
    public final int f67942g;

    public C33318e(String str, float f11, float f12, long j11, boolean z11, List list, int i11) {
        this.f67936a = str;
        this.f67937b = f11;
        this.f67938c = f12;
        this.f67939d = j11;
        this.f67940e = z11;
        this.f67941f = list;
        this.f67942g = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33318e)) {
            return false;
        }
        C33318e c33318e = (C33318e) obj;
        return Intrinsics.areEqual(this.f67936a, c33318e.f67936a) && Float.compare(this.f67937b, c33318e.f67937b) == 0 && Float.compare(this.f67938c, c33318e.f67938c) == 0 && this.f67939d == c33318e.f67939d && this.f67940e == c33318e.f67940e && Intrinsics.areEqual(this.f67941f, c33318e.f67941f) && this.f67942g == c33318e.f67942g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67942g) + ((this.f67941f.hashCode() + AbstractC27920h.m69001a(this.f67940e, (Long.hashCode(this.f67939d) + ((Float.hashCode(this.f67938c) + ((Float.hashCode(this.f67937b) + (this.f67936a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "BadPhotosMobileConfig(model=" + this.f67936a + ", highQualityThreshold=" + this.f67937b + ", lowQualityThreshold=" + this.f67938c + ", executionTimeoutMs=" + this.f67939d + ", allowCache=" + this.f67940e + ", allowedSteps=" + this.f67941f + ", maxBlockedAttemptsCount=" + this.f67942g + ")";
    }

    public /* synthetic */ C33318e() {
        this("unsatisfactory_photos_v2.tflite", 0.75f, 0.2f, 3000L, true, CollectionsKt.listOf((Object[]) new String[]{"IDENTITY", "IDENTITY2", "IDENTITY3", "IDENTITY4"}), 1);
    }
}
