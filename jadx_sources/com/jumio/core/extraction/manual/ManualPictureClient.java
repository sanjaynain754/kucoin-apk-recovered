package com.jumio.core.extraction.manual;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.analytics.MetaInfo;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.ImageMetadata;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.extraction.manual.processor.ManualProcessorFactory;
import com.jumio.core.extraction.result.DataExtractionResult;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.extraction.result.ExtractionResultProvider;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.processor.ImageProcessorHandler;
import com.jumio.core.processor.ImageProcessorHandlerInterface;
import com.jumio.core.processor.ImageProcessorHandlerInterfaceKt;
import com.jumio.core.processor.ImageProcessorInterface;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorState;
import com.jumio.core.processor.base.BaseProcessorConfig;
import com.jumio.core.processor.challenge.CameraChallengeProcessorState;
import com.jumio.core.processor.flash.FlashProcessorState$Flash;
import com.jumio.core.processor.queue.ProcessorQueue;
import com.jumio.core.scope.ScopeProviderInterface;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.util.concurrent.atomic.AtomicBoolean;
import jumio.core.C40730t2;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\n\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/jumio/core/extraction/manual/ManualPictureClient;", "Lcom/jumio/core/extraction/ExtractionClient;", "context", "Landroid/content/Context;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "imageProcessorHandler", "Lcom/jumio/core/processor/ImageProcessorHandlerInterface;", "<init>", "(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/processor/ImageProcessorHandlerInterface;)V", "takePicture", "Ljava/util/concurrent/atomic/AtomicBoolean;", "init", "", "configure", "dataManager", "Lcom/jumio/core/persistence/DataManager;", "configurationModel", "Lcom/jumio/core/model/StaticModel;", "process", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "shouldFeed", "", "takePictureManually", BridgeParamKeyKt.CAPTURE, "convertFrameToBitmap", "Landroid/graphics/Bitmap;", "(Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "publishState", "state", "Lcom/jumio/core/processor/ProcessorState;", "image", "Lcom/jumio/core/processor/ProcessorImage;", "skipImage", DocumentClassifier.KEY_SIDE, "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ManualPictureClient extends ExtractionClient {

    /* JADX INFO: renamed from: u */
    public final ImageProcessorHandlerInterface f14132u;

    /* JADX INFO: renamed from: v */
    public final AtomicBoolean f14133v;

    public /* synthetic */ ManualPictureClient(Context context, ScopeProviderInterface scopeProviderInterface, ImageProcessorHandlerInterface imageProcessorHandlerInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, scopeProviderInterface, (i11 & 4) != 0 ? new ImageProcessorHandler(new ProcessorQueue(), new ManualProcessorFactory()) : imageProcessorHandlerInterface);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public boolean shouldFeed() {
        return true;
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public boolean takePictureManually() {
        return true;
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void capture(@Nullable Frame frame) {
        String str;
        ImageMetadata imageMetadata;
        super.capture(frame);
        ImageProcessorInterface currentProcessor = this.f14132u.getCurrentProcessor();
        if (currentProcessor == null) {
            setResult(false);
            return;
        }
        if (frame != null) {
            Bitmap bitmapApplyPreviewFrameCropToHighResolutionFrame$default = BitmapUtilKt.applyPreviewFrameCropToHighResolutionFrame$default(frame, getF13860r(), getF13861s(), getF13855m(), null, 16, null);
            String classifier = currentProcessor.getImage().getClassifier();
            ProcessorState state = currentProcessor.getState();
            ProcessorState.TakePicture takePicture = state instanceof ProcessorState.TakePicture ? (ProcessorState.TakePicture) state : null;
            if (takePicture != null) {
                String batchId = takePicture.getBatchId();
                imageMetadata = takePicture.getImageMetadata();
                str = batchId;
            } else {
                str = null;
                imageMetadata = null;
            }
            publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getSaveHighResolutionImage(), new ImageExtractionResult(bitmapApplyPreviewFrameCropToHighResolutionFrame$default, getF13857o(), classifier, str, imageMetadata, frame.getMetadata().getCameraConnectionData()), null, 4, null));
        }
        setResult(false);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void configure(@NotNull DataManager dataManager, @NotNull StaticModel configurationModel) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(configurationModel, "configurationModel");
        super.configure(dataManager, configurationModel);
        PhysicalIdScanPartModel physicalIdScanPartModel = configurationModel instanceof PhysicalIdScanPartModel ? (PhysicalIdScanPartModel) configurationModel : null;
        if (physicalIdScanPartModel == null) {
            this.f14132u.initProcessorWithConfig(new BaseProcessorConfig(new ProcessorImage.BaseImage(getF13857o(), 0L, false, 6, null), 0L, 0L, 6, null));
        } else {
            setCenterCropExtractionArea(physicalIdScanPartModel.getFormat() != DocumentFormat.NONE);
            ImageProcessorHandlerInterfaceKt.initProcessorsFromScanPartModel(this.f14132u, (PhysicalIdScanPartModel) configurationModel);
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void process(@NotNull Frame frame, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        if (this.f14133v.get()) {
            C41696j.m91104d(getF13852j().getMainScope(), getF13852j().getBackgroundDispatcher(), null, new C40730t2(this, frame, cameraSettings, extractionArea, null), 2, null);
        } else {
            setResult(false);
        }
    }

    public static final void access$publishState(ManualPictureClient manualPictureClient, ProcessorState processorState, ProcessorImage processorImage) {
        ExtractionResult extractionResult;
        MetaInfo metaInfo;
        manualPictureClient.getClass();
        if (processorState instanceof CameraChallengeProcessorState.ApplyCaptureSettings) {
            manualPictureClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getSetChallenge(), ((CameraChallengeProcessorState.ApplyCaptureSettings) processorState).getSettings(), null, 4, null));
            return;
        }
        if (processorState instanceof FlashProcessorState$Flash) {
            manualPictureClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getFlash(), ((FlashProcessorState$Flash) processorState).getRequestedState(), null, 4, null));
            return;
        }
        if (processorState instanceof ProcessorState.RequestMetering) {
            manualPictureClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getMetering(), ((ProcessorState.RequestMetering) processorState).getMeteringConfig(), null, 4, null));
            return;
        }
        if (processorState instanceof ProcessorState.Finished) {
            ProcessorState.Finished finished = (ProcessorState.Finished) processorState;
            Object result = finished.getResult();
            if (result instanceof ExtractionResultProvider) {
                extractionResult = ((ExtractionResultProvider) result).getExtractionResult(manualPictureClient.getF13857o(), processorImage.getClassifier(), finished.getBatchId());
            } else {
                extractionResult = new ExtractionResult(manualPictureClient.getF13857o(), processorImage.getClassifier(), finished.getBatchId());
            }
            if (extractionResult instanceof DataExtractionResult) {
                metaInfo = ((DataExtractionResult) extractionResult).getMetaInfo();
            } else {
                metaInfo = null;
            }
            manualPictureClient.publishUpdate(ExtractionUpdateInterface.INSTANCE.build(ExtractionUpdateState.INSTANCE.getShotTaken(), extractionResult, metaInfo));
            return;
        }
        Log.m14479v("ManualPictureClient", "Nothing to publish for state: " + processorState);
    }

    public static final void access$skipImage(ManualPictureClient manualPictureClient, String str) {
        manualPictureClient.getClass();
        manualPictureClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getSkipImage(), new ExtractionResult(manualPictureClient.getF13857o(), str, null, 4, null), null, 4, null));
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void init() {
        super.init();
        this.f14133v.set(false);
        this.f14132u.resetCurrentProcessor();
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void takePicture() {
        if (getDataExtraction()) {
            this.f14133v.set(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualPictureClient(@NotNull Context context, @NotNull ScopeProviderInterface scopeProvider, @NotNull ImageProcessorHandlerInterface imageProcessorHandler) {
        super(context, scopeProvider);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(imageProcessorHandler, "imageProcessorHandler");
        this.f14132u = imageProcessorHandler;
        this.f14133v = new AtomicBoolean(false);
    }
}
