package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28863u extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28863u> CREATOR = new C28862t();

    /* JADX INFO: renamed from: d */
    public final C29470F f58702d;

    /* JADX INFO: renamed from: e */
    public final String f58703e;

    /* JADX INFO: renamed from: f */
    public final String f58704f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f58705g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28863u)) {
            return false;
        }
        C28863u c28863u = (C28863u) obj;
        return Intrinsics.areEqual(this.f58702d, c28863u.f58702d) && Intrinsics.areEqual(this.f58703e, c28863u.f58703e) && Intrinsics.areEqual(this.f58704f, c28863u.f58704f) && Intrinsics.areEqual(this.f58705g, c28863u.f58705g);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58705g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58702d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58703e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58704f;
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58703e, this.f58702d.hashCode() * 31, 31);
        String str = this.f58704f;
        int iHashCode = (iM68983a + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.f58705g;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "DateTime(item=" + this.f58702d + ", sectionId=" + this.f58703e + ", value=" + this.f58704f + ", error=" + ((Object) this.f58705g) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58702d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58703e);
        parcel.writeString(this.f58704f);
        TextUtils.writeToParcel(this.f58705g, parcel, i11);
    }

    public C28863u(C29470F c29470f, String str, String str2, CharSequence charSequence) {
        super(c29470f);
        this.f58702d = c29470f;
        this.f58703e = str;
        this.f58704f = str2;
        this.f58705g = charSequence;
    }
}
