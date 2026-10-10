package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.annotation.OptIn;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.Config;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CaptureRequestParameterCompat.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/camera/camera2/internal/compat/params/CaptureRequestParameterCompat;", "", "<init>", "()V", "setSettingsOverrideZoom", "", "options", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "priority", "Landroidx/camera/core/impl/Config$OptionPriority;", "camera-camera2_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class CaptureRequestParameterCompat {

    @NotNull
    public static final CaptureRequestParameterCompat INSTANCE = new CaptureRequestParameterCompat();

    private CaptureRequestParameterCompat() {
    }

    @JvmStatic
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public static final void setSettingsOverrideZoom(@NotNull Camera2ImplConfig.Builder options, @NotNull Config.OptionPriority priority) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
