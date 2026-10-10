package com.sumsub.sns.internal.util.root;

import com.sumsub.sentry.android.AbstractC27920h;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.root.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33411b {

    /* JADX INFO: renamed from: a */
    public final boolean f68114a;

    /* JADX INFO: renamed from: b */
    public final boolean f68115b;

    /* JADX INFO: renamed from: c */
    public final boolean f68116c;

    /* JADX INFO: renamed from: d */
    public final boolean f68117d;

    /* JADX INFO: renamed from: e */
    public final boolean f68118e;

    /* JADX INFO: renamed from: f */
    public final boolean f68119f;

    /* JADX INFO: renamed from: g */
    public final boolean f68120g;

    /* JADX INFO: renamed from: h */
    public final boolean f68121h;

    /* JADX INFO: renamed from: i */
    public final boolean f68122i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33411b)) {
            return false;
        }
        C33411b c33411b = (C33411b) obj;
        return this.f68114a == c33411b.f68114a && this.f68115b == c33411b.f68115b && this.f68116c == c33411b.f68116c && this.f68117d == c33411b.f68117d && this.f68118e == c33411b.f68118e && this.f68119f == c33411b.f68119f && this.f68120g == c33411b.f68120g && this.f68121h == c33411b.f68121h && this.f68122i == c33411b.f68122i;
    }

    /* JADX INFO: renamed from: a */
    public final Map m71697a() {
        return MapsKt.mapOf(TuplesKt.m90091to("root_beer_detectRootManagementApps", Boolean.valueOf(this.f68114a)), TuplesKt.m90091to("root_beer_detectPotentiallyDangerousApps", Boolean.valueOf(this.f68115b)), TuplesKt.m90091to("root_beer_checkForBinary", Boolean.valueOf(this.f68116c)), TuplesKt.m90091to("root_beer_checkForDangerousProps", Boolean.valueOf(this.f68117d)), TuplesKt.m90091to("root_beer_checkForRWPaths", Boolean.valueOf(this.f68118e)), TuplesKt.m90091to("root_beer_detectTestKeys", Boolean.valueOf(this.f68119f)), TuplesKt.m90091to("root_beer_checkSuExists", Boolean.valueOf(this.f68120g)), TuplesKt.m90091to("root_beer_checkForRootNative", Boolean.valueOf(this.f68121h)), TuplesKt.m90091to("root_beer_checkForMagiskBinary", Boolean.valueOf(this.f68122i)), TuplesKt.m90091to("root_beer_isRooted", Boolean.valueOf(m71698b())));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m71698b() {
        return this.f68114a || this.f68115b || this.f68116c || this.f68117d || this.f68118e || this.f68119f || this.f68120g || this.f68121h || this.f68122i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68122i) + AbstractC27920h.m69001a(this.f68121h, AbstractC27920h.m69001a(this.f68120g, AbstractC27920h.m69001a(this.f68119f, AbstractC27920h.m69001a(this.f68118e, AbstractC27920h.m69001a(this.f68117d, AbstractC27920h.m69001a(this.f68116c, AbstractC27920h.m69001a(this.f68115b, Boolean.hashCode(this.f68114a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "RootBeerConfig(detectRootManagementApps=" + this.f68114a + ", detectPotentiallyDangerousApps=" + this.f68115b + ", checkForBinary=" + this.f68116c + ", checkForDangerousProps=" + this.f68117d + ", checkForRWPaths=" + this.f68118e + ", detectTestKeys=" + this.f68119f + ", checkSuExists=" + this.f68120g + ", checkForRootNative=" + this.f68121h + ", checkForMagiskBinary=" + this.f68122i + ")";
    }

    public C33411b(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.f68114a = z11;
        this.f68115b = z12;
        this.f68116c = z13;
        this.f68117d = z14;
        this.f68118e = z15;
        this.f68119f = z16;
        this.f68120g = z17;
        this.f68121h = z18;
        this.f68122i = z19;
    }
}
