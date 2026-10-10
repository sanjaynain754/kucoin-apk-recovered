package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29380i {

    @NotNull
    public static final C29372h Companion = new C29372h();

    /* JADX INFO: renamed from: a */
    public final C29356f f59389a;

    /* JADX INFO: renamed from: b */
    public final C29332c f59390b;

    /* JADX INFO: renamed from: c */
    public final String f59391c;

    public /* synthetic */ C29380i(int i11, C29356f c29356f, C29332c c29332c, String str) {
        if ((i11 & 1) == 0) {
            this.f59389a = null;
        } else {
            this.f59389a = c29356f;
        }
        if ((i11 & 2) == 0) {
            this.f59390b = null;
        } else {
            this.f59390b = c29332c;
        }
        if ((i11 & 4) == 0) {
            this.f59391c = null;
        } else {
            this.f59391c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29380i)) {
            return false;
        }
        C29380i c29380i = (C29380i) obj;
        return Intrinsics.areEqual(this.f59389a, c29380i.f59389a) && Intrinsics.areEqual(this.f59390b, c29380i.f59390b) && Intrinsics.areEqual(this.f59391c, c29380i.f59391c);
    }

    public C29380i(C29356f c29356f, C29332c c29332c) {
        this.f59389a = c29356f;
        this.f59390b = c29332c;
        this.f59391c = null;
    }

    public final int hashCode() {
        C29356f c29356f = this.f59389a;
        int iHashCode = (c29356f == null ? 0 : c29356f.hashCode()) * 31;
        C29332c c29332c = this.f59390b;
        int iHashCode2 = (iHashCode + (c29332c == null ? 0 : c29332c.hashCode())) * 31;
        String str = this.f59391c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AgreementWithCriteria(matchCriteria=" + this.f59389a + ", agreement=" + this.f59390b + ", description=" + this.f59391c + ")";
    }
}
