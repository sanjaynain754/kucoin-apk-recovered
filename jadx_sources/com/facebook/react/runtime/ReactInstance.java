package com.facebook.react.runtime;

import android.content.res.AssetManager;
import android.view.ViewGroup;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.jni.HybridData;
import com.facebook.react.DebugCorePackage;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.FabricUIManagerBinding;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.internal.AndroidChoreographerProvider;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.ComponentNameResolver;
import com.facebook.react.uimanager.ComponentNameResolverBinding;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIManagerModuleConstantsHelper;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewManagerResolver;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p302h6.C38115a;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
final class ReactInstance {
    private static final String TAG = "ReactInstance";
    private static volatile boolean sIsLibraryLoaded;
    private final BridgelessReactContext mBridgelessReactContext;
    private final FabricUIManager mFabricUIManager;

    @InterfaceC44695a
    private final HybridData mHybridData;
    private final JavaScriptContextHolder mJavaScriptContextHolder;
    private final JavaTimerManager mJavaTimerManager;
    private final ReactQueueConfiguration mQueueConfiguration;
    private final TurboModuleManager mTurboModuleManager;
    private final BridgelessViewManagerResolver mViewManagerResolver;

    public static class BridgelessViewManagerResolver implements ViewManagerResolver {
        private final BridgelessReactContext mBridgelessReactContext;
        private final List<ReactPackage> mReactPackages;
        private final Map<String, ViewManager> mLazyViewManagerMap = new HashMap();
        private Map<String, ViewManager> mEagerViewManagerMap = null;

        public synchronized Map<String, ViewManager> getEagerViewManagerMap() {
            try {
                Map<String, ViewManager> map = this.mEagerViewManagerMap;
                if (map != null) {
                    return map;
                }
                HashMap map2 = new HashMap();
                for (ReactPackage reactPackage : this.mReactPackages) {
                    if (!(reactPackage instanceof ViewManagerOnDemandReactPackage)) {
                        for (ViewManager viewManager : reactPackage.createViewManagers(this.mBridgelessReactContext)) {
                            map2.put(viewManager.getName(), viewManager);
                        }
                    }
                }
                this.mEagerViewManagerMap = map2;
                return map2;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized Collection<String> getLazyViewManagerNames() {
            HashSet hashSet;
            Collection<String> viewManagerNames;
            hashSet = new HashSet();
            for (ReactPackage reactPackage : this.mReactPackages) {
                if ((reactPackage instanceof ViewManagerOnDemandReactPackage) && (viewManagerNames = ((ViewManagerOnDemandReactPackage) reactPackage).getViewManagerNames(this.mBridgelessReactContext)) != null) {
                    hashSet.addAll(viewManagerNames);
                }
            }
            return hashSet;
        }

        @Override // com.facebook.react.uimanager.ViewManagerResolver
        public synchronized ViewManager getViewManager(String str) {
            ViewManager lazyViewManager = getLazyViewManager(str);
            if (lazyViewManager != null) {
                return lazyViewManager;
            }
            return getEagerViewManagerMap().get(str);
        }

        @Override // com.facebook.react.uimanager.ViewManagerResolver
        public synchronized Collection<String> getViewManagerNames() {
            HashSet hashSet;
            hashSet = new HashSet();
            hashSet.addAll(getLazyViewManagerNames());
            hashSet.addAll(getEagerViewManagerMap().keySet());
            return hashSet;
        }

        private ViewManager getLazyViewManager(String str) {
            ViewManager viewManagerCreateViewManager;
            if (this.mLazyViewManagerMap.containsKey(str)) {
                return this.mLazyViewManagerMap.get(str);
            }
            for (ReactPackage reactPackage : this.mReactPackages) {
                if ((reactPackage instanceof ViewManagerOnDemandReactPackage) && (viewManagerCreateViewManager = ((ViewManagerOnDemandReactPackage) reactPackage).createViewManager(this.mBridgelessReactContext, str)) != null) {
                    this.mLazyViewManagerMap.put(str, viewManagerCreateViewManager);
                    return viewManagerCreateViewManager;
                }
            }
            return null;
        }

        public BridgelessViewManagerResolver(List<ReactPackage> list, BridgelessReactContext bridgelessReactContext) {
            this.mReactPackages = list;
            this.mBridgelessReactContext = bridgelessReactContext;
        }
    }

    public class ReactJsExceptionHandlerImpl implements ReactJsExceptionHandler {
        private final QueueThreadExceptionHandler mQueueThreadExceptionHandler;

        public ReactJsExceptionHandlerImpl(QueueThreadExceptionHandler queueThreadExceptionHandler) {
            this.mQueueThreadExceptionHandler = queueThreadExceptionHandler;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler
        public void reportJsException(ReactJsExceptionHandler.ParsedError parsedError) {
            try {
                ((NativeExceptionsManagerSpec) C38115a.m86047c(ReactInstance.this.mTurboModuleManager.getModule(NativeExceptionsManagerSpec.NAME))).reportException(StackTraceHelper.convertParsedError(parsedError));
            } catch (Exception e11) {
                this.mQueueThreadExceptionHandler.handleException(e11);
            }
        }
    }

    @InterfaceC44695a
    private static native JSTimerExecutor createJSTimerExecutor();

    private native long getJavaScriptContext();

    private native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    private native RuntimeScheduler getRuntimeScheduler();

    private native RuntimeExecutor getUnbufferedRuntimeExecutor();

    private native void handleMemoryPressureJs(int i11);

    @InterfaceC44695a
    private native HybridData initHybrid(JSRuntimeFactory jSRuntimeFactory, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, JavaTimerManager javaTimerManager, JSTimerExecutor jSTimerExecutor, ReactJsExceptionHandler reactJsExceptionHandler, BindingsInstaller bindingsInstaller, boolean z11, ReactHostInspectorTarget reactHostInspectorTarget);

    @InterfaceC44695a
    private native void installGlobals(boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void loadJSBundleFromAssets(AssetManager assetManager, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void loadJSBundleFromFile(String str, String str2);

    private native void registerSegmentNative(int i11, String str);

    public native void callFunctionOnModule(String str, String str2, NativeArray nativeArray);

    public native RuntimeExecutor getBufferedRuntimeExecutor();

    public native CallInvokerHolderImpl getJSCallInvokerHolder();

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return (T) getNativeModule(reactModule.name());
        }
        return null;
    }

    public native void unregisterFromInspector();

    public ReactInstance(BridgelessReactContext bridgelessReactContext, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, DevSupportManager devSupportManager, QueueThreadExceptionHandler queueThreadExceptionHandler, boolean z11, ReactHostInspectorTarget reactHostInspectorTarget) {
        this.mBridgelessReactContext = bridgelessReactContext;
        Systrace.m10662c(0L, "ReactInstance.initialize");
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.create(new ReactQueueConfigurationSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("v_native"), MessageQueueThreadSpec.newBackgroundThreadSpec("v_js")), queueThreadExceptionHandler);
        this.mQueueConfiguration = reactQueueConfigurationImplCreate;
        C45999a.m101496b(TAG, "Calling initializeMessageQueueThreads()");
        bridgelessReactContext.initializeMessageQueueThreads(reactQueueConfigurationImplCreate);
        MessageQueueThread jSQueueThread = reactQueueConfigurationImplCreate.getJSQueueThread();
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImplCreate.getNativeModulesQueueThread();
        ReactChoreographer.initialize(AndroidChoreographerProvider.getInstance());
        if (z11) {
            devSupportManager.startInspector();
        }
        JSTimerExecutor jSTimerExecutorCreateJSTimerExecutor = createJSTimerExecutor();
        JavaTimerManager javaTimerManager = new JavaTimerManager(bridgelessReactContext, jSTimerExecutorCreateJSTimerExecutor, ReactChoreographer.getInstance(), devSupportManager);
        this.mJavaTimerManager = javaTimerManager;
        this.mHybridData = initHybrid(reactHostDelegate.getJsRuntimeFactory(), jSQueueThread, nativeModulesQueueThread, javaTimerManager, jSTimerExecutorCreateJSTimerExecutor, new ReactJsExceptionHandlerImpl(queueThreadExceptionHandler), reactHostDelegate.getBindingsInstaller(), Systrace.m10668j(0L), reactHostInspectorTarget);
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
        Systrace.m10662c(0L, "ReactInstance.initialize#initTurboModules");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreReactPackage(bridgelessReactContext.getDevSupportManager(), bridgelessReactContext.getDefaultHardwareBackBtnHandler()));
        if (z11) {
            arrayList.add(new DebugCorePackage());
        }
        arrayList.addAll(reactHostDelegate.getReactPackages());
        ReactPackageTurboModuleManagerDelegate reactPackageTurboModuleManagerDelegateBuild = reactHostDelegate.getTurboModuleManagerDelegateBuilder().setPackages(arrayList).setReactApplicationContext(bridgelessReactContext).build();
        RuntimeExecutor unbufferedRuntimeExecutor = getUnbufferedRuntimeExecutor();
        this.mTurboModuleManager = new TurboModuleManager(unbufferedRuntimeExecutor, reactPackageTurboModuleManagerDelegateBuild, getJSCallInvokerHolder(), getNativeMethodCallInvokerHolder());
        Systrace.m10667i(0L);
        Systrace.m10662c(0L, "ReactInstance.initialize#initFabric");
        BridgelessViewManagerResolver bridgelessViewManagerResolver = new BridgelessViewManagerResolver(arrayList, bridgelessReactContext);
        this.mViewManagerResolver = bridgelessViewManagerResolver;
        ComponentNameResolverBinding.install(unbufferedRuntimeExecutor, new ComponentNameResolver() { // from class: com.facebook.react.runtime.w0
            @Override // com.facebook.react.uimanager.ComponentNameResolver
            public final String[] getComponentNames() {
                return this.f9905a.lambda$new$0();
            }
        });
        if (ReactNativeFeatureFlags.useNativeViewConfigsInBridgelessMode()) {
            final HashMap map = new HashMap();
            UIConstantsProviderBinding.install(unbufferedRuntimeExecutor, new UIConstantsProviderBinding.DefaultEventTypesProvider() { // from class: com.facebook.react.runtime.x0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.DefaultEventTypesProvider
                public final NativeMap getDefaultEventTypes() {
                    return Arguments.makeNativeMap(UIManagerModuleConstantsHelper.getDefaultExportableEventTypes());
                }
            }, new UIConstantsProviderBinding.ConstantsForViewManagerProvider() { // from class: com.facebook.react.runtime.y0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsForViewManagerProvider
                public final NativeMap getConstantsForViewManager(String str) {
                    return this.f9911a.lambda$new$2(map, str);
                }
            }, new UIConstantsProviderBinding.ConstantsProvider() { // from class: com.facebook.react.runtime.z0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsProvider
                public final NativeMap getConstants() {
                    return this.f9914a.lambda$new$3(map);
                }
            });
        }
        EventBeatManager eventBeatManager = new EventBeatManager();
        FabricUIManager fabricUIManager = new FabricUIManager(bridgelessReactContext, new ViewManagerRegistry(bridgelessViewManagerResolver), eventBeatManager);
        this.mFabricUIManager = fabricUIManager;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(bridgelessReactContext);
        new FabricUIManagerBinding().register(getBufferedRuntimeExecutor(), getRuntimeScheduler(), fabricUIManager, eventBeatManager, componentFactory, reactHostDelegate.getReactNativeConfig());
        fabricUIManager.initialize();
        Systrace.m10667i(0L);
        Systrace.m10667i(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeEagerTurboModules$4() {
        Systrace.m10662c(0L, "initializeEagerTurboModules");
        Iterator<String> it = this.mTurboModuleManager.getEagerInitModuleNames().iterator();
        while (it.hasNext()) {
            this.mTurboModuleManager.getModule(it.next());
        }
        Systrace.m10667i(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String[] lambda$new$0() {
        Collection<String> viewManagerNames = this.mViewManagerResolver.getViewManagerNames();
        if (viewManagerNames.size() >= 1) {
            return (String[]) viewManagerNames.toArray(new String[0]);
        }
        C45999a.m101507m(TAG, "No ViewManager names found");
        return new String[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NativeMap lambda$new$2(Map map, String str) {
        ViewManager viewManager = this.mViewManagerResolver.getViewManager(str);
        if (viewManager == null) {
            return null;
        }
        return (NativeMap) UIManagerModule.getConstantsForViewManager(viewManager, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NativeMap lambda$new$3(Map map) {
        Map<String, Object> mapCreateConstants = UIManagerModule.createConstants(new ArrayList(this.mViewManagerResolver.getEagerViewManagerMap().values()), null, map);
        Collection<String> lazyViewManagerNames = this.mViewManagerResolver.getLazyViewManagerNames();
        if (lazyViewManagerNames.size() > 0) {
            mapCreateConstants.put("ViewManagerNames", new ArrayList(lazyViewManagerNames));
            mapCreateConstants.put("LazyViewManagersEnabled", Boolean.TRUE);
        }
        return Arguments.makeNativeMap(mapCreateConstants);
    }

    private static synchronized void loadLibraryIfNeeded() {
        if (!sIsLibraryLoaded) {
            SoLoader.loadLibrary("rninstance");
            sIsLibraryLoaded = true;
        }
    }

    public void destroy() {
        C45999a.m101496b(TAG, "ReactInstance.destroy() is called.");
        this.mQueueConfiguration.destroy();
        this.mTurboModuleManager.invalidate();
        this.mFabricUIManager.invalidate();
        this.mJavaTimerManager.onInstanceDestroy();
        this.mHybridData.resetNative();
        this.mJavaScriptContextHolder.clear();
    }

    public EventDispatcher getEventDispatcher() {
        return this.mFabricUIManager.getEventDispatcher();
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    public Collection<NativeModule> getNativeModules() {
        return new ArrayList(this.mTurboModuleManager.getModules());
    }

    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mQueueConfiguration;
    }

    public FabricUIManager getUIManager() {
        return this.mFabricUIManager;
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return this.mTurboModuleManager.hasModule(reactModule.name());
        }
        return false;
    }

    public void initializeEagerTurboModules() {
        Runnable runnable = new Runnable() { // from class: com.facebook.react.runtime.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9903b.lambda$initializeEagerTurboModules$4();
            }
        };
        if (ReactNativeFeatureFlags.initEagerTurboModulesOnNativeModulesQueueAndroid()) {
            this.mQueueConfiguration.getNativeModulesQueueThread().runOnQueue(runnable);
        } else {
            runnable.run();
        }
    }

    public void loadJSBundle(JSBundleLoader jSBundleLoader) {
        Systrace.m10662c(0L, "ReactInstance.loadJSBundle");
        jSBundleLoader.loadScript(new JSBundleLoaderDelegate() { // from class: com.facebook.react.runtime.ReactInstance.1
            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z11) {
                ReactInstance.this.mBridgelessReactContext.setSourceURL(str);
                ReactInstance.this.loadJSBundleFromAssets(assetManager, str);
            }

            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void loadScriptFromFile(String str, String str2, boolean z11) {
                ReactInstance.this.mBridgelessReactContext.setSourceURL(str2);
                ReactInstance.this.loadJSBundleFromFile(str, str2);
            }

            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void loadSplitBundleFromFile(String str, String str2) {
                ReactInstance.this.loadJSBundleFromFile(str, str2);
            }

            @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
            public void setSourceURLs(String str, String str2) {
                ReactInstance.this.mBridgelessReactContext.setSourceURL(str);
            }
        });
        Systrace.m10667i(0L);
    }

    public void prerenderSurface(ReactSurfaceImpl reactSurfaceImpl) {
        Systrace.m10662c(0L, "ReactInstance.prerenderSurface");
        C45999a.m101496b(TAG, "call prerenderSurface with surface: " + reactSurfaceImpl.getModuleName());
        this.mFabricUIManager.startSurface(reactSurfaceImpl.getSurfaceHandler(), reactSurfaceImpl.getContext(), null);
        Systrace.m10667i(0L);
    }

    public void startSurface(ReactSurfaceImpl reactSurfaceImpl) {
        String str = TAG;
        C45999a.m101496b(str, "startSurface() is called with surface: " + reactSurfaceImpl.getSurfaceID());
        Systrace.m10662c(0L, "ReactInstance.startSurface");
        ViewGroup view = reactSurfaceImpl.getView();
        if (view == null) {
            throw new IllegalStateException("Starting surface without a view is not supported, use prerenderSurface instead.");
        }
        if (view.getId() != -1) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("surfaceView's is NOT equal to View.NO_ID before calling startSurface."));
            view.setId(-1);
        }
        if (reactSurfaceImpl.isRunning()) {
            this.mFabricUIManager.attachRootView(reactSurfaceImpl.getSurfaceHandler(), view);
        } else {
            this.mFabricUIManager.startSurface(reactSurfaceImpl.getSurfaceHandler(), reactSurfaceImpl.getContext(), view);
        }
        Systrace.m10667i(0L);
    }

    public void stopSurface(ReactSurfaceImpl reactSurfaceImpl) {
        C45999a.m101496b(TAG, "stopSurface() is called with surface: " + reactSurfaceImpl.getSurfaceID());
        this.mFabricUIManager.stopSurface(reactSurfaceImpl.getSurfaceHandler());
    }

    static {
        loadLibraryIfNeeded();
    }

    public NativeModule getNativeModule(String str) {
        NativeModule module;
        synchronized (this.mTurboModuleManager) {
            module = this.mTurboModuleManager.getModule(str);
        }
        return module;
    }

    public void handleMemoryPressure(int i11) {
        try {
            handleMemoryPressureJs(i11);
        } catch (NullPointerException unused) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Native method handleMemoryPressureJs is called earlier than librninstance.so got ready."));
        }
    }

    public void registerSegment(int i11, String str) {
        registerSegmentNative(i11, str);
    }
}
