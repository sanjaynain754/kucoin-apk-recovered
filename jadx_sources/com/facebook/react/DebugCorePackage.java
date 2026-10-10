package com.facebook.react;

import androidx.annotation.Nullable;
import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ClassFinder;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes45.dex */
public class DebugCorePackage extends BaseReactPackage implements ViewManagerOnDemandReactPackage {

    @Nullable
    private Map<String, ModuleSpec> mViewManagers;

    private ReactModuleInfoProvider fallbackForMissingClass() {
        final HashMap map = new HashMap();
        Class cls = new Class[]{JSCHeapCapture.class}[0];
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        map.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), ReactModuleInfo.classIsTurboModule(cls)));
        return new ReactModuleInfoProvider() { // from class: com.facebook.react.b
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return DebugCorePackage.m10150a(map);
            }
        };
    }

    private Map<String, ModuleSpec> getViewManagersMap() {
        if (this.mViewManagers == null) {
            HashMap map = new HashMap();
            appendMap(map, DebuggingOverlayManager.REACT_CLASS, new Provider() { // from class: com.facebook.react.c
                @Override // javax.inject.Provider
                public final Object get() {
                    return new DebuggingOverlayManager();
                }
            });
            this.mViewManagers = map;
        }
        return this.mViewManagers;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        if (!ClassFinder.canLoadClassesFromAnnotationProcessors()) {
            return fallbackForMissingClass();
        }
        try {
            return (ReactModuleInfoProvider) ClassFinder.findClass("com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return fallbackForMissingClass();
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e12);
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap().values());
    }

    private static void appendMap(Map<String, ModuleSpec> map, String str, Provider<? extends NativeModule> provider) {
        map.put(str, ModuleSpec.viewManagerSpec(provider));
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    @Nullable
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap().get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (!str.equals(NativeJSCHeapCaptureSpec.NAME)) {
            return null;
        }
        return new JSCHeapCapture(reactApplicationContext);
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public Collection<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return getViewManagersMap().keySet();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m10150a(Map map) {
        return map;
    }
}
