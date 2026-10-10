package com.facebook.react.uimanager.events;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.systrace.Systrace;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes45.dex */
public class FabricEventDispatcher implements EventDispatcher, LifecycleEventListener {
    private static final Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
    private final ReactApplicationContext mReactContext;
    private final ReactEventEmitter mReactEventEmitter;
    private final CopyOnWriteArrayList<EventDispatcherListener> mListeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<BatchEventDispatchedListener> mPostEventDispatchListeners = new CopyOnWriteArrayList<>();
    private final ScheduleDispatchFrameCallback mCurrentFrameCallback = new ScheduleDispatchFrameCallback();
    private boolean mIsDispatchScheduled = false;
    private final Runnable mDispatchEventsRunnable = new Runnable() { // from class: com.facebook.react.uimanager.events.FabricEventDispatcher.1
        @Override // java.lang.Runnable
        public void run() {
            FabricEventDispatcher.this.mIsDispatchScheduled = false;
            Systrace.m10662c(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = FabricEventDispatcher.this.mPostEventDispatchListeners.iterator();
                while (it.hasNext()) {
                    ((BatchEventDispatchedListener) it.next()).onBatchEventDispatched();
                }
                Systrace.m10667i(0L);
            } catch (Throwable th2) {
                Systrace.m10667i(0L);
                throw th2;
            }
        }
    };

    public class ScheduleDispatchFrameCallback implements Choreographer.FrameCallback {
        private volatile boolean mIsDispatchScheduled;
        private boolean mShouldStop;

        public void resume() {
            this.mShouldStop = false;
        }

        public void stop() {
            this.mShouldStop = true;
        }

        private ScheduleDispatchFrameCallback() {
            this.mIsDispatchScheduled = false;
            this.mShouldStop = false;
        }

        public void maybeDispatchBatchedEvents() {
            if (this.mIsDispatchScheduled) {
                return;
            }
            this.mIsDispatchScheduled = true;
            dispatchBatchedEvents();
        }

        public void maybeScheduleDispatchOfBatchedEvents() {
            if (this.mIsDispatchScheduled) {
                return;
            }
            if (FabricEventDispatcher.this.mReactContext.isOnUiQueueThread()) {
                maybeDispatchBatchedEvents();
            } else {
                FabricEventDispatcher.this.mReactContext.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.events.FabricEventDispatcher.ScheduleDispatchFrameCallback.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ScheduleDispatchFrameCallback.this.maybeDispatchBatchedEvents();
                    }
                });
            }
        }

        private void dispatchBatchedEvents() {
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, FabricEventDispatcher.this.mCurrentFrameCallback);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            UiThreadUtil.assertOnUiThread();
            if (this.mShouldStop) {
                this.mIsDispatchScheduled = false;
            } else {
                dispatchBatchedEvents();
            }
            Systrace.m10662c(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = FabricEventDispatcher.this.mPostEventDispatchListeners.iterator();
                while (it.hasNext()) {
                    ((BatchEventDispatchedListener) it.next()).onBatchEventDispatched();
                }
                Systrace.m10667i(0L);
            } catch (Throwable th2) {
                Systrace.m10667i(0L);
                throw th2;
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void registerEventEmitter(int i11, RCTEventEmitter rCTEventEmitter) {
        this.mReactEventEmitter.register(i11, rCTEventEmitter);
    }

    private void dispatchSynchronous(Event event) {
        Systrace.m10662c(0L, "FabricEventDispatcher.dispatchSynchronous('" + event.getEventName() + "')");
        try {
            UIManager uIManager = UIManagerHelper.getUIManager(this.mReactContext, 2);
            if (uIManager instanceof SynchronousEventReceiver) {
                ((SynchronousEventReceiver) uIManager).receiveEvent(event.getSurfaceId(), event.getViewTag(), event.getEventName(), event.canCoalesce(), event.getExtraData(), event.getEventCategory(), true);
            } else {
                ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new ReactNoCrashSoftException("Fabric UIManager expected to implement SynchronousEventReceiver."));
            }
        } finally {
            Systrace.m10667i(0L);
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addBatchEventDispatchedListener(BatchEventDispatchedListener batchEventDispatchedListener) {
        this.mPostEventDispatchListeners.add(batchEventDispatchedListener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addListener(EventDispatcherListener eventDispatcherListener) {
        this.mListeners.add(eventDispatcherListener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchEvent(Event event) {
        Iterator<EventDispatcherListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onEventDispatch(event);
        }
        if (event.experimental_isSynchronous()) {
            dispatchSynchronous(event);
        } else {
            event.dispatchModern(this.mReactEventEmitter);
        }
        event.dispose();
        scheduleDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void onCatalystInstanceDestroyed() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.events.FabricEventDispatcher.2
            @Override // java.lang.Runnable
            public void run() {
                FabricEventDispatcher.this.cancelDispatchOfBatchedEvents();
            }
        });
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void registerEventEmitter(int i11, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mReactEventEmitter.register(i11, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeBatchEventDispatchedListener(BatchEventDispatchedListener batchEventDispatchedListener) {
        this.mPostEventDispatchListeners.remove(batchEventDispatchedListener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeListener(EventDispatcherListener eventDispatcherListener) {
        this.mListeners.remove(eventDispatcherListener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void unregisterEventEmitter(int i11) {
        this.mReactEventEmitter.unregister(i11);
    }

    public FabricEventDispatcher(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mReactEventEmitter = new ReactEventEmitter(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelDispatchOfBatchedEvents() {
        UiThreadUtil.assertOnUiThread();
        if (ReactNativeFeatureFlags.useOptimizedEventBatchingOnAndroid()) {
            this.mIsDispatchScheduled = false;
            uiThreadHandler.removeCallbacks(this.mDispatchEventsRunnable);
        } else {
            this.mCurrentFrameCallback.stop();
        }
    }

    private void scheduleDispatchOfBatchedEvents() {
        if (ReactNativeFeatureFlags.useOptimizedEventBatchingOnAndroid()) {
            if (!this.mIsDispatchScheduled) {
                this.mIsDispatchScheduled = true;
                uiThreadHandler.postAtFrontOfQueue(this.mDispatchEventsRunnable);
                return;
            }
            return;
        }
        this.mCurrentFrameCallback.maybeScheduleDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchAllEvents() {
        scheduleDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        cancelDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        cancelDispatchOfBatchedEvents();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        scheduleDispatchOfBatchedEvents();
        if (!ReactNativeFeatureFlags.useOptimizedEventBatchingOnAndroid()) {
            this.mCurrentFrameCallback.resume();
        }
    }
}
