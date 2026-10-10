package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzcy extends zzbl implements zzda {
    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() throws RemoteException {
        Parcel parcelZzP = zzP(2, zza());
        int i11 = parcelZzP.readInt();
        parcelZzP.recycle();
        return i11;
    }

    public zzcy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.zzc(parcelZza, bundle);
        parcelZza.writeLong(j11);
        zzc(1, parcelZza);
    }
}
