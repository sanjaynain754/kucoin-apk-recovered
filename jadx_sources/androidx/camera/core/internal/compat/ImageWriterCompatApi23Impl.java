package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(23)
final class ImageWriterCompatApi23Impl {
    public static void setOnImageReleasedListener(ImageWriter imageWriter, final ImageWriter.OnImageReleasedListener onImageReleasedListener, final Executor executor) {
        imageWriter.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: androidx.camera.core.internal.compat.b
            @Override // android.media.ImageWriter.OnImageReleasedListener
            public final void onImageReleased(ImageWriter imageWriter2) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.internal.compat.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        onImageReleasedListener.onImageReleased(imageWriter2);
                    }
                });
            }
        }, MainThreadAsyncHandler.getInstance());
    }

    private ImageWriterCompatApi23Impl() {
    }

    public static void close(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image dequeueInputImage(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter newInstance(Surface surface, @IntRange(from = 1) int i11) {
        return ImageWriter.newInstance(surface, i11);
    }

    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
