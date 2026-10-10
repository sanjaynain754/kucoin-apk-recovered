package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzf extends zzb implements zzg {
    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 2) {
            return false;
        }
        zzc(parcel.readInt(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    public zzf() {
        super("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
    }
}
