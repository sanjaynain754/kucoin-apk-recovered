package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "CountrySpecificationCreator")
@SafeParcelable.Reserved({1})
public class CountrySpecification extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new zza();

    @SafeParcelable.Field(m12889id = 2)
    String zza;

    @NonNull
    public String getCountryCode() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public CountrySpecification(@NonNull @SafeParcelable.Param(m12890id = 2) String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
