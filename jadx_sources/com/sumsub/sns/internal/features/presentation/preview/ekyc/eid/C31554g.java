package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid;

import com.sumsub.sentry.AbstractC27897U;
import de.authada.library.api.authentication.StartCallback;
import java.net.URL;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31554g extends AbstractC31555h {

    /* JADX INFO: renamed from: a */
    public final String f64076a;

    /* JADX INFO: renamed from: b */
    public final URL f64077b;

    /* JADX INFO: renamed from: c */
    public final String f64078c;

    /* JADX INFO: renamed from: d */
    public final StartCallback f64079d;

    /* JADX INFO: renamed from: e */
    public final Function1 f64080e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31554g)) {
            return false;
        }
        C31554g c31554g = (C31554g) obj;
        return Intrinsics.areEqual(this.f64076a, c31554g.f64076a) && Intrinsics.areEqual(this.f64077b, c31554g.f64077b) && Intrinsics.areEqual(this.f64078c, c31554g.f64078c) && Intrinsics.areEqual(this.f64079d, c31554g.f64079d) && Intrinsics.areEqual(this.f64080e, c31554g.f64080e);
    }

    public final int hashCode() {
        return this.f64080e.hashCode() + ((this.f64079d.hashCode() + AbstractC27897U.m68983a(this.f64078c, (this.f64077b.hashCode() + (this.f64076a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "Start(certificatePem='***', mobileToken='" + this.f64076a + "', url=" + this.f64077b + ", callback=" + this.f64079d + ", errorCallback=" + this.f64080e + ")";
    }

    public C31554g(String str, URL url, String str2, StartCallback startCallback, Function1 function1) {
        this.f64076a = str;
        this.f64077b = url;
        this.f64078c = str2;
        this.f64079d = startCallback;
        this.f64080e = function1;
    }
}
