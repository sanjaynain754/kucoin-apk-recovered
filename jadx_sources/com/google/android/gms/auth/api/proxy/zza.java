package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new ProxyRequest[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        Bundle bundleCreateBundle = null;
        long j11 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                if (fieldId != 1000) {
                                    SafeParcelReader.skipUnknownField(parcel, header);
                                } else {
                                    i11 = SafeParcelReader.readInt(parcel, header);
                                }
                            } else {
                                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                            }
                        } else {
                            bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                        }
                    } else {
                        j11 = SafeParcelReader.readLong(parcel, header);
                    }
                } else {
                    i12 = SafeParcelReader.readInt(parcel, header);
                }
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ProxyRequest(i11, strCreateString, i12, j11, bArrCreateByteArray, bundleCreateBundle);
    }
}
