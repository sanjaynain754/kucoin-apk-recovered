package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzl extends zzb implements zzm {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 2) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzc.zza(parcel, AccountChangeEventsResponse.CREATOR);
        zzc.zzb(parcel);
        zzb(status, accountChangeEventsResponse);
        return true;
    }

    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }
}
