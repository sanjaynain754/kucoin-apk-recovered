package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.compat.workaround.CaptureOutputSurfaceForCaptureProcessor;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    CaptureOutputSurfaceForCaptureProcessor mCaptureOutputSurface;
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;
    final CaptureResultImageMatcher mCaptureResultImageMatcher = new CaptureResultImageMatcher();
    final Object mLock = new Object();

    @GuardedBy("mLock")
    HashMap<Integer, Pair<ImageReference, TotalCaptureResult>> mCaptureResults = new HashMap<>();

    @GuardedBy("mLock")
    OnCaptureResultCallback mOnCaptureResultCallback = null;

    @GuardedBy("mLock")
    TotalCaptureResult mSourceCaptureResult = null;

    @GuardedBy("mLock")
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    public interface OnCaptureResultCallback {
        void onCaptureCompleted(long j11, List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i11);

        void onError(Exception exc);

        void onProcessCompleted();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2092a(StillCaptureProcessor stillCaptureProcessor, List list, OnCaptureResultCallback onCaptureResultCallback, boolean z11, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i11) {
        synchronized (stillCaptureProcessor.mLock) {
            try {
                if (stillCaptureProcessor.mIsClosed) {
                    imageReference.decrement();
                    Logger.m1866d(TAG, "Ignore image in closed state");
                    return;
                }
                Logger.m1866d(TAG, "onImageReferenceIncoming  captureStageId=" + i11);
                stillCaptureProcessor.mCaptureResults.put(Integer.valueOf(i11), new Pair<>(imageReference, totalCaptureResult));
                Logger.m1866d(TAG, "mCaptureResult has capture stage Id: " + stillCaptureProcessor.mCaptureResults.keySet());
                if (stillCaptureProcessor.mCaptureResults.keySet().containsAll(list)) {
                    stillCaptureProcessor.process(stillCaptureProcessor.mCaptureResults, onCaptureResultCallback, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$1(boolean z11, HashMap map, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                        if (this.mIsClosed) {
                            Logger.m1866d(TAG, "Ignore process() in closed state.");
                            Logger.m1866d(TAG, "CaptureProcessorImpl.process() finish");
                            OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                            if (onCaptureResultCallback2 != null) {
                                onCaptureResultCallback2.onProcessCompleted();
                                this.mOnCaptureResultCallback = null;
                            }
                            clearCaptureResults();
                            return;
                        }
                        Logger.m1866d(TAG, "CaptureProcessorImpl.process() begin");
                        Version version = Version.VERSION_1_4;
                        if (ExtensionVersion.isMinimumCompatibleVersion(version) && ClientVersion.isMinimumCompatibleVersion(version) && z11 && this.mIsPostviewConfigured) {
                            this.mCaptureProcessorImpl.processWithPostview(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                                public void onCaptureCompleted(long j11, List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j11, list);
                                }

                                public void onCaptureProcessProgressed(int i11) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i11);
                                }
                            }, CameraXExecutors.directExecutor());
                        } else {
                            Version version2 = Version.VERSION_1_3;
                            if (ExtensionVersion.isMinimumCompatibleVersion(version2) && ClientVersion.isMinimumCompatibleVersion(version2)) {
                                this.mCaptureProcessorImpl.process(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                    public void onCaptureCompleted(long j11, List<Pair<CaptureResult.Key, Object>> list) {
                                        onCaptureResultCallback.onCaptureCompleted(j11, list);
                                    }

                                    public void onCaptureProcessProgressed(int i11) {
                                        onCaptureResultCallback.onCaptureProcessProgressed(i11);
                                    }
                                }, CameraXExecutors.directExecutor());
                            } else {
                                this.mCaptureProcessorImpl.process(map);
                            }
                        }
                        Logger.m1866d(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                    } catch (Exception e11) {
                        Logger.m1869e(TAG, "mCaptureProcessorImpl.process exception ", e11);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e11);
                        }
                        Logger.m1866d(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback4 != null) {
                            onCaptureResultCallback4.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                Logger.m1866d(TAG, "CaptureProcessorImpl.process() finish");
                OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback5 != null) {
                    onCaptureResultCallback5.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
                throw th3;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<ImageReference, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((ImageReference) it.next().first).decrement();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            Logger.m1866d(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.clearImageReferenceListener();
            this.mCaptureResultImageMatcher.clear();
            this.mCaptureOutputSurface.close();
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i11) {
        Long l11;
        this.mCaptureResultImageMatcher.captureResultIncoming(totalCaptureResult, i11);
        if (this.mTimeStampForOutputImage == -1 && (l11 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long jLongValue = l11.longValue();
            this.mTimeStampForOutputImage = jLongValue;
            this.mCaptureOutputSurface.setOutputImageTimestamp(jLongValue);
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyImage(ImageReference imageReference) {
        this.mCaptureResultImageMatcher.imageIncoming(imageReference);
    }

    public void process(Map<Integer, Pair<ImageReference, TotalCaptureResult>> map, final OnCaptureResultCallback onCaptureResultCallback, final boolean z11) {
        final HashMap map2 = new HashMap();
        synchronized (this.mLock) {
            try {
                for (Integer num : map.keySet()) {
                    Pair<ImageReference, TotalCaptureResult> pair = map.get(num);
                    map2.put(num, new Pair(((ImageReference) pair.first).get(), (TotalCaptureResult) pair.second));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        CameraXExecutors.ioExecutor().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f1913b.lambda$process$1(z11, map2, onCaptureResultCallback);
            }
        });
    }

    public void startCapture(final boolean z11, final List<Integer> list, final OnCaptureResultCallback onCaptureResultCallback) {
        Logger.m1866d(TAG, "Start the capture: enablePostview=" + z11);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            Preconditions.checkState(!this.mIsClosed, "StillCaptureProcessor is closed. Can't invoke startCapture()");
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.clear();
        this.mCaptureResultImageMatcher.setImageReferenceListener(new CaptureResultImageMatcher.ImageReferenceListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.g
            @Override // androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener
            public final void onImageReferenceIncoming(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i11) {
                StillCaptureProcessor.m2092a(this.f1917a, list, onCaptureResultCallback, z11, imageReference, totalCaptureResult, i11);
            }
        });
    }

    public StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, OutputSurface outputSurface, boolean z11) {
        boolean z12;
        this.mCaptureProcessorImpl = captureProcessorImpl;
        CaptureOutputSurfaceForCaptureProcessor captureOutputSurfaceForCaptureProcessor = new CaptureOutputSurfaceForCaptureProcessor(surface, size, z11);
        this.mCaptureOutputSurface = captureOutputSurfaceForCaptureProcessor;
        captureProcessorImpl.onOutputSurface(captureOutputSurfaceForCaptureProcessor.getSurface(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        if (outputSurface != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.mIsPostviewConfigured = z12;
        if (outputSurface != null) {
            Version version = Version.VERSION_1_4;
            if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
                Preconditions.checkArgument(outputSurface.getImageFormat() == 35);
                captureProcessorImpl.onResolutionUpdate(size, outputSurface.getSize());
                captureProcessorImpl.onPostviewOutputSurface(outputSurface.getSurface());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }
}
