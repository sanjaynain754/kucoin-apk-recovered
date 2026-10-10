package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.g4 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29369g4 {

    @NotNull
    public static final C29361f4 Companion = new C29361f4();

    /* JADX INFO: renamed from: a */
    public final int f59381a;

    /* JADX INFO: renamed from: b */
    public final int f59382b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29369g4)) {
            return false;
        }
        C29369g4 c29369g4 = (C29369g4) obj;
        return this.f59381a == c29369g4.f59381a && this.f59382b == c29369g4.f59382b;
    }

    public /* synthetic */ C29369g4(int i11, int i12, int i13) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29353e4.f59372a.getDescriptor());
        }
        this.f59381a = i12;
        this.f59382b = i13;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59382b) + (Integer.hashCode(this.f59381a) * 31);
    }

    public final String toString() {
        return "AspectRatio(width=" + this.f59381a + ", height=" + this.f59382b + ")";
    }
}
