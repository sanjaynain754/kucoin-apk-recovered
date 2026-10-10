package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzj extends zza implements zzl {
    @Override // com.google.android.gms.internal.maps.zzl
    public final double zzd() throws RemoteException {
        Parcel parcelZzH = zzH(6, zza());
        double d11 = parcelZzH.readDouble();
        parcelZzH.recycle();
        return d11;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final LatLng zzk() throws RemoteException {
        Parcel parcelZzH = zzH(4, zza());
        LatLng latLng = (LatLng) zzc.zza(parcelZzH, LatLng.CREATOR);
        parcelZzH.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final String zzl() throws RemoteException {
        Parcel parcelZzH = zzH(2, zza());
        String string = parcelZzH.readString();
        parcelZzH.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzn() throws RemoteException {
        zzc(1, zza());
    }

    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzH = zzH(16, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final float zze() throws RemoteException {
        Parcel parcelZzH = zzH(8, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final float zzf() throws RemoteException {
        Parcel parcelZzH = zzH(14, zza());
        float f11 = parcelZzH.readFloat();
        parcelZzH.recycle();
        return f11;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzg() throws RemoteException {
        Parcel parcelZzH = zzH(12, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzh() throws RemoteException {
        Parcel parcelZzH = zzH(10, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final int zzi() throws RemoteException {
        Parcel parcelZzH = zzH(18, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final IObjectWrapper zzj() throws RemoteException {
        Parcel parcelZzH = zzH(24, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzH.readStrongBinder());
        parcelZzH.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final List<PatternItem> zzm() throws RemoteException {
        Parcel parcelZzH = zzH(22, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzH.createTypedArrayList(PatternItem.CREATOR);
        parcelZzH.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzz() throws RemoteException {
        Parcel parcelZzH = zzH(20, zza());
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzo(LatLng latLng) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, latLng);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzp(boolean z11) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzq(int i11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzr(double d11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeDouble(d11);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzs(int i11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzt(List<PatternItem> list) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzu(float f11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzv(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, iObjectWrapper);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzw(boolean z11) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, z11);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final void zzx(float f11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f11);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzl
    public final boolean zzy(zzl zzlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzf(parcelZza, zzlVar);
        Parcel parcelZzH = zzH(17, parcelZza);
        boolean zZzg = zzc.zzg(parcelZzH);
        parcelZzH.recycle();
        return zZzg;
    }
}
