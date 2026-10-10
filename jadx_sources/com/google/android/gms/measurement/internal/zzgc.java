package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzgc extends com.google.android.gms.internal.measurement.zzbm implements zzgd {
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzog.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zze(arrayListCreateTypedArrayList);
        return true;
    }

    public zzgc() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }
}
