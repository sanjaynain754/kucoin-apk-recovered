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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29550g0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59571a;

    /* JADX INFO: renamed from: b */
    public final String f59572b;

    /* JADX INFO: renamed from: c */
    public final String f59573c;

    /* JADX INFO: renamed from: d */
    public final Boolean f59574d;

    /* JADX INFO: renamed from: e */
    public final String f59575e;

    /* JADX INFO: renamed from: f */
    public final String f59576f;

    /* JADX INFO: renamed from: g */
    public final String f59577g;

    /* JADX INFO: renamed from: h */
    public final List f59578h;

    @NotNull
    public static final C29540e0 Companion = new C29540e0();

    @NotNull
    public static final Parcelable.Creator<C29550g0> CREATOR = new C29545f0();

    /* JADX INFO: renamed from: i */
    public static final Lazy[] f59570i = {null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.u2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C29550g0.m69885b();
        }
    })};

    public /* synthetic */ C29550g0(int i11, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, List list) {
        if ((i11 & 1) == 0) {
            this.f59571a = null;
        } else {
            this.f59571a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59572b = null;
        } else {
            this.f59572b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59573c = null;
        } else {
            this.f59573c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f59574d = null;
        } else {
            this.f59574d = bool;
        }
        if ((i11 & 16) == 0) {
            this.f59575e = null;
        } else {
            this.f59575e = str4;
        }
        if ((i11 & 32) == 0) {
            this.f59576f = null;
        } else {
            this.f59576f = str5;
        }
        if ((i11 & 64) == 0) {
            this.f59577g = null;
        } else {
            this.f59577g = str6;
        }
        if ((i11 & 128) == 0) {
            this.f59578h = null;
        } else {
            this.f59578h = list;
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
        if (!(obj instanceof C29550g0)) {
            return false;
        }
        C29550g0 c29550g0 = (C29550g0) obj;
        return Intrinsics.areEqual(this.f59571a, c29550g0.f59571a) && Intrinsics.areEqual(this.f59572b, c29550g0.f59572b) && Intrinsics.areEqual(this.f59573c, c29550g0.f59573c) && Intrinsics.areEqual(this.f59574d, c29550g0.f59574d) && Intrinsics.areEqual(this.f59575e, c29550g0.f59575e) && Intrinsics.areEqual(this.f59576f, c29550g0.f59576f) && Intrinsics.areEqual(this.f59577g, c29550g0.f59577g) && Intrinsics.areEqual(this.f59578h, c29550g0.f59578h);
    }

    public C29550g0(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, ArrayList arrayList) {
        this.f59571a = str;
        this.f59572b = str2;
        this.f59573c = str3;
        this.f59574d = bool;
        this.f59575e = str4;
        this.f59576f = str5;
        this.f59577g = str6;
        this.f59578h = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69885b() {
        return new C41813f(C29590p0.f59612a);
    }

    public final int hashCode() {
        String str = this.f59571a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59572b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59573c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f59574d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f59575e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59576f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59577g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.f59578h;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "QuestionnaireResponse(internalId=" + this.f59571a + ", id=" + this.f59572b + ", clientId=" + this.f59573c + ", modifiable=" + this.f59574d + ", createdAt=" + this.f59575e + ", title=" + this.f59576f + ", desc=" + this.f59577g + ", sections=" + this.f59578h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59571a);
        parcel.writeString(this.f59572b);
        parcel.writeString(this.f59573c);
        Boolean bool = this.f59574d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f59575e);
        parcel.writeString(this.f59576f);
        parcel.writeString(this.f59577g);
        List list = this.f59578h;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C29602s0) it.next()).writeToParcel(parcel, i11);
        }
    }
}
