package androidx.camera.core;

import android.media.ImageReader;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ImageReaderProxys {
    private ImageReaderProxys() {
    }

    public static ImageReaderProxy createIsolatedReader(int i11, int i12, int i13, int i14) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i11, i12, i13, i14));
    }
}
