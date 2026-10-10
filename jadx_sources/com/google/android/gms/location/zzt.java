package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzt implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z11 = true;
        long j11 = 50;
        float f11 = 0.0f;
        long j12 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z11 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                j11 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 3) {
                f11 = SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId == 4) {
                j12 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i11 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzs(z11, j11, f11, j12, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int i11) {
        return new zzs[i11];
    }
}
