package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolylineOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzm();

    @SafeParcelable.Field(getter = "getPoints", m12889id = 2)
    private final List<LatLng> zza;

    @SafeParcelable.Field(getter = "getWidth", m12889id = 3)
    private float zzb;

    @SafeParcelable.Field(getter = "getColor", m12889id = 4)
    private int zzc;

    @SafeParcelable.Field(getter = "getZIndex", m12889id = 5)
    private float zzd;

    @SafeParcelable.Field(getter = "isVisible", m12889id = 6)
    private boolean zze;

    @SafeParcelable.Field(getter = "isGeodesic", m12889id = 7)
    private boolean zzf;

    @SafeParcelable.Field(getter = "isClickable", m12889id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "getStartCap", m12889id = 9)
    private Cap zzh;

    @SafeParcelable.Field(getter = "getEndCap", m12889id = 10)
    private Cap zzi;

    @SafeParcelable.Field(getter = "getJointType", m12889id = 11)
    private int zzj;

    @Nullable
    @SafeParcelable.Field(getter = "getPattern", m12889id = 12)
    private List<PatternItem> zzk;

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = ViewCompat.MEASURED_STATE_MASK;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zza = new ArrayList();
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(this.zza, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    @NonNull
    public PolylineOptions clickable(boolean z11) {
        this.zzg = z11;
        return this;
    }

    @NonNull
    public PolylineOptions color(int i11) {
        this.zzc = i11;
        return this;
    }

    @NonNull
    public PolylineOptions endCap(@NonNull Cap cap) {
        this.zzi = (Cap) Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    @NonNull
    public PolylineOptions geodesic(boolean z11) {
        this.zzf = z11;
        return this;
    }

    public int getColor() {
        return this.zzc;
    }

    @NonNull
    public Cap getEndCap() {
        return this.zzi;
    }

    public int getJointType() {
        return this.zzj;
    }

    @Nullable
    public List<PatternItem> getPattern() {
        return this.zzk;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.zza;
    }

    @NonNull
    public Cap getStartCap() {
        return this.zzh;
    }

    public float getWidth() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isClickable() {
        return this.zzg;
    }

    public boolean isGeodesic() {
        return this.zzf;
    }

    public boolean isVisible() {
        return this.zze;
    }

    @NonNull
    public PolylineOptions jointType(int i11) {
        this.zzj = i11;
        return this;
    }

    @NonNull
    public PolylineOptions pattern(@Nullable List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    @NonNull
    public PolylineOptions visible(boolean z11) {
        this.zze = z11;
        return this;
    }

    @NonNull
    public PolylineOptions width(float f11) {
        this.zzb = f11;
        return this;
    }

    @NonNull
    public PolylineOptions zIndex(float f11) {
        this.zzd = f11;
        return this;
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        this.zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    @NonNull
    public PolylineOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    @NonNull
    public PolylineOptions startCap(@NonNull Cap cap) {
        this.zzh = (Cap) Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getColor());
        SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i11, false);
        SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i11, false);
        SafeParcelWriter.writeInt(parcel, 11, getJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PolylineOptions(@SafeParcelable.Param(m12890id = 2) List list, @SafeParcelable.Param(m12890id = 3) float f11, @SafeParcelable.Param(m12890id = 4) int i11, @SafeParcelable.Param(m12890id = 5) float f12, @SafeParcelable.Param(m12890id = 6) boolean z11, @SafeParcelable.Param(m12890id = 7) boolean z12, @SafeParcelable.Param(m12890id = 8) boolean z13, @Nullable @SafeParcelable.Param(m12890id = 9) Cap cap, @Nullable @SafeParcelable.Param(m12890id = 10) Cap cap2, @SafeParcelable.Param(m12890id = 11) int i12, @Nullable @SafeParcelable.Param(m12890id = 12) List<PatternItem> list2) {
        this.zzb = 10.0f;
        this.zzc = ViewCompat.MEASURED_STATE_MASK;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zza = list;
        this.zzb = f11;
        this.zzc = i11;
        this.zzd = f12;
        this.zze = z11;
        this.zzf = z12;
        this.zzg = z13;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i12;
        this.zzk = list2;
    }
}
