package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(23)
public final class ImageWriterCompat {
    public static ImageWriter newInstance(Surface surface, @IntRange(from = 1) int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            return ImageWriterCompatApi29Impl.newInstance(surface, i11, i12);
        }
        if (i13 >= 26) {
            return ImageWriterCompatApi26Impl.newInstance(surface, i11, i12);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i13 + ". Version 26 or higher required.");
    }

    private ImageWriterCompat() {
    }

    public static void close(ImageWriter imageWriter) {
        ImageWriterCompatApi23Impl.close(imageWriter);
    }

    public static Image dequeueInputImage(ImageWriter imageWriter) {
        return ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
    }

    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
    }

    public static void setOnImageReleasedListener(ImageWriter imageWriter, ImageWriter.OnImageReleasedListener onImageReleasedListener, Executor executor) {
        ImageWriterCompatApi23Impl.setOnImageReleasedListener(imageWriter, onImageReleasedListener, executor);
    }

    public static ImageWriter newInstance(Surface surface, @IntRange(from = 1) int i11) {
        return ImageWriterCompatApi23Impl.newInstance(surface, i11);
    }
}
