package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class OutputConfigurationCompat {
    public static final int STREAM_USE_CASE_NONE = -1;
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private final OutputConfigurationCompatImpl mImpl;

    public interface OutputConfigurationCompatImpl {
        void addSurface(Surface surface);

        void enableSurfaceSharing();

        long getDynamicRangeProfile();

        int getMaxSharedSurfaceCount();

        int getMirrorMode();

        Object getOutputConfiguration();

        String getPhysicalCameraId();

        long getStreamUseCase();

        Surface getSurface();

        int getSurfaceGroupId();

        List<Surface> getSurfaces();

        void removeSurface(Surface surface);

        void setDynamicRangeProfile(long j11);

        void setMirrorMode(int i11);

        void setPhysicalCameraId(String str);

        void setStreamUseCase(long j11);
    }

    public OutputConfigurationCompat(Surface surface) {
        this(-1, surface);
    }

    public static OutputConfigurationCompat wrap(Object obj) {
        OutputConfigurationCompatImpl outputConfigurationCompatImplWrap;
        if (obj == null) {
            return null;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            outputConfigurationCompatImplWrap = OutputConfigurationCompatApi33Impl.wrap((OutputConfiguration) obj);
        } else if (i11 >= 28) {
            outputConfigurationCompatImplWrap = OutputConfigurationCompatApi28Impl.wrap((OutputConfiguration) obj);
        } else {
            outputConfigurationCompatImplWrap = i11 >= 26 ? OutputConfigurationCompatApi26Impl.wrap((OutputConfiguration) obj) : OutputConfigurationCompatApi24Impl.wrap((OutputConfiguration) obj);
        }
        if (outputConfigurationCompatImplWrap == null) {
            return null;
        }
        return new OutputConfigurationCompat(outputConfigurationCompatImplWrap);
    }

    public OutputConfigurationCompat(int i11, Surface surface) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            this.mImpl = new OutputConfigurationCompatApi33Impl(i11, surface);
            return;
        }
        if (i12 >= 28) {
            this.mImpl = new OutputConfigurationCompatApi28Impl(i11, surface);
        } else if (i12 >= 26) {
            this.mImpl = new OutputConfigurationCompatApi26Impl(i11, surface);
        } else {
            this.mImpl = new OutputConfigurationCompatApi24Impl(i11, surface);
        }
    }

    public void addSurface(Surface surface) {
        this.mImpl.addSurface(surface);
    }

    public void enableSurfaceSharing() {
        this.mImpl.enableSurfaceSharing();
    }

    public boolean equals(Object obj) {
        if (obj instanceof OutputConfigurationCompat) {
            return this.mImpl.equals(((OutputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public long getDynamicRangeProfile() {
        return this.mImpl.getDynamicRangeProfile();
    }

    public int getMaxSharedSurfaceCount() {
        return this.mImpl.getMaxSharedSurfaceCount();
    }

    public int getMirrorMode() {
        return this.mImpl.getMirrorMode();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getPhysicalCameraId() {
        return this.mImpl.getPhysicalCameraId();
    }

    public long getStreamUseCase() {
        return this.mImpl.getStreamUseCase();
    }

    public Surface getSurface() {
        return this.mImpl.getSurface();
    }

    public int getSurfaceGroupId() {
        return this.mImpl.getSurfaceGroupId();
    }

    public List<Surface> getSurfaces() {
        return this.mImpl.getSurfaces();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public void removeSurface(Surface surface) {
        this.mImpl.removeSurface(surface);
    }

    public void setDynamicRangeProfile(long j11) {
        this.mImpl.setDynamicRangeProfile(j11);
    }

    public void setMirrorMode(int i11) {
        this.mImpl.setMirrorMode(i11);
    }

    public void setPhysicalCameraId(String str) {
        this.mImpl.setPhysicalCameraId(str);
    }

    public void setStreamUseCase(long j11) {
        this.mImpl.setStreamUseCase(j11);
    }

    public Object unwrap() {
        return this.mImpl.getOutputConfiguration();
    }

    @RequiresApi(26)
    public <T> OutputConfigurationCompat(Size size, Class<T> cls) {
        OutputConfiguration outputConfigurationNewOutputConfiguration = ApiCompat.Api26Impl.newOutputConfiguration(size, cls);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.mImpl = OutputConfigurationCompatApi33Impl.wrap(outputConfigurationNewOutputConfiguration);
        } else if (i11 >= 28) {
            this.mImpl = OutputConfigurationCompatApi28Impl.wrap(outputConfigurationNewOutputConfiguration);
        } else {
            this.mImpl = OutputConfigurationCompatApi26Impl.wrap(outputConfigurationNewOutputConfiguration);
        }
    }

    @RequiresApi(33)
    public OutputConfigurationCompat(OutputConfiguration outputConfiguration) {
        this.mImpl = OutputConfigurationCompatApi33Impl.wrap(outputConfiguration);
    }

    private OutputConfigurationCompat(OutputConfigurationCompatImpl outputConfigurationCompatImpl) {
        this.mImpl = outputConfigurationCompatImpl;
    }
}
