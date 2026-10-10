package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.core.data.model.SNSException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29143k0 extends AbstractC29149l0 {

    @NotNull
    public static final Parcelable.Creator<C29143k0> CREATOR = new C29137j0();

    /* JADX INFO: renamed from: a */
    public final String f59123a;

    /* JADX INFO: renamed from: b */
    public final SNSException.Api f59124b;

    /* JADX INFO: renamed from: c */
    public final Parcelable f59125c;

    /* JADX INFO: renamed from: d */
    public final C29095c0 f59126d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0
    /* JADX INFO: renamed from: b */
    public final C29095c0 mo69764b() {
        return this.f59126d;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0
    /* JADX INFO: renamed from: c */
    public final Throwable mo69765c() {
        return this.f59124b;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo69766d() {
        return this.f59125c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59123a);
        parcel.writeSerializable(this.f59124b);
        parcel.writeParcelable(this.f59125c, i11);
        C29095c0 c29095c0 = this.f59126d;
        if (c29095c0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29095c0.writeToParcel(parcel, i11);
        }
    }

    public C29143k0(String str, SNSException.Api api, Parcelable parcelable, C29095c0 c29095c0) {
        this.f59123a = str;
        this.f59124b = api;
        this.f59125c = parcelable;
        this.f59126d = c29095c0;
    }
}
