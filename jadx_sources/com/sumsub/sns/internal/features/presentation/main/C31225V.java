package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31225V extends AbstractC31234Y {

    @NotNull
    public static final Parcelable.Creator<C31225V> CREATOR = new C31222U();

    /* JADX INFO: renamed from: c */
    public final C29586o0 f63166c;

    public C31225V(C29586o0 c29586o0) {
        super(null, 3);
        this.f63166c = c29586o0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31225V) && Intrinsics.areEqual(this.f63166c, ((C31225V) obj).f63166c);
    }

    public final int hashCode() {
        return this.f63166c.hashCode();
    }

    public final String toString() {
        return "Restrictions(restriction=" + this.f63166c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f63166c.writeToParcel(parcel, i11);
    }
}
