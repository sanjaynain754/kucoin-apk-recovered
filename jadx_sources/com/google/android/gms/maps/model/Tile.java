package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "TileCreator")
@SafeParcelable.Reserved({1})
public final class Tile extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Tile> CREATOR = new zzs();

    @Nullable
    @SafeParcelable.Field(m12889id = 4)
    public final byte[] data;

    @SafeParcelable.Field(m12889id = 3)
    public final int height;

    @SafeParcelable.Field(m12889id = 2)
    public final int width;

    @SafeParcelable.Constructor
    public Tile(@SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) int i12, @Nullable @SafeParcelable.Param(m12890id = 4) byte[] bArr) {
        this.width = i11;
        this.height = i12;
        this.data = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.width);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeByteArray(parcel, 4, this.data, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
