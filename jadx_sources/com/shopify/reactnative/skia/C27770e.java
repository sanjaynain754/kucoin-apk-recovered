package com.shopify.reactnative.skia;

import androidx.annotation.Nullable;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.shopify.reactnative.skia.e */
/* JADX INFO: compiled from: RNSkiaPackage.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27770e extends TurboReactPackage {

    /* JADX INFO: renamed from: com.shopify.reactnative.skia.e$a */
    /* JADX INFO: compiled from: RNSkiaPackage.java */
    public class a implements ReactModuleInfoProvider {
        public a() {
        }

        @Override // com.facebook.react.module.model.ReactModuleInfoProvider
        public Map<String, ReactModuleInfo> getReactModuleInfos() {
            HashMap map = new HashMap();
            Class cls = new Class[]{RNSkiaModule.class}[0];
            ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
            map.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            return map;
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNSkiaModule(reactApplicationContext));
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new SkiaPictureViewManager());
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new a();
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (!str.equals("RNSkiaModule")) {
            return null;
        }
        return new RNSkiaModule(reactApplicationContext);
    }
}
