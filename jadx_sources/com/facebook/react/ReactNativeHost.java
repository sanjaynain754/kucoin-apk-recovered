package com.facebook.react;

import android.app.Application;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.internal.ChoreographerProvider;
import java.util.Iterator;
import java.util.List;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReactNativeHost {
    private final Application mApplication;

    @Nullable
    private ReactInstanceManager mReactInstanceManager;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UIManager m10180a(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    public synchronized void clear() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null) {
            reactInstanceManager.invalidate();
            this.mReactInstanceManager = null;
        }
    }

    @Nullable
    public ChoreographerProvider getChoreographerProvider() {
        return null;
    }

    @Nullable
    public DevLoadingViewManager getDevLoadingViewManager() {
        return null;
    }

    @Nullable
    public DevSupportManagerFactory getDevSupportManagerFactory() {
        return null;
    }

    @Nullable
    public String getJSBundleFile() {
        return null;
    }

    @Nullable
    public JSEngineResolutionAlgorithm getJSEngineResolutionAlgorithm() {
        return null;
    }

    @Nullable
    public JSExceptionHandler getJSExceptionHandler() {
        return null;
    }

    @Nullable
    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    public boolean getLazyViewManagersEnabled() {
        return false;
    }

    public abstract List<ReactPackage> getPackages();

    @Nullable
    public PausedInDebuggerOverlayManager getPausedInDebuggerOverlayManager() {
        return null;
    }

    public synchronized ReactInstanceManager getReactInstanceManager() {
        try {
            if (this.mReactInstanceManager == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.mReactInstanceManager = createReactInstanceManager();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.mReactInstanceManager;
    }

    @Nullable
    public ReactPackageTurboModuleManagerDelegate.Builder getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    @Nullable
    public RedBoxHandler getRedBoxHandler() {
        return null;
    }

    public boolean getShouldRequireActivity() {
        return true;
    }

    public abstract boolean getUseDeveloperSupport();

    public synchronized boolean hasInstance() {
        return this.mReactInstanceManager != null;
    }

    public ReactInstanceManager createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        ReactInstanceManagerBuilder baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return baseReactInstanceManagerBuilder.build();
    }

    public final Application getApplication() {
        return this.mApplication;
    }

    @Nullable
    public String getBundleAssetName() {
        return "index.android.bundle";
    }

    public String getJSMainModuleName() {
        return "index.android";
    }

    public SurfaceDelegateFactory getSurfaceDelegateFactory() {
        return new SurfaceDelegateFactory() { // from class: com.facebook.react.ReactNativeHost.1
            @Override // com.facebook.react.common.SurfaceDelegateFactory
            @Nullable
            public SurfaceDelegate createSurfaceDelegate(String str) {
                return null;
            }
        };
    }

    @Nullable
    public UIManagerProvider getUIManagerProvider() {
        return new UIManagerProvider() { // from class: com.facebook.react.t
            @Override // com.facebook.react.bridge.UIManagerProvider
            public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                return ReactNativeHost.m10180a(reactApplicationContext);
            }
        };
    }

    public ReactNativeHost(Application application) {
        this.mApplication = application;
    }

    public ReactInstanceManagerBuilder getBaseReactInstanceManagerBuilder() {
        ReactInstanceManagerBuilder pausedInDebuggerOverlayManager = ReactInstanceManager.builder().setApplication(this.mApplication).setJSMainModulePath(getJSMainModuleName()).setUseDeveloperSupport(getUseDeveloperSupport()).setDevSupportManagerFactory(getDevSupportManagerFactory()).setDevLoadingViewManager(getDevLoadingViewManager()).setRequireActivity(getShouldRequireActivity()).setSurfaceDelegateFactory(getSurfaceDelegateFactory()).setJSExceptionHandler(getJSExceptionHandler()).setLazyViewManagersEnabled(getLazyViewManagersEnabled()).setRedBoxHandler(getRedBoxHandler()).setJavaScriptExecutorFactory(getJavaScriptExecutorFactory()).setUIManagerProvider(getUIManagerProvider()).setInitialLifecycleState(LifecycleState.BEFORE_CREATE).setReactPackageTurboModuleManagerDelegateBuilder(getReactPackageTurboModuleManagerDelegateBuilder()).setJSEngineResolutionAlgorithm(getJSEngineResolutionAlgorithm()).setChoreographerProvider(getChoreographerProvider()).setPausedInDebuggerOverlayManager(getPausedInDebuggerOverlayManager());
        Iterator<ReactPackage> it = getPackages().iterator();
        while (it.hasNext()) {
            pausedInDebuggerOverlayManager.addPackage(it.next());
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            pausedInDebuggerOverlayManager.setJSBundleFile(jSBundleFile);
            return pausedInDebuggerOverlayManager;
        }
        pausedInDebuggerOverlayManager.setBundleAssetName((String) C38115a.m86047c(getBundleAssetName()));
        return pausedInDebuggerOverlayManager;
    }
}
