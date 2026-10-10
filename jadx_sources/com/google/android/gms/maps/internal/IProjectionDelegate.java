package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface IProjectionDelegate extends IInterface {
    @NonNull
    LatLng fromScreenLocation(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    @NonNull
    VisibleRegion getVisibleRegion() throws RemoteException;

    @NonNull
    IObjectWrapper toScreenLocation(@NonNull LatLng latLng) throws RemoteException;
}
