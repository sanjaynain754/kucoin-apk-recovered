package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Consumer;
import com.google.auto.value.AutoValue;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public interface SurfaceOutput extends Closeable {

    @AutoValue
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class CameraInputInfo {
        public abstract CameraInternal getCameraInternal();

        public abstract Rect getInputCropRect();

        public abstract Size getInputSize();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();

        /* JADX INFO: renamed from: of */
        public static CameraInputInfo m1883of(Size size, Rect rect, CameraInternal cameraInternal, int i11, boolean z11) {
            return new AutoValue_SurfaceOutput_CameraInputInfo(size, rect, cameraInternal, i11, z11);
        }
    }

    @AutoValue
    public static abstract class Event {
        public static final int EVENT_REQUEST_CLOSE = 0;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface EventCode {
        }

        public abstract int getEventCode();

        public abstract SurfaceOutput getSurfaceOutput();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* JADX INFO: renamed from: of */
        public static Event m1884of(int i11, SurfaceOutput surfaceOutput) {
            return new AutoValue_SurfaceOutput_Event(i11, surfaceOutput);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    Size getSize();

    Surface getSurface(Executor executor, Consumer<Event> consumer);

    int getTargets();

    void updateTransformMatrix(float[] fArr, float[] fArr2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default void updateTransformMatrix(float[] fArr, float[] fArr2, boolean z11) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default int getFormat() {
        return 34;
    }

    default Matrix getSensorToBufferTransform() {
        return new Matrix();
    }
}
