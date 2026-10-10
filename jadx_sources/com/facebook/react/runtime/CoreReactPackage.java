package com.facebook.react.runtime;

import androidx.annotation.Nullable;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ClassFinder;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.debug.DevMenuModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import java.util.HashMap;
import java.util.Map;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
class CoreReactPackage extends BaseReactPackage {
    private final DevSupportManager mDevSupportManager;
    private final DefaultHardwareBackBtnHandler mHardwareBackBtnHandler;

    private ReactModuleInfoProvider fallbackForMissingClass() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceInfoModule.class, SourceCodeModule.class, DevMenuModule.class, DevSettingsModule.class, DeviceEventManagerModule.class, LogBoxModule.class, ExceptionsManagerModule.class};
        final HashMap map = new HashMap();
        for (int i11 = 0; i11 < 8; i11++) {
            Class cls = clsArr[i11];
            ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
            if (reactModule != null) {
                map.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), ReactModuleInfo.classIsTurboModule(cls)));
            }
        }
        return new ReactModuleInfoProvider() { // from class: com.facebook.react.runtime.a
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return CoreReactPackage.m10408a(map);
            }
        };
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        if (!ClassFinder.canLoadClassesFromAnnotationProcessors()) {
            return fallbackForMissingClass();
        }
        try {
            return (ReactModuleInfoProvider) ((Class) C38115a.m86047c(ClassFinder.findClass(CoreReactPackage.class.getName() + "$$ReactModuleInfoProvider"))).newInstance();
        } catch (ClassNotFoundException unused) {
            return fallbackForMissingClass();
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + CoreReactPackage.class.getName() + "$$ReactModuleInfoProvider", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + CoreReactPackage.class.getName() + "$$ReactModuleInfoProvider", e12);
        }
    }

    public CoreReactPackage(DevSupportManager devSupportManager, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        this.mDevSupportManager = devSupportManager;
        this.mHardwareBackBtnHandler = defaultHardwareBackBtnHandler;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.mDevSupportManager);
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.mDevSupportManager);
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DevMenu":
                return new DevMenuModule(reactApplicationContext, this.mDevSupportManager);
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.mHardwareBackBtnHandler);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.mDevSupportManager);
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m10408a(Map map) {
        return map;
    }
}
