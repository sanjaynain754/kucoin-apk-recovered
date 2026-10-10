package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzbv implements Parcelable.Creator<SleepSegmentEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentEvent[] newArray(int i11) {
        return new SleepSegmentEvent[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentEvent createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j11 = 0;
        long j12 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                i13 = SafeParcelReader.readInt(parcel, header);
                            }
                        } else {
                            i12 = SafeParcelReader.readInt(parcel, header);
                        }
                    } else {
                        i11 = SafeParcelReader.readInt(parcel, header);
                    }
                } else {
                    j12 = SafeParcelReader.readLong(parcel, header);
                }
            } else {
                j11 = SafeParcelReader.readLong(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new SleepSegmentEvent(j11, j12, i11, i12, i13);
    }
}
