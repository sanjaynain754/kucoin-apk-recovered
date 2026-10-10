package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28861s extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28861s> CREATOR = new C28860r();

    /* JADX INFO: renamed from: d */
    public final C29470F f58696d;

    /* JADX INFO: renamed from: e */
    public final String f58697e;

    /* JADX INFO: renamed from: f */
    public final boolean f58698f;

    /* JADX INFO: renamed from: g */
    public final String f58699g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f58700h;

    /* JADX INFO: renamed from: i */
    public final boolean f58701i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28861s)) {
            return false;
        }
        C28861s c28861s = (C28861s) obj;
        return Intrinsics.areEqual(this.f58696d, c28861s.f58696d) && Intrinsics.areEqual(this.f58697e, c28861s.f58697e) && this.f58698f == c28861s.f58698f && Intrinsics.areEqual(this.f58699g, c28861s.f58699g) && Intrinsics.areEqual(this.f58700h, c28861s.f58700h) && this.f58701i == c28861s.f58701i;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58700h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58696d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58697e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58699g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: h */
    public final boolean mo69649h() {
        return this.f58701i;
    }

    public final int hashCode() {
        int iM69001a = AbstractC27920h.m69001a(this.f58698f, AbstractC27897U.m68983a(this.f58697e, this.f58696d.hashCode() * 31, 31), 31);
        String str = this.f58699g;
        int iHashCode = (iM69001a + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.f58700h;
        return Boolean.hashCode(this.f58701i) + ((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    public final String toString() {
        C29470F c29470f = this.f58696d;
        String str = this.f58697e;
        boolean z11 = this.f58698f;
        String str2 = this.f58699g;
        CharSequence charSequence = this.f58700h;
        return "Date(item=" + c29470f + ", sectionId=" + str + ", onlyPastDates=" + z11 + ", value=" + str2 + ", error=" + ((Object) charSequence) + ", isEnabled=" + this.f58701i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58696d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58697e);
        parcel.writeInt(this.f58698f ? 1 : 0);
        parcel.writeString(this.f58699g);
        TextUtils.writeToParcel(this.f58700h, parcel, i11);
        parcel.writeInt(this.f58701i ? 1 : 0);
    }

    public C28861s(C29470F c29470f, String str, boolean z11, String str2, CharSequence charSequence, boolean z12) {
        super(c29470f);
        this.f58696d = c29470f;
        this.f58697e = str;
        this.f58698f = z11;
        this.f58699g = str2;
        this.f58700h = charSequence;
        this.f58701i = z12;
    }
}
