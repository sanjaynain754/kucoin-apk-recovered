package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzs implements Parcelable.Creator<Tile> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Tile[] newArray(int i11) {
        return new Tile[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Tile createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        byte[] bArrCreateByteArray = null;
        int i12 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    }
                } else {
                    i12 = SafeParcelReader.readInt(parcel, header);
                }
            } else {
                i11 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Tile(i11, i12, bArrCreateByteArray);
    }
}
