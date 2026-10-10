package androidx.camera.core.impl;

import androidx.camera.core.CameraUseCaseAdapterProvider;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.internal.CalculatedUseCaseInfo;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UseCaseAdditionSimulator.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, m90084d2 = {"Landroidx/camera/core/impl/UseCaseAdditionSimulator;", "", "<init>", "()V", "cameraUseCaseAdapterProvider", "Landroidx/camera/core/CameraUseCaseAdapterProvider;", "getCameraUseCaseAdapterProvider$annotations", "getCameraUseCaseAdapterProvider", "()Landroidx/camera/core/CameraUseCaseAdapterProvider;", "setCameraUseCaseAdapterProvider", "(Landroidx/camera/core/CameraUseCaseAdapterProvider;)V", "simulateAddUseCases", "Landroidx/camera/core/internal/CalculatedUseCaseInfo;", "cameraInfoInternal", "Landroidx/camera/core/impl/CameraInfoInternal;", "sessionConfig", "Landroidx/camera/core/SessionConfig;", "findMaxSupportedFrameRate", "", "resolvedFeatureGroup", "Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class UseCaseAdditionSimulator {

    @NotNull
    public static final UseCaseAdditionSimulator INSTANCE = new UseCaseAdditionSimulator();
    public static CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider;

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final CalculatedUseCaseInfo simulateAddUseCases(@NotNull CameraInfoInternal cameraInfoInternal, @NotNull androidx.camera.core.SessionConfig sessionConfig) throws IllegalStateException, CameraUseCaseAdapter.CameraException {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        return simulateAddUseCases$default(cameraInfoInternal, sessionConfig, false, null, 12, null);
    }

    @NotNull
    public static final CameraUseCaseAdapterProvider getCameraUseCaseAdapterProvider() {
        CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider2 = cameraUseCaseAdapterProvider;
        if (cameraUseCaseAdapterProvider2 != null) {
            return cameraUseCaseAdapterProvider2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cameraUseCaseAdapterProvider");
        return null;
    }

    public static final void setCameraUseCaseAdapterProvider(@NotNull CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider2) {
        Intrinsics.checkNotNullParameter(cameraUseCaseAdapterProvider2, "<set-?>");
        cameraUseCaseAdapterProvider = cameraUseCaseAdapterProvider2;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final CalculatedUseCaseInfo simulateAddUseCases(@NotNull CameraInfoInternal cameraInfoInternal, @NotNull androidx.camera.core.SessionConfig sessionConfig, boolean z11) throws IllegalStateException, CameraUseCaseAdapter.CameraException {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        return simulateAddUseCases$default(cameraInfoInternal, sessionConfig, z11, null, 8, null);
    }

    public static /* synthetic */ CalculatedUseCaseInfo simulateAddUseCases$default(CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig, boolean z11, ResolvedFeatureGroup resolvedFeatureGroup, int i11, Object obj) throws IllegalStateException, CameraUseCaseAdapter.CameraException {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            resolvedFeatureGroup = null;
        }
        return simulateAddUseCases(cameraInfoInternal, sessionConfig, z11, resolvedFeatureGroup);
    }

    private UseCaseAdditionSimulator() {
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final CalculatedUseCaseInfo simulateAddUseCases(@NotNull CameraInfoInternal cameraInfoInternal, @NotNull androidx.camera.core.SessionConfig sessionConfig, boolean findMaxSupportedFrameRate, @Nullable ResolvedFeatureGroup resolvedFeatureGroup) throws IllegalStateException, CameraUseCaseAdapter.CameraException {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        if (cameraUseCaseAdapterProvider != null) {
            CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider2 = getCameraUseCaseAdapterProvider();
            String cameraId = cameraInfoInternal.getCameraId();
            Intrinsics.checkNotNullExpressionValue(cameraId, "getCameraId(...)");
            CameraUseCaseAdapter cameraUseCaseAdapterProvide = cameraUseCaseAdapterProvider2.provide(cameraId);
            cameraUseCaseAdapterProvide.setViewPort(sessionConfig.getViewPort());
            cameraUseCaseAdapterProvide.setEffects(sessionConfig.getEffects());
            cameraUseCaseAdapterProvide.setSessionType(sessionConfig.getSessionType());
            cameraUseCaseAdapterProvide.setFrameRate(sessionConfig.getFrameRateRange());
            List<UseCase> useCases = sessionConfig.getUseCases();
            if (resolvedFeatureGroup == null) {
                resolvedFeatureGroup = ResolvedFeatureGroup.Companion.resolveFeatureGroup$default(ResolvedFeatureGroup.INSTANCE, sessionConfig, cameraInfoInternal, null, 2, null);
            }
            CalculatedUseCaseInfo calculatedUseCaseInfoSimulateAddUseCases = cameraUseCaseAdapterProvide.simulateAddUseCases(useCases, resolvedFeatureGroup, findMaxSupportedFrameRate);
            Intrinsics.checkNotNullExpressionValue(calculatedUseCaseInfoSimulateAddUseCases, "simulateAddUseCases(...)");
            return calculatedUseCaseInfoSimulateAddUseCases;
        }
        throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
    }

    @JvmStatic
    public static /* synthetic */ void getCameraUseCaseAdapterProvider$annotations() {
    }
}
