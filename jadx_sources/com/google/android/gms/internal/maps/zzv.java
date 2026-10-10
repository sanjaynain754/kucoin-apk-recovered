package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzv extends zza implements zzx {
    @Override // com.google.android.gms.internal.maps.zzx
    public final LatLng zzi() throws RemoteException {
        Parcel parcelZzH = zzH(4, zza());
        LatLng latLng = (LatLng) zzc.zza(parcelZzH, LatLng.CREATOR);
        parcelZzH.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzj() throws RemoteException {
        Parcel parcelZzH = zzH(2, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzl() throws RemoteException {
        Parcel parcelZzH = zzH(6, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzn() throws RemoteException {
        zzc(1, zza());
    }

    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzB() throws RemoteException {
        zzc(11, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzD() throws RemoteException {
        Parcel parcelZzH = zzH(10, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzE() throws RemoteException {
        Parcel parcelZzH = zzH(21, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzF() throws RemoteException {
        Parcel parcelZzH = zzH(13, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzH = zzH(15, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzd() throws RemoteException {
        Parcel parcelZzH = zzH(26, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zze() throws RemoteException {
        Parcel parcelZzH = zzH(23, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzf() throws RemoteException {
        Parcel parcelZzH = zzH(28, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final int zzg() throws RemoteException {
        Parcel parcelZzH = zzH(17, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final IObjectWrapper zzh() throws RemoteException {
        Parcel parcelZzH = zzH(30, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzH.readStrongBinder());
        parcelZzH.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzk() throws RemoteException {
        Parcel parcelZzH = zzH(8, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzm() throws RemoteException {
        zzc(12, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzA(float f11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzC(zzx zzxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, zzxVar);
        Parcel parcelZzH = zzH(16, parcelZza);
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzo(float f11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzp(float f11, float f12) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        parcelZza.writeFloat(f12);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzq(boolean z11) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzr(boolean z11) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, iObjectWrapper);
        zzc(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzt(float f11, float f12) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        parcelZza.writeFloat(f12);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzu(LatLng latLng) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, latLng);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzv(float f11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzw(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzx(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, iObjectWrapper);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzy(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzz(boolean z11) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(14, parcelZza);
    }
}
