package com.jumio.core.extraction.docfinder.processor.tilted;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.ImageMetadata;
import com.jumio.core.data.document.CornerPoints;
import com.jumio.core.extraction.docfinder.calculator.DocumentTilt;
import com.jumio.core.extraction.docfinder.calculator.DocumentTiltCalculator;
import com.jumio.core.extraction.docfinder.calculator.DocumentTiltCalculatorInterface;
import com.jumio.core.extraction.docfinder.calculator.TiltDirection;
import com.jumio.core.models.TiltRange;
import com.jumio.core.processor.MultiImageProcessorBase;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorParameterInterface;
import com.jumio.core.processor.ProcessorState;
import com.jumio.core.processor.alignment.AlignmentConfig;
import com.jumio.core.processor.alignment.AlignmentProcessorInterface;
import com.jumio.core.processor.alignment.AlignmentProcessorState;
import com.jumio.core.processor.tilted.TiltedProcessorConfig;
import com.jumio.sdk.enums.JumioFlashState;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00010B!\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J0\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\n\u0010*\u001a\u0004\u0018\u00010!H\u0002J\"\u0010+\u001a\u0004\u0018\u00010!2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/processor/tilted/TiltedImageProcessor;", "Lcom/jumio/core/processor/MultiImageProcessorBase;", "Lcom/jumio/core/processor/tilted/TiltedProcessorConfig;", "Lcom/jumio/core/processor/ProcessorImage$TiltedImage;", "Lcom/jumio/core/processor/alignment/AlignmentProcessorInterface;", "config", "alignmentConfig", "Lcom/jumio/core/processor/alignment/AlignmentConfig;", "tiltCalculator", "Lcom/jumio/core/extraction/docfinder/calculator/DocumentTiltCalculatorInterface;", "<init>", "(Lcom/jumio/core/processor/tilted/TiltedProcessorConfig;Lcom/jumio/core/processor/alignment/AlignmentConfig;Lcom/jumio/core/extraction/docfinder/calculator/DocumentTiltCalculatorInterface;)V", "referenceRatio", "", "Ljava/lang/Float;", "requiredTiltRange", "Lcom/jumio/core/models/TiltRange;", "getRequiredTiltRange", "()Lcom/jumio/core/models/TiltRange;", "targetAngle", "", "getTargetAngle", "()I", "imageTakenOrSkipped", "", "getImageTakenOrSkipped", "()Z", "checkRequirements", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "reset", "", "process", "Lcom/jumio/core/processor/ProcessorState;", "bitmap", "Landroid/graphics/Bitmap;", "extractionArea", "Landroid/graphics/Rect;", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "corners", "Lcom/jumio/core/data/document/CornerPoints;", "checkLastImageFinished", "checkHoldStillRequired", "currentTilt", "Lcom/jumio/core/extraction/docfinder/calculator/DocumentTilt;", "holdStillTime", "", "Companion", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTiltedImageProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiltedImageProcessor.kt\ncom/jumio/core/extraction/docfinder/processor/tilted/TiltedImageProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
public final class TiltedImageProcessor extends MultiImageProcessorBase<TiltedProcessorConfig, ProcessorImage.TiltedImage> implements AlignmentProcessorInterface {

    @NotNull
    public static final String BATCH_ID = "TILT";

    /* JADX INFO: renamed from: c */
    public final AlignmentConfig f14093c;

    /* JADX INFO: renamed from: d */
    public final DocumentTiltCalculatorInterface f14094d;

    /* JADX INFO: renamed from: e */
    public Float f14095e;

    public /* synthetic */ TiltedImageProcessor(TiltedProcessorConfig tiltedProcessorConfig, AlignmentConfig alignmentConfig, DocumentTiltCalculatorInterface documentTiltCalculatorInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(tiltedProcessorConfig, alignmentConfig, (i11 & 4) != 0 ? new DocumentTiltCalculator() : documentTiltCalculatorInterface);
    }

    @Override // com.jumio.core.processor.ImageProcessorInterface, com.jumio.core.processor.CornerPointImageProcessorInterface
    @NotNull
    public ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect rect, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface processorParameterInterface) {
        return super.process(bitmap, cameraSettings, rect, metadata, processorParameterInterface);
    }

    @Override // com.jumio.core.processor.AbstractC9312a, com.jumio.core.processor.ImageProcessorInterface
    public boolean checkRequirements(@NotNull CameraSettings cameraSettings) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d9  */
    @Override // com.jumio.core.processor.CornerPointImageProcessorInterface
    @NotNull
    public ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, @NotNull Frame.Metadata metadata, @NotNull CornerPoints corners) {
        boolean z11;
        int iAccess$getMedian;
        int i11;
        int angle;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(corners, "corners");
        Object obj = null;
        Object obj2 = null;
        tilt = null;
        ProcessorState tilt = null;
        if ((getCurrentState() instanceof ProcessorState.TakePicture) || (getCurrentState() instanceof ProcessorState.Skip)) {
            ProcessorState flash = (getCurrentImage().getFlash() && getNextImage() == null) ? new TiltedProcessorState.Flash(JumioFlashState.OFF) : getNextImage() == null ? new ProcessorState.Finished(BATCH_ID, null, 2, null) : null;
            if (flash != null) {
                setCurrentState(flash);
                return flash;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        ProcessorState currentState = getCurrentState();
        TiltedProcessorState.Flash flash2 = currentState instanceof TiltedProcessorState.Flash ? (TiltedProcessorState.Flash) currentState : null;
        if (flash2 != null) {
            if (!getImageStarted() && getNextImage() == null && flash2.getRequestedState() == JumioFlashState.OFF) {
                ProcessorState.Finished finished = new ProcessorState.Finished(BATCH_ID, null, 2, null);
                setCurrentState(finished);
                return finished;
            }
            setImageStarted(false);
        }
        if (z11) {
            moveToNextImage();
        }
        if (!corners.isValid()) {
            resetHoldStillTimestamp();
            AlignmentProcessorState.CenterId centerId = AlignmentProcessorState.CenterId.INSTANCE;
            setCurrentState(centerId);
            return centerId;
        }
        if (getCurrentState() instanceof TiltedProcessorState.ReferenceCorners) {
            this.f14095e = Float.valueOf(corners.getAspectRatio());
        } else {
            AlignmentProcessorState alignmentProcessorStateCheckDocumentPosition = checkDocumentPosition(this.f14093c, corners, cameraSettings, extractionArea, metadata.isPortrait(), false);
            if (!(alignmentProcessorStateCheckDocumentPosition instanceof AlignmentProcessorState.Valid)) {
                resetHoldStillTimestamp();
                setCurrentState(alignmentProcessorStateCheckDocumentPosition);
                return alignmentProcessorStateCheckDocumentPosition;
            }
        }
        if (this.f14095e == null) {
            TiltedProcessorState.ReferenceCorners referenceCorners = TiltedProcessorState.ReferenceCorners.INSTANCE;
            setCurrentState(referenceCorners);
            return referenceCorners;
        }
        if (getImageStarted()) {
            TiltedProcessorState.Flash flash3 = new TiltedProcessorState.Flash(getCurrentImage().getFlash() ? JumioFlashState.ON : JumioFlashState.OFF);
            setCurrentState(flash3);
            return flash3;
        }
        Float f11 = this.f14095e;
        if (f11 == null) {
            AlignmentProcessorState.Invalid invalid = AlignmentProcessorState.Invalid.INSTANCE;
            setCurrentState(invalid);
            return invalid;
        }
        DocumentTilt documentTiltCalculateTilt = this.f14094d.calculateTilt(corners, f11.floatValue());
        if (documentTiltCalculateTilt.getVerticalDirection() == TiltDirection.DOWN) {
            resetHoldStillTimestamp();
            int i12 = -documentTiltCalculateTilt.getAngle();
            for (Object obj3 : getNextImages()) {
                if (((ProcessorImage.TiltedImage) obj3).getHoldStillTime() != 0) {
                    obj2 = obj3;
                    break;
                }
            }
            ProcessorImage.TiltedImage tiltedImage = (ProcessorImage.TiltedImage) obj2;
            if (tiltedImage == null) {
                tiltedImage = (ProcessorImage.TiltedImage) CollectionsKt.last((List) getImages());
            }
            TiltedProcessorState.Tilt tilt2 = new TiltedProcessorState.Tilt(i12, TiltedImageProcessorKt.access$getMedian(TiltedImageProcessorKt.access$asRange(tiltedImage.getTiltRange())));
            setCurrentState(tilt2);
            return tilt2;
        }
        IntRange intRangeAccess$asRange = TiltedImageProcessorKt.access$asRange(getCurrentImage().getTiltRange());
        int first = intRangeAccess$asRange.getFirst();
        int last = intRangeAccess$asRange.getLast();
        int angle2 = documentTiltCalculateTilt.getAngle();
        if (first > angle2 || angle2 > last) {
            if (getCurrentImage().getHoldStillTime() == 0 && documentTiltCalculateTilt.getAngle() > getCurrentImage().getTiltRange().getMaxAngle() && getNextImage() != null) {
                ProcessorState.Skip skip = ProcessorState.Skip.INSTANCE;
                setCurrentState(skip);
                return skip;
            }
            resetHoldStillTimestamp();
            int angle3 = documentTiltCalculateTilt.getAngle();
            for (Object obj4 : getNextImages()) {
                if (((ProcessorImage.TiltedImage) obj4).getHoldStillTime() != 0) {
                    obj = obj4;
                    break;
                }
            }
            ProcessorImage.TiltedImage tiltedImage2 = (ProcessorImage.TiltedImage) obj;
            if (tiltedImage2 == null) {
                tiltedImage2 = (ProcessorImage.TiltedImage) CollectionsKt.last((List) getImages());
            }
            TiltedProcessorState.Tilt tilt3 = new TiltedProcessorState.Tilt(angle3, TiltedImageProcessorKt.access$getMedian(TiltedImageProcessorKt.access$asRange(tiltedImage2.getTiltRange())));
            setCurrentState(tilt3);
            return tilt3;
        }
        TiltRange tiltRange = getCurrentImage().getTiltRange();
        long holdStillTime = getCurrentImage().getHoldStillTime();
        if (holdStillTime != 0) {
            if (getCurrentState() instanceof ProcessorState.HoldStill) {
                IntRange intRangeAccess$asRange2 = TiltedImageProcessorKt.access$asRange(tiltRange);
                int first2 = intRangeAccess$asRange2.getFirst();
                int last2 = intRangeAccess$asRange2.getLast();
                int angle4 = documentTiltCalculateTilt.getAngle();
                if (first2 > angle4 || angle4 > last2) {
                    iAccess$getMedian = TiltedImageProcessorKt.access$getMedian(TiltedImageProcessorKt.access$asRange(tiltRange));
                    i11 = iAccess$getMedian - 1;
                    int i13 = iAccess$getMedian + 1;
                    angle = documentTiltCalculateTilt.getAngle();
                    if (i11 <= angle || angle > i13 || !shouldHoldStill(holdStillTime)) {
                        resetHoldStillTimestamp();
                        tilt = new TiltedProcessorState.Tilt(documentTiltCalculateTilt.getAngle(), iAccess$getMedian);
                    } else {
                        tilt = new ProcessorState.HoldStill(holdStillTime);
                    }
                } else if (shouldHoldStill(holdStillTime)) {
                    tilt = new ProcessorState.HoldStill(holdStillTime);
                }
            } else {
                iAccess$getMedian = TiltedImageProcessorKt.access$getMedian(TiltedImageProcessorKt.access$asRange(tiltRange));
                i11 = iAccess$getMedian - 1;
                int i14 = iAccess$getMedian + 1;
                angle = documentTiltCalculateTilt.getAngle();
                if (i11 <= angle) {
                    resetHoldStillTimestamp();
                    tilt = new TiltedProcessorState.Tilt(documentTiltCalculateTilt.getAngle(), iAccess$getMedian);
                } else {
                    resetHoldStillTimestamp();
                    tilt = new TiltedProcessorState.Tilt(documentTiltCalculateTilt.getAngle(), iAccess$getMedian);
                }
            }
        }
        if (tilt != null) {
            setCurrentState(tilt);
            return tilt;
        }
        ProcessorState.TakePicture takePicture = new ProcessorState.TakePicture(BATCH_ID, new ImageMetadata.Tilted(documentTiltCalculateTilt.getAngle(), metadata.isFlashOn()), null, 4, null);
        setCurrentState(takePicture);
        return takePicture;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TiltedImageProcessor(@NotNull TiltedProcessorConfig config, @NotNull AlignmentConfig alignmentConfig, @NotNull DocumentTiltCalculatorInterface tiltCalculator) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(alignmentConfig, "alignmentConfig");
        Intrinsics.checkNotNullParameter(tiltCalculator, "tiltCalculator");
        this.f14093c = alignmentConfig;
        this.f14094d = tiltCalculator;
    }

    @Override // com.jumio.core.processor.alignment.AlignmentProcessorInterface
    @NotNull
    public AlignmentProcessorState checkDocumentPosition(@NotNull AlignmentConfig alignmentConfig, @NotNull CornerPoints cornerPoints, @NotNull CameraSettings cameraSettings, @NotNull Rect rect, boolean z11, boolean z12) {
        return super.checkDocumentPosition(alignmentConfig, cornerPoints, cameraSettings, rect, z11, z12);
    }

    @Override // com.jumio.core.processor.MultiImageProcessorBase, com.jumio.core.processor.AbstractC9312a, com.jumio.core.processor.ImageProcessorInterface
    public void reset() {
        super.reset();
        this.f14095e = null;
    }
}
