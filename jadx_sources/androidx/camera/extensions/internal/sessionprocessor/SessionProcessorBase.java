package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OutputSurfaceConfiguration;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.CameraExtensionsControl;
import androidx.camera.extensions.CameraExtensionsInfo;
import androidx.camera.extensions.internal.ExtensionsUtils;
import androidx.camera.extensions.internal.RequestOptionConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
abstract class SessionProcessorBase implements SessionProcessor, CameraExtensionsInfo, CameraExtensionsControl {
    protected static final int EXTENSION_STRENGTH_UNKNOWN = -1;
    private static final String TAG = "SessionProcessorBase";
    private String mCameraId;
    private HandlerThread mImageReaderHandlerThread;
    private final int mMode;
    private final Set<Integer> mSupportedCameraOperations;

    @GuardedBy("mLock")
    private final Map<Integer, ImageReader> mImageReaderMap = new HashMap();

    @GuardedBy("mLock")
    private final Map<Integer, Camera2OutputConfig> mOutputConfigMap = new HashMap();

    @GuardedBy("mLock")
    private final List<DeferrableSurface> mSurfacesList = new ArrayList();
    protected final Object mLock = new Object();

    @GuardedBy("mLock")
    protected int mExtensionStrength = -1;

    public static class ImageRefHolder implements ImageReference {
        private final Image mImage;
        private final Object mImageLock = new Object();
        private int mRefCount = 1;

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean decrement() {
            synchronized (this.mImageLock) {
                try {
                    int i11 = this.mRefCount;
                    if (i11 <= 0) {
                        return false;
                    }
                    int i12 = i11 - 1;
                    this.mRefCount = i12;
                    if (i12 <= 0) {
                        this.mImage.close();
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public Image get() {
            return this.mImage;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean increment() {
            synchronized (this.mImageLock) {
                try {
                    int i11 = this.mRefCount;
                    if (i11 <= 0) {
                        return false;
                    }
                    this.mRefCount = i11 + 1;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public ImageRefHolder(Image image) {
            this.mImage = image;
        }
    }

    public abstract void deInitSessionInternal();

    @Override // androidx.camera.core.impl.SessionProcessor
    public Pair<Integer, Integer> getImplementationType() {
        return Pair.create(0, Integer.valueOf(this.mMode));
    }

    public abstract Camera2SessionConfig initSessionInternal(String str, Map<String, CameraCharacteristics> map, OutputSurfaceConfiguration outputSurfaceConfiguration);

    private static SessionProcessorSurface createOutputConfigSurface(Camera2OutputConfig camera2OutputConfig, Map<Integer, ImageReader> map) {
        if (camera2OutputConfig instanceof SurfaceOutputConfig) {
            return new SessionProcessorSurface(((SurfaceOutputConfig) camera2OutputConfig).getSurface(), camera2OutputConfig.getId());
        }
        if (camera2OutputConfig instanceof ImageReaderOutputConfig) {
            ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) camera2OutputConfig;
            final ImageReader imageReaderNewInstance = ImageReader.newInstance(imageReaderOutputConfig.getSize().getWidth(), imageReaderOutputConfig.getSize().getHeight(), imageReaderOutputConfig.getImageFormat(), imageReaderOutputConfig.getMaxImages());
            map.put(Integer.valueOf(camera2OutputConfig.getId()), imageReaderNewInstance);
            SessionProcessorSurface sessionProcessorSurface = new SessionProcessorSurface(imageReaderNewInstance.getSurface(), camera2OutputConfig.getId());
            sessionProcessorSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.e
                @Override // java.lang.Runnable
                public final void run() {
                    imageReaderNewInstance.close();
                }
            }, CameraXExecutors.directExecutor());
            return sessionProcessorSurface;
        }
        if (camera2OutputConfig instanceof MultiResolutionImageReaderOutputConfig) {
            throw new UnsupportedOperationException("MultiResolutionImageReader not supported yet");
        }
        throw new UnsupportedOperationException("Unsupported Camera2OutputConfig:" + camera2OutputConfig);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final void deInitSession() {
        Logger.m1868e(TAG, "deInitSession: cameraId=" + this.mCameraId);
        deInitSessionInternal();
        synchronized (this.mLock) {
            try {
                Iterator<DeferrableSurface> it = this.mSurfacesList.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.mSurfacesList.clear();
                this.mImageReaderMap.clear();
                this.mOutputConfigMap.clear();
                this.mExtensionStrength = -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HandlerThread handlerThread = this.mImageReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mImageReaderHandlerThread = null;
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public Set<Integer> getSupportedCameraOperations() {
        return this.mSupportedCameraOperations;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final SessionConfig initSession(CameraInfo cameraInfo, OutputSurfaceConfiguration outputSurfaceConfiguration) {
        CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
        Map<String, CameraCharacteristics> cameraCharacteristicsMap = ExtensionsUtils.getCameraCharacteristicsMap(cameraInfoInternal);
        String cameraId = cameraInfoInternal.getCameraId();
        Objects.requireNonNull(outputSurfaceConfiguration);
        Camera2SessionConfig camera2SessionConfigInitSessionInternal = initSessionInternal(cameraId, cameraCharacteristicsMap, outputSurfaceConfiguration);
        SessionConfig.Builder builder = new SessionConfig.Builder();
        synchronized (this.mLock) {
            try {
                for (Camera2OutputConfig camera2OutputConfig : camera2SessionConfigInitSessionInternal.getOutputConfigs()) {
                    SessionProcessorSurface sessionProcessorSurfaceCreateOutputConfigSurface = createOutputConfigSurface(camera2OutputConfig, this.mImageReaderMap);
                    this.mSurfacesList.add(sessionProcessorSurfaceCreateOutputConfigSurface);
                    this.mOutputConfigMap.put(Integer.valueOf(camera2OutputConfig.getId()), camera2OutputConfig);
                    SessionConfig.OutputConfig.Builder surfaceGroupId = SessionConfig.OutputConfig.builder(sessionProcessorSurfaceCreateOutputConfigSurface).setPhysicalCameraId(camera2OutputConfig.getPhysicalCameraId()).setSurfaceGroupId(camera2OutputConfig.getSurfaceGroupId());
                    List<Camera2OutputConfig> surfaceSharingOutputConfigs = camera2OutputConfig.getSurfaceSharingOutputConfigs();
                    if (surfaceSharingOutputConfigs != null && !surfaceSharingOutputConfigs.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Camera2OutputConfig camera2OutputConfig2 : surfaceSharingOutputConfigs) {
                            this.mOutputConfigMap.put(Integer.valueOf(camera2OutputConfig2.getId()), camera2OutputConfig2);
                            arrayList.add(createOutputConfigSurface(camera2OutputConfig2, this.mImageReaderMap));
                        }
                        surfaceGroupId.setSharedSurfaces(arrayList);
                    }
                    builder.addOutputConfig(surfaceGroupId.build());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RequestOptionConfig.Builder builder2 = new RequestOptionConfig.Builder();
        for (CaptureRequest.Key<?> key : camera2SessionConfigInitSessionInternal.getSessionParameters().keySet()) {
            builder2.setCaptureRequestOption(key, camera2SessionConfigInitSessionInternal.getSessionParameters().get(key));
        }
        builder.setImplementationOptions(builder2.build());
        builder.setTemplateType(camera2SessionConfigInitSessionInternal.getSessionTemplateId());
        builder.setSessionType(camera2SessionConfigInitSessionInternal.getSessionType());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.mImageReaderHandlerThread = handlerThread;
        handlerThread.start();
        this.mCameraId = cameraInfoInternal.getCameraId();
        Logger.m1866d(TAG, "initSession: cameraId=" + this.mCameraId);
        return builder.build();
    }

    public void setImageProcessor(final int i11, final ImageProcessor imageProcessor) {
        ImageReader imageReader;
        final String physicalCameraId;
        synchronized (this.mLock) {
            imageReader = this.mImageReaderMap.get(Integer.valueOf(i11));
            Camera2OutputConfig camera2OutputConfig = this.mOutputConfigMap.get(Integer.valueOf(i11));
            physicalCameraId = camera2OutputConfig == null ? null : camera2OutputConfig.getPhysicalCameraId();
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.d
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    SessionProcessorBase.m2090a(imageProcessor, i11, physicalCameraId, imageReader2);
                }
            }, new Handler(this.mImageReaderHandlerThread.getLooper()));
        }
    }

    public SessionProcessorBase(List<CaptureRequest.Key<?>> list, int i11) {
        this.mSupportedCameraOperations = ExtensionsUtils.getSupportedCameraOperations(list);
        this.mMode = i11;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2090a(ImageProcessor imageProcessor, int i11, String str, ImageReader imageReader) {
        try {
            Image imageAcquireNextImage = imageReader.acquireNextImage();
            imageProcessor.onNextImageAvailable(i11, imageAcquireNextImage.getTimestamp(), new ImageRefHolder(imageAcquireNextImage), str);
        } catch (IllegalStateException e11) {
            Logger.m1869e(TAG, "Failed to acquire next image.", e11);
        }
    }
}
