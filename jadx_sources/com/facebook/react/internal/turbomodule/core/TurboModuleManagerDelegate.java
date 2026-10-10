package com.facebook.react.internal.turbomodule.core;

import androidx.annotation.Nullable;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Collections;
import java.util.List;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class TurboModuleManagerDelegate {

    @InterfaceC44695a
    private final HybridData mHybridData;

    public TurboModuleManagerDelegate() {
        maybeLoadOtherSoLibraries();
        this.mHybridData = initHybrid();
    }

    @Nullable
    public NativeModule getLegacyModule(String str) {
        return null;
    }

    @Nullable
    public abstract TurboModule getModule(String str);

    public abstract HybridData initHybrid();

    public synchronized void maybeLoadOtherSoLibraries() {
    }

    public boolean unstable_isLegacyModuleRegistered(String str) {
        return false;
    }

    public abstract boolean unstable_isModuleRegistered(String str);

    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return false;
    }

    public List<String> getEagerInitModuleNames() {
        return Collections.EMPTY_LIST;
    }

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }

    public TurboModuleManagerDelegate(HybridData hybridData) {
        maybeLoadOtherSoLibraries();
        this.mHybridData = hybridData;
    }
}
