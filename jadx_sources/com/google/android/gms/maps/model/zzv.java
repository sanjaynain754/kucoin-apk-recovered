package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzv implements Parcelable.Creator<TileOverlayOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TileOverlayOptions[] newArray(int i11) {
        return new TileOverlayOptions[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TileOverlayOptions createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        boolean z11 = false;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z12 = true;
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
                                f12 = SafeParcelReader.readFloat(parcel, header);
                            }
                        } else {
                            z12 = SafeParcelReader.readBoolean(parcel, header);
                        }
                    } else {
                        f11 = SafeParcelReader.readFloat(parcel, header);
                    }
                } else {
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                }
            } else {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new TileOverlayOptions(iBinder, z11, f11, z12, f12);
    }
}
