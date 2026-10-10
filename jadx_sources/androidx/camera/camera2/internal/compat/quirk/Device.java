package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Device.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\n\u001a\u00020\u0005*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\f"}, m90084d2 = {"Landroidx/camera/camera2/internal/compat/quirk/Device;", "", "<init>", "()V", "isUniSocChipsetDevice", "", "isItelDevice", "isDeviceFrom", "vendor", "", "equalsCaseInsensitive", "other", "camera-camera2_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class Device {

    @NotNull
    public static final Device INSTANCE = new Device();

    private final boolean equalsCaseInsensitive(String str, String str2) {
        return StringsKt.equals(str, str2, true);
    }

    private final boolean isDeviceFrom(String vendor) {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (equalsCaseInsensitive(MANUFACTURER, vendor)) {
            return true;
        }
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        return equalsCaseInsensitive(BRAND, vendor);
    }

    private final boolean isItelDevice() {
        return isDeviceFrom("Itel");
    }

    @JvmStatic
    public static final boolean isUniSocChipsetDevice() {
        if (Build.VERSION.SDK_INT < 31 || !StringsKt.equals("Spreadtrum", Build.SOC_MANUFACTURER, true)) {
            String HARDWARE = Build.HARDWARE;
            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            Locale locale = Locale.ROOT;
            String lowerCase = HARDWARE.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!StringsKt.startsWith$default(lowerCase, "ums", false, 2, (Object) null)) {
                if (INSTANCE.isItelDevice()) {
                    Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                    String lowerCase2 = HARDWARE.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (StringsKt.startsWith$default(lowerCase2, "sp", false, 2, (Object) null)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    private Device() {
    }
}
