package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
public final class ClearTypedCreationOptionCreator implements Parcelable.Creator<ClearCreationOptionsRequest.ClearTypedCreationOption> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    @NonNull
    public ClearCreationOptionsRequest.ClearTypedCreationOption createFromParcel(@NonNull Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        boolean z11 = false;
        ArrayList<String> arrayListCreateStringList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z11 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ClearCreationOptionsRequest.ClearTypedCreationOption(z11, strCreateString, arrayListCreateStringList);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    @NonNull
    public ClearCreationOptionsRequest.ClearTypedCreationOption[] newArray(int i11) {
        return new ClearCreationOptionsRequest.ClearTypedCreationOption[i11];
    }

    public static void writeToParcel(ClearCreationOptionsRequest.ClearTypedCreationOption clearTypedCreationOption, Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, clearTypedCreationOption.getDeleteAllForType());
        SafeParcelWriter.writeString(parcel, 2, clearTypedCreationOption.getType(), false);
        SafeParcelWriter.writeStringList(parcel, 3, clearTypedCreationOption.getRegistryIds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
