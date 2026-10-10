package com.facebook.react.runtime;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.MemoryPressureRouter;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashBridgeNotAllowedSoftException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.DefaultDevSupportManagerFactory;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkHelper;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.runtime.internal.bolts.TaskCompletionSource;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.BlackHoleEventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p302h6.C38115a;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public class ReactHostImpl implements ReactHost {
    private static final int BRIDGELESS_MARKER_INSTANCE_KEY = 1;
    private static final String TAG = "ReactHost";
    private static final AtomicInteger mCounter = new AtomicInteger(0);
    private final AtomicReference<Activity> mActivity;
    private final boolean mAllowPackagerServerAccess;
    private final Set<ReactSurfaceImpl> mAttachedSurfaces;
    private final Executor mBGExecutor;
    private final List<Function0<Unit>> mBeforeDestroyListeners;
    private final BridgelessAtomicRef<BridgelessReactContext> mBridgelessReactContextRef;
    private final BridgelessReactStateTracker mBridgelessReactStateTracker;
    private final ComponentFactory mComponentFactory;
    private final Context mContext;
    private final BridgelessAtomicRef<Task<ReactInstance>> mCreateReactInstanceTaskRef;

    @Nullable
    private DefaultHardwareBackBtnHandler mDefaultHardwareBackBtnHandler;

    @Nullable
    private Task<Void> mDestroyTask;
    private DevSupportManager mDevSupportManager;
    private volatile boolean mHostInvalidated;
    private final int mId;
    private final AtomicReference<WeakReference<Activity>> mLastUsedActivity;

    @Nullable
    private MemoryPressureListener mMemoryPressureListener;
    private final MemoryPressureRouter mMemoryPressureRouter;
    private final ReactHostDelegate mReactHostDelegate;

    @Nullable
    private ReactHostInspectorTarget mReactHostInspectorTarget;

    @Nullable
    private ReactInstance mReactInstance;
    private final List<ReactInstanceEventListener> mReactInstanceEventListeners;
    private final ReactLifecycleStateManager mReactLifecycleStateManager;

    @Nullable
    private Task<ReactInstance> mReloadTask;

    @Nullable
    private Task<Void> mStartTask;
    private final Executor mUIExecutor;
    private final boolean mUseDevSupport;

    public static class CreationResult {
        final ReactContext mContext;
        final ReactInstance mInstance;
        final boolean mIsReloading;

        private CreationResult(ReactInstance reactInstance, ReactContext reactContext, boolean z11) {
            this.mInstance = reactInstance;
            this.mContext = reactContext;
            this.mIsReloading = z11;
        }
    }

    public interface ReactInstanceCalback {
        void then(ReactInstance reactInstance);
    }

    public interface ReactInstanceTaskUnwrapper {
        @Nullable
        ReactInstance unwrap(Task<ReactInstance> task, String str);
    }

    public ReactHostImpl(Context context, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, boolean z11, boolean z12) {
        this(context, reactHostDelegate, componentFactory, Executors.newSingleThreadExecutor(), Task.UI_THREAD_EXECUTOR, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(String str, String str2) {
        this.mBridgelessReactStateTracker.enterState("ReactHost{" + this.mId + "}." + str + ": " + str2);
    }

    private void raiseSoftException(String str, String str2) {
        raiseSoftException(str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTask() {
        return waitThenCallGetOrCreateReactInstanceTaskWithRetries(0, 4);
    }

    @Override // com.facebook.react.ReactHost
    @NonNull
    public TaskInterface<Void> destroy(@NonNull String str, @Nullable Exception exc, @NonNull final Function1<? super Boolean, Unit> function1) {
        return ((Task) destroy(str, exc)).continueWith(new Continuation<Void, Void>() { // from class: com.facebook.react.runtime.ReactHostImpl.2
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            @Nullable
            public Void then(@NonNull Task<Void> task) throws Exception {
                function1.invoke(Boolean.valueOf(task.isCompleted() && !task.isFaulted()));
                return null;
            }
        });
    }

    @Nullable
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (cls == UIManagerModule.class) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose(TAG, new ReactNoCrashBridgeNotAllowedSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.mReactInstance;
        if (reactInstance != null) {
            return (T) reactInstance.getNativeModule(cls);
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy() {
        log("onHostDestroy()");
        maybeEnableDevSupport(false);
        moveToHostDestroy(getCurrentReactContext());
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause(@Nullable Activity activity) {
        log("onHostPause(activity)");
        ReactContext currentReactContext = getCurrentReactContext();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            String simpleName = currentActivity.getClass().getSimpleName();
            String simpleName2 = activity == null ? "null" : activity.getClass().getSimpleName();
            C38115a.m86046b(activity == currentActivity, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + simpleName + " Paused activity: " + simpleName2);
        }
        maybeEnableDevSupport(false);
        this.mDefaultHardwareBackBtnHandler = null;
        this.mReactLifecycleStateManager.moveToOnHostPause(currentReactContext, currentActivity);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(@Nullable Activity activity, @Nullable DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        this.mDefaultHardwareBackBtnHandler = defaultHardwareBackBtnHandler;
        onHostResume(activity);
    }

    private Task<Void> callAfterGetOrCreateReactInstance(String str, final ReactInstanceCalback reactInstanceCalback, @Nullable Executor executor) {
        final String str2 = "callAfterGetOrCreateReactInstance(" + str + ")";
        if (executor == null) {
            executor = getDefaultReactInstanceExecutor();
        }
        return getOrCreateReactInstance().onSuccess(new Continuation() { // from class: com.facebook.react.runtime.x
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return this.f9906a.lambda$callAfterGetOrCreateReactInstance$17(str2, reactInstanceCalback, task);
            }
        }, executor).continueWith(new Continuation() { // from class: com.facebook.react.runtime.i0
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return this.f9852a.lambda$callAfterGetOrCreateReactInstance$18(task);
            }
        });
    }

    private Task<Boolean> callWithExistingReactInstance(String str, final ReactInstanceCalback reactInstanceCalback, @Nullable Executor executor) {
        final String str2 = "callWithExistingReactInstance(" + str + ")";
        if (executor == null) {
            executor = getDefaultReactInstanceExecutor();
        }
        return this.mCreateReactInstanceTaskRef.get().onSuccess(new Continuation() { // from class: com.facebook.react.runtime.t
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return this.f9892a.lambda$callWithExistingReactInstance$16(str2, reactInstanceCalback, task);
            }
        }, executor);
    }

    private MemoryPressureListener createMemoryPressureListener(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.a0
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i11) {
                this.f9822a.lambda$createMemoryPressureListener$9(weakReference, i11);
            }
        };
    }

    private ReactInstanceTaskUnwrapper createReactInstanceUnwrapper(final String str, final String str2, final String str3) {
        return new ReactInstanceTaskUnwrapper() { // from class: com.facebook.react.runtime.v
            @Override // com.facebook.react.runtime.ReactHostImpl.ReactInstanceTaskUnwrapper
            public final ReactInstance unwrap(Task task, String str4) {
                return this.f9899a.lambda$createReactInstanceUnwrapper$29(str, str3, str2, task, str4);
            }
        };
    }

    @InterfaceC44695a
    private Map<String, String> getHostMetadata() {
        return AndroidInfoHelpers.getInspectorHostMetadata(this.mContext);
    }

    private Task<JSBundleLoader> getJsBundleLoader() {
        log("getJSBundleLoader()");
        if (this.mUseDevSupport && this.mAllowPackagerServerAccess) {
            return isMetroRunning().onSuccessTask(new Continuation() { // from class: com.facebook.react.runtime.g
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9846a.lambda$getJsBundleLoader$26(task);
                }
            }, this.mBGExecutor);
        }
        if (ReactBuildConfig.DEBUG) {
            C45999a.m101496b(TAG, "Packager server access is disabled in this environment");
        }
        return Task.call(new Callable() { // from class: com.facebook.react.runtime.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9849b.lambda$getJsBundleLoader$27();
            }
        });
    }

    private Task<Void> getOrCreateDestroyTask(final String str, @Nullable Exception exc) {
        log("getOrCreateDestroyTask()");
        raiseSoftException("getOrCreateDestroyTask()", str, exc);
        final ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Destroy", "getOrCreateDestroyTask()", str);
        if (this.mDestroyTask == null) {
            this.mDestroyTask = (ReactNativeFeatureFlags.completeReactInstanceCreationOnBgThreadOnAndroid() ? this.mCreateReactInstanceTaskRef.getAndReset() : this.mCreateReactInstanceTaskRef.get()).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.c0
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9830a.lambda$getOrCreateDestroyTask$36(reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper, str, task);
                }
            }, this.mUIExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.d0
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9836a.lambda$getOrCreateDestroyTask$37(reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper, task);
                }
            }, this.mBGExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.e0
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9839a.lambda$getOrCreateDestroyTask$38(reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper, str, task);
                }
            }, this.mUIExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.f0
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9844a.lambda$getOrCreateDestroyTask$39(reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper, task);
                }
            }, this.mBGExecutor).continueWith(new Continuation() { // from class: com.facebook.react.runtime.g0
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9847a.lambda$getOrCreateDestroyTask$40(str, task);
                }
            });
        }
        return this.mDestroyTask;
    }

    private BridgelessReactContext getOrCreateReactContext() {
        return this.mBridgelessReactContextRef.getOrCreate(new BridgelessAtomicRef.Provider() { // from class: com.facebook.react.runtime.e
            @Override // com.facebook.react.runtime.BridgelessAtomicRef.Provider
            public final Object get() {
                return this.f9838a.lambda$getOrCreateReactContext$19();
            }
        });
    }

    @Nullable
    private ReactHostInspectorTarget getOrCreateReactHostInspectorTarget() {
        if (this.mReactHostInspectorTarget == null && InspectorFlags.getFuseboxEnabled()) {
            this.mReactHostInspectorTarget = new ReactHostInspectorTarget(this);
        }
        return this.mReactHostInspectorTarget;
    }

    private Task<ReactInstance> getOrCreateReactInstance() {
        return Task.call(new Callable() { // from class: com.facebook.react.runtime.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9851b.waitThenCallGetOrCreateReactInstanceTask();
            }
        }, this.mBGExecutor).continueWithTask(new C6066m());
    }

    private Task<ReactInstance> getOrCreateReactInstanceTask() {
        log("getOrCreateReactInstanceTask()");
        return this.mCreateReactInstanceTaskRef.getOrCreate(new BridgelessAtomicRef.Provider() { // from class: com.facebook.react.runtime.w
            @Override // com.facebook.react.runtime.BridgelessAtomicRef.Provider
            public final Object get() {
                return this.f9904a.lambda$getOrCreateReactInstanceTask$25();
            }
        });
    }

    private Task<ReactInstance> getOrCreateReloadTask(final String str) {
        log("getOrCreateReloadTask()");
        raiseSoftException("getOrCreateReloadTask()", str);
        final ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Reload", "getOrCreateReloadTask()", str);
        if (this.mReloadTask == null) {
            this.mReloadTask = (ReactNativeFeatureFlags.completeReactInstanceCreationOnBgThreadOnAndroid() ? this.mCreateReactInstanceTaskRef.getAndReset() : this.mCreateReactInstanceTaskRef.get()).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.n
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9870a.lambda$getOrCreateReloadTask$30(reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper, str, task);
                }
            }, this.mUIExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.o
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9874a.lambda$getOrCreateReloadTask$31(reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper, task);
                }
            }, this.mBGExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.p
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9879a.lambda$getOrCreateReloadTask$32(reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper, task);
                }
            }, this.mUIExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.q
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9884a.lambda$getOrCreateReloadTask$33(reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper, task);
                }
            }, this.mBGExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.r
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9887a.lambda$getOrCreateReloadTask$34(reactInstanceTaskUnwrapperCreateReactInstanceUnwrapper, task);
                }
            }, this.mBGExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.s
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9890a.lambda$getOrCreateReloadTask$35(str, task);
                }
            }, this.mBGExecutor);
        }
        return this.mReloadTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> getOrCreateStartTask() {
        if (this.mStartTask == null) {
            log("getOrCreateStartTask()", "Schedule");
            if (ReactBuildConfig.DEBUG) {
                C38115a.m86046b(ReactNativeFeatureFlags.enableBridgelessArchitecture(), "enableBridgelessArchitecture FeatureFlag must be set to start ReactNative.");
                C38115a.m86046b(ReactNativeFeatureFlags.enableFabricRenderer(), "enableFabricRenderer FeatureFlag must be set to start ReactNative.");
                C38115a.m86046b(ReactNativeFeatureFlags.useTurboModules(), "useTurboModules FeatureFlag must be set to start ReactNative.");
            }
            this.mStartTask = waitThenCallGetOrCreateReactInstanceTask().continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.b0
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9827a.lambda$getOrCreateStartTask$15(task);
                }
            }, this.mBGExecutor);
        }
        return this.mStartTask;
    }

    private Task<Boolean> isMetroRunning() {
        log("isMetroRunning()");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        getDevSupportManager().isPackagerRunning(new PackagerStatusCallback() { // from class: com.facebook.react.runtime.j0
            @Override // com.facebook.react.devsupport.interfaces.PackagerStatusCallback
            public final void onPackagerStatusFetched(boolean z11) {
                this.f9856a.lambda$isMetroRunning$28(taskCompletionSource, z11);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMemoryPressureListener$9(final WeakReference weakReference, final int i11) {
        this.mBGExecutor.execute(new Runnable() { // from class: com.facebook.react.runtime.c
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.m10436i(weakReference, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$destroy$7(final String str, final Exception exc) throws Exception {
        if (this.mReloadTask == null) {
            return getOrCreateDestroyTask(str, exc);
        }
        log("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return this.mReloadTask.continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.p0
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return this.f9881a.lambda$destroy$6(str, exc, task);
            }
        }, this.mBGExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ JSBundleLoader lambda$getJsBundleLoader$27() throws Exception {
        return this.mReactHostDelegate.getJsBundleLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateDestroyTask$36(ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapper, String str, Task task) throws Exception {
        ReactHostInspectorTarget reactHostInspectorTarget;
        log("getOrCreateDestroyTask()", "Starting React Native destruction");
        ReactInstance reactInstanceUnwrap = reactInstanceTaskUnwrapper.unwrap(task, "1: Starting destroy");
        unregisterInstanceFromInspector(reactInstanceUnwrap);
        if (this.mHostInvalidated && (reactHostInspectorTarget = this.mReactHostInspectorTarget) != null) {
            reactHostInspectorTarget.close();
            this.mReactHostInspectorTarget = null;
        }
        if (this.mUseDevSupport) {
            log("getOrCreateDestroyTask()", "DevSupportManager cleanup");
            this.mDevSupportManager.stopInspector();
        }
        BridgelessReactContext nullable = this.mBridgelessReactContextRef.getNullable();
        if (nullable == null) {
            raiseSoftException("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        log("getOrCreateDestroyTask()", "Move ReactHost to onHostDestroy()");
        this.mReactLifecycleStateManager.moveToOnHostDestroy(nullable);
        return Task.forResult(reactInstanceUnwrap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateDestroyTask$37(ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapper, Task task) throws Exception {
        ReactInstance reactInstanceUnwrap = reactInstanceTaskUnwrapper.unwrap(task, "2: Stopping surfaces");
        if (reactInstanceUnwrap == null) {
            raiseSoftException("getOrCreateDestroyTask()", "Skipping surface shutdown: ReactInstance null");
            return task;
        }
        stopAttachedSurfaces("getOrCreateDestroyTask()", reactInstanceUnwrap);
        synchronized (this.mAttachedSurfaces) {
            this.mAttachedSurfaces.clear();
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateDestroyTask$38(ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapper, String str, Task task) throws Exception {
        reactInstanceTaskUnwrapper.unwrap(task, "3: Destroying ReactContext");
        Iterator<Function0<Unit>> it = this.mBeforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        BridgelessReactContext nullable = this.mBridgelessReactContextRef.getNullable();
        if (nullable == null) {
            raiseSoftException("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        log("getOrCreateDestroyTask()", "Destroying MemoryPressureRouter");
        this.mMemoryPressureRouter.destroy(this.mContext);
        if (nullable != null) {
            log("getOrCreateDestroyTask()", "Resetting ReactContext ref");
            this.mBridgelessReactContextRef.reset();
            log("getOrCreateDestroyTask()", "Destroying ReactContext");
            nullable.destroy();
        }
        setCurrentActivity(null);
        ResourceDrawableIdHelper.getInstance().clear();
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateDestroyTask$39(ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapper, Task task) throws Exception {
        ReactInstance reactInstanceUnwrap = reactInstanceTaskUnwrapper.unwrap(task, "4: Destroying ReactInstance");
        if (reactInstanceUnwrap == null) {
            raiseSoftException("getOrCreateDestroyTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            log("getOrCreateDestroyTask()", "Resetting ReactInstance ptr");
            this.mReactInstance = null;
            log("getOrCreateDestroyTask()", "Destroying ReactInstance");
            reactInstanceUnwrap.destroy();
        }
        if (!ReactNativeFeatureFlags.completeReactInstanceCreationOnBgThreadOnAndroid()) {
            log("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
            this.mCreateReactInstanceTaskRef.reset();
        }
        log("getOrCreateDestroyTask()", "Resetting start task ref");
        this.mStartTask = null;
        log("getOrCreateDestroyTask()", "Resetting destroy task ref");
        this.mDestroyTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BridgelessReactContext lambda$getOrCreateReactContext$19() {
        log("getOrCreateReactContext()", "Creating BridgelessReactContext");
        return new BridgelessReactContext(this.mContext, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateReactInstanceTask$25() {
        log("getOrCreateReactInstanceTask()", "Start");
        C38115a.m86046b(!this.mHostInvalidated, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        Task<TContinuationResult> taskOnSuccess = getJsBundleLoader().onSuccess(new Continuation() { // from class: com.facebook.react.runtime.q0
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return this.f9886a.lambda$getOrCreateReactInstanceTask$22(task);
            }
        }, this.mBGExecutor);
        Continuation continuation = new Continuation() { // from class: com.facebook.react.runtime.r0
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return this.f9889a.lambda$getOrCreateReactInstanceTask$23(task);
            }
        };
        if (!ReactNativeFeatureFlags.completeReactInstanceCreationOnBgThreadOnAndroid()) {
            return taskOnSuccess.onSuccess(continuation, this.mUIExecutor);
        }
        taskOnSuccess.onSuccess(continuation, this.mUIExecutor);
        return taskOnSuccess.onSuccess(new Continuation() { // from class: com.facebook.react.runtime.s0
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return ((ReactHostImpl.CreationResult) task.getResult()).mInstance;
            }
        }, Task.IMMEDIATE_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateReloadTask$30(ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapper, String str, Task task) throws Exception {
        log("getOrCreateReloadTask()", "Starting React Native reload");
        ReactInstance reactInstanceUnwrap = reactInstanceTaskUnwrapper.unwrap(task, "1: Starting reload");
        unregisterInstanceFromInspector(reactInstanceUnwrap);
        BridgelessReactContext nullable = this.mBridgelessReactContextRef.getNullable();
        if (nullable == null) {
            raiseSoftException("getOrCreateReloadTask()", "ReactContext is null. Reload reason: " + str);
        }
        if (nullable != null && this.mReactLifecycleStateManager.getLifecycleState() == LifecycleState.RESUMED) {
            log("getOrCreateReloadTask()", "Calling ReactContext.onHostPause()");
            nullable.onHostPause();
        }
        return Task.forResult(reactInstanceUnwrap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateReloadTask$31(ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapper, Task task) throws Exception {
        ReactInstance reactInstanceUnwrap = reactInstanceTaskUnwrapper.unwrap(task, "2: Surface shutdown");
        if (reactInstanceUnwrap == null) {
            raiseSoftException("getOrCreateReloadTask()", "Skipping surface shutdown: ReactInstance null");
            return task;
        }
        stopAttachedSurfaces("getOrCreateReloadTask()", reactInstanceUnwrap);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateReloadTask$32(ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapper, Task task) throws Exception {
        reactInstanceTaskUnwrapper.unwrap(task, "3: Destroying ReactContext");
        Iterator<Function0<Unit>> it = this.mBeforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        if (this.mMemoryPressureListener != null) {
            log("getOrCreateReloadTask()", "Removing memory pressure listener");
            this.mMemoryPressureRouter.removeMemoryPressureListener(this.mMemoryPressureListener);
        }
        BridgelessReactContext nullable = this.mBridgelessReactContextRef.getNullable();
        if (nullable != null) {
            log("getOrCreateReloadTask()", "Resetting ReactContext ref");
            this.mBridgelessReactContextRef.reset();
            log("getOrCreateReloadTask()", "Destroying ReactContext");
            nullable.destroy();
        }
        if (this.mUseDevSupport && nullable != null) {
            log("getOrCreateReloadTask()", "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            this.mDevSupportManager.onReactInstanceDestroyed(nullable);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateReloadTask$33(ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapper, Task task) throws Exception {
        ReactInstance reactInstanceUnwrap = reactInstanceTaskUnwrapper.unwrap(task, "4: Destroying ReactInstance");
        if (reactInstanceUnwrap == null) {
            raiseSoftException("getOrCreateReloadTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            log("getOrCreateReloadTask()", "Resetting ReactInstance ptr");
            this.mReactInstance = null;
            log("getOrCreateReloadTask()", "Destroying ReactInstance");
            reactInstanceUnwrap.destroy();
        }
        if (!ReactNativeFeatureFlags.completeReactInstanceCreationOnBgThreadOnAndroid()) {
            log("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
            this.mCreateReactInstanceTaskRef.reset();
        }
        log("getOrCreateReloadTask()", "Resetting start task ref");
        this.mStartTask = null;
        return getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateReloadTask$34(ReactInstanceTaskUnwrapper reactInstanceTaskUnwrapper, Task task) throws Exception {
        ReactInstance reactInstanceUnwrap = reactInstanceTaskUnwrapper.unwrap(task, "5: Restarting surfaces");
        if (reactInstanceUnwrap == null) {
            raiseSoftException("getOrCreateReloadTask()", "Skipping surface restart: ReactInstance null");
            return task;
        }
        startAttachedSurfaces("getOrCreateReloadTask()", reactInstanceUnwrap);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isMetroRunning$28(TaskCompletionSource taskCompletionSource, boolean z11) {
        log("isMetroRunning()", "Async result = " + z11);
        taskCompletionSource.setResult(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBundle$11(JSBundleLoader jSBundleLoader, ReactInstance reactInstance) {
        log("loadBundle()", "Execute");
        reactInstance.loadJSBundle(jSBundleLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prerenderSurface$0(String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        log(str, "Execute");
        reactInstance.prerenderSurface(reactSurfaceImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerSegment$12(String str, int i11, String str2, Callback callback, ReactInstance reactInstance) {
        log(str, "Execute");
        reactInstance.registerSegment(i11, str2);
        ((Callback) C38115a.m86047c(callback)).invoke(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$reload$5(final String str) throws Exception {
        Task<Void> taskMakeVoid;
        if (this.mDestroyTask != null) {
            log("reload()", "Waiting for destroy to finish, before reloading React Native.");
            taskMakeVoid = this.mDestroyTask.continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.y
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    return this.f9909a.lambda$reload$3(str, task);
                }
            }, this.mBGExecutor).makeVoid();
        } else {
            taskMakeVoid = getOrCreateReloadTask(str).makeVoid();
        }
        return taskMakeVoid.continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.z
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                return this.f9913a.lambda$reload$4(task);
            }
        }, this.mBGExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSurface$1(String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        log(str, "Execute");
        reactInstance.startSurface(reactSurfaceImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopSurface$2(String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        log(str, "Execute");
        reactInstance.stopSurface(reactSurfaceImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$waitThenCallGetOrCreateReactInstanceTaskWithRetries$20(int i11, int i12, Task task) throws Exception {
        return waitThenCallGetOrCreateReactInstanceTaskWithRetries(i11 + 1, i12);
    }

    private Task<JSBundleLoader> loadJSBundleFromMetro() {
        log("loadJSBundleFromMetro()");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final DevSupportManagerBase devSupportManagerBase = (DevSupportManagerBase) getDevSupportManager();
        final String devServerBundleURL = devSupportManagerBase.getDevServerHelper().getDevServerBundleURL((String) C38115a.m86047c(devSupportManagerBase.getJSAppBundleName()));
        devSupportManagerBase.reloadJSFromServer(devServerBundleURL, new BundleLoadCallback() { // from class: com.facebook.react.runtime.ReactHostImpl.3
            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public void onError(Exception exc) {
                taskCompletionSource.setError(exc);
            }

            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public void onSuccess() {
                ReactHostImpl.this.log("loadJSBundleFromMetro()", "Creating BundleLoader");
                taskCompletionSource.setResult(JSBundleLoader.createCachedBundleFromNetworkLoader(devServerBundleURL, devSupportManagerBase.getDownloadedJSBundleFile()));
            }
        });
        return taskCompletionSource.getTask();
    }

    private void log(String str) {
        this.mBridgelessReactStateTracker.enterState("ReactHost{" + this.mId + "}." + str);
    }

    private void maybeEnableDevSupport(boolean z11) {
        if (this.mUseDevSupport) {
            this.mDevSupportManager.setDevSupportEnabled(z11);
        }
    }

    private void moveToHostDestroy(@Nullable ReactContext reactContext) {
        this.mReactLifecycleStateManager.moveToOnHostDestroy(reactContext);
        setCurrentActivity(null);
    }

    private void raiseSoftException(String str, String str2, @Nullable Throwable th2) {
        String str3 = "raiseSoftException(" + str + ")";
        log(str3, str2);
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(str3 + ": " + str2, th2));
    }

    private void setCurrentActivity(@Nullable Activity activity) {
        this.mActivity.set(activity);
        if (activity != null) {
            this.mLastUsedActivity.set(new WeakReference<>(activity));
        }
    }

    @InterfaceC44695a
    private void setPausedInDebuggerMessage(@Nullable String str) {
        if (str == null) {
            this.mDevSupportManager.hidePausedInDebuggerOverlay();
        } else {
            this.mDevSupportManager.showPausedInDebuggerOverlay(str, new DevSupportManager.PausedInDebuggerOverlayCommandListener() { // from class: com.facebook.react.runtime.ReactHostImpl.1
                @Override // com.facebook.react.devsupport.interfaces.DevSupportManager.PausedInDebuggerOverlayCommandListener
                public void onResume() {
                    UiThreadUtil.assertOnUiThread();
                    if (ReactHostImpl.this.mReactHostInspectorTarget != null) {
                        ReactHostImpl.this.mReactHostInspectorTarget.sendDebuggerResumeCommand();
                    }
                }
            });
        }
    }

    private void startAttachedSurfaces(String str, ReactInstance reactInstance) {
        log(str, "Restarting previously running React Native Surfaces");
        synchronized (this.mAttachedSurfaces) {
            try {
                Iterator<ReactSurfaceImpl> it = this.mAttachedSurfaces.iterator();
                while (it.hasNext()) {
                    reactInstance.startSurface(it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void stopAttachedSurfaces(String str, ReactInstance reactInstance) {
        log(str, "Stopping all React Native surfaces");
        synchronized (this.mAttachedSurfaces) {
            try {
                for (ReactSurfaceImpl reactSurfaceImpl : this.mAttachedSurfaces) {
                    reactInstance.stopSurface(reactSurfaceImpl);
                    reactSurfaceImpl.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void unregisterInstanceFromInspector(@Nullable ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.mReactHostInspectorTarget;
                C38115a.m86046b(reactHostInspectorTarget != null && reactHostInspectorTarget.isValid(), "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    private Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTaskWithRetries(final int i11, final int i12) {
        if (this.mReloadTask != null) {
            log("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return this.mReloadTask;
        }
        if (this.mDestroyTask != null) {
            if (i11 < i12) {
                log("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + i11 + ").");
                return this.mDestroyTask.onSuccessTask(new Continuation() { // from class: com.facebook.react.runtime.l
                    @Override // com.facebook.react.runtime.internal.bolts.Continuation
                    public final Object then(Task task) {
                        return this.f9866a.lambda$waitThenCallGetOrCreateReactInstanceTaskWithRetries$20(i11, i12, task);
                    }
                }, this.mBGExecutor);
            }
            raiseSoftException("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.");
        }
        return getOrCreateReactInstanceTask();
    }

    @Override // com.facebook.react.ReactHost
    public void addBeforeDestroyListener(@NonNull Function0<Unit> function0) {
        this.mBeforeDestroyListeners.add(function0);
    }

    @Override // com.facebook.react.ReactHost
    public void addReactInstanceEventListener(ReactInstanceEventListener reactInstanceEventListener) {
        this.mReactInstanceEventListeners.add(reactInstanceEventListener);
    }

    public void attachSurface(ReactSurfaceImpl reactSurfaceImpl) {
        log("attachSurface(surfaceId = " + reactSurfaceImpl.getSurfaceID() + ")");
        synchronized (this.mAttachedSurfaces) {
            this.mAttachedSurfaces.add(reactSurfaceImpl);
        }
    }

    public Task<Boolean> callFunctionOnModule(final String str, final String str2, final NativeArray nativeArray) {
        return callWithExistingReactInstance("callFunctionOnModule(\"" + str + "\", \"" + str2 + "\")", new ReactInstanceCalback() { // from class: com.facebook.react.runtime.u
            @Override // com.facebook.react.runtime.ReactHostImpl.ReactInstanceCalback
            public final void then(ReactInstance reactInstance) {
                reactInstance.callFunctionOnModule(str, str2, nativeArray);
            }
        }, null);
    }

    @Override // com.facebook.react.ReactHost
    public ReactSurface createSurface(Context context, String str, @Nullable Bundle bundle) {
        ReactSurfaceImpl reactSurfaceImpl = new ReactSurfaceImpl(context, str, bundle);
        ReactSurfaceView reactSurfaceView = new ReactSurfaceView(context, reactSurfaceImpl);
        reactSurfaceView.setShouldLogContentAppeared(true);
        reactSurfaceImpl.attachView(reactSurfaceView);
        reactSurfaceImpl.attach(this);
        return reactSurfaceImpl;
    }

    public void detachSurface(ReactSurfaceImpl reactSurfaceImpl) {
        log("detachSurface(surfaceId = " + reactSurfaceImpl.getSurfaceID() + ")");
        synchronized (this.mAttachedSurfaces) {
            this.mAttachedSurfaces.remove(reactSurfaceImpl);
        }
    }

    @Nullable
    public Activity getCurrentActivity() {
        return this.mActivity.get();
    }

    @Override // com.facebook.react.ReactHost
    @Nullable
    public ReactContext getCurrentReactContext() {
        return this.mBridgelessReactContextRef.getNullable();
    }

    public DefaultHardwareBackBtnHandler getDefaultBackButtonHandler() {
        return new DefaultHardwareBackBtnHandler() { // from class: com.facebook.react.runtime.t0
            @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
            public final void invokeDefaultOnBackPressed() {
                this.f9895b.lambda$getDefaultBackButtonHandler$10();
            }
        };
    }

    @Override // com.facebook.react.ReactHost
    public DevSupportManager getDevSupportManager() {
        return (DevSupportManager) C38115a.m86047c(this.mDevSupportManager);
    }

    public EventDispatcher getEventDispatcher() {
        ReactInstance reactInstance = this.mReactInstance;
        return reactInstance == null ? BlackHoleEventDispatcher.get() : reactInstance.getEventDispatcher();
    }

    @Nullable
    public CallInvokerHolder getJSCallInvokerHolder() {
        ReactInstance reactInstance = this.mReactInstance;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        raiseSoftException("getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready");
        return null;
    }

    @Nullable
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        ReactInstance reactInstance = this.mReactInstance;
        if (reactInstance != null) {
            return reactInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    @Nullable
    public Activity getLastUsedActivity() {
        WeakReference<Activity> weakReference = this.mLastUsedActivity.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public LifecycleState getLifecycleState() {
        return this.mReactLifecycleStateManager.getLifecycleState();
    }

    @Override // com.facebook.react.ReactHost
    public MemoryPressureRouter getMemoryPressureRouter() {
        return this.mMemoryPressureRouter;
    }

    public Collection<NativeModule> getNativeModules() {
        ReactInstance reactInstance = this.mReactInstance;
        return reactInstance != null ? reactInstance.getNativeModules() : new ArrayList();
    }

    @Override // com.facebook.react.ReactHost
    @Nullable
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactInstance reactInstance = this.mReactInstance;
        if (reactInstance != null) {
            return reactInstance.getReactQueueConfiguration();
        }
        return null;
    }

    @Nullable
    public RuntimeExecutor getRuntimeExecutor() {
        ReactInstance reactInstance = this.mReactInstance;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        raiseSoftException("getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready");
        return null;
    }

    @Nullable
    public FabricUIManager getUIManager() {
        ReactInstance reactInstance = this.mReactInstance;
        if (reactInstance == null) {
            return null;
        }
        return reactInstance.getUIManager();
    }

    public void handleHostException(Exception exc) {
        String str = "handleHostException(message = \"" + exc.getMessage() + "\")";
        log(str);
        if (this.mUseDevSupport) {
            this.mDevSupportManager.handleException(exc);
        } else {
            this.mReactHostDelegate.handleInstanceException(exc);
        }
        destroy(str, exc);
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        ReactInstance reactInstance = this.mReactInstance;
        if (reactInstance != null) {
            return reactInstance.hasNativeModule(cls);
        }
        return false;
    }

    @Override // com.facebook.react.ReactHost
    public void invalidate() {
        C45999a.m101496b(TAG, "ReactHostImpl.invalidate()");
        this.mHostInvalidated = true;
        destroy("ReactHostImpl.invalidate()", null);
    }

    public boolean isInstanceInitialized() {
        return this.mReactInstance != null;
    }

    public boolean isSurfaceAttached(ReactSurfaceImpl reactSurfaceImpl) {
        boolean zContains;
        synchronized (this.mAttachedSurfaces) {
            zContains = this.mAttachedSurfaces.contains(reactSurfaceImpl);
        }
        return zContains;
    }

    public boolean isSurfaceWithModuleNameAttached(String str) {
        synchronized (this.mAttachedSurfaces) {
            try {
                Iterator<ReactSurfaceImpl> it = this.mAttachedSurfaces.iterator();
                while (it.hasNext()) {
                    if (it.next().getModuleName().equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Task<Boolean> loadBundle(final JSBundleLoader jSBundleLoader) {
        log("loadBundle()", "Schedule");
        return callWithExistingReactInstance("loadBundle()", new ReactInstanceCalback() { // from class: com.facebook.react.runtime.f
            @Override // com.facebook.react.runtime.ReactHostImpl.ReactInstanceCalback
            public final void then(ReactInstance reactInstance) {
                this.f9842a.lambda$loadBundle$11(jSBundleLoader, reactInstance);
            }
        }, null);
    }

    @Override // com.facebook.react.ReactHost
    public void onActivityResult(Activity activity, int i11, int i12, @Nullable Intent intent) {
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + i11 + "\", resultCode = \"" + i12 + "\", data = \"" + intent + "\")";
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, i11, i12, intent);
        } else {
            raiseSoftException(str, "Tried to access onActivityResult while context is not ready");
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostLeaveHint(@Nullable Activity activity) {
        log("onUserLeaveHint(activity)");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onUserLeaveHint(activity);
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        String str = "onNewIntent(intent = \"" + intent + "\")";
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null) {
            raiseSoftException(str, "Tried to access onNewIntent while context is not ready");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        currentReactContext.onNewIntent(getCurrentActivity(), intent);
    }

    @Override // com.facebook.react.ReactHost
    public void onWindowFocusChange(boolean z11) {
        String str = "onWindowFocusChange(hasFocus = \"" + z11 + "\")";
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onWindowFocusChange(z11);
        } else {
            raiseSoftException(str, "Tried to access onWindowFocusChange while context is not ready");
        }
    }

    public TaskInterface<Void> prerenderSurface(final ReactSurfaceImpl reactSurfaceImpl) {
        final String str = "prerenderSurface(surfaceId = " + reactSurfaceImpl.getSurfaceID() + ")";
        log(str, "Schedule");
        attachSurface(reactSurfaceImpl);
        return callAfterGetOrCreateReactInstance(str, new ReactInstanceCalback() { // from class: com.facebook.react.runtime.o0
            @Override // com.facebook.react.runtime.ReactHostImpl.ReactInstanceCalback
            public final void then(ReactInstance reactInstance) {
                this.f9876a.lambda$prerenderSurface$0(str, reactSurfaceImpl, reactInstance);
            }
        }, this.mBGExecutor);
    }

    public Task<Boolean> registerSegment(final int i11, final String str, final Callback callback) {
        final String str2 = "registerSegment(segmentId = \"" + i11 + "\", path = \"" + str + "\")";
        log(str2, "Schedule");
        return callWithExistingReactInstance(str2, new ReactInstanceCalback() { // from class: com.facebook.react.runtime.k
            @Override // com.facebook.react.runtime.ReactHostImpl.ReactInstanceCalback
            public final void then(ReactInstance reactInstance) {
                this.f9858a.lambda$registerSegment$12(str2, i11, str, callback, reactInstance);
            }
        }, null);
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> reload(final String str) {
        return Task.call(new Callable() { // from class: com.facebook.react.runtime.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9825b.lambda$reload$5(str);
            }
        }, this.mBGExecutor).continueWithTask(new C6066m());
    }

    @Override // com.facebook.react.ReactHost
    public void removeBeforeDestroyListener(@NonNull Function0<Unit> function0) {
        this.mBeforeDestroyListeners.remove(function0);
    }

    @Override // com.facebook.react.ReactHost
    public void removeReactInstanceEventListener(ReactInstanceEventListener reactInstanceEventListener) {
        this.mReactInstanceEventListeners.remove(reactInstanceEventListener);
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> start() {
        return Task.call(new Callable() { // from class: com.facebook.react.runtime.n0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9873b.getOrCreateStartTask();
            }
        }, this.mBGExecutor).continueWithTask(new C6066m());
    }

    public TaskInterface<Void> startSurface(final ReactSurfaceImpl reactSurfaceImpl) {
        final String str = "startSurface(surfaceId = " + reactSurfaceImpl.getSurfaceID() + ")";
        log(str, "Schedule");
        attachSurface(reactSurfaceImpl);
        return callAfterGetOrCreateReactInstance(str, new ReactInstanceCalback() { // from class: com.facebook.react.runtime.d
            @Override // com.facebook.react.runtime.ReactHostImpl.ReactInstanceCalback
            public final void then(ReactInstance reactInstance) {
                this.f9833a.lambda$startSurface$1(str, reactSurfaceImpl, reactInstance);
            }
        }, this.mBGExecutor);
    }

    public TaskInterface<Void> stopSurface(final ReactSurfaceImpl reactSurfaceImpl) {
        final String str = "stopSurface(surfaceId = " + reactSurfaceImpl.getSurfaceID() + ")";
        log(str, "Schedule");
        detachSurface(reactSurfaceImpl);
        return callWithExistingReactInstance(str, new ReactInstanceCalback() { // from class: com.facebook.react.runtime.j
            @Override // com.facebook.react.runtime.ReactHostImpl.ReactInstanceCalback
            public final void then(ReactInstance reactInstance) {
                this.f9853a.lambda$stopSurface$2(str, reactSurfaceImpl, reactInstance);
            }
        }, this.mBGExecutor).makeVoid();
    }

    public ReactHostImpl(Context context, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z11, boolean z12) {
        this(context, reactHostDelegate, componentFactory, executor, executor2, z11, z12, null);
    }

    private Executor getDefaultReactInstanceExecutor() {
        if (ReactNativeFeatureFlags.useImmediateExecutorInAndroidBridgeless()) {
            return Task.IMMEDIATE_EXECUTOR;
        }
        return this.mBGExecutor;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m10436i(WeakReference weakReference, int i11) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.handleMemoryPressure(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$callAfterGetOrCreateReactInstance$17(String str, ReactInstanceCalback reactInstanceCalback, Task task) throws Exception {
        ReactInstance reactInstance;
        if (ReactNativeFeatureFlags.completeReactInstanceCreationOnBgThreadOnAndroid()) {
            reactInstance = (ReactInstance) task.getResult();
        } else {
            reactInstance = this.mReactInstance;
        }
        if (reactInstance == null) {
            raiseSoftException(str, "Execute: reactInstance is null. Dropping work.");
            return null;
        }
        reactInstanceCalback.then(reactInstance);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$callAfterGetOrCreateReactInstance$18(Task task) throws Exception {
        if (task.isFaulted()) {
            handleHostException(task.getError());
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$callWithExistingReactInstance$16(String str, ReactInstanceCalback reactInstanceCalback, Task task) throws Exception {
        ReactInstance reactInstance;
        if (ReactNativeFeatureFlags.completeReactInstanceCreationOnBgThreadOnAndroid()) {
            reactInstance = (ReactInstance) task.getResult();
        } else {
            reactInstance = this.mReactInstance;
        }
        if (reactInstance == null) {
            raiseSoftException(str, "Execute: reactInstance is null. Dropping work.");
            return Boolean.FALSE;
        }
        reactInstanceCalback.then(reactInstance);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance lambda$createReactInstanceUnwrapper$29(String str, String str2, String str3, Task task, String str4) {
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        ReactInstance reactInstance2 = this.mReactInstance;
        String str5 = "Stage: " + str4;
        String str6 = str + " reason: " + str2;
        if (task.isFaulted()) {
            raiseSoftException(str3, str + ": ReactInstance task faulted. " + str5 + ". " + ("Fault reason: " + task.getError().getMessage()) + ". " + str6);
            return reactInstance2;
        }
        if (task.isCancelled()) {
            raiseSoftException(str3, str + ": ReactInstance task cancelled. " + str5 + ". " + str6);
            return reactInstance2;
        }
        if (reactInstance == null) {
            raiseSoftException(str3, str + ": ReactInstance task returned null. " + str5 + ". " + str6);
            return reactInstance2;
        }
        if (reactInstance2 != null && reactInstance != reactInstance2) {
            raiseSoftException(str3, str + ": Detected two different ReactInstances. Returning old. " + str5 + ". " + str6);
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$destroy$6(String str, Exception exc, Task task) throws Exception {
        return getOrCreateDestroyTask(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDefaultBackButtonHandler$10() {
        UiThreadUtil.assertOnUiThread();
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = this.mDefaultHardwareBackBtnHandler;
        if (defaultHardwareBackBtnHandler != null) {
            defaultHardwareBackBtnHandler.invokeDefaultOnBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getJsBundleLoader$26(Task task) throws Exception {
        if (((Boolean) task.getResult()).booleanValue()) {
            return loadJSBundleFromMetro();
        }
        return Task.forResult(this.mReactHostDelegate.getJsBundleLoader());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$getOrCreateDestroyTask$40(String str, Task task) throws Exception {
        if (task.isFaulted()) {
            raiseSoftException("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task faulted. Fault reason: " + task.getError().getMessage() + ". Destroy reason: " + str, task.getError());
        }
        if (task.isCancelled()) {
            raiseSoftException("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task cancelled. Destroy reason: " + str);
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CreationResult lambda$getOrCreateReactInstanceTask$22(Task task) throws Exception {
        boolean z11;
        JSBundleLoader jSBundleLoader = (JSBundleLoader) task.getResult();
        BridgelessReactContext orCreateReactContext = getOrCreateReactContext();
        DevSupportManager devSupportManager = getDevSupportManager();
        orCreateReactContext.setJSExceptionHandler(devSupportManager);
        log("getOrCreateReactInstanceTask()", "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(orCreateReactContext, this.mReactHostDelegate, this.mComponentFactory, devSupportManager, new QueueThreadExceptionHandler() { // from class: com.facebook.react.runtime.l0
            @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
            public final void handleException(Exception exc) {
                this.f9869a.handleHostException(exc);
            }
        }, this.mUseDevSupport, getOrCreateReactHostInspectorTarget());
        this.mReactInstance = reactInstance;
        MemoryPressureListener memoryPressureListenerCreateMemoryPressureListener = createMemoryPressureListener(reactInstance);
        this.mMemoryPressureListener = memoryPressureListenerCreateMemoryPressureListener;
        this.mMemoryPressureRouter.addMemoryPressureListener(memoryPressureListenerCreateMemoryPressureListener);
        reactInstance.initializeEagerTurboModules();
        log("getOrCreateReactInstanceTask()", "Loading JS Bundle");
        reactInstance.loadJSBundle(jSBundleLoader);
        log("getOrCreateReactInstanceTask()", "Calling DevSupportManagerBase.onNewReactContextCreated(reactContext)");
        devSupportManager.onNewReactContextCreated(orCreateReactContext);
        orCreateReactContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.runtime.m0
            @Override // java.lang.Runnable
            public final void run() {
                ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
            }
        });
        if (this.mReloadTask != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new CreationResult(reactInstance, orCreateReactContext, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance lambda$getOrCreateReactInstanceTask$23(Task task) throws Exception {
        boolean z11;
        ReactInstance reactInstance = ((CreationResult) task.getResult()).mInstance;
        ReactContext reactContext = ((CreationResult) task.getResult()).mContext;
        boolean z12 = ((CreationResult) task.getResult()).mIsReloading;
        if (this.mReactLifecycleStateManager.getLifecycleState() == LifecycleState.RESUMED) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z12 && !z11) {
            this.mReactLifecycleStateManager.moveToOnHostResume(reactContext, getCurrentActivity());
        } else {
            this.mReactLifecycleStateManager.resumeReactContextIfHostResumed(reactContext, getCurrentActivity());
        }
        log("getOrCreateReactInstanceTask()", "Executing ReactInstanceEventListeners");
        for (ReactInstanceEventListener reactInstanceEventListener : this.mReactInstanceEventListeners) {
            if (reactInstanceEventListener != null) {
                reactInstanceEventListener.onReactContextInitialized(reactContext);
            }
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateReloadTask$35(String str, Task task) throws Exception {
        if (task.isFaulted()) {
            raiseSoftException("getOrCreateReloadTask()", "Error during reload. ReactInstance task faulted. Fault reason: " + task.getError().getMessage() + ". Reload reason: " + str, task.getError());
        }
        if (task.isCancelled()) {
            raiseSoftException("getOrCreateReloadTask()", "Error during reload. ReactInstance task cancelled. Reload reason: " + str);
        }
        log("getOrCreateReloadTask()", "Resetting reload task ref");
        this.mReloadTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getOrCreateStartTask$15(final Task task) throws Exception {
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (this.mUseDevSupport) {
                this.mDevSupportManager.handleException(error);
            } else {
                this.mReactHostDelegate.handleInstanceException(error);
            }
            return getOrCreateDestroyTask("getOrCreateStartTask() failure: " + task.getError().getMessage(), task.getError()).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.h0
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task2) {
                    return Task.forError(task.getError());
                }
            }).makeVoid();
        }
        return task.makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$reload$3(String str, Task task) throws Exception {
        return getOrCreateReloadTask(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$reload$4(Task task) throws Exception {
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (this.mUseDevSupport) {
                this.mDevSupportManager.handleException(error);
            } else {
                this.mReactHostDelegate.handleInstanceException(error);
            }
            return getOrCreateDestroyTask("Reload failed", error);
        }
        return task;
    }

    @InterfaceC44695a
    private void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        InspectorNetworkHelper.loadNetworkResource(str, inspectorNetworkRequestListener);
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> destroy(final String str, @Nullable final Exception exc) {
        return Task.call(new Callable() { // from class: com.facebook.react.runtime.k0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9863b.lambda$destroy$7(str, exc);
            }
        }, this.mBGExecutor).continueWithTask(new C6066m());
    }

    @Override // com.facebook.react.ReactHost
    public boolean onBackPressed() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.mReactInstance;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.getNativeModule(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    @Override // com.facebook.react.ReactHost
    public void onConfigurationChanged(Context context) {
        AppearanceModule appearanceModule;
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (appearanceModule = (AppearanceModule) currentReactContext.getNativeModule(AppearanceModule.class)) != null) {
            appearanceModule.onConfigurationChanged(context);
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(@Nullable Activity activity) {
        log("onHostResume(activity)");
        setCurrentActivity(activity);
        ReactContext currentReactContext = getCurrentReactContext();
        maybeEnableDevSupport(true);
        this.mReactLifecycleStateManager.moveToOnHostResume(currentReactContext, getCurrentActivity());
    }

    public ReactHostImpl(Context context, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z11, boolean z12, @Nullable DevSupportManagerFactory devSupportManagerFactory) {
        this.mAttachedSurfaces = new HashSet();
        this.mCreateReactInstanceTaskRef = new BridgelessAtomicRef<>(Task.forResult(null));
        this.mBridgelessReactContextRef = new BridgelessAtomicRef<>();
        this.mActivity = new AtomicReference<>();
        this.mLastUsedActivity = new AtomicReference<>(new WeakReference(null));
        BridgelessReactStateTracker bridgelessReactStateTracker = new BridgelessReactStateTracker(ReactBuildConfig.DEBUG);
        this.mBridgelessReactStateTracker = bridgelessReactStateTracker;
        this.mReactLifecycleStateManager = new ReactLifecycleStateManager(bridgelessReactStateTracker);
        this.mId = mCounter.getAndIncrement();
        this.mReactInstanceEventListeners = new CopyOnWriteArrayList();
        this.mBeforeDestroyListeners = new CopyOnWriteArrayList();
        this.mHostInvalidated = false;
        this.mStartTask = null;
        this.mReloadTask = null;
        this.mDestroyTask = null;
        this.mContext = context;
        this.mReactHostDelegate = reactHostDelegate;
        this.mComponentFactory = componentFactory;
        this.mBGExecutor = executor;
        this.mUIExecutor = executor2;
        this.mMemoryPressureRouter = new MemoryPressureRouter(context);
        this.mAllowPackagerServerAccess = z11;
        boolean z13 = z12 || ReactBuildConfig.UNSTABLE_ENABLE_FUSEBOX_RELEASE;
        this.mUseDevSupport = z13;
        this.mDevSupportManager = (devSupportManagerFactory == null ? new DefaultDevSupportManagerFactory() : devSupportManagerFactory).create(context.getApplicationContext(), new ReactHostImplDevHelper(this), reactHostDelegate.getJsMainModulePath(), true, null, null, 2, null, null, null, null, z13);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy(@Nullable Activity activity) {
        log("onHostDestroy(activity)");
        if (getCurrentActivity() == activity) {
            maybeEnableDevSupport(false);
            moveToHostDestroy(getCurrentReactContext());
        }
    }

    @Nullable
    public NativeModule getNativeModule(String str) {
        ReactInstance reactInstance = this.mReactInstance;
        if (reactInstance != null) {
            return reactInstance.getNativeModule(str);
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause() {
        log("onHostPause()");
        ReactContext currentReactContext = getCurrentReactContext();
        maybeEnableDevSupport(false);
        this.mDefaultHardwareBackBtnHandler = null;
        this.mReactLifecycleStateManager.moveToOnHostPause(currentReactContext, getCurrentActivity());
    }
}
