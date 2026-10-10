package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.common.mapbuffer.MapBufferSoLoader;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.RNConstantKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FabricUIManagerBinding.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0082 J9\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 J!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086 Ja\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0086 J!\u0010%\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0086 J\u0011\u0010)\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0086 J\u0011\u0010*\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H\u0086 J\u0011\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u001cH\u0086 JQ\u0010-\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0086 J\t\u0010.\u001a\u00020\u0005H\u0086 J\t\u0010/\u001a\u00020\u0005H\u0086 J\u0011\u00100\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0086 J\u0015\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0086 J6\u00105\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u00106\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u000208J\t\u00109\u001a\u00020\u0005H\u0082 J\u0006\u0010:\u001a\u00020\u0005¨\u0006<"}, m90084d2 = {"Lcom/facebook/react/fabric/FabricUIManagerBinding;", "Lcom/facebook/jni/HybridClassBase;", "<init>", "()V", "initHybrid", "", "installFabricUIManager", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeScheduler", "Lcom/facebook/react/bridge/RuntimeScheduler;", "uiManager", "Lcom/facebook/react/fabric/FabricUIManager;", "eventBeatManager", "Lcom/facebook/react/fabric/events/EventBeatManager;", "componentsRegistry", "Lcom/facebook/react/fabric/ComponentFactory;", "reactNativeConfig", "", "startSurface", "surfaceId", "", RNConstantKt.PARAM_MODULE_NAME, "", "initialProps", "Lcom/facebook/react/bridge/NativeMap;", "startSurfaceWithConstraints", ViewProps.MIN_WIDTH, "", ViewProps.MAX_WIDTH, ViewProps.MIN_HEIGHT, ViewProps.MAX_HEIGHT, "offsetX", "offsetY", "isRTL", "", "doLeftAndRightSwapInRTL", "startSurfaceWithSurfaceHandler", "surfaceHandler", "Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "isMountable", "stopSurface", "stopSurfaceWithSurfaceHandler", "setPixelDensity", "pointScaleFactor", "setConstraints", "driveCxxAnimations", "drainPreallocateViewsQueue", "reportMount", "getInspectorDataForInstance", "Lcom/facebook/react/bridge/ReadableNativeMap;", "eventEmitterWrapper", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "register", "fabricUIManager", "componentFactory", "Lcom/facebook/react/fabric/ReactNativeConfig;", "uninstallFabricUIManager", "unregister", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SuppressLint({"MissingNativeLoadLibrary"})
@InterfaceC44695a
public final class FabricUIManagerBinding extends HybridClassBase {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: FabricUIManagerBinding.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/facebook/react/fabric/FabricUIManagerBinding$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final native void initHybrid();

    private final native void installFabricUIManager(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager uiManager, EventBeatManager eventBeatManager, ComponentFactory componentsRegistry, Object reactNativeConfig);

    private final native void uninstallFabricUIManager();

    public final native void drainPreallocateViewsQueue();

    public final native void driveCxxAnimations();

    @Nullable
    public final native ReadableNativeMap getInspectorDataForInstance(@Nullable EventEmitterWrapper eventEmitterWrapper);

    public final native void reportMount(int surfaceId);

    public final native void setConstraints(int surfaceId, float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean isRTL, boolean doLeftAndRightSwapInRTL);

    public final native void setPixelDensity(float pointScaleFactor);

    public final native void startSurface(int surfaceId, @NotNull String moduleName, @NotNull NativeMap initialProps);

    public final native void startSurfaceWithConstraints(int surfaceId, @NotNull String moduleName, @NotNull NativeMap initialProps, float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean isRTL, boolean doLeftAndRightSwapInRTL);

    public final native void startSurfaceWithSurfaceHandler(int surfaceId, @NotNull SurfaceHandlerBinding surfaceHandler, boolean isMountable);

    public final native void stopSurface(int surfaceId);

    public final native void stopSurfaceWithSurfaceHandler(@NotNull SurfaceHandlerBinding surfaceHandler);

    static {
        FabricSoLoader.staticInit();
        MapBufferSoLoader.staticInit();
    }

    public FabricUIManagerBinding() {
        initHybrid();
    }

    public final void register(@NotNull RuntimeExecutor runtimeExecutor, @NotNull RuntimeScheduler runtimeScheduler, @NotNull FabricUIManager fabricUIManager, @NotNull EventBeatManager eventBeatManager, @NotNull ComponentFactory componentFactory, @NotNull ReactNativeConfig reactNativeConfig) {
        Intrinsics.checkNotNullParameter(runtimeExecutor, "runtimeExecutor");
        Intrinsics.checkNotNullParameter(runtimeScheduler, "runtimeScheduler");
        Intrinsics.checkNotNullParameter(fabricUIManager, "fabricUIManager");
        Intrinsics.checkNotNullParameter(eventBeatManager, "eventBeatManager");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        Intrinsics.checkNotNullParameter(reactNativeConfig, "reactNativeConfig");
        fabricUIManager.setBinding(this);
        installFabricUIManager(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, componentFactory, reactNativeConfig);
        setPixelDensity(PixelUtil.getDisplayMetricDensity());
    }

    public final void unregister() {
        uninstallFabricUIManager();
    }
}
