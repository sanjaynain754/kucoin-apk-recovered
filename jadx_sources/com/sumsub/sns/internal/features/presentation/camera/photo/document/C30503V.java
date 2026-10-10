package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30503V extends AbstractC30506W {

    @NotNull
    public static final Parcelable.Creator<C30503V> CREATOR = new C30500U();

    /* JADX INFO: renamed from: a */
    public final String f61587a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30503V) && Intrinsics.areEqual(this.f61587a, ((C30503V) obj).f61587a);
    }

    public final int hashCode() {
        return this.f61587a.hashCode();
    }

    public final String toString() {
        return "VideoRecordingInterrupted(message=" + this.f61587a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f61587a);
    }

    public C30503V(String str) {
        this.f61587a = str;
    }
}
