package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbi;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzaj extends zzbi {
    final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener zza;

    public zzaj(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        this.zza = onStreetViewPanoramaCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbj
    public final void zzb(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zza.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
    }
}
