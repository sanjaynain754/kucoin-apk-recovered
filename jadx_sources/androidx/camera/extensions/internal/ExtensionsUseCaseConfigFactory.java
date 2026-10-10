package androidx.camera.extensions.internal;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class ExtensionsUseCaseConfigFactory implements UseCaseConfigFactory {
    private final ImageAnalysisConfigProvider mImageAnalysisConfigProvider;
    private final ImageCaptureConfigProvider mImageCaptureConfigProvider;
    private final PreviewConfigProvider mPreviewConfigProvider;

    private boolean isImageAnalysisSupported(List<Pair<Integer, Size[]>> list) {
        if (list == null) {
            return false;
        }
        for (Pair<Integer, Size[]> pair : list) {
            int iIntValue = ((Integer) pair.first).intValue();
            Size[] sizeArr = (Size[]) pair.second;
            if (iIntValue == 35 && sizeArr != null && sizeArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory$1 */
    public static /* synthetic */ class C11971 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType */
        static final /* synthetic */ int[] f1896x65b8d150;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            f1896x65b8d150 = iArr;
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1896x65b8d150[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1896x65b8d150[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1896x65b8d150[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public Config getConfig(UseCaseConfigFactory.CaptureType captureType, int i11) {
        MutableOptionsBundle mutableOptionsBundleFrom;
        int i12 = C11971.f1896x65b8d150[captureType.ordinal()];
        if (i12 == 1) {
            mutableOptionsBundleFrom = MutableOptionsBundle.from((Config) this.mImageCaptureConfigProvider.getConfig());
        } else if (i12 == 2) {
            mutableOptionsBundleFrom = MutableOptionsBundle.from((Config) this.mPreviewConfigProvider.getConfig());
        } else {
            if (i12 != 3) {
                if (i12 != 4) {
                    return null;
                }
                throw new IllegalArgumentException("Should not go here. VideoCapture is supported by recording the preview stream when Extension is enabled.");
            }
            ImageAnalysisConfig config = this.mImageAnalysisConfigProvider.getConfig();
            if (!isImageAnalysisSupported(config.getSupportedResolutions(null))) {
                throw new IllegalArgumentException("ImageAnalysis is not supported when Extension is enabled on this device. Check ExtensionsManager.isImageAnalysisSupported before binding the ImageAnalysis use case.");
            }
            mutableOptionsBundleFrom = MutableOptionsBundle.from((Config) config);
        }
        mutableOptionsBundleFrom.insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.TRUE);
        return OptionsBundle.from(mutableOptionsBundleFrom);
    }

    public ExtensionsUseCaseConfigFactory(VendorExtender vendorExtender) {
        this.mImageCaptureConfigProvider = new ImageCaptureConfigProvider(vendorExtender);
        this.mPreviewConfigProvider = new PreviewConfigProvider(vendorExtender);
        this.mImageAnalysisConfigProvider = new ImageAnalysisConfigProvider(vendorExtender);
    }
}
