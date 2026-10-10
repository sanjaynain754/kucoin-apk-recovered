package com.jumio.core.extraction.docfinder.processor.base;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.core.data.document.CornerPoints;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorParameterInterface;
import com.jumio.core.processor.ProcessorState;
import com.jumio.core.processor.SingleImageProcessorBase;
import com.jumio.core.processor.alignment.AlignmentConfig;
import com.jumio.core.processor.alignment.AlignmentProcessorInterface;
import com.jumio.core.processor.alignment.AlignmentProcessorState;
import com.jumio.core.processor.base.BaseProcessorConfig;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016J\u0012\u0010 \u001a\u00020!2\b\b\u0002\u0010\u001f\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor;", "Lcom/jumio/core/processor/SingleImageProcessorBase;", "Lcom/jumio/core/processor/base/BaseProcessorConfig;", "Lcom/jumio/core/processor/ProcessorImage$BaseImage;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorInterface;", "config", "alignmentConfig", "Lcom/jumio/core/processor/alignment/AlignmentConfig;", "<init>", "(Lcom/jumio/core/processor/base/BaseProcessorConfig;Lcom/jumio/core/processor/alignment/AlignmentConfig;)V", "uhdImageRequired", "", "getUhdImageRequired", "()Z", "previousCorners", "Lcom/jumio/core/data/document/CornerPoints;", "value", "Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;", "baseImageData", "getBaseImageData", "()Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;", "process", "Lcom/jumio/core/processor/ProcessorState;", "bitmap", "Landroid/graphics/Bitmap;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "corners", "invalidate", "", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDocfinderBaseImageProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocfinderBaseImageProcessor.kt\ncom/jumio/core/extraction/docfinder/processor/base/DocfinderBaseImageProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class DocfinderBaseImageProcessor extends SingleImageProcessorBase<BaseProcessorConfig, ProcessorImage.BaseImage> implements AlignmentProcessorInterface {

    /* JADX INFO: renamed from: a */
    public final AlignmentConfig f14089a;

    /* JADX INFO: renamed from: b */
    public final boolean f14090b;

    /* JADX INFO: renamed from: c */
    public CornerPoints f14091c;

    /* JADX INFO: renamed from: d */
    public BaseImageData f14092d;

    @Override // com.jumio.core.processor.ImageProcessorInterface, com.jumio.core.processor.CornerPointImageProcessorInterface
    @NotNull
    public ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect rect, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface processorParameterInterface) {
        return super.process(bitmap, cameraSettings, rect, metadata, processorParameterInterface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocfinderBaseImageProcessor(@NotNull BaseProcessorConfig config, @NotNull AlignmentConfig alignmentConfig) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(alignmentConfig, "alignmentConfig");
        this.f14089a = alignmentConfig;
        this.f14090b = true;
        this.f14091c = new CornerPoints(null, null, null, null, 15, null);
        this.f14092d = new BaseImageData(null, false, false, 0.0d, Math.toDegrees(alignmentConfig.getDocfinderSettingsModel().getF14219e()), 0.0d, 47, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getBaseImageData, reason: from getter */
    public final BaseImageData getF14092d() {
        return this.f14092d;
    }

    @Override // com.jumio.core.processor.AbstractC9312a, com.jumio.core.processor.ImageProcessorInterface
    /* JADX INFO: renamed from: getUhdImageRequired, reason: from getter */
    public boolean getF14134a() {
        return this.f14090b;
    }

    @Override // com.jumio.core.processor.CornerPointImageProcessorInterface
    @NotNull
    public ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, @NotNull Frame.Metadata metadata, @NotNull CornerPoints corners) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(corners, "corners");
        if (getCurrentState() instanceof ProcessorState.TakePicture) {
            this.f14092d = BaseImageData.copy$default(this.f14092d, corners, false, false, 0.0d, 0.0d, 0.0d, 56, null);
            ProcessorState.Finished finished = new ProcessorState.Finished(null, null, 3, null);
            setCurrentState(finished);
            return finished;
        }
        Triple<Boolean, Boolean, Double> tripleCheckHorizontal = corners.checkHorizontal(this.f14092d.getRotationTolerance(), this.f14092d.getRotationThreshold());
        boolean zBooleanValue = tripleCheckHorizontal.component1().booleanValue();
        this.f14092d = BaseImageData.copy$default(this.f14092d, corners, tripleCheckHorizontal.component2().booleanValue(), false, tripleCheckHorizontal.component3().doubleValue(), 0.0d, 0.0d, 52, null);
        if (!corners.isValid()) {
            this.f14091c = new CornerPoints(null, null, null, null, 15, null);
            resetHoldStillTimestamp();
            AlignmentProcessorState.CenterId centerId = AlignmentProcessorState.CenterId.INSTANCE;
            setCurrentState(centerId);
            return centerId;
        }
        AlignmentProcessorState alignmentProcessorStateCheckDocumentPosition = checkDocumentPosition(this.f14089a, corners, cameraSettings, extractionArea, metadata.isPortrait(), true);
        this.f14092d = BaseImageData.copy$default(this.f14092d, null, false, true, 0.0d, 0.0d, 0.0d, 59, null);
        if (!(alignmentProcessorStateCheckDocumentPosition instanceof AlignmentProcessorState.Valid)) {
            this.f14091c = corners;
            resetHoldStillTimestamp();
            setCurrentState(alignmentProcessorStateCheckDocumentPosition);
            return alignmentProcessorStateCheckDocumentPosition;
        }
        if (!corners.checkEdgeLength() || !corners.checkInsideAngles() || !zBooleanValue) {
            this.f14091c = corners;
            resetHoldStillTimestamp();
            AlignmentProcessorState.HoldStraight holdStraight = AlignmentProcessorState.HoldStraight.INSTANCE;
            setCurrentState(holdStraight);
            return holdStraight;
        }
        if (Math.max(corners.getF13789j(), corners.getF13788i()) * 0.1f > this.f14091c.averageDistance(corners)) {
            ProcessorState holdStill = shouldHoldStill(getImage().getHoldStillTime()) ? new ProcessorState.HoldStill(getImage().getHoldStillTime()) : new ProcessorState.TakePicture(null, null, null, 7, null);
            setCurrentState(holdStill);
            return holdStill;
        }
        this.f14091c = corners;
        resetHoldStillTimestamp();
        AlignmentProcessorState.Invalid invalid = AlignmentProcessorState.Invalid.INSTANCE;
        setCurrentState(invalid);
        return invalid;
    }

    @Override // com.jumio.core.processor.alignment.AlignmentProcessorInterface
    @NotNull
    public AlignmentProcessorState checkDocumentPosition(@NotNull AlignmentConfig alignmentConfig, @NotNull CornerPoints cornerPoints, @NotNull CameraSettings cameraSettings, @NotNull Rect rect, boolean z11, boolean z12) {
        return super.checkDocumentPosition(alignmentConfig, cornerPoints, cameraSettings, rect, z11, z12);
    }
}
