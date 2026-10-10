package com.sumsub.sns.internal.core.presentation.theme;

import android.graphics.Typeface;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.core.widget.AbstractC28250a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.theme.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28961i extends AbstractC28962j {

    /* JADX INFO: renamed from: a */
    public final String f58869a;

    /* JADX INFO: renamed from: b */
    public final int f58870b;

    /* JADX INFO: renamed from: c */
    public final String f58871c;

    /* JADX INFO: renamed from: d */
    public Typeface f58872d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28961i)) {
            return false;
        }
        C28961i c28961i = (C28961i) obj;
        return Intrinsics.areEqual(this.f58869a, c28961i.f58869a) && this.f58870b == c28961i.f58870b && Intrinsics.areEqual(this.f58871c, c28961i.f58871c) && Intrinsics.areEqual(this.f58872d, c28961i.f58872d);
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58871c, AbstractC28250a.m69223a(this.f58870b, this.f58869a.hashCode() * 31, 31), 31);
        Typeface typeface = this.f58872d;
        return iM68983a + (typeface == null ? 0 : typeface.hashCode());
    }

    public final String toString() {
        return "Typography(face=" + this.f58869a + ", size=" + this.f58870b + ", filename=" + this.f58871c + ", typeface=" + this.f58872d + ")";
    }

    public C28961i(String str, int i11, String str2, Typeface typeface) {
        this.f58869a = str;
        this.f58870b = i11;
        this.f58871c = str2;
        this.f58872d = typeface;
    }
}
