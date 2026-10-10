package com.sensorsdata.analytics.android.sdk;

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
class EventTimer {
    private long startTime;
    private final TimeUnit timeUnit;
    private boolean isPaused = false;
    private long eventAccumulatedDuration = 0;
    private long endTime = -1;

    /* JADX WARN: Code duplicated, block: B:16:0x0032 A[Catch: Exception -> 0x0059, TryCatch #0 {Exception -> 0x0059, blocks: (B:14:0x002c, B:16:0x0032, B:29:0x0054, B:33:0x005b, B:17:0x0034, B:19:0x003a, B:20:0x003d, B:22:0x0043, B:23:0x0045, B:24:0x0047, B:26:0x004b, B:35:0x006c), top: B:39:0x0022 }] */
    public String duration() {
        float f11;
        float f12;
        if (this.isPaused) {
            this.endTime = this.startTime;
        } else {
            long jElapsedRealtime = this.endTime;
            if (jElapsedRealtime < 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            this.endTime = jElapsedRealtime;
        }
        long j11 = (this.endTime - this.startTime) + this.eventAccumulatedDuration;
        try {
            if (j11 < 0 || j11 > 86400000) {
                return String.valueOf(0);
            }
            TimeUnit timeUnit = this.timeUnit;
            if (timeUnit == TimeUnit.MILLISECONDS) {
                f12 = j11;
            } else if (timeUnit == TimeUnit.SECONDS) {
                f12 = j11 / 1000.0f;
            } else {
                if (timeUnit == TimeUnit.MINUTES) {
                    f11 = j11 / 1000.0f;
                } else if (timeUnit == TimeUnit.HOURS) {
                    f11 = (j11 / 1000.0f) / 60.0f;
                } else {
                    f12 = j11;
                }
                f12 = f11 / 60.0f;
            }
            return f12 < 0.0f ? String.valueOf(0) : String.format(Locale.CHINA, "%.3f", Float.valueOf(f12));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return String.valueOf(0);
        }
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getEventAccumulatedDuration() {
        return this.eventAccumulatedDuration;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public void setEndTime(long j11) {
        this.endTime = j11;
    }

    public void setEventAccumulatedDuration(long j11) {
        this.eventAccumulatedDuration = j11;
    }

    public void setStartTime(long j11) {
        this.startTime = j11;
    }

    public void setTimerState(boolean z11, long j11) {
        this.isPaused = z11;
        if (z11) {
            this.eventAccumulatedDuration = (this.eventAccumulatedDuration + j11) - this.startTime;
        }
        this.startTime = j11;
    }

    public EventTimer(TimeUnit timeUnit, long j11) {
        this.startTime = j11;
        this.timeUnit = timeUnit;
    }
}
