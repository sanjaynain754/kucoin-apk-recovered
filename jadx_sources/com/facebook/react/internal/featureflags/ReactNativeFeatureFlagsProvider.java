package com.facebook.react.internal.featureflags;

import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ReactNativeFeatureFlagsProvider.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0005\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0003H'J\b\u0010\u0007\u001a\u00020\u0003H'J\b\u0010\b\u001a\u00020\u0003H'J\b\u0010\t\u001a\u00020\u0003H'J\b\u0010\n\u001a\u00020\u0003H'J\b\u0010\u000b\u001a\u00020\u0003H'J\b\u0010\f\u001a\u00020\u0003H'J\b\u0010\r\u001a\u00020\u0003H'J\b\u0010\u000e\u001a\u00020\u0003H'J\b\u0010\u000f\u001a\u00020\u0003H'J\b\u0010\u0010\u001a\u00020\u0003H'J\b\u0010\u0011\u001a\u00020\u0003H'J\b\u0010\u0012\u001a\u00020\u0003H'J\b\u0010\u0013\u001a\u00020\u0003H'J\b\u0010\u0014\u001a\u00020\u0003H'J\b\u0010\u0015\u001a\u00020\u0003H'J\b\u0010\u0016\u001a\u00020\u0003H'J\b\u0010\u0017\u001a\u00020\u0003H'J\b\u0010\u0018\u001a\u00020\u0003H'J\b\u0010\u0019\u001a\u00020\u0003H'J\b\u0010\u001a\u001a\u00020\u0003H'J\b\u0010\u001b\u001a\u00020\u0003H'J\b\u0010\u001c\u001a\u00020\u0003H'J\b\u0010\u001d\u001a\u00020\u0003H'J\b\u0010\u001e\u001a\u00020\u0003H'J\b\u0010\u001f\u001a\u00020\u0003H'J\b\u0010 \u001a\u00020\u0003H'J\b\u0010!\u001a\u00020\u0003H'J\b\u0010\"\u001a\u00020\u0003H'J\b\u0010#\u001a\u00020\u0003H'J\b\u0010$\u001a\u00020\u0003H'J\b\u0010%\u001a\u00020\u0003H'J\b\u0010&\u001a\u00020\u0003H'J\b\u0010'\u001a\u00020\u0003H'J\b\u0010(\u001a\u00020\u0003H'J\b\u0010)\u001a\u00020\u0003H'J\b\u0010*\u001a\u00020\u0003H'J\b\u0010+\u001a\u00020\u0003H'J\b\u0010,\u001a\u00020\u0003H'J\b\u0010-\u001a\u00020\u0003H'J\b\u0010.\u001a\u00020\u0003H'J\b\u0010/\u001a\u00020\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "", "commonTestFlag", "", "completeReactInstanceCreationOnBgThreadOnAndroid", "disableEventLoopOnBridgeless", "disableMountItemReorderingAndroid", "enableAlignItemsBaselineOnFabricIOS", "enableAndroidLineHeightCentering", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableDeletionOfUnmountedViews", "enableEagerRootViewAttachment", "enableEventEmitterRetentionDuringGesturesOnAndroid", "enableFabricLogs", "enableFabricRenderer", "enableFabricRendererExclusively", "enableFixForViewCommandRace", "enableGranularShadowTreeStateReconciliation", "enableIOSViewClipToPaddingBox", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableLongTaskAPI", "enableNewBackgroundAndBorderDrawables", "enablePreciseSchedulingForPremountItemsOnAndroid", "enablePropsUpdateReconciliationAndroid", "enableReportEventPaintTime", "enableSynchronousStateUpdates", "enableUIConsistency", "enableViewRecycling", "excludeYogaFromRawProps", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixMountingCoordinatorReportedPendingTransactionsOnAndroid", "fuseboxEnabledDebug", "fuseboxEnabledRelease", "initEagerTurboModulesOnNativeModulesQueueAndroid", "lazyAnimationCallbacks", "loadVectorDrawablesOnImages", "traceTurboModulePromiseRejectionsOnAndroid", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useImmediateExecutorInAndroidBridgeless", "useNativeViewConfigsInBridgelessMode", "useOptimisedViewPreallocationOnAndroid", "useOptimizedEventBatchingOnAndroid", "useRuntimeShadowNodeReferenceUpdate", "useTurboModuleInterop", "useTurboModules", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44695a
public interface ReactNativeFeatureFlagsProvider {
    @InterfaceC44695a
    boolean commonTestFlag();

    @InterfaceC44695a
    boolean completeReactInstanceCreationOnBgThreadOnAndroid();

    @InterfaceC44695a
    boolean disableEventLoopOnBridgeless();

    @InterfaceC44695a
    boolean disableMountItemReorderingAndroid();

    @InterfaceC44695a
    boolean enableAlignItemsBaselineOnFabricIOS();

    @InterfaceC44695a
    boolean enableAndroidLineHeightCentering();

    @InterfaceC44695a
    boolean enableBridgelessArchitecture();

    @InterfaceC44695a
    boolean enableCppPropsIteratorSetter();

    @InterfaceC44695a
    boolean enableDeletionOfUnmountedViews();

    @InterfaceC44695a
    boolean enableEagerRootViewAttachment();

    @InterfaceC44695a
    boolean enableEventEmitterRetentionDuringGesturesOnAndroid();

    @InterfaceC44695a
    boolean enableFabricLogs();

    @InterfaceC44695a
    boolean enableFabricRenderer();

    @InterfaceC44695a
    boolean enableFabricRendererExclusively();

    @InterfaceC44695a
    boolean enableFixForViewCommandRace();

    @InterfaceC44695a
    boolean enableGranularShadowTreeStateReconciliation();

    @InterfaceC44695a
    boolean enableIOSViewClipToPaddingBox();

    @InterfaceC44695a
    boolean enableLayoutAnimationsOnAndroid();

    @InterfaceC44695a
    boolean enableLayoutAnimationsOnIOS();

    @InterfaceC44695a
    boolean enableLongTaskAPI();

    @InterfaceC44695a
    boolean enableNewBackgroundAndBorderDrawables();

    @InterfaceC44695a
    boolean enablePreciseSchedulingForPremountItemsOnAndroid();

    @InterfaceC44695a
    boolean enablePropsUpdateReconciliationAndroid();

    @InterfaceC44695a
    boolean enableReportEventPaintTime();

    @InterfaceC44695a
    boolean enableSynchronousStateUpdates();

    @InterfaceC44695a
    boolean enableUIConsistency();

    @InterfaceC44695a
    boolean enableViewRecycling();

    @InterfaceC44695a
    boolean excludeYogaFromRawProps();

    @InterfaceC44695a
    boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @InterfaceC44695a
    boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid();

    @InterfaceC44695a
    boolean fuseboxEnabledDebug();

    @InterfaceC44695a
    boolean fuseboxEnabledRelease();

    @InterfaceC44695a
    boolean initEagerTurboModulesOnNativeModulesQueueAndroid();

    @InterfaceC44695a
    boolean lazyAnimationCallbacks();

    @InterfaceC44695a
    boolean loadVectorDrawablesOnImages();

    @InterfaceC44695a
    boolean traceTurboModulePromiseRejectionsOnAndroid();

    @InterfaceC44695a
    boolean useAlwaysAvailableJSErrorHandling();

    @InterfaceC44695a
    boolean useFabricInterop();

    @InterfaceC44695a
    boolean useImmediateExecutorInAndroidBridgeless();

    @InterfaceC44695a
    boolean useNativeViewConfigsInBridgelessMode();

    @InterfaceC44695a
    boolean useOptimisedViewPreallocationOnAndroid();

    @InterfaceC44695a
    boolean useOptimizedEventBatchingOnAndroid();

    @InterfaceC44695a
    boolean useRuntimeShadowNodeReferenceUpdate();

    @InterfaceC44695a
    boolean useTurboModuleInterop();

    @InterfaceC44695a
    boolean useTurboModules();
}
