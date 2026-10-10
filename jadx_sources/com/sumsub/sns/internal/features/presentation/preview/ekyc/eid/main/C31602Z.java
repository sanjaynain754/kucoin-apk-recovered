package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31602Z extends AbstractC31640o0 {

    @NotNull
    public static final Parcelable.Creator<C31602Z> CREATOR = new C31601Y();

    /* JADX INFO: renamed from: a */
    public final AbstractC31595T f64199a;

    /* JADX INFO: renamed from: b */
    public final boolean f64200b;

    public C31602Z(AbstractC31595T abstractC31595T) {
        this.f64199a = abstractC31595T;
        this.f64200b = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31602Z)) {
            return false;
        }
        C31602Z c31602z = (C31602Z) obj;
        return Intrinsics.areEqual(this.f64199a, c31602z.f64199a) && this.f64200b == c31602z.f64200b;
    }

    public C31602Z(AbstractC31595T abstractC31595T, boolean z11) {
        this.f64199a = abstractC31595T;
        this.f64200b = z11;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64200b) + (this.f64199a.hashCode() * 31);
    }

    public final String toString() {
        return "CanPrompt(action=" + this.f64199a + ", wrongCan=" + this.f64200b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f64199a, i11);
        parcel.writeInt(this.f64200b ? 1 : 0);
    }
}
