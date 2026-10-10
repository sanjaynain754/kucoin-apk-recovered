package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface TileProvider {

    @NonNull
    public static final Tile NO_TILE = new Tile(-1, -1, null);

    @Nullable
    Tile getTile(int i11, int i12, int i13);
}
