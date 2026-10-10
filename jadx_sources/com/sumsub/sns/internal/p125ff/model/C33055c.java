package com.sumsub.sns.internal.p125ff.model;

import com.sumsub.sentry.android.AbstractC27920h;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ff.model.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C33055c {

    @NotNull
    public static final C33054b Companion = new C33054b();

    /* JADX INFO: renamed from: a */
    public final boolean f67506a;

    /* JADX INFO: renamed from: b */
    public final boolean f67507b;

    /* JADX INFO: renamed from: c */
    public final String f67508c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33055c)) {
            return false;
        }
        C33055c c33055c = (C33055c) obj;
        return this.f67506a == c33055c.f67506a && this.f67507b == c33055c.f67507b && Intrinsics.areEqual(this.f67508c, c33055c.f67508c);
    }

    public final int hashCode() {
        int iM69001a = AbstractC27920h.m69001a(this.f67507b, Boolean.hashCode(this.f67506a) * 31, 31);
        String str = this.f67508c;
        return iM69001a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FeatureFlagResponse(experiment=" + this.f67506a + ", enabled=" + this.f67507b + ", value=" + this.f67508c + ")";
    }

    public /* synthetic */ C33055c(int i11, boolean z11, boolean z12, String str) {
        if ((i11 & 1) == 0) {
            this.f67506a = false;
        } else {
            this.f67506a = z11;
        }
        if ((i11 & 2) == 0) {
            this.f67507b = false;
        } else {
            this.f67507b = z12;
        }
        if ((i11 & 4) == 0) {
            this.f67508c = null;
        } else {
            this.f67508c = str;
        }
    }
}
