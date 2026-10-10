package com.google.android.gms.internal.maps;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface zzl extends IInterface {
    boolean zzA() throws RemoteException;

    double zzd() throws RemoteException;

    float zze() throws RemoteException;

    float zzf() throws RemoteException;

    int zzg() throws RemoteException;

    int zzh() throws RemoteException;

    int zzi() throws RemoteException;

    IObjectWrapper zzj() throws RemoteException;

    LatLng zzk() throws RemoteException;

    String zzl() throws RemoteException;

    List<PatternItem> zzm() throws RemoteException;

    void zzn() throws RemoteException;

    void zzo(LatLng latLng) throws RemoteException;

    void zzp(boolean z11) throws RemoteException;

    void zzq(int i11) throws RemoteException;

    void zzr(double d11) throws RemoteException;

    void zzs(int i11) throws RemoteException;

    void zzt(List<PatternItem> list) throws RemoteException;

    void zzu(float f11) throws RemoteException;

    void zzv(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzw(boolean z11) throws RemoteException;

    void zzx(float f11) throws RemoteException;

    boolean zzy(zzl zzlVar) throws RemoteException;

    boolean zzz() throws RemoteException;
}
