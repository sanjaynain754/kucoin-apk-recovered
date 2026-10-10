package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzp implements Parcelable.Creator<StreetViewPanoramaLocation> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaLocation[] newArray(int i11) {
        return new StreetViewPanoramaLocation[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                    }
                } else {
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                }
            } else {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) SafeParcelReader.createTypedArray(parcel, header, StreetViewPanoramaLink.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, strCreateString);
    }
}
