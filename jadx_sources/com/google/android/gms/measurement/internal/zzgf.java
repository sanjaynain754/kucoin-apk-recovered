package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzgf extends com.google.android.gms.internal.measurement.zzbm implements zzgg {
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 2) {
            return false;
        }
        zzop zzopVar = (zzop) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, zzop.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zze(zzopVar);
        return true;
    }

    public zzgf() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }
}
