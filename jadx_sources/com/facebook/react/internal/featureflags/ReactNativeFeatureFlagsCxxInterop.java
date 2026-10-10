package com.facebook.react.internal.featureflags;

import com.facebook.soloader.SoLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: ReactNativeFeatureFlagsCxxInterop.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 J\t\u0010\u0006\u001a\u00020\u0005H\u0087 J\t\u0010\u0007\u001a\u00020\u0005H\u0087 J\t\u0010\b\u001a\u00020\u0005H\u0087 J\t\u0010\t\u001a\u00020\u0005H\u0087 J\t\u0010\n\u001a\u00020\u0005H\u0087 J\t\u0010\u000b\u001a\u00020\u0005H\u0087 J\t\u0010\f\u001a\u00020\u0005H\u0087 J\t\u0010\r\u001a\u00020\u0005H\u0087 J\t\u0010\u000e\u001a\u00020\u0005H\u0087 J\t\u0010\u000f\u001a\u00020\u0005H\u0087 J\t\u0010\u0010\u001a\u00020\u0005H\u0087 J\t\u0010\u0011\u001a\u00020\u0005H\u0087 J\t\u0010\u0012\u001a\u00020\u0005H\u0087 J\t\u0010\u0013\u001a\u00020\u0005H\u0087 J\t\u0010\u0014\u001a\u00020\u0005H\u0087 J\t\u0010\u0015\u001a\u00020\u0005H\u0087 J\t\u0010\u0016\u001a\u00020\u0005H\u0087 J\t\u0010\u0017\u001a\u00020\u0005H\u0087 J\t\u0010\u0018\u001a\u00020\u0005H\u0087 J\t\u0010\u0019\u001a\u00020\u0005H\u0087 J\t\u0010\u001a\u001a\u00020\u0005H\u0087 J\t\u0010\u001b\u001a\u00020\u0005H\u0087 J\t\u0010\u001c\u001a\u00020\u0005H\u0087 J\t\u0010\u001d\u001a\u00020\u0005H\u0087 J\t\u0010\u001e\u001a\u00020\u0005H\u0087 J\t\u0010\u001f\u001a\u00020\u0005H\u0087 J\t\u0010 \u001a\u00020\u0005H\u0087 J\t\u0010!\u001a\u00020\u0005H\u0087 J\t\u0010\"\u001a\u00020\u0005H\u0087 J\t\u0010#\u001a\u00020\u0005H\u0087 J\t\u0010$\u001a\u00020\u0005H\u0087 J\t\u0010%\u001a\u00020\u0005H\u0087 J\t\u0010&\u001a\u00020\u0005H\u0087 J\t\u0010'\u001a\u00020\u0005H\u0087 J\t\u0010(\u001a\u00020\u0005H\u0087 J\t\u0010)\u001a\u00020\u0005H\u0087 J\t\u0010*\u001a\u00020\u0005H\u0087 J\t\u0010+\u001a\u00020\u0005H\u0087 J\t\u0010,\u001a\u00020\u0005H\u0087 J\t\u0010-\u001a\u00020\u0005H\u0087 J\t\u0010.\u001a\u00020\u0005H\u0087 J\t\u0010/\u001a\u00020\u0005H\u0087 J\t\u00100\u001a\u00020\u0005H\u0087 J\t\u00101\u001a\u00020\u0005H\u0087 J\u0011\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0001H\u0087 J\t\u00105\u001a\u000203H\u0087 J\u0013\u00106\u001a\u0004\u0018\u0001072\u0006\u00104\u001a\u00020\u0001H\u0087 ¨\u00068"}, m90084d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;", "", "<init>", "()V", "commonTestFlag", "", "completeReactInstanceCreationOnBgThreadOnAndroid", "disableEventLoopOnBridgeless", "disableMountItemReorderingAndroid", "enableAlignItemsBaselineOnFabricIOS", "enableAndroidLineHeightCentering", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableDeletionOfUnmountedViews", "enableEagerRootViewAttachment", "enableEventEmitterRetentionDuringGesturesOnAndroid", "enableFabricLogs", "enableFabricRenderer", "enableFabricRendererExclusively", "enableFixForViewCommandRace", "enableGranularShadowTreeStateReconciliation", "enableIOSViewClipToPaddingBox", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableLongTaskAPI", "enableNewBackgroundAndBorderDrawables", "enablePreciseSchedulingForPremountItemsOnAndroid", "enablePropsUpdateReconciliationAndroid", "enableReportEventPaintTime", "enableSynchronousStateUpdates", "enableUIConsistency", "enableViewRecycling", "excludeYogaFromRawProps", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixMountingCoordinatorReportedPendingTransactionsOnAndroid", "fuseboxEnabledDebug", "fuseboxEnabledRelease", "initEagerTurboModulesOnNativeModulesQueueAndroid", "lazyAnimationCallbacks", "loadVectorDrawablesOnImages", "traceTurboModulePromiseRejectionsOnAndroid", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useImmediateExecutorInAndroidBridgeless", "useNativeViewConfigsInBridgelessMode", "useOptimisedViewPreallocationOnAndroid", "useOptimizedEventBatchingOnAndroid", "useRuntimeShadowNodeReferenceUpdate", "useTurboModuleInterop", "useTurboModules", "override", "", "provider", "dangerouslyReset", "dangerouslyForceOverride", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44695a
public final class ReactNativeFeatureFlagsCxxInterop {

    @NotNull
    public static final ReactNativeFeatureFlagsCxxInterop INSTANCE = new ReactNativeFeatureFlagsCxxInterop();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean commonTestFlag();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean completeReactInstanceCreationOnBgThreadOnAndroid();

    @JvmStatic
    @Nullable
    @InterfaceC44695a
    public static final native String dangerouslyForceOverride(@NotNull Object provider);

    @JvmStatic
    @InterfaceC44695a
    public static final native void dangerouslyReset();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean disableEventLoopOnBridgeless();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean disableMountItemReorderingAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableAlignItemsBaselineOnFabricIOS();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableAndroidLineHeightCentering();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableBridgelessArchitecture();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableCppPropsIteratorSetter();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableDeletionOfUnmountedViews();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableEagerRootViewAttachment();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableEventEmitterRetentionDuringGesturesOnAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableFabricLogs();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableFabricRenderer();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableFabricRendererExclusively();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableFixForViewCommandRace();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableGranularShadowTreeStateReconciliation();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableIOSViewClipToPaddingBox();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableLayoutAnimationsOnAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableLayoutAnimationsOnIOS();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableLongTaskAPI();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableNewBackgroundAndBorderDrawables();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enablePreciseSchedulingForPremountItemsOnAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enablePropsUpdateReconciliationAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableReportEventPaintTime();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableSynchronousStateUpdates();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableUIConsistency();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean enableViewRecycling();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean excludeYogaFromRawProps();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean fuseboxEnabledDebug();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean fuseboxEnabledRelease();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean initEagerTurboModulesOnNativeModulesQueueAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean lazyAnimationCallbacks();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean loadVectorDrawablesOnImages();

    @JvmStatic
    @InterfaceC44695a
    public static final native void override(@NotNull Object provider);

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean useAlwaysAvailableJSErrorHandling();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean useFabricInterop();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean useImmediateExecutorInAndroidBridgeless();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean useNativeViewConfigsInBridgelessMode();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean useOptimisedViewPreallocationOnAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean useOptimizedEventBatchingOnAndroid();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean useRuntimeShadowNodeReferenceUpdate();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean useTurboModuleInterop();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean useTurboModules();

    static {
        SoLoader.loadLibrary("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }
}
