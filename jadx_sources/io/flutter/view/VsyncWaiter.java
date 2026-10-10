package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class VsyncWaiter {
    private static VsyncWaiter instance;
    private static DisplayListener listener;
    private FlutterJNI flutterJNI;
    private long refreshPeriodNanos = -1;
    private FrameCallback frameCallback = new FrameCallback(0);
    private final FlutterJNI.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = new FlutterJNI.AsyncWaitForVsyncDelegate() { // from class: io.flutter.view.VsyncWaiter.1
        private Choreographer.FrameCallback obtainFrameCallback(long j11) {
            if (VsyncWaiter.this.frameCallback == null) {
                return VsyncWaiter.this.new FrameCallback(j11);
            }
            VsyncWaiter.this.frameCallback.cookie = j11;
            FrameCallback frameCallback = VsyncWaiter.this.frameCallback;
            VsyncWaiter.this.frameCallback = null;
            return frameCallback;
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate
        public void asyncWaitForVsync(long j11) {
            Choreographer.getInstance().postFrameCallback(obtainFrameCallback(j11));
        }
    };

    public class DisplayListener implements DisplayManager.DisplayListener {
        private DisplayManager displayManager;

        public DisplayListener(DisplayManager displayManager) {
            this.displayManager = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i11) {
            if (i11 == 0) {
                float refreshRate = this.displayManager.getDisplay(0).getRefreshRate();
                VsyncWaiter.this.refreshPeriodNanos = (long) (1.0E9d / ((double) refreshRate));
                VsyncWaiter.this.flutterJNI.setRefreshRateFPS(refreshRate);
            }
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i11) {
        }
    }

    public class FrameCallback implements Choreographer.FrameCallback {
        private long cookie;

        public FrameCallback(long j11) {
            this.cookie = j11;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            long j12;
            long jNanoTime = System.nanoTime() - j11;
            if (jNanoTime < 0) {
                j12 = 0;
            } else {
                j12 = jNanoTime;
            }
            VsyncWaiter.this.flutterJNI.onVsync(j12, VsyncWaiter.this.refreshPeriodNanos, this.cookie);
            VsyncWaiter.this.frameCallback = this;
        }
    }

    @NonNull
    public static VsyncWaiter getInstance(float f11, @NonNull FlutterJNI flutterJNI) {
        if (instance == null) {
            instance = new VsyncWaiter(flutterJNI);
        }
        flutterJNI.setRefreshRateFPS(f11);
        VsyncWaiter vsyncWaiter = instance;
        vsyncWaiter.refreshPeriodNanos = (long) (1.0E9d / ((double) f11));
        return vsyncWaiter;
    }

    @VisibleForTesting
    public static void reset() {
        instance = null;
        listener = null;
    }

    public void init() {
        this.flutterJNI.setAsyncWaitForVsyncDelegate(this.asyncWaitForVsyncDelegate);
    }

    private VsyncWaiter(@NonNull FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    @NonNull
    public static VsyncWaiter getInstance(@NonNull DisplayManager displayManager, @NonNull FlutterJNI flutterJNI) {
        if (instance == null) {
            instance = new VsyncWaiter(flutterJNI);
        }
        if (listener == null) {
            VsyncWaiter vsyncWaiter = instance;
            Objects.requireNonNull(vsyncWaiter);
            DisplayListener displayListener = vsyncWaiter.new DisplayListener(displayManager);
            listener = displayListener;
            displayListener.register();
        }
        if (instance.refreshPeriodNanos == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            instance.refreshPeriodNanos = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return instance;
    }
}
