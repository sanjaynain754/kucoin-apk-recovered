package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28823Q extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28823Q> CREATOR = new C28822P();

    /* JADX INFO: renamed from: d */
    public final C29470F f58625d;

    /* JADX INFO: renamed from: e */
    public final String f58626e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28823Q)) {
            return false;
        }
        C28823Q c28823q = (C28823Q) obj;
        return Intrinsics.areEqual(this.f58625d, c28823q.f58625d) && Intrinsics.areEqual(this.f58626e, c28823q.f58626e);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: c */
    public final C29470F mo69642c() {
        return this.f58625d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58626e;
    }

    public final int hashCode() {
        return this.f58626e.hashCode() + (this.f58625d.hashCode() * 31);
    }

    public final String toString() {
        return "Section(item=" + this.f58625d + ", sectionId=" + this.f58626e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58625d.writeToParcel(parcel, i11);
        parcel.writeString(this.f58626e);
    }

    public C28823Q(C29470F c29470f, String str) {
        super(c29470f);
        this.f58625d = c29470f;
        this.f58626e = str;
    }
}
