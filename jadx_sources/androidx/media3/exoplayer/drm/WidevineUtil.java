package androidx.media3.exoplayer.drm;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.UnstableApi;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class WidevineUtil {
    public static final String PROPERTY_LICENSE_DURATION_REMAINING = "LicenseDurationRemaining";
    public static final String PROPERTY_PLAYBACK_DURATION_REMAINING = "PlaybackDurationRemaining";

    private static long getDurationRemainingSec(Map<String, String> map, String str) {
        if (map == null) {
            return C2711C.TIME_UNSET;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : C2711C.TIME_UNSET;
        } catch (NumberFormatException unused) {
            return C2711C.TIME_UNSET;
        }
    }

    private WidevineUtil() {
    }

    @Nullable
    public static Pair<Long, Long> getLicenseDurationRemainingSec(DrmSession drmSession) {
        Map<String, String> mapQueryKeyStatus = drmSession.queryKeyStatus();
        if (mapQueryKeyStatus == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(getDurationRemainingSec(mapQueryKeyStatus, "LicenseDurationRemaining")), Long.valueOf(getDurationRemainingSec(mapQueryKeyStatus, "PlaybackDurationRemaining")));
    }
}
