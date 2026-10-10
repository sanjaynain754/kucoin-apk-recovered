package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new LoyaltyPoints[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        timeInterval = (TimeInterval) SafeParcelReader.createParcelable(parcel, header, TimeInterval.CREATOR);
                    }
                } else {
                    loyaltyPointsBalance = (LoyaltyPointsBalance) SafeParcelReader.createParcelable(parcel, header, LoyaltyPointsBalance.CREATOR);
                }
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LoyaltyPoints(strCreateString, loyaltyPointsBalance, timeInterval);
    }
}
