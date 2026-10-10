package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes23.dex */
public class FlutterRenderer implements TextureRegistry {
    private static final String TAG = "FlutterRenderer";

    @VisibleForTesting
    public static boolean debugDisableSurfaceClear;

    @VisibleForTesting
    public static boolean debugForceSurfaceProducerGlTextures;

    @NonNull
    private final FlutterJNI flutterJNI;

    @NonNull
    private final FlutterUiDisplayListener flutterUiDisplayListener;

    @Nullable
    private Surface surface;

    @NonNull
    private final AtomicLong nextTextureId = new AtomicLong(0);
    private boolean isDisplayingFlutterUi = false;
    private final Handler handler = new Handler();

    @NonNull
    private final Set<WeakReference<TextureRegistry.OnTrimMemoryListener>> onTrimMemoryListeners = new HashSet();

    @NonNull
    private final List<ImageReaderSurfaceProducer> imageReaderProducers = new ArrayList();

    /* JADX INFO: loaded from: classes60.dex */
    @Keep
    @TargetApi(29)
    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.OnTrimMemoryListener {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_DEQUEUED_IMAGES = 2;
        private static final int MAX_IMAGES = 6;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;

        /* JADX INFO: renamed from: id */
        private final long f86771id;
        private boolean released;
        private boolean ignoringFence = false;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private boolean notifiedDestroy = false;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final Object lock = new Object();
        private final ArrayDeque<PerImageReader> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, PerImageReader> perImageReaders = new HashMap<>();
        private ArrayList<PerImage> lastDequeuedImage = new ArrayList<>();
        private PerImageReader lastReaderDequeuedFrom = null;
        private TextureRegistry.SurfaceProducer.Callback callback = null;

        public class PerImage {
            public final Image image;
            public final long queuedTime;

            public PerImage(Image image, long j11) {
                this.image = image;
                this.queuedTime = j11;
            }
        }

        public class PerImageReader {
            public final ImageReader reader;
            private final ArrayDeque<PerImage> imageQueue = new ArrayDeque<>();
            private boolean closed = false;

            public void close() {
                this.closed = true;
                this.reader.close();
                this.imageQueue.clear();
            }

            public PerImageReader(ImageReader imageReader) {
                this.reader = imageReader;
                imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.j
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader.m87507a(this.f86777b, imageReader2);
                    }
                }, new Handler(Looper.getMainLooper()));
            }

            public boolean canPrune() {
                return this.imageQueue.isEmpty() && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            public PerImage dequeueImage() {
                if (this.imageQueue.isEmpty()) {
                    return null;
                }
                return this.imageQueue.removeFirst();
            }

            public boolean imageQueueIsEmpty() {
                return this.imageQueue.isEmpty();
            }

            public PerImage queueImage(Image image) {
                if (this.closed) {
                    return null;
                }
                PerImage perImage = ImageReaderSurfaceProducer.this.new PerImage(image, System.nanoTime());
                this.imageQueue.add(perImage);
                while (this.imageQueue.size() > 2) {
                    this.imageQueue.removeFirst().image.close();
                }
                return perImage;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m87507a(PerImageReader perImageReader, ImageReader imageReader) {
                Image imageAcquireLatestImage;
                perImageReader.getClass();
                try {
                    imageAcquireLatestImage = imageReader.acquireLatestImage();
                } catch (IllegalStateException e11) {
                    Log.m87477e(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e11);
                    imageAcquireLatestImage = null;
                }
                if (imageAcquireLatestImage != null) {
                    if (!ImageReaderSurfaceProducer.this.released && !perImageReader.closed) {
                        ImageReaderSurfaceProducer.this.onImage(imageReader, imageAcquireLatestImage);
                    } else {
                        imageAcquireLatestImage.close();
                    }
                }
            }
        }

        public double deltaMillis(long j11) {
            return j11 / 1000000.0d;
        }

        @VisibleForTesting
        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getForcedNewSurface() {
            this.createNewReader = true;
            return getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public boolean handlesCropAndRotation() {
            return false;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i11, int i12) {
            int iMax = Math.max(1, i11);
            int iMax2 = Math.max(1, i12);
            if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = iMax2;
            this.requestedWidth = iMax;
        }

        public ImageReaderSurfaceProducer(long j11) {
            this.f86771id = j11;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m87505a(ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
            if (imageReaderSurfaceProducer.released) {
                return;
            }
            FlutterRenderer.this.scheduleEngineFrame();
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (PerImageReader perImageReader : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == perImageReader) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        perImageReader.close();
                    }
                    this.perImageReaders.clear();
                    if (this.lastDequeuedImage.size() > 0) {
                        Iterator<PerImage> it = this.lastDequeuedImage.iterator();
                        while (it.hasNext()) {
                            it.next().image.close();
                        }
                        this.lastDequeuedImage.clear();
                    }
                    PerImageReader perImageReader2 = this.lastReaderDequeuedFrom;
                    if (perImageReader2 != null) {
                        perImageReader2.close();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private ImageReader createImageReader() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                return createImageReader33();
            }
            if (i11 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        @TargetApi(29)
        private ImageReader createImageReader29() {
            return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
        }

        private PerImageReader getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (!this.createNewReader) {
                        return this.imageReaderQueue.peekLast();
                    }
                    this.createNewReader = false;
                    return getOrCreatePerImageReader(createImageReader());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                Log.m87475d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        public PerImage dequeueImage() {
            PerImage perImage;
            boolean z11;
            synchronized (this.lock) {
                try {
                    Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
                    perImage = null;
                    while (true) {
                        z11 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        PerImageReader next = it.next();
                        PerImage perImageDequeueImage = next.dequeueImage();
                        if (perImageDequeueImage != null) {
                            while (this.lastDequeuedImage.size() > 2) {
                                this.lastDequeuedImage.remove(0).image.close();
                            }
                            this.lastDequeuedImage.add(perImageDequeueImage);
                            this.lastReaderDequeuedFrom = next;
                            perImage = perImageDequeueImage;
                            break;
                        }
                        perImage = perImageDequeueImage;
                    }
                    pruneImageReaderQueue();
                    Iterator<PerImageReader> it2 = this.imageReaderQueue.iterator();
                    while (it2.hasNext()) {
                        if (!it2.next().imageQueueIsEmpty()) {
                            z11 = true;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                FlutterRenderer.this.handler.post(new Runnable() { // from class: io.flutter.embedding.engine.renderer.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterRenderer.ImageReaderSurfaceProducer.m87505a(this.f86776b);
                    }
                });
            }
            return perImage;
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f86771id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        public PerImageReader getOrCreatePerImageReader(ImageReader imageReader) {
            PerImageReader perImageReader = this.perImageReaders.get(imageReader);
            if (perImageReader != null) {
                return perImageReader;
            }
            PerImageReader perImageReader2 = new PerImageReader(imageReader);
            this.perImageReaders.put(imageReader, perImageReader2);
            this.imageReaderQueue.add(perImageReader2);
            return perImageReader2;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        /* JADX INFO: renamed from: id */
        public long mo87506id() {
            return this.f86771id;
        }

        @VisibleForTesting
        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        @VisibleForTesting
        public int numImages() {
            int size;
            synchronized (this.lock) {
                try {
                    Iterator<PerImageReader> it = this.imageReaderQueue.iterator();
                    size = 0;
                    while (it.hasNext()) {
                        size += it.next().imageQueue.size();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return size;
        }

        @VisibleForTesting
        public int numTrims() {
            int i11;
            synchronized (this.lock) {
                i11 = this.numTrims;
            }
            return i11;
        }

        public void onImage(ImageReader imageReader, Image image) {
            PerImage perImageQueueImage;
            synchronized (this.lock) {
                perImageQueueImage = getOrCreatePerImageReader(imageReader).queueImage(image);
            }
            if (perImageQueueImage == null) {
                return;
            }
            FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i11) {
            if (i11 < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            TextureRegistry.SurfaceProducer.Callback callback = this.callback;
            if (callback != null) {
                this.notifiedDestroy = true;
                callback.onSurfaceCleanup();
            }
            cleanup();
            this.createNewReader = true;
        }

        @VisibleForTesting
        public int pendingDequeuedImages() {
            return this.lastDequeuedImage.size();
        }

        public void pruneImageReaderQueue() {
            PerImageReader perImageReaderPeekFirst;
            while (this.imageReaderQueue.size() > 1 && (perImageReaderPeekFirst = this.imageReaderQueue.peekFirst()) != null && perImageReaderPeekFirst.canPrune()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(perImageReaderPeekFirst.reader);
                perImageReaderPeekFirst.close();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.unregisterTexture(this.f86771id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setCallback(TextureRegistry.SurfaceProducer.Callback callback) {
            this.callback = callback;
        }

        @TargetApi(33)
        private ImageReader createImageReader33() {
            C38764h.m87517a();
            ImageReader.Builder builderM87516a = C38763g.m87516a(this.requestedWidth, this.requestedHeight);
            builderM87516a.setMaxImages(6);
            builderM87516a.setImageFormat(34);
            builderM87516a.setUsage(256L);
            return builderM87516a.build();
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
            FlutterRenderer.this.imageReaderProducers.remove(this);
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            PerImage perImageDequeueImage = dequeueImage();
            if (perImageDequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(perImageDequeueImage.image);
            return perImageDequeueImage.image;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().reader.getSurface();
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    @Keep
    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";

        /* JADX INFO: renamed from: id */
        private final long f86772id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public ImageTextureRegistryEntry(long j11) {
            this.f86772id = j11;
        }

        @TargetApi(29)
        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                Log.m87475d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f86772id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        /* JADX INFO: renamed from: id */
        public long mo87506id() {
            return this.f86772id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                Log.m87477e(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.unregisterTexture(this.f86772id);
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.OnTrimMemoryListener {

        @Nullable
        private TextureRegistry.OnFrameConsumedListener frameConsumedListener;

        /* JADX INFO: renamed from: id */
        private final long f86773id;
        private boolean released;

        @NonNull
        private final SurfaceTextureWrapper textureWrapper;

        @Nullable
        private TextureRegistry.OnTrimMemoryListener trimMemoryListener;

        public SurfaceTextureRegistryEntry(@NonNull long j11, SurfaceTexture surfaceTexture) {
            this.f86773id = j11;
            this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture, new Runnable() { // from class: io.flutter.embedding.engine.renderer.k
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterRenderer.SurfaceTextureRegistryEntry.m87509b(this.f86778b);
                }
            });
            surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.l
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    FlutterRenderer.SurfaceTextureRegistryEntry.m87508a(this.f86779b, surfaceTexture2);
                }
            }, new Handler());
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m87508a(SurfaceTextureRegistryEntry surfaceTextureRegistryEntry, SurfaceTexture surfaceTexture) {
            if (surfaceTextureRegistryEntry.released || !FlutterRenderer.this.flutterJNI.isAttached()) {
                return;
            }
            surfaceTextureRegistryEntry.textureWrapper.markDirty();
            FlutterRenderer.this.scheduleEngineFrame();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m87509b(SurfaceTextureRegistryEntry surfaceTextureRegistryEntry) {
            TextureRegistry.OnFrameConsumedListener onFrameConsumedListener = surfaceTextureRegistryEntry.frameConsumedListener;
            if (onFrameConsumedListener != null) {
                onFrameConsumedListener.onFrameConsumed();
            }
        }

        private void removeListener() {
            FlutterRenderer.this.removeOnTrimMemoryListener(this);
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                FlutterRenderer.this.handler.post(new TextureFinalizerRunnable(this.f86773id, FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        /* JADX INFO: renamed from: id */
        public long mo87506id() {
            return this.f86773id;
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i11) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = this.trimMemoryListener;
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i11);
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            Log.m87481v(FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.f86773id + ").");
            this.textureWrapper.release();
            FlutterRenderer.this.unregisterTexture(this.f86773id);
            removeListener();
            this.released = true;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnFrameConsumedListener(@Nullable TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
            this.frameConsumedListener = onFrameConsumedListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnTrimMemoryListener(@Nullable TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
            this.trimMemoryListener = onTrimMemoryListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        @NonNull
        public SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        @NonNull
        public SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static final class TextureFinalizerRunnable implements Runnable {
        private final FlutterJNI flutterJNI;

        /* JADX INFO: renamed from: id */
        private final long f86774id;

        @Override // java.lang.Runnable
        public void run() {
            if (this.flutterJNI.isAttached()) {
                Log.m87481v(FlutterRenderer.TAG, "Releasing a Texture (" + this.f86774id + ").");
                this.flutterJNI.unregisterTexture(this.f86774id);
            }
        }

        public TextureFinalizerRunnable(long j11, @NonNull FlutterJNI flutterJNI) {
            this.f86774id = j11;
            this.flutterJNI = flutterJNI;
        }
    }

    public static final class ViewportMetrics {
        public static final int unsetValue = -1;
        public float devicePixelRatio = 1.0f;
        public int width = 0;
        public int height = 0;
        public int viewPaddingTop = 0;
        public int viewPaddingRight = 0;
        public int viewPaddingBottom = 0;
        public int viewPaddingLeft = 0;
        public int viewInsetTop = 0;
        public int viewInsetRight = 0;
        public int viewInsetBottom = 0;
        public int viewInsetLeft = 0;
        public int systemGestureInsetTop = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int physicalTouchSlop = -1;
        private final List<DisplayFeature> displayFeatures = new ArrayList();
        private final List<DisplayFeature> displayCutouts = new ArrayList();

        public List<DisplayFeature> getDisplayCutouts() {
            return this.displayCutouts;
        }

        public List<DisplayFeature> getDisplayFeatures() {
            return this.displayFeatures;
        }

        public void setDisplayCutouts(List<DisplayFeature> list) {
            this.displayCutouts.clear();
            this.displayCutouts.addAll(list);
        }

        public void setDisplayFeatures(List<DisplayFeature> list) {
            this.displayFeatures.clear();
            this.displayFeatures.addAll(list);
        }

        public boolean validate() {
            return this.width > 0 && this.height > 0 && this.devicePixelRatio > 0.0f;
        }
    }

    @Override // io.flutter.view.TextureRegistry
    @NonNull
    public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(@NonNull SurfaceTexture surfaceTexture) {
        return registerSurfaceTexture(this.nextTextureId.getAndIncrement(), surfaceTexture);
    }

    public static final class DisplayFeature {
        public final Rect bounds;
        public final DisplayFeatureState state;
        public final DisplayFeatureType type;

        public DisplayFeature(Rect rect, DisplayFeatureType displayFeatureType, DisplayFeatureState displayFeatureState) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = displayFeatureState;
        }
    }

    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);

        public final int encodedValue;

        DisplayFeatureState(int i11) {
            this.encodedValue = i11;
        }
    }

    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);

        public final int encodedValue;

        DisplayFeatureType(int i11) {
            this.encodedValue = i11;
        }
    }

    private void clearDeadListeners() {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    private void registerImageTexture(long j11, @NonNull TextureRegistry.ImageConsumer imageConsumer, boolean z11) {
        this.flutterJNI.registerImageTexture(j11, imageConsumer, z11);
    }

    @NonNull
    private TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(long j11, @NonNull SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(j11, surfaceTexture);
        Log.m87481v(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.mo87506id());
        registerTexture(surfaceTextureRegistryEntry.mo87506id(), surfaceTextureRegistryEntry.textureWrapper());
        addOnTrimMemoryListener(surfaceTextureRegistryEntry);
        return surfaceTextureRegistryEntry;
    }

    private void registerTexture(long j11, @NonNull SurfaceTextureWrapper surfaceTextureWrapper) {
        this.flutterJNI.registerTexture(j11, surfaceTextureWrapper);
    }

    private void translateFeatureBounds(int[] iArr, int i11, Rect rect) {
        iArr[i11] = rect.left;
        iArr[i11 + 1] = rect.top;
        iArr[i11 + 2] = rect.right;
        iArr[i11 + 3] = rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterTexture(long j11) {
        this.flutterJNI.unregisterTexture(j11);
    }

    public void addIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
        if (this.isDisplayingFlutterUi) {
            flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    @Override // io.flutter.view.TextureRegistry
    @NonNull
    public TextureRegistry.ImageTextureEntry createImageTexture() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.nextTextureId.getAndIncrement());
        Log.m87481v(TAG, "New ImageTextureEntry ID: " + imageTextureRegistryEntry.mo87506id());
        registerImageTexture(imageTextureRegistryEntry.mo87506id(), imageTextureRegistryEntry, false);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    @NonNull
    public TextureRegistry.SurfaceProducer createSurfaceProducer(TextureRegistry.SurfaceLifecycle surfaceLifecycle) {
        if (debugForceSurfaceProducerGlTextures || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntryCreateSurfaceTexture = createSurfaceTexture();
            SurfaceTextureSurfaceProducer surfaceTextureSurfaceProducer = new SurfaceTextureSurfaceProducer(surfaceTextureEntryCreateSurfaceTexture.mo87506id(), this.handler, this.flutterJNI, surfaceTextureEntryCreateSurfaceTexture);
            Log.m87481v(TAG, "New SurfaceTextureSurfaceProducer ID: " + surfaceTextureEntryCreateSurfaceTexture.mo87506id());
            return surfaceTextureSurfaceProducer;
        }
        long andIncrement = this.nextTextureId.getAndIncrement();
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
        boolean z11 = surfaceLifecycle == TextureRegistry.SurfaceLifecycle.resetInBackground;
        registerImageTexture(andIncrement, imageReaderSurfaceProducer, z11);
        if (z11) {
            addOnTrimMemoryListener(imageReaderSurfaceProducer);
        }
        this.imageReaderProducers.add(imageReaderSurfaceProducer);
        Log.m87481v(TAG, "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    @Override // io.flutter.view.TextureRegistry
    @NonNull
    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        Log.m87481v(TAG, "Creating a SurfaceTexture.");
        return registerSurfaceTexture(new SurfaceTexture(0));
    }

    public void dispatchPointerDataPacket(@NonNull ByteBuffer byteBuffer, int i11) {
        this.flutterJNI.dispatchPointerDataPacket(byteBuffer, i11);
    }

    public void dispatchSemanticsAction(int i11, int i12, @Nullable ByteBuffer byteBuffer, int i13) {
        this.flutterJNI.dispatchSemanticsAction(i11, i12, byteBuffer, i13);
    }

    public Bitmap getBitmap() {
        return this.flutterJNI.getBitmap();
    }

    public boolean isDisplayingFlutterUi() {
        return this.isDisplayingFlutterUi;
    }

    public boolean isSoftwareRenderingEnabled() {
        return this.flutterJNI.getIsSoftwareRenderingEnabled();
    }

    @Override // io.flutter.view.TextureRegistry
    public void onTrimMemory(int i11) {
        Iterator<WeakReference<TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = it.next().get();
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i11);
            } else {
                it.remove();
            }
        }
    }

    public void removeIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    }

    @VisibleForTesting
    public void removeOnTrimMemoryListener(@NonNull TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        for (WeakReference<TextureRegistry.OnTrimMemoryListener> weakReference : this.onTrimMemoryListeners) {
            if (weakReference.get() == onTrimMemoryListener) {
                this.onTrimMemoryListeners.remove(weakReference);
                return;
            }
        }
    }

    @VisibleForTesting
    public void scheduleEngineFrame() {
        this.flutterJNI.scheduleFrame();
    }

    public void setAccessibilityFeatures(int i11) {
        this.flutterJNI.setAccessibilityFeatures(i11);
    }

    public void setSemanticsEnabled(boolean z11) {
        this.flutterJNI.setSemanticsEnabled(z11);
    }

    public void setViewportMetrics(@NonNull ViewportMetrics viewportMetrics) {
        if (viewportMetrics.validate()) {
            Log.m87481v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics.width + " x " + viewportMetrics.height + "\nPadding - L: " + viewportMetrics.viewPaddingLeft + ", T: " + viewportMetrics.viewPaddingTop + ", R: " + viewportMetrics.viewPaddingRight + ", B: " + viewportMetrics.viewPaddingBottom + "\nInsets - L: " + viewportMetrics.viewInsetLeft + ", T: " + viewportMetrics.viewInsetTop + ", R: " + viewportMetrics.viewInsetRight + ", B: " + viewportMetrics.viewInsetBottom + "\nSystem Gesture Insets - L: " + viewportMetrics.systemGestureInsetLeft + ", T: " + viewportMetrics.systemGestureInsetTop + ", R: " + viewportMetrics.systemGestureInsetRight + ", B: " + viewportMetrics.systemGestureInsetRight + "\nDisplay Features: " + viewportMetrics.displayFeatures.size() + "\nDisplay Cutouts: " + viewportMetrics.displayCutouts.size());
            int size = viewportMetrics.displayFeatures.size() + viewportMetrics.displayCutouts.size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i11 = 0; i11 < viewportMetrics.displayFeatures.size(); i11++) {
                DisplayFeature displayFeature = (DisplayFeature) viewportMetrics.displayFeatures.get(i11);
                translateFeatureBounds(iArr, i11 * 4, displayFeature.bounds);
                iArr2[i11] = displayFeature.type.encodedValue;
                iArr3[i11] = displayFeature.state.encodedValue;
            }
            int size2 = viewportMetrics.displayFeatures.size() * 4;
            for (int i12 = 0; i12 < viewportMetrics.displayCutouts.size(); i12++) {
                DisplayFeature displayFeature2 = (DisplayFeature) viewportMetrics.displayCutouts.get(i12);
                translateFeatureBounds(iArr, (i12 * 4) + size2, displayFeature2.bounds);
                iArr2[viewportMetrics.displayFeatures.size() + i12] = displayFeature2.type.encodedValue;
                iArr3[viewportMetrics.displayFeatures.size() + i12] = displayFeature2.state.encodedValue;
            }
            this.flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.width, viewportMetrics.height, viewportMetrics.viewPaddingTop, viewportMetrics.viewPaddingRight, viewportMetrics.viewPaddingBottom, viewportMetrics.viewPaddingLeft, viewportMetrics.viewInsetTop, viewportMetrics.viewInsetRight, viewportMetrics.viewInsetBottom, viewportMetrics.viewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft, viewportMetrics.physicalTouchSlop, iArr, iArr2, iArr3);
        }
    }

    public void startRenderingToSurface(@NonNull Surface surface, boolean z11) {
        if (!z11) {
            stopRenderingToSurface();
        }
        this.surface = surface;
        if (z11) {
            this.flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            this.flutterJNI.onSurfaceCreated(surface);
        }
    }

    public void stopRenderingToSurface() {
        if (this.surface != null) {
            this.flutterJNI.onSurfaceDestroyed();
            if (this.isDisplayingFlutterUi) {
                this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
            }
            this.isDisplayingFlutterUi = false;
            this.surface = null;
        }
    }

    public void surfaceChanged(int i11, int i12) {
        this.flutterJNI.onSurfaceChanged(i11, i12);
    }

    public void swapSurface(@NonNull Surface surface) {
        this.surface = surface;
        this.flutterJNI.onSurfaceWindowChanged(surface);
    }

    public FlutterRenderer(@NonNull FlutterJNI flutterJNI) {
        FlutterUiDisplayListener flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.1
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = true;
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = false;
            }
        };
        this.flutterUiDisplayListener = flutterUiDisplayListener;
        this.flutterJNI = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
                Log.m87481v(FlutterRenderer.TAG, "onResume called; notifying SurfaceProducers");
                for (ImageReaderSurfaceProducer imageReaderSurfaceProducer : FlutterRenderer.this.imageReaderProducers) {
                    if (imageReaderSurfaceProducer.callback != null && imageReaderSurfaceProducer.notifiedDestroy) {
                        imageReaderSurfaceProducer.notifiedDestroy = false;
                        imageReaderSurfaceProducer.callback.onSurfaceAvailable();
                    }
                }
            }
        });
    }

    @VisibleForTesting
    public void addOnTrimMemoryListener(@NonNull TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        clearDeadListeners();
        this.onTrimMemoryListeners.add(new WeakReference<>(onTrimMemoryListener));
    }
}
