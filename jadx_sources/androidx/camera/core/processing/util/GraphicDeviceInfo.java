package androidx.camera.core.processing.util;

import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class GraphicDeviceInfo {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract GraphicDeviceInfo build();

        public abstract Builder setEglExtensions(String str);

        public abstract Builder setEglVersion(String str);

        public abstract Builder setGlExtensions(String str);

        public abstract Builder setGlVersion(String str);
    }

    public abstract String getEglExtensions();

    public abstract String getEglVersion();

    public abstract String getGlExtensions();

    public abstract String getGlVersion();

    public static Builder builder() {
        return new AutoValue_GraphicDeviceInfo.Builder().setGlVersion(GLUtils.VERSION_UNKNOWN).setEglVersion(GLUtils.VERSION_UNKNOWN).setGlExtensions("").setEglExtensions("");
    }
}
