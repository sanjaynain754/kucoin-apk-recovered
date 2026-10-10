package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31237Z extends AbstractC31245b0 {

    /* JADX INFO: renamed from: a */
    public final C28895g f63197a;

    /* JADX INFO: renamed from: b */
    public final boolean f63198b;

    /* JADX INFO: renamed from: c */
    public final Map f63199c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31237Z)) {
            return false;
        }
        C31237Z c31237z = (C31237Z) obj;
        return Intrinsics.areEqual(this.f63197a, c31237z.f63197a) && this.f63198b == c31237z.f63198b && Intrinsics.areEqual(this.f63199c, c31237z.f63199c);
    }

    public final int hashCode() {
        return this.f63199c.hashCode() + AbstractC27920h.m69001a(this.f63198b, this.f63197a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShowInstructions(stepInfo=" + this.f63197a + ", cancelOnBackPressed=" + this.f63198b + ", analyticsExtras=" + this.f63199c + ")";
    }

    public C31237Z(C28895g c28895g, boolean z11, Map map) {
        this.f63197a = c28895g;
        this.f63198b = z11;
        this.f63199c = map;
    }
}
