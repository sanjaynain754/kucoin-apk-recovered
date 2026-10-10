package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28831Z extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28831Z> CREATOR = new C28830Y();

    /* JADX INFO: renamed from: d */
    public final C29470F f58639d;

    /* JADX INFO: renamed from: e */
    public final String f58640e;

    /* JADX INFO: renamed from: f */
    public final String f58641f;

    /* JADX INFO: renamed from: g */
    public final boolean f58642g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f58643h;

    /* JADX INFO: renamed from: i */
    public final List f58644i;

    /* JADX INFO: renamed from: j */
    public final boolean f58645j;

    /* JADX INFO: renamed from: k */
    public final String f58646k;

    public /* synthetic */ C28831Z(C29470F c29470f, String str, String str2, boolean z11, CharSequence charSequence, List list, String str3, int i11) {
        this(c29470f, str, str2, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : charSequence, (i11 & 32) != 0 ? null : list, (i11 & 64) == 0, (i11 & 128) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28831Z)) {
            return false;
        }
        C28831Z c28831z = (C28831Z) obj;
        return Intrinsics.areEqual(this.f58639d, c28831z.f58639d) && Intrinsics.areEqual(this.f58640e, c28831z.f58640e) && Intrinsics.areEqual(this.f58641f, c28831z.f58641f) && this.f58642g == c28831z.f58642g && Intrinsics.areEqual(this.f58643h, c28831z.f58643h) && Intrinsics.areEqual(this.f58644i, c28831z.f58644i) && this.f58645j == c28831z.f58645j && Intrinsics.areEqual(this.f58646k, c28831z.f58646k);
    }

    public C28831Z(C29470F c29470f, String str, String str2, boolean z11, CharSequence charSequence, List list, boolean z12, String str3) {
        super(c29470f);
        this.f58639d = c29470f;
        this.f58640e = str;
        this.f58641f = str2;
        this.f58642g = z11;
        this.f58643h = charSequence;
        this.f58644i = list;
        this.f58645j = z12;
        this.f58646k = str3;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58643h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58639d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58640e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58641f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: h */
    public final boolean mo69649h() {
        return this.f58642g;
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58640e, this.f58639d.hashCode() * 31, 31);
        String str = this.f58641f;
        int iM69001a = AbstractC27920h.m69001a(this.f58642g, (iM68983a + (str == null ? 0 : str.hashCode())) * 31, 31);
        CharSequence charSequence = this.f58643h;
        int iHashCode = (iM69001a + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List list = this.f58644i;
        int iM69001a2 = AbstractC27920h.m69001a(this.f58645j, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str2 = this.f58646k;
        return iM69001a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C29470F c29470f = this.f58639d;
        String str = this.f58640e;
        String str2 = this.f58641f;
        boolean z11 = this.f58642g;
        CharSequence charSequence = this.f58643h;
        return "Text(item=" + c29470f + ", sectionId=" + str + ", value=" + str2 + ", isEnabled=" + z11 + ", error=" + ((Object) charSequence) + ", masks=" + this.f58644i + ", isCompact=" + this.f58645j + ", refreshKey=" + this.f58646k + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58639d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58640e);
        parcel.writeString(this.f58641f);
        parcel.writeInt(this.f58642g ? 1 : 0);
        TextUtils.writeToParcel(this.f58643h, parcel, i11);
        parcel.writeStringList(this.f58644i);
        parcel.writeInt(this.f58645j ? 1 : 0);
        parcel.writeString(this.f58646k);
    }
}
