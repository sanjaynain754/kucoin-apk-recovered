package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface zzak extends IInterface {
    void zzb(int i11, String[] strArr) throws RemoteException;

    void zzc(int i11, String[] strArr) throws RemoteException;

    void zzd(int i11, PendingIntent pendingIntent) throws RemoteException;
}
