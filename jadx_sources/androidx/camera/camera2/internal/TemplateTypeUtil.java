package androidx.camera.camera2.internal;

import androidx.annotation.OptIn;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.core.ExperimentalZeroShutterLag;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* JADX INFO: loaded from: classes23.dex */
public class TemplateTypeUtil {

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.TemplateTypeUtil$1 */
    public static /* synthetic */ class C07121 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType */
        static final /* synthetic */ int[] f1229x65b8d150;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            f1229x65b8d150 = iArr;
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1229x65b8d150[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1229x65b8d150[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1229x65b8d150[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1229x65b8d150[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    public static int getCaptureConfigTemplateType(UseCaseConfigFactory.CaptureType captureType, int i11) {
        int i12 = C07121.f1229x65b8d150[captureType.ordinal()];
        if (i12 != 1) {
            return (i12 == 2 && DeviceQuirks.get(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i11 == 2 ? 5 : 2;
    }

    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    public static int getSessionConfigTemplateType(UseCaseConfigFactory.CaptureType captureType, int i11) {
        int i12 = C07121.f1229x65b8d150[captureType.ordinal()];
        if (i12 != 1) {
            return (i12 == 2 && DeviceQuirks.get(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i11 == 2 ? 5 : 1;
    }

    private TemplateTypeUtil() {
    }
}
