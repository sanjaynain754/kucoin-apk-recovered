package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzaj extends zzb implements zzak {
    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zzb(parcel.readInt(), parcel.createStringArray());
        } else if (i11 == 2) {
            zzc(parcel.readInt(), parcel.createStringArray());
        } else {
            if (i11 != 3) {
                return false;
            }
            zzd(parcel.readInt(), (PendingIntent) zzc.zzb(parcel, PendingIntent.CREATOR));
        }
        return true;
    }

    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }
}
