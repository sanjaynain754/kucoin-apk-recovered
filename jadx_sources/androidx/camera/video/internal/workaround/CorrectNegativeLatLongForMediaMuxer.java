package androidx.camera.video.internal.workaround;

import android.util.Pair;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* JADX INFO: loaded from: classes23.dex */
public final class CorrectNegativeLatLongForMediaMuxer {
    public static Pair<Double, Double> adjustGeoLocation(double d11, double d12) {
        if (DeviceQuirks.get(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d11 = adjustInternal(d11);
            d12 = adjustInternal(d12);
        }
        return Pair.create(Double.valueOf(d11), Double.valueOf(d12));
    }

    private static double adjustInternal(double d11) {
        return d11 >= 0.0d ? d11 : ((d11 * 10000.0d) - 1.0d) / 10000.0d;
    }

    private CorrectNegativeLatLongForMediaMuxer() {
    }
}
