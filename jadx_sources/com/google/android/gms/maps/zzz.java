package com.google.android.gms.maps;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzz extends com.google.android.gms.maps.internal.zzao {
    final /* synthetic */ GoogleMap.OnMapLongClickListener zza;

    public zzz(GoogleMap googleMap, GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.zza = onMapLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zzb(LatLng latLng) {
        this.zza.onMapLongClick(latLng);
    }
}
