package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28857o extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28857o> CREATOR = new C28856n();

    /* JADX INFO: renamed from: d */
    public final C29470F f58683d;

    /* JADX INFO: renamed from: e */
    public final String f58684e;

    /* JADX INFO: renamed from: f */
    public final Map f58685f;

    /* JADX INFO: renamed from: g */
    public final List f58686g;

    /* JADX INFO: renamed from: h */
    public final boolean f58687h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f58688i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28857o)) {
            return false;
        }
        C28857o c28857o = (C28857o) obj;
        return Intrinsics.areEqual(this.f58683d, c28857o.f58683d) && Intrinsics.areEqual(this.f58684e, c28857o.f58684e) && Intrinsics.areEqual(this.f58685f, c28857o.f58685f) && Intrinsics.areEqual(this.f58686g, c28857o.f58686g) && this.f58687h == c28857o.f58687h && Intrinsics.areEqual(this.f58688i, c28857o.f58688i);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58688i;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58683d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58684e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: g */
    public final List mo69646g() {
        return this.f58686g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: h */
    public final boolean mo69649h() {
        return this.f58687h;
    }

    public final int hashCode() {
        int iHashCode = (this.f58685f.hashCode() + AbstractC27897U.m68983a(this.f58684e, this.f58683d.hashCode() * 31, 31)) * 31;
        List list = this.f58686g;
        int iM69001a = AbstractC27920h.m69001a(this.f58687h, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        CharSequence charSequence = this.f58688i;
        return iM69001a + (charSequence != null ? charSequence.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58683d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58684e);
        Map map = this.f58685f;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeStringList(this.f58686g);
        parcel.writeInt(this.f58687h ? 1 : 0);
        TextUtils.writeToParcel(this.f58688i, parcel, i11);
    }

    public C28857o(C29470F c29470f, String str, Map map, List list, boolean z11, CharSequence charSequence) {
        super(c29470f);
        this.f58683d = c29470f;
        this.f58684e = str;
        this.f58685f = map;
        this.f58686g = list;
        this.f58687h = z11;
        this.f58688i = charSequence;
    }

    public final String toString() {
        return AbstractC28458h.m69333a(this) + "(s=" + this.f58684e + ", i=" + this.f58683d + ", v=" + this.f58686g + ", countries=" + this.f58685f.size() + ")";
    }
}
