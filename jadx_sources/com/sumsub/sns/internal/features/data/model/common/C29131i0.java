package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29131i0 extends AbstractC29149l0 {

    @NotNull
    public static final Parcelable.Creator<C29131i0> CREATOR = new C29125h0();

    /* JADX INFO: renamed from: a */
    public final Throwable f59093a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f59094b;

    /* JADX INFO: renamed from: c */
    public final C29095c0 f59095c;

    public C29131i0(Throwable th2, Parcelable parcelable, int i11) {
        th2 = (i11 & 1) != 0 ? null : th2;
        parcelable = (i11 & 2) != 0 ? null : parcelable;
        this.f59093a = th2;
        this.f59094b = parcelable;
        this.f59095c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0
    /* JADX INFO: renamed from: b */
    public final C29095c0 mo69764b() {
        return this.f59095c;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0
    /* JADX INFO: renamed from: c */
    public final Throwable mo69765c() {
        return this.f59093a;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo69766d() {
        return this.f59094b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f59093a);
        parcel.writeParcelable(this.f59094b, i11);
        C29095c0 c29095c0 = this.f59095c;
        if (c29095c0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29095c0.writeToParcel(parcel, i11);
        }
    }

    public C29131i0(Throwable th2, Parcelable parcelable, C29095c0 c29095c0) {
        this.f59093a = th2;
        this.f59094b = parcelable;
        this.f59095c = c29095c0;
    }
}
