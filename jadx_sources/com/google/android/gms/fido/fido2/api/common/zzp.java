package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new COSEAlgorithmIdentifier[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return COSEAlgorithmIdentifier.fromCoseValue(parcel.readInt());
        } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e11) {
            throw new RuntimeException(e11);
        }
    }
}
