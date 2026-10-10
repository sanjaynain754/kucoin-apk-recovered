package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28809C extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28809C> CREATOR = new C28808B();

    /* JADX INFO: renamed from: d */
    public final C29470F f58578d;

    /* JADX INFO: renamed from: e */
    public final String f58579e;

    /* JADX INFO: renamed from: f */
    public final String f58580f;

    /* JADX INFO: renamed from: g */
    public final String f58581g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f58582h;

    /* JADX INFO: renamed from: i */
    public final FormItem$ItemState f58583i;

    /* JADX INFO: renamed from: j */
    public final C28807A f58584j;

    /* JADX INFO: renamed from: k */
    public final FormItem$ItemState f58585k;

    /* JADX INFO: renamed from: l */
    public final String f58586l;

    /* JADX INFO: renamed from: m */
    public final String f58587m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28809C)) {
            return false;
        }
        C28809C c28809c = (C28809C) obj;
        return Intrinsics.areEqual(this.f58578d, c28809c.f58578d) && Intrinsics.areEqual(this.f58579e, c28809c.f58579e) && Intrinsics.areEqual(this.f58580f, c28809c.f58580f) && Intrinsics.areEqual(this.f58581g, c28809c.f58581g) && Intrinsics.areEqual(this.f58582h, c28809c.f58582h) && this.f58583i == c28809c.f58583i && Intrinsics.areEqual(this.f58584j, c28809c.f58584j) && this.f58585k == c28809c.f58585k && Intrinsics.areEqual(this.f58586l, c28809c.f58586l) && Intrinsics.areEqual(this.f58587m, c28809c.f58587m);
    }

    /* JADX INFO: renamed from: a */
    public static C28809C m69640a(C28809C c28809c, String str, CharSequence charSequence, FormItem$ItemState formItem$ItemState, C28807A c28807a, FormItem$ItemState formItem$ItemState2, String str2, int i11) {
        C29470F c29470f = c28809c.f58578d;
        String str3 = c28809c.f58579e;
        if ((i11 & 4) != 0) {
            str = c28809c.f58580f;
        }
        String str4 = str;
        String str5 = c28809c.f58581g;
        if ((i11 & 16) != 0) {
            charSequence = c28809c.f58582h;
        }
        CharSequence charSequence2 = charSequence;
        if ((i11 & 32) != 0) {
            formItem$ItemState = c28809c.f58583i;
        }
        return new C28809C(c29470f, str3, str4, str5, charSequence2, formItem$ItemState, (i11 & 64) != 0 ? c28809c.f58584j : c28807a, (i11 & 128) != 0 ? c28809c.f58585k : formItem$ItemState2, (i11 & 256) != 0 ? c28809c.f58586l : str2, c28809c.f58587m);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58582h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58578d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58579e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58580f;
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58579e, this.f58578d.hashCode() * 31, 31);
        String str = this.f58580f;
        int iHashCode = (iM68983a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58581g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.f58582h;
        int iHashCode3 = (this.f58583i.hashCode() + ((iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31;
        C28807A c28807a = this.f58584j;
        int iHashCode4 = (this.f58585k.hashCode() + ((iHashCode3 + (c28807a == null ? 0 : c28807a.hashCode())) * 31)) * 31;
        String str3 = this.f58586l;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f58587m;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        C29470F c29470f = this.f58578d;
        String str = this.f58579e;
        String str2 = this.f58580f;
        String str3 = this.f58581g;
        CharSequence charSequence = this.f58582h;
        return "FileAttachment(item=" + c29470f + ", sectionId=" + str + ", value=" + str2 + ", hint=" + str3 + ", error=" + ((Object) charSequence) + ", fileState=" + this.f58583i + ", fileError=" + this.f58584j + ", state=" + this.f58585k + ", previewUrl=" + this.f58586l + ", title=" + this.f58587m + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58578d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58579e);
        parcel.writeString(this.f58580f);
        parcel.writeString(this.f58581g);
        TextUtils.writeToParcel(this.f58582h, parcel, i11);
        parcel.writeString(this.f58583i.name());
        C28807A c28807a = this.f58584j;
        if (c28807a == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c28807a.f58576a);
            parcel.writeString(c28807a.f58577b);
        }
        parcel.writeString(this.f58585k.name());
        parcel.writeString(this.f58586l);
        parcel.writeString(this.f58587m);
    }

    public C28809C(C29470F c29470f, String str, String str2, String str3, CharSequence charSequence, FormItem$ItemState formItem$ItemState, C28807A c28807a, FormItem$ItemState formItem$ItemState2, String str4, String str5) {
        super(c29470f);
        this.f58578d = c29470f;
        this.f58579e = str;
        this.f58580f = str2;
        this.f58581g = str3;
        this.f58582h = charSequence;
        this.f58583i = formItem$ItemState;
        this.f58584j = c28807a;
        this.f58585k = formItem$ItemState2;
        this.f58586l = str4;
        this.f58587m = str5;
    }
}
