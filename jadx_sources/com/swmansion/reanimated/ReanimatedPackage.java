package com.swmansion.reanimated;

import androidx.annotation.NonNull;
import androidx.tracing.Trace;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.worklets.WorkletsModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes59.dex */
public class ReanimatedPackage extends BaseReactPackage implements ReactPackage {
    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        Trace.beginSection("createUIManagerModule");
        try {
            return ReanimatedUIManagerFactory.create(reactApplicationContext, getReactInstanceManager(reactApplicationContext).getOrCreateViewManagers(reactApplicationContext), -1);
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        Class[] clsArr = {WorkletsModule.class, ReanimatedModule.class, ReanimatedUIManager.class};
        final HashMap map = new HashMap();
        for (int i11 = 0; i11 < 3; i11++) {
            Class cls = clsArr[i11];
            ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
            Objects.requireNonNull(reactModule);
            ReactModule reactModule2 = reactModule;
            map.put(reactModule2.name(), new ReactModuleInfo(reactModule2.name(), cls.getName(), true, reactModule2.needsEagerInit(), reactModule2.isCxxModule(), true));
        }
        return new ReactModuleInfoProvider() { // from class: com.swmansion.reanimated.i
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return ReanimatedPackage.m72069a(map);
            }
        };
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(@NonNull String str, @NonNull ReactApplicationContext reactApplicationContext) {
        str.getClass();
        switch (str) {
            case "WorkletsModule":
                return new WorkletsModule(reactApplicationContext);
            case "ReanimatedModule":
                return new ReanimatedModule(reactApplicationContext);
            case "UIManager":
                return createUIManager(reactApplicationContext);
            default:
                return null;
        }
    }

    public ReactInstanceManager getReactInstanceManager(ReactApplicationContext reactApplicationContext) {
        return ((ReactApplication) reactApplicationContext.getApplicationContext()).getReactNativeHost().getReactInstanceManager();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m72069a(Map map) {
        return map;
    }
}
