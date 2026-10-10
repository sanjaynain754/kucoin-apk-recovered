package com.google.android.gms.maps.model;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.maps.zzai;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzu extends zzai {
    final /* synthetic */ TileProvider zza;

    public zzu(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    @Nullable
    public final Tile zzb(int i11, int i12, int i13) {
        return this.zza.getTile(i11, i12, i13);
    }
}
