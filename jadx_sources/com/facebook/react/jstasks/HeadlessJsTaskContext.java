package com.facebook.react.jstasks;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.tencent.bugly.proguard.C33978va;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
public class HeadlessJsTaskContext {
    private static final WeakHashMap<ReactContext, HeadlessJsTaskContext> INSTANCES = new WeakHashMap<>();
    private final WeakReference<ReactContext> mReactContext;
    private final Set<HeadlessJsTaskEventListener> mHeadlessJsTaskEventListeners = new CopyOnWriteArraySet();
    private final AtomicInteger mLastTaskId = new AtomicInteger(0);
    private final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();
    private final Map<Integer, HeadlessJsTaskConfig> mActiveTaskConfigs = new ConcurrentHashMap();
    private final SparseArray<Runnable> mTaskTimeouts = new SparseArray<>();

    public synchronized void addTaskEventListener(HeadlessJsTaskEventListener headlessJsTaskEventListener) {
        this.mHeadlessJsTaskEventListeners.add(headlessJsTaskEventListener);
        Iterator<Integer> it = this.mActiveTasks.iterator();
        while (it.hasNext()) {
            headlessJsTaskEventListener.onHeadlessJsTaskStart(it.next().intValue());
        }
    }

    /* JADX INFO: renamed from: finishTask, reason: merged with bridge method [inline-methods] */
    public synchronized void lambda$scheduleTaskTimeout$0(final int i11) {
        boolean zRemove = this.mActiveTasks.remove(Integer.valueOf(i11));
        this.mActiveTaskConfigs.remove(Integer.valueOf(i11));
        removeTimeout(i11);
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.jstasks.HeadlessJsTaskContext.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = HeadlessJsTaskContext.this.mHeadlessJsTaskEventListeners.iterator();
                    while (it.hasNext()) {
                        ((HeadlessJsTaskEventListener) it.next()).onHeadlessJsTaskFinish(i11);
                    }
                }
            });
        }
    }

    public synchronized boolean isTaskRunning(int i11) {
        return this.mActiveTasks.contains(Integer.valueOf(i11));
    }

    public synchronized boolean retryTask(final int i11) {
        HeadlessJsTaskConfig headlessJsTaskConfig = this.mActiveTaskConfigs.get(Integer.valueOf(i11));
        C38115a.m86046b(headlessJsTaskConfig != null, "Tried to retrieve non-existent task config with id " + i11 + C33978va.f72339h);
        HeadlessJsTaskRetryPolicy retryPolicy = headlessJsTaskConfig.getRetryPolicy();
        if (!retryPolicy.canRetry()) {
            return false;
        }
        removeTimeout(i11);
        final HeadlessJsTaskConfig headlessJsTaskConfig2 = new HeadlessJsTaskConfig(headlessJsTaskConfig.getTaskKey(), headlessJsTaskConfig.getData(), headlessJsTaskConfig.getTimeout(), headlessJsTaskConfig.isAllowedInForeground(), retryPolicy.update());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.jstasks.HeadlessJsTaskContext.1
            @Override // java.lang.Runnable
            public void run() {
                HeadlessJsTaskContext.this.startTask(headlessJsTaskConfig2, i11);
            }
        }, retryPolicy.getDelayBetweenAttemptsInMs());
        return true;
    }

    public synchronized int startTask(HeadlessJsTaskConfig headlessJsTaskConfig) {
        int iIncrementAndGet;
        iIncrementAndGet = this.mLastTaskId.incrementAndGet();
        startTask(headlessJsTaskConfig, iIncrementAndGet);
        return iIncrementAndGet;
    }

    public static HeadlessJsTaskContext getInstance(ReactContext reactContext) {
        WeakHashMap<ReactContext, HeadlessJsTaskContext> weakHashMap = INSTANCES;
        HeadlessJsTaskContext headlessJsTaskContext = weakHashMap.get(reactContext);
        if (headlessJsTaskContext != null) {
            return headlessJsTaskContext;
        }
        HeadlessJsTaskContext headlessJsTaskContext2 = new HeadlessJsTaskContext(reactContext);
        weakHashMap.put(reactContext, headlessJsTaskContext2);
        return headlessJsTaskContext2;
    }

    private void removeTimeout(int i11) {
        Runnable runnable = this.mTaskTimeouts.get(i11);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.mTaskTimeouts.remove(i11);
        }
    }

    private void scheduleTaskTimeout(final int i11, long j11) {
        Runnable runnable = new Runnable() { // from class: com.facebook.react.jstasks.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f9784b.lambda$scheduleTaskTimeout$0(i11);
            }
        };
        this.mTaskTimeouts.append(i11, runnable);
        UiThreadUtil.runOnUiThread(runnable, j11);
    }

    public boolean hasActiveTasks() {
        return this.mActiveTasks.size() > 0;
    }

    public void removeTaskEventListener(HeadlessJsTaskEventListener headlessJsTaskEventListener) {
        this.mHeadlessJsTaskEventListeners.remove(headlessJsTaskEventListener);
    }

    private HeadlessJsTaskContext(ReactContext reactContext) {
        this.mReactContext = new WeakReference<>(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void startTask(HeadlessJsTaskConfig headlessJsTaskConfig, int i11) {
        try {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContext = (ReactContext) C38115a.m86048d(this.mReactContext.get(), "Tried to start a task on a react context that has already been destroyed");
            if (reactContext.getLifecycleState() == LifecycleState.RESUMED && !headlessJsTaskConfig.isAllowedInForeground()) {
                throw new IllegalStateException("Tried to start task " + headlessJsTaskConfig.getTaskKey() + " while in foreground, but this is not allowed.");
            }
            this.mActiveTasks.add(Integer.valueOf(i11));
            this.mActiveTaskConfigs.put(Integer.valueOf(i11), new HeadlessJsTaskConfig(headlessJsTaskConfig));
            if (reactContext.hasActiveReactInstance()) {
                ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i11, headlessJsTaskConfig.getTaskKey(), headlessJsTaskConfig.getData());
            } else {
                ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
            }
            if (headlessJsTaskConfig.getTimeout() > 0) {
                scheduleTaskTimeout(i11, headlessJsTaskConfig.getTimeout());
            }
            Iterator<HeadlessJsTaskEventListener> it = this.mHeadlessJsTaskEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onHeadlessJsTaskStart(i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
