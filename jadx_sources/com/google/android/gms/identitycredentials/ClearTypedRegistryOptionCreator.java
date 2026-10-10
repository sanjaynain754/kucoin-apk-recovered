package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
public final class ClearTypedRegistryOptionCreator implements Parcelable.Creator<ClearRegistryRequest.ClearTypedRegistryOption> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    @NonNull
    public ClearRegistryRequest.ClearTypedRegistryOption createFromParcel(@NonNull Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList<String> arrayListCreateStringList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z11 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                z12 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ClearRegistryRequest.ClearTypedRegistryOption(z11, strCreateString, z12, arrayListCreateStringList);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    @NonNull
    public ClearRegistryRequest.ClearTypedRegistryOption[] newArray(int i11) {
        return new ClearRegistryRequest.ClearTypedRegistryOption[i11];
    }

    public static void writeToParcel(ClearRegistryRequest.ClearTypedRegistryOption clearTypedRegistryOption, Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, clearTypedRegistryOption.getDeleteAllForType());
        SafeParcelWriter.writeString(parcel, 2, clearTypedRegistryOption.getType(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, clearTypedRegistryOption.getDeleteIdlessRegistry());
        SafeParcelWriter.writeStringList(parcel, 4, clearTypedRegistryOption.getRegistryIds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
