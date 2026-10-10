package com.sumsub.sns.internal.features.data.repository.navigation;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.navigation.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C30020o {

    @NotNull
    public static final C30016k Companion = new C30016k();

    /* JADX INFO: renamed from: a */
    public final String f60304a;

    /* JADX INFO: renamed from: b */
    public final String f60305b;

    /* JADX INFO: renamed from: c */
    public final C29586o0 f60306c;

    /* JADX INFO: renamed from: d */
    public final C30019n f60307d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30020o)) {
            return false;
        }
        C30020o c30020o = (C30020o) obj;
        return Intrinsics.areEqual(this.f60304a, c30020o.f60304a) && Intrinsics.areEqual(this.f60305b, c30020o.f60305b) && Intrinsics.areEqual(this.f60306c, c30020o.f60306c) && Intrinsics.areEqual(this.f60307d, c30020o.f60307d);
    }

    public /* synthetic */ C30020o(int i11, String str, String str2, C29586o0 c29586o0, C30019n c30019n) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C30015j.f60299a.getDescriptor());
        }
        this.f60304a = str;
        if ((i11 & 2) == 0) {
            this.f60305b = null;
        } else {
            this.f60305b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f60306c = null;
        } else {
            this.f60306c = c29586o0;
        }
        if ((i11 & 8) == 0) {
            this.f60307d = null;
        } else {
            this.f60307d = c30019n;
        }
    }

    public final int hashCode() {
        int iHashCode = this.f60304a.hashCode() * 31;
        String str = this.f60305b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C29586o0 c29586o0 = this.f60306c;
        int iHashCode3 = (iHashCode2 + (c29586o0 == null ? 0 : c29586o0.hashCode())) * 31;
        C30019n c30019n = this.f60307d;
        return iHashCode3 + (c30019n != null ? c30019n.hashCode() : 0);
    }

    public final String toString() {
        return "SdkStepDto(stepType=" + this.f60304a + ", idDocSetType=" + this.f60305b + ", restriction=" + this.f60306c + ", idDocSet=" + this.f60307d + ")";
    }
}
