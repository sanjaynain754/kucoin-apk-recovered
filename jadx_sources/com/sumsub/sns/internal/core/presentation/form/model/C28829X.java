package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28829X extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28829X> CREATOR = new C28828W();

    /* JADX INFO: renamed from: d */
    public final String f58637d;

    /* JADX INFO: renamed from: e */
    public final String f58638e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28829X)) {
            return false;
        }
        C28829X c28829x = (C28829X) obj;
        return Intrinsics.areEqual(this.f58637d, c28829x.f58637d) && Intrinsics.areEqual(this.f58638e, c28829x.f58638e);
    }

    public C28829X(String str, String str2) {
        super(new C29470F("subtitle_" + AbstractC28458h.m69333a(AbstractC28841e0.f58666c), str, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1020));
        this.f58637d = str;
        this.f58638e = str2;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58638e;
    }

    public final int hashCode() {
        String str = this.f58637d;
        return this.f58638e.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Subtitle(text=" + this.f58637d + ", sectionId=" + this.f58638e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58637d);
        parcel.writeString(this.f58638e);
    }
}
