package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class ImageReaderOutputConfig implements Camera2OutputConfig {
    public static ImageReaderOutputConfig create(int i11, int i12, String str, List<Camera2OutputConfig> list, Size size, int i13, int i14) {
        return new AutoValue_ImageReaderOutputConfig(i11, i12, str, list, size, i13, i14);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();

    public abstract Size getSize();

    public static ImageReaderOutputConfig create(int i11, Size size, int i12, int i13) {
        return new AutoValue_ImageReaderOutputConfig(i11, -1, null, Collections.EMPTY_LIST, size, i12, i13);
    }
}
