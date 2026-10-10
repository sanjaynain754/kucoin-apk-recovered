package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzs extends zza implements zzu {
    @Override // com.google.android.gms.internal.maps.zzu
    public final int zzd() throws RemoteException {
        Parcel parcelZzH = zzH(5, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final String zze() throws RemoteException {
        Parcel parcelZzH = zzH(1, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final String zzf() throws RemoteException {
        Parcel parcelZzH = zzH(2, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzg() throws RemoteException {
        zzc(3, zza());
    }

    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final boolean zzh(zzu zzuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, zzuVar);
        Parcel parcelZzH = zzH(4, parcelZza);
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }
}
