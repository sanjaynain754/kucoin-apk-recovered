package com.google.android.gms.maps;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzaa extends com.google.android.gms.maps.internal.zzc {
    private final GoogleMap.CancelableCallback zza;

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzb() {
        this.zza.onCancel();
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzc() {
        this.zza.onFinish();
    }

    public zzaa(GoogleMap.CancelableCallback cancelableCallback) {
        this.zza = cancelableCallback;
    }
}
