package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.internal.interop.InteropUIBlockListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.fabric.mounting.MountItemDispatcher;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItemFactory;
import com.facebook.react.interfaces.fabric.SurfaceHandler;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.interop.InteropEventEmitter;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactRootViewTagGenerator;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.BatchEventDispatchedListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.FabricEventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.react.uimanager.events.SynchronousEventReceiver;
import com.facebook.react.views.text.TextLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
public class FabricUIManager implements UIManager, LifecycleEventListener, UIBlockViewResolver, SynchronousEventReceiver {
    private static final DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener FABRIC_PERF_LOGGER = new DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener() { // from class: com.facebook.react.fabric.b
        @Override // com.facebook.react.fabric.DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener
        public final void onFabricCommitEnd(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
            FabricUIManager.m10331a(fabricCommitPoint);
        }
    };
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";

    @NonNull
    private final BatchEventDispatchedListener mBatchEventDispatchedListener;

    @Nullable
    private FabricUIManagerBinding mBinding;
    public DevToolsReactPerfLogger mDevToolsReactPerfLogger;

    @NonNull
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;

    @NonNull
    private final EventDispatcher mEventDispatcher;

    @Nullable
    private InteropUIBlockListener mInteropUIBlockListener;

    @NonNull
    private final MountItemDispatcher mMountItemDispatcher;
    private final MountingManager.MountItemExecutor mMountItemExecutor;

    @NonNull
    private final MountingManager mMountingManager;

    @NonNull
    private final ReactApplicationContext mReactApplicationContext;

    @NonNull
    private final ViewManagerRegistry mViewManagerRegistry;

    @NonNull
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private boolean mMountNotificationScheduled = false;
    private final List<Integer> mMountedSurfaceIds = new ArrayList();
    private final Set<SynchronousEvent> mSynchronousEvents = new HashSet();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = 10000;

    public class DispatchUIFrameCallback extends GuardedFrameCallback {
        private volatile boolean mIsMountingEnabled;
        private boolean mIsScheduled;
        private boolean mShouldSchedule;

        @Override // com.facebook.react.fabric.GuardedFrameCallback
        @UiThread
        public void doFrameGuarded(long j11) {
            this.mIsScheduled = false;
            if (!this.mIsMountingEnabled) {
                C45999a.m101488I(FabricUIManager.TAG, "Not flushing pending UI operations: exception was previously thrown");
                return;
            }
            if (FabricUIManager.this.mDestroyed) {
                C45999a.m101488I(FabricUIManager.TAG, "Not flushing pending UI operations: FabricUIManager is destroyed");
                return;
            }
            if (FabricUIManager.this.mDriveCxxAnimations && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.driveCxxAnimations();
            }
            if (ReactNativeFeatureFlags.useOptimisedViewPreallocationOnAndroid() && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.drainPreallocateViewsQueue();
            }
            try {
                try {
                    FabricUIManager.this.mMountItemDispatcher.dispatchPreMountItems(j11);
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                    schedule();
                    FabricUIManager.this.mSynchronousEvents.clear();
                } catch (Exception e11) {
                    C45999a.m101508n(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e11);
                    this.mIsMountingEnabled = false;
                    throw e11;
                }
            } catch (Throwable th2) {
                schedule();
                throw th2;
            }
        }

        @UiThread
        public void resume() {
            this.mShouldSchedule = true;
            schedule();
        }

        private DispatchUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
            this.mIsMountingEnabled = true;
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }

        @UiThread
        private void schedule() {
            if (this.mIsScheduled || !this.mShouldSchedule) {
                return;
            }
            this.mIsScheduled = true;
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
        }

        @UiThread
        public void pause() {
            ReactChoreographer.getInstance().removeFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
            this.mShouldSchedule = false;
            this.mIsScheduled = false;
        }
    }

    public class MountItemDispatchListener implements MountItemDispatcher.ItemDispatchListener {
        private MountItemDispatchListener() {
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didDispatchMountItems() {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        @UiThread
        public void didMountItems(@Nullable List<MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didMountItems(FabricUIManager.this);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            for (MountItem mountItem : list) {
                if (mountItem != null && !FabricUIManager.this.mMountedSurfaceIds.contains(Integer.valueOf(mountItem.get_surfaceId()))) {
                    FabricUIManager.this.mMountedSurfaceIds.add(Integer.valueOf(mountItem.get_surfaceId()));
                }
            }
            if (FabricUIManager.this.mMountNotificationScheduled || FabricUIManager.this.mMountedSurfaceIds.isEmpty()) {
                return;
            }
            UiThreadUtil.getUiThreadHandler().postAtFrontOfQueue(new Runnable() { // from class: com.facebook.react.fabric.FabricUIManager.MountItemDispatchListener.1
                @Override // java.lang.Runnable
                public void run() {
                    FabricUIManager.this.mMountNotificationScheduled = false;
                    FabricUIManagerBinding fabricUIManagerBinding = FabricUIManager.this.mBinding;
                    if (fabricUIManagerBinding == null || FabricUIManager.this.mDestroyed) {
                        FabricUIManager.this.mMountedSurfaceIds.clear();
                        return;
                    }
                    Iterator it2 = FabricUIManager.this.mMountedSurfaceIds.iterator();
                    while (it2.hasNext()) {
                        fabricUIManagerBinding.reportMount(((Integer) it2.next()).intValue());
                    }
                    FabricUIManager.this.mMountedSurfaceIds.clear();
                }
            });
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        @UiThread
        public void willMountItems(@Nullable List<MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).willMountItems(FabricUIManager.this);
            }
        }
    }

    @AnyThread
    private MountItem createIntBufferBatchMountItem(int i11, @Nullable int[] iArr, @Nullable Object[] objArr, int i12) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return MountItemFactory.createIntBufferBatchMountItem(i11, iArr, objArr, i12);
    }

    private long measure(int i11, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, float f12, float f13, float f14) {
        return measure(i11, str, readableMap, readableMap2, readableMap3, f11, f12, f13, f14, null);
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    @Deprecated
    public void dispatchCommand(int i11, int i12, @Nullable ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @AnyThread
    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    @AnyThread
    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, String str, @Nullable WritableMap writableMap) {
        receiveEvent(-1, i11, str, false, writableMap, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    public <T extends View> int startSurface(T t11, String str, WritableMap writableMap, int i11, int i12) {
        int rootViewTag = ((ReactRoot) t11).getRootViewTag();
        Context context = t11.getContext();
        ThemedReactContext themedReactContext = new ThemedReactContext(this.mReactApplicationContext, context, str, rootViewTag);
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            C45999a.m101498d(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(rootViewTag));
        }
        this.mMountingManager.startSurface(rootViewTag, themedReactContext, t11);
        Point viewportOffset = UiThreadUtil.isOnUiThread() ? RootViewUtil.getViewportOffset(t11) : new Point(0, 0);
        this.mBinding.startSurfaceWithConstraints(rootViewTag, str, (NativeMap) writableMap, LayoutMetricsConversions.getMinSize(i11), LayoutMetricsConversions.getMaxSize(i11), LayoutMetricsConversions.getMinSize(i12), LayoutMetricsConversions.getMaxSize(i12), viewportOffset.x, viewportOffset.y, I18nUtil.getInstance().isRTL(context), I18nUtil.getInstance().doLeftAndRightSwapInRTL(context));
        return rootViewTag;
    }

    public void stopSurface(SurfaceHandler surfaceHandler) {
        if (!surfaceHandler.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.stopSurface(surfaceHandler.getSurfaceId());
        if (!(surfaceHandler instanceof SurfaceHandlerBinding)) {
            throw new IllegalArgumentException("Invalid SurfaceHandler");
        }
        this.mBinding.stopSurfaceWithSurfaceHandler((SurfaceHandlerBinding) surfaceHandler);
    }

    static {
        FabricSoLoader.staticInit();
    }

    @AnyThread
    private void destroyUnmountedView(int i11, int i12) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createDestroyViewMountItem(i11, i12));
    }

    @NonNull
    private InteropUIBlockListener getInteropUIBlockListener() {
        if (this.mInteropUIBlockListener == null) {
            InteropUIBlockListener interopUIBlockListener = new InteropUIBlockListener();
            this.mInteropUIBlockListener = interopUIBlockListener;
            addUIManagerEventListener(interopUIBlockListener);
        }
        return this.mInteropUIBlockListener;
    }

    private long measure(int i11, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, float f12, float f13, float f14, @Nullable float[] fArr) {
        ReactContext context;
        if (i11 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i11, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measure(context, str, readableMap, readableMap2, readableMap3, LayoutMetricsConversions.getYogaSize(f11, f12), LayoutMetricsConversions.getYogaMeasureMode(f11, f12), LayoutMetricsConversions.getYogaSize(f13, f14), LayoutMetricsConversions.getYogaMeasureMode(f13, f14), fArr);
    }

    private NativeArray measureLines(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f11, float f12) {
        return (NativeArray) TextLayoutManager.measureLines(this.mReactApplicationContext, readableMapBuffer, readableMapBuffer2, PixelUtil.toPixelFromDIP(f11), PixelUtil.toPixelFromDIP(f12));
    }

    private long measureMapBuffer(int i11, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, @Nullable ReadableMapBuffer readableMapBuffer3, float f11, float f12, float f13, float f14, @Nullable float[] fArr) {
        ReactContext context;
        if (i11 > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i11, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measureMapBuffer(context, str, readableMapBuffer, readableMapBuffer2, readableMapBuffer3, LayoutMetricsConversions.getYogaSize(f11, f12), LayoutMetricsConversions.getYogaMeasureMode(f11, f12), LayoutMetricsConversions.getYogaSize(f13, f14), LayoutMetricsConversions.getYogaMeasureMode(f13, f14), fArr);
    }

    @AnyThread
    private void preallocateView(int i11, int i12, String str, @Nullable Object obj, @Nullable Object obj2, boolean z11) {
        this.mMountItemDispatcher.addPreAllocateMountItem(MountItemFactory.createPreAllocateViewMountItem(i11, i12, str, (ReadableMap) obj, (StateWrapper) obj2, z11));
    }

    @AnyThread
    private void scheduleMountItem(@Nullable MountItem mountItem, int i11, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z11 = mountItem instanceof BatchMountItem;
        boolean z12 = (z11 && !((BatchMountItem) mountItem).isBatchEmpty()) || !(z11 || mountItem == null);
        Iterator<UIManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().didScheduleMountItems(this);
        }
        if (z11) {
            this.mCommitStartTime = j11;
            this.mLayoutTime = j15 - j14;
            this.mFinishTransactionCPPTime = j17 - j16;
            this.mFinishTransactionTime = jUptimeMillis - j16;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z12) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            GuardedRunnable guardedRunnable = new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.fabric.FabricUIManager.3
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                }
            };
            if (UiThreadUtil.isOnUiThread()) {
                guardedRunnable.run();
            }
        }
        if (z11) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i11, j11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i11, j16);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i11, j17);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i11, j12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i11, j13);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i11, j14);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i11, j15);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES, null, i11, j15, i12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @UiThread
    @Deprecated
    public <T extends View> int addRootView(T t11, WritableMap writableMap) {
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        ReactRoot reactRoot = (ReactRoot) t11;
        int rootViewTag = reactRoot.getRootViewTag();
        this.mMountingManager.startSurface(rootViewTag, new ThemedReactContext(this.mReactApplicationContext, t11.getContext(), reactRoot.getSurfaceID(), rootViewTag), t11);
        String jSModuleName = reactRoot.getJSModuleName();
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            C45999a.m101498d(str, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(rootViewTag));
        }
        this.mBinding.startSurface(rootViewTag, jSModuleName, (NativeMap) writableMap);
        return rootViewTag;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(SurfaceHandler surfaceHandler, View view) {
        this.mMountingManager.attachRootView(surfaceHandler.getSurfaceId(), view, new ThemedReactContext(this.mReactApplicationContext, view.getContext(), surfaceHandler.getModuleName(), surfaceHandler.getSurfaceId()));
        surfaceHandler.setMountable(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.5
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            /* JADX INFO: renamed from: getSurfaceId */
            public int get_surfaceId() {
                return -1;
            }

            @NonNull
            public String toString() {
                return "CLEAR_JS_RESPONDER";
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(@NonNull MountingManager mountingManager) {
                mountingManager.clearJSResponder();
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    @Deprecated
    public void dispatchCommand(int i11, String str, @Nullable ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public int getColor(int i11, String[] strArr) {
        ThemedReactContext context = this.mMountingManager.getSurfaceManagerEnforced(i11, "getColor").getContext();
        if (context == null) {
            return 0;
        }
        for (String str : strArr) {
            Integer numResolveResourcePath = ColorPropConverter.resolveResourcePath(context, str);
            if (numResolveResourcePath != null) {
                return numResolveResourcePath.intValue();
            }
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.UIManager
    @NonNull
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        map.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.getRunStartTime()));
        map.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.getBatchedExecutionTime()));
        map.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        map.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return map;
    }

    public boolean getThemeData(int i11, float[] fArr) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i11);
        ThemedReactContext context = surfaceManager != null ? surfaceManager.getContext() : null;
        if (context == null) {
            C45999a.m101490K(TAG, "Couldn't get context for surfaceId %d in getThemeData", Integer.valueOf(i11));
            return false;
        }
        float[] defaultTextInputPadding = UIManagerHelper.getDefaultTextInputPadding(context);
        fArr[0] = defaultTextInputPadding[0];
        fArr[1] = defaultTextInputPadding[1];
        fArr[2] = defaultTextInputPadding[2];
        fArr[3] = defaultTextInputPadding[3];
        return true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void initialize() {
        this.mEventDispatcher.registerEventEmitter(2, (RCTModernEventEmitter) new FabricEventEmitter(this));
        this.mEventDispatcher.addBatchEventDispatchedListener(this.mBatchEventDispatchedListener);
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            DevToolsReactPerfLogger devToolsReactPerfLogger = new DevToolsReactPerfLogger();
            this.mDevToolsReactPerfLogger = devToolsReactPerfLogger;
            devToolsReactPerfLogger.addDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.addFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (ReactNativeFeatureFlags.useFabricInterop()) {
            this.mReactApplicationContext.internal_registerInteropModule(RCTEventEmitter.class, new InteropEventEmitter(this.mReactApplicationContext));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    public void invalidate() {
        String str = TAG;
        C45999a.m101513s(str, "FabricUIManager.invalidate");
        DevToolsReactPerfLogger devToolsReactPerfLogger = this.mDevToolsReactPerfLogger;
        if (devToolsReactPerfLogger != null) {
            devToolsReactPerfLogger.removeDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.removeFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mEventDispatcher.removeBatchEventDispatchedListener(this.mBatchEventDispatchedListener);
        this.mEventDispatcher.unregisterEventEmitter(2);
        this.mReactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        this.mViewManagerRegistry.invalidate();
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        this.mBinding.unregister();
        this.mBinding = null;
        ViewManagerPropertyUpdater.clear();
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            return;
        }
        this.mEventDispatcher.onCatalystInstanceDestroyed();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i11, int i12) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i11);
        if (surfaceManager != null) {
            surfaceManager.markActiveTouchForTag(i12);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mDispatchUIFrameCallback.pause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mDispatchUIFrameCallback.resume();
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.dispatchAllEvents();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, int i12, String str, @Nullable WritableMap writableMap) {
        receiveEvent(i11, i12, str, false, writableMap, 2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Nullable
    @Deprecated
    public String resolveCustomDirectEventName(@Nullable String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(ViewProps.TOP)) {
            return str;
        }
        return ViewProps.ON + str.substring(3);
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    public void sendAccessibilityEvent(int i11, int i12) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(-1, i11, i12));
    }

    @AnyThread
    public void sendAccessibilityEventFromJS(int i11, int i12, String str) {
        int i13;
        if ("focus".equals(str)) {
            i13 = 8;
        } else if ("windowStateChange".equals(str)) {
            i13 = 32;
        } else if ("click".equals(str)) {
            i13 = 1;
        } else {
            if (!"viewHoverEnter".equals(str)) {
                throw new IllegalArgumentException("sendAccessibilityEventFromJS: invalid eventType " + str);
            }
            i13 = 128;
        }
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(i11, i12, i13));
    }

    public void setBinding(FabricUIManagerBinding fabricUIManagerBinding) {
        this.mBinding = fabricUIManagerBinding;
    }

    public void setJSResponder(final int i11, final int i12, final int i13, final boolean z11) {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.4
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(@NonNull MountingManager mountingManager) {
                SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(i11);
                if (surfaceManager != null) {
                    surfaceManager.setJSResponder(i12, i13, z11);
                    return;
                }
                C45999a.m101507m(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + i11 + "]");
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            /* JADX INFO: renamed from: getSurfaceId */
            public int get_surfaceId() {
                return i11;
            }

            @NonNull
            @SuppressLint({"DefaultLocale"})
            public String toString() {
                return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(i12), Integer.valueOf(i11));
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i11, int i12) {
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i11);
        if (surfaceManager != null) {
            surfaceManager.sweepActiveTouchForTag(i12);
        }
    }

    public FabricUIManager(@NonNull ReactApplicationContext reactApplicationContext, @NonNull ViewManagerRegistry viewManagerRegistry, @NonNull BatchEventDispatchedListener batchEventDispatchedListener) {
        MountingManager.MountItemExecutor mountItemExecutor = new MountingManager.MountItemExecutor() { // from class: com.facebook.react.fabric.FabricUIManager.1
            @Override // com.facebook.react.fabric.mounting.MountingManager.MountItemExecutor
            public void executeItems(Queue<MountItem> queue) {
                FabricUIManager.this.mMountItemDispatcher.dispatchMountItems(queue);
            }
        };
        this.mMountItemExecutor = mountItemExecutor;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        MountingManager mountingManager = new MountingManager(viewManagerRegistry, mountItemExecutor);
        this.mMountingManager = mountingManager;
        this.mMountItemDispatcher = new MountItemDispatcher(mountingManager, new MountItemDispatchListener());
        this.mEventDispatcher = new FabricEventDispatcher(reactApplicationContext);
        this.mBatchEventDispatchedListener = batchEventDispatchedListener;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mViewManagerRegistry = viewManagerRegistry;
        reactApplicationContext.registerComponentCallbacks(viewManagerRegistry);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10331a(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
        long commitDuration = fabricCommitPoint.getCommitDuration();
        long layoutDuration = fabricCommitPoint.getLayoutDuration();
        long diffDuration = fabricCommitPoint.getDiffDuration();
        long transactionEndDuration = fabricCommitPoint.getTransactionEndDuration();
        long batchExecutionDuration = fabricCommitPoint.getBatchExecutionDuration();
        LongStreamingStats longStreamingStats = DevToolsReactPerfLogger.mStreamingCommitStats;
        longStreamingStats.add(commitDuration);
        LongStreamingStats longStreamingStats2 = DevToolsReactPerfLogger.mStreamingLayoutStats;
        longStreamingStats2.add(layoutDuration);
        LongStreamingStats longStreamingStats3 = DevToolsReactPerfLogger.mStreamingDiffStats;
        longStreamingStats3.add(diffDuration);
        LongStreamingStats longStreamingStats4 = DevToolsReactPerfLogger.mStreamingTransactionEndStats;
        longStreamingStats4.add(transactionEndDuration);
        LongStreamingStats longStreamingStats5 = DevToolsReactPerfLogger.mStreamingBatchExecutionStats;
        longStreamingStats5.add(batchExecutionDuration);
        C45999a.m101516v(TAG, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n", Long.valueOf(fabricCommitPoint.getCommitNumber()), Long.valueOf(commitDuration), Double.valueOf(longStreamingStats.getAverage()), Double.valueOf(longStreamingStats.getMedian()), Long.valueOf(longStreamingStats.getMax()), Long.valueOf(layoutDuration), Double.valueOf(longStreamingStats2.getAverage()), Double.valueOf(longStreamingStats2.getMedian()), Long.valueOf(longStreamingStats2.getMax()), Long.valueOf(diffDuration), Double.valueOf(longStreamingStats3.getAverage()), Double.valueOf(longStreamingStats3.getMedian()), Long.valueOf(longStreamingStats3.getMax()), Long.valueOf(transactionEndDuration), Double.valueOf(longStreamingStats4.getAverage()), Double.valueOf(longStreamingStats4.getMedian()), Long.valueOf(longStreamingStats4.getMax()), Long.valueOf(batchExecutionDuration), Double.valueOf(longStreamingStats5.getAverage()), Double.valueOf(longStreamingStats5.getMedian()), Long.valueOf(longStreamingStats5.getMax()));
    }

    @AnyThread
    @SuppressLint({"NotInvokedPrivateMethod"})
    private boolean isOnMainThread() {
        return UiThreadUtil.isOnUiThread();
    }

    public void addUIBlock(UIBlock uIBlock) {
        if (ReactNativeFeatureFlags.useFabricInterop()) {
            getInteropUIBlockListener().addUIBlock(uIBlock);
        }
    }

    public DispatchCommandMountItem createDispatchCommandMountItemForInterop(int i11, int i12, String str, @Nullable ReadableArray readableArray) {
        try {
            return MountItemFactory.createDispatchCommandMountItem(i11, i12, Integer.parseInt(str), readableArray);
        } catch (NumberFormatException unused) {
            return MountItemFactory.createDispatchCommandMountItem(i11, i12, str, readableArray);
        }
    }

    @AnyThread
    @Deprecated
    public void dispatchCommand(int i11, int i12, int i13, @Nullable ReadableArray readableArray) {
        this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i11, i12, i13, readableArray));
    }

    @UiThread
    public ReadableMap getInspectorDataForInstance(int i11, View view) {
        UiThreadUtil.assertOnUiThread();
        return this.mBinding.getInspectorDataForInstance(this.mMountingManager.getEventEmitter(i11, view.getId()));
    }

    public void prependUIBlock(UIBlock uIBlock) {
        if (ReactNativeFeatureFlags.useFabricInterop()) {
            getInteropUIBlockListener().prependUIBlock(uIBlock);
        }
    }

    public void receiveEvent(int i11, int i12, String str, boolean z11, @Nullable WritableMap writableMap, int i13) {
        receiveEvent(i11, i12, str, z11, writableMap, i13, false);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i11) {
        UiThreadUtil.assertOnUiThread();
        SurfaceMountingManager surfaceManagerForView = this.mMountingManager.getSurfaceManagerForView(i11);
        if (surfaceManagerForView == null) {
            return null;
        }
        return surfaceManagerForView.getView(i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    @UiThread
    public void synchronouslyUpdateViewOnUIThread(final int i11, @NonNull final ReadableMap readableMap) {
        String string;
        UiThreadUtil.assertOnUiThread();
        int i12 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i12 + 1;
        MountItem mountItem = new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.2
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            /* JADX INFO: renamed from: getSurfaceId */
            public int get_surfaceId() {
                return -1;
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(@NonNull MountingManager mountingManager) {
                try {
                    mountingManager.updateProps(i11, readableMap);
                } catch (Exception unused) {
                }
            }

            @NonNull
            public String toString() {
                return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(i11), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
            }
        };
        if (!this.mMountingManager.getViewExists(i11)) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i12);
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            String str = TAG;
            Integer numValueOf = Integer.valueOf(i11);
            if (IS_DEVELOPMENT_ENVIRONMENT) {
                string = readableMap.toHashMap().toString();
            } else {
                string = "<hidden>";
            }
            C45999a.m101498d(str, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", numValueOf, string);
        }
        mountItem.execute(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i12);
    }

    @Override // com.facebook.react.bridge.UIManager
    @UiThread
    public void updateRootLayoutSpecs(int i11, int i12, int i13, int i14, int i15) {
        boolean z11;
        boolean zDoLeftAndRightSwapInRTL;
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            C45999a.m101497c(TAG, "Updating Root Layout Specs for [%d]", Integer.valueOf(i11));
        }
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i11);
        if (surfaceManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("Cannot updateRootLayoutSpecs on surfaceId that does not exist: " + i11));
            return;
        }
        ThemedReactContext context = surfaceManager.getContext();
        if (context != null) {
            boolean zIsRTL = I18nUtil.getInstance().isRTL(context);
            zDoLeftAndRightSwapInRTL = I18nUtil.getInstance().doLeftAndRightSwapInRTL(context);
            z11 = zIsRTL;
        } else {
            z11 = false;
            zDoLeftAndRightSwapInRTL = false;
        }
        this.mBinding.setConstraints(i11, LayoutMetricsConversions.getMinSize(i12), LayoutMetricsConversions.getMaxSize(i12), LayoutMetricsConversions.getMinSize(i13), LayoutMetricsConversions.getMaxSize(i13), i14, i15, z11, zDoLeftAndRightSwapInRTL);
    }

    @Override // com.facebook.react.uimanager.events.SynchronousEventReceiver
    public void receiveEvent(int i11, int i12, String str, boolean z11, @Nullable WritableMap writableMap, int i13, boolean z12) {
        if (ReactBuildConfig.DEBUG && i11 == -1) {
            C45999a.m101498d(TAG, "Emitted event without surfaceId: [%d] %s", Integer.valueOf(i12), str);
        }
        if (this.mDestroyed) {
            C45999a.m101507m(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        EventEmitterWrapper eventEmitter = this.mMountingManager.getEventEmitter(i11, i12);
        if (eventEmitter != null) {
            if (z12) {
                if (this.mSynchronousEvents.add(new SynchronousEvent(i11, i12, str))) {
                    eventEmitter.dispatchEventSynchronously(str, writableMap);
                    return;
                }
                return;
            } else if (z11) {
                eventEmitter.dispatchUnique(str, writableMap);
                return;
            } else {
                eventEmitter.dispatch(str, writableMap, i13);
                return;
            }
        }
        if (this.mMountingManager.getViewExists(i12)) {
            this.mMountingManager.enqueuePendingEvent(i11, i12, str, z11, writableMap, i13);
            return;
        }
        C45999a.m101496b(TAG, "Unable to invoke event: " + str + " for reactTag: " + i12);
    }

    @AnyThread
    public void dispatchCommand(int i11, int i12, String str, @Nullable ReadableArray readableArray) {
        if (ReactNativeFeatureFlags.useFabricInterop()) {
            this.mMountItemDispatcher.addViewCommandMountItem(createDispatchCommandMountItemForInterop(i11, i12, str, readableArray));
        } else {
            this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i11, i12, str, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @AnyThread
    public void stopSurface(int i11) {
        this.mMountingManager.stopSurface(i11);
        this.mBinding.stopSurface(i11);
    }

    public void startSurface(SurfaceHandler surfaceHandler, Context context, @Nullable View view) {
        int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        this.mMountingManager.startSurface(nextRootViewTag, new ThemedReactContext(this.mReactApplicationContext, context, surfaceHandler.getModuleName(), nextRootViewTag), view);
        if (surfaceHandler instanceof SurfaceHandlerBinding) {
            this.mBinding.startSurfaceWithSurfaceHandler(nextRootViewTag, (SurfaceHandlerBinding) surfaceHandler, view != null);
            return;
        }
        throw new IllegalArgumentException("Invalid SurfaceHandler");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }
}
