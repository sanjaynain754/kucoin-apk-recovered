package androidx.camera.extensions.internal.sessionprocessor;

import com.google.auto.value.AutoValue;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class MultiResolutionImageReaderOutputConfig implements Camera2OutputConfig {
    public abstract int getImageFormat();

    public abstract int getMaxImages();

    public static MultiResolutionImageReaderOutputConfig create(int i11, int i12, String str, List<Camera2OutputConfig> list, int i13, int i14) {
        return new AutoValue_MultiResolutionImageReaderOutputConfig(i11, i12, str, list, i13, i14);
    }
}
