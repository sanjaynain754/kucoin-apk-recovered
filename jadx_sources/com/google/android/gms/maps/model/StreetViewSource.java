package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "StreetViewSourceCreator")
@SafeParcelable.Reserved({1})
public final class StreetViewSource extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new zzr();

    @NonNull
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);

    @NonNull
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
    private static final String zza = "StreetViewSource";

    @SafeParcelable.Field(getter = "getType", m12889id = 2)
    private final int zzb;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.zzb == ((StreetViewSource) obj).zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb));
    }

    @NonNull
    public String toString() {
        String str;
        int i11 = this.zzb;
        if (i11 != 0) {
            str = i11 != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i11)) : "OUTDOOR";
        } else {
            str = "DEFAULT";
        }
        return String.format("StreetViewSource:%s", str);
    }

    @SafeParcelable.Constructor
    public StreetViewSource(@SafeParcelable.Param(m12890id = 2) int i11) {
        this.zzb = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
