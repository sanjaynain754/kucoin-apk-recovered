package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
public final class ClearCreationOptionsRequestCreator implements Parcelable.Creator<ClearCreationOptionsRequest> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    @NonNull
    public ClearCreationOptionsRequest createFromParcel(@NonNull Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ClearCreationOptionsRequest.ClearTypedCreationOption clearTypedCreationOption = null;
        boolean z11 = true;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z11 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId != 2) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                clearTypedCreationOption = (ClearCreationOptionsRequest.ClearTypedCreationOption) SafeParcelReader.createParcelable(parcel, header, ClearCreationOptionsRequest.ClearTypedCreationOption.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ClearCreationOptionsRequest(z11, clearTypedCreationOption);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    @NonNull
    public ClearCreationOptionsRequest[] newArray(int i11) {
        return new ClearCreationOptionsRequest[i11];
    }

    public static void writeToParcel(ClearCreationOptionsRequest clearCreationOptionsRequest, Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, clearCreationOptionsRequest.getDeleteAll());
        SafeParcelWriter.writeParcelable(parcel, 2, clearCreationOptionsRequest.getClearTypedRegistryOption(), i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
