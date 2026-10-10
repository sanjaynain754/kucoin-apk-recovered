package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface LocationListenerCompat extends LocationListener {
    @Override // android.location.LocationListener
    default void onLocationChanged(@NonNull List<Location> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            onLocationChanged(list.get(i11));
        }
    }

    @Override // android.location.LocationListener
    default void onFlushComplete(int i11) {
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@NonNull String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@NonNull String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@NonNull String str, int i11, @Nullable Bundle bundle) {
    }
}
