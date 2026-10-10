package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzdd[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        String strCreateString = null;
        boolean z11 = false;
        long j11 = 0;
        long j12 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 7) {
                            if (fieldId != 8) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                strCreateString = SafeParcelReader.createString(parcel, header);
                            }
                        } else {
                            bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                        }
                    } else {
                        z11 = SafeParcelReader.readBoolean(parcel, header);
                    }
                } else {
                    j12 = SafeParcelReader.readLong(parcel, header);
                }
            } else {
                j11 = SafeParcelReader.readLong(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzdd(j11, j12, z11, bundleCreateBundle, strCreateString);
    }
}
