package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.y2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29678y2 {

    @NotNull
    public static final C29671x2 Companion = new C29671x2();

    /* JADX INFO: renamed from: a */
    public final Long f59730a;

    /* JADX INFO: renamed from: b */
    public final Long f59731b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29678y2)) {
            return false;
        }
        C29678y2 c29678y2 = (C29678y2) obj;
        return Intrinsics.areEqual(this.f59730a, c29678y2.f59730a) && Intrinsics.areEqual(this.f59731b, c29678y2.f59731b);
    }

    public final int hashCode() {
        Long l11 = this.f59730a;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.f59731b;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    public final String toString() {
        return "Payload(waitTimeSec=" + this.f59730a + ", queuePlace=" + this.f59731b + ")";
    }

    public /* synthetic */ C29678y2(int i11, Long l11, Long l12) {
        if ((i11 & 1) == 0) {
            this.f59730a = null;
        } else {
            this.f59730a = l11;
        }
        if ((i11 & 2) == 0) {
            this.f59731b = null;
        } else {
            this.f59731b = l12;
        }
    }
}
