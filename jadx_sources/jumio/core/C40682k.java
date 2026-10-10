package jumio.core;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C40682k {

    /* JADX INFO: renamed from: a */
    public final String f90308a;

    /* JADX INFO: renamed from: b */
    public final String f90309b;

    /* JADX INFO: renamed from: c */
    public final String f90310c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40682k)) {
            return false;
        }
        C40682k c40682k = (C40682k) obj;
        return Intrinsics.areEqual(this.f90308a, c40682k.f90308a) && Intrinsics.areEqual(this.f90309b, c40682k.f90309b) && Intrinsics.areEqual(this.f90310c, c40682k.f90310c);
    }

    public final int hashCode() {
        return this.f90310c.hashCode() + AbstractC40511C.m89148a(this.f90309b, this.f90308a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BackendSettings(url=" + this.f90308a + ", aleKeyId=" + this.f90309b + ", alePublicKey=" + this.f90310c + ')';
    }

    public C40682k(String url, String aleKeyId, String alePublicKey) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(aleKeyId, "aleKeyId");
        Intrinsics.checkNotNullParameter(alePublicKey, "alePublicKey");
        this.f90308a = url;
        this.f90309b = aleKeyId;
        this.f90310c = alePublicKey;
    }
}
