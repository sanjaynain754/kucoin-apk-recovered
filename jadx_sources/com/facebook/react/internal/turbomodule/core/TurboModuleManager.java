package com.facebook.react.internal.turbomodule.core;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p302h6.C38115a;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class TurboModuleManager implements TurboModuleRegistry {
    private static final String TAG = "TurboModuleManager";
    private final TurboModuleManagerDelegate mDelegate;
    private final List<String> mEagerInitModuleNames;

    @InterfaceC44695a
    private final HybridData mHybridData;
    private final ModuleProvider mLegacyModuleProvider;
    private final Object mModuleCleanupLock = new Object();

    @GuardedBy("mModuleCleanupLock")
    private boolean mModuleCleanupStarted = false;

    @GuardedBy("mModuleCleanupLock")
    private final Map<String, ModuleHolder> mModuleHolders = new HashMap();
    private final ModuleProvider mTurboModuleProvider;

    public static class ModuleHolder {
        private static volatile int sHolderCount;
        private volatile NativeModule mModule = null;
        private volatile boolean mIsTryingToCreate = false;
        private volatile boolean mIsDoneCreatingModule = false;
        private volatile int mModuleId = sHolderCount;

        public void endCreatingModule() {
            this.mIsTryingToCreate = false;
            this.mIsDoneCreatingModule = true;
        }

        public void startCreatingModule() {
            this.mIsTryingToCreate = true;
        }

        @Nullable
        public NativeModule getModule() {
            return this.mModule;
        }

        public int getModuleId() {
            return this.mModuleId;
        }

        public boolean isCreatingModule() {
            return this.mIsTryingToCreate;
        }

        public boolean isDoneCreatingModule() {
            return this.mIsDoneCreatingModule;
        }

        public void setModule(@NonNull NativeModule nativeModule) {
            this.mModule = nativeModule;
        }

        public ModuleHolder() {
            sHolderCount++;
        }
    }

    public interface ModuleProvider {
        @Nullable
        NativeModule getModule(String str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NativeModule m10350b(String str) {
        return null;
    }

    @Nullable
    private NativeModule getOrCreateModule(String str, @NonNull ModuleHolder moduleHolder, boolean z11) {
        boolean z12;
        NativeModule module;
        synchronized (moduleHolder) {
            try {
                if (moduleHolder.isDoneCreatingModule()) {
                    if (z11) {
                        TurboModulePerfLogger.moduleCreateCacheHit(str, moduleHolder.getModuleId());
                    }
                    return moduleHolder.getModule();
                }
                boolean z13 = false;
                if (moduleHolder.isCreatingModule()) {
                    z12 = false;
                } else {
                    moduleHolder.startCreatingModule();
                    z12 = true;
                }
                if (!z12) {
                    synchronized (moduleHolder) {
                        while (moduleHolder.isCreatingModule()) {
                            try {
                                moduleHolder.wait();
                            } catch (InterruptedException unused) {
                                z13 = true;
                            }
                        }
                        if (z13) {
                            Thread.currentThread().interrupt();
                        }
                        module = moduleHolder.getModule();
                    }
                    return module;
                }
                TurboModulePerfLogger.moduleCreateConstructStart(str, moduleHolder.getModuleId());
                NativeModule module2 = this.mTurboModuleProvider.getModule(str);
                if (module2 == null) {
                    module2 = this.mLegacyModuleProvider.getModule(str);
                }
                TurboModulePerfLogger.moduleCreateConstructEnd(str, moduleHolder.getModuleId());
                TurboModulePerfLogger.moduleCreateSetUpStart(str, moduleHolder.getModuleId());
                if (module2 != null) {
                    synchronized (moduleHolder) {
                        moduleHolder.setModule(module2);
                    }
                    module2.initialize();
                } else {
                    C45999a.m101509o(TAG, "getOrCreateModule(): Unable to create module \"%s\" (legacy: %b, turbo: %b)", str, Boolean.valueOf(isLegacyModule(str)), Boolean.valueOf(isTurboModule(str)));
                }
                TurboModulePerfLogger.moduleCreateSetUpEnd(str, moduleHolder.getModuleId());
                synchronized (moduleHolder) {
                    moduleHolder.endCreatingModule();
                    moduleHolder.notifyAll();
                }
                return module2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private native HybridData initHybrid(RuntimeExecutor runtimeExecutor, CallInvokerHolderImpl callInvokerHolderImpl, NativeMethodCallInvokerHolderImpl nativeMethodCallInvokerHolderImpl, TurboModuleManagerDelegate turboModuleManagerDelegate);

    private native void installJSIBindings(boolean z11);

    private boolean isLegacyModule(String str) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.mDelegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isLegacyModuleRegistered(str);
    }

    private boolean isTurboModule(String str) {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.mDelegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_isModuleRegistered(str);
    }

    private boolean shouldEnableLegacyModuleInterop() {
        TurboModuleManagerDelegate turboModuleManagerDelegate = this.mDelegate;
        return turboModuleManagerDelegate != null && turboModuleManagerDelegate.unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    @NonNull
    public List<String> getEagerInitModuleNames() {
        return this.mEagerInitModuleNames;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    @Nullable
    public NativeModule getModule(String str) {
        synchronized (this.mModuleCleanupLock) {
            try {
                if (this.mModuleCleanupStarted) {
                    C45999a.m101509o(TAG, "getModule(): Tried to get module \"%s\", but TurboModuleManager was tearing down (legacy: %b, turbo: %b)", str, Boolean.valueOf(isLegacyModule(str)), Boolean.valueOf(isTurboModule(str)));
                    return null;
                }
                if (!this.mModuleHolders.containsKey(str)) {
                    this.mModuleHolders.put(str, new ModuleHolder());
                }
                ModuleHolder moduleHolder = this.mModuleHolders.get(str);
                TurboModulePerfLogger.moduleCreateStart(str, moduleHolder.getModuleId());
                NativeModule orCreateModule = getOrCreateModule(str, moduleHolder, true);
                if (orCreateModule != null) {
                    TurboModulePerfLogger.moduleCreateEnd(str, moduleHolder.getModuleId());
                    return orCreateModule;
                }
                TurboModulePerfLogger.moduleCreateFail(str, moduleHolder.getModuleId());
                return orCreateModule;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public Collection<NativeModule> getModules() {
        ArrayList<ModuleHolder> arrayList = new ArrayList();
        synchronized (this.mModuleCleanupLock) {
            arrayList.addAll(this.mModuleHolders.values());
        }
        ArrayList arrayList2 = new ArrayList();
        for (ModuleHolder moduleHolder : arrayList) {
            synchronized (moduleHolder) {
                try {
                    if (moduleHolder.getModule() != null) {
                        arrayList2.add(moduleHolder.getModule());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return arrayList2;
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public boolean hasModule(String str) {
        ModuleHolder moduleHolder;
        synchronized (this.mModuleCleanupLock) {
            moduleHolder = this.mModuleHolders.get(str);
        }
        if (moduleHolder == null) {
            return false;
        }
        synchronized (moduleHolder) {
            try {
                return moduleHolder.getModule() != null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry
    public void invalidate() {
        synchronized (this.mModuleCleanupLock) {
            this.mModuleCleanupStarted = true;
        }
        for (Map.Entry<String, ModuleHolder> entry : this.mModuleHolders.entrySet()) {
            NativeModule orCreateModule = getOrCreateModule(entry.getKey(), entry.getValue(), false);
            if (orCreateModule != null) {
                orCreateModule.invalidate();
            }
        }
        this.mModuleHolders.clear();
        this.mHybridData.resetNative();
    }

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }

    public TurboModuleManager(RuntimeExecutor runtimeExecutor, @Nullable final TurboModuleManagerDelegate turboModuleManagerDelegate, CallInvokerHolder callInvokerHolder, NativeMethodCallInvokerHolder nativeMethodCallInvokerHolder) {
        List<String> eagerInitModuleNames;
        ModuleProvider moduleProvider;
        this.mDelegate = turboModuleManagerDelegate;
        this.mHybridData = initHybrid(runtimeExecutor, (CallInvokerHolderImpl) callInvokerHolder, (NativeMethodCallInvokerHolderImpl) nativeMethodCallInvokerHolder, turboModuleManagerDelegate);
        installJSIBindings(shouldEnableLegacyModuleInterop());
        if (turboModuleManagerDelegate == null) {
            eagerInitModuleNames = Collections.EMPTY_LIST;
        } else {
            eagerInitModuleNames = turboModuleManagerDelegate.getEagerInitModuleNames();
        }
        this.mEagerInitModuleNames = eagerInitModuleNames;
        ModuleProvider moduleProvider2 = new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.a
            @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
            public final NativeModule getModule(String str) {
                return TurboModuleManager.m10350b(str);
            }
        };
        if (turboModuleManagerDelegate == null) {
            moduleProvider = moduleProvider2;
        } else {
            moduleProvider = new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.b
                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    return TurboModuleManager.m10349a(turboModuleManagerDelegate, str);
                }
            };
        }
        this.mTurboModuleProvider = moduleProvider;
        if (turboModuleManagerDelegate != null && shouldEnableLegacyModuleInterop()) {
            moduleProvider2 = new ModuleProvider() { // from class: com.facebook.react.internal.turbomodule.core.c
                @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
                public final NativeModule getModule(String str) {
                    return TurboModuleManager.m10351c(turboModuleManagerDelegate, str);
                }
            };
        }
        this.mLegacyModuleProvider = moduleProvider2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ NativeModule m10349a(TurboModuleManagerDelegate turboModuleManagerDelegate, String str) {
        return (NativeModule) turboModuleManagerDelegate.getModule(str);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ NativeModule m10351c(TurboModuleManagerDelegate turboModuleManagerDelegate, String str) {
        NativeModule legacyModule = turboModuleManagerDelegate.getLegacyModule(str);
        if (legacyModule != null) {
            C38115a.m86046b(!(legacyModule instanceof TurboModule), "NativeModule \"" + str + "\" is a TurboModule");
            return legacyModule;
        }
        return null;
    }

    @Nullable
    @InterfaceC44695a
    private CxxModuleWrapper getLegacyCxxModule(String str) {
        if (!isLegacyModule(str)) {
            return null;
        }
        NativeModule module = getModule(str);
        if (!(module instanceof CxxModuleWrapper) || (module instanceof TurboModule)) {
            return null;
        }
        return (CxxModuleWrapper) module;
    }

    @Nullable
    @InterfaceC44695a
    private NativeModule getLegacyJavaModule(String str) {
        if (!isLegacyModule(str)) {
            return null;
        }
        NativeModule module = getModule(str);
        if ((module instanceof CxxModuleWrapper) || (module instanceof TurboModule)) {
            return null;
        }
        return module;
    }

    @InterfaceC44695a
    private static List<TurboModuleInteropUtils.MethodDescriptor> getMethodDescriptorsFromModule(NativeModule nativeModule) {
        return TurboModuleInteropUtils.getMethodDescriptorsFromModule(nativeModule);
    }

    @Nullable
    @InterfaceC44695a
    private TurboModule getTurboJavaModule(String str) {
        if (!isTurboModule(str)) {
            return null;
        }
        NativeModule module = getModule(str);
        if ((module instanceof CxxModuleWrapper) || !(module instanceof TurboModule)) {
            return null;
        }
        return (TurboModule) module;
    }

    @Nullable
    @InterfaceC44695a
    private CxxModuleWrapper getTurboLegacyCxxModule(String str) {
        if (!isTurboModule(str)) {
            return null;
        }
        NativeModule module = getModule(str);
        if (!(module instanceof CxxModuleWrapper) || !(module instanceof TurboModule)) {
            return null;
        }
        return (CxxModuleWrapper) module;
    }
}
