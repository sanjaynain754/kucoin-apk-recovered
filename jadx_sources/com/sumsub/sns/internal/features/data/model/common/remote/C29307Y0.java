package com.sumsub.sns.internal.features.data.model.common.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.Y0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29307Y0 implements Parcelable {

    /* JADX INFO: renamed from: g */
    public static final Lazy[] f59315g;

    /* JADX INFO: renamed from: a */
    public final String f59316a;

    /* JADX INFO: renamed from: b */
    public final String f59317b;

    /* JADX INFO: renamed from: c */
    public final IdentitySide f59318c;

    /* JADX INFO: renamed from: d */
    public final List f59319d;

    /* JADX INFO: renamed from: e */
    public final String f59320e;

    /* JADX INFO: renamed from: f */
    public final C29655v0 f59321f;

    @NotNull
    public static final C29297W0 Companion = new C29297W0();

    @NotNull
    public static final Parcelable.Creator<C29307Y0> CREATOR = new C29302X0();

    public /* synthetic */ C29307Y0(int i11, String str, String str2, IdentitySide identitySide, List list, String str3, C29655v0 c29655v0) {
        if ((i11 & 1) == 0) {
            this.f59316a = null;
        } else {
            this.f59316a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59317b = null;
        } else {
            this.f59317b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59318c = null;
        } else {
            this.f59318c = identitySide;
        }
        if ((i11 & 8) == 0) {
            this.f59319d = null;
        } else {
            this.f59319d = list;
        }
        if ((i11 & 16) == 0) {
            this.f59320e = null;
        } else {
            this.f59320e = str3;
        }
        if ((i11 & 32) == 0) {
            this.f59321f = null;
        } else {
            this.f59321f = c29655v0;
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
        if (!(obj instanceof C29307Y0)) {
            return false;
        }
        C29307Y0 c29307y0 = (C29307Y0) obj;
        return Intrinsics.areEqual(this.f59316a, c29307y0.f59316a) && Intrinsics.areEqual(this.f59317b, c29307y0.f59317b) && this.f59318c == c29307y0.f59318c && Intrinsics.areEqual(this.f59319d, c29307y0.f59319d) && Intrinsics.areEqual(this.f59320e, c29307y0.f59320e) && Intrinsics.areEqual(this.f59321f, c29307y0.f59321f);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59315g = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.r5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IdentitySide.Companion.serializer();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.s5
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29307Y0.m69843c();
            }
        }), null, null};
    }

    public C29307Y0(String str, String str2, IdentitySide identitySide, List list, String str3, C29655v0 c29655v0) {
        this.f59316a = str;
        this.f59317b = str2;
        this.f59318c = identitySide;
        this.f59319d = list;
        this.f59320e = str3;
        this.f59321f = c29655v0;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ InterfaceC44951d m69843c() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m69844d() {
        List list = this.f59319d;
        return !(list == null || list.isEmpty());
    }

    public final int hashCode() {
        String str = this.f59316a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59317b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        IdentitySide identitySide = this.f59318c;
        int iHashCode3 = (iHashCode2 + (identitySide == null ? 0 : identitySide.hashCode())) * 31;
        List list = this.f59319d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f59320e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C29655v0 c29655v0 = this.f59321f;
        return iHashCode5 + (c29655v0 != null ? c29655v0.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteIdDoc(idDocType=" + this.f59316a + ", country=" + this.f59317b + ", idDocSubType=" + this.f59318c + ", errors=" + this.f59319d + ", imageId=" + this.f59320e + ", nfcSessionInfo=" + this.f59321f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59316a);
        parcel.writeString(this.f59317b);
        IdentitySide identitySide = this.f59318c;
        if (identitySide == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(identitySide.name());
        }
        parcel.writeStringList(this.f59319d);
        parcel.writeString(this.f59320e);
        C29655v0 c29655v0 = this.f59321f;
        if (c29655v0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29655v0.writeToParcel(parcel, i11);
        }
    }
}
