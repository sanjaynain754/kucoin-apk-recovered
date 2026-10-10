package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzf extends zzb implements zzg {
    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            ArrayList arrayListZzb = zzc.zzb(parcel);
            zzc.zzc(parcel);
            zzb(arrayListZzb);
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

    public zzf() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }
}
