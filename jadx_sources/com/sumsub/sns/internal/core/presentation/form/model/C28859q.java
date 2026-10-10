package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28859q extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28859q> CREATOR = new C28858p();

    /* JADX INFO: renamed from: d */
    public final String f58689d;

    /* JADX INFO: renamed from: e */
    public final C29470F f58690e;

    /* JADX INFO: renamed from: f */
    public final Map f58691f;

    /* JADX INFO: renamed from: g */
    public final String f58692g;

    /* JADX INFO: renamed from: h */
    public final boolean f58693h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f58694i;

    /* JADX INFO: renamed from: j */
    public final String f58695j;

    public /* synthetic */ C28859q(String str, C29470F c29470f, Map map, String str2, boolean z11, CharSequence charSequence, int i11) {
        this(str, c29470f, map, str2, z11, (i11 & 32) != 0 ? null : charSequence, (String) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28859q)) {
            return false;
        }
        C28859q c28859q = (C28859q) obj;
        return Intrinsics.areEqual(this.f58689d, c28859q.f58689d) && Intrinsics.areEqual(this.f58690e, c28859q.f58690e) && Intrinsics.areEqual(this.f58691f, c28859q.f58691f) && Intrinsics.areEqual(this.f58692g, c28859q.f58692g) && this.f58693h == c28859q.f58693h && Intrinsics.areEqual(this.f58694i, c28859q.f58694i) && Intrinsics.areEqual(this.f58695j, c28859q.f58695j);
    }

    public C28859q(String str, C29470F c29470f, Map map, String str2, boolean z11, CharSequence charSequence, String str3) {
        super(c29470f);
        this.f58689d = str;
        this.f58690e = c29470f;
        this.f58691f = map;
        this.f58692g = str2;
        this.f58693h = z11;
        this.f58694i = charSequence;
        this.f58695j = str3;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69641b() {
        return this.f58694i;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58690e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58689d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: f */
    public final String mo69644f() {
        return this.f58692g;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: h */
    public final boolean mo69649h() {
        return this.f58693h;
    }

    public final int hashCode() {
        int iHashCode = (this.f58691f.hashCode() + ((this.f58690e.hashCode() + (this.f58689d.hashCode() * 31)) * 31)) * 31;
        String str = this.f58692g;
        int iM69001a = AbstractC27920h.m69001a(this.f58693h, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        CharSequence charSequence = this.f58694i;
        int iHashCode2 = (iM69001a + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.f58695j;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58689d);
        this.f58690e.writeToParcel(parcel, i11);
        Map map = this.f58691f;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f58692g);
        parcel.writeInt(this.f58693h ? 1 : 0);
        TextUtils.writeToParcel(this.f58694i, parcel, i11);
        parcel.writeString(this.f58695j);
    }

    public final String toString() {
        return AbstractC28458h.m69333a(this) + "(s=" + this.f58689d + ", i=" + this.f58690e + ", v=" + this.f58692g + ", countries=" + this.f58691f.size() + ")";
    }
}
