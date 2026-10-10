package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(28)
class OutputConfigurationCompatApi28Impl extends OutputConfigurationCompatApi26Impl {

    public static final class OutputConfigurationParamsApi28 {
        long mDynamicRangeProfile = 1;
        final OutputConfiguration mOutputConfiguration;

        public boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi28)) {
                return false;
            }
            OutputConfigurationParamsApi28 outputConfigurationParamsApi28 = (OutputConfigurationParamsApi28) obj;
            return Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi28.mOutputConfiguration) && this.mDynamicRangeProfile == outputConfigurationParamsApi28.mDynamicRangeProfile;
        }

        public int hashCode() {
            int iHashCode = this.mOutputConfiguration.hashCode() ^ 31;
            return Long.hashCode(this.mDynamicRangeProfile) ^ ((iHashCode << 5) - iHashCode);
        }

        public OutputConfigurationParamsApi28(OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }
    }

    public OutputConfigurationCompatApi28Impl(Surface surface) {
        this(new OutputConfigurationParamsApi28(new OutputConfiguration(surface)));
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public String getPhysicalCameraId() {
        return null;
    }

    public OutputConfigurationCompatApi28Impl(int i11, Surface surface) {
        this(new OutputConfigurationParamsApi28(new OutputConfiguration(i11, surface)));
    }

    @RequiresApi(28)
    public static OutputConfigurationCompatApi28Impl wrap(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi28Impl(new OutputConfigurationParamsApi28(outputConfiguration));
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((OutputConfigurationParamsApi28) this.mObject).mDynamicRangeProfile;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.mObject instanceof OutputConfigurationParamsApi28);
        return ((OutputConfigurationParamsApi28) this.mObject).mOutputConfiguration;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j11) {
        ((OutputConfigurationParamsApi28) this.mObject).mDynamicRangeProfile = j11;
    }

    public OutputConfigurationCompatApi28Impl(Object obj) {
        super(obj);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        return ((OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(String str) {
        ((OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }
}
