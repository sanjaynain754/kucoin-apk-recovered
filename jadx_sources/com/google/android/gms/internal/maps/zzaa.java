package com.google.android.gms.internal.maps;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface zzaa extends IInterface {
    void zzA(float f11) throws RemoteException;

    boolean zzB(zzaa zzaaVar) throws RemoteException;

    boolean zzC() throws RemoteException;

    boolean zzD() throws RemoteException;

    boolean zzE() throws RemoteException;

    float zzd() throws RemoteException;

    float zze() throws RemoteException;

    int zzf() throws RemoteException;

    int zzg() throws RemoteException;

    int zzh() throws RemoteException;

    int zzi() throws RemoteException;

    IObjectWrapper zzj() throws RemoteException;

    String zzk() throws RemoteException;

    List zzl() throws RemoteException;

    List<LatLng> zzm() throws RemoteException;

    List<PatternItem> zzn() throws RemoteException;

    void zzo() throws RemoteException;

    void zzp(boolean z11) throws RemoteException;

    void zzq(int i11) throws RemoteException;

    void zzr(boolean z11) throws RemoteException;

    void zzs(List list) throws RemoteException;

    void zzt(List<LatLng> list) throws RemoteException;

    void zzu(int i11) throws RemoteException;

    void zzv(int i11) throws RemoteException;

    void zzw(List<PatternItem> list) throws RemoteException;

    void zzx(float f11) throws RemoteException;

    void zzy(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzz(boolean z11) throws RemoteException;
}
