package androidx.camera.extensions;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.extensions.internal.AdvancedVendorExtender;
import androidx.camera.extensions.internal.BasicVendorExtender;
import androidx.camera.extensions.internal.Camera2ExtensionsInfo;
import androidx.camera.extensions.internal.Camera2ExtensionsUtil;
import androidx.camera.extensions.internal.Camera2ExtensionsVendorExtender;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.compat.workaround.PostviewFormatValidator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
final class ExtensionsInfo {
    private static final VendorExtender EMPTY_VENDOR_EXTENDER = new VendorExtender() { // from class: androidx.camera.extensions.ExtensionsInfo.1
    };
    private static final String EXTENDED_CAMERA_CONFIG_PROVIDER_ID_PREFIX = ":camera:camera-extensions-";
    private final Camera2ExtensionsInfo mCamera2ExtensionsInfo;
    private final CameraProvider mCameraProvider;
    private final boolean mShouldUseCamera2Extensions;
    private VendorExtenderFactory mVendorExtenderFactory;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ CameraConfig m2065a(ExtensionsInfo extensionsInfo, int i11, Identifier identifier, CameraInfo cameraInfo, Context context) {
        VendorExtender vendorExtenderCreateVendorExtender = extensionsInfo.mVendorExtenderFactory.createVendorExtender(i11, extensionsInfo.mShouldUseCamera2Extensions);
        vendorExtenderCreateVendorExtender.init(cameraInfo);
        ExtensionsConfig.Builder useCaseCombinationRequiredRule = new ExtensionsConfig.Builder().setExtensionMode(i11).setUseCaseConfigFactory((UseCaseConfigFactory) new ExtensionsUseCaseConfigFactory(vendorExtenderCreateVendorExtender)).setCompatibilityId(identifier).setZslDisabled(true).setPostviewSupported(vendorExtenderCreateVendorExtender.isPostviewAvailable()).setCaptureProcessProgressSupported(vendorExtenderCreateVendorExtender.isCaptureProcessProgressAvailable()).setUseCaseCombinationRequiredRule(1);
        if (extensionsInfo.mShouldUseCamera2Extensions) {
            useCaseCombinationRequiredRule.setPostviewFormatSelector(new PostviewFormatValidator().getPostviewFormatSelector());
        }
        SessionProcessor sessionProcessorCreateSessionProcessor = vendorExtenderCreateVendorExtender.createSessionProcessor(context);
        if (sessionProcessorCreateSessionProcessor != null) {
            useCaseCombinationRequiredRule.setSessionProcessor(sessionProcessorCreateSessionProcessor);
        }
        return useCaseCombinationRequiredRule.build();
    }

    private static String getExtendedCameraConfigProviderId(int i11) {
        if (i11 == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i11 == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i11 == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i11 == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i11 == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i11 == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }

    private static boolean isAdvancedExtenderSupported() {
        Version version = Version.VERSION_1_1;
        if (ClientVersion.isMaximumCompatibleVersion(version) || ExtensionVersion.isMaximumCompatibleVersion(version)) {
            return false;
        }
        return ExtensionVersion.isAdvancedExtenderSupported();
    }

    public VendorExtender getVendorExtender(int i11, boolean z11) {
        if (!z11) {
            return isAdvancedExtenderSupported() ? new AdvancedVendorExtender(i11) : new BasicVendorExtender(i11);
        }
        if (Build.VERSION.SDK_INT < 33) {
            return EMPTY_VENDOR_EXTENDER;
        }
        Camera2ExtensionsInfo camera2ExtensionsInfo = this.mCamera2ExtensionsInfo;
        Objects.requireNonNull(camera2ExtensionsInfo);
        return new Camera2ExtensionsVendorExtender(i11, camera2ExtensionsInfo);
    }

    @VisibleForTesting
    public void setVendorExtenderFactory(VendorExtenderFactory vendorExtenderFactory) {
        this.mVendorExtenderFactory = vendorExtenderFactory;
    }

    public ExtensionsInfo(CameraProvider cameraProvider, Context context) {
        this.mCameraProvider = cameraProvider;
        if (Build.VERSION.SDK_INT >= 31) {
            this.mCamera2ExtensionsInfo = new Camera2ExtensionsInfo((CameraManager) context.getSystemService(CameraManager.class));
        } else {
            this.mCamera2ExtensionsInfo = null;
        }
        this.mShouldUseCamera2Extensions = Camera2ExtensionsUtil.shouldUseCamera2Extensions(cameraProvider.getConfigImplType());
        this.mVendorExtenderFactory = new VendorExtenderFactory() { // from class: androidx.camera.extensions.a
            @Override // androidx.camera.extensions.VendorExtenderFactory
            public final VendorExtender createVendorExtender(int i11, boolean z11) {
                return this.f1888a.getVendorExtender(i11, z11);
            }
        };
    }

    private CameraFilter getFilter(int i11) {
        return new ExtensionCameraFilter(getExtendedCameraConfigProviderId(i11), this.mVendorExtenderFactory.createVendorExtender(i11, this.mShouldUseCamera2Extensions));
    }

    private void injectExtensionCameraConfig(final int i11) {
        final Identifier identifierCreate = Identifier.create(getExtendedCameraConfigProviderId(i11));
        if (ExtendedCameraConfigProviderStore.getConfigProvider(identifierCreate) == CameraConfigProvider.EMPTY) {
            ExtendedCameraConfigProviderStore.addConfig(identifierCreate, new CameraConfigProvider() { // from class: androidx.camera.extensions.b
                @Override // androidx.camera.core.impl.CameraConfigProvider
                public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
                    return ExtensionsInfo.m2065a(this.f1889a, i11, identifierCreate, cameraInfo, context);
                }
            });
        }
    }

    public Range<Long> getEstimatedCaptureLatencyRange(CameraSelector cameraSelector, int i11, Size size) {
        List<CameraInfo> listFilter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i11)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (listFilter.isEmpty()) {
            return null;
        }
        CameraInfo cameraInfo = listFilter.get(0);
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i11, this.mShouldUseCamera2Extensions);
            vendorExtenderCreateVendorExtender.init(cameraInfo);
            return vendorExtenderCreateVendorExtender.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    public CameraSelector getExtensionCameraSelectorAndInjectCameraConfig(CameraSelector cameraSelector, int i11) {
        if (isExtensionAvailable(cameraSelector, i11)) {
            Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof ExtensionCameraFilter) {
                    throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
                }
            }
            injectExtensionCameraConfig(i11);
            CameraSelector.Builder builderFromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
            builderFromSelector.addCameraFilter(getFilter(i11));
            return builderFromSelector.build();
        }
        throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    public boolean isExtensionAvailable(CameraSelector cameraSelector, int i11) {
        CameraSelector.Builder builderFromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        builderFromSelector.addCameraFilter(getFilter(i11));
        return !builderFromSelector.build().filter(this.mCameraProvider.getAvailableCameraInfos()).isEmpty();
    }

    public boolean isImageAnalysisSupported(CameraSelector cameraSelector, int i11) {
        List<CameraInfo> listFilter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i11)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (listFilter.isEmpty()) {
            return false;
        }
        CameraInfo cameraInfo = listFilter.get(0);
        VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i11, this.mShouldUseCamera2Extensions);
        vendorExtenderCreateVendorExtender.init(cameraInfo);
        Size[] supportedYuvAnalysisResolutions = vendorExtenderCreateVendorExtender.getSupportedYuvAnalysisResolutions();
        if (supportedYuvAnalysisResolutions == null || supportedYuvAnalysisResolutions.length <= 0) {
            return false;
        }
        return true;
    }
}
