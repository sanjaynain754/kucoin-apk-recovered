package androidx.core.location;

import android.location.Location;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Location.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0086\n¨\u0006\u0004"}, m90084d2 = {"component1", "", "Landroid/location/Location;", "component2", "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LocationKt {
    public static final double component1(@NotNull Location location) {
        return location.getLatitude();
    }

    public static final double component2(@NotNull Location location) {
        return location.getLongitude();
    }
}
