package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzw implements Parcelable.Creator<VisibleRegion> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VisibleRegion[] newArray(int i11) {
        return new VisibleRegion[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ VisibleRegion createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            if (fieldId != 6) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, header, LatLngBounds.CREATOR);
                            }
                        } else {
                            latLng4 = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                        }
                    } else {
                        latLng3 = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    }
                } else {
                    latLng2 = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                }
            } else {
                latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }
}
