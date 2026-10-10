package com.sumsub.sns.internal.features.data.model.common.remote;

import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29633s {

    @NotNull
    public static final C29448r Companion = new C29448r();

    /* JADX INFO: renamed from: a */
    public final String f59686a;

    /* JADX INFO: renamed from: b */
    public final String f59687b;

    /* JADX INFO: renamed from: c */
    public final boolean f59688c;

    /* JADX INFO: renamed from: d */
    public final boolean f59689d;

    /* JADX INFO: renamed from: e */
    public final JsonElement f59690e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29633s)) {
            return false;
        }
        C29633s c29633s = (C29633s) obj;
        return Intrinsics.areEqual(this.f59686a, c29633s.f59686a) && Intrinsics.areEqual(this.f59687b, c29633s.f59687b) && this.f59688c == c29633s.f59688c && this.f59689d == c29633s.f59689d && Intrinsics.areEqual(this.f59690e, c29633s.f59690e);
    }

    public /* synthetic */ C29633s(int i11, String str, String str2, boolean z11, boolean z12, JsonElement jsonElement) {
        if (2 != (i11 & 2)) {
            C41801c2.m91514a(i11, 2, C29441q.f59436a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f59686a = null;
        } else {
            this.f59686a = str;
        }
        this.f59687b = str2;
        if ((i11 & 4) == 0) {
            this.f59688c = false;
        } else {
            this.f59688c = z11;
        }
        if ((i11 & 8) == 0) {
            this.f59689d = false;
        } else {
            this.f59689d = z12;
        }
        if ((i11 & 16) == 0) {
            this.f59690e = null;
        } else {
            this.f59690e = jsonElement;
        }
    }

    public final int hashCode() {
        String str = this.f59686a;
        int iM69001a = AbstractC27920h.m69001a(this.f59689d, AbstractC27920h.m69001a(this.f59688c, AbstractC27897U.m68983a(this.f59687b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31);
        JsonElement jsonElement = this.f59690e;
        return iM69001a + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicantDataFormFieldSurrogate(displayName=" + this.f59686a + ", name=" + this.f59687b + ", required=" + this.f59688c + ", isImmutableIfPresent=" + this.f59689d + ", value=" + this.f59690e + ")";
    }
}
