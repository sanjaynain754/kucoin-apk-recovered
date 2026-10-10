package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            int i13 = com.google.android.gms.internal.auth.zzc.zza;
            int i14 = parcel.readInt();
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzc(i14 != 0);
        } else {
            Account account = (Account) com.google.android.gms.internal.auth.zzc.zza(parcel, Account.CREATOR);
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }

    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }
}
