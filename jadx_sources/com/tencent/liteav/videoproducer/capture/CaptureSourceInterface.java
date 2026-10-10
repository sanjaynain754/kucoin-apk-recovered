package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public abstract class CaptureSourceInterface {
    private static final String TAG = "CaptureSourceInterface";

    public static class CaptureParams {

        /* JADX INFO: renamed from: b */
        public int f74600b;

        /* JADX INFO: renamed from: c */
        public int f74601c;

        /* JADX INFO: renamed from: d */
        public int f74602d;

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureParams)) {
                return false;
            }
            CaptureParams captureParams = (CaptureParams) obj;
            return this.f74600b == captureParams.f74600b && this.f74601c == captureParams.f74601c && this.f74602d == captureParams.f74602d;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "size: %dx%d, fps: %d", Integer.valueOf(this.f74601c), Integer.valueOf(this.f74602d), Integer.valueOf(this.f74600b));
        }
    }

    public interface CaptureSourceListener {
    }

    public abstract void pause();

    public abstract void resume();

    public abstract void start(Object obj, CaptureParams captureParams, CaptureSourceListener captureSourceListener);

    public abstract void stop();

    public abstract void updateParams(CaptureParams captureParams);

    public void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
    }
}
