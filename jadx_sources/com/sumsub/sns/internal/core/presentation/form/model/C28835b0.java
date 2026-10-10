package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28835b0 extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28835b0> CREATOR = new C28833a0();

    /* JADX INFO: renamed from: d */
    public final C29470F f58654d;

    /* JADX INFO: renamed from: e */
    public final String f58655e;

    /* JADX INFO: renamed from: f */
    public final String f58656f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f58657g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28835b0)) {
            return false;
        }
        C28835b0 c28835b0 = (C28835b0) obj;
        return Intrinsics.areEqual(this.f58654d, c28835b0.f58654d) && Intrinsics.areEqual(this.f58655e, c28835b0.f58655e) && Intrinsics.areEqual(this.f58656f, c28835b0.f58656f) && Intrinsics.areEqual(this.f58657g, c28835b0.f58657g);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58657g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58654d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58655e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58656f;
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58655e, this.f58654d.hashCode() * 31, 31);
        String str = this.f58656f;
        int iHashCode = (iM68983a + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.f58657g;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "TextArea(item=" + this.f58654d + ", sectionId=" + this.f58655e + ", value=" + this.f58656f + ", error=" + ((Object) this.f58657g) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58654d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58655e);
        parcel.writeString(this.f58656f);
        TextUtils.writeToParcel(this.f58657g, parcel, i11);
    }

    public C28835b0(C29470F c29470f, String str, String str2, CharSequence charSequence) {
        super(c29470f);
        this.f58654d = c29470f;
        this.f58655e = str;
        this.f58656f = str2;
        this.f58657g = charSequence;
    }
}
