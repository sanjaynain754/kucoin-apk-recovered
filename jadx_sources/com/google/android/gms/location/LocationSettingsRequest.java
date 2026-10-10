package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "LocationSettingsRequestCreator")
@SafeParcelable.Reserved({1000})
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzbl();

    @SafeParcelable.Field(getter = "getLocationRequests", m12889id = 1)
    private final List<LocationRequest> zza;

    @SafeParcelable.Field(defaultValue = CredentialEntry.FALSE_STRING, getter = "alwaysShow", m12889id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "needBle", m12889id = 3)
    private final boolean zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getConfiguration", m12889id = 5)
    private zzbj zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {
        private final ArrayList<LocationRequest> zza = new ArrayList<>();
        private boolean zzb = false;
        private boolean zzc = false;

        @RecentlyNonNull
        public Builder addLocationRequest(@RecentlyNonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.zza.add(locationRequest);
            }
            return this;
        }

        @RecentlyNonNull
        public LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.zza, this.zzb, this.zzc, null);
        }

        @RecentlyNonNull
        public Builder setAlwaysShow(boolean z11) {
            this.zzb = z11;
            return this;
        }

        @RecentlyNonNull
        public Builder setNeedBle(boolean z11) {
            this.zzc = z11;
            return this;
        }

        @RecentlyNonNull
        public Builder addAllLocationRequests(@RecentlyNonNull Collection<LocationRequest> collection) {
            for (LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.zza.add(locationRequest);
                }
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LocationSettingsRequest(@SafeParcelable.Param(m12890id = 1) List<LocationRequest> list, @SafeParcelable.Param(m12890id = 2) boolean z11, @SafeParcelable.Param(m12890id = 3) boolean z12, @Nullable @SafeParcelable.Param(m12890id = 5) zzbj zzbjVar) {
        this.zza = list;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = zzbjVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.zza), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
