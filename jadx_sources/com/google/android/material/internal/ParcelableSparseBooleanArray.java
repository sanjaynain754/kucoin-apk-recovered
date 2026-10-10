package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new Parcelable.Creator<ParcelableSparseBooleanArray>() { // from class: com.google.android.material.internal.ParcelableSparseBooleanArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseBooleanArray createFromParcel(@NonNull Parcel parcel) {
            int i11 = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i11);
            int[] iArr = new int[i11];
            boolean[] zArr = new boolean[i11];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i12 = 0; i12 < i11; i12++) {
                parcelableSparseBooleanArray.put(iArr[i12], zArr[i12]);
            }
            return parcelableSparseBooleanArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableSparseBooleanArray[] newArray(int i11) {
            return new ParcelableSparseBooleanArray[i11];
        }
    };

    public ParcelableSparseBooleanArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableSparseBooleanArray(int i11) {
        super(i11);
    }

    public ParcelableSparseBooleanArray(@NonNull SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            put(sparseBooleanArray.keyAt(i11), sparseBooleanArray.valueAt(i11));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i12 = 0; i12 < size(); i12++) {
            iArr[i12] = keyAt(i12);
            zArr[i12] = valueAt(i12);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }
}
