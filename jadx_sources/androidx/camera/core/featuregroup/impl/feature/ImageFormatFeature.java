package androidx.camera.core.featuregroup.impl.feature;

import androidx.camera.core.featuregroup.GroupableFeature;
import com.jumio.core.constants.ConstantsKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ImageFormatFeature.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m90084d2 = {"Landroidx/camera/core/featuregroup/impl/feature/ImageFormatFeature;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "imageCaptureOutputFormat", "", "<init>", "(I)V", "getImageCaptureOutputFormat", "()I", "featureTypeInternal", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getFeatureTypeInternal$camera_core_release", "()Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "toString", "", "getOutputFormatLabel", "Companion", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ImageFormatFeature extends GroupableFeature {
    public static final int DEFAULT_IMAGE_CAPTURE_OUTPUT_FORMAT = 0;

    @NotNull
    private final FeatureTypeInternal featureTypeInternal = FeatureTypeInternal.IMAGE_FORMAT;
    private final int imageCaptureOutputFormat;

    private final String getOutputFormatLabel() {
        int i11 = this.imageCaptureOutputFormat;
        if (i11 == 0) {
            return ConstantsKt.FILE_TYPE_JPEG;
        }
        if (i11 == 1) {
            return "JPEG_R";
        }
        return "UNDEFINED(" + this.imageCaptureOutputFormat + ')';
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    @NotNull
    /* JADX INFO: renamed from: getFeatureTypeInternal$camera_core_release, reason: from getter */
    public FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    public final int getImageCaptureOutputFormat() {
        return this.imageCaptureOutputFormat;
    }

    @NotNull
    public String toString() {
        return "ImageFormatFeature(imageCaptureOutputFormat=" + getOutputFormatLabel() + ')';
    }

    public ImageFormatFeature(int i11) {
        this.imageCaptureOutputFormat = i11;
    }
}
