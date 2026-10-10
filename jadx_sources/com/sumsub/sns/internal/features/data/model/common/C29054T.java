package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.android.AbstractC27920h;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29054T implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29054T> CREATOR = new C29039P();

    /* JADX INFO: renamed from: a */
    public final File f58994a;

    /* JADX INFO: renamed from: b */
    public final File f58995b;

    /* JADX INFO: renamed from: c */
    public final String f58996c;

    /* JADX INFO: renamed from: d */
    public final String f58997d;

    /* JADX INFO: renamed from: e */
    public final IdentitySide f58998e;

    /* JADX INFO: renamed from: f */
    public final boolean f58999f;

    /* JADX INFO: renamed from: g */
    public final Boolean f59000g;

    /* JADX INFO: renamed from: h */
    public final C29050S f59001h;

    /* JADX INFO: renamed from: i */
    public final boolean f59002i;

    /* JADX INFO: renamed from: j */
    public final Boolean f59003j;

    public /* synthetic */ C29054T(File file, File file2, String str, String str2, IdentitySide identitySide, Boolean bool, C29050S c29050s, int i11) {
        this(file, file2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, identitySide, false, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : c29050s, (i11 & 256) == 0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29054T)) {
            return false;
        }
        C29054T c29054t = (C29054T) obj;
        return Intrinsics.areEqual(this.f58994a, c29054t.f58994a) && Intrinsics.areEqual(this.f58995b, c29054t.f58995b) && Intrinsics.areEqual(this.f58996c, c29054t.f58996c) && Intrinsics.areEqual(this.f58997d, c29054t.f58997d) && this.f58998e == c29054t.f58998e && this.f58999f == c29054t.f58999f && Intrinsics.areEqual(this.f59000g, c29054t.f59000g) && Intrinsics.areEqual(this.f59001h, c29054t.f59001h) && this.f59002i == c29054t.f59002i && Intrinsics.areEqual(this.f59003j, c29054t.f59003j);
    }

    public C29054T(File file, File file2, String str, String str2, IdentitySide identitySide, boolean z11, Boolean bool, C29050S c29050s, boolean z12, Boolean bool2) {
        this.f58994a = file;
        this.f58995b = file2;
        this.f58996c = str;
        this.f58997d = str2;
        this.f58998e = identitySide;
        this.f58999f = z11;
        this.f59000g = bool;
        this.f59001h = c29050s;
        this.f59002i = z12;
        this.f59003j = bool2;
    }

    /* JADX INFO: renamed from: a */
    public static C29054T m69738a(C29054T c29054t, String str, String str2, IdentitySide identitySide, int i11) {
        Boolean bool = Boolean.TRUE;
        File file = c29054t.f58994a;
        File file2 = c29054t.f58995b;
        if ((i11 & 4) != 0) {
            str = c29054t.f58996c;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = c29054t.f58997d;
        }
        String str4 = str2;
        IdentitySide identitySide2 = (i11 & 16) != 0 ? c29054t.f58998e : identitySide;
        boolean z11 = (i11 & 32) != 0 ? c29054t.f58999f : false;
        Boolean bool2 = c29054t.f59000g;
        C29050S c29050s = c29054t.f59001h;
        boolean z12 = c29054t.f59002i;
        if ((i11 & 512) != 0) {
            bool = c29054t.f59003j;
        }
        return new C29054T(file, file2, str3, str4, identitySide2, z11, bool2, c29050s, z12, bool);
    }

    public final int hashCode() {
        File file = this.f58994a;
        int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
        File file2 = this.f58995b;
        int iHashCode2 = (iHashCode + (file2 == null ? 0 : file2.hashCode())) * 31;
        String str = this.f58996c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58997d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IdentitySide identitySide = this.f58998e;
        int iM69001a = AbstractC27920h.m69001a(this.f58999f, (iHashCode4 + (identitySide == null ? 0 : identitySide.hashCode())) * 31, 31);
        Boolean bool = this.f59000g;
        int iHashCode5 = (iM69001a + (bool == null ? 0 : bool.hashCode())) * 31;
        C29050S c29050s = this.f59001h;
        int iM69001a2 = AbstractC27920h.m69001a(this.f59002i, (iHashCode5 + (c29050s == null ? 0 : c29050s.hashCode())) * 31, 31);
        Boolean bool2 = this.f59003j;
        return iM69001a2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f58997d;
        File file = this.f58994a;
        String absolutePath = file != null ? file.getAbsolutePath() : null;
        String str2 = this.f58996c;
        boolean z11 = this.f58999f;
        File file2 = this.f58995b;
        String absolutePath2 = file2 != null ? file2.getAbsolutePath() : null;
        IdentitySide identitySide = this.f58998e;
        return "type=" + str + ", document=" + absolutePath + ", country=" + str2 + ", sent=" + z11 + ", raw=" + absolutePath2 + ", side=" + (identitySide != null ? identitySide.getValue() : null) + ", confirmedSingleSided=" + this.f59003j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f58994a);
        parcel.writeSerializable(this.f58995b);
        parcel.writeString(this.f58996c);
        parcel.writeString(this.f58997d);
        IdentitySide identitySide = this.f58998e;
        if (identitySide == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(identitySide.name());
        }
        parcel.writeInt(this.f58999f ? 1 : 0);
        Boolean bool = this.f59000g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C29050S c29050s = this.f59001h;
        if (c29050s == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(c29050s.f58987a);
            parcel.writeLong(c29050s.f58988b);
        }
        parcel.writeInt(this.f59002i ? 1 : 0);
        Boolean bool2 = this.f59003j;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }
}
