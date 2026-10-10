package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new Parcelable.Creator<ParcelableSparseIntArray>() { // from class: com.google.android.material.internal.ParcelableSparseIntArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseIntArray createFromParcel(@NonNull Parcel parcel) {
            int i11 = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i11);
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i12 = 0; i12 < i11; i12++) {
                parcelableSparseIntArray.put(iArr[i12], iArr2[i12]);
            }
            return parcelableSparseIntArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseIntArray[] newArray(int i11) {
            return new ParcelableSparseIntArray[i11];
        }
    };

    public ParcelableSparseIntArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableSparseIntArray(int i11) {
        super(i11);
    }

    public ParcelableSparseIntArray(@NonNull SparseIntArray sparseIntArray) {
        for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
            put(sparseIntArray.keyAt(i11), sparseIntArray.valueAt(i11));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i12 = 0; i12 < size(); i12++) {
            iArr[i12] = keyAt(i12);
            iArr2[i12] = valueAt(i12);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }
}
