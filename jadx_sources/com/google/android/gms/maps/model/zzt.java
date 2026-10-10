package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.maps.zzaj;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzt implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzaj zzb;

    public zzt(TileOverlayOptions tileOverlayOptions) {
        this.zza = tileOverlayOptions;
        this.zzb = tileOverlayOptions.zza;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    @Nullable
    public final Tile getTile(int i11, int i12, int i13) {
        try {
            return this.zzb.zzb(i11, i12, i13);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
