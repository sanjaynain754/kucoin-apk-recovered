package com.swmansion.reanimated.nativeProxy;

import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.BuildConfig;
import com.swmansion.reanimated.DevMenuUtils;
import com.swmansion.reanimated.NativeProxy;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.reanimated.Utils;
import com.swmansion.reanimated.keyboard.KeyboardAnimationManager;
import com.swmansion.reanimated.keyboard.KeyboardWorkletWrapper;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.sensor.ReanimatedSensorContainer;
import com.swmansion.reanimated.sensor.ReanimatedSensorType;
import com.swmansion.worklets.WorkletsModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p633t6.InterfaceC44695a;
import pb0.InterfaceC43431a;

/* JADX INFO: loaded from: classes59.dex */
public abstract class NativeProxyCommon {
    private final InterfaceC43431a gestureHandlerStateManager;
    private final KeyboardAnimationManager keyboardAnimationManager;
    protected final WeakReference<ReactApplicationContext> mContext;
    protected NodesManager mNodesManager;
    protected final WorkletsModule mWorkletsModule;
    private final ReanimatedSensorContainer reanimatedSensorContainer;
    private Long firstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean slowAnimationsEnabled = false;
    private final int ANIMATIONS_DRAG_FACTOR = 10;
    protected String cppVersion = null;

    public abstract HybridData getHybridData();

    public native void installJSIBindings();

    private void addDevMenuOption() {
        DevMenuUtils.addDevMenuOption(this.mContext.get(), new DevOptionHandler() { // from class: com.swmansion.reanimated.nativeProxy.a
            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
            public final void onOptionSelected() {
                this.f68426a.toggleSlowAnimations();
            }
        });
    }

    private Set<String> convertProps(ReadableNativeArray readableNativeArray) {
        HashSet hashSet = new HashSet();
        ArrayList<Object> arrayList = readableNativeArray.toArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            hashSet.add((String) arrayList.get(i11));
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleSlowAnimations() {
        boolean z11 = this.slowAnimationsEnabled;
        this.slowAnimationsEnabled = !z11;
        if (!z11) {
            this.firstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
        this.mNodesManager.enableSlowAnimations(this.slowAnimationsEnabled, 10);
    }

    public void checkCppVersion() {
        if (this.cppVersion == null) {
            throw new RuntimeException("[Reanimated] Java side failed to resolve C++ code version. See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#java-side-failed-to-resolve-c-code-version for more information.");
        }
        String reanimatedJavaVersion = getReanimatedJavaVersion();
        if (this.cppVersion.equals(reanimatedJavaVersion)) {
            return;
        }
        throw new RuntimeException("[Reanimated] Mismatch between Java code version and C++ code version (" + reanimatedJavaVersion + " vs. " + this.cppVersion + " respectively). See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#mismatch-between-java-code-version-and-c-code-version for more information.");
    }

    @InterfaceC44695a
    public void dispatchCommand(int i11, String str, ReadableArray readableArray) {
        this.mNodesManager.dispatchCommand(i11, str, readableArray);
    }

    @InterfaceC44695a
    public long getAnimationTimestamp() {
        return this.slowAnimationsEnabled ? this.firstUptime.longValue() + ((SystemClock.uptimeMillis() - this.firstUptime.longValue()) / 10) : SystemClock.uptimeMillis();
    }

    @InterfaceC44695a
    public boolean getIsReducedMotion() {
        String string = Settings.Global.getString(this.mContext.get().getContentResolver(), "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == 0.0f;
    }

    @InterfaceC44695a
    public String getReanimatedJavaVersion() {
        return BuildConfig.REANIMATED_VERSION_JAVA;
    }

    @InterfaceC44695a
    public void maybeFlushUIUpdatesQueue() {
        if (this.mNodesManager.isAnimationRunning()) {
            return;
        }
        this.mNodesManager.performOperations();
    }

    @InterfaceC44695a
    public float[] measure(int i11) {
        return this.mNodesManager.measure(i11);
    }

    @InterfaceC44695a
    public String obtainProp(int i11, String str) {
        return this.mNodesManager.obtainProp(i11, str);
    }

    public void prepareLayoutAnimations(LayoutAnimations layoutAnimations) {
        if (Utils.isChromeDebugger) {
            Log.w("[REANIMATED]", "You can not use LayoutAnimation with enabled Chrome Debugger");
            return;
        }
        ReanimatedModule reanimatedModule = (ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule);
        this.mNodesManager = reanimatedModule.getNodesManager();
        ReanimatedModule reanimatedModule2 = (ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule2);
        reanimatedModule2.getNodesManager().getAnimationsManager().setNativeMethods(NativeProxy.createNativeMethodsHolder(layoutAnimations));
    }

    @InterfaceC44695a
    public void registerEventHandler(EventHandler eventHandler) {
        eventHandler.mCustomEventNamesResolver = this.mNodesManager.getEventNameResolver();
        this.mNodesManager.registerEventHandler(eventHandler);
    }

    @InterfaceC44695a
    public int registerSensor(int i11, int i12, SensorSetter sensorSetter) {
        return this.reanimatedSensorContainer.registerSensor(ReanimatedSensorType.getInstanceById(i11), i12, sensorSetter);
    }

    @InterfaceC44695a
    public void requestRender(AnimationFrameCallback animationFrameCallback) {
        this.mNodesManager.postOnAnimation(animationFrameCallback);
    }

    @InterfaceC44695a
    public void scrollTo(int i11, double d11, double d12, boolean z11) {
        this.mNodesManager.scrollTo(i11, d11, d12, z11);
    }

    @InterfaceC44695a
    public void setCppVersion(String str) {
        this.cppVersion = str;
    }

    @InterfaceC44695a
    public void setGestureState(int i11, int i12) {
        InterfaceC43431a interfaceC43431a = this.gestureHandlerStateManager;
        if (interfaceC43431a != null) {
            interfaceC43431a.setGestureHandlerState(i11, i12);
        }
    }

    @InterfaceC44695a
    public int subscribeForKeyboardEvents(KeyboardWorkletWrapper keyboardWorkletWrapper, boolean z11, boolean z12) {
        return this.keyboardAnimationManager.subscribeForKeyboardUpdates(keyboardWorkletWrapper, z11, z12);
    }

    @InterfaceC44695a
    public void unregisterSensor(int i11) {
        this.reanimatedSensorContainer.unregisterSensor(i11);
    }

    @InterfaceC44695a
    public void unsubscribeFromKeyboardEvents(int i11) {
        this.keyboardAnimationManager.unsubscribeFromKeyboardUpdates(i11);
    }

    @InterfaceC44695a
    public void updateProps(int i11, Map<String, Object> map) {
        this.mNodesManager.updateProps(i11, map);
    }

    static {
        SoLoader.loadLibrary("reanimated");
    }

    public NativeProxyCommon(ReactApplicationContext reactApplicationContext) {
        InterfaceC43431a interfaceC43431a = null;
        ReanimatedModule reanimatedModule = (ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule);
        this.mWorkletsModule = reanimatedModule.getWorkletsModule();
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.mContext = weakReference;
        this.reanimatedSensorContainer = new ReanimatedSensorContainer(weakReference);
        this.keyboardAnimationManager = new KeyboardAnimationManager(weakReference);
        addDevMenuOption();
        try {
            RNGestureHandlerModule.Companion companion = RNGestureHandlerModule.INSTANCE;
            interfaceC43431a = (InterfaceC43431a) reactApplicationContext.getNativeModule(RNGestureHandlerModule.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
        }
        this.gestureHandlerStateManager = interfaceC43431a;
    }

    @InterfaceC44695a
    public void configureProps(ReadableNativeArray readableNativeArray, ReadableNativeArray readableNativeArray2) {
        this.mNodesManager.configureProps(convertProps(readableNativeArray), convertProps(readableNativeArray2));
    }
}
