package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.prooface.AbstractC29807J;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.q3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29181q3 extends AbstractC29186r3 {

    @NotNull
    public static final Parcelable.Creator<C29181q3> CREATOR = new C29176p3();

    /* JADX INFO: renamed from: a */
    public final AbstractC29807J f59178a;

    /* JADX INFO: renamed from: b */
    public final C29070X f59179b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29181q3)) {
            return false;
        }
        C29181q3 c29181q3 = (C29181q3) obj;
        return Intrinsics.areEqual(this.f59178a, c29181q3.f59178a) && Intrinsics.areEqual(this.f59179b, c29181q3.f59179b);
    }

    public final int hashCode() {
        return this.f59179b.f59014a.hashCode() + (this.f59178a.hashCode() * 31);
    }

    public final String toString() {
        return "FaceDetection(reason=" + this.f59178a + ", documentType=" + this.f59179b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f59178a);
        parcel.writeString(this.f59179b.f59014a);
    }

    public C29181q3(AbstractC29807J abstractC29807J, C29070X c29070x) {
        this.f59178a = abstractC29807J;
        this.f59179b = c29070x;
    }
}
