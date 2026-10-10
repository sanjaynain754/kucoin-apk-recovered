package com.google.android.gms.internal.p850authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzf extends zzb implements zzg {
    @Override // com.google.android.gms.internal.p850authapiphone.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        boolean z11 = parcel.readInt() != 0;
        zzc.zzb(parcel);
        zzb(status, z11);
        return true;
    }

    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }
}
