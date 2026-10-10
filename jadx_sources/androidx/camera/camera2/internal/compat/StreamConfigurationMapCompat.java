package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import androidx.camera.core.Logger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class StreamConfigurationMapCompat {
    private static final String TAG = "StreamConfigurationMapCompat";
    private final StreamConfigurationMapCompatImpl mImpl;
    private final OutputSizesCorrector mOutputSizesCorrector;
    private final Map<Integer, Size[]> mCachedFormatOutputSizes = new HashMap();
    private final Map<Integer, Size[]> mCachedFormatHighResolutionOutputSizes = new HashMap();
    private final Map<Class<?>, Size[]> mCachedClassOutputSizes = new HashMap();

    public interface StreamConfigurationMapCompatImpl {
        Size[] getHighResolutionOutputSizes(int i11);

        Range<Integer>[] getHighSpeedVideoFpsRanges();

        Range<Integer>[] getHighSpeedVideoFpsRangesFor(Size size) throws IllegalArgumentException;

        Size[] getHighSpeedVideoSizes();

        Size[] getHighSpeedVideoSizesFor(Range<Integer> range) throws IllegalArgumentException;

        int[] getOutputFormats();

        long getOutputMinFrameDuration(int i11, Size size);

        Size[] getOutputSizes(int i11);

        <T> Size[] getOutputSizes(Class<T> cls);

        StreamConfigurationMap unwrap();
    }

    public Size[] getOutputSizes(int i11) {
        Size[] outputSizes = null;
        if (this.mCachedFormatOutputSizes.containsKey(Integer.valueOf(i11))) {
            if (this.mCachedFormatOutputSizes.get(Integer.valueOf(i11)) == null) {
                return null;
            }
            return (Size[]) this.mCachedFormatOutputSizes.get(Integer.valueOf(i11)).clone();
        }
        try {
            outputSizes = this.mImpl.getOutputSizes(i11);
        } catch (Throwable th2) {
            Logger.m1873w(TAG, "Failed to get output sizes for " + i11, th2);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] sizeArrApplyQuirks = this.mOutputSizesCorrector.applyQuirks(outputSizes, i11);
            this.mCachedFormatOutputSizes.put(Integer.valueOf(i11), sizeArrApplyQuirks);
            return (Size[]) sizeArrApplyQuirks.clone();
        }
        Logger.m1872w(TAG, "Retrieved output sizes array is null or empty for format " + i11);
        return outputSizes;
    }

    public static StreamConfigurationMapCompat toStreamConfigurationMapCompat(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        return new StreamConfigurationMapCompat(streamConfigurationMap, outputSizesCorrector);
    }

    public Size[] getHighResolutionOutputSizes(int i11) {
        if (this.mCachedFormatHighResolutionOutputSizes.containsKey(Integer.valueOf(i11))) {
            if (this.mCachedFormatHighResolutionOutputSizes.get(Integer.valueOf(i11)) == null) {
                return null;
            }
            return (Size[]) this.mCachedFormatHighResolutionOutputSizes.get(Integer.valueOf(i11)).clone();
        }
        Size[] highResolutionOutputSizes = this.mImpl.getHighResolutionOutputSizes(i11);
        if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
            highResolutionOutputSizes = this.mOutputSizesCorrector.applyQuirks(highResolutionOutputSizes, i11);
        }
        this.mCachedFormatHighResolutionOutputSizes.put(Integer.valueOf(i11), highResolutionOutputSizes);
        if (highResolutionOutputSizes != null) {
            return (Size[]) highResolutionOutputSizes.clone();
        }
        return null;
    }

    public Range<Integer>[] getHighSpeedVideoFpsRanges() {
        return this.mImpl.getHighSpeedVideoFpsRanges();
    }

    public Range<Integer>[] getHighSpeedVideoFpsRangesFor(Size size) throws IllegalArgumentException {
        return this.mImpl.getHighSpeedVideoFpsRangesFor(size);
    }

    public Size[] getHighSpeedVideoSizes() {
        return this.mImpl.getHighSpeedVideoSizes();
    }

    public Size[] getHighSpeedVideoSizesFor(Range<Integer> range) throws IllegalArgumentException {
        return this.mImpl.getHighSpeedVideoSizesFor(range);
    }

    public int[] getOutputFormats() {
        int[] outputFormats = this.mImpl.getOutputFormats();
        if (outputFormats == null) {
            return null;
        }
        return (int[]) outputFormats.clone();
    }

    public long getOutputMinFrameDuration(int i11, Size size) {
        try {
            return this.mImpl.getOutputMinFrameDuration(i11, size);
        } catch (RuntimeException e11) {
            Logger.m1873w(TAG, "Failed to get min frame duration for format = " + i11 + " and size = " + size, e11);
            return 0L;
        }
    }

    public StreamConfigurationMap toStreamConfigurationMap() {
        return this.mImpl.unwrap();
    }

    private StreamConfigurationMapCompat(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        this.mImpl = new StreamConfigurationMapCompatApi23Impl(streamConfigurationMap);
        this.mOutputSizesCorrector = outputSizesCorrector;
    }

    public <T> Size[] getOutputSizes(Class<T> cls) {
        Size[] outputSizes = null;
        if (this.mCachedClassOutputSizes.containsKey(cls)) {
            if (this.mCachedClassOutputSizes.get(cls) == null) {
                return null;
            }
            return (Size[]) this.mCachedClassOutputSizes.get(cls).clone();
        }
        try {
            outputSizes = this.mImpl.getOutputSizes(cls);
        } catch (Throwable th2) {
            Logger.m1873w(TAG, "Fail to get output sizes for " + cls, th2);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] sizeArrApplyQuirks = this.mOutputSizesCorrector.applyQuirks(outputSizes, cls);
            this.mCachedClassOutputSizes.put(cls, sizeArrApplyQuirks);
            return (Size[]) sizeArrApplyQuirks.clone();
        }
        Logger.m1872w(TAG, "Retrieved output sizes array is null or empty for class " + cls);
        return outputSizes;
    }
}
