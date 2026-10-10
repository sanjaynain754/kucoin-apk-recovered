package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbg;
import com.google.android.gms.maps.model.Polyline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzp extends zzbg {
    final /* synthetic */ GoogleMap.OnPolylineClickListener zza;

    public zzp(GoogleMap googleMap, GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.zza = onPolylineClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbh
    public final void zzb(com.google.android.gms.internal.maps.zzad zzadVar) {
        this.zza.onPolylineClick(new Polyline(zzadVar));
    }
}
