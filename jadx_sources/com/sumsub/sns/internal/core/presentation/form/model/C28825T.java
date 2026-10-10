package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28825T extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28825T> CREATOR = new C28824S();

    /* JADX INFO: renamed from: d */
    public final C29470F f58627d;

    /* JADX INFO: renamed from: e */
    public final String f58628e;

    /* JADX INFO: renamed from: f */
    public final String f58629f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f58630g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28825T)) {
            return false;
        }
        C28825T c28825t = (C28825T) obj;
        return Intrinsics.areEqual(this.f58627d, c28825t.f58627d) && Intrinsics.areEqual(this.f58628e, c28825t.f58628e) && Intrinsics.areEqual(this.f58629f, c28825t.f58629f) && Intrinsics.areEqual(this.f58630g, c28825t.f58630g);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58630g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58627d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58628e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58629f;
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58628e, this.f58627d.hashCode() * 31, 31);
        String str = this.f58629f;
        int iHashCode = (iM68983a + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.f58630g;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "Select(item=" + this.f58627d + ", sectionId=" + this.f58628e + ", value=" + this.f58629f + ", error=" + ((Object) this.f58630g) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58627d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58628e);
        parcel.writeString(this.f58629f);
        TextUtils.writeToParcel(this.f58630g, parcel, i11);
    }

    public C28825T(C29470F c29470f, String str, String str2, CharSequence charSequence) {
        super(c29470f);
        this.f58627d = c29470f;
        this.f58628e = str;
        this.f58629f = str2;
        this.f58630g = charSequence;
    }
}
