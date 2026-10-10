package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.i1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30568i1 extends AbstractC30574j1 {

    @NotNull
    public static final Parcelable.Creator<C30568i1> CREATOR = new C30562h1();

    /* JADX INFO: renamed from: a */
    public final String f61732a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30568i1) && Intrinsics.areEqual(this.f61732a, ((C30568i1) obj).f61732a);
    }

    public final int hashCode() {
        return this.f61732a.hashCode();
    }

    public final String toString() {
        return "VideoRecordingInterrupted(message=" + this.f61732a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f61732a);
    }

    public C30568i1(String str) {
        this.f61732a = str;
    }
}
