package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzn implements Parcelable.Creator<StreetViewPanoramaCamera> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaCamera[] newArray(int i11) {
        return new StreetViewPanoramaCamera[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ StreetViewPanoramaCamera createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        f13 = SafeParcelReader.readFloat(parcel, header);
                    }
                } else {
                    f12 = SafeParcelReader.readFloat(parcel, header);
                }
            } else {
                f11 = SafeParcelReader.readFloat(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new StreetViewPanoramaCamera(f11, f12, f13);
    }
}
