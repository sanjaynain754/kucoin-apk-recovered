package com.google.android.gms.maps;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzu extends com.google.android.gms.maps.internal.zzu {
    final /* synthetic */ GoogleMap.OnCameraMoveStartedListener zza;

    public zzu(GoogleMap googleMap, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.zza = onCameraMoveStartedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zzb(int i11) {
        this.zza.onCameraMoveStarted(i11);
    }
}
