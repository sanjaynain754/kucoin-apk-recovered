package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzn extends zzb implements zzo {
    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        int i13 = parcel.readInt();
        enforceNoDataAvail(parcel);
        zza(status, i13);
        return true;
    }

    public zzn() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }
}
