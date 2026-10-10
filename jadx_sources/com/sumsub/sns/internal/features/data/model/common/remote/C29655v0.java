package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@SourceDebugExtension({"SMAP\nRemoteIdDoc.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteIdDoc.kt\ncom/sumsub/sns/internal/features/data/model/common/remote/NfcSessionInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
@InterfaceC44962o
public final class C29655v0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59705a;

    /* JADX INFO: renamed from: b */
    public final String f59706b;

    /* JADX INFO: renamed from: c */
    public final String f59707c;

    /* JADX INFO: renamed from: d */
    public final String f59708d;

    /* JADX INFO: renamed from: e */
    public final String f59709e;

    /* JADX INFO: renamed from: f */
    public final String f59710f;

    /* JADX INFO: renamed from: g */
    public final String f59711g;

    /* JADX INFO: renamed from: h */
    public final String f59712h;

    /* JADX INFO: renamed from: i */
    public final Integer f59713i;

    /* JADX INFO: renamed from: j */
    public final Integer f59714j;

    /* JADX INFO: renamed from: k */
    public final String f59715k;

    @NotNull
    public static final C29641t0 Companion = new C29641t0();

    @NotNull
    public static final Parcelable.Creator<C29655v0> CREATOR = new C29648u0();

    public /* synthetic */ C29655v0(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29634s0.f59691a.getDescriptor());
        }
        this.f59705a = str;
        if ((i11 & 2) == 0) {
            this.f59706b = null;
        } else {
            this.f59706b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59707c = null;
        } else {
            this.f59707c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59708d = null;
        } else {
            this.f59708d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f59709e = null;
        } else {
            this.f59709e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f59710f = null;
        } else {
            this.f59710f = str6;
        }
        if ((i11 & 64) == 0) {
            this.f59711g = null;
        } else {
            this.f59711g = str7;
        }
        if ((i11 & 128) == 0) {
            this.f59712h = null;
        } else {
            this.f59712h = str8;
        }
        if ((i11 & 256) == 0) {
            this.f59713i = null;
        } else {
            this.f59713i = num;
        }
        if ((i11 & 512) == 0) {
            this.f59714j = null;
        } else {
            this.f59714j = num2;
        }
        if ((i11 & 1024) == 0) {
            this.f59715k = null;
        } else {
            this.f59715k = str9;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29655v0)) {
            return false;
        }
        C29655v0 c29655v0 = (C29655v0) obj;
        return Intrinsics.areEqual(this.f59705a, c29655v0.f59705a) && Intrinsics.areEqual(this.f59706b, c29655v0.f59706b) && Intrinsics.areEqual(this.f59707c, c29655v0.f59707c) && Intrinsics.areEqual(this.f59708d, c29655v0.f59708d) && Intrinsics.areEqual(this.f59709e, c29655v0.f59709e) && Intrinsics.areEqual(this.f59710f, c29655v0.f59710f) && Intrinsics.areEqual(this.f59711g, c29655v0.f59711g) && Intrinsics.areEqual(this.f59712h, c29655v0.f59712h) && Intrinsics.areEqual(this.f59713i, c29655v0.f59713i) && Intrinsics.areEqual(this.f59714j, c29655v0.f59714j) && Intrinsics.areEqual(this.f59715k, c29655v0.f59715k);
    }

    public C29655v0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, String str9) {
        this.f59705a = str;
        this.f59706b = str2;
        this.f59707c = str3;
        this.f59708d = str4;
        this.f59709e = str5;
        this.f59710f = str6;
        this.f59711g = str7;
        this.f59712h = str8;
        this.f59713i = num;
        this.f59714j = num2;
        this.f59715k = str9;
    }

    public final int hashCode() {
        int iHashCode = this.f59705a.hashCode() * 31;
        String str = this.f59706b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59707c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59708d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59709e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59710f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59711g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59712h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.f59713i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f59714j;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.f59715k;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "NfcSessionInfo(type=" + this.f59705a + ", seed=" + this.f59706b + ", documentNumber=" + this.f59707c + ", birthDate=" + this.f59708d + ", expirationDate=" + this.f59709e + ", kinegramAccessToken=" + this.f59710f + ", kinegramSessionId=" + this.f59711g + ", mrtdDataFilesToRead=" + this.f59712h + ", nfcSkipTryCount=" + this.f59713i + ", nfcFallbackTries=" + this.f59714j + ", documentScanPosition=" + this.f59715k + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59705a);
        parcel.writeString(this.f59706b);
        parcel.writeString(this.f59707c);
        parcel.writeString(this.f59708d);
        parcel.writeString(this.f59709e);
        parcel.writeString(this.f59710f);
        parcel.writeString(this.f59711g);
        parcel.writeString(this.f59712h);
        Integer num = this.f59713i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f59714j;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.f59715k);
    }
}
