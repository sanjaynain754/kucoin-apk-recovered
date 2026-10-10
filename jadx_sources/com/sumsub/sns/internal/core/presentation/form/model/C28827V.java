package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28827V extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28827V> CREATOR = new C28826U();

    /* JADX INFO: renamed from: d */
    public final C29470F f58631d;

    /* JADX INFO: renamed from: e */
    public final String f58632e;

    /* JADX INFO: renamed from: f */
    public final String f58633f;

    /* JADX INFO: renamed from: g */
    public final boolean f58634g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f58635h;

    /* JADX INFO: renamed from: i */
    public final String f58636i;

    public /* synthetic */ C28827V(C29470F c29470f, String str, String str2, boolean z11, CharSequence charSequence, int i11) {
        this(c29470f, str, str2, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : charSequence, (String) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28827V)) {
            return false;
        }
        C28827V c28827v = (C28827V) obj;
        return Intrinsics.areEqual(this.f58631d, c28827v.f58631d) && Intrinsics.areEqual(this.f58632e, c28827v.f58632e) && Intrinsics.areEqual(this.f58633f, c28827v.f58633f) && this.f58634g == c28827v.f58634g && Intrinsics.areEqual(this.f58635h, c28827v.f58635h) && Intrinsics.areEqual(this.f58636i, c28827v.f58636i);
    }

    public C28827V(C29470F c29470f, String str, String str2, boolean z11, CharSequence charSequence, String str3) {
        super(c29470f);
        this.f58631d = c29470f;
        this.f58632e = str;
        this.f58633f = str2;
        this.f58634g = z11;
        this.f58635h = charSequence;
        this.f58636i = str3;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58635h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58631d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58632e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58633f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: h */
    public final boolean mo69649h() {
        return this.f58634g;
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58632e, this.f58631d.hashCode() * 31, 31);
        String str = this.f58633f;
        int iM69001a = AbstractC27920h.m69001a(this.f58634g, (iM68983a + (str == null ? 0 : str.hashCode())) * 31, 31);
        CharSequence charSequence = this.f58635h;
        int iHashCode = (iM69001a + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.f58636i;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C29470F c29470f = this.f58631d;
        String str = this.f58632e;
        String str2 = this.f58633f;
        boolean z11 = this.f58634g;
        CharSequence charSequence = this.f58635h;
        return "SelectDropdown(item=" + c29470f + ", sectionId=" + str + ", value=" + str2 + ", isEnabled=" + z11 + ", error=" + ((Object) charSequence) + ", refreshKey=" + this.f58636i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58631d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58632e);
        parcel.writeString(this.f58633f);
        parcel.writeInt(this.f58634g ? 1 : 0);
        TextUtils.writeToParcel(this.f58635h, parcel, i11);
        parcel.writeString(this.f58636i);
    }
}
