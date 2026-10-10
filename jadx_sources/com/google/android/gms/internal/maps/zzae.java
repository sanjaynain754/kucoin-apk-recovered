package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzae extends zza implements zzag {
    @Override // com.google.android.gms.internal.maps.zzag
    public final float zze() throws RemoteException {
        Parcel parcelZzH = zzH(5, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final String zzg() throws RemoteException {
        Parcel parcelZzH = zzH(3, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzh() throws RemoteException {
        zzc(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzi() throws RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzp() throws RemoteException {
        Parcel parcelZzH = zzH(7, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final float zzd() throws RemoteException {
        Parcel parcelZzH = zzH(13, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final int zzf() throws RemoteException {
        Parcel parcelZzH = zzH(9, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzo() throws RemoteException {
        Parcel parcelZzH = zzH(11, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzj(boolean z11) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzk(float f11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzl(boolean z11) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzm(float f11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzn(zzag zzagVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, zzagVar);
        Parcel parcelZzH = zzH(8, parcelZza);
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }
}
