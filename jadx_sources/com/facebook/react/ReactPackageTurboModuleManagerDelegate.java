package com.facebook.react;

import androidx.annotation.Nullable;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ReactPackageTurboModuleManagerDelegate extends TurboModuleManagerDelegate {
    private final List<ModuleProvider> mModuleProviders;
    private final Map<ModuleProvider, Map<String, ReactModuleInfo>> mPackageModuleInfos;
    private List<ReactPackage> mPackages;
    private ReactApplicationContext mReactContext;
    private final boolean mShouldEnableLegacyModuleInterop;

    public static abstract class Builder {

        @Nullable
        private ReactApplicationContext mContext;

        @Nullable
        private List<ReactPackage> mPackages;

        public ReactPackageTurboModuleManagerDelegate build() {
            C38115a.m86048d(this.mContext, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            C38115a.m86048d(this.mPackages, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return build(this.mContext, this.mPackages);
        }

        public abstract ReactPackageTurboModuleManagerDelegate build(ReactApplicationContext reactApplicationContext, List<ReactPackage> list);

        public Builder setPackages(List<ReactPackage> list) {
            this.mPackages = new ArrayList(list);
            return this;
        }

        public Builder setReactApplicationContext(ReactApplicationContext reactApplicationContext) {
            this.mContext = reactApplicationContext;
            return this;
        }
    }

    public interface ModuleProvider {
        @Nullable
        NativeModule getModule(String str);
    }

    public ReactPackageTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<ReactPackage> list) {
        this.mModuleProviders = new ArrayList();
        this.mPackageModuleInfos = new HashMap();
        this.mShouldEnableLegacyModuleInterop = ReactNativeFeatureFlags.enableBridgelessArchitecture() && ReactNativeFeatureFlags.useTurboModuleInterop();
        initialize(reactApplicationContext, list);
    }

    private void initialize(final ReactApplicationContext reactApplicationContext, List<ReactPackage> list) {
        for (ReactPackage reactPackage : list) {
            if (reactPackage instanceof BaseReactPackage) {
                final BaseReactPackage baseReactPackage = (BaseReactPackage) reactPackage;
                ModuleProvider moduleProvider = new ModuleProvider() { // from class: com.facebook.react.u
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public final NativeModule getModule(String str) {
                        return baseReactPackage.getModule(str, reactApplicationContext);
                    }
                };
                this.mModuleProviders.add(moduleProvider);
                this.mPackageModuleInfos.put(moduleProvider, baseReactPackage.getReactModuleInfoProvider().getReactModuleInfos());
            } else if (shouldSupportLegacyPackages() && (reactPackage instanceof LazyReactPackage)) {
                LazyReactPackage lazyReactPackage = (LazyReactPackage) reactPackage;
                List<ModuleSpec> nativeModules = lazyReactPackage.getNativeModules(reactApplicationContext);
                final HashMap map = new HashMap();
                for (ModuleSpec moduleSpec : nativeModules) {
                    map.put(moduleSpec.getName(), moduleSpec.getProvider());
                }
                ModuleProvider moduleProvider2 = new ModuleProvider() { // from class: com.facebook.react.v
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public final NativeModule getModule(String str) {
                        return ReactPackageTurboModuleManagerDelegate.m10182b(map, str);
                    }
                };
                this.mModuleProviders.add(moduleProvider2);
                this.mPackageModuleInfos.put(moduleProvider2, lazyReactPackage.getReactModuleInfoProvider().getReactModuleInfos());
            } else if (shouldSupportLegacyPackages()) {
                List<NativeModule> listCreateNativeModules = reactPackage.createNativeModules(reactApplicationContext);
                final HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                for (NativeModule nativeModule : listCreateNativeModules) {
                    Class<?> cls = nativeModule.getClass();
                    ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                    String strName = reactModule != null ? reactModule.name() : nativeModule.getName();
                    map3.put(strName, reactModule != null ? new ReactModuleInfo(strName, cls.getName(), reactModule.canOverrideExistingModule(), true, reactModule.isCxxModule(), ReactModuleInfo.classIsTurboModule(cls)) : new ReactModuleInfo(strName, cls.getName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.classIsTurboModule(cls)));
                    map2.put(strName, nativeModule);
                }
                ModuleProvider moduleProvider3 = new ModuleProvider() { // from class: com.facebook.react.w
                    @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.ModuleProvider
                    public final NativeModule getModule(String str) {
                        return (NativeModule) map2.get(str);
                    }
                };
                this.mModuleProviders.add(moduleProvider3);
                this.mPackageModuleInfos.put(moduleProvider3, map3);
            }
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public List<String> getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleProvider> it = this.mModuleProviders.iterator();
        while (it.hasNext()) {
            for (ReactModuleInfo reactModuleInfo : this.mPackageModuleInfos.get(it.next()).values()) {
                if (reactModuleInfo.getIsTurboModule() && reactModuleInfo.getNeedsEagerInit()) {
                    arrayList.add(reactModuleInfo.getName());
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @Nullable
    public TurboModule getModule(String str) {
        NativeModule nativeModule = null;
        for (ModuleProvider moduleProvider : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(moduleProvider).get(str);
            if (reactModuleInfo != null && reactModuleInfo.getIsTurboModule() && (nativeModule == null || reactModuleInfo.getCanOverrideExistingModule())) {
                NativeModule module = moduleProvider.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return (TurboModule) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(String str) {
        Iterator<ModuleProvider> it = this.mModuleProviders.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(it.next()).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.getIsTurboModule()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(String str) {
        Iterator<ModuleProvider> it = this.mModuleProviders.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(it.next()).get(str);
            if (reactModuleInfo != null && reactModuleInfo.getIsTurboModule()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.mShouldEnableLegacyModuleInterop;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NativeModule m10182b(Map map, String str) {
        Provider provider = (Provider) map.get(str);
        if (provider != null) {
            return (NativeModule) provider.get();
        }
        return null;
    }

    private boolean shouldSupportLegacyPackages() {
        return unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @Nullable
    public NativeModule getLegacyModule(String str) {
        if (!unstable_shouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (ModuleProvider moduleProvider : this.mModuleProviders) {
            ReactModuleInfo reactModuleInfo = this.mPackageModuleInfos.get(moduleProvider).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.getIsTurboModule() && (nativeModule == null || reactModuleInfo.getCanOverrideExistingModule())) {
                NativeModule module = moduleProvider.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    public ReactPackageTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<ReactPackage> list, HybridData hybridData) {
        super(hybridData);
        this.mModuleProviders = new ArrayList();
        this.mPackageModuleInfos = new HashMap();
        this.mShouldEnableLegacyModuleInterop = ReactNativeFeatureFlags.enableBridgelessArchitecture() && ReactNativeFeatureFlags.useTurboModuleInterop();
        initialize(reactApplicationContext, list);
    }
}
