package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    @SafeParcelable.Field(getter = "getCallingPackage", m12889id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getCallingCertificateBinder", m12889id = 2, type = "android.os.IBinder")
    private final zzj zzb;

    @SafeParcelable.Field(getter = "getAllowTestKeys", m12889id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(defaultValue = CredentialEntry.FALSE_STRING, getter = "getIgnoreTestKeysOverride", m12889id = 4)
    private final boolean zzd;

    public zzs(String str, zzj zzjVar, boolean z11, boolean z12) {
        this.zza = str;
        this.zzb = zzjVar;
        this.zzc = z11;
        this.zzd = z12;
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(m12890id = 1) String str, @SafeParcelable.Param(m12890id = 2) IBinder iBinder, @SafeParcelable.Param(m12890id = 3) boolean z11, @SafeParcelable.Param(m12890id = 4) boolean z12) {
        this.zza = str;
        zzk zzkVar = null;
        if (iBinder != null) {
            try {
                IObjectWrapper iObjectWrapperZzd = com.google.android.gms.common.internal.zzz.zzg(iBinder).zzd();
                byte[] bArr = iObjectWrapperZzd == null ? null : (byte[]) ObjectWrapper.unwrap(iObjectWrapperZzd);
                if (bArr != null) {
                    zzkVar = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e11) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e11);
            }
        }
        this.zzb = zzkVar;
        this.zzc = z11;
        this.zzd = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        zzj zzjVar = this.zzb;
        if (zzjVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzjVar = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, zzjVar, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
