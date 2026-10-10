package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzd extends zzb implements zze {
    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            int i13 = zzc.zza;
            boolean z11 = parcel.readInt() != 0;
            zzc.zzc(parcel);
            zzb(z11);
        } else {
            if (i11 != 2) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            zzc.zzc(parcel);
            zzc(status);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }
}
