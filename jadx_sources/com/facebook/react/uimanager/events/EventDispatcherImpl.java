package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.p505ws.WebSocketProtocol;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
public class EventDispatcherImpl implements EventDispatcher, LifecycleEventListener {
    private static final Comparator<Event> EVENT_COMPARATOR = new Comparator<Event>() { // from class: com.facebook.react.uimanager.events.EventDispatcherImpl.1
        @Override // java.util.Comparator
        public int compare(Event event, Event event2) {
            if (event == null && event2 == null) {
                return 0;
            }
            if (event == null) {
                return -1;
            }
            if (event2 == null) {
                return 1;
            }
            long timestampMs = event.getTimestampMs() - event2.getTimestampMs();
            if (timestampMs == 0) {
                return 0;
            }
            return timestampMs < 0 ? -1 : 1;
        }
    };
    private final ScheduleDispatchFrameCallback mCurrentFrameCallback;
    private final DispatchEventsRunnable mDispatchEventsRunnable;
    private final ReactApplicationContext mReactContext;
    private volatile ReactEventEmitter mReactEventEmitter;
    private final Object mEventsStagingLock = new Object();
    private final Object mEventsToDispatchLock = new Object();
    private final LongSparseArray<Integer> mEventCookieToLastEventIdx = new LongSparseArray<>();
    private final Map<String, Short> mEventNameToEventId = MapBuilder.newHashMap();
    private final ArrayList<Event> mEventStaging = new ArrayList<>();
    private final CopyOnWriteArrayList<EventDispatcherListener> mListeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<BatchEventDispatchedListener> mPostEventDispatchListeners = new CopyOnWriteArrayList<>();
    private final AtomicInteger mHasDispatchScheduledCount = new AtomicInteger();
    private Event[] mEventsToDispatch = new Event[16];
    private int mEventsToDispatchSize = 0;
    private short mNextEventTypeId = 0;
    private volatile boolean mHasDispatchScheduled = false;

    public class DispatchEventsRunnable implements Runnable {
        private DispatchEventsRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Systrace.m10662c(0L, "DispatchEventsRunnable");
            try {
                Systrace.m10664f(0L, "ScheduleDispatchFrameCallback", EventDispatcherImpl.this.mHasDispatchScheduledCount.getAndIncrement());
                EventDispatcherImpl.this.mHasDispatchScheduled = false;
                C38115a.m86047c(EventDispatcherImpl.this.mReactEventEmitter);
                synchronized (EventDispatcherImpl.this.mEventsToDispatchLock) {
                    try {
                        if (EventDispatcherImpl.this.mEventsToDispatchSize > 0) {
                            if (EventDispatcherImpl.this.mEventsToDispatchSize > 1) {
                                Arrays.sort(EventDispatcherImpl.this.mEventsToDispatch, 0, EventDispatcherImpl.this.mEventsToDispatchSize, EventDispatcherImpl.EVENT_COMPARATOR);
                            }
                            for (int i11 = 0; i11 < EventDispatcherImpl.this.mEventsToDispatchSize; i11++) {
                                Event event = EventDispatcherImpl.this.mEventsToDispatch[i11];
                                if (event != null) {
                                    Systrace.m10664f(0L, event.getEventName(), event.getUniqueID());
                                    event.dispatchModern(EventDispatcherImpl.this.mReactEventEmitter);
                                    event.dispose();
                                }
                            }
                            EventDispatcherImpl.this.clearEventsToDispatch();
                            EventDispatcherImpl.this.mEventCookieToLastEventIdx.clear();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator it = EventDispatcherImpl.this.mPostEventDispatchListeners.iterator();
                while (it.hasNext()) {
                    ((BatchEventDispatchedListener) it.next()).onBatchEventDispatched();
                }
                Systrace.m10667i(0L);
            } catch (Throwable th3) {
                Systrace.m10667i(0L);
                throw th3;
            }
        }
    }

    public class ScheduleDispatchFrameCallback implements Choreographer.FrameCallback {
        private volatile boolean mIsPosted;
        private boolean mShouldStop;

        public void stop() {
            this.mShouldStop = true;
        }

        private ScheduleDispatchFrameCallback() {
            this.mIsPosted = false;
            this.mShouldStop = false;
        }

        public void maybePost() {
            if (this.mIsPosted) {
                return;
            }
            this.mIsPosted = true;
            post();
        }

        public void maybePostFromNonUI() {
            if (this.mIsPosted) {
                return;
            }
            if (EventDispatcherImpl.this.mReactContext.isOnUiQueueThread()) {
                maybePost();
            } else {
                EventDispatcherImpl.this.mReactContext.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.events.EventDispatcherImpl.ScheduleDispatchFrameCallback.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ScheduleDispatchFrameCallback.this.maybePost();
                    }
                });
            }
        }

        private void post() {
            if (!ReactNativeFeatureFlags.enableFabricRendererExclusively()) {
                ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, EventDispatcherImpl.this.mCurrentFrameCallback);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            UiThreadUtil.assertOnUiThread();
            if (this.mShouldStop) {
                this.mIsPosted = false;
            } else {
                post();
            }
            Systrace.m10662c(0L, "ScheduleDispatchFrameCallback");
            try {
                EventDispatcherImpl.this.moveStagedEventsToDispatchQueue();
                if (!EventDispatcherImpl.this.mHasDispatchScheduled) {
                    EventDispatcherImpl.this.mHasDispatchScheduled = true;
                    Systrace.m10670l(0L, "ScheduleDispatchFrameCallback", EventDispatcherImpl.this.mHasDispatchScheduledCount.get());
                    EventDispatcherImpl.this.mReactContext.runOnJSQueueThread(EventDispatcherImpl.this.mDispatchEventsRunnable);
                }
            } finally {
                Systrace.m10667i(0L);
            }
        }
    }

    private static long getEventCookie(int i11, short s11, short s12) {
        return ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((long) i11) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void registerEventEmitter(int i11, RCTEventEmitter rCTEventEmitter) {
        this.mReactEventEmitter.register(i11, rCTEventEmitter);
    }

    private void addEventToEventsToDispatch(Event event) {
        int i11 = this.mEventsToDispatchSize;
        Event[] eventArr = this.mEventsToDispatch;
        if (i11 == eventArr.length) {
            this.mEventsToDispatch = (Event[]) Arrays.copyOf(eventArr, eventArr.length * 2);
        }
        Event[] eventArr2 = this.mEventsToDispatch;
        int i12 = this.mEventsToDispatchSize;
        this.mEventsToDispatchSize = i12 + 1;
        eventArr2[i12] = event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventsToDispatch() {
        Arrays.fill(this.mEventsToDispatch, 0, this.mEventsToDispatchSize, (Object) null);
        this.mEventsToDispatchSize = 0;
    }

    private long getEventCookie(int i11, String str, short s11) {
        short sShortValue;
        Short sh2 = this.mEventNameToEventId.get(str);
        if (sh2 != null) {
            sShortValue = sh2.shortValue();
        } else {
            short s12 = this.mNextEventTypeId;
            this.mNextEventTypeId = (short) (s12 + 1);
            this.mEventNameToEventId.put(str, Short.valueOf(s12));
            sShortValue = s12;
        }
        return getEventCookie(i11, sShortValue, s11);
    }

    private void maybePostFrameCallbackFromNonUI() {
        if (this.mReactEventEmitter != null) {
            this.mCurrentFrameCallback.maybePostFromNonUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveStagedEventsToDispatchQueue() {
        synchronized (this.mEventsStagingLock) {
            synchronized (this.mEventsToDispatchLock) {
                for (int i11 = 0; i11 < this.mEventStaging.size(); i11++) {
                    try {
                        Event event = this.mEventStaging.get(i11);
                        if (event.canCoalesce()) {
                            long eventCookie = getEventCookie(event.getViewTag(), event.getEventName(), event.getCoalescingKey());
                            Integer num = this.mEventCookieToLastEventIdx.get(eventCookie);
                            Event event2 = null;
                            if (num == null) {
                                this.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.mEventsToDispatchSize));
                            } else {
                                Event event3 = this.mEventsToDispatch[num.intValue()];
                                Event eventCoalesce = event.coalesce(event3);
                                if (eventCoalesce != event3) {
                                    this.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.mEventsToDispatchSize));
                                    this.mEventsToDispatch[num.intValue()] = null;
                                    event2 = event3;
                                    event = eventCoalesce;
                                } else {
                                    event2 = event;
                                    event = null;
                                }
                            }
                            if (event != null) {
                                addEventToEventsToDispatch(event);
                            }
                            if (event2 != null) {
                                event2.dispose();
                            }
                        } else {
                            addEventToEventsToDispatch(event);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.mEventStaging.clear();
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
    public void onCatalystInstanceDestroyed() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.events.EventDispatcherImpl.2
            @Override // java.lang.Runnable
            public void run() {
                EventDispatcherImpl.this.stopFrameCallback();
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

    public EventDispatcherImpl(ReactApplicationContext reactApplicationContext) {
        this.mDispatchEventsRunnable = new DispatchEventsRunnable();
        this.mCurrentFrameCallback = new ScheduleDispatchFrameCallback();
        this.mReactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mReactEventEmitter = new ReactEventEmitter(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopFrameCallback() {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentFrameCallback.stop();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchAllEvents() {
        maybePostFrameCallbackFromNonUI();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchEvent(Event event) {
        C38115a.m86046b(event.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator<EventDispatcherListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onEventDispatch(event);
        }
        synchronized (this.mEventsStagingLock) {
            this.mEventStaging.add(event);
            Systrace.m10670l(0L, event.getEventName(), event.getUniqueID());
        }
        maybePostFrameCallbackFromNonUI();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        stopFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        stopFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        maybePostFrameCallbackFromNonUI();
    }
}
