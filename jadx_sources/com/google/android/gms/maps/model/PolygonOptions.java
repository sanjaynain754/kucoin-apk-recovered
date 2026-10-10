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
@SafeParcelable.Class(creator = "PolygonOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolygonOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzl();

    @SafeParcelable.Field(getter = "getPoints", m12889id = 2)
    private final List<LatLng> zza;

    @SafeParcelable.Field(getter = "getHolesForParcel", m12889id = 3, type = "java.util.List")
    private final List<List<LatLng>> zzb;

    @SafeParcelable.Field(getter = "getStrokeWidth", m12889id = 4)
    private float zzc;

    @SafeParcelable.Field(getter = "getStrokeColor", m12889id = 5)
    private int zzd;

    @SafeParcelable.Field(getter = "getFillColor", m12889id = 6)
    private int zze;

    @SafeParcelable.Field(getter = "getZIndex", m12889id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "isVisible", m12889id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "isGeodesic", m12889id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "isClickable", m12889id = 10)
    private boolean zzi;

    @SafeParcelable.Field(getter = "getStrokeJointType", m12889id = 11)
    private int zzj;

    @Nullable
    @SafeParcelable.Field(getter = "getStrokePattern", m12889id = 12)
    private List<PatternItem> zzk;

    public PolygonOptions() {
        this.zzc = 10.0f;
        this.zzd = ViewCompat.MEASURED_STATE_MASK;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = false;
        this.zzj = 0;
        this.zzk = null;
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    @NonNull
    public PolygonOptions clickable(boolean z11) {
        this.zzi = z11;
        return this;
    }

    @NonNull
    public PolygonOptions fillColor(int i11) {
        this.zze = i11;
        return this;
    }

    @NonNull
    public PolygonOptions geodesic(boolean z11) {
        this.zzh = z11;
        return this;
    }

    public int getFillColor() {
        return this.zze;
    }

    @NonNull
    public List<List<LatLng>> getHoles() {
        return this.zzb;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.zza;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    public int getStrokeJointType() {
        return this.zzj;
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        return this.zzk;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzi;
    }

    public boolean isGeodesic() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    @NonNull
    public PolygonOptions strokeColor(int i11) {
        this.zzd = i11;
        return this;
    }

    @NonNull
    public PolygonOptions strokeJointType(int i11) {
        this.zzj = i11;
        return this;
    }

    @NonNull
    public PolygonOptions strokePattern(@Nullable List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    @NonNull
    public PolygonOptions strokeWidth(float f11) {
        this.zzc = f11;
        return this;
    }

    @NonNull
    public PolygonOptions visible(boolean z11) {
        this.zzg = z11;
        return this;
    }

    @NonNull
    public PolygonOptions zIndex(float f11) {
        this.zzf = f11;
        return this;
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        this.zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    @NonNull
    public PolygonOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    @NonNull
    public PolygonOptions addHole(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.zzb.add(arrayList);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeList(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 10, isClickable());
        SafeParcelWriter.writeInt(parcel, 11, getStrokeJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PolygonOptions(@SafeParcelable.Param(m12890id = 2) List<LatLng> list, @SafeParcelable.Param(m12890id = 3) List list2, @SafeParcelable.Param(m12890id = 4) float f11, @SafeParcelable.Param(m12890id = 5) int i11, @SafeParcelable.Param(m12890id = 6) int i12, @SafeParcelable.Param(m12890id = 7) float f12, @SafeParcelable.Param(m12890id = 8) boolean z11, @SafeParcelable.Param(m12890id = 9) boolean z12, @SafeParcelable.Param(m12890id = 10) boolean z13, @SafeParcelable.Param(m12890id = 11) int i13, @Nullable @SafeParcelable.Param(m12890id = 12) List<PatternItem> list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = f11;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = f12;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i13;
        this.zzk = list3;
    }
}
