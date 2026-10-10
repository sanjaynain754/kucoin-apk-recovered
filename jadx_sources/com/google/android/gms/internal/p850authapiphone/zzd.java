package com.google.android.gms.internal.p850authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzd extends zzb implements zze {
    @Override // com.google.android.gms.internal.p850authapiphone.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        int i13 = parcel.readInt();
        zzc.zzb(parcel);
        zzb(status, i13);
        return true;
    }

    public zzd() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }
}
