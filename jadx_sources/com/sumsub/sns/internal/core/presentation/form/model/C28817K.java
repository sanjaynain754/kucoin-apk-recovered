package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28817K extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28817K> CREATOR = new C28816J();

    /* JADX INFO: renamed from: d */
    public final C29470F f58596d;

    /* JADX INFO: renamed from: e */
    public final String f58597e;

    /* JADX INFO: renamed from: f */
    public final List f58598f;

    /* JADX INFO: renamed from: g */
    public final String f58599g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f58600h;

    /* JADX INFO: renamed from: i */
    public final boolean f58601i;

    /* JADX INFO: renamed from: j */
    public final List f58602j;

    /* JADX INFO: renamed from: k */
    public final List f58603k;

    /* JADX INFO: renamed from: l */
    public final FormItem$ItemState f58604l;

    /* JADX INFO: renamed from: m */
    public final Map f58605m;

    /* JADX INFO: renamed from: n */
    public final String f58606n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28817K)) {
            return false;
        }
        C28817K c28817k = (C28817K) obj;
        return Intrinsics.areEqual(this.f58596d, c28817k.f58596d) && Intrinsics.areEqual(this.f58597e, c28817k.f58597e) && Intrinsics.areEqual(this.f58598f, c28817k.f58598f) && Intrinsics.areEqual(this.f58599g, c28817k.f58599g) && Intrinsics.areEqual(this.f58600h, c28817k.f58600h) && this.f58601i == c28817k.f58601i && Intrinsics.areEqual(this.f58602j, c28817k.f58602j) && Intrinsics.areEqual(this.f58603k, c28817k.f58603k) && this.f58604l == c28817k.f58604l && Intrinsics.areEqual(this.f58605m, c28817k.f58605m) && Intrinsics.areEqual(this.f58606n, c28817k.f58606n);
    }

    /* JADX INFO: renamed from: a */
    public static C28817K m69645a(C28817K c28817k, List list, CharSequence charSequence, List list2, ArrayList arrayList, FormItem$ItemState formItem$ItemState, Map map, int i11) {
        C29470F c29470f = c28817k.f58596d;
        String str = c28817k.f58597e;
        if ((i11 & 4) != 0) {
            list = c28817k.f58598f;
        }
        List list3 = list;
        String str2 = c28817k.f58599g;
        if ((i11 & 16) != 0) {
            charSequence = c28817k.f58600h;
        }
        return new C28817K(c29470f, str, list3, str2, charSequence, c28817k.f58601i, (i11 & 64) != 0 ? c28817k.f58602j : list2, (i11 & 128) != 0 ? c28817k.f58603k : arrayList, (i11 & 256) != 0 ? c28817k.f58604l : formItem$ItemState, (i11 & 512) != 0 ? c28817k.f58605m : map, c28817k.f58606n);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58600h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58596d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58597e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: g */
    public final List mo69646g() {
        return this.f58598f;
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f58597e, this.f58596d.hashCode() * 31, 31);
        List list = this.f58598f;
        int iHashCode = (iM68983a + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f58599g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.f58600h;
        int iHashCode3 = (this.f58602j.hashCode() + AbstractC27920h.m69001a(this.f58601i, (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31)) * 31;
        List list2 = this.f58603k;
        int iHashCode4 = (this.f58604l.hashCode() + ((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        Map map = this.f58605m;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f58606n;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        C29470F c29470f = this.f58596d;
        String str = this.f58597e;
        List list = this.f58598f;
        String str2 = this.f58599g;
        CharSequence charSequence = this.f58600h;
        return "MultiFileAttachments(item=" + c29470f + ", sectionId=" + str + ", values=" + list + ", hint=" + str2 + ", error=" + ((Object) charSequence) + ", isMultivalued=" + this.f58601i + ", fileStates=" + this.f58602j + ", failedFiles=" + this.f58603k + ", state=" + this.f58604l + ", previewUrls=" + this.f58605m + ", title=" + this.f58606n + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58596d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58597e);
        parcel.writeStringList(this.f58598f);
        parcel.writeString(this.f58599g);
        TextUtils.writeToParcel(this.f58600h, parcel, i11);
        parcel.writeInt(this.f58601i ? 1 : 0);
        List list = this.f58602j;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((FormItem$ItemState) it.next()).name());
        }
        List<C28807A> list2 = this.f58603k;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (C28807A c28807a : list2) {
                parcel.writeString(c28807a.f58576a);
                parcel.writeString(c28807a.f58577b);
            }
        }
        parcel.writeString(this.f58604l.name());
        Map map = this.f58605m;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.f58606n);
    }

    public C28817K(C29470F c29470f, String str, List list, String str2, CharSequence charSequence, boolean z11, List list2, List list3, FormItem$ItemState formItem$ItemState, Map map, String str3) {
        super(c29470f);
        this.f58596d = c29470f;
        this.f58597e = str;
        this.f58598f = list;
        this.f58599g = str2;
        this.f58600h = charSequence;
        this.f58601i = z11;
        this.f58602j = list2;
        this.f58603k = list3;
        this.f58604l = formItem$ItemState;
        this.f58605m = map;
        this.f58606n = str3;
    }
}
