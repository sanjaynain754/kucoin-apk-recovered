package com.facebook.react;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.ClassFinder;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerResolver;
import com.facebook.systrace.Systrace;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
class CoreModulesPackage extends BaseReactPackage implements ReactPackageLogger {
    private final DefaultHardwareBackBtnHandler mHardwareBackBtnHandler;
    private final boolean mLazyViewManagersEnabled;
    private final int mMinTimeLeftInFrameForNonBatchedOperationMs;
    private final ReactInstanceManager mReactInstanceManager;

    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        Systrace.m10662c(0L, "createUIManagerModule");
        try {
            return this.mLazyViewManagersEnabled ? new UIManagerModule(reactApplicationContext, new ViewManagerResolver() { // from class: com.facebook.react.CoreModulesPackage.1
                @Override // com.facebook.react.uimanager.ViewManagerResolver
                @Nullable
                public ViewManager getViewManager(String str) {
                    return CoreModulesPackage.this.mReactInstanceManager.createViewManager(str);
                }

                @Override // com.facebook.react.uimanager.ViewManagerResolver
                public Collection<String> getViewManagerNames() {
                    return CoreModulesPackage.this.mReactInstanceManager.getViewManagerNames();
                }
            }, this.mMinTimeLeftInFrameForNonBatchedOperationMs) : new UIManagerModule(reactApplicationContext, this.mReactInstanceManager.getOrCreateViewManagers(reactApplicationContext), this.mMinTimeLeftInFrameForNonBatchedOperationMs);
        } finally {
            Systrace.m10667i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    private ReactModuleInfoProvider fallbackForMissingClass() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevMenuModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        final HashMap map = new HashMap();
        for (int i11 = 0; i11 < 11; i11++) {
            Class cls = clsArr[i11];
            ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
            map.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), ReactModuleInfo.classIsTurboModule(cls)));
        }
        return new ReactModuleInfoProvider() { // from class: com.facebook.react.a
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return CoreModulesPackage.m10148a(map);
            }
        };
    }

    @Override // com.facebook.react.ReactPackageLogger
    public void endProcessPackage() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        if (!ClassFinder.canLoadClassesFromAnnotationProcessors()) {
            return fallbackForMissingClass();
        }
        try {
            return (ReactModuleInfoProvider) ClassFinder.findClass("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return fallbackForMissingClass();
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e12);
        }
    }

    @Override // com.facebook.react.ReactPackageLogger
    public void startProcessPackage() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    public CoreModulesPackage(ReactInstanceManager reactInstanceManager, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler, boolean z11, int i11) {
        this.mReactInstanceManager = reactInstanceManager;
        this.mHardwareBackBtnHandler = defaultHardwareBackBtnHandler;
        this.mLazyViewManagersEnabled = z11;
        this.mMinTimeLeftInFrameForNonBatchedOperationMs = i11;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.mReactInstanceManager.getDevSupportManager());
            case "Timing":
                return new TimingModule(reactApplicationContext, this.mReactInstanceManager.getDevSupportManager());
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.mReactInstanceManager.getDevSupportManager());
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DevMenu":
                return new DevMenuModule(reactApplicationContext, this.mReactInstanceManager.getDevSupportManager());
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.mHardwareBackBtnHandler);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.mReactInstanceManager.getDevSupportManager());
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            case "HeadlessJsTaskSupport":
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case "UIManager":
                return createUIManager(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m10148a(Map map) {
        return map;
    }
}
