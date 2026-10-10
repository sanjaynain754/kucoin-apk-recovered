package com.google.android.gms.maps.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface StreetViewLifecycleDelegate extends LifecycleDelegate {
    void getStreetViewPanoramaAsync(@NonNull OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback);
}
