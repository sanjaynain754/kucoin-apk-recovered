package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.internal.StreamSpecsCalculator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CameraUseCaseAdapterProvider.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J<\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016JD\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Landroidx/camera/core/CameraUseCaseAdapterProviderImpl;", "Landroidx/camera/core/CameraUseCaseAdapterProvider;", "cameraRepository", "Landroidx/camera/core/impl/CameraRepository;", "cameraCoordinator", "Landroidx/camera/core/concurrent/CameraCoordinator;", "useCaseConfigFactory", "Landroidx/camera/core/impl/UseCaseConfigFactory;", "streamSpecsCalculator", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "<init>", "(Landroidx/camera/core/impl/CameraRepository;Landroidx/camera/core/concurrent/CameraCoordinator;Landroidx/camera/core/impl/UseCaseConfigFactory;Landroidx/camera/core/internal/StreamSpecsCalculator;)V", "provide", "Landroidx/camera/core/internal/CameraUseCaseAdapter;", "cameraId", "", "camera", "Landroidx/camera/core/impl/CameraInternal;", "secondaryCamera", "adapterCameraInfo", "Landroidx/camera/core/impl/AdapterCameraInfo;", "secondaryAdapterCameraInfo", "compositionSettings", "Landroidx/camera/core/CompositionSettings;", "secondaryCompositionSettings", "provideInternal", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CameraUseCaseAdapterProviderImpl implements CameraUseCaseAdapterProvider {

    @NotNull
    private final CameraCoordinator cameraCoordinator;

    @NotNull
    private final CameraRepository cameraRepository;

    @NotNull
    private final StreamSpecsCalculator streamSpecsCalculator;

    @NotNull
    private final UseCaseConfigFactory useCaseConfigFactory;

    @Override // androidx.camera.core.CameraUseCaseAdapterProvider
    @NotNull
    public CameraUseCaseAdapter provide(@NotNull String cameraId) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        CameraInternal camera = this.cameraRepository.getCamera(cameraId);
        Intrinsics.checkNotNullExpressionValue(camera, "getCamera(...)");
        return provideInternal$default(this, camera, null, new AdapterCameraInfo(camera.getCameraInfoInternal(), CameraConfigs.defaultConfig()), null, null, null, 58, null);
    }

    public CameraUseCaseAdapterProviderImpl(@NotNull CameraRepository cameraRepository, @NotNull CameraCoordinator cameraCoordinator, @NotNull UseCaseConfigFactory useCaseConfigFactory, @NotNull StreamSpecsCalculator streamSpecsCalculator) {
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        Intrinsics.checkNotNullParameter(cameraCoordinator, "cameraCoordinator");
        Intrinsics.checkNotNullParameter(useCaseConfigFactory, "useCaseConfigFactory");
        Intrinsics.checkNotNullParameter(streamSpecsCalculator, "streamSpecsCalculator");
        this.cameraRepository = cameraRepository;
        this.cameraCoordinator = cameraCoordinator;
        this.useCaseConfigFactory = useCaseConfigFactory;
        this.streamSpecsCalculator = streamSpecsCalculator;
    }

    private final CameraUseCaseAdapter provideInternal(CameraInternal camera, CameraInternal secondaryCamera, AdapterCameraInfo adapterCameraInfo, AdapterCameraInfo secondaryAdapterCameraInfo, CompositionSettings compositionSettings, CompositionSettings secondaryCompositionSettings) {
        return new CameraUseCaseAdapter(camera, secondaryCamera, adapterCameraInfo, secondaryAdapterCameraInfo, compositionSettings, secondaryCompositionSettings, this.cameraCoordinator, this.streamSpecsCalculator, this.useCaseConfigFactory);
    }

    public static /* synthetic */ CameraUseCaseAdapter provideInternal$default(CameraUseCaseAdapterProviderImpl cameraUseCaseAdapterProviderImpl, CameraInternal cameraInternal, CameraInternal cameraInternal2, AdapterCameraInfo adapterCameraInfo, AdapterCameraInfo adapterCameraInfo2, CompositionSettings compositionSettings, CompositionSettings compositionSettings2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cameraInternal2 = null;
        }
        if ((i11 & 8) != 0) {
            adapterCameraInfo2 = null;
        }
        if ((i11 & 16) != 0) {
            compositionSettings = CompositionSettings.DEFAULT;
        }
        if ((i11 & 32) != 0) {
            compositionSettings2 = CompositionSettings.DEFAULT;
        }
        return cameraUseCaseAdapterProviderImpl.provideInternal(cameraInternal, cameraInternal2, adapterCameraInfo, adapterCameraInfo2, compositionSettings, compositionSettings2);
    }

    @Override // androidx.camera.core.CameraUseCaseAdapterProvider
    @NotNull
    public CameraUseCaseAdapter provide(@NotNull CameraInternal camera, @Nullable CameraInternal secondaryCamera, @NotNull AdapterCameraInfo adapterCameraInfo, @Nullable AdapterCameraInfo secondaryAdapterCameraInfo, @NotNull CompositionSettings compositionSettings, @NotNull CompositionSettings secondaryCompositionSettings) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(adapterCameraInfo, "adapterCameraInfo");
        Intrinsics.checkNotNullParameter(compositionSettings, "compositionSettings");
        Intrinsics.checkNotNullParameter(secondaryCompositionSettings, "secondaryCompositionSettings");
        return provideInternal(camera, secondaryCamera, adapterCameraInfo, secondaryAdapterCameraInfo, compositionSettings, secondaryCompositionSettings);
    }
}
