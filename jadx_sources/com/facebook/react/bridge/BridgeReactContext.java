package com.facebook.react.bridge;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;
import p302h6.C38115a;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@VisibleForTesting
public class BridgeReactContext extends ReactApplicationContext {
    private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.";
    private static final String EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module before CatalystInstance has been set!";
    private static final String LATE_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module after the React instance was destroyed.";
    private static final String LATE_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module after CatalystInstance has been destroyed!";
    private static final String TAG = "BridgeReactContext";

    @Nullable
    private CatalystInstance mCatalystInstance;
    private volatile boolean mDestroyed;

    @InterfaceC44695a
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(@NonNull String str, @Nullable Object obj);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return (T) this.mCatalystInstance.getNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean isBridgeless() {
        return false;
    }

    private void raiseCatalystInstanceMissingException() {
        throw new IllegalStateException(this.mDestroyed ? LATE_NATIVE_MODULE_EXCEPTION_MESSAGE : EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        return (CatalystInstance) C38115a.m86047c(this.mCatalystInstance);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public UIManager getFabricUIManager() {
        return this.mCatalystInstance.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public CallInvokerHolder getJSCallInvokerHolder() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJSCallInvokerHolder();
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        if (this.mCatalystInstance != null) {
            InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
            return (interopModuleRegistry == null || !interopModuleRegistry.shouldReturnInteropModule(cls)) ? (T) this.mCatalystInstance.getJSModule(cls) : (T) this.mInteropModuleRegistry.getInteropModule(cls);
        }
        if (this.mDestroyed) {
            throw new IllegalStateException(LATE_JS_ACCESS_EXCEPTION_MESSAGE);
        }
        throw new IllegalStateException(EARLY_JS_ACCESS_EXCEPTION_MESSAGE);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    @FrameworkAPI
    @UnstableReactNativeAPI
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection<NativeModule> getNativeModules() {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public String getSourceURL() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance == null) {
            return null;
        }
        return catalystInstance.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        boolean z11 = catalystInstance != null;
        boolean z12 = z11 && !catalystInstance.isDestroyed();
        boolean z13 = getJSExceptionHandler() != null;
        if (z12 && z13) {
            getJSExceptionHandler().handleException(exc);
            return;
        }
        C45999a.m101508n(ReactConstants.TAG, "Unable to handle Exception - catalystInstanceVariableExists: " + z11 + " - isCatalystInstanceAlive: " + z12 + " - hasExceptionHandler: " + z13, exc);
        throw new IllegalStateException(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        return (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasCatalystInstance() {
        return this.mCatalystInstance != null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.hasNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.mCatalystInstance != null;
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        }
        if (this.mCatalystInstance != null) {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot initialize ReactContext after it has been destroyed."));
        }
        this.mCatalystInstance = catalystInstance;
        initializeMessageQueueThreads(catalystInstance.getReactQueueConfiguration());
        initializeInteropModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i11, String str, Callback callback) {
        ((CatalystInstance) C38115a.m86047c(this.mCatalystInstance)).registerSegment(i11, str);
        ((Callback) C38115a.m86047c(callback)).invoke(new Object[0]);
    }

    public BridgeReactContext(Context context) {
        super(context);
        this.mDestroyed = false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        this.mDestroyed = true;
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.lambda$onNativeException$6();
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public NativeModule getNativeModule(String str) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.getNativeModule(str);
    }
}
