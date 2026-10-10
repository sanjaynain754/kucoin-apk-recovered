package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzab extends com.google.android.gms.internal.common.zza implements IGmsCallbacks {
    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i11, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i11, IBinder iBinder, zzk zzkVar) throws RemoteException {
        throw null;
    }

    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i11, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i11);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.zzc.zzc(parcelZza, bundle);
        zzC(1, parcelZza);
    }
}
