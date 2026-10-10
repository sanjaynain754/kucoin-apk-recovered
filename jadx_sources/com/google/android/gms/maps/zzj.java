package com.google.android.gms.maps;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzj extends com.google.android.gms.maps.internal.zzam {
    final /* synthetic */ GoogleMap.OnMapLoadedCallback zza;

    public zzj(GoogleMap googleMap, GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.zza = onMapLoadedCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void zzb() throws RemoteException {
        this.zza.onMapLoaded();
    }
}
