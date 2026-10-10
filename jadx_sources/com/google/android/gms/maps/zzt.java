package com.google.android.gms.maps;

import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzt extends com.google.android.gms.maps.internal.zzm {
    final /* synthetic */ GoogleMap.OnCameraChangeListener zza;

    public zzt(GoogleMap googleMap, GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.zza = onCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void zzb(CameraPosition cameraPosition) {
        this.zza.onCameraChange(cameraPosition);
    }
}
