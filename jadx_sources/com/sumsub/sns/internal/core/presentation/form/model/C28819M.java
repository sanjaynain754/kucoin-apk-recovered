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

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28819M extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28819M> CREATOR = new C28818L();

    /* JADX INFO: renamed from: d */
    public final C29470F f58608d;

    /* JADX INFO: renamed from: e */
    public final String f58609e;

    /* JADX INFO: renamed from: f */
    public final List f58610f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f58611g;

    /* JADX INFO: renamed from: h */
    public final boolean f58612h;

    /* JADX INFO: renamed from: i */
    public final String f58613i;

    /* JADX INFO: renamed from: j */
    public final boolean f58614j;

    /* JADX INFO: renamed from: k */
    public final boolean f58615k;

    public /* synthetic */ C28819M(C29470F c29470f, String str, List list, String str2, int i11) {
        this(c29470f, str, list, null, true, (i11 & 32) != 0 ? null : str2, (i11 & 64) == 0, (i11 & 128) == 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28819M)) {
            return false;
        }
        C28819M c28819m = (C28819M) obj;
        return Intrinsics.areEqual(this.f58608d, c28819m.f58608d) && Intrinsics.areEqual(this.f58609e, c28819m.f58609e) && Intrinsics.areEqual(this.f58610f, c28819m.f58610f) && Intrinsics.areEqual(this.f58611g, c28819m.f58611g) && this.f58612h == c28819m.f58612h && Intrinsics.areEqual(this.f58613i, c28819m.f58613i) && this.f58614j == c28819m.f58614j && this.f58615k == c28819m.f58615k;
    }

    public C28819M(C29470F c29470f, String str, List list, CharSequence charSequence, boolean z11, String str2, boolean z12, boolean z13) {
        super(c29470f);
        this.f58608d = c29470f;
        this.f58609e = str;
        this.f58610f = list;
        this.f58611g = charSequence;
        this.f58612h = z11;
        this.f58613i = str2;
        this.f58614j = z12;
        this.f58615k = z13;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58611g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58608d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58609e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: e */
    public final String mo69647e() {
        return this.f58613i;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: g */
    public final List mo69646g() {
        return this.f58610f;
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58609e, this.f58608d.hashCode() * 31, 31);
        List list = this.f58610f;
        int iHashCode = (iM68983a + (list == null ? 0 : list.hashCode())) * 31;
        CharSequence charSequence = this.f58611g;
        int iM69001a = AbstractC27920h.m69001a(this.f58612h, (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        String str = this.f58613i;
        return Boolean.hashCode(this.f58615k) + AbstractC27920h.m69001a(this.f58614j, (iM69001a + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: i */
    public final boolean mo69648i() {
        return this.f58614j;
    }

    public final String toString() {
        C29470F c29470f = this.f58608d;
        String str = this.f58609e;
        List list = this.f58610f;
        CharSequence charSequence = this.f58611g;
        return "MultiSelect(item=" + c29470f + ", sectionId=" + str + ", values=" + list + ", error=" + ((Object) charSequence) + ", isMultivalued=" + this.f58612h + ", titleIcon=" + this.f58613i + ", isTitleClickable=" + this.f58614j + ", isGrouped=" + this.f58615k + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58608d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58609e);
        parcel.writeStringList(this.f58610f);
        TextUtils.writeToParcel(this.f58611g, parcel, i11);
        parcel.writeInt(this.f58612h ? 1 : 0);
        parcel.writeString(this.f58613i);
        parcel.writeInt(this.f58614j ? 1 : 0);
        parcel.writeInt(this.f58615k ? 1 : 0);
    }
}
