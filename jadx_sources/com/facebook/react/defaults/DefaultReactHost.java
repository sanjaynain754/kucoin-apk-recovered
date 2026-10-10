package com.facebook.react.defaults;

import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.JSCInstance;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.cxxreactpackage.CxxReactPackage;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: DefaultReactHost.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jn\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\nH\u0007J\u0084\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0014H\u0007J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/react/defaults/DefaultReactHost;", "", "<init>", "()V", "reactHost", "Lcom/facebook/react/ReactHost;", "getDefaultReactHost", "context", "Landroid/content/Context;", "packageList", "", "Lcom/facebook/react/ReactPackage;", "jsMainModulePath", "", "jsBundleAssetPath", "jsBundleFilePath", "isHermesEnabled", "", "useDevSupport", "cxxReactPackageProviders", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/runtime/cxxreactpackage/CxxReactPackage;", "exceptionHandler", "Ljava/lang/Exception;", "", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultReactHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultReactHost.kt\ncom/facebook/react/defaults/DefaultReactHost\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n1863#2,2:174\n*S KotlinDebug\n*F\n+ 1 DefaultReactHost.kt\ncom/facebook/react/defaults/DefaultReactHost\n*L\n124#1:174,2\n*E\n"})
public final class DefaultReactHost {

    @NotNull
    public static final DefaultReactHost INSTANCE = new DefaultReactHost();

    @Nullable
    private static ReactHost reactHost;

    @JvmStatic
    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull List<? extends ReactPackage> packageList, @NotNull String jsMainModulePath, @NotNull String jsBundleAssetPath, @Nullable String jsBundleFilePath, boolean isHermesEnabled, boolean useDevSupport, @NotNull List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>> cxxReactPackageProviders) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleAssetPath, "jsBundleAssetPath");
        Intrinsics.checkNotNullParameter(cxxReactPackageProviders, "cxxReactPackageProviders");
        return getDefaultReactHost(context, packageList, jsMainModulePath, jsBundleAssetPath, jsBundleFilePath, isHermesEnabled, useDevSupport, cxxReactPackageProviders, new Function1() { // from class: com.facebook.react.defaults.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultReactHost.getDefaultReactHost$lambda$0((Exception) obj);
            }
        });
    }

    public static /* synthetic */ ReactHost getDefaultReactHost$default(Context context, List list, String str, String str2, String str3, boolean z11, boolean z12, List list2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "index";
        }
        if ((i11 & 8) != 0) {
            str2 = "index";
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        if ((i11 & 32) != 0) {
            z11 = true;
        }
        if ((i11 & 64) != 0) {
            z12 = ReactBuildConfig.DEBUG;
        }
        if ((i11 & 128) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return getDefaultReactHost(context, list, str, str2, str3, z11, z12, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultReactHost$lambda$0(Exception it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultReactHost$lambda$1(Exception it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }

    private DefaultReactHost() {
    }

    @JvmStatic
    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull List<? extends ReactPackage> packageList, @NotNull String jsMainModulePath, @NotNull String jsBundleAssetPath, @Nullable String jsBundleFilePath, boolean isHermesEnabled, boolean useDevSupport, @NotNull List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>> cxxReactPackageProviders, @NotNull Function1<? super Exception, Unit> exceptionHandler) {
        JSBundleLoader jSBundleLoaderCreateAssetLoader;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleAssetPath, "jsBundleAssetPath");
        Intrinsics.checkNotNullParameter(cxxReactPackageProviders, "cxxReactPackageProviders");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        if (reactHost == null) {
            if (jsBundleFilePath != null) {
                if (StringsKt.startsWith$default(jsBundleFilePath, "assets://", false, 2, (Object) null)) {
                    jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(context, jsBundleFilePath, true);
                } else {
                    jSBundleLoaderCreateAssetLoader = JSBundleLoader.createFileLoader(jsBundleFilePath);
                }
            } else {
                jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(context, "assets://" + jsBundleAssetPath, true);
            }
            JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
            JSRuntimeFactory hermesInstance = isHermesEnabled ? new HermesInstance() : new JSCInstance();
            DefaultTurboModuleManagerDelegate.Builder builder = new DefaultTurboModuleManagerDelegate.Builder();
            Iterator<T> it = cxxReactPackageProviders.iterator();
            while (it.hasNext()) {
                builder.addCxxReactPackage((Function1<? super ReactApplicationContext, ? extends CxxReactPackage>) it.next());
            }
            Intrinsics.checkNotNull(jSBundleLoader);
            DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate(jsMainModulePath, jSBundleLoader, packageList, hermesInstance, null, null, exceptionHandler, builder, 48, null);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            reactHost = new ReactHostImpl(context, defaultReactHostDelegate, componentFactory, true, useDevSupport);
        }
        ReactHost reactHost2 = reactHost;
        Intrinsics.checkNotNull(reactHost2, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return reactHost2;
    }

    public static /* synthetic */ ReactHost getDefaultReactHost$default(Context context, List list, String str, String str2, String str3, boolean z11, boolean z12, List list2, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "index";
        }
        if ((i11 & 8) != 0) {
            str2 = "index";
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        if ((i11 & 32) != 0) {
            z11 = true;
        }
        if ((i11 & 64) != 0) {
            z12 = ReactBuildConfig.DEBUG;
        }
        if ((i11 & 128) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if ((i11 & 256) != 0) {
            function1 = new Function1() { // from class: com.facebook.react.defaults.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DefaultReactHost.getDefaultReactHost$lambda$1((Exception) obj2);
                }
            };
        }
        return getDefaultReactHost(context, list, str, str2, str3, z11, z12, list2, function1);
    }

    @JvmStatic
    @NotNull
    public static final ReactHost getDefaultReactHost(@NotNull Context context, @NotNull ReactNativeHost reactNativeHost) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
        if (reactNativeHost instanceof DefaultReactNativeHost) {
            return ((DefaultReactNativeHost) reactNativeHost).toReactHost$ReactAndroid_release(context);
        }
        throw new IllegalArgumentException("You can call getDefaultReactHost only with instances of DefaultReactNativeHost");
    }
}
