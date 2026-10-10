package com.google.android.play.core.integrity;

import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ao */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7740ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a */
    private final String f11985a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private final Long f11986b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private final Object f11987c = null;

    @ChecksSdkIntAtLeast(api = 23)
    /* JADX INFO: renamed from: a */
    private static boolean m13231a() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z11;
        Long l11;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f11985a.equals(integrityTokenRequest.nonce()) || ((l11 = this.f11986b) != null ? !l11.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() != null)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (!(obj instanceof C7740ao) || !m13231a()) {
            return z11;
        }
        C7740ao c7740ao = (C7740ao) obj;
        if (!z11) {
            return false;
        }
        Object obj2 = c7740ao.f11987c;
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    @Nullable
    public final Long cloudProjectNumber() {
        return this.f11986b;
    }

    public final int hashCode() {
        int iHashCode = this.f11985a.hashCode() ^ 1000003;
        Long l11 = this.f11986b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l11 == null ? 0 : l11.hashCode());
        return m13231a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f11985a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f11985a + ", cloudProjectNumber=" + this.f11986b;
        if (m13231a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }

    public /* synthetic */ C7740ao(String str, Long l11, Object obj, C7739an c7739an) {
        this.f11985a = str;
        this.f11986b = l11;
    }
}
