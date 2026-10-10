package androidx.camera.core.imagecapture;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CaptureBundles;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.core.util.Pair;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public class ImagePipeline {
    static final ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new ExifRotationAvailability();
    static final byte JPEG_QUALITY_MAX_QUALITY = 100;
    static final byte JPEG_QUALITY_MIN_LATENCY = 95;
    private static int sNextRequestId;
    private final CaptureConfig mCaptureConfig;
    private final CaptureNode mCaptureNode;
    private final CaptureNode.AbstractC0960In mPipelineIn;
    private final ProcessingNode mProcessingNode;
    private final ImageCaptureConfig mUseCaseConfig;

    @MainThread
    @VisibleForTesting
    public ImagePipeline(ImageCaptureConfig imageCaptureConfig, Size size, CameraCharacteristics cameraCharacteristics) {
        this(imageCaptureConfig, size, cameraCharacteristics, null, false, null);
    }

    @MainThread
    public ImagePipeline(ImageCaptureConfig imageCaptureConfig, Size size, CameraCharacteristics cameraCharacteristics, CameraEffect cameraEffect, boolean z11) {
        this(imageCaptureConfig, size, cameraCharacteristics, cameraEffect, z11, null);
    }

    private CameraRequest createCameraRequest(int i11, CaptureBundle captureBundle, TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        for (CaptureStage captureStage : captureStages) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mCaptureConfig.getTemplateType());
            builder.addImplementationOptions(this.mCaptureConfig.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(takePictureRequest.getSessionConfigCameraCaptureCallbacks());
            builder.addSurface(this.mPipelineIn.getSurface());
            if (this.mPipelineIn.getOutputFormats().size() > 1 && this.mPipelineIn.getSecondarySurface() != null) {
                builder.addSurface(this.mPipelineIn.getSecondarySurface());
            }
            boolean zShouldEnablePostview = shouldEnablePostview();
            if (zShouldEnablePostview) {
                DeferrableSurface postviewSurface = this.mPipelineIn.getPostviewSurface();
                Objects.requireNonNull(postviewSurface);
                builder.addSurface(postviewSurface);
            }
            builder.setPostviewEnabled(zShouldEnablePostview);
            if (ImageUtil.isJpegFormats(this.mPipelineIn.getInputFormat()) || ImageUtil.isRawFormats(this.mPipelineIn.getInputFormat())) {
                if (EXIF_ROTATION_AVAILABILITY.isRotationOptionSupported()) {
                    builder.addImplementationOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(takePictureRequest.getRotationDegrees()));
                }
                builder.addImplementationOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(getCameraRequestJpegQuality(takePictureRequest)));
            }
            builder.addImplementationOptions(captureStage.getCaptureConfig().getImplementationOptions());
            builder.addTag(strValueOf, Integer.valueOf(captureStage.getId()));
            builder.setId(i11);
            builder.addCameraCaptureCallback(this.mPipelineIn.getCameraCaptureCallback());
            if (this.mPipelineIn.getOutputFormats().size() > 1 && this.mPipelineIn.getSecondaryCameraCaptureCallback() != null) {
                builder.addCameraCaptureCallback(this.mPipelineIn.getSecondaryCameraCaptureCallback());
            }
            arrayList.add(builder.build());
        }
        return new CameraRequest(arrayList, takePictureCallback);
    }

    private CaptureBundle createCaptureBundle() {
        CaptureBundle captureBundle = this.mUseCaseConfig.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
        Objects.requireNonNull(captureBundle);
        return captureBundle;
    }

    private ProcessingRequest createProcessingRequest(int i11, CaptureBundle captureBundle, TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback, ListenableFuture<Void> listenableFuture) {
        return new ProcessingRequest(captureBundle, takePictureRequest, takePictureCallback, listenableFuture, i11);
    }

    private int getOutputFormat() {
        Integer num = (Integer) this.mUseCaseConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.mUseCaseConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT, null);
        if (num2 == null || num2.intValue() != 4101) {
            return (num2 == null || num2.intValue() != 32) ? 256 : 32;
        }
        return JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY;
    }

    private boolean shouldEnablePostview() {
        return this.mPipelineIn.getPostviewSurface() != null;
    }

    public SessionConfig.Builder createSessionConfigBuilder(Size size) {
        SessionConfig.Builder builderCreateFrom = SessionConfig.Builder.createFrom(this.mUseCaseConfig, size);
        builderCreateFrom.addNonRepeatingSurface(this.mPipelineIn.getSurface());
        if (this.mPipelineIn.getOutputFormats().size() > 1 && this.mPipelineIn.getSecondarySurface() != null) {
            builderCreateFrom.addNonRepeatingSurface(this.mPipelineIn.getSecondarySurface());
        }
        if (this.mPipelineIn.getPostviewSurface() != null) {
            builderCreateFrom.setPostviewSurface(this.mPipelineIn.getPostviewSurface());
        }
        return builderCreateFrom;
    }

    @VisibleForTesting
    public boolean expectsMetadata() {
        return this.mCaptureNode.getSafeCloseImageReaderProxy().getImageReaderProxy() instanceof MetadataImageReader;
    }

    @VisibleForTesting
    public CaptureNode getCaptureNode() {
        return this.mCaptureNode;
    }

    @VisibleForTesting
    public PostviewSettings getPostviewSettings() {
        return this.mPipelineIn.getPostviewSettings();
    }

    @VisibleForTesting
    public ProcessingNode getProcessingNode() {
        return this.mProcessingNode;
    }

    @MainThread
    public ImagePipeline(ImageCaptureConfig imageCaptureConfig, Size size, CameraCharacteristics cameraCharacteristics, CameraEffect cameraEffect, boolean z11, PostviewSettings postviewSettings) {
        Threads.checkMainThread();
        this.mUseCaseConfig = imageCaptureConfig;
        this.mCaptureConfig = CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        CaptureNode captureNode = new CaptureNode();
        this.mCaptureNode = captureNode;
        Executor ioExecutor = imageCaptureConfig.getIoExecutor(CameraXExecutors.ioExecutor());
        Objects.requireNonNull(ioExecutor);
        ProcessingNode processingNode = new ProcessingNode(ioExecutor, cameraCharacteristics, cameraEffect != null ? new InternalImageProcessor(cameraEffect) : null);
        this.mProcessingNode = processingNode;
        ArrayList arrayList = new ArrayList();
        if (imageCaptureConfig.getSecondaryInputFormat() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            arrayList.add(Integer.valueOf(getOutputFormat()));
        }
        CaptureNode.AbstractC0960In abstractC0960InM1908of = CaptureNode.AbstractC0960In.m1908of(size, imageCaptureConfig.getInputFormat(), arrayList, z11, imageCaptureConfig.getImageReaderProxyProvider(), postviewSettings);
        this.mPipelineIn = abstractC0960InM1908of;
        processingNode.transform(captureNode.transform(abstractC0960InM1908of));
    }

    @MainThread
    public void close() {
        Threads.checkMainThread();
        this.mCaptureNode.release();
        this.mProcessingNode.release();
    }

    @MainThread
    public Pair<CameraRequest, ProcessingRequest> createRequests(TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback, ListenableFuture<Void> listenableFuture) {
        Threads.checkMainThread();
        CaptureBundle captureBundleCreateCaptureBundle = createCaptureBundle();
        int i11 = sNextRequestId;
        sNextRequestId = i11 + 1;
        return new Pair<>(createCameraRequest(i11, captureBundleCreateCaptureBundle, takePictureRequest, takePictureCallback), createProcessingRequest(i11, captureBundleCreateCaptureBundle, takePictureRequest, takePictureCallback, listenableFuture));
    }

    public int getCameraRequestJpegQuality(TakePictureRequest takePictureRequest) {
        boolean z11;
        if (takePictureRequest.getOnDiskCallback() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zHasCropping = TransformUtils.hasCropping(takePictureRequest.getCropRect(), this.mPipelineIn.getSize());
        if (z11 && zHasCropping) {
            if (takePictureRequest.getCaptureMode() == 0) {
                return 100;
            }
            return 95;
        }
        return takePictureRequest.getJpegQuality();
    }

    @MainThread
    public int getCapacity() {
        Threads.checkMainThread();
        return this.mCaptureNode.getCapacity();
    }

    @MainThread
    public void notifyCaptureError(TakePictureManager.CaptureError captureError) {
        Threads.checkMainThread();
        this.mPipelineIn.getErrorEdge().accept(captureError);
    }

    @MainThread
    public void setOnImageCloseListener(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        this.mCaptureNode.setOnImageCloseListener(onImageCloseListener);
    }

    @MainThread
    public void submitProcessingRequest(ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        this.mPipelineIn.getRequestEdge().accept(processingRequest);
    }
}
