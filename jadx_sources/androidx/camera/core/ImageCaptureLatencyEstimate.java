package androidx.camera.core;

import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class ImageCaptureLatencyEstimate {
    public static final long UNDEFINED_CAPTURE_LATENCY = -1;
    public static final ImageCaptureLatencyEstimate UNDEFINED_IMAGE_CAPTURE_LATENCY = new ImageCaptureLatencyEstimate(-1, -1);
    public static final long UNDEFINED_PROCESSING_LATENCY = -1;
    private final long mCaptureLatencyMillis;
    private final long mProcessingLatencyMillis;
    private final long mTotalCaptureLatencyMillis;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCaptureLatencyEstimate)) {
            return false;
        }
        ImageCaptureLatencyEstimate imageCaptureLatencyEstimate = (ImageCaptureLatencyEstimate) obj;
        return this.mCaptureLatencyMillis == imageCaptureLatencyEstimate.getCaptureLatencyMillis() && this.mProcessingLatencyMillis == imageCaptureLatencyEstimate.getProcessingLatencyMillis() && this.mTotalCaptureLatencyMillis == imageCaptureLatencyEstimate.getTotalCaptureLatencyMillis();
    }

    private long computeTotalCaptureLatencyMillis(long j11, long j12) {
        if (j11 == -1 || j12 == -1) {
            return -1L;
        }
        return j11 + j12;
    }

    public long getCaptureLatencyMillis() {
        return this.mCaptureLatencyMillis;
    }

    public long getProcessingLatencyMillis() {
        return this.mProcessingLatencyMillis;
    }

    public long getTotalCaptureLatencyMillis() {
        return this.mTotalCaptureLatencyMillis;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.mCaptureLatencyMillis), Long.valueOf(this.mProcessingLatencyMillis), Long.valueOf(this.mTotalCaptureLatencyMillis));
    }

    public String toString() {
        return "captureLatencyMillis=" + this.mCaptureLatencyMillis + ", processingLatencyMillis=" + this.mProcessingLatencyMillis + ", totalCaptureLatencyMillis=" + this.mTotalCaptureLatencyMillis;
    }

    public ImageCaptureLatencyEstimate(long j11, long j12) {
        this.mCaptureLatencyMillis = j11;
        this.mProcessingLatencyMillis = j12;
        this.mTotalCaptureLatencyMillis = computeTotalCaptureLatencyMillis(j11, j12);
    }
}
