package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zze extends com.google.android.gms.internal.maps.zza implements zzf {
    @Override // com.google.android.gms.maps.internal.zzf
    public final ICameraUpdateFactoryDelegate zze() throws RemoteException {
        ICameraUpdateFactoryDelegate zzbVar;
        Parcel parcelZzH = zzH(4, zza());
        IBinder strongBinder = parcelZzH.readStrongBinder();
        if (strongBinder == null) {
            zzbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            zzbVar = iInterfaceQueryLocalInterface instanceof ICameraUpdateFactoryDelegate ? (ICameraUpdateFactoryDelegate) iInterfaceQueryLocalInterface : new zzb(strongBinder);
        }
        parcelZzH.recycle();
        return zzbVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.internal.maps.zzi zzj() throws RemoteException {
        Parcel parcelZzH = zzH(5, zza());
        com.google.android.gms.internal.maps.zzi zziVarZzb = com.google.android.gms.internal.maps.zzh.zzb(parcelZzH.readStrongBinder());
        parcelZzH.recycle();
        return zziVarZzb;
    }

    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final int zzd() throws RemoteException {
        Parcel parcelZzH = zzH(9, zza());
        int i11 = parcelZzH.readInt();
        parcelZzH.recycle();
        return i11;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final IMapFragmentDelegate zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        IMapFragmentDelegate zzkVar;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzH = zzH(2, parcelZza);
        IBinder strongBinder = parcelZzH.readStrongBinder();
        if (strongBinder == null) {
            zzkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof IMapFragmentDelegate) {
                zzkVar = (IMapFragmentDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzkVar = new zzk(strongBinder);
            }
        }
        parcelZzH.recycle();
        return zzkVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final IMapViewDelegate zzg(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) throws RemoteException {
        IMapViewDelegate zzlVar;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zzd(parcelZza, googleMapOptions);
        Parcel parcelZzH = zzH(3, parcelZza);
        IBinder strongBinder = parcelZzH.readStrongBinder();
        if (strongBinder == null) {
            zzlVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (iInterfaceQueryLocalInterface instanceof IMapViewDelegate) {
                zzlVar = (IMapViewDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzlVar = new zzl(strongBinder);
            }
        }
        parcelZzH.recycle();
        return zzlVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final IStreetViewPanoramaFragmentDelegate zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        IStreetViewPanoramaFragmentDelegate zzbwVar;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzH = zzH(8, parcelZza);
        IBinder strongBinder = parcelZzH.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof IStreetViewPanoramaFragmentDelegate) {
                zzbwVar = (IStreetViewPanoramaFragmentDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbwVar = new zzbw(strongBinder);
            }
        }
        parcelZzH.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final IStreetViewPanoramaViewDelegate zzi(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException {
        IStreetViewPanoramaViewDelegate zzbxVar;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zzd(parcelZza, streetViewPanoramaOptions);
        Parcel parcelZzH = zzH(7, parcelZza);
        IBinder strongBinder = parcelZzH.readStrongBinder();
        if (strongBinder == null) {
            zzbxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (iInterfaceQueryLocalInterface instanceof IStreetViewPanoramaViewDelegate) {
                zzbxVar = (IStreetViewPanoramaViewDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbxVar = new zzbx(strongBinder);
            }
        }
        parcelZzH.recycle();
        return zzbxVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final void zzk(IObjectWrapper iObjectWrapper, int i11) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i11);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final void zzl(IObjectWrapper iObjectWrapper, int i11) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i11);
        zzc(10, parcelZza);
    }
}
