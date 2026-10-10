package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherImpl;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p053c7.C4858a;
import p300h4.C38107c;
import p331i4.C38438a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = UIManagerModule.NAME)
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = C38107c.m86037a().mo86035b(C38438a.UI_MANAGER);
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private final List<UIManagerModuleListener> mListeners;
    private final MemoryTrimCallback mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final UIImplementation mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private final ViewManagerRegistry mViewManagerRegistry;

    public interface CustomEventNamesResolver {
        @Nullable
        String resolveCustomEventName(String str);
    }

    public static class MemoryTrimCallback implements ComponentCallbacks2 {
        private MemoryTrimCallback() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i11) {
            if (i11 >= 60) {
                YogaNodePool.get().clear();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, int i11) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new MemoryTrimCallback();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        EventDispatcherImpl eventDispatcherImpl = new EventDispatcherImpl(reactApplicationContext);
        this.mEventDispatcher = eventDispatcherImpl;
        this.mModuleConstants = createConstants(viewManagerResolver);
        this.mCustomDirectEvents = UIManagerModuleConstants.getDirectEventTypeConstants();
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(viewManagerResolver);
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mUIImplementation = new UIImplementation(reactApplicationContext, viewManagerRegistry, eventDispatcherImpl, i11);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(ViewManagerResolver viewManagerResolver) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C4858a.m4990a(0L, "CreateUIManagerConstants").mo4993b("Lazy", Boolean.TRUE).mo4994c();
        try {
            return UIManagerModuleConstantsHelper.createConstants(viewManagerResolver);
        } finally {
            Systrace.m10667i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t11) {
        return addRootView(t11, null);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i11, int i12, @Nullable ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i11, i12, readableArray);
    }

    @Nullable
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager viewManagerResolveViewManager = this.mUIImplementation.resolveViewManager(str);
        if (viewManagerResolveViewManager == null) {
            return null;
        }
        return getConstantsForViewManager(viewManagerResolveViewManager, this.mCustomDirectEvents);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, String str, @Nullable WritableMap writableMap) {
        receiveEvent(-1, i11, str, writableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t11, WritableMap writableMap) {
        Systrace.m10662c(0L, "UIManagerModule.addRootView");
        int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        this.mUIImplementation.registerRootView(t11, nextRootViewTag, new ThemedReactContext(getReactApplicationContext(), t11.getContext(), ((ReactRoot) t11).getSurfaceID(), -1));
        Systrace.m10667i(0L);
        return nextRootViewTag;
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.addUIBlock(uIBlock);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.add(uIManagerModuleListener);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.clearJSResponder();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.configureNextLayoutAnimation(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i11, String str, int i12, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i11 + ", class: " + str + ", props: " + readableMap;
            C45999a.m101496b(ReactConstants.TAG, str2);
            C38107c.m86037a().mo86034a(C38438a.UI_MANAGER, str2);
        }
        this.mUIImplementation.createView(i11, str, i12, readableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i11, String str, @Nullable ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i11, str, readableArray);
    }

    @ReactMethod
    public void findSubviewIn(int i11, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.findSubviewIn(i11, Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(0))), Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @Deprecated
    public CustomEventNamesResolver getDirectEventNamesResolver() {
        return new CustomEventNamesResolver() { // from class: com.facebook.react.uimanager.UIManagerModule.1
            @Override // com.facebook.react.uimanager.UIManagerModule.CustomEventNamesResolver
            @Nullable
            public String resolveCustomEventName(@Nullable String str) {
                return UIManagerModule.this.resolveCustomDirectEventName(str);
            }
        };
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.getProfiledBatchPerfCounters();
    }

    @Deprecated
    public UIImplementation getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public ViewManagerRegistry getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    public void invalidateNodeLayout(int i11) {
        ReactShadowNode reactShadowNodeResolveShadowNode = this.mUIImplementation.resolveShadowNode(i11);
        if (reactShadowNodeResolveShadowNode != null) {
            reactShadowNodeResolveShadowNode.dirty();
            this.mUIImplementation.dispatchViewUpdates(-1);
        } else {
            C45999a.m101488I(ReactConstants.TAG, "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i11);
        }
    }

    @ReactMethod
    public void manageChildren(int i11, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i11 + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            C45999a.m101496b(ReactConstants.TAG, str);
            C38107c.m86037a().mo86034a(C38438a.UI_MANAGER, str);
        }
        this.mUIImplementation.manageChildren(i11, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i11, Callback callback) {
        this.mUIImplementation.measure(i11, callback);
    }

    @ReactMethod
    public void measureInWindow(int i11, Callback callback) {
        this.mUIImplementation.measureInWindow(i11, callback);
    }

    @ReactMethod
    public void measureLayout(int i11, int i12, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayout(i11, i12, callback, callback2);
    }

    public void onBatchComplete() {
        int i11 = this.mBatchId;
        this.mBatchId = i11 + 1;
        C4858a.m4990a(0L, "onBatchCompleteUI").mo4992a("BatchId", i11).mo4994c();
        Iterator<UIManagerModuleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        Iterator<UIManagerListener> it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mUIImplementation.getRootViewNum() > 0) {
                this.mUIImplementation.dispatchViewUpdates(i11);
            }
        } finally {
            Systrace.m10667i(0L);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.onHostDestroy();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.onHostPause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.onHostResume();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.prependUIBlock(uIBlock);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.profileNextBatch();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, int i12, String str, @Nullable WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i12, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i11) {
        this.mUIImplementation.removeRootView(i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.remove(uIManagerModuleListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Nullable
    @Deprecated
    public String resolveCustomDirectEventName(@Nullable String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @ReactMethod
    public void setChildren(int i11, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i11 + ", children: " + readableArray;
            C45999a.m101496b(ReactConstants.TAG, str);
            C38107c.m86037a().mo86034a(C38438a.UI_MANAGER, str);
        }
        this.mUIImplementation.setChildren(i11, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i11, boolean z11) {
        this.mUIImplementation.setJSResponder(i11, z11);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z11) {
        this.mUIImplementation.setLayoutAnimationEnabledExperimental(z11);
    }

    public void setViewHierarchyUpdateDebugListener(@Nullable NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mUIImplementation.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t11, String str, WritableMap writableMap, int i11, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i11, ReadableMap readableMap) {
        this.mUIImplementation.synchronouslyUpdateViewOnUIThread(i11, new ReactStylesDiffMap(readableMap));
    }

    @ReactMethod
    public void updateView(int i11, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i11 + ", class: " + str + ", props: " + readableMap;
            C45999a.m101496b(ReactConstants.TAG, str2);
            C38107c.m86037a().mo86034a(C38438a.UI_MANAGER, str2);
        }
        this.mUIImplementation.updateView(i11, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i11, int i12, Callback callback) {
        this.mUIImplementation.viewIsDescendantOf(i11, i12, callback);
    }

    @Nullable
    public static WritableMap getConstantsForViewManager(ViewManager viewManager, Map<String, Object> map) {
        C4858a.m4990a(0L, "UIManagerModule.getConstantsForViewManager").mo4993b("ViewManager", viewManager.getName()).mo4993b("Lazy", Boolean.TRUE).mo4994c();
        try {
            Map<String, Object> mapCreateConstantsForViewManager = UIManagerModuleConstantsHelper.createConstantsForViewManager(viewManager, null, null, null, map);
            if (mapCreateConstantsForViewManager != null) {
                return Arguments.makeNativeMap(mapCreateConstantsForViewManager);
            }
            return null;
        } finally {
            C4858a.m4991b(0L).mo4994c();
        }
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i11, Dynamic dynamic, @Nullable ReadableArray readableArray) {
        UIManager uIManager = UIManagerHelper.getUIManager(getReactApplicationContext(), ViewUtil.getUIManagerType(i11));
        if (uIManager != null) {
            if (dynamic.getType() == ReadableType.Number) {
                uIManager.dispatchCommand(i11, dynamic.asInt(), readableArray);
            } else if (dynamic.getType() == ReadableType.String) {
                uIManager.dispatchCommand(i11, dynamic.asString(), readableArray);
            }
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(UIManagerModuleConstantsHelper.getDefaultExportableEventTypes());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
        this.mEventDispatcher.registerEventEmitter(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mEventDispatcher.onCatalystInstanceDestroyed();
        this.mUIImplementation.onCatalystInstanceDestroyed();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        YogaNodePool.get().clear();
        ViewManagerPropertyUpdater.clear();
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i11) {
        if (ViewUtil.isRootTag(i11)) {
            return i11;
        }
        return this.mUIImplementation.resolveRootTagFromReactTag(i11);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i11) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.getUIViewOperationQueue().getNativeViewHierarchyManager().resolveView(i11);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i11, int i12) {
        int uIManagerType = ViewUtil.getUIManagerType(i11);
        if (uIManagerType == 2) {
            UIManager uIManager = UIManagerHelper.getUIManager(getReactApplicationContext(), uIManagerType);
            if (uIManager != null) {
                uIManager.sendAccessibilityEvent(i11, i12);
                return;
            }
            return;
        }
        this.mUIImplementation.sendAccessibilityEvent(i11, i12);
    }

    public void setViewLocalData(final int i11, final Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.2
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule.this.mUIImplementation.setViewLocalData(i11, obj);
            }
        });
    }

    public void updateInsetsPadding(int i11, int i12, int i13, int i14, int i15) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.updateInsetsPadding(i11, i12, i13, i14, i15);
    }

    public void updateNodeSize(int i11, int i12, int i13) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.updateNodeSize(i11, i12, i13);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(final int i11, final int i12, final int i13, int i14, int i15) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.3
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule.this.mUIImplementation.updateRootView(i11, i12, i13);
                UIManagerModule.this.mUIImplementation.dispatchViewUpdates(-1);
            }
        });
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C4858a.m4990a(0L, "CreateUIManagerConstants").mo4993b("Lazy", Boolean.FALSE).mo4994c();
        try {
            return UIManagerModuleConstantsHelper.createConstants(list, map, map2);
        } finally {
            Systrace.m10667i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i11) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new MemoryTrimCallback();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        EventDispatcherImpl eventDispatcherImpl = new EventDispatcherImpl(reactApplicationContext);
        this.mEventDispatcher = eventDispatcherImpl;
        HashMap mapNewHashMap = MapBuilder.newHashMap();
        this.mCustomDirectEvents = mapNewHashMap;
        this.mModuleConstants = createConstants(list, null, mapNewHashMap);
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(list);
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mUIImplementation = new UIImplementation(reactApplicationContext, viewManagerRegistry, eventDispatcherImpl, i11);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i11, int i12) {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i11, int i12) {
    }
}
