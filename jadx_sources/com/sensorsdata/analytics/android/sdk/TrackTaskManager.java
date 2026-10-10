package com.sensorsdata.analytics.android.sdk;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes23.dex */
public class TrackTaskManager {
    private static TrackTaskManager trackTaskManager;
    private boolean mDataCollectEnable = true;
    private final LinkedBlockingQueue<Runnable> mTrackEventTasks = new LinkedBlockingQueue<>();
    private final LinkedBlockingQueue<Runnable> mTrackEventTasksCache = new LinkedBlockingQueue<>();

    public static synchronized TrackTaskManager getInstance() {
        try {
            if (trackTaskManager == null) {
                trackTaskManager = new TrackTaskManager();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return trackTaskManager;
    }

    public void addTrackEventTask(Runnable runnable) {
        try {
            if (this.mDataCollectEnable) {
                this.mTrackEventTasks.put(runnable);
            } else {
                this.mTrackEventTasksCache.put(runnable);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public boolean isEmpty() {
        return this.mTrackEventTasks.isEmpty();
    }

    public Runnable pollTrackEventTask() {
        try {
            return this.mDataCollectEnable ? this.mTrackEventTasks.poll() : this.mTrackEventTasksCache.poll();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    public void setDataCollectEnable(boolean z11) {
        this.mDataCollectEnable = z11;
        try {
            if (z11) {
                this.mTrackEventTasksCache.put(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.TrackTaskManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            } else {
                this.mTrackEventTasks.put(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.TrackTaskManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                    }
                });
            }
        } catch (InterruptedException e11) {
            SALog.printStackTrace(e11);
        }
    }

    public Runnable takeTrackEventTask() {
        try {
            return this.mDataCollectEnable ? this.mTrackEventTasks.take() : this.mTrackEventTasksCache.take();
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    public void transformTaskQueue(Runnable runnable) {
        try {
            if (this.mTrackEventTasks.size() < 50) {
                this.mTrackEventTasks.put(runnable);
            }
        } catch (InterruptedException e11) {
            SALog.printStackTrace(e11);
        }
    }

    private TrackTaskManager() {
    }
}
