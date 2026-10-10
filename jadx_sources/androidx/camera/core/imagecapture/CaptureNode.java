package androidx.camera.core.imagecapture;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
class CaptureNode implements Node<AbstractC0960In, ProcessingNode.AbstractC0964In> {

    @VisibleForTesting
    static final int MAX_IMAGES = 4;
    private static final String TAG = "CaptureNode";
    private AbstractC0960In mInputEdge;
    private ProcessingNode.AbstractC0964In mOutputEdge;
    SafeCloseImageReaderProxy mSafeCloseImageReaderForPostview;
    SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;
    SafeCloseImageReaderProxy mSecondarySafeCloseImageReaderProxy;
    ProcessingRequest mCurrentRequest = null;
    private NoMetadataImageReader mNoMetadataImageReader = null;

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.CaptureNode$1 */
    public class C09581 extends CameraCaptureCallback {
        public C09581() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m1905a(C09581 c09581) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureStarted();
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m1906b(C09581 c09581, int i11) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureProcessProgressed(i11);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i11, final int i12) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.i
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.C09581.m1906b(this.f1623b, i12);
                }
            });
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i11) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.j
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.C09581.m1905a(this.f1625b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.CaptureNode$In */
    @AutoValue
    public static abstract class AbstractC0960In {
        private CameraCaptureCallback mCameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };
        private DeferrableSurface mPostviewSurface = null;
        private CameraCaptureCallback mSecondaryCameraCaptureCallback;
        private DeferrableSurface mSecondarySurface;
        private DeferrableSurface mSurface;

        /* JADX INFO: renamed from: of */
        public static AbstractC0960In m1907of(Size size, int i11, List<Integer> list, boolean z11, ImageReaderProxyProvider imageReaderProxyProvider) {
            return new AutoValue_CaptureNode_In(size, i11, list, z11, imageReaderProxyProvider, null, new Edge(), new Edge());
        }

        public abstract Edge<TakePictureManager.CaptureError> getErrorEdge();

        public abstract ImageReaderProxyProvider getImageReaderProxyProvider();

        public abstract int getInputFormat();

        public abstract List<Integer> getOutputFormats();

        public abstract PostviewSettings getPostviewSettings();

        public abstract Edge<ProcessingRequest> getRequestEdge();

        public abstract Size getSize();

        public abstract boolean isVirtualCamera();

        /* JADX INFO: renamed from: of */
        public static AbstractC0960In m1908of(Size size, int i11, List<Integer> list, boolean z11, ImageReaderProxyProvider imageReaderProxyProvider, PostviewSettings postviewSettings) {
            return new AutoValue_CaptureNode_In(size, i11, list, z11, imageReaderProxyProvider, postviewSettings, new Edge(), new Edge());
        }

        public CameraCaptureCallback getCameraCaptureCallback() {
            return this.mCameraCaptureCallback;
        }

        public DeferrableSurface getPostviewSurface() {
            return this.mPostviewSurface;
        }

        public CameraCaptureCallback getSecondaryCameraCaptureCallback() {
            return this.mSecondaryCameraCaptureCallback;
        }

        public DeferrableSurface getSecondarySurface() {
            return this.mSecondarySurface;
        }

        public DeferrableSurface getSurface() {
            DeferrableSurface deferrableSurface = this.mSurface;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        public void setCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setPostviewSurface(Surface surface, Size size, int i11) {
            this.mPostviewSurface = new ImmediateSurface(surface, size, i11);
        }

        public void setSecondaryCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mSecondaryCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setSecondarySurface(Surface surface) {
            Preconditions.checkState(this.mSecondarySurface == null, "The secondary surface is already set.");
            this.mSecondarySurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }

        public void setSurface(Surface surface) {
            Preconditions.checkState(this.mSurface == null, "The surface is already set.");
            this.mSurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }
    }

    private static ImageReaderProxy createImageReaderProxy(ImageReaderProxyProvider imageReaderProxyProvider, int i11, int i12, int i13) {
        return imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(i11, i12, i13, 4, 0L) : ImageReaderProxys.createIsolatedReader(i11, i12, i13, 4);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1902d(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1904f(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    private void propagatePostviewImage(ImageProxy imageProxy) {
        if (this.mCurrentRequest == null) {
            Logger.m1872w(TAG, "Postview image is closed due to request completed or aborted");
            imageProxy.close();
        } else {
            ProcessingNode.AbstractC0964In abstractC0964In = this.mOutputEdge;
            Objects.requireNonNull(abstractC0964In);
            abstractC0964In.getPostviewEdge().accept(ProcessingNode.InputPacket.m1922of(this.mCurrentRequest, imageProxy));
        }
    }

    private void setOnImageAvailableListener(ImageReaderProxy imageReaderProxy) {
        imageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.e
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy2) {
                CaptureNode.m1899a(this.f1619a, imageReaderProxy2);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    @VisibleForTesting
    public AbstractC0960In getInputEdge() {
        AbstractC0960In abstractC0960In = this.mInputEdge;
        Objects.requireNonNull(abstractC0960In);
        return abstractC0960In;
    }

    @VisibleForTesting
    public SafeCloseImageReaderProxy getSafeCloseImageReaderProxy() {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        return safeCloseImageReaderProxy;
    }

    @Override // androidx.camera.core.processing.Node
    public ProcessingNode.AbstractC0964In transform(AbstractC0960In abstractC0960In) {
        ImageReaderProxy imageReaderProxy;
        Consumer<ProcessingRequest> consumer;
        MetadataImageReader metadataImageReader;
        ImageReaderProxy imageReaderProxy2;
        Preconditions.checkState(this.mInputEdge == null && this.mSafeCloseImageReaderProxy == null, "CaptureNode does not support recreation yet.");
        this.mInputEdge = abstractC0960In;
        Size size = abstractC0960In.getSize();
        int inputFormat = abstractC0960In.getInputFormat();
        boolean zIsVirtualCamera = abstractC0960In.isVirtualCamera();
        CameraCaptureCallback c09581 = new C09581();
        boolean z11 = abstractC0960In.getOutputFormats().size() > 1;
        CameraCaptureCallback cameraCaptureCallbackCreateComboCallback = null;
        if (zIsVirtualCamera || abstractC0960In.getImageReaderProxyProvider() != null) {
            NoMetadataImageReader noMetadataImageReader = new NoMetadataImageReader(createImageReaderProxy(abstractC0960In.getImageReaderProxyProvider(), size.getWidth(), size.getHeight(), inputFormat));
            this.mNoMetadataImageReader = noMetadataImageReader;
            imageReaderProxy = noMetadataImageReader;
            consumer = new Consumer() { // from class: androidx.camera.core.imagecapture.b
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    CaptureNode.m1900b(this.f1612b, (ProcessingRequest) obj);
                }
            };
            metadataImageReader = null;
        } else {
            if (z11) {
                MetadataImageReader metadataImageReader2 = new MetadataImageReader(size.getWidth(), size.getHeight(), 256, 4);
                CameraCaptureCallback cameraCaptureCallbackCreateComboCallback2 = CameraCaptureCallbacks.createComboCallback(c09581, metadataImageReader2.getCameraCaptureCallback());
                metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), 32, 4);
                CameraCaptureCallback[] cameraCaptureCallbackArr = {c09581, metadataImageReader.getCameraCaptureCallback()};
                c09581 = cameraCaptureCallbackCreateComboCallback2;
                cameraCaptureCallbackCreateComboCallback = CameraCaptureCallbacks.createComboCallback(cameraCaptureCallbackArr);
                imageReaderProxy2 = metadataImageReader2;
            } else {
                MetadataImageReader metadataImageReader3 = new MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
                c09581 = CameraCaptureCallbacks.createComboCallback(c09581, metadataImageReader3.getCameraCaptureCallback());
                imageReaderProxy2 = metadataImageReader3;
                metadataImageReader = null;
            }
            consumer = new Consumer() { // from class: androidx.camera.core.imagecapture.a
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f1609b.onRequestAvailable((ProcessingRequest) obj);
                }
            };
            imageReaderProxy = imageReaderProxy2;
        }
        abstractC0960In.setCameraCaptureCallback(c09581);
        if (z11 && cameraCaptureCallbackCreateComboCallback != null) {
            abstractC0960In.setSecondaryCameraCaptureCallback(cameraCaptureCallbackCreateComboCallback);
        }
        Surface surface = imageReaderProxy.getSurface();
        Objects.requireNonNull(surface);
        abstractC0960In.setSurface(surface);
        this.mSafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(imageReaderProxy);
        setOnImageAvailableListener(imageReaderProxy);
        PostviewSettings postviewSettings = abstractC0960In.getPostviewSettings();
        if (postviewSettings != null) {
            ImageReaderProxy imageReaderProxyCreateImageReaderProxy = createImageReaderProxy(abstractC0960In.getImageReaderProxyProvider(), postviewSettings.getResolution().getWidth(), postviewSettings.getResolution().getHeight(), postviewSettings.getInputFormat());
            imageReaderProxyCreateImageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.c
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy3) {
                    CaptureNode.m1903e(this.f1615a, imageReaderProxy3);
                }
            }, CameraXExecutors.mainThreadExecutor());
            this.mSafeCloseImageReaderForPostview = new SafeCloseImageReaderProxy(imageReaderProxyCreateImageReaderProxy);
            abstractC0960In.setPostviewSurface(imageReaderProxyCreateImageReaderProxy.getSurface(), postviewSettings.getResolution(), postviewSettings.getInputFormat());
        }
        if (z11 && metadataImageReader != null) {
            abstractC0960In.setSecondarySurface(metadataImageReader.getSurface());
            this.mSecondarySafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(metadataImageReader);
            setOnImageAvailableListener(metadataImageReader);
        }
        abstractC0960In.getRequestEdge().setListener(consumer);
        abstractC0960In.getErrorEdge().setListener(new Consumer() { // from class: androidx.camera.core.imagecapture.d
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f1618b.sendCaptureError((TakePictureManager.CaptureError) obj);
            }
        });
        ProcessingNode.AbstractC0964In abstractC0964InM1921of = ProcessingNode.AbstractC0964In.m1921of(abstractC0960In.getInputFormat(), abstractC0960In.getOutputFormats());
        this.mOutputEdge = abstractC0964InM1921of;
        return abstractC0964InM1921of;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1899a(CaptureNode captureNode, ImageReaderProxy imageReaderProxy) {
        captureNode.getClass();
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                captureNode.onImageProxyAvailable(imageProxyAcquireLatestImage);
                return;
            }
            ProcessingRequest processingRequest = captureNode.mCurrentRequest;
            if (processingRequest != null) {
                captureNode.sendCaptureError(TakePictureManager.CaptureError.m1925of(processingRequest.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e11) {
            ProcessingRequest processingRequest2 = captureNode.mCurrentRequest;
            if (processingRequest2 != null) {
                captureNode.sendCaptureError(TakePictureManager.CaptureError.m1925of(processingRequest2.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", e11)));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1900b(CaptureNode captureNode, ProcessingRequest processingRequest) {
        captureNode.onRequestAvailable(processingRequest);
        captureNode.mNoMetadataImageReader.acceptProcessingRequest(processingRequest);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1903e(CaptureNode captureNode, ImageReaderProxy imageReaderProxy) {
        captureNode.getClass();
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                captureNode.propagatePostviewImage(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException e11) {
            Logger.m1869e(TAG, "Failed to acquire latest image of postview", e11);
        }
    }

    @MainThread
    private void matchAndPropagateImage(ImageProxy imageProxy) {
        boolean z11;
        ProcessingRequest processingRequest;
        ProcessingRequest processingRequest2;
        Threads.checkMainThread();
        ProcessingNode.AbstractC0964In abstractC0964In = this.mOutputEdge;
        Objects.requireNonNull(abstractC0964In);
        abstractC0964In.getEdge().accept(ProcessingNode.InputPacket.m1922of(this.mCurrentRequest, imageProxy));
        ProcessingRequest processingRequest3 = this.mCurrentRequest;
        AbstractC0960In abstractC0960In = this.mInputEdge;
        if (abstractC0960In != null && abstractC0960In.getOutputFormats().size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (processingRequest2 = this.mCurrentRequest) != null) {
            processingRequest2.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(imageProxy.getFormat(), true);
        }
        if (!z11 || ((processingRequest = this.mCurrentRequest) != null && processingRequest.getTakePictureRequest().isFormatProcessedInSimultaneousCapture())) {
            this.mCurrentRequest = null;
        }
        processingRequest3.onImageCaptured();
    }

    private void releaseInputResources(AbstractC0960In abstractC0960In, final SafeCloseImageReaderProxy safeCloseImageReaderProxy, final SafeCloseImageReaderProxy safeCloseImageReaderProxy2, final SafeCloseImageReaderProxy safeCloseImageReaderProxy3) {
        abstractC0960In.getSurface().close();
        abstractC0960In.getSurface().getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.f
            @Override // java.lang.Runnable
            public final void run() {
                safeCloseImageReaderProxy.safeClose();
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (abstractC0960In.getPostviewSurface() != null) {
            abstractC0960In.getPostviewSurface().close();
            abstractC0960In.getPostviewSurface().getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.g
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.m1904f(safeCloseImageReaderProxy3);
                }
            }, CameraXExecutors.mainThreadExecutor());
        }
        if (abstractC0960In.getOutputFormats().size() > 1 && abstractC0960In.getSecondarySurface() != null) {
            abstractC0960In.getSecondarySurface().close();
            abstractC0960In.getSecondarySurface().getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.h
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureNode.m1902d(safeCloseImageReaderProxy2);
                }
            }, CameraXExecutors.mainThreadExecutor());
        }
    }

    @MainThread
    public int getCapacity() {
        boolean z11;
        Threads.checkMainThread();
        if (this.mSafeCloseImageReaderProxy != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "The ImageReader is not initialized.");
        return this.mSafeCloseImageReaderProxy.getCapacity();
    }

    @MainThread
    @VisibleForTesting
    public void onImageProxyAvailable(ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.mCurrentRequest == null) {
            Logger.m1872w(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        if (((Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mCurrentRequest.getTagBundleKey())) == null) {
            Logger.m1872w(TAG, "Discarding ImageProxy which was acquired for aborted request");
            imageProxy.close();
        } else {
            matchAndPropagateImage(imageProxy);
        }
    }

    @MainThread
    @VisibleForTesting
    public void onRequestAvailable(final ProcessingRequest processingRequest) {
        boolean z11;
        Threads.checkMainThread();
        boolean z12 = false;
        if (processingRequest.getStageIds().size() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "only one capture stage is supported.");
        if (getCapacity() > 0) {
            z12 = true;
        }
        Preconditions.checkState(z12, "Too many acquire images. Close image to be able to process next.");
        this.mCurrentRequest = processingRequest;
        Futures.addCallback(processingRequest.getCaptureFuture(), new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r11) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                Threads.checkMainThread();
                if (processingRequest == CaptureNode.this.mCurrentRequest) {
                    Logger.m1872w(CaptureNode.TAG, "request aborted, id=" + CaptureNode.this.mCurrentRequest.getRequestId());
                    if (CaptureNode.this.mNoMetadataImageReader != null) {
                        CaptureNode.this.mNoMetadataImageReader.clearProcessingRequest();
                    }
                    CaptureNode.this.mCurrentRequest = null;
                }
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    @MainThread
    public void release() {
        Threads.checkMainThread();
        AbstractC0960In abstractC0960In = this.mInputEdge;
        Objects.requireNonNull(abstractC0960In);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        releaseInputResources(abstractC0960In, safeCloseImageReaderProxy, this.mSecondarySafeCloseImageReaderProxy, this.mSafeCloseImageReaderForPostview);
    }

    @MainThread
    public void sendCaptureError(TakePictureManager.CaptureError captureError) {
        Threads.checkMainThread();
        ProcessingRequest processingRequest = this.mCurrentRequest;
        if (processingRequest != null && processingRequest.getRequestId() == captureError.getRequestId()) {
            this.mCurrentRequest.onCaptureFailure(captureError.getImageCaptureException());
        }
    }

    @MainThread
    public void setOnImageCloseListener(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        boolean z11;
        Threads.checkMainThread();
        if (this.mSafeCloseImageReaderProxy != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkState(z11, "The ImageReader is not initialized.");
        this.mSafeCloseImageReaderProxy.setOnImageCloseListener(onImageCloseListener);
    }
}
