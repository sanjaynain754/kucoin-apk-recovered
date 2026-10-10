package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzq[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        byte[] bArrCreateByteArray3 = null;
        long j11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            bArrCreateByteArray3 = SafeParcelReader.createByteArray(parcel, header);
                        }
                    } else {
                        bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    }
                } else {
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                }
            } else {
                j11 = SafeParcelReader.readLong(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzq(j11, bArrCreateByteArray, bArrCreateByteArray2, bArrCreateByteArray3);
    }
}
