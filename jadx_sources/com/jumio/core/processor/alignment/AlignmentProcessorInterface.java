package com.jumio.core.processor.alignment;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.core.data.document.CornerPoints;
import com.jumio.core.processor.CornerPointImageProcessorInterface;
import com.jumio.core.processor.ProcessorParameterInterface;
import com.jumio.core.processor.ProcessorState;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000fÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/alignment/AlignmentProcessorInterface;", "Lcom/jumio/core/processor/CornerPointImageProcessorInterface;", "checkDocumentPosition", "Lcom/jumio/core/processor/alignment/AlignmentProcessorState;", "config", "Lcom/jumio/core/processor/alignment/AlignmentConfig;", "corners", "Lcom/jumio/core/data/document/CornerPoints;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "isPortrait", "", "checkAbsoluteIDSize", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AlignmentProcessorInterface extends CornerPointImageProcessorInterface {

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static AlignmentProcessorState checkDocumentPosition(@NotNull AlignmentProcessorInterface alignmentProcessorInterface, @NotNull AlignmentConfig config, @NotNull CornerPoints corners, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(corners, "corners");
            Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
            Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
            return AlignmentProcessorInterface.super.checkDocumentPosition(config, corners, cameraSettings, extractionArea, z11, z12);
        }

        @Deprecated
        @NotNull
        public static ProcessorState process(@NotNull AlignmentProcessorInterface alignmentProcessorInterface, @NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface parameterInterface) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
            Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(parameterInterface, "parameterInterface");
            return AlignmentProcessorInterface.super.process(bitmap, cameraSettings, extractionArea, metadata, parameterInterface);
        }
    }

    @NotNull
    default AlignmentProcessorState checkDocumentPosition(@NotNull AlignmentConfig config, @NotNull CornerPoints corners, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, boolean isPortrait, boolean checkAbsoluteIDSize) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        int iCompareCornersRelativeToPreview = corners.compareCornersRelativeToPreview(isPortrait, extractionArea, config.getHorizontalMargin(), config.getVerticalMargin(), config.getDocfinderSettingsModel().getF14220f());
        if (iCompareCornersRelativeToPreview == 0 && checkAbsoluteIDSize && !config.getDocfinderSettingsModel().getF14221g().isEmpty()) {
            iCompareCornersRelativeToPreview = corners.compareCornersAbsoluteToPreview(isPortrait, extractionArea, cameraSettings, config.getDocfinderSettingsModel().getF14221g(), config.getHorizontalMargin(), config.getVerticalMargin());
        }
        if (iCompareCornersRelativeToPreview != -1) {
            return iCompareCornersRelativeToPreview != 1 ? AlignmentProcessorState.Valid.INSTANCE : AlignmentProcessorState.TooClose.INSTANCE;
        }
        return AlignmentProcessorState.MoveCloser.INSTANCE;
    }
}
