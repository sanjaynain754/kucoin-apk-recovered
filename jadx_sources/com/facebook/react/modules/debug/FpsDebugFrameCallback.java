package com.facebook.react.modules.debug;

import android.view.Choreographer;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.tencent.bugly.library.MonitorCallback;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p302h6.C38115a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FpsDebugFrameCallback.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u0000 42\u00020\u0001:\u000234B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0012\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007J\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010-\u001a\u00020\u0010J\u0010\u00100\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020\rJ\u0006\u00102\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010&\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010+\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0011\u0010.\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b/\u0010(¨\u00065"}, m90084d2 = {"Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "choreographer", "Landroid/view/Choreographer;", "uiManagerModule", "Lcom/facebook/react/uimanager/UIManagerModule;", "didJSUpdateUiDuringFrameDetector", "Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;", "firstFrameTime", "", "lastFrameTime", "numFrameCallbacks", "", "expectedNumFramesPrev", "fourPlusFrameStutters", "numFrameCallbacksWithBatchDispatches", "isRecordingFpsInfoAtEachFrame", "", "targetFps", "", "timeToFps", "Ljava/util/TreeMap;", "Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;", "doFrame", "", CmcdData.Factory.STREAM_TYPE_LIVE, "start", "startAndRecordFpsAtEachFrame", InterfaceC33730j9.f70350a, MonitorCallback.EVENT_FPS, "getFps", "()D", "jsFPS", "getJsFPS", "numFrames", "getNumFrames", "()I", "numJSFrames", "getNumJSFrames", "expectedNumFrames", "getExpectedNumFrames", "get4PlusFrameStutters", "totalTimeMS", "getTotalTimeMS", "getFpsInfo", "upToTimeMs", "reset", "FpsInfo", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class FpsDebugFrameCallback implements Choreographer.FrameCallback {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final double DEFAULT_FPS = 60.0d;

    @Nullable
    private Choreographer choreographer;

    @NotNull
    private final DidJSUpdateUiDuringFrameDetector didJSUpdateUiDuringFrameDetector;
    private int expectedNumFramesPrev;
    private long firstFrameTime;
    private int fourPlusFrameStutters;
    private boolean isRecordingFpsInfoAtEachFrame;
    private long lastFrameTime;
    private int numFrameCallbacks;
    private int numFrameCallbacksWithBatchDispatches;

    @NotNull
    private final ReactContext reactContext;
    private double targetFps;

    @Nullable
    private TreeMap<Long, FpsInfo> timeToFps;

    @Nullable
    private final UIManagerModule uiManagerModule;

    /* JADX INFO: compiled from: FpsDebugFrameCallback.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$Companion;", "", "<init>", "()V", "DEFAULT_FPS", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: FpsDebugFrameCallback.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000e\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$FpsInfo;", "", "totalFrames", "", "totalJsFrames", "totalExpectedFrames", "total4PlusFrameStutters", MonitorCallback.EVENT_FPS, "", "jsFps", "totalTimeMs", "<init>", "(IIIIDDI)V", "getTotalFrames", "()I", "getTotalJsFrames", "getTotalExpectedFrames", "getTotal4PlusFrameStutters", "getFps", "()D", "getJsFps", "getTotalTimeMs", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class FpsInfo {
        private final double fps;
        private final double jsFps;
        private final int total4PlusFrameStutters;
        private final int totalExpectedFrames;
        private final int totalFrames;
        private final int totalJsFrames;
        private final int totalTimeMs;

        public final double getFps() {
            return this.fps;
        }

        public final double getJsFps() {
            return this.jsFps;
        }

        public final int getTotal4PlusFrameStutters() {
            return this.total4PlusFrameStutters;
        }

        public final int getTotalExpectedFrames() {
            return this.totalExpectedFrames;
        }

        public final int getTotalFrames() {
            return this.totalFrames;
        }

        public final int getTotalJsFrames() {
            return this.totalJsFrames;
        }

        public final int getTotalTimeMs() {
            return this.totalTimeMs;
        }

        public FpsInfo(int i11, int i12, int i13, int i14, double d11, double d12, int i15) {
            this.totalFrames = i11;
            this.totalJsFrames = i12;
            this.totalExpectedFrames = i13;
            this.total4PlusFrameStutters = i14;
            this.fps = d11;
            this.jsFps = d12;
            this.totalTimeMs = i15;
        }
    }

    @JvmOverloads
    public final void start() {
        start$default(this, 0.0d, 1, null);
    }

    public static /* synthetic */ void start$default(FpsDebugFrameCallback fpsDebugFrameCallback, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = fpsDebugFrameCallback.targetFps;
        }
        fpsDebugFrameCallback.start(d11);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long l11) {
        if (this.firstFrameTime == -1) {
            this.firstFrameTime = l11;
        }
        long j11 = this.lastFrameTime;
        this.lastFrameTime = l11;
        if (this.didJSUpdateUiDuringFrameDetector.getDidJSHitFrameAndCleanup(j11, l11)) {
            this.numFrameCallbacksWithBatchDispatches++;
        }
        this.numFrameCallbacks++;
        int expectedNumFrames = getExpectedNumFrames();
        if ((expectedNumFrames - this.expectedNumFramesPrev) - 1 >= 4) {
            this.fourPlusFrameStutters++;
        }
        if (this.isRecordingFpsInfoAtEachFrame) {
            C38115a.m86047c(this.timeToFps);
            FpsInfo fpsInfo = new FpsInfo(getNumFrames(), getNumJSFrames(), expectedNumFrames, this.fourPlusFrameStutters, getFps(), getJsFPS(), getTotalTimeMS());
            TreeMap<Long, FpsInfo> treeMap = this.timeToFps;
            if (treeMap != null) {
                treeMap.put(Long.valueOf(System.currentTimeMillis()), fpsInfo);
            }
        }
        this.expectedNumFramesPrev = expectedNumFrames;
        Choreographer choreographer = this.choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: get4PlusFrameStutters, reason: from getter */
    public final int getFourPlusFrameStutters() {
        return this.fourPlusFrameStutters;
    }

    public final double getFps() {
        if (this.lastFrameTime == this.firstFrameTime) {
            return 0.0d;
        }
        return (((double) getNumFrames()) * 1.0E9d) / (this.lastFrameTime - this.firstFrameTime);
    }

    @Nullable
    public final FpsInfo getFpsInfo(long upToTimeMs) {
        Map.Entry<Long, FpsInfo> entryFloorEntry;
        C38115a.m86048d(this.timeToFps, "FPS was not recorded at each frame!");
        TreeMap<Long, FpsInfo> treeMap = this.timeToFps;
        if (treeMap == null || (entryFloorEntry = treeMap.floorEntry(Long.valueOf(upToTimeMs))) == null) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    public final double getJsFPS() {
        if (this.lastFrameTime == this.firstFrameTime) {
            return 0.0d;
        }
        return (((double) getNumJSFrames()) * 1.0E9d) / (this.lastFrameTime - this.firstFrameTime);
    }

    public final int getNumFrames() {
        return this.numFrameCallbacks - 1;
    }

    public final int getNumJSFrames() {
        return this.numFrameCallbacksWithBatchDispatches - 1;
    }

    public final int getTotalTimeMS() {
        return (int) ((this.lastFrameTime - this.firstFrameTime) / 1000000.0d);
    }

    public final void reset() {
        this.firstFrameTime = -1L;
        this.lastFrameTime = -1L;
        this.numFrameCallbacks = 0;
        this.fourPlusFrameStutters = 0;
        this.numFrameCallbacksWithBatchDispatches = 0;
        this.isRecordingFpsInfoAtEachFrame = false;
        this.timeToFps = null;
    }

    @JvmOverloads
    public final void start(double targetFps) {
        if (!this.reactContext.isBridgeless()) {
            this.reactContext.getCatalystInstance().addBridgeIdleDebugListener(this.didJSUpdateUiDuringFrameDetector);
        }
        UIManagerModule uIManagerModule = this.uiManagerModule;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(this.didJSUpdateUiDuringFrameDetector);
        }
        this.targetFps = targetFps;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.d
            @Override // java.lang.Runnable
            public final void run() {
                FpsDebugFrameCallback.start$lambda$0(this.f9803b);
            }
        });
    }

    public final void startAndRecordFpsAtEachFrame() {
        this.timeToFps = new TreeMap<>();
        this.isRecordingFpsInfoAtEachFrame = true;
        start$default(this, 0.0d, 1, null);
    }

    public final void stop() {
        if (!this.reactContext.isBridgeless()) {
            this.reactContext.getCatalystInstance().removeBridgeIdleDebugListener(this.didJSUpdateUiDuringFrameDetector);
        }
        UIManagerModule uIManagerModule = this.uiManagerModule;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(null);
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.e
            @Override // java.lang.Runnable
            public final void run() {
                FpsDebugFrameCallback.stop$lambda$1(this.f9804b);
            }
        });
    }

    public FpsDebugFrameCallback(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.uiManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.didJSUpdateUiDuringFrameDetector = new DidJSUpdateUiDuringFrameDetector();
        this.firstFrameTime = -1L;
        this.lastFrameTime = -1L;
        this.targetFps = DEFAULT_FPS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(FpsDebugFrameCallback fpsDebugFrameCallback) {
        Choreographer choreographer = Choreographer.getInstance();
        fpsDebugFrameCallback.choreographer = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(fpsDebugFrameCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(FpsDebugFrameCallback fpsDebugFrameCallback) {
        Choreographer choreographer = Choreographer.getInstance();
        fpsDebugFrameCallback.choreographer = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(fpsDebugFrameCallback);
        }
    }

    public final int getExpectedNumFrames() {
        return (int) (((this.targetFps * ((double) getTotalTimeMS())) / ((double) 1000)) + ((double) 1));
    }
}
