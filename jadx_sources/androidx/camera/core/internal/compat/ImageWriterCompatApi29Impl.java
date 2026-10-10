package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(29)
final class ImageWriterCompatApi29Impl {
    private ImageWriterCompatApi29Impl() {
    }

    public static ImageWriter newInstance(Surface surface, @IntRange(from = 1) int i11, int i12) {
        return ImageWriter.newInstance(surface, i11, i12);
    }
}
