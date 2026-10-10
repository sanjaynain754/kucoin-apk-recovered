package com.swmansion.reanimated;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.GuardedFrameCallback;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.layoutReanimation.AnimationsManager;
import com.swmansion.reanimated.nativeProxy.NoopEventHandler;
import com.swmansion.worklets.WorkletsModule;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes59.dex */
public class NodesManager implements EventDispatcherListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ReaCompatibility compatibility;
    private double lastFrameTimeMs;
    private final AnimationsManager mAnimationManager;
    private int mAnimationsDragFactor;
    private final GuardedFrameCallback mChoreographerCallback;
    private final ReactContext mContext;
    protected final UIManagerModule.CustomEventNamesResolver mCustomEventNamesResolver;
    private final DeviceEventManagerModule.RCTDeviceEventEmitter mEventEmitter;
    private NativeProxy mNativeProxy;
    private Queue<NativeUpdateOperation> mOperationsInBatch;
    private final ReactChoreographer mReactChoreographer;
    private boolean mTryRunBatchUpdatesSynchronously;
    private final UIImplementation mUIImplementation;
    private final UIManager mUIManager;
    private Runnable mUnsubscribe;
    private final WorkletsModule mWorkletsModule;
    public Set<String> nativeProps;
    public Set<String> uiProps;
    private Long mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean mSlowAnimationsEnabled = false;
    private final AtomicBoolean mCallbackPosted = new AtomicBoolean();
    private RCTEventEmitter mCustomEventHandler = new NoopEventHandler();
    private List<OnAnimationFrame> mFrameCallbacks = new ArrayList();
    private ConcurrentLinkedQueue<CopiedEvent> mEventQueue = new ConcurrentLinkedQueue<>();

    public final class NativeUpdateOperation {
        public WritableMap mNativeProps;
        public int mViewTag;

        public NativeUpdateOperation(int i11, WritableMap writableMap) {
            this.mViewTag = i11;
            this.mNativeProps = writableMap;
        }
    }

    public interface OnAnimationFrame {
        void onAnimationFrame(double d11);
    }

    private void handleEvent(Event event) {
        event.dispatch(this.mCustomEventHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAnimationFrame(long j11) {
        double dLongValue = j11 / 1000000.0d;
        if (this.mSlowAnimationsEnabled) {
            dLongValue = ((dLongValue - this.mFirstUptime.longValue()) / ((double) this.mAnimationsDragFactor)) + this.mFirstUptime.longValue();
        }
        if (dLongValue > this.lastFrameTimeMs) {
            this.lastFrameTimeMs = dLongValue;
            while (!this.mEventQueue.isEmpty()) {
                CopiedEvent copiedEventPoll = this.mEventQueue.poll();
                handleEvent(copiedEventPoll.getTargetTag(), copiedEventPoll.getEventName(), copiedEventPoll.getPayload());
            }
            if (!this.mFrameCallbacks.isEmpty()) {
                List<OnAnimationFrame> list = this.mFrameCallbacks;
                this.mFrameCallbacks = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).onAnimationFrame(dLongValue);
                }
            }
            performOperations();
        }
        this.mCallbackPosted.set(false);
        if (this.mFrameCallbacks.isEmpty() && this.mEventQueue.isEmpty()) {
            return;
        }
        startUpdatingOnAnimationFrame();
    }

    public String obtainProp(int i11, String str) {
        try {
            View viewResolveView = this.mUIManager.resolveView(i11);
            str.getClass();
            switch (str) {
                case "opacity":
                    return Float.toString(viewResolveView.getAlpha());
                case "height":
                    return Float.toString(PixelUtil.toDIPFromPixel(viewResolveView.getHeight()));
                case "zIndex":
                    return Float.toString(viewResolveView.getElevation());
                case "top":
                    return Float.toString(PixelUtil.toDIPFromPixel(viewResolveView.getTop()));
                case "left":
                    return Float.toString(PixelUtil.toDIPFromPixel(viewResolveView.getLeft()));
                case "width":
                    return Float.toString(PixelUtil.toDIPFromPixel(viewResolveView.getWidth()));
                case "backgroundColor":
                    Drawable background = viewResolveView.getBackground();
                    try {
                        String str2 = String.format("%08x", Integer.valueOf(((Integer) background.getClass().getMethod("getColor", new Class[0]).invoke(background, new Object[0])).intValue()));
                        return RunnableC33958ua.f72251f + str2.substring(2, 8) + str2.substring(0, 2);
                    } catch (Exception unused) {
                        return "Unable to resolve background color";
                    }
                default:
                    throw new IllegalArgumentException("[Reanimated] Attempted to get unsupported property " + str + " with function `getViewProp`");
            }
        } catch (Exception unused2) {
            return "[Reanimated] Unable to resolve view";
        }
    }

    /* JADX INFO: renamed from: com.swmansion.reanimated.NodesManager$4 */
    public static /* synthetic */ class C334444 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof ReadableArray) {
            if (obj instanceof WritableArray) {
                writableMap.putArray(str, (ReadableArray) obj);
                return;
            } else {
                writableMap.putArray(str, copyReadableArray((ReadableArray) obj));
                return;
            }
        }
        if (!(obj instanceof ReadableMap)) {
            throw new IllegalStateException("[Reanimated] Unknown type of animated value.");
        }
        if (obj instanceof WritableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
        } else {
            writableMap.putMap(str, copyReadableMap((ReadableMap) obj));
        }
    }

    private void handleEvent(int i11, String str, WritableMap writableMap) {
        this.mCustomEventHandler.receiveEvent(i11, str, writableMap);
    }

    private void stopUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(false)) {
            this.mReactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
        }
    }

    public void configureProps(Set<String> set, Set<String> set2) {
        this.uiProps = set;
        this.nativeProps = set2;
    }

    public void dispatchCommand(final int i11, final String str, final ReadableArray readableArray) {
        ReactContext reactContext = this.mContext;
        reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext.getExceptionHandler()) { // from class: com.swmansion.reanimated.NodesManager.1
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                NodesManager.this.mUIManager.dispatchCommand(i11, str, readableArray);
            }
        });
    }

    public void enableSlowAnimations(boolean z11, int i11) {
        this.mSlowAnimationsEnabled = z11;
        this.mAnimationsDragFactor = i11;
        if (z11) {
            this.mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public void enqueueUpdateViewOnNativeThread(int i11, WritableMap writableMap, boolean z11) {
        if (z11) {
            this.mTryRunBatchUpdatesSynchronously = true;
        }
        this.mOperationsInBatch.add(new NativeUpdateOperation(i11, writableMap));
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationManager;
    }

    public UIManagerModule.CustomEventNamesResolver getEventNameResolver() {
        return this.mCustomEventNamesResolver;
    }

    public NativeProxy getNativeProxy() {
        return this.mNativeProxy;
    }

    public void initWithContext(ReactApplicationContext reactApplicationContext) {
        this.mNativeProxy = new NativeProxy(reactApplicationContext, this.mWorkletsModule);
        this.mAnimationManager.setAndroidUIScheduler(this.mWorkletsModule.getAndroidUIScheduler());
        ReaCompatibility reaCompatibility = new ReaCompatibility(reactApplicationContext);
        this.compatibility = reaCompatibility;
        reaCompatibility.registerFabricEventListener(this);
    }

    public void invalidate() {
        AnimationsManager animationsManager = this.mAnimationManager;
        if (animationsManager != null) {
            animationsManager.invalidate();
        }
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.invalidate();
            this.mNativeProxy = null;
        }
        ReaCompatibility reaCompatibility = this.compatibility;
        if (reaCompatibility != null) {
            reaCompatibility.unregisterFabricEventListener(this);
        }
        Runnable runnable = this.mUnsubscribe;
        if (runnable != null) {
            runnable.run();
            this.mUnsubscribe = null;
        }
    }

    public boolean isAnimationRunning() {
        return this.mCallbackPosted.get();
    }

    public float[] measure(int i11) {
        try {
            return NativeMethodsHelper.measure(this.mUIManager.resolveView(i11));
        } catch (IllegalViewOperationException e11) {
            e11.printStackTrace();
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public void onEventDispatch(Event event) {
        if (this.mNativeProxy == null) {
            return;
        }
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(event);
            performOperations();
            return;
        }
        if (this.mNativeProxy.isAnyHandlerWaitingForEvent(this.mCustomEventNamesResolver.resolveCustomEventName(event.getEventName()), event.getViewTag())) {
            this.mEventQueue.offer(new CopiedEvent(event));
        }
        startUpdatingOnAnimationFrame();
    }

    public void onHostPause() {
        if (this.mCallbackPosted.get()) {
            stopUpdatingOnAnimationFrame();
            this.mCallbackPosted.set(true);
        }
    }

    public void onHostResume() {
        if (this.mCallbackPosted.getAndSet(false)) {
            startUpdatingOnAnimationFrame();
        }
    }

    public void performOperations() {
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.performOperations();
        }
    }

    public void postOnAnimation(OnAnimationFrame onAnimationFrame) {
        this.mFrameCallbacks.add(onAnimationFrame);
        startUpdatingOnAnimationFrame();
    }

    public void registerEventHandler(RCTEventEmitter rCTEventEmitter) {
        this.mCustomEventHandler = rCTEventEmitter;
    }

    public void scrollTo(int i11, double d11, double d12, boolean z11) {
        try {
            NativeMethodsHelper.scrollTo(this.mUIManager.resolveView(i11), d11, d12, z11);
        } catch (IllegalViewOperationException e11) {
            e11.printStackTrace();
        }
    }

    public void sendEvent(String str, WritableMap writableMap) {
        this.mEventEmitter.emit(str, writableMap);
    }

    public void startUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(true)) {
            return;
        }
        this.mReactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
    }

    public void updateProps(int i11, Map<String, Object> map) {
        try {
            if (this.mUIManager.resolveView(i11) == null) {
                return;
            }
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (this.uiProps.contains(key)) {
                    addProp(javaOnlyMap, key, value);
                    z11 = true;
                } else if (this.nativeProps.contains(key)) {
                    addProp(writableMapCreateMap2, key, value);
                    z12 = true;
                } else {
                    addProp(writableMapCreateMap, key, value);
                    z13 = true;
                }
            }
            if (i11 != -1) {
                if (z11) {
                    this.mUIImplementation.synchronouslyUpdateViewOnUIThread(i11, new ReactStylesDiffMap(javaOnlyMap));
                }
                if (z12) {
                    enqueueUpdateViewOnNativeThread(i11, writableMapCreateMap2, true);
                }
                if (z13) {
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putInt("viewTag", i11);
                    writableMapCreateMap3.putMap("props", writableMapCreateMap);
                    sendEvent("onReanimatedPropsChange", writableMapCreateMap3);
                }
            }
        } catch (IllegalViewOperationException unused) {
        }
    }

    public NodesManager(ReactContext reactContext, WorkletsModule workletsModule) {
        Set<String> set = Collections.EMPTY_SET;
        this.uiProps = set;
        this.nativeProps = set;
        this.mUnsubscribe = null;
        this.mOperationsInBatch = new LinkedList();
        this.mTryRunBatchUpdatesSynchronously = false;
        this.mContext = reactContext;
        this.mWorkletsModule = workletsModule;
        final UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
        this.mUIManager = uIManager;
        this.mUIImplementation = uIManager instanceof UIManagerModule ? ((UIManagerModule) uIManager).getUIImplementation() : null;
        Objects.requireNonNull(uIManager);
        this.mCustomEventNamesResolver = new UIManagerModule.CustomEventNamesResolver() { // from class: com.swmansion.reanimated.c
            @Override // com.facebook.react.uimanager.UIManagerModule.CustomEventNamesResolver
            public final String resolveCustomEventName(String str) {
                return uIManager.resolveCustomDirectEventName(str);
            }
        };
        this.mEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.mReactChoreographer = ReactChoreographer.getInstance();
        this.mChoreographerCallback = new GuardedFrameCallback(reactContext) { // from class: com.swmansion.reanimated.NodesManager.2
            @Override // com.facebook.react.uimanager.GuardedFrameCallback
            public void doFrameGuarded(long j11) {
                NodesManager.this.onAnimationFrame(j11);
            }
        };
        this.mAnimationManager = new AnimationsManager(reactContext, uIManager);
    }

    private static WritableArray copyReadableArray(ReadableArray readableArray) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            switch (C334444.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i11).ordinal()]) {
                case 1:
                    writableArrayCreateArray.pushBoolean(readableArray.getBoolean(i11));
                    break;
                case 2:
                    writableArrayCreateArray.pushString(readableArray.getString(i11));
                    break;
                case 3:
                    writableArrayCreateArray.pushNull();
                    break;
                case 4:
                    writableArrayCreateArray.pushDouble(readableArray.getDouble(i11));
                    break;
                case 5:
                    writableArrayCreateArray.pushMap(copyReadableMap(readableArray.getMap(i11)));
                    break;
                case 6:
                    writableArrayCreateArray.pushArray(copyReadableArray(readableArray.getArray(i11)));
                    break;
                default:
                    throw new IllegalStateException("[Reanimated] Unknown type of ReadableArray.");
            }
        }
        return writableArrayCreateArray;
    }

    private static WritableMap copyReadableMap(ReadableMap readableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.merge(readableMap);
        return writableMapCreateMap;
    }

    private /* synthetic */ void lambda$new$0(EventDispatcher eventDispatcher) {
        eventDispatcher.removeListener(this);
    }
}
