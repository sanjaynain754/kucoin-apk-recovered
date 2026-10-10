package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.t2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29697t2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C29697t2> CREATOR = new C29692s2();

    /* JADX INFO: renamed from: a */
    public final String f59742a;

    /* JADX INFO: renamed from: b */
    public final String f59743b;

    /* JADX INFO: renamed from: c */
    public final String f59744c;

    /* JADX INFO: renamed from: d */
    public final boolean f59745d;

    /* JADX INFO: renamed from: e */
    public final String f59746e;

    /* JADX INFO: renamed from: f */
    public final Map f59747f;

    public C29697t2(String str, String str2, String str3, boolean z11, String str4, Map map) {
        this.f59742a = str;
        this.f59743b = str2;
        this.f59744c = str3;
        this.f59745d = z11;
        this.f59746e = str4;
        this.f59747f = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29697t2)) {
            return false;
        }
        C29697t2 c29697t2 = (C29697t2) obj;
        return Intrinsics.areEqual(this.f59742a, c29697t2.f59742a) && Intrinsics.areEqual(this.f59743b, c29697t2.f59743b) && Intrinsics.areEqual(this.f59744c, c29697t2.f59744c) && this.f59745d == c29697t2.f59745d && Intrinsics.areEqual(this.f59746e, c29697t2.f59746e) && Intrinsics.areEqual(this.f59747f, c29697t2.f59747f);
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f59743b, this.f59742a.hashCode() * 31, 31);
        String str = this.f59744c;
        int iM69001a = AbstractC27920h.m69001a(this.f59745d, (iM68983a + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f59746e;
        return this.f59747f.hashCode() + ((iM69001a + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "IntroParams(step=" + this.f59742a + ", scene=" + this.f59743b + ", idDocType=" + this.f59744c + ", isAction=" + this.f59745d + ", countryCode=" + this.f59746e + ", analyticsExtras=" + this.f59747f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59742a);
        parcel.writeString(this.f59743b);
        parcel.writeString(this.f59744c);
        parcel.writeInt(this.f59745d ? 1 : 0);
        parcel.writeString(this.f59746e);
        Map map = this.f59747f;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ C29697t2(String str, String str2, String str3, String str4, Map map, int i11) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, false, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? MapsKt.emptyMap() : map);
    }
}
