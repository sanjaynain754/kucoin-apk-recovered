package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(23)
class StreamConfigurationMapCompatApi23Impl extends StreamConfigurationMapCompatBaseImpl {
    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public long getOutputMinFrameDuration(int i11, Size size) {
        return this.mStreamConfigurationMap.getOutputMinFrameDuration(i11, size);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Size[] getOutputSizes(int i11) {
        return this.mStreamConfigurationMap.getOutputSizes(i11);
    }

    public StreamConfigurationMapCompatApi23Impl(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }
}
