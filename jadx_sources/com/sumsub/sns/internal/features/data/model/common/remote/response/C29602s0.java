package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29602s0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59650a;

    /* JADX INFO: renamed from: b */
    public final String f59651b;

    /* JADX INFO: renamed from: c */
    public final String f59652c;

    /* JADX INFO: renamed from: d */
    public final String f59653d;

    /* JADX INFO: renamed from: e */
    public final String f59654e;

    /* JADX INFO: renamed from: f */
    public final Boolean f59655f;

    /* JADX INFO: renamed from: g */
    public final List f59656g;

    @NotNull
    public static final C29594q0 Companion = new C29594q0();

    @NotNull
    public static final Parcelable.Creator<C29602s0> CREATOR = new C29598r0();

    /* JADX INFO: renamed from: h */
    public static final Lazy[] f59649h = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.c3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29602s0.m69893b();
        }
    })};

    public /* synthetic */ C29602s0(int i11, String str, String str2, String str3, String str4, String str5, Boolean bool, List list) {
        if ((i11 & 1) == 0) {
            this.f59650a = null;
        } else {
            this.f59650a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59651b = null;
        } else {
            this.f59651b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59652c = null;
        } else {
            this.f59652c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59653d = null;
        } else {
            this.f59653d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f59654e = null;
        } else {
            this.f59654e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f59655f = null;
        } else {
            this.f59655f = bool;
        }
        if ((i11 & 64) == 0) {
            this.f59656g = null;
        } else {
            this.f59656g = list;
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
        if (!(obj instanceof C29602s0)) {
            return false;
        }
        C29602s0 c29602s0 = (C29602s0) obj;
        return Intrinsics.areEqual(this.f59650a, c29602s0.f59650a) && Intrinsics.areEqual(this.f59651b, c29602s0.f59651b) && Intrinsics.areEqual(this.f59652c, c29602s0.f59652c) && Intrinsics.areEqual(this.f59653d, c29602s0.f59653d) && Intrinsics.areEqual(this.f59654e, c29602s0.f59654e) && Intrinsics.areEqual(this.f59655f, c29602s0.f59655f) && Intrinsics.areEqual(this.f59656g, c29602s0.f59656g);
    }

    public C29602s0(String str, String str2, String str3, String str4, String str5, Boolean bool, ArrayList arrayList) {
        this.f59650a = str;
        this.f59651b = str2;
        this.f59652c = str3;
        this.f59653d = str4;
        this.f59654e = str5;
        this.f59655f = bool;
        this.f59656g = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69893b() {
        return new C41813f(C29461C.f59460a);
    }

    public final int hashCode() {
        String str = this.f59650a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59651b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59652c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59653d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59654e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f59655f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f59656g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Section(id=" + this.f59650a + ", createdAt=" + this.f59651b + ", title=" + this.f59652c + ", desc=" + this.f59653d + ", condition=" + this.f59654e + ", delimiter=" + this.f59655f + ", items=" + this.f59656g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59650a);
        parcel.writeString(this.f59651b);
        parcel.writeString(this.f59652c);
        parcel.writeString(this.f59653d);
        parcel.writeString(this.f59654e);
        Boolean bool = this.f59655f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List list = this.f59656g;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C29470F) it.next()).writeToParcel(parcel, i11);
        }
    }
}
