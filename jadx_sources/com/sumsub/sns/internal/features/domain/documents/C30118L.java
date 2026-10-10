package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.DocCapture$PreferredMode;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30118L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new C30119M[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z11;
        boolean z12;
        boolean z13;
        DocCapture$PreferredMode docCapture$PreferredModeValueOf;
        boolean z14;
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Document documentCreateFromParcel = Document.CREATOR.createFromParcel(parcel);
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            arrayList.add(IdentitySide.valueOf(parcel.readString()));
        }
        if (parcel.readInt() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        String string = parcel.readString();
        if (parcel.readInt() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (parcel.readInt() == 0) {
            docCapture$PreferredModeValueOf = null;
        } else {
            docCapture$PreferredModeValueOf = DocCapture$PreferredMode.valueOf(parcel.readString());
        }
        DocCapture$PreferredMode docCapture$PreferredMode = docCapture$PreferredModeValueOf;
        String string2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        return new C30119M(z11, documentCreateFromParcel, arrayList, z12, string, z13, docCapture$PreferredMode, string2, z14);
    }
}
