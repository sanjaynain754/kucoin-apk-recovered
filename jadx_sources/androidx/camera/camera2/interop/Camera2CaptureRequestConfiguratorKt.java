package androidx.camera.camera2.interop;

import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.Config;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Camera2CaptureRequestConfigurator.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0007\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m90084d2 = {"OPTION_CAPTURE_REQUEST_CONFIGURATOR", "Landroidx/camera/core/impl/Config$Option;", "Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;", "getOPTION_CAPTURE_REQUEST_CONFIGURATOR", "()Landroidx/camera/core/impl/Config$Option;", "getCamera2CaptureRequestConfigurator", "Landroidx/camera/core/CameraXConfig;", "setCamera2CaptureRequestConfigurator", "Landroidx/camera/core/CameraXConfig$Builder;", "captureRequestConfigurator", "camera-camera2_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class Camera2CaptureRequestConfiguratorKt {

    @NotNull
    private static final Config.Option<Camera2CaptureRequestConfigurator> OPTION_CAPTURE_REQUEST_CONFIGURATOR;

    static {
        Config.Option<Camera2CaptureRequestConfigurator> optionCreate = Config.Option.create("camerax.core.appConfig.captureRequestConfigurator", Camera2CaptureRequestConfigurator.class);
        Intrinsics.checkNotNullExpressionValue(optionCreate, "create(...)");
        OPTION_CAPTURE_REQUEST_CONFIGURATOR = optionCreate;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public static final Camera2CaptureRequestConfigurator getCamera2CaptureRequestConfigurator(@NotNull CameraXConfig cameraXConfig) {
        Intrinsics.checkNotNullParameter(cameraXConfig, "<this>");
        return (Camera2CaptureRequestConfigurator) cameraXConfig.getConfig().retrieveOption(OPTION_CAPTURE_REQUEST_CONFIGURATOR, null);
    }

    @NotNull
    public static final Config.Option<Camera2CaptureRequestConfigurator> getOPTION_CAPTURE_REQUEST_CONFIGURATOR() {
        return OPTION_CAPTURE_REQUEST_CONFIGURATOR;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final CameraXConfig.Builder setCamera2CaptureRequestConfigurator(@NotNull CameraXConfig.Builder builder, @NotNull Camera2CaptureRequestConfigurator captureRequestConfigurator) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(captureRequestConfigurator, "captureRequestConfigurator");
        builder.getMutableConfig().insertOption(OPTION_CAPTURE_REQUEST_CONFIGURATOR, captureRequestConfigurator);
        return builder;
    }
}
