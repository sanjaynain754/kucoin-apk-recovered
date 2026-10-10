package com.facebook.react.bridge;

import androidx.annotation.Nullable;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.build.ReactBuildConfig;
import java.util.Map;
import p302h6.C38115a;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = "async";
    public static final String METHOD_TYPE_PROMISE = "promise";
    public static final String METHOD_TYPE_SYNC = "sync";

    @Nullable
    protected CxxCallbackImpl mEventEmitterCallback;

    @Nullable
    private final ReactApplicationContext mReactApplicationContext;

    public BaseJavaModule() {
        this(null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Nullable
    public Map<String, Object> getConstants() {
        return null;
    }

    public BaseJavaModule(@Nullable ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    @InterfaceC44695a
    private final void setEventEmitterCallback(CxxCallbackImpl cxxCallbackImpl) {
        this.mEventEmitterCallback = cxxCallbackImpl;
    }

    public final ReactApplicationContext getReactApplicationContext() {
        return (ReactApplicationContext) C38115a.m86048d(this.mReactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
    }

    @Nullable
    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.hasActiveReactInstance()) {
            return this.mReactApplicationContext;
        }
        String str = "React Native Instance has already disappeared: requested by " + getName();
        if (ReactBuildConfig.DEBUG) {
            C45999a.m101488I(ReactConstants.TAG, str);
            return null;
        }
        ReactSoftExceptionLogger.logSoftException(ReactConstants.TAG, new RuntimeException(str));
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
    }
}
