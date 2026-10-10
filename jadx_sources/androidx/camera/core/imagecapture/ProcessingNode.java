package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public class ProcessingNode implements Node<AbstractC0964In, Void> {
    private static final String TAG = "ProcessingNode";
    private Operation<Bitmap2JpegBytes.AbstractC0957In, Packet<byte[]>> mBitmap2JpegBytes;
    private Operation<Packet<Bitmap>, Packet<Bitmap>> mBitmapEffect;
    final Executor mBlockingExecutor;
    private final CameraCharacteristics mCameraCharacteristics;

    @VisibleForTesting
    DngImage2Disk mDngImage2Disk;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private Operation<Packet<ImageProxy>, Bitmap> mImage2Bitmap;
    private Operation<Image2JpegBytes.AbstractC0962In, Packet<byte[]>> mImage2JpegBytes;
    final InternalImageProcessor mImageProcessor;
    private Operation<InputPacket, Packet<ImageProxy>> mInput2Packet;
    private AbstractC0964In mInputEdge;
    private Operation<Packet<byte[]>, Packet<Bitmap>> mJpegBytes2CroppedBitmap;
    private Operation<JpegBytes2Disk.AbstractC0963In, ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private Operation<Packet<byte[]>, Packet<ImageProxy>> mJpegBytes2Image;
    private Operation<Packet<ImageProxy>, ImageProxy> mJpegImage2Result;
    private final Quirks mQuirks;

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.ProcessingNode$In */
    @AutoValue
    public static abstract class AbstractC0964In {
        public abstract Edge<InputPacket> getEdge();

        public abstract int getInputFormat();

        public abstract List<Integer> getOutputFormats();

        public abstract Edge<InputPacket> getPostviewEdge();

        /* JADX INFO: renamed from: of */
        public static AbstractC0964In m1921of(int i11, List<Integer> list) {
            return new AutoValue_ProcessingNode_In(new Edge(), new Edge(), i11, list);
        }
    }

    @AutoValue
    public static abstract class InputPacket {
        public abstract ImageProxy getImageProxy();

        public abstract ProcessingRequest getProcessingRequest();

        /* JADX INFO: renamed from: of */
        public static InputPacket m1922of(ProcessingRequest processingRequest, ImageProxy imageProxy) {
            return new AutoValue_ProcessingNode_InputPacket(processingRequest, imageProxy);
        }
    }

    @VisibleForTesting
    public ProcessingNode(Executor executor, CameraCharacteristics cameraCharacteristics) {
        this(executor, cameraCharacteristics, null, DeviceQuirks.getAll());
    }

    private ImageCapture.OutputFileResults saveJpegToDisk(Packet<ImageProxy> packet, ImageCapture.OutputFileOptions outputFileOptions, int i11) throws ImageCaptureException {
        Packet<byte[]> packetApply = this.mImage2JpegBytes.apply(Image2JpegBytes.AbstractC0962In.m1910of(packet, i11));
        if (packetApply.hasCropping() || this.mBitmapEffect != null) {
            packetApply = cropAndMaybeApplyEffect(packetApply, i11);
        }
        Operation<JpegBytes2Disk.AbstractC0963In, ImageCapture.OutputFileResults> operation = this.mJpegBytes2Disk;
        Objects.requireNonNull(outputFileOptions);
        return operation.apply(JpegBytes2Disk.AbstractC0963In.m1911of(packetApply, outputFileOptions));
    }

    private ImageCapture.OutputFileResults saveRawToDisk(Packet<ImageProxy> packet, ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        if (this.mDngImage2Disk == null) {
            if (this.mCameraCharacteristics == null) {
                throw new ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (packet.getCameraCaptureResult().getCaptureResult() == null) {
                throw new ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CameraCharacteristics cameraCharacteristics = this.mCameraCharacteristics;
            Objects.requireNonNull(cameraCharacteristics);
            CaptureResult captureResult = packet.getCameraCaptureResult().getCaptureResult();
            Objects.requireNonNull(captureResult);
            this.mDngImage2Disk = new DngImage2Disk(cameraCharacteristics, captureResult);
        }
        DngImage2Disk dngImage2Disk = this.mDngImage2Disk;
        ImageProxy data = packet.getData();
        int rotationDegrees = packet.getRotationDegrees();
        Objects.requireNonNull(outputFileOptions);
        return dngImage2Disk.apply(DngImage2Disk.AbstractC0961In.m1909of(data, rotationDegrees, outputFileOptions));
    }

    @VisibleForTesting
    public void injectProcessingInput2Packet(Operation<InputPacket, Packet<ImageProxy>> operation) {
        this.mInput2Packet = operation;
    }

    @WorkerThread
    public ImageCapture.OutputFileResults processOnDiskCapture(InputPacket inputPacket) throws ImageCaptureException {
        List<Integer> outputFormats = this.mInputEdge.getOutputFormats();
        Preconditions.checkArgument(!outputFormats.isEmpty());
        boolean z11 = false;
        Integer num = outputFormats.get(0);
        int iIntValue = num.intValue();
        Preconditions.checkArgument(ImageUtil.isJpegFormats(iIntValue) || ImageUtil.isRawFormats(iIntValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Preconditions.checkArgument(processingRequest.getOutputFileOptions() != null, "OutputFileOptions cannot be empty");
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        if (outputFormats.size() <= 1) {
            if (iIntValue != 32) {
                ImageCapture.OutputFileOptions outputFileOptions = processingRequest.getOutputFileOptions();
                Objects.requireNonNull(outputFileOptions);
                return saveJpegToDisk(packetApply, outputFileOptions, processingRequest.getJpegQuality());
            }
            ImageCapture.OutputFileOptions outputFileOptions2 = processingRequest.getOutputFileOptions();
            Objects.requireNonNull(outputFileOptions2);
            return saveRawToDisk(packetApply, outputFileOptions2);
        }
        if (processingRequest.getOutputFileOptions() != null && processingRequest.getSecondaryOutputFileOptions() != null) {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (packetApply.getFormat() != 32) {
            ImageCapture.OutputFileOptions secondaryOutputFileOptions = processingRequest.getSecondaryOutputFileOptions();
            Objects.requireNonNull(secondaryOutputFileOptions);
            ImageCapture.OutputFileResults outputFileResultsSaveJpegToDisk = saveJpegToDisk(packetApply, secondaryOutputFileOptions, processingRequest.getJpegQuality());
            processingRequest.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(256, true);
            return outputFileResultsSaveJpegToDisk;
        }
        ImageCapture.OutputFileOptions outputFileOptions3 = processingRequest.getOutputFileOptions();
        Objects.requireNonNull(outputFileOptions3);
        ImageCapture.OutputFileResults outputFileResultsSaveRawToDisk = saveRawToDisk(packetApply, outputFileOptions3);
        processingRequest.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(32, true);
        return outputFileResultsSaveRawToDisk;
    }

    @Override // androidx.camera.core.processing.Node
    public Void transform(AbstractC0964In abstractC0964In) {
        this.mInputEdge = abstractC0964In;
        abstractC0964In.getEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.m
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ProcessingNode.m1914b(this.f1630b, (ProcessingNode.InputPacket) obj);
            }
        });
        abstractC0964In.getPostviewEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.n
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ProcessingNode.m1916d(this.f1631b, (ProcessingNode.InputPacket) obj);
            }
        });
        this.mInput2Packet = new ProcessingInput2Packet();
        this.mImage2JpegBytes = new Image2JpegBytes(this.mQuirks);
        this.mJpegBytes2CroppedBitmap = new JpegBytes2CroppedBitmap();
        this.mBitmap2JpegBytes = new Bitmap2JpegBytes();
        this.mJpegBytes2Disk = new JpegBytes2Disk();
        this.mJpegImage2Result = new JpegImage2Result();
        this.mImage2Bitmap = new Image2Bitmap();
        if (abstractC0964In.getInputFormat() == 35 || this.mImageProcessor != null || this.mHasIncorrectJpegMetadataQuirk) {
            this.mJpegBytes2Image = new JpegBytes2Image();
        }
        InternalImageProcessor internalImageProcessor = this.mImageProcessor;
        if (internalImageProcessor == null) {
            return null;
        }
        this.mBitmapEffect = new BitmapEffect(internalImageProcessor);
        return null;
    }

    @VisibleForTesting
    public ProcessingNode(Executor executor, Quirks quirks, CameraCharacteristics cameraCharacteristics) {
        this(executor, cameraCharacteristics, null, quirks);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1914b(final ProcessingNode processingNode, final InputPacket inputPacket) {
        processingNode.getClass();
        if (inputPacket.getProcessingRequest().isAborted()) {
            inputPacket.getImageProxy().close();
        } else {
            processingNode.mBlockingExecutor.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1640b.processInputPacket(inputPacket);
                }
            });
        }
    }

    private Packet<byte[]> cropAndMaybeApplyEffect(Packet<byte[]> packet, int i11) throws ImageCaptureException {
        Preconditions.checkState(ImageUtil.isJpegFormats(packet.getFormat()));
        Packet<Bitmap> packetApply = this.mJpegBytes2CroppedBitmap.apply(packet);
        Operation<Packet<Bitmap>, Packet<Bitmap>> operation = this.mBitmapEffect;
        if (operation != null) {
            packetApply = operation.apply(packetApply);
        }
        return this.mBitmap2JpegBytes.apply(Bitmap2JpegBytes.AbstractC0957In.m1898of(packetApply, i11));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1916d(final ProcessingNode processingNode, final InputPacket inputPacket) {
        processingNode.getClass();
        if (inputPacket.getProcessingRequest().isAborted()) {
            Logger.m1872w(TAG, "The postview image is closed due to request aborted");
            inputPacket.getImageProxy().close();
        } else {
            processingNode.mBlockingExecutor.execute(new Runnable() { // from class: androidx.camera.core.imagecapture.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1628b.processPostviewInputPacket(inputPacket);
                }
            });
        }
    }

    private void sendError(final ProcessingRequest processingRequest, final ImageCaptureException imageCaptureException) {
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.o
            @Override // java.lang.Runnable
            public final void run() {
                processingRequest.onProcessFailure(imageCaptureException);
            }
        });
    }

    @WorkerThread
    public ImageProxy processInMemoryCapture(InputPacket inputPacket) throws ImageCaptureException {
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        List<Integer> outputFormats = this.mInputEdge.getOutputFormats();
        Preconditions.checkArgument(!outputFormats.isEmpty());
        int iIntValue = outputFormats.get(0).intValue();
        if ((packetApply.getFormat() == 35 || this.mBitmapEffect != null || this.mHasIncorrectJpegMetadataQuirk) && iIntValue == 256) {
            Packet<byte[]> packetApply2 = this.mImage2JpegBytes.apply(Image2JpegBytes.AbstractC0962In.m1910of(packetApply, processingRequest.getJpegQuality()));
            if (this.mBitmapEffect != null) {
                packetApply2 = cropAndMaybeApplyEffect(packetApply2, processingRequest.getJpegQuality());
            }
            packetApply = this.mJpegBytes2Image.apply(packetApply2);
        }
        ImageProxy imageProxyApply = this.mJpegImage2Result.apply(packetApply);
        if (outputFormats.size() > 1) {
            processingRequest.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(imageProxyApply.getFormat(), true);
        }
        return imageProxyApply;
    }

    @WorkerThread
    public void processInputPacket(InputPacket inputPacket) {
        final ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            boolean z11 = true;
            if (this.mInputEdge.getOutputFormats().size() <= 1) {
                z11 = false;
            }
            if (inputPacket.getProcessingRequest().isInMemoryCapture()) {
                final ImageProxy imageProxyProcessInMemoryCapture = processInMemoryCapture(inputPacket);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        processingRequest.onFinalResult(imageProxyProcessInMemoryCapture);
                    }
                });
                return;
            }
            final ImageCapture.OutputFileResults outputFileResultsProcessOnDiskCapture = processOnDiskCapture(inputPacket);
            if (z11 && !processingRequest.getTakePictureRequest().isFormatProcessedInSimultaneousCapture()) {
                return;
            }
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.q
                @Override // java.lang.Runnable
                public final void run() {
                    processingRequest.onFinalResult(outputFileResultsProcessOnDiskCapture);
                }
            });
        } catch (ImageCaptureException e11) {
            sendError(processingRequest, e11);
        } catch (OutOfMemoryError e12) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed due to low memory.", e12));
        } catch (RuntimeException e13) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed.", e13));
        }
    }

    @WorkerThread
    public void processPostviewInputPacket(InputPacket inputPacket) {
        boolean z11;
        final ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
            int format = packetApply.getFormat();
            if (format != 35 && format != 256 && format != 4101) {
                z11 = false;
            } else {
                z11 = true;
            }
            Preconditions.checkArgument(z11, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(format)));
            final Bitmap bitmapApply = this.mImage2Bitmap.apply(packetApply);
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.r
                @Override // java.lang.Runnable
                public final void run() {
                    processingRequest.onPostviewBitmapAvailable(bitmapApply);
                }
            });
        } catch (Exception e11) {
            inputPacket.getImageProxy().close();
            Logger.m1869e(TAG, "process postview input packet failed.", e11);
        }
    }

    public ProcessingNode(Executor executor, CameraCharacteristics cameraCharacteristics, InternalImageProcessor internalImageProcessor) {
        this(executor, cameraCharacteristics, internalImageProcessor, DeviceQuirks.getAll());
    }

    public ProcessingNode(Executor executor, CameraCharacteristics cameraCharacteristics, InternalImageProcessor internalImageProcessor, Quirks quirks) {
        if (DeviceQuirks.get(LowMemoryQuirk.class) != null) {
            this.mBlockingExecutor = CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.mBlockingExecutor = executor;
        }
        this.mImageProcessor = internalImageProcessor;
        this.mCameraCharacteristics = cameraCharacteristics;
        this.mQuirks = quirks;
        this.mHasIncorrectJpegMetadataQuirk = quirks.contains(IncorrectJpegMetadataQuirk.class);
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }
}
