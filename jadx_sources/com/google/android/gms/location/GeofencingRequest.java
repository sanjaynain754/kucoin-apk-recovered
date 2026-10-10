package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
public class GeofencingRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzau();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;

    @SafeParcelable.Field(getter = "getParcelableGeofences", m12889id = 1)
    private final List<com.google.android.gms.internal.location.zzbe> zza;

    @InitialTrigger
    @SafeParcelable.Field(getter = "getInitialTrigger", m12889id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "", getter = "getTag", m12889id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getContextAttributionTag", m12889id = 4)
    private final String zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {
        private final List<com.google.android.gms.internal.location.zzbe> zza = new ArrayList();

        @InitialTrigger
        private int zzb = 5;
        private String zzc = "";

        @RecentlyNonNull
        public Builder addGeofence(@RecentlyNonNull Geofence geofence) {
            Preconditions.checkNotNull(geofence, "geofence can't be null.");
            Preconditions.checkArgument(geofence instanceof com.google.android.gms.internal.location.zzbe, "Geofence must be created using Geofence.Builder.");
            this.zza.add((com.google.android.gms.internal.location.zzbe) geofence);
            return this;
        }

        @RecentlyNonNull
        public Builder addGeofences(@RecentlyNonNull List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        @RecentlyNonNull
        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.zza.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.zza, this.zzb, this.zzc, null);
        }

        @RecentlyNonNull
        public Builder setInitialTrigger(@InitialTrigger int i11) {
            this.zzb = i11 & 7;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface InitialTrigger {
    }

    @RecentlyNonNull
    public List<Geofence> getGeofences() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zza);
        return arrayList;
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String toString() {
        return "GeofencingRequest[geofences=" + this.zza + ", initialTrigger=" + this.zzb + ", tag=" + this.zzc + ", attributionTag=" + this.zzd + "]";
    }

    @RecentlyNonNull
    public final GeofencingRequest zza(@Nullable String str) {
        return new GeofencingRequest(this.zza, this.zzb, this.zzc, str);
    }

    @SafeParcelable.Constructor
    public GeofencingRequest(@SafeParcelable.Param(m12890id = 1) List<com.google.android.gms.internal.location.zzbe> list, @SafeParcelable.Param(m12890id = 2) @InitialTrigger int i11, @SafeParcelable.Param(m12890id = 3) String str, @Nullable @SafeParcelable.Param(m12890id = 4) String str2) {
        this.zza = list;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
