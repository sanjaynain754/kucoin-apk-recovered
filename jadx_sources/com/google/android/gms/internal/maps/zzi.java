package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface zzi extends IInterface {
    IObjectWrapper zzd() throws RemoteException;

    IObjectWrapper zze(float f11) throws RemoteException;

    IObjectWrapper zzf(String str) throws RemoteException;

    IObjectWrapper zzg(Bitmap bitmap) throws RemoteException;

    IObjectWrapper zzh(String str) throws RemoteException;

    IObjectWrapper zzi(String str) throws RemoteException;

    IObjectWrapper zzj(int i11) throws RemoteException;
}
