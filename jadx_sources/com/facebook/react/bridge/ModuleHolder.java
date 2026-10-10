package com.facebook.react.bridge;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import p053c7.C4858a;
import p300h4.C38107c;
import p302h6.C38115a;
import p331i4.C38438a;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);

    @GuardedBy("this")
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();

    @GuardedBy("this")
    private boolean mIsCreating;

    @GuardedBy("this")
    private boolean mIsInitializing;

    @Nullable
    @GuardedBy("this")
    private NativeModule mModule;
    private final String mName;

    @Nullable
    private Provider<? extends NativeModule> mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider<? extends NativeModule> provider) {
        this.mName = reactModuleInfo.getName();
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.getNeedsEagerInit()) {
            this.mModule = create();
        }
    }

    public synchronized void destroy() {
        NativeModule nativeModule = this.mModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    @InterfaceC44695a
    public NativeModule getModule() {
        boolean z11;
        NativeModule nativeModule;
        NativeModule nativeModule2;
        synchronized (this) {
            try {
                NativeModule nativeModule3 = this.mModule;
                if (nativeModule3 != null) {
                    return nativeModule3;
                }
                if (this.mIsCreating) {
                    z11 = false;
                } else {
                    z11 = true;
                    this.mIsCreating = true;
                }
                if (z11) {
                    NativeModule nativeModuleCreate = create();
                    synchronized (this) {
                        this.mIsCreating = false;
                        notifyAll();
                    }
                    return nativeModuleCreate;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.mModule;
                        if (nativeModule != null || !this.mIsCreating) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    nativeModule2 = (NativeModule) C38115a.m86047c(nativeModule);
                }
                return nativeModule2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public void markInitializable() {
        boolean z11;
        NativeModule nativeModule;
        synchronized (this) {
            z11 = true;
            try {
                this.mInitializable = true;
                if (this.mModule != null) {
                    C38115a.m86045a(!this.mIsInitializing);
                    nativeModule = this.mModule;
                } else {
                    nativeModule = null;
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            doInitialize(nativeModule);
        }
    }

    private NativeModule create() {
        boolean z11 = false;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        C4858a.m4990a(0L, "ModuleHolder.createModule").mo4993b("name", this.mName).mo4994c();
        C38107c.m86037a().mo86036c(C38438a.NATIVE_MODULE, "NativeModule init: %s", this.mName);
        try {
            NativeModule nativeModule = (NativeModule) ((Provider) C38115a.m86047c(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                try {
                    this.mModule = nativeModule;
                    if (this.mInitializable && !this.mIsInitializing) {
                        z11 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                doInitialize(nativeModule);
            }
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mName, this.mInstanceKey);
            C4858a.m4991b(0L).mo4994c();
            return nativeModule;
        } catch (Throwable th3) {
            try {
                C45999a.m101510p(ReactConstants.TAG, th3, "Failed to create NativeModule '%s'", this.mName);
                throw th3;
            } catch (Throwable th4) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mName, this.mInstanceKey);
                C4858a.m4991b(0L).mo4994c();
                throw th4;
            }
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z11;
        C4858a.m4990a(0L, "ModuleHolder.initialize").mo4993b("name", this.mName).mo4994c();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.mInitializable || this.mIsInitializing) {
                        z11 = false;
                    } else {
                        z11 = true;
                        this.mIsInitializing = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            C4858a.m4991b(0L).mo4994c();
        } catch (Throwable th3) {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            C4858a.m4991b(0L).mo4994c();
            throw th3;
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.getCanOverrideExistingModule();
    }

    public String getClassName() {
        return this.mReactModuleInfo.getClassName();
    }

    @InterfaceC44695a
    public String getName() {
        return this.mName;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.getIsCxxModule();
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.getIsTurboModule();
    }

    public ModuleHolder(NativeModule nativeModule) {
        String name = nativeModule.getName();
        this.mName = name;
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), ReactModuleInfo.classIsTurboModule(nativeModule.getClass()));
        this.mModule = nativeModule;
        C38107c.m86037a().mo86036c(C38438a.NATIVE_MODULE, "NativeModule init: %s", name);
    }
}
