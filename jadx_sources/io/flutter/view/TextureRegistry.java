package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public interface TextureRegistry {

    /* JADX INFO: loaded from: classes60.dex */
    @Keep
    public interface GLTextureConsumer {
        @NonNull
        SurfaceTexture getSurfaceTexture();
    }

    @Keep
    public interface ImageConsumer {
        @Nullable
        Image acquireLatestImage();
    }

    /* JADX INFO: loaded from: classes60.dex */
    @Keep
    public interface ImageTextureEntry extends TextureEntry {
        void pushImage(Image image);
    }

    /* JADX INFO: loaded from: classes60.dex */
    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    /* JADX INFO: loaded from: classes60.dex */
    public interface OnTrimMemoryListener {
        void onTrimMemory(int i11);
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum SurfaceLifecycle {
        manual,
        resetInBackground
    }

    /* JADX INFO: loaded from: classes60.dex */
    @Keep
    public interface SurfaceProducer extends TextureEntry {
        Surface getForcedNewSurface();

        int getHeight();

        Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        void scheduleFrame();

        void setCallback(Callback callback);

        void setSize(int i11, int i12);

        public interface Callback {
            default void onSurfaceAvailable() {
                onSurfaceCreated();
            }

            default void onSurfaceCleanup() {
                onSurfaceDestroyed();
            }

            @Deprecated(forRemoval = true, since = "Flutter 3.27")
            default void onSurfaceCreated() {
            }

            @Deprecated(forRemoval = true, since = "Flutter 3.28")
            default void onSurfaceDestroyed() {
            }
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public interface TextureEntry {
        /* JADX INFO: renamed from: id */
        long mo87506id();

        void release();
    }

    @NonNull
    ImageTextureEntry createImageTexture();

    @NonNull
    default SurfaceProducer createSurfaceProducer() {
        return createSurfaceProducer(SurfaceLifecycle.manual);
    }

    @NonNull
    SurfaceProducer createSurfaceProducer(SurfaceLifecycle surfaceLifecycle);

    @NonNull
    SurfaceTextureEntry createSurfaceTexture();

    @NonNull
    SurfaceTextureEntry registerSurfaceTexture(@NonNull SurfaceTexture surfaceTexture);

    default void onTrimMemory(int i11) {
    }

    /* JADX INFO: loaded from: classes60.dex */
    @Keep
    public interface SurfaceTextureEntry extends TextureEntry {
        @NonNull
        SurfaceTexture surfaceTexture();

        default void setOnFrameConsumedListener(@Nullable OnFrameConsumedListener onFrameConsumedListener) {
        }

        default void setOnTrimMemoryListener(@Nullable OnTrimMemoryListener onTrimMemoryListener) {
        }
    }
}
