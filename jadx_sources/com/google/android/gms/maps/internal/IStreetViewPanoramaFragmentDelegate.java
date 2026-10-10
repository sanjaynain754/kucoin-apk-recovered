package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface IStreetViewPanoramaFragmentDelegate extends IInterface {
    @NonNull
    IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException;

    void getStreetViewPanoramaAsync(zzbr zzbrVar) throws RemoteException;

    boolean isReady() throws RemoteException;

    void onCreate(@NonNull Bundle bundle) throws RemoteException;

    @NonNull
    IObjectWrapper onCreateView(@NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onDestroyView() throws RemoteException;

    void onInflate(@NonNull IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(@NonNull Bundle bundle) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;
}
