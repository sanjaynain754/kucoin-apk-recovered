package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class TileOverlayOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzv();

    @Nullable
    @SafeParcelable.Field(getter = "getTileProviderDelegate", m12889id = 2, type = "android.os.IBinder")
    private zzaj zza;

    @Nullable
    private TileProvider zzb;

    @SafeParcelable.Field(getter = "isVisible", m12889id = 3)
    private boolean zzc;

    @SafeParcelable.Field(getter = "getZIndex", m12889id = 4)
    private float zzd;

    @SafeParcelable.Field(defaultValue = CredentialEntry.TRUE_STRING, getter = "getFadeIn", m12889id = 5)
    private boolean zze;

    @SafeParcelable.Field(getter = "getTransparency", m12889id = 6)
    private float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
    }

    @NonNull
    public TileOverlayOptions transparency(float f11) {
        boolean z11 = false;
        if (f11 >= 0.0f && f11 <= 1.0f) {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "Transparency must be in the range [0..1]");
        this.zzf = f11;
        return this;
    }

    @SafeParcelable.Constructor
    public TileOverlayOptions(@SafeParcelable.Param(m12890id = 2) IBinder iBinder, @SafeParcelable.Param(m12890id = 3) boolean z11, @SafeParcelable.Param(m12890id = 4) float f11, @SafeParcelable.Param(m12890id = 5) boolean z12, @SafeParcelable.Param(m12890id = 6) float f12) {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
        zzaj zzajVarZzc = zzai.zzc(iBinder);
        this.zza = zzajVarZzc;
        this.zzb = zzajVarZzc == null ? null : new zzt(this);
        this.zzc = z11;
        this.zzd = f11;
        this.zze = z12;
        this.zzf = f12;
    }

    @NonNull
    public TileOverlayOptions fadeIn(boolean z11) {
        this.zze = z11;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    @Nullable
    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    @NonNull
    public TileOverlayOptions visible(boolean z11) {
        this.zzc = z11;
        return this;
    }

    @NonNull
    public TileOverlayOptions zIndex(float f11) {
        this.zzd = f11;
        return this;
    }

    @NonNull
    public TileOverlayOptions tileProvider(@NonNull TileProvider tileProvider) {
        this.zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.zza = new zzu(this, tileProvider);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        IBinder iBinderAsBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzaj zzajVar = this.zza;
        if (zzajVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzajVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinderAsBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
