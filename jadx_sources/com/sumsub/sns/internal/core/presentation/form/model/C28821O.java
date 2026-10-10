package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28821O extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28821O> CREATOR = new C28820N();

    /* JADX INFO: renamed from: d */
    public final String f58616d;

    /* JADX INFO: renamed from: e */
    public final C29470F f58617e;

    /* JADX INFO: renamed from: f */
    public final Map f58618f;

    /* JADX INFO: renamed from: g */
    public final Map f58619g;

    /* JADX INFO: renamed from: h */
    public final String f58620h;

    /* JADX INFO: renamed from: i */
    public final boolean f58621i;

    /* JADX INFO: renamed from: j */
    public final String f58622j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f58623k;

    /* JADX INFO: renamed from: l */
    public final boolean f58624l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28821O)) {
            return false;
        }
        C28821O c28821o = (C28821O) obj;
        return Intrinsics.areEqual(this.f58616d, c28821o.f58616d) && Intrinsics.areEqual(this.f58617e, c28821o.f58617e) && Intrinsics.areEqual(this.f58618f, c28821o.f58618f) && Intrinsics.areEqual(this.f58619g, c28821o.f58619g) && Intrinsics.areEqual(this.f58620h, c28821o.f58620h) && this.f58621i == c28821o.f58621i && Intrinsics.areEqual(this.f58622j, c28821o.f58622j) && Intrinsics.areEqual(this.f58623k, c28821o.f58623k) && this.f58624l == c28821o.f58624l;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58623k;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58617e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58616d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58622j;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: h */
    public final boolean mo69649h() {
        return this.f58624l;
    }

    public final int hashCode() {
        int iHashCode = (this.f58619g.hashCode() + ((this.f58618f.hashCode() + ((this.f58617e.hashCode() + (this.f58616d.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f58620h;
        int iM69001a = AbstractC27920h.m69001a(this.f58621i, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f58622j;
        int iHashCode2 = (iM69001a + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.f58623k;
        return Boolean.hashCode(this.f58624l) + ((iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58616d);
        this.f58617e.writeToParcel(parcel, i11);
        Map map = this.f58618f;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Map map2 = this.f58619g;
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            C29405l0 c29405l0 = (C29405l0) entry2.getValue();
            parcel.writeString(c29405l0.f59409a);
            parcel.writeStringList(c29405l0.f59410b);
        }
        parcel.writeString(this.f58620h);
        parcel.writeInt(this.f58621i ? 1 : 0);
        parcel.writeString(this.f58622j);
        TextUtils.writeToParcel(this.f58623k, parcel, i11);
        parcel.writeInt(this.f58624l ? 1 : 0);
    }

    public C28821O(String str, C29470F c29470f, Map map, Map map2, String str2, boolean z11, String str3, CharSequence charSequence, boolean z12) {
        super(c29470f);
        this.f58616d = str;
        this.f58617e = c29470f;
        this.f58618f = map;
        this.f58619g = map2;
        this.f58620h = str2;
        this.f58621i = z11;
        this.f58622j = str3;
        this.f58623k = charSequence;
        this.f58624l = z12;
    }

    public final String toString() {
        return AbstractC28458h.m69333a(this) + " (s=" + this.f58616d + ", i=" + this.f58617e + ", v=" + this.f58622j + ", countries=" + this.f58618f.size() + ")";
    }
}
