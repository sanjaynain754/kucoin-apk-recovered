.class public interface abstract Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;
.super Ljava/lang/Object;
.source "ReactNativeFeatureFlagsProvider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008-\u0008g\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\'J\u0008\u0010\u0004\u001a\u00020\u0003H\'J\u0008\u0010\u0005\u001a\u00020\u0003H\'J\u0008\u0010\u0006\u001a\u00020\u0003H\'J\u0008\u0010\u0007\u001a\u00020\u0003H\'J\u0008\u0010\u0008\u001a\u00020\u0003H\'J\u0008\u0010\t\u001a\u00020\u0003H\'J\u0008\u0010\n\u001a\u00020\u0003H\'J\u0008\u0010\u000b\u001a\u00020\u0003H\'J\u0008\u0010\u000c\u001a\u00020\u0003H\'J\u0008\u0010\r\u001a\u00020\u0003H\'J\u0008\u0010\u000e\u001a\u00020\u0003H\'J\u0008\u0010\u000f\u001a\u00020\u0003H\'J\u0008\u0010\u0010\u001a\u00020\u0003H\'J\u0008\u0010\u0011\u001a\u00020\u0003H\'J\u0008\u0010\u0012\u001a\u00020\u0003H\'J\u0008\u0010\u0013\u001a\u00020\u0003H\'J\u0008\u0010\u0014\u001a\u00020\u0003H\'J\u0008\u0010\u0015\u001a\u00020\u0003H\'J\u0008\u0010\u0016\u001a\u00020\u0003H\'J\u0008\u0010\u0017\u001a\u00020\u0003H\'J\u0008\u0010\u0018\u001a\u00020\u0003H\'J\u0008\u0010\u0019\u001a\u00020\u0003H\'J\u0008\u0010\u001a\u001a\u00020\u0003H\'J\u0008\u0010\u001b\u001a\u00020\u0003H\'J\u0008\u0010\u001c\u001a\u00020\u0003H\'J\u0008\u0010\u001d\u001a\u00020\u0003H\'J\u0008\u0010\u001e\u001a\u00020\u0003H\'J\u0008\u0010\u001f\u001a\u00020\u0003H\'J\u0008\u0010 \u001a\u00020\u0003H\'J\u0008\u0010!\u001a\u00020\u0003H\'J\u0008\u0010\"\u001a\u00020\u0003H\'J\u0008\u0010#\u001a\u00020\u0003H\'J\u0008\u0010$\u001a\u00020\u0003H\'J\u0008\u0010%\u001a\u00020\u0003H\'J\u0008\u0010&\u001a\u00020\u0003H\'J\u0008\u0010\'\u001a\u00020\u0003H\'J\u0008\u0010(\u001a\u00020\u0003H\'J\u0008\u0010)\u001a\u00020\u0003H\'J\u0008\u0010*\u001a\u00020\u0003H\'J\u0008\u0010+\u001a\u00020\u0003H\'J\u0008\u0010,\u001a\u00020\u0003H\'J\u0008\u0010-\u001a\u00020\u0003H\'J\u0008\u0010.\u001a\u00020\u0003H\'J\u0008\u0010/\u001a\u00020\u0003H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00060\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;",
        "",
        "commonTestFlag",
        "",
        "completeReactInstanceCreationOnBgThreadOnAndroid",
        "disableEventLoopOnBridgeless",
        "disableMountItemReorderingAndroid",
        "enableAlignItemsBaselineOnFabricIOS",
        "enableAndroidLineHeightCentering",
        "enableBridgelessArchitecture",
        "enableCppPropsIteratorSetter",
        "enableDeletionOfUnmountedViews",
        "enableEagerRootViewAttachment",
        "enableEventEmitterRetentionDuringGesturesOnAndroid",
        "enableFabricLogs",
        "enableFabricRenderer",
        "enableFabricRendererExclusively",
        "enableFixForViewCommandRace",
        "enableGranularShadowTreeStateReconciliation",
        "enableIOSViewClipToPaddingBox",
        "enableLayoutAnimationsOnAndroid",
        "enableLayoutAnimationsOnIOS",
        "enableLongTaskAPI",
        "enableNewBackgroundAndBorderDrawables",
        "enablePreciseSchedulingForPremountItemsOnAndroid",
        "enablePropsUpdateReconciliationAndroid",
        "enableReportEventPaintTime",
        "enableSynchronousStateUpdates",
        "enableUIConsistency",
        "enableViewRecycling",
        "excludeYogaFromRawProps",
        "fixMappingOfEventPrioritiesBetweenFabricAndReact",
        "fixMountingCoordinatorReportedPendingTransactionsOnAndroid",
        "fuseboxEnabledDebug",
        "fuseboxEnabledRelease",
        "initEagerTurboModulesOnNativeModulesQueueAndroid",
        "lazyAnimationCallbacks",
        "loadVectorDrawablesOnImages",
        "traceTurboModulePromiseRejectionsOnAndroid",
        "useAlwaysAvailableJSErrorHandling",
        "useFabricInterop",
        "useImmediateExecutorInAndroidBridgeless",
        "useNativeViewConfigsInBridgelessMode",
        "useOptimisedViewPreallocationOnAndroid",
        "useOptimizedEventBatchingOnAndroid",
        "useRuntimeShadowNodeReferenceUpdate",
        "useTurboModuleInterop",
        "useTurboModules",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lt6/a;
.end annotation


# virtual methods
.method public abstract commonTestFlag()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract completeReactInstanceCreationOnBgThreadOnAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract disableEventLoopOnBridgeless()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract disableMountItemReorderingAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableAlignItemsBaselineOnFabricIOS()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableAndroidLineHeightCentering()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableBridgelessArchitecture()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableCppPropsIteratorSetter()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableDeletionOfUnmountedViews()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableEagerRootViewAttachment()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableEventEmitterRetentionDuringGesturesOnAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableFabricLogs()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableFabricRenderer()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableFabricRendererExclusively()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableFixForViewCommandRace()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableGranularShadowTreeStateReconciliation()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableIOSViewClipToPaddingBox()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableLayoutAnimationsOnAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableLayoutAnimationsOnIOS()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableLongTaskAPI()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableNewBackgroundAndBorderDrawables()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enablePreciseSchedulingForPremountItemsOnAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enablePropsUpdateReconciliationAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableReportEventPaintTime()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableSynchronousStateUpdates()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableUIConsistency()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract enableViewRecycling()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract excludeYogaFromRawProps()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract fixMappingOfEventPrioritiesBetweenFabricAndReact()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract fixMountingCoordinatorReportedPendingTransactionsOnAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract fuseboxEnabledDebug()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract fuseboxEnabledRelease()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract initEagerTurboModulesOnNativeModulesQueueAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract lazyAnimationCallbacks()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract loadVectorDrawablesOnImages()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract traceTurboModulePromiseRejectionsOnAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract useAlwaysAvailableJSErrorHandling()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract useFabricInterop()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract useImmediateExecutorInAndroidBridgeless()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract useNativeViewConfigsInBridgelessMode()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract useOptimisedViewPreallocationOnAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract useOptimizedEventBatchingOnAndroid()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract useRuntimeShadowNodeReferenceUpdate()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract useTurboModuleInterop()Z
    .annotation build Lt6/a;
    .end annotation
.end method

.method public abstract useTurboModules()Z
    .annotation build Lt6/a;
    .end annotation
.end method
