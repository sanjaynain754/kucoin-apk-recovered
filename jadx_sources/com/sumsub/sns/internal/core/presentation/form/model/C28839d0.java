package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28839d0 extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28839d0> CREATOR = new C28837c0();

    /* JADX INFO: renamed from: d */
    public final String f58662d;

    /* JADX INFO: renamed from: e */
    public final String f58663e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28839d0)) {
            return false;
        }
        C28839d0 c28839d0 = (C28839d0) obj;
        return Intrinsics.areEqual(this.f58662d, c28839d0.f58662d) && Intrinsics.areEqual(this.f58663e, c28839d0.f58663e);
    }

    public C28839d0(String str, String str2) {
        super(new C29470F("title_" + AbstractC28458h.m69333a(AbstractC28841e0.f58666c), str, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1020));
        this.f58662d = str;
        this.f58663e = str2;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58663e;
    }

    public final int hashCode() {
        String str = this.f58662d;
        return this.f58663e.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Title(text=" + this.f58662d + ", sectionId=" + this.f58663e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58662d);
        parcel.writeString(this.f58663e);
    }
}
