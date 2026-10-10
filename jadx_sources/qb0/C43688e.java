package qb0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qb0.e */
/* JADX INFO: compiled from: RNGestureHandlerPackage.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\nJ)\u0010\u0011\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R'\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lqb0/e;", "Lcom/facebook/react/BaseReactPackage;", "Lcom/facebook/react/ViewManagerOnDemandReactPackage;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "", "getViewManagerNames", "", "Lcom/facebook/react/bridge/ModuleSpec;", "getViewManagers", "viewManagerName", "createViewManager", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;", "name", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "getReactModuleInfoProvider", "()Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/Lazy;", "f", "()Ljava/util/Map;", "viewManagers", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43688e extends BaseReactPackage implements ViewManagerOnDemandReactPackage {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewManagers = LazyKt.lazy(new Function0() { // from class: qb0.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43688e.m96200g();
        }
    });

    /* JADX INFO: renamed from: e */
    public static final Map m96199e() {
        Annotation annotation = RNGestureHandlerModule.class.getAnnotation(ReactModule.class);
        Intrinsics.checkNotNull(annotation);
        ReactModule reactModule = (ReactModule) annotation;
        String strName = reactModule.name();
        String name = RNGestureHandlerModule.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return MapsKt.mutableMapOf(TuplesKt.m90091to("RNGestureHandlerModule", new ReactModuleInfo(strName, name, reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.isCxxModule(), true)));
    }

    /* JADX INFO: renamed from: g */
    public static final Map m96200g() {
        return MapsKt.mapOf(TuplesKt.m90091to(RNGestureHandlerRootViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: qb0.c
            @Override // javax.inject.Provider
            public final Object get() {
                return C43688e.m96201h();
            }
        })), TuplesKt.m90091to(RNGestureHandlerButtonViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new Provider() { // from class: qb0.d
            @Override // javax.inject.Provider
            public final Object get() {
                return C43688e.m96202i();
            }
        })));
    }

    /* JADX INFO: renamed from: h */
    public static final NativeModule m96201h() {
        return new RNGestureHandlerRootViewManager();
    }

    /* JADX INFO: renamed from: i */
    public static final NativeModule m96202i() {
        return new RNGestureHandlerButtonViewManager();
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, ModuleSpec> m96203f() {
        return (Map) this.viewManagers.getValue();
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() throws InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (ReactModuleInfoProvider) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new ReactModuleInfoProvider() { // from class: qb0.b
                @Override // com.facebook.react.module.model.ReactModuleInfoProvider
                public final Map getReactModuleInfos() {
                    return C43688e.m96199e();
                }
            };
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e12);
        }
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    @NotNull
    public List<String> getViewManagerNames(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.toList(m96203f().keySet());
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    @Nullable
    public ViewManager<?, ?> createViewManager(@NotNull ReactApplicationContext reactContext, @NotNull String viewManagerName) {
        NativeModule nativeModule;
        Provider<? extends NativeModule> provider;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = m96203f().get(viewManagerName);
        if (moduleSpec != null && (provider = moduleSpec.getProvider()) != null) {
            nativeModule = provider.get();
        } else {
            nativeModule = null;
        }
        if (!(nativeModule instanceof ViewManager)) {
            return null;
        }
        return (ViewManager) nativeModule;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @NotNull
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.listOf((Object[]) new ViewManager[]{new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager()});
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(@NotNull String name, @NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.areEqual(name, "RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public List<ModuleSpec> getViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.toMutableList((Collection) m96203f().values());
    }
}
