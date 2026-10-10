package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzcv extends zzbl implements zzcx {
    @Override // com.google.android.gms.internal.measurement.zzcx
    public final void zze() throws RemoteException {
        zzd(2, zza());
    }

    public zzcv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }
}
