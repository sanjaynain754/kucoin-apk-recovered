package androidx.camera.core.imagecapture;

import android.util.Size;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class PostviewSettings {
    public abstract int getInputFormat();

    public abstract Size getResolution();

    public static PostviewSettings create(Size size, int i11) {
        return new AutoValue_PostviewSettings(size, i11);
    }
}
