package com.google.android.gms.internal.identity_credentials;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
public class zzb extends Binder implements IInterface {
    private static zzd globalInterceptor;

    public boolean dispatchTransaction(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        return false;
    }

    public void enforceNoDataAvail(Parcel parcel) {
        zzd zzdVar = globalInterceptor;
        if (zzdVar != null) {
            zzdVar.zza();
            return;
        }
        int i11 = zzc.zza;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb2.append("Parcel data not fully consumed, unread size: ");
        sb2.append(iDataAvail);
        throw new BadParcelableException(sb2.toString());
    }

    public zzb(String str) {
        attachInterface(this, str);
    }

    private boolean routeToSuperOrEnforceInterface(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 > 16777215) {
            return super.onTransact(i11, parcel, parcel2, i12);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (routeToSuperOrEnforceInterface(i11, parcel, parcel2, i12)) {
            return true;
        }
        zzd zzdVar = globalInterceptor;
        if (zzdVar == null) {
            return dispatchTransaction(i11, parcel, parcel2, i12);
        }
        return zzdVar.zzb();
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
