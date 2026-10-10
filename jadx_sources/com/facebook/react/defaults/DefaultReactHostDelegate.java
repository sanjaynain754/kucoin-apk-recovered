package com.facebook.react.defaults;

import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostDelegate;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.google.firebase.messaging.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultReactHostDelegate.kt */
/* JADX INFO: loaded from: classes45.dex */
@DoNotStrip
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010$\u001a\u00020\u000eH\u0016J\u0014\u0010%\u001a\u00020\u00132\n\u0010&\u001a\u00060\u0011j\u0002`\u0012H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006'"}, m90084d2 = {"Lcom/facebook/react/defaults/DefaultReactHostDelegate;", "Lcom/facebook/react/runtime/ReactHostDelegate;", "jsMainModulePath", "", "jsBundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "reactPackages", "", "Lcom/facebook/react/ReactPackage;", "jsRuntimeFactory", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "bindingsInstaller", "Lcom/facebook/react/runtime/BindingsInstaller;", "reactNativeConfig", "Lcom/facebook/react/fabric/ReactNativeConfig;", "exceptionHandler", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "turboModuleManagerDelegateBuilder", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/util/List;Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/fabric/ReactNativeConfig;Lkotlin/jvm/functions/Function1;Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;)V", "getJsMainModulePath", "()Ljava/lang/String;", "getJsBundleLoader", "()Lcom/facebook/react/bridge/JSBundleLoader;", "getReactPackages", "()Ljava/util/List;", "getJsRuntimeFactory", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "getTurboModuleManagerDelegateBuilder", "()Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "getReactNativeConfig", "handleInstanceException", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@UnstableReactNativeAPI
public final class DefaultReactHostDelegate implements ReactHostDelegate {

    @Nullable
    private final BindingsInstaller bindingsInstaller;

    @NotNull
    private final Function1<Exception, Unit> exceptionHandler;

    @NotNull
    private final JSBundleLoader jsBundleLoader;

    @NotNull
    private final String jsMainModulePath;

    @NotNull
    private final JSRuntimeFactory jsRuntimeFactory;

    @NotNull
    private final ReactNativeConfig reactNativeConfig;

    @NotNull
    private final List<ReactPackage> reactPackages;

    @NotNull
    private final ReactPackageTurboModuleManagerDelegate.Builder turboModuleManagerDelegateBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultReactHostDelegate(@NotNull String jsMainModulePath, @NotNull JSBundleLoader jsBundleLoader, @NotNull List<? extends ReactPackage> reactPackages, @NotNull JSRuntimeFactory jsRuntimeFactory, @Nullable BindingsInstaller bindingsInstaller, @NotNull ReactNativeConfig reactNativeConfig, @NotNull Function1<? super Exception, Unit> exceptionHandler, @NotNull ReactPackageTurboModuleManagerDelegate.Builder turboModuleManagerDelegateBuilder) {
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleLoader, "jsBundleLoader");
        Intrinsics.checkNotNullParameter(reactPackages, "reactPackages");
        Intrinsics.checkNotNullParameter(jsRuntimeFactory, "jsRuntimeFactory");
        Intrinsics.checkNotNullParameter(reactNativeConfig, "reactNativeConfig");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        Intrinsics.checkNotNullParameter(turboModuleManagerDelegateBuilder, "turboModuleManagerDelegateBuilder");
        this.jsMainModulePath = jsMainModulePath;
        this.jsBundleLoader = jsBundleLoader;
        this.reactPackages = reactPackages;
        this.jsRuntimeFactory = jsRuntimeFactory;
        this.bindingsInstaller = bindingsInstaller;
        this.reactNativeConfig = reactNativeConfig;
        this.exceptionHandler = exceptionHandler;
        this.turboModuleManagerDelegateBuilder = turboModuleManagerDelegateBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(Exception it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @Nullable
    public BindingsInstaller getBindingsInstaller() {
        return this.bindingsInstaller;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public JSBundleLoader getJsBundleLoader() {
        return this.jsBundleLoader;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public String getJsMainModulePath() {
        return this.jsMainModulePath;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public JSRuntimeFactory getJsRuntimeFactory() {
        return this.jsRuntimeFactory;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public ReactNativeConfig getReactNativeConfig() {
        return this.reactNativeConfig;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public List<ReactPackage> getReactPackages() {
        return this.reactPackages;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    @NotNull
    public ReactPackageTurboModuleManagerDelegate.Builder getTurboModuleManagerDelegateBuilder() {
        return this.turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public void handleInstanceException(@NotNull Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.exceptionHandler.invoke(error);
    }

    public /* synthetic */ DefaultReactHostDelegate(String str, JSBundleLoader jSBundleLoader, List list, JSRuntimeFactory jSRuntimeFactory, BindingsInstaller bindingsInstaller, ReactNativeConfig reactNativeConfig, Function1 function1, ReactPackageTurboModuleManagerDelegate.Builder builder, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jSBundleLoader, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list, (i11 & 8) != 0 ? new HermesInstance() : jSRuntimeFactory, (i11 & 16) != 0 ? null : bindingsInstaller, (i11 & 32) != 0 ? ReactNativeConfig.DEFAULT_CONFIG : reactNativeConfig, (i11 & 64) != 0 ? new Function1() { // from class: com.facebook.react.defaults.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultReactHostDelegate._init_$lambda$0((Exception) obj);
            }
        } : function1, builder);
    }
}
