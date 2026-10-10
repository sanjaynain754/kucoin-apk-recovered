package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.i4 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29385i4 {

    @NotNull
    public static final C29377h4 Companion = new C29377h4();

    /* JADX INFO: renamed from: a */
    public final C29369g4 f59396a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29385i4) && Intrinsics.areEqual(this.f59396a, ((C29385i4) obj).f59396a);
    }

    public final int hashCode() {
        C29369g4 c29369g4 = this.f59396a;
        if (c29369g4 == null) {
            return 0;
        }
        return c29369g4.hashCode();
    }

    public final String toString() {
        return "VideoIdentRemoteConfig(backgroundAspectRatio=" + this.f59396a + ")";
    }

    public /* synthetic */ C29385i4(int i11, C29369g4 c29369g4) {
        if ((i11 & 1) == 0) {
            this.f59396a = null;
        } else {
            this.f59396a = c29369g4;
        }
    }
}
