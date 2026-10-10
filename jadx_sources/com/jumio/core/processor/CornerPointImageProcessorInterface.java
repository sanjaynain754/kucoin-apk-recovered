package com.jumio.core.processor;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.core.data.document.CornerPoints;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH&J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/CornerPointImageProcessorInterface;", "Lcom/jumio/core/processor/ImageProcessorInterface;", "process", "Lcom/jumio/core/processor/ProcessorState;", "bitmap", "Landroid/graphics/Bitmap;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "corners", "Lcom/jumio/core/data/document/CornerPoints;", "parameterInterface", "Lcom/jumio/core/processor/ProcessorParameterInterface;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface CornerPointImageProcessorInterface extends ImageProcessorInterface {

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static ProcessorState process(@NotNull CornerPointImageProcessorInterface cornerPointImageProcessorInterface, @NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface parameterInterface) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
            Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(parameterInterface, "parameterInterface");
            return CornerPointImageProcessorInterface.super.process(bitmap, cameraSettings, extractionArea, metadata, parameterInterface);
        }
    }

    @NotNull
    ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, @NotNull Frame.Metadata metadata, @NotNull CornerPoints corners);

    @NotNull
    default ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface parameterInterface) {
        CornerPoints corners;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(parameterInterface, "parameterInterface");
        CornerPointParameters cornerPointParameters = parameterInterface instanceof CornerPointParameters ? (CornerPointParameters) parameterInterface : null;
        return process(bitmap, cameraSettings, extractionArea, metadata, (cornerPointParameters == null || (corners = cornerPointParameters.getCorners()) == null) ? new CornerPoints(null, null, null, null, 15, null) : corners);
    }

    static /* synthetic */ ProcessorState process$default(CornerPointImageProcessorInterface cornerPointImageProcessorInterface, Bitmap bitmap, CameraSettings cameraSettings, Rect rect, Frame.Metadata metadata, CornerPoints cornerPoints, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: process");
        }
        if ((i11 & 16) != 0) {
            cornerPoints = new CornerPoints(null, null, null, null, 15, null);
        }
        return cornerPointImageProcessorInterface.process(bitmap, cameraSettings, rect, metadata, cornerPoints);
    }
}
