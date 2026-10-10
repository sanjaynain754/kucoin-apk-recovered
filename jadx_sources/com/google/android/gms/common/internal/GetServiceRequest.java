package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();
    static final Scope[] zza = new Scope[0];
    static final Feature[] zzb = new Feature[0];

    @SafeParcelable.VersionField(m12892id = 1)
    final int zzc;

    @SafeParcelable.Field(m12889id = 2)
    final int zzd;

    @SafeParcelable.Field(m12889id = 3)
    final int zze;

    @SafeParcelable.Field(m12889id = 4)
    String zzf;

    @Nullable
    @SafeParcelable.Field(m12889id = 5)
    IBinder zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", m12889id = 6)
    Scope[] zzh;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", m12889id = 7)
    Bundle zzi;

    @Nullable
    @SafeParcelable.Field(m12889id = 8)
    Account zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", m12889id = 10)
    Feature[] zzk;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", m12889id = 11)
    Feature[] zzl;

    @SafeParcelable.Field(m12889id = 12)
    final boolean zzm;

    @SafeParcelable.Field(defaultValue = "0", m12889id = 13)
    final int zzn;

    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", m12889id = 14)
    boolean zzo;

    @Nullable
    @SafeParcelable.Field(getter = "getAttributionTag", m12889id = 15)
    private final String zzp;

    @Nullable
    @KeepForSdk
    public String getAttributionTag() {
        return this.zzp;
    }

    @NonNull
    @KeepForSdk
    public String getCallingPackage() {
        return this.zzf;
    }

    @NonNull
    @KeepForSdk
    public Feature[] getClientApiFeatures() {
        return this.zzl;
    }

    @KeepForSdk
    public int getClientLibraryVersion() {
        return this.zze;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzi;
    }

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12, @SafeParcelable.Param(m12890id = 3) int i13, @SafeParcelable.Param(m12890id = 4) String str, @Nullable @SafeParcelable.Param(m12890id = 5) IBinder iBinder, @SafeParcelable.Param(m12890id = 6) Scope[] scopeArr, @SafeParcelable.Param(m12890id = 7) Bundle bundle, @Nullable @SafeParcelable.Param(m12890id = 8) Account account, @SafeParcelable.Param(m12890id = 10) Feature[] featureArr, @SafeParcelable.Param(m12890id = 11) Feature[] featureArr2, @SafeParcelable.Param(m12890id = 12) boolean z11, @SafeParcelable.Param(m12890id = 13) int i14, @SafeParcelable.Param(m12890id = 14) boolean z12, @Nullable @SafeParcelable.Param(m12890id = 15) String str2) {
        Account accountBinderSafe;
        scopeArr = scopeArr == null ? zza : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? zzb : featureArr;
        featureArr2 = featureArr2 == null ? zzb : featureArr2;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        if ("com.google.android.gms".equals(str)) {
            this.zzf = "com.google.android.gms";
        } else {
            this.zzf = str;
        }
        if (i11 < 2) {
            if (iBinder != null) {
                accountBinderSafe = AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder));
            } else {
                accountBinderSafe = null;
            }
            this.zzj = accountBinderSafe;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = scopeArr;
        this.zzi = bundle;
        this.zzk = featureArr;
        this.zzl = featureArr2;
        this.zzm = z11;
        this.zzn = i14;
        this.zzo = z12;
        this.zzp = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        zzn.zza(this, parcel, i11);
    }
}
