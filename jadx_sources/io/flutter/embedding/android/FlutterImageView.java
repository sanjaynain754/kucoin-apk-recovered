package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.flutter.Log;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.RenderSurface;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes60.dex */
public class FlutterImageView extends View implements RenderSurface {
    private static final String TAG = "FlutterImageView";

    @Nullable
    private Bitmap currentBitmap;

    @Nullable
    private Image currentImage;

    @Nullable
    private FlutterRenderer flutterRenderer;

    @NonNull
    private ImageReader imageReader;
    private boolean isAttachedToFlutterRenderer;
    private SurfaceKind kind;

    public enum SurfaceKind {
        background,
        overlay
    }

    public FlutterImageView(@NonNull Context context, int i11, int i12, SurfaceKind surfaceKind) {
        this(context, createImageReader(i11, i12), surfaceKind);
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    private static ImageReader createImageReader(int i11, int i12) {
        int i13;
        int i14;
        if (i11 <= 0) {
            logW("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i11));
            i13 = 1;
        } else {
            i13 = i11;
        }
        if (i12 <= 0) {
            logW("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i12));
            i14 = 1;
        } else {
            i14 = i12;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i13, i14, 1, 3, 768L) : ImageReader.newInstance(i13, i14, 1, 3);
    }

    private void init() {
        setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: io.flutter.embedding.android.FlutterImageView$1 */
    public static /* synthetic */ class C387101 {

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind */
        static final /* synthetic */ int[] f86730x435d6649;

        static {
            int[] iArr = new int[SurfaceKind.values().length];
            f86730x435d6649 = iArr;
            try {
                iArr[SurfaceKind.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86730x435d6649[SurfaceKind.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FlutterImageView(@NonNull Context context) {
        this(context, 1, 1, SurfaceKind.background);
    }

    private void closeCurrentImage() {
        Image image = this.currentImage;
        if (image != null) {
            image.close();
            this.currentImage = null;
        }
    }

    private static void logW(String str, Object... objArr) {
        Log.m87483w(TAG, String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    private void updateCurrentBitmap() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.currentImage.getHardwareBuffer();
            this.currentBitmap = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.currentImage.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.currentImage.getHeight();
        Bitmap bitmap = this.currentBitmap;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.currentBitmap.getHeight() != height) {
            this.currentBitmap = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.currentBitmap.copyPixelsFromBuffer(buffer);
    }

    public boolean acquireLatestImage() {
        if (!this.isAttachedToFlutterRenderer) {
            return false;
        }
        Image imageAcquireLatestImage = this.imageReader.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            closeCurrentImage();
            this.currentImage = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void attachToRenderer(@NonNull FlutterRenderer flutterRenderer) {
        if (C387101.f86730x435d6649[this.kind.ordinal()] == 1) {
            flutterRenderer.swapSurface(this.imageReader.getSurface());
        }
        setAlpha(1.0f);
        this.flutterRenderer = flutterRenderer;
        this.isAttachedToFlutterRenderer = true;
    }

    public void closeImageReader() {
        this.imageReader.close();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void detachFromRenderer() {
        if (this.isAttachedToFlutterRenderer) {
            setAlpha(0.0f);
            acquireLatestImage();
            this.currentBitmap = null;
            closeCurrentImage();
            invalidate();
            this.isAttachedToFlutterRenderer = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    @Nullable
    public FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public ImageReader getImageReader() {
        return this.imageReader;
    }

    @NonNull
    public Surface getSurface() {
        return this.imageReader.getSurface();
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (!(i11 == this.imageReader.getWidth() && i12 == this.imageReader.getHeight()) && this.kind == SurfaceKind.background && this.isAttachedToFlutterRenderer) {
            resizeIfNeeded(i11, i12);
            this.flutterRenderer.swapSurface(this.imageReader.getSurface());
        }
    }

    public void resizeIfNeeded(int i11, int i12) {
        if (this.flutterRenderer == null) {
            return;
        }
        if (i11 == this.imageReader.getWidth() && i12 == this.imageReader.getHeight()) {
            return;
        }
        closeCurrentImage();
        closeImageReader();
        this.imageReader = createImageReader(i11, i12);
    }

    public FlutterImageView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this(context, 1, 1, SurfaceKind.background);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.currentImage != null) {
            updateCurrentBitmap();
        }
        Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @VisibleForTesting
    public FlutterImageView(@NonNull Context context, @NonNull ImageReader imageReader, SurfaceKind surfaceKind) {
        super(context, null);
        this.isAttachedToFlutterRenderer = false;
        this.imageReader = imageReader;
        this.kind = surfaceKind;
        init();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void pause() {
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void resume() {
    }
}
