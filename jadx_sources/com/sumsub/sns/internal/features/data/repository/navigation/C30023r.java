package com.sumsub.sns.internal.features.data.repository.navigation;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C30023r {

    @NotNull
    public static final C30022q Companion = new C30022q();

    /* JADX INFO: renamed from: a */
    public final String f60309a;

    public /* synthetic */ C30023r(int i11, String str) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C30021p.f60308a.getDescriptor());
        }
        this.f60309a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30023r) && Intrinsics.areEqual(this.f60309a, ((C30023r) obj).f60309a);
    }

    public C30023r(String str) {
        this.f60309a = str;
    }

    public final int hashCode() {
        String str = this.f60309a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "ServerNavigationMoveRequest(version=" + this.f60309a + ")";
    }
}
