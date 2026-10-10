package com.facebook.react.bridge;

import androidx.annotation.Nullable;
import com.facebook.react.module.annotations.ReactModule;
import javax.inject.Provider;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class ModuleSpec {
    private static final String TAG = "ModuleSpec";

    @Nullable
    private final String mName;
    private final Provider<? extends NativeModule> mProvider;

    private ModuleSpec(Provider<? extends NativeModule> provider) {
        this.mProvider = provider;
        this.mName = null;
    }

    public static ModuleSpec nativeModuleSpec(Class<? extends NativeModule> cls, Provider<? extends NativeModule> provider) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return new ModuleSpec(provider, reactModule.name());
        }
        C45999a.m101488I(TAG, "Could not find @ReactModule annotation on " + cls.getName() + ". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy");
        return new ModuleSpec(provider, provider.get().getName());
    }

    public static ModuleSpec viewManagerSpec(Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider);
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    public Provider<? extends NativeModule> getProvider() {
        return this.mProvider;
    }

    private ModuleSpec(Provider<? extends NativeModule> provider, String str) {
        this.mProvider = provider;
        this.mName = str;
    }

    public static ModuleSpec nativeModuleSpec(String str, Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider, str);
    }
}
