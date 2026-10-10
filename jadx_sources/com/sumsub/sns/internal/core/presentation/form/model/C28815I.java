package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28815I extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28815I> CREATOR = new C28814H();

    /* JADX INFO: renamed from: d */
    public final String f58591d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f58592e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f58593f;

    /* JADX INFO: renamed from: g */
    public final C28850j f58594g;

    /* JADX INFO: renamed from: h */
    public final String f58595h;

    public /* synthetic */ C28815I(String str, String str2, C28850j c28850j) {
        this("geo+poa", str, str2, c28850j, "info_banner_" + AbstractC28458h.m69333a(AbstractC28841e0.f58666c));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28815I)) {
            return false;
        }
        C28815I c28815i = (C28815I) obj;
        return Intrinsics.areEqual(this.f58591d, c28815i.f58591d) && Intrinsics.areEqual(this.f58592e, c28815i.f58592e) && Intrinsics.areEqual(this.f58593f, c28815i.f58593f) && Intrinsics.areEqual(this.f58594g, c28815i.f58594g) && Intrinsics.areEqual(this.f58595h, c28815i.f58595h);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58591d;
    }

    public final int hashCode() {
        int iHashCode = this.f58591d.hashCode() * 31;
        CharSequence charSequence = this.f58592e;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f58593f;
        return this.f58595h.hashCode() + ((this.f58594g.hashCode() + ((iHashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f58591d;
        CharSequence charSequence = this.f58592e;
        CharSequence charSequence2 = this.f58593f;
        return "InfoBanner(sectionId=" + str + ", text=" + ((Object) charSequence) + ", actionText=" + ((Object) charSequence2) + ", action=" + this.f58594g + ", itemId=" + this.f58595h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58591d);
        TextUtils.writeToParcel(this.f58592e, parcel, i11);
        TextUtils.writeToParcel(this.f58593f, parcel, i11);
        C28850j c28850j = this.f58594g;
        parcel.writeString(c28850j.f58677a);
        parcel.writeString(c28850j.f58678b);
        parcel.writeString(this.f58595h);
    }

    public C28815I(String str, CharSequence charSequence, CharSequence charSequence2, C28850j c28850j, String str2) {
        super(new C29470F(str2, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1022));
        this.f58591d = str;
        this.f58592e = charSequence;
        this.f58593f = charSequence2;
        this.f58594g = c28850j;
        this.f58595h = str2;
    }
}
