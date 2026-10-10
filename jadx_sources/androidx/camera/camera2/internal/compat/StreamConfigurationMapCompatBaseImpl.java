package androidx.camera.camera2.internal.compat;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;

/* JADX INFO: loaded from: classes23.dex */
class StreamConfigurationMapCompatBaseImpl implements StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl {
    private static final String TAG = "StreamConfigurationMapCompatBaseImpl";
    final StreamConfigurationMap mStreamConfigurationMap;

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Size[] getOutputSizes(int i11) {
        return i11 == 34 ? this.mStreamConfigurationMap.getOutputSizes(SurfaceTexture.class) : this.mStreamConfigurationMap.getOutputSizes(i11);
    }

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Size[] getHighResolutionOutputSizes(StreamConfigurationMap streamConfigurationMap, int i11) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i11);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Size[] getHighResolutionOutputSizes(int i11) {
        return Api23Impl.getHighResolutionOutputSizes(this.mStreamConfigurationMap, i11);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Range<Integer>[] getHighSpeedVideoFpsRanges() {
        return this.mStreamConfigurationMap.getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Range<Integer>[] getHighSpeedVideoFpsRangesFor(Size size) throws IllegalArgumentException {
        return this.mStreamConfigurationMap.getHighSpeedVideoFpsRangesFor(size);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Size[] getHighSpeedVideoSizes() {
        return this.mStreamConfigurationMap.getHighSpeedVideoSizes();
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Size[] getHighSpeedVideoSizesFor(Range<Integer> range) throws IllegalArgumentException {
        return this.mStreamConfigurationMap.getHighSpeedVideoSizesFor(range);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public int[] getOutputFormats() {
        try {
            return this.mStreamConfigurationMap.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e11) {
            Logger.m1873w(TAG, "Failed to get output formats from StreamConfigurationMap", e11);
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public long getOutputMinFrameDuration(int i11, Size size) {
        return i11 == 34 ? this.mStreamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size) : this.mStreamConfigurationMap.getOutputMinFrameDuration(i11, size);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public StreamConfigurationMap unwrap() {
        return this.mStreamConfigurationMap;
    }

    public StreamConfigurationMapCompatBaseImpl(StreamConfigurationMap streamConfigurationMap) {
        this.mStreamConfigurationMap = streamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public <T> Size[] getOutputSizes(Class<T> cls) {
        return this.mStreamConfigurationMap.getOutputSizes(cls);
    }
}
