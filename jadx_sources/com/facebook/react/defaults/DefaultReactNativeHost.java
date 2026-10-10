package com.facebook.react.defaults;

import android.app.Application;
import android.content.Context;
import androidx.media3.common.MimeTypes;
import com.facebook.react.JSEngineResolutionAlgorithm;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManagerProviderImpl;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewManagerResolver;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultReactNativeHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015R\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/react/defaults/DefaultReactNativeHost;", "Lcom/facebook/react/ReactNativeHost;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "getReactPackageTurboModuleManagerDelegateBuilder", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "getUIManagerProvider", "Lcom/facebook/react/bridge/UIManagerProvider;", "getJSEngineResolutionAlgorithm", "Lcom/facebook/react/JSEngineResolutionAlgorithm;", "isNewArchEnabled", "", "()Z", "isHermesEnabled", "()Ljava/lang/Boolean;", "toReactHost", "Lcom/facebook/react/ReactHost;", "context", "Landroid/content/Context;", "toReactHost$ReactAndroid_release", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class DefaultReactNativeHost extends ReactNativeHost {
    @Nullable
    public Boolean isHermesEnabled() {
        return null;
    }

    public boolean isNewArchEnabled() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultReactNativeHost(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager getUIManagerProvider$lambda$0(final DefaultReactNativeHost defaultReactNativeHost, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        return new FabricUIManagerProviderImpl(componentFactory, ReactNativeConfig.DEFAULT_CONFIG, defaultReactNativeHost.getLazyViewManagersEnabled() ? new ViewManagerRegistry(new ViewManagerResolver() { // from class: com.facebook.react.defaults.DefaultReactNativeHost$getUIManagerProvider$1$viewManagerRegistry$1
            @Override // com.facebook.react.uimanager.ViewManagerResolver
            public Collection<String> getViewManagerNames() {
                return this.this$0.getReactInstanceManager().getViewManagerNames();
            }

            @Override // com.facebook.react.uimanager.ViewManagerResolver
            public ViewManager getViewManager(String viewManagerName) {
                Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
                return this.this$0.getReactInstanceManager().createViewManager(viewManagerName);
            }
        }) : new ViewManagerRegistry(defaultReactNativeHost.getReactInstanceManager().getOrCreateViewManagers(reactApplicationContext))).createUIManager(reactApplicationContext);
    }

    @UnstableReactNativeAPI
    @NotNull
    public final ReactHost toReactHost$ReactAndroid_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<ReactPackage> packages = getPackages();
        Intrinsics.checkNotNullExpressionValue(packages, "getPackages(...)");
        String jSMainModuleName = getJSMainModuleName();
        Intrinsics.checkNotNullExpressionValue(jSMainModuleName, "getJSMainModuleName(...)");
        String bundleAssetName = getBundleAssetName();
        if (bundleAssetName == null) {
            bundleAssetName = "index";
        }
        String str = bundleAssetName;
        String jSBundleFile = getJSBundleFile();
        Boolean boolIsHermesEnabled = isHermesEnabled();
        return DefaultReactHost.getDefaultReactHost$default(context, packages, jSMainModuleName, str, jSBundleFile, boolIsHermesEnabled != null ? boolIsHermesEnabled.booleanValue() : true, getUseDeveloperSupport(), null, 128, null);
    }

    @Override // com.facebook.react.ReactNativeHost
    @Nullable
    public JSEngineResolutionAlgorithm getJSEngineResolutionAlgorithm() {
        Boolean boolIsHermesEnabled = isHermesEnabled();
        if (Intrinsics.areEqual(boolIsHermesEnabled, Boolean.TRUE)) {
            return JSEngineResolutionAlgorithm.HERMES;
        }
        if (Intrinsics.areEqual(boolIsHermesEnabled, Boolean.FALSE)) {
            return JSEngineResolutionAlgorithm.JSC;
        }
        if (boolIsHermesEnabled == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.facebook.react.ReactNativeHost
    @Nullable
    public ReactPackageTurboModuleManagerDelegate.Builder getReactPackageTurboModuleManagerDelegateBuilder() {
        if (isNewArchEnabled()) {
            return new DefaultTurboModuleManagerDelegate.Builder();
        }
        return null;
    }

    @Override // com.facebook.react.ReactNativeHost
    @Nullable
    public UIManagerProvider getUIManagerProvider() {
        if (isNewArchEnabled()) {
            return new UIManagerProvider() { // from class: com.facebook.react.defaults.d
                @Override // com.facebook.react.bridge.UIManagerProvider
                public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                    return DefaultReactNativeHost.getUIManagerProvider$lambda$0(this.f9705a, reactApplicationContext);
                }
            };
        }
        return null;
    }
}
