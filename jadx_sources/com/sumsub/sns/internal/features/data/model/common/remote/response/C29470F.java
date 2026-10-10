package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29470F implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59466a;

    /* JADX INFO: renamed from: b */
    public final String f59467b;

    /* JADX INFO: renamed from: c */
    public final String f59468c;

    /* JADX INFO: renamed from: d */
    public final String f59469d;

    /* JADX INFO: renamed from: e */
    public final Boolean f59470e;

    /* JADX INFO: renamed from: f */
    public final String f59471f;

    /* JADX INFO: renamed from: g */
    public final String f59472g;

    /* JADX INFO: renamed from: h */
    public final String f59473h;

    /* JADX INFO: renamed from: i */
    public final List f59474i;

    /* JADX INFO: renamed from: j */
    public final String f59475j;

    @NotNull
    public static final C29464D Companion = new C29464D();

    @NotNull
    public static final Parcelable.Creator<C29470F> CREATOR = new C29467E();

    /* JADX INFO: renamed from: k */
    public static final Lazy[] f59465k = {null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.i2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29470F.m69867b();
        }
    }), null};

    public /* synthetic */ C29470F(int i11, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, List list, String str8) {
        if ((i11 & 1) == 0) {
            this.f59466a = null;
        } else {
            this.f59466a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59467b = null;
        } else {
            this.f59467b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59468c = null;
        } else {
            this.f59468c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59469d = null;
        } else {
            this.f59469d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f59470e = null;
        } else {
            this.f59470e = bool;
        }
        if ((i11 & 32) == 0) {
            this.f59471f = null;
        } else {
            this.f59471f = str5;
        }
        if ((i11 & 64) == 0) {
            this.f59472g = null;
        } else {
            this.f59472g = str6;
        }
        if ((i11 & 128) == 0) {
            this.f59473h = null;
        } else {
            this.f59473h = str7;
        }
        if ((i11 & 256) == 0) {
            this.f59474i = CollectionsKt.emptyList();
        } else {
            this.f59474i = list;
        }
        if ((i11 & 512) == 0) {
            this.f59475j = null;
        } else {
            this.f59475j = str8;
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
        if (!(obj instanceof C29470F)) {
            return false;
        }
        C29470F c29470f = (C29470F) obj;
        return Intrinsics.areEqual(this.f59466a, c29470f.f59466a) && Intrinsics.areEqual(this.f59467b, c29470f.f59467b) && Intrinsics.areEqual(this.f59468c, c29470f.f59468c) && Intrinsics.areEqual(this.f59469d, c29470f.f59469d) && Intrinsics.areEqual(this.f59470e, c29470f.f59470e) && Intrinsics.areEqual(this.f59471f, c29470f.f59471f) && Intrinsics.areEqual(this.f59472g, c29470f.f59472g) && Intrinsics.areEqual(this.f59473h, c29470f.f59473h) && Intrinsics.areEqual(this.f59474i, c29470f.f59474i) && Intrinsics.areEqual(this.f59475j, c29470f.f59475j);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69867b() {
        return new C41813f(C29485K.f59493a);
    }

    public final int hashCode() {
        String str = this.f59466a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59467b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59468c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59469d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f59470e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f59471f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59472g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59473h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.f59474i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.f59475j;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "Item(id=" + this.f59466a + ", title=" + this.f59467b + ", desc=" + this.f59468c + ", type=" + this.f59469d + ", required=" + this.f59470e + ", format=" + this.f59471f + ", placeholder=" + this.f59472g + ", condition=" + this.f59473h + ", options=" + this.f59474i + ", arbitraryDocType=" + this.f59475j + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59466a);
        parcel.writeString(this.f59467b);
        parcel.writeString(this.f59468c);
        parcel.writeString(this.f59469d);
        Boolean bool = this.f59470e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f59471f);
        parcel.writeString(this.f59472g);
        parcel.writeString(this.f59473h);
        List<C29494N> list = this.f59474i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (C29494N c29494n : list) {
                parcel.writeString(c29494n.f59517a);
                parcel.writeString(c29494n.f59518b);
                parcel.writeString(c29494n.f59519c);
            }
        }
        parcel.writeString(this.f59475j);
    }

    public C29470F(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, List list, String str8) {
        this.f59466a = str;
        this.f59467b = str2;
        this.f59468c = str3;
        this.f59469d = str4;
        this.f59470e = bool;
        this.f59471f = str5;
        this.f59472g = str6;
        this.f59473h = str7;
        this.f59474i = list;
        this.f59475j = str8;
    }

    public /* synthetic */ C29470F(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, List list, int i11) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? CollectionsKt.emptyList() : list, (String) null);
    }
}
