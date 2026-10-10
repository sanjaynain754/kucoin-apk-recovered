package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28811E extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28811E> CREATOR = new C28810D();

    /* JADX INFO: renamed from: d */
    public final String f58588d;

    /* JADX INFO: renamed from: e */
    public final C29470F f58589e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28811E)) {
            return false;
        }
        C28811E c28811e = (C28811E) obj;
        return Intrinsics.areEqual(this.f58588d, c28811e.f58588d) && Intrinsics.areEqual(this.f58589e, c28811e.f58589e);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58589e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58588d;
    }

    public final int hashCode() {
        return this.f58589e.hashCode() + (this.f58588d.hashCode() * 31);
    }

    public final String toString() {
        return "Hidden(sectionId=" + this.f58588d + ", item=" + this.f58589e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58588d);
        this.f58589e.writeToParcel(parcel, i11);
    }

    public C28811E(C29470F c29470f, String str) {
        super(c29470f);
        this.f58588d = str;
        this.f58589e = c29470f;
    }
}
