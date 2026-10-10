package com.google.android.gms.maps;

import android.location.Location;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface LocationSource {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public interface OnLocationChangedListener {
        void onLocationChanged(@NonNull Location location);
    }

    void activate(@NonNull OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
