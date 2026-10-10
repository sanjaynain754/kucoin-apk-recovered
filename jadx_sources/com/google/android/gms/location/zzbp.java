package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzbp implements Parcelable.Creator<zzbo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo[] newArray(int i11) {
        return new zzbo[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 1;
        int i12 = 1;
        long j11 = -1;
        long j12 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            j12 = SafeParcelReader.readLong(parcel, header);
                        }
                    } else {
                        j11 = SafeParcelReader.readLong(parcel, header);
                    }
                } else {
                    i12 = SafeParcelReader.readInt(parcel, header);
                }
            } else {
                i11 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbo(i11, i12, j11, j12);
    }
}
