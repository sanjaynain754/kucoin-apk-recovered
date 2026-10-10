package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28854l extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28854l> CREATOR = new C28852k();

    /* JADX INFO: renamed from: d */
    public final C29470F f58679d;

    /* JADX INFO: renamed from: e */
    public final String f58680e;

    /* JADX INFO: renamed from: f */
    public final String f58681f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f58682g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28854l)) {
            return false;
        }
        C28854l c28854l = (C28854l) obj;
        return Intrinsics.areEqual(this.f58679d, c28854l.f58679d) && Intrinsics.areEqual(this.f58680e, c28854l.f58680e) && Intrinsics.areEqual(this.f58681f, c28854l.f58681f) && Intrinsics.areEqual(this.f58682g, c28854l.f58682g);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58682g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58679d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58680e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58681f;
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58680e, this.f58679d.hashCode() * 31, 31);
        String str = this.f58681f;
        int iHashCode = (iM68983a + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.f58682g;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "Bool(item=" + this.f58679d + ", sectionId=" + this.f58680e + ", value=" + this.f58681f + ", error=" + ((Object) this.f58682g) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58679d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58680e);
        parcel.writeString(this.f58681f);
        TextUtils.writeToParcel(this.f58682g, parcel, i11);
    }

    public C28854l(C29470F c29470f, String str, String str2, CharSequence charSequence) {
        super(c29470f);
        this.f58679d = c29470f;
        this.f58680e = str;
        this.f58681f = str2;
        this.f58682g = charSequence;
    }
}
