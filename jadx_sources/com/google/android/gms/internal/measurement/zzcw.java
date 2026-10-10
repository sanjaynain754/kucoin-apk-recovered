package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzcw extends zzbm implements zzcx {
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 2) {
            return false;
        }
        zze();
        return true;
    }

    public zzcw() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }
}
